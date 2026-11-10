@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val _windowsWin32SystemRestartmanagerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmAddFilter(dwsessionhandle.toInt(), (strmodulename?.value ?: 0L).toString(), (pprocess?.value ?: 0L).toString(), (strserviceshortname?.value ?: 0L).toString(), filteraction) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmCancelCurrentTask(dwsessionhandle.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmEndSession(dwsessionhandle.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: COpaquePointer?, cbfilterbuf: UInt, cbfilterbufneeded: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmGetFilterList(dwsessionhandle.toInt(), (pbfilterbuf?.value ?: 0L).toString(), cbfilterbuf.toInt(), (cbfilterbufneeded?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: COpaquePointer?, pnprocinfo: COpaquePointer?, rgaffectedapps: COpaquePointer?, lpdwrebootreasons: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmGetList(dwsessionhandle.toInt(), (pnprocinfoneeded?.value ?: 0L).toString(), (pnprocinfo?.value ?: 0L).toString(), (rgaffectedapps?.value ?: 0L).toString(), (lpdwrebootreasons?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmJoinSession(psessionhandle: COpaquePointer?, strsessionkey: Pcwstr): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmJoinSession((psessionhandle?.value ?: 0L).toString(), (strsessionkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: COpaquePointer?, napplications: UInt, rgapplications: COpaquePointer?, nservices: UInt, rgsservicenames: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), (rgsfilenames?.value ?: 0L).toString(), napplications.toInt(), (rgapplications?.value ?: 0L).toString(), nservices.toInt(), (rgsservicenames?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmRemoveFilter(dwsessionhandle.toInt(), (strmodulename?.value ?: 0L).toString(), (pprocess?.value ?: 0L).toString(), (strserviceshortname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmStartSession(psessionhandle: COpaquePointer?, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    if (_windowsWin32SystemRestartmanagerNapiAddon != null) (_windowsWin32SystemRestartmanagerNapiAddon.windowssys_windows_win32_system_restartmanager_rmStartSession((psessionhandle?.value ?: 0L).toString(), dwsessionflags.toInt(), (strsessionkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
