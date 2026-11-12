@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
private external fun initWindowsWin32SystemThreadingNapiAddon(): Boolean

private val windowsWin32SystemThreadingNapiAvailable: Boolean = initWindowsWin32SystemThreadingNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAcquireSRWLockShared(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAcquireSRWLockShared(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAttachThreadInput(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAttachThreadInput(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingAvSetMmThreadPriority(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingAvSetMmThreadPriority(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCallbackMayRunLong(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCallbackMayRunLong(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCancelThreadpoolIo(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCancelThreadpoolIo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCancelTimerQueueTimer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCancelTimerQueueTimer(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCancelWaitableTimer(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCancelWaitableTimer(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingChangeTimerQueueTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingChangeTimerQueueTimer(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingClosePrivateNamespace(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingClosePrivateNamespace(p0: String, p1: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpool(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpool(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpoolIo(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolIo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpoolWait(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolWait(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCloseThreadpoolWork(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolWork(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingConvertFiberToThread()")
private external fun wasmWindowssysWindowsWin32SystemThreadingConvertFiberToThread(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingConvertThreadToFiber(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingConvertThreadToFiber(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingConvertThreadToFiberEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingConvertThreadToFiberEx(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateEventA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateEventA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateEventExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateEventExA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateEventExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateEventExW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateEventW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateEventW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateFiber(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateFiber(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateFiberEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateFiberEx(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateMutexA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateMutexA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateMutexExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateMutexExA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateMutexExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateMutexExW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateMutexW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateMutexW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateProcessA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateProcessA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateProcessAsUserA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateProcessAsUserA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateProcessAsUserW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateProcessAsUserW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateProcessW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateProcessW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateProcessWithLogonW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateProcessWithLogonW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateProcessWithTokenW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateProcessWithTokenW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateRemoteThread(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateRemoteThread(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateRemoteThreadEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateRemoteThreadEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateSemaphoreA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateSemaphoreExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreExA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateSemaphoreExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreExW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateSemaphoreW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThread(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThread(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThreadpool(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThreadpool(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup()")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThreadpoolIo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolIo(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThreadpoolTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolTimer(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThreadpoolWait(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolWait(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateThreadpoolWork(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolWork(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateTimerQueue()")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateTimerQueue(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateTimerQueueTimer(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateTimerQueueTimer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateUmsCompletionList(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateUmsCompletionList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateUmsThreadContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateUmsThreadContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateWaitableTimerA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateWaitableTimerExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerExA(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateWaitableTimerExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerExW(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingCreateWaitableTimerW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerW(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteCriticalSection(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteCriticalSection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteFiber(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteFiber(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteTimerQueue(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteTimerQueue(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteTimerQueueEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteTimerQueueEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteUmsCompletionList(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteUmsCompletionList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDeleteUmsThreadContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDeleteUmsThreadContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingEnterCriticalSection(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingEnterCriticalSection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingExecuteUmsThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingExecuteUmsThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingExitProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingExitProcess(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingExitThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingExitThread(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingFlsAlloc(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingFlsAlloc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingFlsFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingFlsFree(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingFlsGetValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingFlsGetValue(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingFlsSetValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingFlsSetValue(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()")
private external fun wasmWindowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetActiveProcessorCount(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetActiveProcessorCount(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentProcess()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcess(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentProcessId()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcessId(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentThread()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentThread(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentThreadId()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentThreadId(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetCurrentUmsThread()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetCurrentUmsThread(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetExitCodeProcess(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetExitCodeProcess(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetExitCodeThread(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetExitCodeThread(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetGuiResources(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetGuiResources(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetMachineTypeAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetMachineTypeAttributes(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount()")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNextUmsListItem(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNextUmsListItem(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaProcessorNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaProcessorNode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaProximityNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaProximityNode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetPriorityClass(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetPriorityClass(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessAffinityMask(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessAffinityMask(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessDEPPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessDEPPolicy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessGroupAffinity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessGroupAffinity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessHandleCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessHandleCount(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessId(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessIdOfThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessIdOfThread(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessIoCounters(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessIoCounters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessPriorityBoost(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessPriorityBoost(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessShutdownParameters(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessShutdownParameters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessTimes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessTimes(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessVersion(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessVersion(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetStartupInfoA(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetStartupInfoA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetStartupInfoW(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetStartupInfoW(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetSystemTimes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetSystemTimes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadDescription(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadDescription(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadGroupAffinity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadGroupAffinity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadId(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadPriority(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadPriority(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadPriorityBoost(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadPriorityBoost(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetThreadTimes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetThreadTimes(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitOnceBeginInitialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitOnceBeginInitialize(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitOnceComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitOnceComplete(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitOnceExecuteOnce(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitOnceExecuteOnce(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitOnceInitialize(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitOnceInitialize(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeConditionVariable(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeConditionVariable(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeCriticalSection(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeCriticalSection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeSListHead(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeSListHead(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeSRWLock(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeSRWLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInterlockedFlushSList(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInterlockedFlushSList(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInterlockedPopEntrySList(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInterlockedPopEntrySList(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInterlockedPushEntrySList(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInterlockedPushEntrySList(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingInterlockedPushListSListEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingInterlockedPushListSListEx(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsImmersiveProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsImmersiveProcess(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsProcessCritical(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsProcessCritical(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsThreadAFiber()")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsThreadAFiber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsWow64Process(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsWow64Process(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingIsWow64Process2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingIsWow64Process2(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingLeaveCriticalSection(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingLeaveCriticalSection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenEventA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenEventA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenEventW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenEventW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenMutexW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenMutexW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenProcess(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenProcessToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenProcessToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenSemaphoreW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenSemaphoreW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenThread(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenThreadToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenThreadToken(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenWaitableTimerA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenWaitableTimerA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingOpenWaitableTimerW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingOpenWaitableTimerW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingPulseEvent(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingPulseEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryDepthSList(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryDepthSList(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryProtectedPolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryProtectedPolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueryUmsThreadInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueryUmsThreadInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingQueueUserWorkItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingQueueUserWorkItem(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingReleaseMutex(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingReleaseMutex(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingReleaseSRWLockShared(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingReleaseSRWLockShared(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingReleaseSemaphore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingReleaseSemaphore(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingResetEvent(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingResetEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingResumeThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingResumeThread(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqCancelDeadline(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqCancelDeadline(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqInvokeCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqInvokeCallback(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqLockPlatform()")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqLockPlatform(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqPutWorkItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqPutWorkItem(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqSetDeadline(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqSetDeadline(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqSetDeadline2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqSetDeadline2(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqSetLongRunning(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqSetLongRunning(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqShutdown()")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqShutdown(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqStartup()")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqStartup(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqUnlockPlatform()")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqUnlockPlatform(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS()")
private external fun wasmWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetEvent(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetPriorityClass(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetPriorityClass(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessAffinityMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessAffinityMask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessPriorityBoost(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessPriorityBoost(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetProtectedPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetProtectedPolicy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadAffinityMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadAffinityMask(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadDescription(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadDescription(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadGroupAffinity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadGroupAffinity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadIdealProcessor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadIdealProcessor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadPriority(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadPriority(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadPriorityBoost(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadPriorityBoost(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadStackGuarantee(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadStackGuarantee(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadToken(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadToken(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolTimer(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolWait(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolWait(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetTimerQueueTimer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetTimerQueueTimer(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetUmsThreadInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetUmsThreadInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetWaitableTimer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetWaitableTimer(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSetWaitableTimerEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSetWaitableTimerEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSignalObjectAndWait(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSignalObjectAndWait(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSleep(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSleep(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSleepConditionVariableCS(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSleepConditionVariableCS(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSleepConditionVariableSRW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSleepConditionVariableSRW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSleepEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSleepEx(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingStartThreadpoolIo(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingStartThreadpoolIo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSuspendThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSuspendThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSwitchToFiber(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingSwitchToFiber(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingSwitchToThread()")
private external fun wasmWindowssysWindowsWin32SystemThreadingSwitchToThread(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTerminateProcess(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTerminateProcess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTerminateThread(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTerminateThread(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTlsAlloc()")
private external fun wasmWindowssysWindowsWin32SystemThreadingTlsAlloc(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTlsFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTlsFree(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTlsGetValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTlsGetValue(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTlsSetValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTlsSetValue(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTryEnterCriticalSection(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTryEnterCriticalSection(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingUmsThreadYield(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingUmsThreadYield(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingUnregisterWait(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingUnregisterWait(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingUnregisterWaitEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingUnregisterWaitEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForInputIdle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForInputIdle(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForMultipleObjects(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForSingleObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForSingleObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForSingleObjectEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForSingleObjectEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWaitOnAddress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWaitOnAddress(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWakeAllConditionVariable(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWakeAllConditionVariable(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWakeByAddressAll(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWakeByAddressAll(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWakeByAddressSingle(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWakeByAddressSingle(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWakeConditionVariable(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWakeConditionVariable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWinExec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWinExec(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemThreadingWow64SuspendThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemThreadingWow64SuspendThread(p0: String): Int

public actual fun acquireSRWLockExclusive(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun acquireSRWLockShared(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingAcquireSRWLockShared(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr, integritylabel: Psid): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor(boundarydescriptor.rawAddress.toString(), integritylabel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr, requiredsid: Psid): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor(boundarydescriptor.rawAddress.toString(), requiredsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness(avrthandle.rawAddress.toString(), systemresponsivenessvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics(avrthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroup(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup(context.rawAddress.toString(), period.rawAddress.toString(), threadorderingguid.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroupExA(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcstr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA(context.rawAddress.toString(), period.rawAddress.toString(), threadorderingguid.rawAddress.toString(), timeout.rawAddress.toString(), taskname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroupExW(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcwstr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW(context.rawAddress.toString(), period.rawAddress.toString(), threadorderingguid.rawAddress.toString(), timeout.rawAddress.toString(), taskname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtJoinThreadOrderingGroup(context: MutPtr, threadorderingguid: ConstPtr, before: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup(context.rawAddress.toString(), threadorderingguid.rawAddress.toString(), before) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA(firsttask.rawAddress.toString(), secondtask.rawAddress.toString(), taskindex.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW(firsttask.rawAddress.toString(), secondtask.rawAddress.toString(), taskindex.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA(taskname.rawAddress.toString(), taskindex.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW(taskname.rawAddress.toString(), taskindex.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingAvSetMmThreadPriority(avrthandle.rawAddress.toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelThreadpoolIo(pio: PtpIo) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCancelTimerQueueTimer(timerqueue.rawAddress.toString(), timer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCancelWaitableTimer(htimer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingChangeTimerQueueTimer(timerqueue.rawAddress.toString(), timer.rawAddress.toString(), duetime.toInt(), period.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingClosePrivateNamespace(handle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThreadpool(ptpp: PtpPool) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers(ptpcg.toString(), fcancelpendingcallbacks, pvcleanupcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolIo(pio: PtpIo) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolTimer(pti: PtpTimer) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolWait(pwa: PtpWait) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolWork(pwk: PtpWork) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun convertFiberToThread(): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingConvertFiberToThread() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertThreadToFiber(lpparameter: ConstPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingConvertThreadToFiber(lpparameter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertThreadToFiberEx(lpparameter: ConstPtr, dwflags: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingConvertThreadToFiberEx(lpparameter.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA(name.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW(name.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventA(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateEventA(lpeventattributes.rawAddress.toString(), bmanualreset, binitialstate, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventExA(lpeventattributes: ConstPtr, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateEventExA(lpeventattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventExW(lpeventattributes: ConstPtr, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateEventExW(lpeventattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventW(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateEventW(lpeventattributes.rawAddress.toString(), bmanualreset, binitialstate, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateFiber(dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateFiberEx(dwstackcommitsize.toString(), dwstackreservesize.toString(), dwflags.toInt(), 0L.toString(), lpparameter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexA(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateMutexA(lpmutexattributes.rawAddress.toString(), binitialowner, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexExA(lpmutexattributes: ConstPtr, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateMutexExA(lpmutexattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexExW(lpmutexattributes: ConstPtr, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateMutexExW(lpmutexattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexW(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateMutexW(lpmutexattributes.rawAddress.toString(), binitialowner, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA(lpprivatenamespaceattributes.rawAddress.toString(), lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW(lpprivatenamespaceattributes.rawAddress.toString(), lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateProcessA(lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateProcessAsUserA(htoken.rawAddress.toString(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateProcessAsUserW(htoken.rawAddress.toString(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateProcessW(lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateProcessWithLogonW(lpusername.rawAddress.toString(), lpdomain.rawAddress.toString(), lppassword.rawAddress.toString(), dwlogonflags.toInt(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateProcessWithTokenW(htoken.rawAddress.toString(), dwlogonflags.toInt(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpthreadid: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateRemoteThread(hprocess.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString(), dwcreationflags.toInt(), lpthreadid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateRemoteThreadEx(hprocess.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString(), dwcreationflags.toInt(), lpattributelist.rawAddress.toString(), lpthreadid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreA(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreExA(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreExW(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateSemaphoreW(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThread(lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateThread(lpthreadattributes.rawAddress.toString(), dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString(), dwcreationflags.toInt(), lpthreadid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpool(reserved: ConstPtr): PtpPool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateThreadpool(reserved.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr, pcbe: ConstPtr): PtpIo =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolIo(fl.rawAddress.toString(), 0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr, pcbe: ConstPtr): PtpTimer =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolTimer(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr, pcbe: ConstPtr): PtpWait =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolWait(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr, pcbe: ConstPtr): PtpWork =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateThreadpoolWork(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTimerQueue(): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateTimerQueue().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTimerQueueTimer(phnewtimer: MutPtr, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateTimerQueueTimer(phnewtimer.rawAddress.toString(), timerqueue.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), duetime.toInt(), period.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUmsCompletionList(umscompletionlist: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateUmsCompletionList(umscompletionlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUmsThreadContext(lpumsthread: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingCreateUmsThreadContext(lpumsthread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerA(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerA(lptimerattributes.rawAddress.toString(), bmanualreset, lptimername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerExA(lptimerattributes: ConstPtr, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerExA(lptimerattributes.rawAddress.toString(), lptimername.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerExW(lptimerattributes: ConstPtr, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerExW(lptimerattributes.rawAddress.toString(), lptimername.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerW(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingCreateWaitableTimerW(lptimerattributes.rawAddress.toString(), bmanualreset, lptimername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor(boundarydescriptor.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingDeleteCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteFiber(lpfiber: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingDeleteFiber(lpfiber.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList(lpattributelist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteSynchronizationBarrier(lpbarrier: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier(lpbarrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDeleteTimerQueue(timerqueue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDeleteTimerQueueEx(timerqueue.rawAddress.toString(), completionevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer(timerqueue.rawAddress.toString(), timer.rawAddress.toString(), completionevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUmsCompletionList(umscompletionlist: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDeleteUmsCompletionList(umscompletionlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUmsThreadContext(umsthread: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDeleteUmsThreadContext(umsthread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr, waittimeout: UInt, umsthreadlist: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems(umscompletionlist.rawAddress.toString(), waittimeout.toInt(), umsthreadlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enterCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingEnterCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enterSynchronizationBarrier(lpbarrier: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier(lpbarrier.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode(schedulerstartupinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeUmsThread(umsthread: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingExecuteUmsThread(umsthread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitProcess(uexitcode: UInt): Nothing {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingExitProcess(uexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exitProcess")
}

public actual fun exitThread(dwexitcode: UInt): Nothing {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingExitThread(dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exitThread")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingFlsAlloc(0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsFree(dwflsindex: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingFlsFree(dwflsindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsGetValue(dwflsindex: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingFlsGetValue(dwflsindex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingFlsSetValue(dwflsindex.toInt(), lpflsdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushProcessWriteBuffers() {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns(pci.toString(), mod.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveProcessorGroupCount(): UShort =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcess(): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcess().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessId(): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcessId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessorNumber(): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessorNumberEx(procnumber: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx(procnumber.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getCurrentThread(): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingGetCurrentThread().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadId(): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetCurrentThreadId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadStackLimits(lowlimit: MutPtr, highlimit: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits(lowlimit.rawAddress.toString(), highlimit.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getCurrentUmsThread(): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingGetCurrentUmsThread().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetExitCodeProcess(hprocess.rawAddress.toString(), lpexitcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetExitCodeThread(hthread.rawAddress.toString(), lpexitcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetGuiResources(hprocess.rawAddress.toString(), uiflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetMachineTypeAttributes(machine.toInt(), machinetypeattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaximumProcessorGroupCount(): UShort =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextUmsListItem(umscontext: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingGetNextUmsListItem(umscontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode(node.toInt(), availablebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx(node.toInt(), availablebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaHighestNodeNumber(highestnodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber(highestnodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle(hfile.rawAddress.toString(), nodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask(node.toInt(), processormask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr, processormaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2(nodenumber.toInt(), processormasks.rawAddress.toString(), processormaskcount.toInt(), requiredmaskcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx(node.toInt(), processormask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaProcessorNode(processor.toInt(), nodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProcessorNodeEx(processor: ConstPtr, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx(processor.rawAddress.toString(), nodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaProximityNode(proximityid.toInt(), nodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx(proximityid.toInt(), nodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClass(hprocess: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetPriorityClass(hprocess.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr, lpsystemaffinitymask: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessAffinityMask(hprocess.rawAddress.toString(), lpprocessaffinitymask.rawAddress.toString(), lpsystemaffinitymask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr, lppermanent: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessDEPPolicy(hprocess.rawAddress.toString(), lpflags.rawAddress.toString(), lppermanent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks(process.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt(), requiredmaskcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets(process.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt(), requiredidcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr, grouparray: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessGroupAffinity(hprocess.rawAddress.toString(), groupcount.rawAddress.toString(), grouparray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessHandleCount(hprocess.rawAddress.toString(), pdwhandlecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessId(process: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessId(process.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessIdOfThread(thread.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr, processinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessInformation(hprocess.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessIoCounters(hprocess.rawAddress.toString(), lpiocounters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr, dwlength: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy(hprocess.rawAddress.toString(), mitigationpolicy, lpbuffer.rawAddress.toString(), dwlength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessPriorityBoost(hprocess.rawAddress.toString(), pdisablepriorityboost.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessShutdownParameters(lpdwlevel: MutPtr, lpdwflags: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessShutdownParameters(lpdwlevel.rawAddress.toString(), lpdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessTimes(hprocess.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lpexittime.rawAddress.toString(), lpkerneltime.rawAddress.toString(), lpusertime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessVersion(processid: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessVersion(processid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize(hprocess.rawAddress.toString(), lpminimumworkingsetsize.rawAddress.toString(), lpmaximumworkingsetsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStartupInfoA(lpstartupinfo: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingGetStartupInfoA(lpstartupinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getStartupInfoW(lpstartupinfo: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingGetStartupInfoW(lpstartupinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimes(lpidletime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetSystemTimes(lpidletime.rawAddress.toString(), lpkerneltime.rawAddress.toString(), lpusertime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadDescription(hthread.rawAddress.toString(), ppszthreaddescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadGroupAffinity(hthread.rawAddress.toString(), groupaffinity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag(hthread.rawAddress.toString(), lpioispending.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadId(thread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadId(thread.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx(hthread.rawAddress.toString(), lpidealprocessor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr, threadinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadInformation(hthread.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPriority(hthread: Handle): Int =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadPriority(hthread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadPriorityBoost(hthread.rawAddress.toString(), pdisablepriorityboost.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks(thread.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt(), requiredmaskcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets(thread.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt(), requiredidcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetThreadTimes(hthread.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lpexittime.rawAddress.toString(), lpkerneltime.rawAddress.toString(), lpusertime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUmsCompletionListEvent(umscompletionlist: ConstPtr, umscompletionevent: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent(umscompletionlist.rawAddress.toString(), umscompletionevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation(threadhandle.rawAddress.toString(), systemthreadinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceBeginInitialize(lpinitonce: MutPtr, dwflags: UInt, fpending: MutPtr, lpcontext: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitOnceBeginInitialize(lpinitonce.rawAddress.toString(), dwflags.toInt(), fpending.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceComplete(lpinitonce: MutPtr, dwflags: UInt, lpcontext: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitOnceComplete(lpinitonce.rawAddress.toString(), dwflags.toInt(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceExecuteOnce(initonce: MutPtr, initfn: PinitOnceFn, parameter: MutPtr, context: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitOnceExecuteOnce(initonce.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceInitialize(initonce: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingInitOnceInitialize(initonce.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeConditionVariable(conditionvariable: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingInitializeConditionVariable(conditionvariable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingInitializeCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount(lpcriticalsection.rawAddress.toString(), dwspincount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeCriticalSectionEx(lpcriticalsection: MutPtr, dwspincount: UInt, flags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx(lpcriticalsection.rawAddress.toString(), dwspincount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList(lpattributelist.rawAddress.toString(), dwattributecount.toInt(), dwflags.toInt(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSListHead(listhead: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingInitializeSListHead(listhead.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeSRWLock(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingInitializeSRWLock(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeSynchronizationBarrier(lpbarrier: MutPtr, ltotalthreads: Int, lspincount: Int): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier(lpbarrier.rawAddress.toString(), ltotalthreads, lspincount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedFlushSList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingInterlockedFlushSList(listhead.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPopEntrySList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingInterlockedPopEntrySList(listhead.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingInterlockedPushEntrySList(listhead.rawAddress.toString(), listentry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingInterlockedPushListSListEx(listhead.rawAddress.toString(), list.rawAddress.toString(), listend.rawAddress.toString(), count.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsImmersiveProcess(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessCritical(hprocess: Handle, critical: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsProcessCritical(hprocess.rawAddress.toString(), critical.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThreadAFiber(): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsThreadAFiber() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Process(hprocess: Handle, wow64process: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsWow64Process(hprocess.rawAddress.toString(), wow64process.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr, pnativemachine: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingIsWow64Process2(hprocess.rawAddress.toString(), pprocessmachine.rawAddress.toString(), pnativemachine.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun leaveCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingLeaveCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns(pci.toString(), pcs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenEventA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenEventW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenMutexW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA(lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW(lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingOpenProcessToken(processhandle.rawAddress.toString(), desiredaccess.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenSemaphoreW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingOpenThreadToken(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, lptimername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingOpenWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, lptimername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pulseEvent(hevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingPulseEvent(hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDepthSList(listhead: ConstPtr): UShort =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryDepthSList(listhead.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA(hprocess.rawAddress.toString(), dwflags.toInt(), lpexename.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW(hprocess.rawAddress.toString(), dwflags.toInt(), lpexename.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode(hprocess.rawAddress.toString(), lpdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryProtectedPolicy(policyguid: ConstPtr, policyvalue: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryProtectedPolicy(policyguid.rawAddress.toString(), policyvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation(ptpp.toString(), ptpsi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr, umsthreadinformationlength: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueryUmsThreadInformation(umsthread.rawAddress.toString(), umsthreadinfoclass, umsthreadinformation.rawAddress.toString(), umsthreadinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr, flags: WorkerThreadFlags): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingQueueUserWorkItem(0L.toString(), context.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitForSingleObject(phnewwaitobject: MutPtr, hobject: Handle, callback: Waitortimercallback, context: ConstPtr, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject(phnewwaitobject.rawAddress.toString(), hobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), dwmilliseconds.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseMutex(hmutex: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingReleaseMutex(hmutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns(pci.toString(), mut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSRWLockExclusive(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSRWLockShared(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingReleaseSRWLockShared(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingReleaseSemaphore(hsemaphore.rawAddress.toString(), lreleasecount, lppreviouscount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns(pci.toString(), sem.rawAddress.toString(), crel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun resetEvent(hevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingResetEvent(hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeThread(hthread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingResumeThread(hthread.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr, key: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback(0L.toString(), context.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue(workqueueidin.toInt(), workqueueidout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue(workqueuetype, workqueueid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr, donestate: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), usageclass.rawAddress.toString(), dwtaskid.toInt(), lpriority, donecallback.rawAddress.toString(), donestate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr, donestate: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), donecallback.rawAddress.toString(), donestate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqCancelDeadline(prequest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCreateAsyncResult(appobject: MutPtr, callback: MutPtr, appstate: MutPtr, asyncresult: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult(appobject.rawAddress.toString(), callback.rawAddress.toString(), appstate.rawAddress.toString(), asyncresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr, taskid: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS(result.rawAddress.toString(), taskid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), usageclass.rawAddress.toString(), usageclasslength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), priority.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), taskid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqInvokeCallback(result: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqInvokeCallback(result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue(workqueueid.toInt(), hfile.rawAddress.toString(), out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockPlatform(): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqLockPlatform() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr, id: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue(usageclass.rawAddress.toString(), basepriority, taskid.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr, key: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem(hevent.rawAddress.toString(), lpriority, result.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqPutWorkItem(dwqueue.toInt(), lpriority, result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRegisterPlatformEvents(platformevents: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents(platformevents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr, lpriority: Int): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS(usageclass.rawAddress.toString(), taskid.rawAddress.toString(), lpriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqScheduleWorkItem(result: MutPtr, timeout: Long, key: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem(result.rawAddress.toString(), timeout.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqSetDeadline(workqueueid.toInt(), deadlineinhns.toString(), prequest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqSetDeadline2(workqueueid.toInt(), deadlineinhns.toString(), predeadlineinhns.toString(), prequest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid.toInt(), enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqShutdown(): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqStartup(): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqStartup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue(workqueueid.toInt(), hfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnlockPlatform(): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqUnlockPlatform() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnregisterPlatformEvents(platformevents: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents(platformevents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount(lpcriticalsection.rawAddress.toString(), dwspincount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEvent(hevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetEvent(hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns(pci.toString(), evt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetPriorityClass(hprocess.rawAddress.toString(), dwpriorityclass.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessAffinityMask(hprocess.rawAddress.toString(), dwprocessaffinitymask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode(hprocess.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks(process.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets(process.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets(process.rawAddress.toString(), numberoftargets.toInt(), targets.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges(process.rawAddress.toString(), numberofranges.toInt(), ranges.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr, processinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessInformation(hprocess.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr, dwlength: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy(mitigationpolicy, lpbuffer.rawAddress.toString(), dwlength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessPriorityBoost(hprocess.rawAddress.toString(), bdisablepriorityboost) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize(hprocess.rawAddress.toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProtectedPolicy(policyguid: ConstPtr, policyvalue: ULong, oldpolicyvalue: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetProtectedPolicy(policyguid.rawAddress.toString(), policyvalue.toString(), oldpolicyvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadAffinityMask(hthread.rawAddress.toString(), dwthreadaffinitymask.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadDescription(hthread.rawAddress.toString(), lpthreaddescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr, previousgroupaffinity: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadGroupAffinity(hthread.rawAddress.toString(), groupaffinity.rawAddress.toString(), previousgroupaffinity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadIdealProcessor(hthread.rawAddress.toString(), dwidealprocessor.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr, lppreviousidealprocessor: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx(hthread.rawAddress.toString(), lpidealprocessor.rawAddress.toString(), lppreviousidealprocessor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr, threadinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadInformation(hthread.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadPriority(hthread.rawAddress.toString(), npriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadPriorityBoost(hthread.rawAddress.toString(), bdisablepriorityboost) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks(thread.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets(thread.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadStackGuarantee(stacksizeinbytes: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadStackGuarantee(stacksizeinbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadToken(thread: ConstPtr, token: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadToken(thread.rawAddress.toString(), token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation(ptpp.toString(), ptpsi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp.toString(), cthrdmost.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp.toString(), cthrdmic.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolTimer(pti.toString(), pftduetime.rawAddress.toString(), msperiod.toInt(), mswindowlength.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx(pti.toString(), pftduetime.rawAddress.toString(), msperiod.toInt(), mswindowlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolWait(pwa.toString(), h.rawAddress.toString(), pfttimeout.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr, reserved: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx(pwa.toString(), h.rawAddress.toString(), pfttimeout.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, preferio: Bool): Handle =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingSetTimerQueueTimer(timerqueue.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), duetime.toInt(), period.toInt(), preferio).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr, umsthreadinformationlength: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetUmsThreadInformation(umsthread.rawAddress.toString(), umsthreadinfoclass, umsthreadinformation.rawAddress.toString(), umsthreadinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, fresume: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetWaitableTimer(htimer.rawAddress.toString(), lpduetime.rawAddress.toString(), lperiod, 0L.toString(), lpargtocompletionroutine.rawAddress.toString(), fresume) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, wakecontext: ConstPtr, tolerabledelay: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSetWaitableTimerEx(htimer.rawAddress.toString(), lpduetime.rawAddress.toString(), lperiod, 0L.toString(), lpargtocompletionroutine.rawAddress.toString(), wakecontext.rawAddress.toString(), tolerabledelay.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSignalObjectAndWait(hobjecttosignal.rawAddress.toString(), hobjecttowaiton.rawAddress.toString(), dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(dwmilliseconds: UInt) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSleep(dwmilliseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sleepConditionVariableCS(conditionvariable: MutPtr, criticalsection: MutPtr, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSleepConditionVariableCS(conditionvariable.rawAddress.toString(), criticalsection.rawAddress.toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleepConditionVariableSRW(conditionvariable: MutPtr, srwlock: MutPtr, dwmilliseconds: UInt, flags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSleepConditionVariableSRW(conditionvariable.rawAddress.toString(), srwlock.rawAddress.toString(), dwmilliseconds.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startThreadpoolIo(pio: PtpIo) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun submitThreadpoolWork(pwk: PtpWork) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun suspendThread(hthread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSuspendThread(hthread.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchToFiber(lpfiber: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingSwitchToFiber(lpfiber.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun switchToThread(): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingSwitchToThread() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTerminateProcess(hprocess.rawAddress.toString(), uexitcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTerminateThread(hthread.rawAddress.toString(), dwexitcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsAlloc(): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTlsAlloc().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsGetValue(dwtlsindex: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemThreadingTlsGetValue(dwtlsindex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTlsSetValue(dwtlsindex.toInt(), lptlsvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryAcquireSRWLockExclusive(srwlock: MutPtr): Boolean =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive(srwlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryAcquireSRWLockShared(srwlock: MutPtr): Boolean =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared(srwlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryEnterCriticalSection(lpcriticalsection: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTryEnterCriticalSection(lpcriticalsection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr, pcbe: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsThreadYield(schedulerparam: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingUmsThreadYield(schedulerparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWait(waithandle: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingUnregisterWait(waithandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingUnregisterWaitEx(waithandle.rawAddress.toString(), completionevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr, cbsize: ULong, lppreviousvalue: MutPtr, lpreturnsize: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute(lpattributelist.rawAddress.toString(), dwflags.toInt(), attribute.toString(), lpvalue.rawAddress.toString(), cbsize.toString(), lppreviousvalue.rawAddress.toString(), lpreturnsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWaitForInputIdle(hprocess.rawAddress.toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWaitForMultipleObjects(ncount.toInt(), lphandles.rawAddress.toString(), bwaitall, dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx(ncount.toInt(), lphandles.rawAddress.toString(), bwaitall, dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWaitForSingleObject(hhandle.rawAddress.toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWaitForSingleObjectEx(hhandle.rawAddress.toString(), dwmilliseconds.toInt(), balertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitOnAddress(address: ConstPtr, compareaddress: ConstPtr, addresssize: ULong, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWaitOnAddress(address.rawAddress.toString(), compareaddress.rawAddress.toString(), addresssize.toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wakeAllConditionVariable(conditionvariable: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWakeAllConditionVariable(conditionvariable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeByAddressAll(address: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWakeByAddressAll(address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeByAddressSingle(address: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWakeByAddressSingle(address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeConditionVariable(conditionvariable: MutPtr) {
    if (windowsWin32SystemThreadingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemThreadingWakeConditionVariable(conditionvariable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWinExec(lpcmdline.rawAddress.toString(), ucmdshow.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAvailable) wasmWindowssysWindowsWin32SystemThreadingWow64SuspendThread(hthread.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
