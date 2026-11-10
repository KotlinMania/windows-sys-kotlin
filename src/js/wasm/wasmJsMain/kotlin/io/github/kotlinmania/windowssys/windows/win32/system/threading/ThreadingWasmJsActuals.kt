@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Papcfunc
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessMask

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemThreadingNapiAddon(): Boolean

private val _windowsWin32SystemThreadingNapiAvailable: Boolean = _initWindowsWin32SystemThreadingNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_acquireSRWLockExclusive(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_acquireSRWLockExclusive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_acquireSRWLockShared(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_acquireSRWLockShared(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_attachThreadInput(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_attachThreadInput(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avQuerySystemResponsiveness(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_avQuerySystemResponsiveness(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_avSetMmThreadPriority(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_avSetMmThreadPriority(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_callbackMayRunLong(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_callbackMayRunLong(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_cancelThreadpoolIo(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_cancelThreadpoolIo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_cancelTimerQueueTimer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_cancelTimerQueueTimer(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_cancelWaitableTimer(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_cancelWaitableTimer(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_changeTimerQueueTimer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_changeTimerQueueTimer(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closePrivateNamespace(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_closePrivateNamespace(p0: String, p1: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpool(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpool(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpoolIo(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpoolIo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpoolTimer(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpoolTimer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpoolWait(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpoolWait(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_closeThreadpoolWork(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_closeThreadpoolWork(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_convertFiberToThread()")
private external fun _wasm_windowssys_windows_win32_system_threading_convertFiberToThread(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_convertThreadToFiber(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_convertThreadToFiber(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_convertThreadToFiberEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_convertThreadToFiberEx(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createBoundaryDescriptorA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_createBoundaryDescriptorA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createBoundaryDescriptorW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_createBoundaryDescriptorW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createEventA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createEventA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createEventExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createEventExA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createEventExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createEventExW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createEventW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createEventW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createFiber(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createFiber(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createFiberEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_createFiberEx(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createMutexA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createMutexA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createMutexExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createMutexExA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createMutexExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createMutexExW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createMutexW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createMutexW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createPrivateNamespaceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createPrivateNamespaceA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createPrivateNamespaceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createPrivateNamespaceW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createProcessA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_threading_createProcessA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createProcessAsUserA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_threading_createProcessAsUserA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createProcessAsUserW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_threading_createProcessAsUserW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createProcessW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_threading_createProcessW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createProcessWithLogonW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_threading_createProcessWithLogonW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createProcessWithTokenW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_threading_createProcessWithTokenW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createRemoteThread(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_threading_createRemoteThread(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createRemoteThreadEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_threading_createRemoteThreadEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createSemaphoreA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createSemaphoreA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createSemaphoreExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_createSemaphoreExA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createSemaphoreExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_createSemaphoreExW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createSemaphoreW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createSemaphoreW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThread(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_createThread(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThreadpool(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_createThreadpool(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup()")
private external fun _wasm_windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThreadpoolIo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createThreadpoolIo(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThreadpoolTimer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createThreadpoolTimer(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThreadpoolWait(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createThreadpoolWait(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createThreadpoolWork(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createThreadpoolWork(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createTimerQueue()")
private external fun _wasm_windowssys_windows_win32_system_threading_createTimerQueue(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createTimerQueueTimer(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_threading_createTimerQueueTimer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createUmsCompletionList(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_createUmsCompletionList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createUmsThreadContext(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_createUmsThreadContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createWaitableTimerA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createWaitableTimerA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createWaitableTimerExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createWaitableTimerExA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createWaitableTimerExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_createWaitableTimerExW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_createWaitableTimerW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_createWaitableTimerW(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteBoundaryDescriptor(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteBoundaryDescriptor(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteCriticalSection(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteCriticalSection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteFiber(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteFiber(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteProcThreadAttributeList(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteProcThreadAttributeList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteSynchronizationBarrier(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteSynchronizationBarrier(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteTimerQueue(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteTimerQueue(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteTimerQueueEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteTimerQueueEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteTimerQueueTimer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteTimerQueueTimer(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteUmsCompletionList(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteUmsCompletionList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_deleteUmsThreadContext(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_deleteUmsThreadContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_enterCriticalSection(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_enterCriticalSection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_enterSynchronizationBarrier(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_enterSynchronizationBarrier(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_enterUmsSchedulingMode(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_enterUmsSchedulingMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_executeUmsThread(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_executeUmsThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_exitProcess(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_exitProcess(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_exitThread(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_exitThread(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_flsAlloc(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_flsAlloc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_flsFree(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_flsFree(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_flsGetValue(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_flsGetValue(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_flsSetValue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_flsSetValue(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_flushProcessWriteBuffers()")
private external fun _wasm_windowssys_windows_win32_system_threading_flushProcessWriteBuffers()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getActiveProcessorCount(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getActiveProcessorCount(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getActiveProcessorGroupCount()")
private external fun _wasm_windowssys_windows_win32_system_threading_getActiveProcessorGroupCount(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentProcess()")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentProcess(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentProcessId()")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentProcessId(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentProcessorNumber()")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentProcessorNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentThread()")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentThread(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentThreadId()")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentThreadId(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentThreadStackLimits(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentThreadStackLimits(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getCurrentUmsThread()")
private external fun _wasm_windowssys_windows_win32_system_threading_getCurrentUmsThread(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getExitCodeProcess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getExitCodeProcess(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getExitCodeThread(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getExitCodeThread(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getGuiResources(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getGuiResources(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getMachineTypeAttributes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getMachineTypeAttributes(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getMaximumProcessorCount(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getMaximumProcessorCount(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount()")
private external fun _wasm_windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNextUmsListItem(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNextUmsListItem(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaHighestNodeNumber(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaHighestNodeNumber(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaNodeProcessorMask(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaNodeProcessorMask(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaProcessorNode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaProcessorNode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaProcessorNodeEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaProcessorNodeEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaProximityNode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaProximityNode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getNumaProximityNodeEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getNumaProximityNodeEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getPriorityClass(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getPriorityClass(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessAffinityMask(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessAffinityMask(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessDEPPolicy(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessDEPPolicy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessDefaultCpuSets(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessDefaultCpuSets(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessGroupAffinity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessGroupAffinity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessHandleCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessHandleCount(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessHandleFromHwnd(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessHandleFromHwnd(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessId(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessIdOfThread(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessIdOfThread(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessIoCounters(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessIoCounters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessMitigationPolicy(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessMitigationPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessPriorityBoost(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessPriorityBoost(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessShutdownParameters(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessShutdownParameters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessTimes(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessTimes(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessVersion(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessVersion(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getProcessWorkingSetSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_getProcessWorkingSetSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getStartupInfoA(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getStartupInfoA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getStartupInfoW(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getStartupInfoW(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getSystemTimes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_getSystemTimes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadDescription(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadDescription(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadGroupAffinity(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadGroupAffinity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadIOPendingFlag(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadIOPendingFlag(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadId(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadIdealProcessorEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadIdealProcessorEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadPriority(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadPriority(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadPriorityBoost(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadPriorityBoost(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadSelectedCpuSets(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadSelectedCpuSets(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getThreadTimes(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_getThreadTimes(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getUmsCompletionListEvent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getUmsCompletionListEvent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_getUmsSystemThreadInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_getUmsSystemThreadInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initOnceBeginInitialize(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_initOnceBeginInitialize(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initOnceComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_initOnceComplete(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initOnceExecuteOnce(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_initOnceExecuteOnce(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initOnceInitialize(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_initOnceInitialize(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeConditionVariable(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeConditionVariable(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeCriticalSection(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeCriticalSection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeCriticalSectionEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeCriticalSectionEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeProcThreadAttributeList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeProcThreadAttributeList(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeSListHead(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeSListHead(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeSRWLock(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeSRWLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_initializeSynchronizationBarrier(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_initializeSynchronizationBarrier(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_interlockedFlushSList(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_interlockedFlushSList(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_interlockedPopEntrySList(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_interlockedPopEntrySList(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_interlockedPushEntrySList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_interlockedPushEntrySList(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_interlockedPushListSListEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_interlockedPushListSListEx(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isImmersiveProcess(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_isImmersiveProcess(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isProcessCritical(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_isProcessCritical(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isProcessorFeaturePresent(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_isProcessorFeaturePresent(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isThreadAFiber()")
private external fun _wasm_windowssys_windows_win32_system_threading_isThreadAFiber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isThreadpoolTimerSet(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_isThreadpoolTimerSet(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isWow64Process(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_isWow64Process(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_isWow64Process2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_isWow64Process2(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_leaveCriticalSection(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_leaveCriticalSection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openEventA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openEventA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openEventW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openEventW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openMutexW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openMutexW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openPrivateNamespaceA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_openPrivateNamespaceA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openPrivateNamespaceW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_openPrivateNamespaceW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openProcess(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openProcess(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openProcessToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openProcessToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openSemaphoreW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openSemaphoreW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openThread(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openThreadToken(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_openThreadToken(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openWaitableTimerA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openWaitableTimerA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_openWaitableTimerW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_openWaitableTimerW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_pulseEvent(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_pulseEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryDepthSList(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryDepthSList(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryFullProcessImageNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryFullProcessImageNameA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryFullProcessImageNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryFullProcessImageNameW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryProtectedPolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryProtectedPolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryThreadpoolStackInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryThreadpoolStackInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queryUmsThreadInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_queryUmsThreadInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_queueUserWorkItem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_queueUserWorkItem(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_registerWaitForSingleObject(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_registerWaitForSingleObject(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_releaseMutex(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_releaseMutex(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_releaseSRWLockExclusive(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_releaseSRWLockExclusive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_releaseSRWLockShared(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_releaseSRWLockShared(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_releaseSemaphore(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_releaseSemaphore(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_resetEvent(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_resetEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_resumeThread(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_resumeThread(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqCancelDeadline(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqCancelDeadline(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqCancelWorkItem(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqCancelWorkItem(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqCreateAsyncResult(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqCreateAsyncResult(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqInvokeCallback(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqInvokeCallback(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqJoinWorkQueue(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqJoinWorkQueue(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqLockPlatform()")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqLockPlatform(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqLockWorkQueue(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqLockWorkQueue(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqPutWorkItem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqPutWorkItem(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqScheduleWorkItem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqScheduleWorkItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqSetDeadline(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqSetDeadline(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqSetDeadline2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqSetDeadline2(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqSetLongRunning(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqSetLongRunning(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqShutdown()")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqShutdown(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqStartup()")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqStartup(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqUnlockPlatform()")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqUnlockPlatform(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS()")
private external fun _wasm_windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setCriticalSectionSpinCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setCriticalSectionSpinCount(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setEvent(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_setEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setEventWhenCallbackReturns(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setEventWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setPriorityClass(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setPriorityClass(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessAffinityMask(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessAffinityMask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessDEPPolicy(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessDEPPolicy(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessDefaultCpuSets(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessDefaultCpuSets(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessMitigationPolicy(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessMitigationPolicy(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessPriorityBoost(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessPriorityBoost(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessRestrictionExemption(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessRestrictionExemption(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessShutdownParameters(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessShutdownParameters(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProcessWorkingSetSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProcessWorkingSetSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setProtectedPolicy(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setProtectedPolicy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadAffinityMask(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadAffinityMask(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadDescription(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadDescription(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadGroupAffinity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadGroupAffinity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadIdealProcessor(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadIdealProcessor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadIdealProcessorEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadIdealProcessorEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadPriority(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadPriority(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadPriorityBoost(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadPriorityBoost(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadSelectedCpuSets(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadSelectedCpuSets(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadStackGuarantee(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadStackGuarantee(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadToken(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadToken(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolStackInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolStackInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolTimer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolTimer(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolTimerEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolTimerEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolWait(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolWait(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setThreadpoolWaitEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_setThreadpoolWaitEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setTimerQueueTimer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_setTimerQueueTimer(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setUmsThreadInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_setUmsThreadInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setWaitableTimer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_threading_setWaitableTimer(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_setWaitableTimerEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_threading_setWaitableTimerEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_signalObjectAndWait(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_signalObjectAndWait(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_sleep(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_sleep(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_sleepConditionVariableCS(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_sleepConditionVariableCS(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_sleepConditionVariableSRW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_sleepConditionVariableSRW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_sleepEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_sleepEx(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_startThreadpoolIo(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_startThreadpoolIo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_submitThreadpoolWork(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_submitThreadpoolWork(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_suspendThread(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_suspendThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_switchToFiber(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_switchToFiber(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_switchToThread()")
private external fun _wasm_windowssys_windows_win32_system_threading_switchToThread(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_terminateProcess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_terminateProcess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_terminateThread(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_terminateThread(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tlsAlloc()")
private external fun _wasm_windowssys_windows_win32_system_threading_tlsAlloc(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tlsFree(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_tlsFree(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tlsGetValue(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_tlsGetValue(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tlsSetValue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_tlsSetValue(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tryAcquireSRWLockShared(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_tryAcquireSRWLockShared(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_tryEnterCriticalSection(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_tryEnterCriticalSection(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_umsThreadYield(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_umsThreadYield(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_unregisterWait(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_unregisterWait(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_unregisterWaitEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_unregisterWaitEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_updateProcThreadAttribute(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_threading_updateProcThreadAttribute(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForInputIdle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForInputIdle(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForMultipleObjects(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForMultipleObjectsEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForMultipleObjectsEx(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForSingleObject(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForSingleObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForSingleObjectEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForSingleObjectEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_waitOnAddress(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_threading_waitOnAddress(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_wakeAllConditionVariable(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_wakeAllConditionVariable(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_wakeByAddressAll(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_wakeByAddressAll(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_wakeByAddressSingle(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_wakeByAddressSingle(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_wakeConditionVariable(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_wakeConditionVariable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_winExec(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_threading_winExec(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_threading_wow64SuspendThread(p0)")
private external fun _wasm_windowssys_windows_win32_system_threading_wow64SuspendThread(p0: String): Int

public actual fun acquireSRWLockExclusive(srwlock: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_acquireSRWLockExclusive((srwlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun acquireSRWLockShared(srwlock: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_acquireSRWLockShared((srwlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, integritylabel: Psid): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor((boundarydescriptor?.value ?: 0L).toString(), (integritylabel?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, requiredsid: Psid): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor((boundarydescriptor?.value ?: 0L).toString(), (requiredsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_attachThreadInput(idattach.toInt(), idattachto.toInt(), fattach) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avQuerySystemResponsiveness((avrthandle?.value ?: 0L).toString(), (systemresponsivenessvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics((avrthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroup(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup((context?.value ?: 0L).toString(), (period?.value ?: 0L).toString(), (threadorderingguid?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroupExA(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcstr): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA((context?.value ?: 0L).toString(), (period?.value ?: 0L).toString(), (threadorderingguid?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (taskname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroupExW(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcwstr): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW((context?.value ?: 0L).toString(), (period?.value ?: 0L).toString(), (threadorderingguid?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (taskname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup((context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtJoinThreadOrderingGroup(context: COpaquePointer?, threadorderingguid: COpaquePointer?, before: Bool): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup((context?.value ?: 0L).toString(), (threadorderingguid?.value ?: 0L).toString(), before) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup((context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup((context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA((firsttask?.value ?: 0L).toString(), (secondtask?.value ?: 0L).toString(), (taskindex?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW((firsttask?.value ?: 0L).toString(), (secondtask?.value ?: 0L).toString(), (taskindex?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA((taskname?.value ?: 0L).toString(), (taskindex?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW((taskname?.value ?: 0L).toString(), (taskindex?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_avSetMmThreadPriority((avrthandle?.value ?: 0L).toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_callbackMayRunLong(pci.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelThreadpoolIo(pio: PtpIo) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_cancelThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_cancelTimerQueueTimer((timerqueue?.value ?: 0L).toString(), (timer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_cancelWaitableTimer((htimer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_changeTimerQueueTimer((timerqueue?.value ?: 0L).toString(), (timer?.value ?: 0L).toString(), duetime.toInt(), period.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_closePrivateNamespace((handle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThreadpool(ptpp: PtpPool) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpool(ptpp.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup(ptpcg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers(ptpcg.toString(), fcancelpendingcallbacks, (pvcleanupcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolIo(pio: PtpIo) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolTimer(pti: PtpTimer) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpoolTimer(pti.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolWait(pwa: PtpWait) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpoolWait(pwa.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolWork(pwk: PtpWork) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_closeThreadpoolWork(pwk.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun convertFiberToThread(): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_convertFiberToThread() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertThreadToFiber(lpparameter: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_convertThreadToFiber((lpparameter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertThreadToFiberEx(lpparameter: COpaquePointer?, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_convertThreadToFiberEx((lpparameter?.value ?: 0L).toString(), dwflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createBoundaryDescriptorA((name?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createBoundaryDescriptorW((name?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventA(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createEventA((lpeventattributes?.value ?: 0L).toString(), bmanualreset, binitialstate, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventExA(lpeventattributes: COpaquePointer?, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createEventExA((lpeventattributes?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventExW(lpeventattributes: COpaquePointer?, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createEventExW((lpeventattributes?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventW(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createEventW((lpeventattributes?.value ?: 0L).toString(), bmanualreset, binitialstate, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createFiber(dwstacksize.toString(), 0L.toString(), (lpparameter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createFiberEx(dwstackcommitsize.toString(), dwstackreservesize.toString(), dwflags.toInt(), 0L.toString(), (lpparameter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexA(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createMutexA((lpmutexattributes?.value ?: 0L).toString(), binitialowner, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexExA(lpmutexattributes: COpaquePointer?, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createMutexExA((lpmutexattributes?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexExW(lpmutexattributes: COpaquePointer?, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createMutexExW((lpmutexattributes?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexW(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createMutexW((lpmutexattributes?.value ?: 0L).toString(), binitialowner, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createPrivateNamespaceA((lpprivatenamespaceattributes?.value ?: 0L).toString(), (lpboundarydescriptor?.value ?: 0L).toString(), (lpaliasprefix?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createPrivateNamespaceW((lpprivatenamespaceattributes?.value ?: 0L).toString(), (lpboundarydescriptor?.value ?: 0L).toString(), (lpaliasprefix?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createProcessA((lpapplicationname?.value ?: 0L).toString(), (lpcommandline?.value ?: 0L).toString(), (lpprocessattributes?.value ?: 0L).toString(), (lpthreadattributes?.value ?: 0L).toString(), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L).toString(), (lpcurrentdirectory?.value ?: 0L).toString(), (lpstartupinfo?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createProcessAsUserA((htoken?.value ?: 0L).toString(), (lpapplicationname?.value ?: 0L).toString(), (lpcommandline?.value ?: 0L).toString(), (lpprocessattributes?.value ?: 0L).toString(), (lpthreadattributes?.value ?: 0L).toString(), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L).toString(), (lpcurrentdirectory?.value ?: 0L).toString(), (lpstartupinfo?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createProcessAsUserW((htoken?.value ?: 0L).toString(), (lpapplicationname?.value ?: 0L).toString(), (lpcommandline?.value ?: 0L).toString(), (lpprocessattributes?.value ?: 0L).toString(), (lpthreadattributes?.value ?: 0L).toString(), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L).toString(), (lpcurrentdirectory?.value ?: 0L).toString(), (lpstartupinfo?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createProcessW((lpapplicationname?.value ?: 0L).toString(), (lpcommandline?.value ?: 0L).toString(), (lpprocessattributes?.value ?: 0L).toString(), (lpthreadattributes?.value ?: 0L).toString(), binherithandles, dwcreationflags.toInt(), (lpenvironment?.value ?: 0L).toString(), (lpcurrentdirectory?.value ?: 0L).toString(), (lpstartupinfo?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createProcessWithLogonW((lpusername?.value ?: 0L).toString(), (lpdomain?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), dwlogonflags.toInt(), (lpapplicationname?.value ?: 0L).toString(), (lpcommandline?.value ?: 0L).toString(), dwcreationflags.toInt(), (lpenvironment?.value ?: 0L).toString(), (lpcurrentdirectory?.value ?: 0L).toString(), (lpstartupinfo?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createProcessWithTokenW((htoken?.value ?: 0L).toString(), dwlogonflags.toInt(), (lpapplicationname?.value ?: 0L).toString(), (lpcommandline?.value ?: 0L).toString(), dwcreationflags.toInt(), (lpenvironment?.value ?: 0L).toString(), (lpcurrentdirectory?.value ?: 0L).toString(), (lpstartupinfo?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpthreadid: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createRemoteThread((hprocess?.value ?: 0L).toString(), (lpthreadattributes?.value ?: 0L).toString(), dwstacksize.toString(), 0L.toString(), (lpparameter?.value ?: 0L).toString(), dwcreationflags.toInt(), (lpthreadid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createRemoteThreadEx((hprocess?.value ?: 0L).toString(), (lpthreadattributes?.value ?: 0L).toString(), dwstacksize.toString(), 0L.toString(), (lpparameter?.value ?: 0L).toString(), dwcreationflags.toInt(), (lpattributelist?.value ?: 0L).toString(), (lpthreadid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createSemaphoreA((lpsemaphoreattributes?.value ?: 0L).toString(), linitialcount, lmaximumcount, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreExA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createSemaphoreExA((lpsemaphoreattributes?.value ?: 0L).toString(), linitialcount, lmaximumcount, (lpname?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreExW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createSemaphoreExW((lpsemaphoreattributes?.value ?: 0L).toString(), linitialcount, lmaximumcount, (lpname?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createSemaphoreW((lpsemaphoreattributes?.value ?: 0L).toString(), linitialcount, lmaximumcount, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThread(lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: ThreadCreationFlags, lpthreadid: COpaquePointer?): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThread((lpthreadattributes?.value ?: 0L).toString(), dwstacksize.toString(), 0L.toString(), (lpparameter?.value ?: 0L).toString(), dwcreationflags.toInt(), (lpthreadid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpool(reserved: COpaquePointer?): PtpPool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThreadpool((reserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpIo =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThreadpoolIo((fl?.value ?: 0L).toString(), 0L.toString(), (pv?.value ?: 0L).toString(), (pcbe?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpTimer =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThreadpoolTimer(0L.toString(), (pv?.value ?: 0L).toString(), (pcbe?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWait =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThreadpoolWait(0L.toString(), (pv?.value ?: 0L).toString(), (pcbe?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWork =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createThreadpoolWork(0L.toString(), (pv?.value ?: 0L).toString(), (pcbe?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTimerQueue(): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createTimerQueue().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTimerQueueTimer(phnewtimer: COpaquePointer?, timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createTimerQueueTimer((phnewtimer?.value ?: 0L).toString(), (timerqueue?.value ?: 0L).toString(), 0L.toString(), (parameter?.value ?: 0L).toString(), duetime.toInt(), period.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUmsCompletionList(umscompletionlist: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createUmsCompletionList((umscompletionlist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUmsThreadContext(lpumsthread: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createUmsThreadContext((lpumsthread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerA(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createWaitableTimerA((lptimerattributes?.value ?: 0L).toString(), bmanualreset, (lptimername?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerExA(lptimerattributes: COpaquePointer?, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createWaitableTimerExA((lptimerattributes?.value ?: 0L).toString(), (lptimername?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerExW(lptimerattributes: COpaquePointer?, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createWaitableTimerExW((lptimerattributes?.value ?: 0L).toString(), (lptimername?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerW(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_createWaitableTimerW((lptimerattributes?.value ?: 0L).toString(), bmanualreset, (lptimername?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_deleteBoundaryDescriptor((boundarydescriptor?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteCriticalSection(lpcriticalsection: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_deleteCriticalSection((lpcriticalsection?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteFiber(lpfiber: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_deleteFiber((lpfiber?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_deleteProcThreadAttributeList((lpattributelist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteSynchronizationBarrier(lpbarrier: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_deleteSynchronizationBarrier((lpbarrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_deleteTimerQueue((timerqueue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_deleteTimerQueueEx((timerqueue?.value ?: 0L).toString(), (completionevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_deleteTimerQueueTimer((timerqueue?.value ?: 0L).toString(), (timer?.value ?: 0L).toString(), (completionevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUmsCompletionList(umscompletionlist: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_deleteUmsCompletionList((umscompletionlist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUmsThreadContext(umsthread: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_deleteUmsThreadContext((umsthread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dequeueUmsCompletionListItems(umscompletionlist: COpaquePointer?, waittimeout: UInt, umsthreadlist: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems((umscompletionlist?.value ?: 0L).toString(), waittimeout.toInt(), (umsthreadlist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback(pci.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enterCriticalSection(lpcriticalsection: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_enterCriticalSection((lpcriticalsection?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enterSynchronizationBarrier(lpbarrier: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_enterSynchronizationBarrier((lpbarrier?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_enterUmsSchedulingMode((schedulerstartupinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeUmsThread(umsthread: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_executeUmsThread((umsthread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitProcess(uexitcode: UInt): Nothing {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_exitProcess(uexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exitProcess")
}

public actual fun exitThread(dwexitcode: UInt): Nothing {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_exitThread(dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exitThread")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_flsAlloc(0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsFree(dwflsindex: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_flsFree(dwflsindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsGetValue(dwflsindex: UInt): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_flsGetValue(dwflsindex.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_flsSetValue(dwflsindex.toInt(), (lpflsdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushProcessWriteBuffers() {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_flushProcessWriteBuffers()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns(pci.toString(), (mod?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getActiveProcessorCount(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveProcessorGroupCount(): UShort =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getActiveProcessorGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcess(): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getCurrentProcess().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessId(): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getCurrentProcessId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessorNumber(): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getCurrentProcessorNumber().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessorNumberEx(procnumber: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx((procnumber?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getCurrentThread(): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getCurrentThread().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadId(): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getCurrentThreadId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_getCurrentThreadStackLimits((lowlimit?.value ?: 0L).toString(), (highlimit?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getCurrentUmsThread(): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getCurrentUmsThread().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getExitCodeProcess((hprocess?.value ?: 0L).toString(), (lpexitcode?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getExitCodeThread((hthread?.value ?: 0L).toString(), (lpexitcode?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getGuiResources((hprocess?.value ?: 0L).toString(), uiflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getMachineTypeAttributes(machine.toInt(), (machinetypeattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getMaximumProcessorCount(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaximumProcessorGroupCount(): UShort =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextUmsListItem(umscontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNextUmsListItem((umscontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode(node.toInt(), (availablebytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx(node.toInt(), (availablebytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaHighestNodeNumber(highestnodenumber: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaHighestNodeNumber((highestnodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle((hfile?.value ?: 0L).toString(), (nodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaNodeProcessorMask(node.toInt(), (processormask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: COpaquePointer?, processormaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2(nodenumber.toInt(), (processormasks?.value ?: 0L).toString(), processormaskcount.toInt(), (requiredmaskcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx(node.toInt(), (processormask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaProcessorNode(processor.toInt(), (nodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProcessorNodeEx(processor: COpaquePointer?, nodenumber: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaProcessorNodeEx((processor?.value ?: 0L).toString(), (nodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaProximityNode(proximityid.toInt(), (nodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getNumaProximityNodeEx(proximityid.toInt(), (nodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClass(hprocess: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getPriorityClass((hprocess?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: COpaquePointer?, lpsystemaffinitymask: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessAffinityMask((hprocess?.value ?: 0L).toString(), (lpprocessaffinitymask?.value ?: 0L).toString(), (lpsystemaffinitymask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: COpaquePointer?, lppermanent: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessDEPPolicy((hprocess?.value ?: 0L).toString(), (lpflags?.value ?: 0L).toString(), (lppermanent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks((process?.value ?: 0L).toString(), (cpusetmasks?.value ?: 0L).toString(), cpusetmaskcount.toInt(), (requiredmaskcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessDefaultCpuSets((process?.value ?: 0L).toString(), (cpusetids?.value ?: 0L).toString(), cpusetidcount.toInt(), (requiredidcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: COpaquePointer?, grouparray: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessGroupAffinity((hprocess?.value ?: 0L).toString(), (groupcount?.value ?: 0L).toString(), (grouparray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessHandleCount((hprocess?.value ?: 0L).toString(), (pdwhandlecount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessHandleFromHwnd((hwnd?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessId(process: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessId((process?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessIdOfThread((thread?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessInformation((hprocess?.value ?: 0L).toString(), processinformationclass, (processinformation?.value ?: 0L).toString(), processinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessIoCounters((hprocess?.value ?: 0L).toString(), (lpiocounters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessMitigationPolicy((hprocess?.value ?: 0L).toString(), mitigationpolicy, (lpbuffer?.value ?: 0L).toString(), dwlength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessPriorityBoost((hprocess?.value ?: 0L).toString(), (pdisablepriorityboost?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessShutdownParameters(lpdwlevel: COpaquePointer?, lpdwflags: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessShutdownParameters((lpdwlevel?.value ?: 0L).toString(), (lpdwflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessTimes((hprocess?.value ?: 0L).toString(), (lpcreationtime?.value ?: 0L).toString(), (lpexittime?.value ?: 0L).toString(), (lpkerneltime?.value ?: 0L).toString(), (lpusertime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessVersion(processid: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessVersion(processid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getProcessWorkingSetSize((hprocess?.value ?: 0L).toString(), (lpminimumworkingsetsize?.value ?: 0L).toString(), (lpmaximumworkingsetsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStartupInfoA(lpstartupinfo: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_getStartupInfoA((lpstartupinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getStartupInfoW(lpstartupinfo: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_getStartupInfoW((lpstartupinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimes(lpidletime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getSystemTimes((lpidletime?.value ?: 0L).toString(), (lpkerneltime?.value ?: 0L).toString(), (lpusertime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadDescription((hthread?.value ?: 0L).toString(), (ppszthreaddescription?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadGroupAffinity((hthread?.value ?: 0L).toString(), (groupaffinity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadIOPendingFlag((hthread?.value ?: 0L).toString(), (lpioispending?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadId(thread: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadId((thread?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadIdealProcessorEx((hthread?.value ?: 0L).toString(), (lpidealprocessor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadInformation((hthread?.value ?: 0L).toString(), threadinformationclass, (threadinformation?.value ?: 0L).toString(), threadinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPriority(hthread: Handle): Int =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadPriority((hthread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadPriorityBoost((hthread?.value ?: 0L).toString(), (pdisablepriorityboost?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks((thread?.value ?: 0L).toString(), (cpusetmasks?.value ?: 0L).toString(), cpusetmaskcount.toInt(), (requiredmaskcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadSelectedCpuSets((thread?.value ?: 0L).toString(), (cpusetids?.value ?: 0L).toString(), cpusetidcount.toInt(), (requiredidcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getThreadTimes((hthread?.value ?: 0L).toString(), (lpcreationtime?.value ?: 0L).toString(), (lpexittime?.value ?: 0L).toString(), (lpkerneltime?.value ?: 0L).toString(), (lpusertime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUmsCompletionListEvent(umscompletionlist: COpaquePointer?, umscompletionevent: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getUmsCompletionListEvent((umscompletionlist?.value ?: 0L).toString(), (umscompletionevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_getUmsSystemThreadInformation((threadhandle?.value ?: 0L).toString(), (systemthreadinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceBeginInitialize(lpinitonce: COpaquePointer?, dwflags: UInt, fpending: COpaquePointer?, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initOnceBeginInitialize((lpinitonce?.value ?: 0L).toString(), dwflags.toInt(), (fpending?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceComplete(lpinitonce: COpaquePointer?, dwflags: UInt, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initOnceComplete((lpinitonce?.value ?: 0L).toString(), dwflags.toInt(), (lpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceExecuteOnce(initonce: COpaquePointer?, initfn: PinitOnceFn, parameter: COpaquePointer?, context: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initOnceExecuteOnce((initonce?.value ?: 0L).toString(), 0L.toString(), (parameter?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceInitialize(initonce: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_initOnceInitialize((initonce?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeConditionVariable(conditionvariable: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_initializeConditionVariable((conditionvariable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeCriticalSection(lpcriticalsection: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_initializeCriticalSection((lpcriticalsection?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount((lpcriticalsection?.value ?: 0L).toString(), dwspincount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeCriticalSectionEx(lpcriticalsection: COpaquePointer?, dwspincount: UInt, flags: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initializeCriticalSectionEx((lpcriticalsection?.value ?: 0L).toString(), dwspincount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initializeProcThreadAttributeList((lpattributelist?.value ?: 0L).toString(), dwattributecount.toInt(), dwflags.toInt(), (lpsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSListHead(listhead: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_initializeSListHead((listhead?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeSRWLock(srwlock: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_initializeSRWLock((srwlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeSynchronizationBarrier(lpbarrier: COpaquePointer?, ltotalthreads: Int, lspincount: Int): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_initializeSynchronizationBarrier((lpbarrier?.value ?: 0L).toString(), ltotalthreads, lspincount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_interlockedFlushSList((listhead?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_interlockedPopEntrySList((listhead?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_interlockedPushEntrySList((listhead?.value ?: 0L).toString(), (listentry?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_interlockedPushListSListEx((listhead?.value ?: 0L).toString(), (list?.value ?: 0L).toString(), (listend?.value ?: 0L).toString(), count.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isImmersiveProcess((hprocess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessCritical(hprocess: Handle, critical: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isProcessCritical((hprocess?.value ?: 0L).toString(), (critical?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isProcessorFeaturePresent(processorfeature.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThreadAFiber(): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isThreadAFiber() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isThreadpoolTimerSet(pti.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Process(hprocess: Handle, wow64process: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isWow64Process((hprocess?.value ?: 0L).toString(), (wow64process?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: COpaquePointer?, pnativemachine: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_isWow64Process2((hprocess?.value ?: 0L).toString(), (pprocessmachine?.value ?: 0L).toString(), (pnativemachine?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun leaveCriticalSection(lpcriticalsection: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_leaveCriticalSection((lpcriticalsection?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns(pci.toString(), (pcs?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openEventA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openEventW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openMutexW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrivateNamespaceA(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openPrivateNamespaceA((lpboundarydescriptor?.value ?: 0L).toString(), (lpaliasprefix?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrivateNamespaceW(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openPrivateNamespaceW((lpboundarydescriptor?.value ?: 0L).toString(), (lpaliasprefix?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openProcessToken((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openSemaphoreW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openThreadToken((threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), openasself, (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, (lptimername?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_openWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, (lptimername?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pulseEvent(hevent: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_pulseEvent((hevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDepthSList(listhead: COpaquePointer?): UShort =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryDepthSList((listhead?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryFullProcessImageNameA((hprocess?.value ?: 0L).toString(), dwflags.toInt(), (lpexename?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryFullProcessImageNameW((hprocess?.value ?: 0L).toString(), dwflags.toInt(), (lpexename?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode((hprocess?.value ?: 0L).toString(), (lpdwflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryProtectedPolicy(policyguid: COpaquePointer?, policyvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryProtectedPolicy((policyguid?.value ?: 0L).toString(), (policyvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryThreadpoolStackInformation(ptpp.toString(), (ptpsi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queryUmsThreadInformation((umsthread?.value ?: 0L).toString(), umsthreadinfoclass, (umsthreadinformation?.value ?: 0L).toString(), umsthreadinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: COpaquePointer?, flags: WorkerThreadFlags): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_queueUserWorkItem(0L.toString(), (context?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitForSingleObject(phnewwaitobject: COpaquePointer?, hobject: Handle, callback: Waitortimercallback, context: COpaquePointer?, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_registerWaitForSingleObject((phnewwaitobject?.value ?: 0L).toString(), (hobject?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), dwmilliseconds.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseMutex(hmutex: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_releaseMutex((hmutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns(pci.toString(), (mut?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSRWLockExclusive(srwlock: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_releaseSRWLockExclusive((srwlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSRWLockShared(srwlock: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_releaseSRWLockShared((srwlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_releaseSemaphore((hsemaphore?.value ?: 0L).toString(), lreleasecount, (lppreviouscount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns(pci.toString(), (sem?.value ?: 0L).toString(), crel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun resetEvent(hevent: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_resetEvent((hevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeThread(hthread: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_resumeThread((hthread?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: COpaquePointer?, key: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback(0L.toString(), (context?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue(workqueueidin.toInt(), (workqueueidout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue(workqueuetype, (workqueueid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), (usageclass?.value ?: 0L).toString(), dwtaskid.toInt(), lpriority, (donecallback?.value ?: 0L).toString(), (donestate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), (donecallback?.value ?: 0L).toString(), (donestate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqCancelDeadline((prequest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqCancelWorkItem(key.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCreateAsyncResult(appobject: COpaquePointer?, callback: COpaquePointer?, appstate: COpaquePointer?, asyncresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqCreateAsyncResult((appobject?.value ?: 0L).toString(), (callback?.value ?: 0L).toString(), (appstate?.value ?: 0L).toString(), (asyncresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: COpaquePointer?, taskid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS((result?.value ?: 0L).toString(), (taskid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), (usageclass?.value ?: 0L).toString(), (usageclasslength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), (priority?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), (taskid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqInvokeCallback(result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqInvokeCallback((result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqJoinWorkQueue(workqueueid.toInt(), (hfile?.value ?: 0L).toString(), (out?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockPlatform(): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqLockPlatform() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: COpaquePointer?, id: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue((usageclass?.value ?: 0L).toString(), basepriority, (taskid?.value ?: 0L).toString(), (id?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqLockWorkQueue(workqueueid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: COpaquePointer?, key: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem((hevent?.value ?: 0L).toString(), lpriority, (result?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqPutWorkItem(dwqueue.toInt(), lpriority, (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRegisterPlatformEvents(platformevents: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents((platformevents?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: COpaquePointer?, lpriority: Int): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS((usageclass?.value ?: 0L).toString(), (taskid?.value ?: 0L).toString(), lpriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback(dwkey.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqScheduleWorkItem(result: COpaquePointer?, timeout: Long, key: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqScheduleWorkItem((result?.value ?: 0L).toString(), timeout.toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqSetDeadline(workqueueid.toInt(), deadlineinhns.toString(), (prequest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqSetDeadline2(workqueueid.toInt(), deadlineinhns.toString(), predeadlineinhns.toString(), (prequest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqSetLongRunning(workqueueid.toInt(), enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqShutdown(): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqStartup(): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqStartup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue(workqueueid.toInt(), (hfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnlockPlatform(): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqUnlockPlatform() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue(workqueueid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnregisterPlatformEvents(platformevents: COpaquePointer?): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents((platformevents?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCriticalSectionSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setCriticalSectionSpinCount((lpcriticalsection?.value ?: 0L).toString(), dwspincount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEvent(hevent: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setEvent((hevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_setEventWhenCallbackReturns(pci.toString(), (evt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setPriorityClass((hprocess?.value ?: 0L).toString(), dwpriorityclass.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessAffinityMask((hprocess?.value ?: 0L).toString(), dwprocessaffinitymask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode((hprocess?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessDEPPolicy(dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks((process?.value ?: 0L).toString(), (cpusetmasks?.value ?: 0L).toString(), cpusetmaskcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessDefaultCpuSets((process?.value ?: 0L).toString(), (cpusetids?.value ?: 0L).toString(), cpusetidcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets((process?.value ?: 0L).toString(), numberoftargets.toInt(), (targets?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges((process?.value ?: 0L).toString(), numberofranges.toInt(), (ranges?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessInformation((hprocess?.value ?: 0L).toString(), processinformationclass, (processinformation?.value ?: 0L).toString(), processinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessMitigationPolicy(mitigationpolicy, (lpbuffer?.value ?: 0L).toString(), dwlength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessPriorityBoost((hprocess?.value ?: 0L).toString(), bdisablepriorityboost) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessRestrictionExemption(fenableexemption) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProcessWorkingSetSize((hprocess?.value ?: 0L).toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProtectedPolicy(policyguid: COpaquePointer?, policyvalue: ULong, oldpolicyvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setProtectedPolicy((policyguid?.value ?: 0L).toString(), policyvalue.toString(), (oldpolicyvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadAffinityMask((hthread?.value ?: 0L).toString(), dwthreadaffinitymask.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadDescription((hthread?.value ?: 0L).toString(), (lpthreaddescription?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?, previousgroupaffinity: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadGroupAffinity((hthread?.value ?: 0L).toString(), (groupaffinity?.value ?: 0L).toString(), (previousgroupaffinity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadIdealProcessor((hthread?.value ?: 0L).toString(), dwidealprocessor.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?, lppreviousidealprocessor: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadIdealProcessorEx((hthread?.value ?: 0L).toString(), (lpidealprocessor?.value ?: 0L).toString(), (lppreviousidealprocessor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadInformation((hthread?.value ?: 0L).toString(), threadinformationclass, (threadinformation?.value ?: 0L).toString(), threadinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadPriority((hthread?.value ?: 0L).toString(), npriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadPriorityBoost((hthread?.value ?: 0L).toString(), bdisablepriorityboost) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks((thread?.value ?: 0L).toString(), (cpusetmasks?.value ?: 0L).toString(), cpusetmaskcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadSelectedCpuSets((thread?.value ?: 0L).toString(), (cpusetids?.value ?: 0L).toString(), cpusetidcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadStackGuarantee(stacksizeinbytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadStackGuarantee((stacksizeinbytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadToken(thread: COpaquePointer?, token: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadToken((thread?.value ?: 0L).toString(), (token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadpoolStackInformation(ptpp.toString(), (ptpsi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum(ptpp.toString(), cthrdmost.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum(ptpp.toString(), cthrdmic.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_setThreadpoolTimer(pti.toString(), (pftduetime?.value ?: 0L).toString(), msperiod.toInt(), mswindowlength.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadpoolTimerEx(pti.toString(), (pftduetime?.value ?: 0L).toString(), msperiod.toInt(), mswindowlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_setThreadpoolWait(pwa.toString(), (h?.value ?: 0L).toString(), (pfttimeout?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setThreadpoolWaitEx(pwa.toString(), (h?.value ?: 0L).toString(), (pfttimeout?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, preferio: Bool): Handle =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setTimerQueueTimer((timerqueue?.value ?: 0L).toString(), 0L.toString(), (parameter?.value ?: 0L).toString(), duetime.toInt(), period.toInt(), preferio).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setUmsThreadInformation((umsthread?.value ?: 0L).toString(), umsthreadinfoclass, (umsthreadinformation?.value ?: 0L).toString(), umsthreadinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWaitableTimer(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, fresume: Bool): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setWaitableTimer((htimer?.value ?: 0L).toString(), (lpduetime?.value ?: 0L).toString(), lperiod, 0L.toString(), (lpargtocompletionroutine?.value ?: 0L).toString(), fresume) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, wakecontext: COpaquePointer?, tolerabledelay: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_setWaitableTimerEx((htimer?.value ?: 0L).toString(), (lpduetime?.value ?: 0L).toString(), lperiod, 0L.toString(), (lpargtocompletionroutine?.value ?: 0L).toString(), (wakecontext?.value ?: 0L).toString(), tolerabledelay.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_signalObjectAndWait((hobjecttosignal?.value ?: 0L).toString(), (hobjecttowaiton?.value ?: 0L).toString(), dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(dwmilliseconds: UInt) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_sleep(dwmilliseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sleepConditionVariableCS(conditionvariable: COpaquePointer?, criticalsection: COpaquePointer?, dwmilliseconds: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_sleepConditionVariableCS((conditionvariable?.value ?: 0L).toString(), (criticalsection?.value ?: 0L).toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleepConditionVariableSRW(conditionvariable: COpaquePointer?, srwlock: COpaquePointer?, dwmilliseconds: UInt, flags: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_sleepConditionVariableSRW((conditionvariable?.value ?: 0L).toString(), (srwlock?.value ?: 0L).toString(), dwmilliseconds.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_sleepEx(dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startThreadpoolIo(pio: PtpIo) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_startThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun submitThreadpoolWork(pwk: PtpWork) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_submitThreadpoolWork(pwk.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun suspendThread(hthread: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_suspendThread((hthread?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchToFiber(lpfiber: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_switchToFiber((lpfiber?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun switchToThread(): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_switchToThread() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_terminateProcess((hprocess?.value ?: 0L).toString(), uexitcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_terminateThread((hthread?.value ?: 0L).toString(), dwexitcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsAlloc(): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tlsAlloc().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tlsFree(dwtlsindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsGetValue(dwtlsindex: UInt): COpaquePointer? =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tlsGetValue(dwtlsindex.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tlsSetValue(dwtlsindex.toInt(), (lptlsvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryAcquireSRWLockExclusive(srwlock: COpaquePointer?): Boolean =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive((srwlock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryAcquireSRWLockShared(srwlock: COpaquePointer?): Boolean =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tryAcquireSRWLockShared((srwlock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryEnterCriticalSection(lpcriticalsection: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_tryEnterCriticalSection((lpcriticalsection?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback(0L.toString(), (pv?.value ?: 0L).toString(), (pcbe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsThreadYield(schedulerparam: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_umsThreadYield((schedulerparam?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWait(waithandle: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_unregisterWait((waithandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_unregisterWaitEx((waithandle?.value ?: 0L).toString(), (completionevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: COpaquePointer?, cbsize: ULong, lppreviousvalue: COpaquePointer?, lpreturnsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_updateProcThreadAttribute((lpattributelist?.value ?: 0L).toString(), dwflags.toInt(), attribute.toString(), (lpvalue?.value ?: 0L).toString(), cbsize.toString(), (lppreviousvalue?.value ?: 0L).toString(), (lpreturnsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_waitForInputIdle((hprocess?.value ?: 0L).toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_waitForMultipleObjects(ncount.toInt(), (lphandles?.value ?: 0L).toString(), bwaitall, dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_waitForMultipleObjectsEx(ncount.toInt(), (lphandles?.value ?: 0L).toString(), bwaitall, dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_waitForSingleObject((hhandle?.value ?: 0L).toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_waitForSingleObjectEx((hhandle?.value ?: 0L).toString(), dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks(pio.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks(pti.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks(pwa.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks(pwk.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitOnAddress(address: COpaquePointer?, compareaddress: COpaquePointer?, addresssize: ULong, dwmilliseconds: UInt): Bool =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_waitOnAddress((address?.value ?: 0L).toString(), (compareaddress?.value ?: 0L).toString(), addresssize.toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wakeAllConditionVariable(conditionvariable: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_wakeAllConditionVariable((conditionvariable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeByAddressAll(address: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_wakeByAddressAll((address?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeByAddressSingle(address: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_wakeByAddressSingle((address?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeConditionVariable(conditionvariable: COpaquePointer?) {
    if (_windowsWin32SystemThreadingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_threading_wakeConditionVariable((conditionvariable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_winExec((lpcmdline?.value ?: 0L).toString(), ucmdshow.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine(machine.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    if (_windowsWin32SystemThreadingNapiAvailable) _wasm_windowssys_windows_win32_system_threading_wow64SuspendThread((hthread?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
