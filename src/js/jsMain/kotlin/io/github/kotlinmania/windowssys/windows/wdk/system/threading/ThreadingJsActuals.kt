@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

private val _windowsWdkSystemThreadingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntCancelTimer((timerhandle?.value ?: 0L).toString(), (currentstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntCreateTimer((timerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), timertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntOpenEvent((eventhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntOpenProcess((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (clientid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntOpenTimer((timerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntQueryInformationProcess((processhandle?.value ?: 0L).toString(), processinformationclass, (processinformation?.value ?: 0L).toString(), processinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntQueryInformationThread((threadhandle?.value ?: 0L).toString(), threadinformationclass, (threadinformation?.value ?: 0L).toString(), threadinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntSetInformationThread((threadhandle?.value ?: 0L).toString(), threadinformationclass, (threadinformation?.value ?: 0L).toString(), threadinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntSetTimer((timerhandle?.value ?: 0L).toString(), (duetime?.value ?: 0L).toString(), 0L.toString(), (timercontext?.value ?: 0L).toString(), resumetimer, period, (previousstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntSetTimerEx((timerhandle?.value ?: 0L).toString(), timersetinformationclass, (timersetinformation?.value ?: 0L).toString(), timersetinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntTerminateProcess((processhandle?.value ?: 0L).toString(), exitstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ntWaitForSingleObject((handle?.value ?: 0L).toString(), alertable, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwCancelTimer((timerhandle?.value ?: 0L).toString(), (currentstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwCreateTimer((timerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), timertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwOpenEvent((eventhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwOpenProcess((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (clientid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwOpenTimer((timerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwQueryInformationProcess((processhandle?.value ?: 0L).toString(), processinformationclass, (processinformation?.value ?: 0L).toString(), processinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwQueryInformationThread((threadhandle?.value ?: 0L).toString(), threadinformationclass, (threadinformation?.value ?: 0L).toString(), threadinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwSetInformationThread((threadhandle?.value ?: 0L).toString(), threadinformationclass, (threadinformation?.value ?: 0L).toString(), threadinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwSetTimer((timerhandle?.value ?: 0L).toString(), (duetime?.value ?: 0L).toString(), 0L.toString(), (timercontext?.value ?: 0L).toString(), resumetimer, period, (previousstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwSetTimerEx((timerhandle?.value ?: 0L).toString(), timersetinformationclass, (timersetinformation?.value ?: 0L).toString(), timersetinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwTerminateProcess((processhandle?.value ?: 0L).toString(), exitstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_zwWaitForSingleObject((handle?.value ?: 0L).toString(), alertable, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
