@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
private external fun initWindowsWin32SystemLibraryloaderNapiAddon(): Boolean

private val windowsWin32SystemLibraryloaderNapiAvailable: Boolean = initWindowsWin32SystemLibraryloaderNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderAddDllDirectory(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderAddDllDirectory(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderFindResourceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderFindResourceExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceExA(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderFindResourceExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceExW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderFindResourceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderFreeResource(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderFreeResource(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadLibraryA(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadLibraryW(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadModule(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadModule(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLoadResource(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLoadResource(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderLockResource(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderLockResource(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(p0)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderSizeofResource(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderSizeofResource(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderUpdateResourceA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderUpdateResourceA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemLibraryloaderUpdateResourceW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemLibraryloaderUpdateResourceW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

public actual fun addDllDirectory(newdirectory: Pcwstr): MutPtr<CVoid> =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderAddDllDirectory(newdirectory.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(pfilename.rawAddress.toString(), bdeleteexistingresources).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(pfilename.rawAddress.toString(), bdeleteexistingresources).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(hlibmodule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(hupdate.rawAddress.toString(), fdiscard) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(hupdate.rawAddress.toString(), fdiscard) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceA(hmodule.rawAddress.toString(), lpname.rawAddress.toString(), lptype.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceExA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceExW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderFindResourceW(hmodule.rawAddress.toString(), lpname.rawAddress.toString(), lptype.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    if (windowsWin32SystemLibraryloaderNapiAvailable) {
        wasmWindowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(hlibmodule.rawAddress.toString(), dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderFreeResource(hresdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(lpmodulename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: MutPtr<Hmodule>): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(dwflags.toInt(), lpmodulename.rawAddress.toString(), phmodule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: MutPtr<Hmodule>): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(dwflags.toInt(), lpmodulename.rawAddress.toString(), phmodule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(lpmodulename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryA(lplibfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(lplibfilename.rawAddress.toString(), hfile.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(lplibfilename.rawAddress.toString(), hfile.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLoadLibraryW(lplibfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderLoadModule(lpmodulename.rawAddress.toString(), lpparameterblock.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(lpwlibfilename.rawAddress.toString(), reserved.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLoadResource(hmodule.rawAddress.toString(), hresinfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockResource(hresdata: Hglobal): MutPtr<CVoid> =
    if (windowsWin32SystemLibraryloaderNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemLibraryloaderLockResource(hresdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(hparentmodule.rawAddress.toString(), lpdllname.rawAddress.toString(), lpprocname.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDllDirectory(cookie: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderSizeofResource(hmodule.rawAddress.toString(), hresinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderUpdateResourceA(hupdate.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt(), lpdata.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    if (windowsWin32SystemLibraryloaderNapiAvailable) wasmWindowssysWindowsWin32SystemLibraryloaderUpdateResourceW(hupdate.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt(), lpdata.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
