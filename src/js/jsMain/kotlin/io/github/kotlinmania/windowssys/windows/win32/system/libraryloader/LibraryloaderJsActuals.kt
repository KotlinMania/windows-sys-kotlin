@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SystemLibraryloaderNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addDllDirectory(newdirectory: Pcwstr): COpaquePointer? =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_addDllDirectory((newdirectory?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_beginUpdateResourceA((pfilename?.value ?: 0L).toString(), bdeleteexistingresources) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_beginUpdateResourceW((pfilename?.value ?: 0L).toString(), bdeleteexistingresources) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls((hlibmodule?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_endUpdateResourceA((hupdate?.value ?: 0L).toString(), fdiscard) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_endUpdateResourceW((hupdate?.value ?: 0L).toString(), fdiscard) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceNamesA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceNamesExA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceNamesExW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceNamesW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceTypesA((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceTypesExA((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceTypesExW((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_enumResourceTypesW((hmodule?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_findResourceA((hmodule?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_findResourceExA((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_findResourceExW((hmodule?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_findResourceW((hmodule?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) {
        _windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread((hlibmodule?.value ?: 0L).toString(), dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_freeResource((hresdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getDllDirectoryA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getDllDirectoryW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getModuleFileNameA((hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getModuleFileNameW((hmodule?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getModuleHandleA((lpmodulename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: COpaquePointer?): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getModuleHandleExA(dwflags.toInt(), (lpmodulename?.value ?: 0L).toString(), (phmodule?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: COpaquePointer?): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getModuleHandleExW(dwflags.toInt(), (lpmodulename?.value ?: 0L).toString(), (phmodule?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_getModuleHandleW((lpmodulename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadLibraryA((lplibfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadLibraryExA((lplibfilename?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadLibraryExW((lplibfilename?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadLibraryW((lplibfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: COpaquePointer?): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadModule((lpmodulename?.value ?: 0L).toString(), (lpparameterblock?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadPackagedLibrary((lpwlibfilename?.value ?: 0L).toString(), reserved.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_loadResource((hmodule?.value ?: 0L).toString(), (hresinfo?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockResource(hresdata: Hglobal): COpaquePointer? =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_lockResource((hresdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI((hparentmodule?.value ?: 0L).toString(), (lpdllname?.value ?: 0L).toString(), (lpprocname?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDllDirectory(cookie: COpaquePointer?): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_removeDllDirectory((cookie?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(directoryflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_setDllDirectoryA((lppathname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_setDllDirectoryW((lppathname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_sizeofResource((hmodule?.value ?: 0L).toString(), (hresinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_updateResourceA((hupdate?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt(), (lpdata?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_updateResourceW((hupdate?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), wlanguage.toInt(), (lpdata?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
