@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkSystemThreadingNapiAddon(): Boolean

private val windowsWdkSystemThreadingNapiAvailable: Boolean = initWindowsWdkSystemThreadingNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtCancelTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtCancelTimer(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtCreateTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtCreateTimer(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtOpenEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtOpenEvent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtOpenProcess(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtOpenProcess(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtOpenTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtOpenTimer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtQueryInformationProcess(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtQueryInformationThread(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtQueryInformationThread(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtSetInformationThread(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtSetInformationThread(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtSetTimer(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtSetTimer(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtSetTimerEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtSetTimerEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtTerminateProcess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtTerminateProcess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemThreadingNtWaitForSingleObject(p0: String, p1: Boolean, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwCancelTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwCancelTimer(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwCreateTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwCreateTimer(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwOpenEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwOpenEvent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwOpenProcess(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwOpenProcess(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwOpenTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwOpenTimer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwQueryInformationProcess(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwQueryInformationThread(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwQueryInformationThread(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwSetInformationThread(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwSetInformationThread(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwSetTimer(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwSetTimer(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwSetTimerEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwSetTimerEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwTerminateProcess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwTerminateProcess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemThreadingZwWaitForSingleObject(p0: String, p1: Boolean, p2: String): Int

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtCancelTimer(timerhandle.rawAddress.toString(), currentstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtCreateTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), timertype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtOpenEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtOpenProcess(processhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), clientid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtOpenTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtQueryInformationProcess(processhandle.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtQueryInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtSetInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtSetTimer(timerhandle.rawAddress.toString(), duetime.rawAddress.toString(), 0L.toString(), timercontext.rawAddress.toString(), resumetimer, period, previousstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtSetTimerEx(timerhandle.rawAddress.toString(), timersetinformationclass, timersetinformation.rawAddress.toString(), timersetinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtTerminateProcess(processhandle.rawAddress.toString(), exitstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingNtWaitForSingleObject(handle.rawAddress.toString(), alertable, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwCancelTimer(timerhandle.rawAddress.toString(), currentstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwCreateTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), timertype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwOpenEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwOpenProcess(processhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), clientid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwOpenTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwQueryInformationProcess(processhandle.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwQueryInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwSetInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwSetTimer(timerhandle.rawAddress.toString(), duetime.rawAddress.toString(), 0L.toString(), timercontext.rawAddress.toString(), resumetimer, period, previousstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwSetTimerEx(timerhandle.rawAddress.toString(), timersetinformationclass, timersetinformation.rawAddress.toString(), timersetinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwTerminateProcess(processhandle.rawAddress.toString(), exitstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAvailable) wasmWindowssysWindowsWdkSystemThreadingZwWaitForSingleObject(handle.rawAddress.toString(), alertable, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
