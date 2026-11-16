@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

private val windowsWdkSystemThreadingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtCancelTimer(timerhandle.rawAddress.toString(), currentstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtCreateTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), timertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtOpenEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtOpenProcess(processhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), clientid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtOpenTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(processhandle.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtQueryInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtSetInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtSetTimer(timerhandle.rawAddress.toString(), duetime.rawAddress.toString(), 0L.toString(), timercontext.rawAddress.toString(), resumetimer, period, previousstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtSetTimerEx(timerhandle.rawAddress.toString(), timersetinformationclass, timersetinformation.rawAddress.toString(), timersetinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtTerminateProcess(processhandle.rawAddress.toString(), exitstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(handle.rawAddress.toString(), alertable, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwCancelTimer(timerhandle.rawAddress.toString(), currentstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwCreateTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), timertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwOpenEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwOpenProcess(processhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), clientid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwOpenTimer(timerhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(processhandle.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwQueryInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwSetInformationThread(threadhandle.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwSetTimer(timerhandle.rawAddress.toString(), duetime.rawAddress.toString(), 0L.toString(), timercontext.rawAddress.toString(), resumetimer, period, previousstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwSetTimerEx(timerhandle.rawAddress.toString(), timersetinformationclass, timersetinformation.rawAddress.toString(), timersetinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwTerminateProcess(processhandle.rawAddress.toString(), exitstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr): Ntstatus =
    if (windowsWdkSystemThreadingNapiAddon != null) (windowsWdkSystemThreadingNapiAddon.windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(handle.rawAddress.toString(), alertable, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
