@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWdkSystemSysteminformationNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun NtQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_NtQuerySystemInformation(systeminformationclass, systeminformation.toString(), systeminformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtQuerySystemTime(systemtime: Long): NTSTATUS =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_NtQuerySystemTime(systemtime.toString()) as Int) else 0

public actual fun NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_NtQueryTimerResolution(maximumtime.toString(), minimumtime.toString(), currenttime.toString()) as Int) else 0

public actual fun ZwQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_ZwQuerySystemInformation(systeminformationclass, systeminformation.toString(), systeminformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQuerySystemTime(systemtime: Long): NTSTATUS =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_ZwQuerySystemTime(systemtime.toString()) as Int) else 0

public actual fun ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_ZwQueryTimerResolution(maximumtime.toString(), minimumtime.toString(), currenttime.toString()) as Int) else 0
