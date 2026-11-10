@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemProcessstatusNapiAddon(): Boolean

private val _windowsWin32SystemProcessstatusNapiAvailable: Boolean = _initWindowsWin32SystemProcessstatusNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_emptyWorkingSet(p0)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_emptyWorkingSet(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_enumDeviceDrivers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_enumDeviceDrivers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_enumPageFilesA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_enumPageFilesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_enumPageFilesW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_enumPageFilesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_enumProcessModules(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_enumProcessModules(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_enumProcessModulesEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_enumProcessModulesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_enumProcesses(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_enumProcesses(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getMappedFileNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getMappedFileNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getMappedFileNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getMappedFileNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getModuleBaseNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getModuleBaseNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getModuleBaseNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getModuleBaseNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getModuleFileNameExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getModuleFileNameExA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getModuleFileNameExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getModuleFileNameExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getModuleInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getModuleInformation(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getPerformanceInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getPerformanceInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getProcessImageFileNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getProcessImageFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getProcessImageFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getProcessImageFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getProcessMemoryInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getProcessMemoryInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getWsChanges(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getWsChanges(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_getWsChangesEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_getWsChangesEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch(p0)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet(p0)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EnumProcessModules(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EnumProcessModules(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32EnumProcesses(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32EnumProcesses(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetModuleInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleInformation(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetWsChanges(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetWsChanges(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32GetWsChangesEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32GetWsChangesEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch(p0)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32QueryWorkingSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32QueryWorkingSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_queryWorkingSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_queryWorkingSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_processstatus_queryWorkingSetEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_processstatus_queryWorkingSetEx(p0: String, p1: String, p2: Int): Int

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_emptyWorkingSet((hprocess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_enumDeviceDrivers((lpimagebase?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_enumPageFilesA(0L.toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_enumPageFilesW(0L.toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_enumProcessModules((hprocess?.value ?: 0L).toString(), (lphmodule?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: EnumProcessModulesExFlags): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_enumProcessModulesEx((hprocess?.value ?: 0L).toString(), (lphmodule?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString(), dwfilterflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_enumProcesses((lpidprocess?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA((imagebase?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW((imagebase?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA((imagebase?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW((imagebase?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getMappedFileNameA((hprocess?.value ?: 0L).toString(), (lpv?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getMappedFileNameW((hprocess?.value ?: 0L).toString(), (lpv?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getModuleBaseNameA((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getModuleBaseNameW((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getModuleFileNameExA((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getModuleFileNameExW((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getModuleInformation((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpmodinfo?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getPerformanceInfo((pperformanceinformation?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getProcessImageFileNameA((hprocess?.value ?: 0L).toString(), (lpimagefilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getProcessImageFileNameW((hprocess?.value ?: 0L).toString(), (lpimagefilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getProcessMemoryInfo((process?.value ?: 0L).toString(), (ppsmemcounters?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getWsChanges((hprocess?.value ?: 0L).toString(), (lpwatchinfo?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_getWsChangesEx((hprocess?.value ?: 0L).toString(), (lpwatchinfoex?.value ?: 0L).toString(), (cb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch((hprocess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet((hprocess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers((lpimagebase?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(0L.toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(0L.toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EnumProcessModules((hprocess?.value ?: 0L).toString(), (lphmodule?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx((hprocess?.value ?: 0L).toString(), (lphmodule?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString(), dwfilterflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32EnumProcesses((lpidprocess?.value ?: 0L).toString(), cb.toInt(), (lpcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA((imagebase?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW((imagebase?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA((imagebase?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW((imagebase?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA((hprocess?.value ?: 0L).toString(), (lpv?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW((hprocess?.value ?: 0L).toString(), (lpv?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetModuleInformation((hprocess?.value ?: 0L).toString(), (hmodule?.value ?: 0L).toString(), (lpmodinfo?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo((pperformanceinformation?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA((hprocess?.value ?: 0L).toString(), (lpimagefilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW((hprocess?.value ?: 0L).toString(), (lpimagefilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo((process?.value ?: 0L).toString(), (ppsmemcounters?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetWsChanges((hprocess?.value ?: 0L).toString(), (lpwatchinfo?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32GetWsChangesEx((hprocess?.value ?: 0L).toString(), (lpwatchinfoex?.value ?: 0L).toString(), (cb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch((hprocess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32QueryWorkingSet((hprocess?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx((hprocess?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_queryWorkingSet((hprocess?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemProcessstatusNapiAvailable) _wasm_windowssys_windows_win32_system_processstatus_queryWorkingSetEx((hprocess?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
