@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hrsrc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemLibraryloaderNapiAddon(): Boolean

private val _windowsWin32SystemLibraryloaderNapiAvailable: Boolean = _initWindowsWin32SystemLibraryloaderNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_addDllDirectory(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_addDllDirectory(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_beginUpdateResourceA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_beginUpdateResourceA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_beginUpdateResourceW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_beginUpdateResourceW(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_endUpdateResourceA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_endUpdateResourceA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_endUpdateResourceW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_endUpdateResourceW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceNamesA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceNamesExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceNamesExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceNamesW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceTypesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceTypesExA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesExA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceTypesExW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesExW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_enumResourceTypesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_findResourceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_findResourceA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_findResourceExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_findResourceExA(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_findResourceExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_findResourceExW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_findResourceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_findResourceW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_freeResource(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_freeResource(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getDllDirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getDllDirectoryA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getDllDirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getDllDirectoryW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getModuleFileNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getModuleFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getModuleFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getModuleFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getModuleHandleA(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getModuleHandleExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleExA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getModuleHandleExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleExW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_getModuleHandleW(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadLibraryA(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadLibraryExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryExA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadLibraryExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryExW(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadLibraryW(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadModule(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadModule(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadPackagedLibrary(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadPackagedLibrary(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_loadResource(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_loadResource(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_lockResource(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_lockResource(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_removeDllDirectory(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_removeDllDirectory(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_setDllDirectoryA(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_setDllDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_setDllDirectoryW(p0)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_setDllDirectoryW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_sizeofResource(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_sizeofResource(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_updateResourceA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_updateResourceA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_libraryloader_updateResourceW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_libraryloader_updateResourceW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

public actual fun addDllDirectory(newdirectory: Pcwstr): COpaquePointer? =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_addDllDirectory((newdirectory?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_beginUpdateResourceA((pfilename?.value ?: 0L).toString(), bdeleteexistingresources).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_beginUpdateResourceW((pfilename?.value ?: 0L).toString(), bdeleteexistingresources).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls((hlibmodule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_endUpdateResourceA((hupdate?.value ?: 0L).toString(), fdiscard) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_endUpdateResourceW((hupdate?.value ?: 0L).toString(), fdiscard) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesExA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesExW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceNamesW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesA((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesExA((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesExW((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_enumResourceTypesW((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_findResourceA((hmodule?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_findResourceExA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_findResourceExW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_findResourceW((hmodule?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    if (_windowsWin32SystemLibraryloaderNapiAvailable) {
        _wasm_windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread((hlibmodule?.value ?: 0L).toString(), dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_freeResource((hresdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getDllDirectoryA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getDllDirectoryW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getModuleFileNameA((hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getModuleFileNameW((hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleA((lpmodulename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: COpaquePointer?): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleExA(dwflags.toInt(), (lpmodulename?.value ?: 0L).toString(), (phmodule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: COpaquePointer?): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleExW(dwflags.toInt(), (lpmodulename?.value ?: 0L).toString(), (phmodule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_getModuleHandleW((lpmodulename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryA((lplibfilename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryExA((lplibfilename?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), dwflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryExW((lplibfilename?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), dwflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadLibraryW((lplibfilename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: COpaquePointer?): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadModule((lpmodulename?.value ?: 0L).toString(), (lpparameterblock?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadPackagedLibrary((lpwlibfilename?.value ?: 0L).toString(), reserved.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_loadResource((hmodule?.value ?: 0L).toString(), (hresinfo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockResource(hresdata: Hglobal): COpaquePointer? =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_lockResource((hresdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI((hparentmodule?.value ?: 0L).toString(), (lpdllname?.value ?: 0L).toString(), (lpprocname?.value ?: 0L).toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDllDirectory(cookie: COpaquePointer?): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_removeDllDirectory((cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(directoryflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_setDllDirectoryA((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_setDllDirectoryW((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_sizeofResource((hmodule?.value ?: 0L).toString(), (hresinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_updateResourceA((hupdate?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt(), (lpdata?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAvailable) _wasm_windowssys_windows_win32_system_libraryloader_updateResourceW((hupdate?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt(), (lpdata?.value ?: 0L).toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
