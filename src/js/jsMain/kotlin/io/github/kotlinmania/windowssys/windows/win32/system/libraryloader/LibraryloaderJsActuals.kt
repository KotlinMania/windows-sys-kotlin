@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

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

private val windowsWin32SystemLibraryloaderNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addDllDirectory(newdirectory: Pcwstr): MutPtr =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderAddDllDirectory(newdirectory.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(pfilename.rawAddress.toString(), bdeleteexistingresources) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(pfilename.rawAddress.toString(), bdeleteexistingresources) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(hlibmodule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(hupdate.rawAddress.toString(), fdiscard) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(hupdate.rawAddress.toString(), fdiscard) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(hmodule.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderFindResourceA(hmodule.rawAddress.toString(), lpname.rawAddress.toString(), lptype.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderFindResourceExA(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderFindResourceExW(hmodule.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderFindResourceW(hmodule.rawAddress.toString(), lpname.rawAddress.toString(), lptype.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    if (windowsWin32SystemLibraryloaderNapiAddon != null) {
        windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(hlibmodule.rawAddress.toString(), dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderFreeResource(hresdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(lpmodulename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: MutPtr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(dwflags.toInt(), lpmodulename.rawAddress.toString(), phmodule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: MutPtr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(dwflags.toInt(), lpmodulename.rawAddress.toString(), phmodule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(lpmodulename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadLibraryA(lplibfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(lplibfilename.rawAddress.toString(), hfile.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(lplibfilename.rawAddress.toString(), hfile.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadLibraryW(lplibfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: ConstPtr): UInt =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadModule(lpmodulename.rawAddress.toString(), lpparameterblock.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(lpwlibfilename.rawAddress.toString(), reserved.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLoadResource(hmodule.rawAddress.toString(), hresinfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockResource(hresdata: Hglobal): MutPtr =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) MutPtr((windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderLockResource(hresdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(hparentmodule.rawAddress.toString(), lpdllname.rawAddress.toString(), lpprocname.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDllDirectory(cookie: ConstPtr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderSizeofResource(hmodule.rawAddress.toString(), hresinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: ConstPtr, cb: UInt): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderUpdateResourceA(hupdate.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt(), lpdata.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: ConstPtr, cb: UInt): Bool =
    if (windowsWin32SystemLibraryloaderNapiAddon != null) (windowsWin32SystemLibraryloaderNapiAddon.windowssysWindowsWin32SystemLibraryloaderUpdateResourceW(hupdate.rawAddress.toString(), lptype.rawAddress.toString(), lpname.rawAddress.toString(), wlanguage.toInt(), lpdata.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
