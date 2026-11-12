@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val windowsWin32SystemRestartmanagerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr<RmUniqueProcess>, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmAddFilter(dwsessionhandle.toInt(), strmodulename.rawAddress.toString(), pprocess.rawAddress.toString(), strserviceshortname.rawAddress.toString(), filteraction) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr<UByte>, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmGetFilterList(dwsessionhandle.toInt(), pbfilterbuf.rawAddress.toString(), cbfilterbuf.toInt(), cbfilterbufneeded.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr<UInt>, pnprocinfo: MutPtr<UInt>, rgaffectedapps: MutPtr<RmProcessInfo>, lpdwrebootreasons: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmGetList(dwsessionhandle.toInt(), pnprocinfoneeded.rawAddress.toString(), pnprocinfo.rawAddress.toString(), rgaffectedapps.rawAddress.toString(), lpdwrebootreasons.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmJoinSession(psessionhandle: MutPtr<UInt>, strsessionkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmJoinSession(psessionhandle.rawAddress.toString(), strsessionkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr<Pcwstr>, napplications: UInt, rgapplications: ConstPtr<RmUniqueProcess>, nservices: UInt, rgsservicenames: ConstPtr<Pcwstr>): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), rgsfilenames.rawAddress.toString(), napplications.toInt(), rgapplications.rawAddress.toString(), nservices.toInt(), rgsservicenames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr<RmUniqueProcess>, strserviceshortname: Pcwstr): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(dwsessionhandle.toInt(), strmodulename.rawAddress.toString(), pprocess.rawAddress.toString(), strserviceshortname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmStartSession(psessionhandle: MutPtr<UInt>, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAddon != null) (windowsWin32SystemRestartmanagerNapiAddon.windowssysWindowsWin32SystemRestartmanagerRmStartSession(psessionhandle.rawAddress.toString(), dwsessionflags.toInt(), strsessionkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
