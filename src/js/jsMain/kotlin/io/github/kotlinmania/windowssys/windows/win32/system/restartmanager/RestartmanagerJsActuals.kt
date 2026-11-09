@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

private val _windowsWin32SystemRestartmanagerNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun RmAddFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR, filteraction: RM_FILTER_ACTION): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmAddFilter(dwsessionhandle.toInt(), strmodulename.toString(), pprocess.toString(), strserviceshortname.toString(), filteraction) as Int).toUInt() else 0u

public actual fun RmCancelCurrentTask(dwsessionhandle: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmCancelCurrentTask(dwsessionhandle.toInt()) as Int).toUInt() else 0u

public actual fun RmEndSession(dwsessionhandle: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmEndSession(dwsessionhandle.toInt()) as Int).toUInt() else 0u

public actual fun RmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: Long, cbfilterbuf: UInt, cbfilterbufneeded: Long): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmGetFilterList(dwsessionhandle.toInt(), pbfilterbuf.toString(), cbfilterbuf.toInt(), cbfilterbufneeded.toString()) as Int).toUInt() else 0u

public actual fun RmGetList(dwsessionhandle: UInt, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmGetList(dwsessionhandle.toInt(), pnprocinfoneeded.toString(), pnprocinfo.toString(), rgaffectedapps.toString(), lpdwrebootreasons.toString()) as Int).toUInt() else 0u

public actual fun RmJoinSession(psessionhandle: Long, strsessionkey: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmJoinSession(psessionhandle.toString(), strsessionkey.toString()) as Int).toUInt() else 0u

public actual fun RmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: Long, napplications: UInt, rgapplications: Long, nservices: UInt, rgsservicenames: Long): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), rgsfilenames.toString(), napplications.toInt(), rgapplications.toString(), nservices.toInt(), rgsservicenames.toString()) as Int).toUInt() else 0u

public actual fun RmRemoveFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmRemoveFilter(dwsessionhandle.toInt(), strmodulename.toString(), pprocess.toString(), strserviceshortname.toString()) as Int).toUInt() else 0u

public actual fun RmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), fnstatus.toLong().toString()) as Int).toUInt() else 0u

public actual fun RmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), fnstatus.toLong().toString()) as Int).toUInt() else 0u

public actual fun RmStartSession(psessionhandle: Long, dwsessionflags: UInt, strsessionkey: PWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_RmStartSession(psessionhandle.toString(), dwsessionflags.toInt(), strsessionkey.toString()) as Int).toUInt() else 0u
