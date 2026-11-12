@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRestartmanagerNapiAddon(): Boolean

private val windowsWin32SystemRestartmanagerNapiAvailable: Boolean = initWindowsWin32SystemRestartmanagerNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmAddFilter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmAddFilter(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(p0)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmEndSession(p0)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmEndSession(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmGetFilterList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmGetFilterList(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmGetList(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmGetList(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmJoinSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmJoinSession(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmRegisterResources(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmRegisterResources(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmRestart(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmRestart(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmShutdown(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmShutdown(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestartmanagerRmStartSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRestartmanagerRmStartSession(p0: String, p1: Int, p2: String): Int

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr<RmUniqueProcess>, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmAddFilter(dwsessionhandle.toInt(), strmodulename.rawAddress.toString(), pprocess.rawAddress.toString(), strserviceshortname.rawAddress.toString(), filteraction).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr<UByte>, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmGetFilterList(dwsessionhandle.toInt(), pbfilterbuf.rawAddress.toString(), cbfilterbuf.toInt(), cbfilterbufneeded.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr<UInt>, pnprocinfo: MutPtr<UInt>, rgaffectedapps: MutPtr<RmProcessInfo>, lpdwrebootreasons: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmGetList(dwsessionhandle.toInt(), pnprocinfoneeded.rawAddress.toString(), pnprocinfo.rawAddress.toString(), rgaffectedapps.rawAddress.toString(), lpdwrebootreasons.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmJoinSession(psessionhandle: MutPtr<UInt>, strsessionkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmJoinSession(psessionhandle.rawAddress.toString(), strsessionkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr<Pcwstr>, napplications: UInt, rgapplications: ConstPtr<RmUniqueProcess>, nservices: UInt, rgsservicenames: ConstPtr<Pcwstr>): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), rgsfilenames.rawAddress.toString(), napplications.toInt(), rgapplications.rawAddress.toString(), nservices.toInt(), rgsservicenames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr<RmUniqueProcess>, strserviceshortname: Pcwstr): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(dwsessionhandle.toInt(), strmodulename.rawAddress.toString(), pprocess.rawAddress.toString(), strserviceshortname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmStartSession(psessionhandle: MutPtr<UInt>, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    if (windowsWin32SystemRestartmanagerNapiAvailable) wasmWindowssysWindowsWin32SystemRestartmanagerRmStartSession(psessionhandle.rawAddress.toString(), dwsessionflags.toInt(), strsessionkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
