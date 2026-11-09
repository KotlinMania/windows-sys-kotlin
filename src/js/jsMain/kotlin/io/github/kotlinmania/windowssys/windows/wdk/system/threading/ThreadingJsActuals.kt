@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PTIMER_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE

private val _windowsWdkSystemThreadingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun NtCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtCancelTimer(timerhandle.toString(), currentstate.toString()) as Int) else 0

public actual fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtCreateTimer(timerhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), timertype) as Int) else 0

public actual fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtOpenEvent(eventhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtOpenProcess(processhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), clientid.toString()) as Int) else 0

public actual fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtOpenTimer(timerhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtQueryInformationProcess(processhandle.toString(), processinformationclass, processinformation.toString(), processinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtQueryInformationThread(threadhandle.toString(), threadinformationclass, threadinformation.toString(), threadinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtSetInformationThread(threadhandle.toString(), threadinformationclass, threadinformation.toString(), threadinformationlength.toInt()) as Int) else 0

public actual fun NtSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun NtSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtSetTimerEx(timerhandle.toString(), timersetinformationclass, timersetinformation.toString(), timersetinformationlength.toInt()) as Int) else 0

public actual fun NtTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtTerminateProcess(processhandle.toString(), exitstatus) as Int) else 0

public actual fun NtWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_NtWaitForSingleObject(handle.toString(), alertable, timeout.toString()) as Int) else 0

public actual fun ZwCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwCancelTimer(timerhandle.toString(), currentstate.toString()) as Int) else 0

public actual fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwCreateTimer(timerhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), timertype) as Int) else 0

public actual fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwOpenEvent(eventhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwOpenProcess(processhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), clientid.toString()) as Int) else 0

public actual fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwOpenTimer(timerhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwQueryInformationProcess(processhandle.toString(), processinformationclass, processinformation.toString(), processinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwQueryInformationThread(threadhandle.toString(), threadinformationclass, threadinformation.toString(), threadinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwSetInformationThread(threadhandle.toString(), threadinformationclass, threadinformation.toString(), threadinformationlength.toInt()) as Int) else 0

public actual fun ZwSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun ZwSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwSetTimerEx(timerhandle.toString(), timersetinformationclass, timersetinformation.toString(), timersetinformationlength.toInt()) as Int) else 0

public actual fun ZwTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwTerminateProcess(processhandle.toString(), exitstatus) as Int) else 0

public actual fun ZwWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    if (_windowsWdkSystemThreadingNapiAddon != null) (_windowsWdkSystemThreadingNapiAddon.windowssys_windows_wdk_system_threading_ZwWaitForSingleObject(handle.toString(), alertable, timeout.toString()) as Int) else 0
