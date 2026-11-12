@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemProcessstatusNapiAddon(): Boolean

private val windowsWin32SystemProcessstatusNapiAvailable: Boolean = initWindowsWin32SystemProcessstatusNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(p0)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEnumPageFilesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEnumPageFilesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEnumPageFilesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEnumPageFilesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEnumProcessModules(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEnumProcessModules(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusEnumProcesses(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusEnumProcesses(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetModuleInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetModuleInformation(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetWsChanges(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetWsChanges(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusGetWsChangesEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusGetWsChangesEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(p0)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(p0)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32EnumProcesses(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32EnumProcesses(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetWsChanges(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetWsChanges(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(p0)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusQueryWorkingSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusQueryWorkingSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(p0: String, p1: String, p2: Int): Int

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(lpimagebase.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEnumPageFilesA(0L.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEnumPageFilesW(0L.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEnumProcessModules(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: EnumProcessModulesExFlags): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString(), dwfilterflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusEnumProcesses(lpidprocess.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(imagebase.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetModuleInformation(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpmodinfo.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(pperformanceinformation.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(process.rawAddress.toString(), ppsmemcounters.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetWsChanges(hprocess.rawAddress.toString(), lpwatchinfo.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusGetWsChangesEx(hprocess.rawAddress.toString(), lpwatchinfoex.rawAddress.toString(), cb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(lpimagebase.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(0L.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(0L.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString(), dwfilterflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32EnumProcesses(lpidprocess.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(imagebase.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpmodinfo.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(pperformanceinformation.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(process.rawAddress.toString(), ppsmemcounters.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetWsChanges(hprocess.rawAddress.toString(), lpwatchinfo.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(hprocess.rawAddress.toString(), lpwatchinfoex.rawAddress.toString(), cb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusQueryWorkingSet(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAvailable) wasmWindowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
