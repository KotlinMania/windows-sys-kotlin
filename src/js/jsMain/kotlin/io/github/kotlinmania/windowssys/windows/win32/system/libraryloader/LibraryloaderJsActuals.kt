@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HRSRC

private val _windowsWin32SystemLibraryloaderNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddDllDirectory(newdirectory: PCWSTR): Long =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_AddDllDirectory(newdirectory.toString()) as String).toLong() else 0L

public actual fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): HANDLE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_BeginUpdateResourceA(pfilename.toString(), bdeleteexistingresources) as String).toLong() else 0L

public actual fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): HANDLE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_BeginUpdateResourceW(pfilename.toString(), bdeleteexistingresources) as String).toLong() else 0L

public actual fun DisableThreadLibraryCalls(hlibmodule: HMODULE): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_DisableThreadLibraryCalls(hlibmodule.toString()) as Int) else 0

public actual fun EndUpdateResourceA(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EndUpdateResourceA(hupdate.toString(), fdiscard) as Int) else 0

public actual fun EndUpdateResourceW(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EndUpdateResourceW(hupdate.toString(), fdiscard) as Int) else 0

public actual fun EnumResourceLanguagesA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesA(hmodule.toString(), lptype.toString(), lpname.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumResourceLanguagesExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExA(hmodule.toString(), lptype.toString(), lpname.toString(), lpenumfunc.toLong().toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else 0

public actual fun EnumResourceLanguagesExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExW(hmodule.toString(), lptype.toString(), lpname.toString(), lpenumfunc.toLong().toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else 0

public actual fun EnumResourceLanguagesW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesW(hmodule.toString(), lptype.toString(), lpname.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumResourceNamesA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceNamesA(hmodule.toString(), lptype.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumResourceNamesExA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceNamesExA(hmodule.toString(), lptype.toString(), lpenumfunc.toLong().toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else 0

public actual fun EnumResourceNamesExW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceNamesExW(hmodule.toString(), lptype.toString(), lpenumfunc.toLong().toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else 0

public actual fun EnumResourceNamesW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceNamesW(hmodule.toString(), lptype.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumResourceTypesA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceTypesA(hmodule.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumResourceTypesExA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceTypesExA(hmodule.toString(), lpenumfunc.toLong().toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else 0

public actual fun EnumResourceTypesExW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceTypesExW(hmodule.toString(), lpenumfunc.toLong().toString(), lparam.toString(), dwflags.toInt(), langid.toInt()) as Int) else 0

public actual fun EnumResourceTypesW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_EnumResourceTypesW(hmodule.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun FindResourceA(hmodule: HMODULE, lpname: PCSTR, lptype: PCSTR): HRSRC =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_FindResourceA(hmodule.toString(), lpname.toString(), lptype.toString()) as String).toLong() else 0L

public actual fun FindResourceExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): HRSRC =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_FindResourceExA(hmodule.toString(), lptype.toString(), lpname.toString(), wlanguage.toInt()) as String).toLong() else 0L

public actual fun FindResourceExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): HRSRC =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_FindResourceExW(hmodule.toString(), lptype.toString(), lpname.toString(), wlanguage.toInt()) as String).toLong() else 0L

public actual fun FindResourceW(hmodule: HMODULE, lpname: PCWSTR, lptype: PCWSTR): HRSRC =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_FindResourceW(hmodule.toString(), lpname.toString(), lptype.toString()) as String).toLong() else 0L

public actual fun FreeLibraryAndExitThread(hlibmodule: HMODULE, dwexitcode: UInt): Nothing {
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) {
        _windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_FreeLibraryAndExitThread(hlibmodule.toString(), dwexitcode.toInt())
    }
    error("Unreachable noreturn C function FreeLibraryAndExitThread")
}

public actual fun FreeResource(hresdata: HGLOBAL): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_FreeResource(hresdata.toString()) as Int) else 0

public actual fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetDllDirectoryA(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetDllDirectoryW(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetModuleFileNameA(hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetModuleFileNameA(hmodule.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleFileNameW(hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetModuleFileNameW(hmodule.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleHandleA(lpmodulename: PCSTR): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetModuleHandleA(lpmodulename.toString()) as String).toLong() else 0L

public actual fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetModuleHandleExA(dwflags.toInt(), lpmodulename.toString(), phmodule.toString()) as Int) else 0

public actual fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetModuleHandleExW(dwflags.toInt(), lpmodulename.toString(), phmodule.toString()) as Int) else 0

public actual fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_GetModuleHandleW(lpmodulename.toString()) as String).toLong() else 0L

public actual fun GetProcAddress(hmodule: HMODULE, lpprocname: PCSTR): FARPROC =
    null

public actual fun LoadLibraryA(lplibfilename: PCSTR): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadLibraryA(lplibfilename.toString()) as String).toLong() else 0L

public actual fun LoadLibraryExA(lplibfilename: PCSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadLibraryExA(lplibfilename.toString(), hfile.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadLibraryExW(lplibfilename.toString(), hfile.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadLibraryW(lplibfilename.toString()) as String).toLong() else 0L

public actual fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadModule(lpmodulename.toString(), lpparameterblock.toString()) as Int).toUInt() else 0u

public actual fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): HMODULE =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadPackagedLibrary(lpwlibfilename.toString(), reserved.toInt()) as String).toLong() else 0L

public actual fun LoadResource(hmodule: HMODULE, hresinfo: HRSRC): HGLOBAL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LoadResource(hmodule.toString(), hresinfo.toString()) as String).toLong() else 0L

public actual fun LockResource(hresdata: HGLOBAL): Long =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_LockResource(hresdata.toString()) as String).toLong() else 0L

public actual fun QueryOptionalDelayLoadedAPI(hparentmodule: HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_QueryOptionalDelayLoadedAPI(hparentmodule.toString(), lpdllname.toString(), lpprocname.toString(), reserved.toInt()) as Int) else 0

public actual fun RemoveDllDirectory(cookie: Long): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_RemoveDllDirectory(cookie.toString()) as Int) else 0

public actual fun SetDefaultDllDirectories(directoryflags: LOAD_LIBRARY_FLAGS): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_SetDefaultDllDirectories(directoryflags.toInt()) as Int) else 0

public actual fun SetDllDirectoryA(lppathname: PCSTR): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_SetDllDirectoryA(lppathname.toString()) as Int) else 0

public actual fun SetDllDirectoryW(lppathname: PCWSTR): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_SetDllDirectoryW(lppathname.toString()) as Int) else 0

public actual fun SizeofResource(hmodule: HMODULE, hresinfo: HRSRC): UInt =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_SizeofResource(hmodule.toString(), hresinfo.toString()) as Int).toUInt() else 0u

public actual fun UpdateResourceA(hupdate: HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_UpdateResourceA(hupdate.toString(), lptype.toString(), lpname.toString(), wlanguage.toInt(), lpdata.toString(), cb.toInt()) as Int) else 0

public actual fun UpdateResourceW(hupdate: HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemLibraryloaderNapiAddon != null) (_windowsWin32SystemLibraryloaderNapiAddon.windowssys_windows_win32_system_libraryloader_UpdateResourceW(hupdate.toString(), lptype.toString(), lpname.toString(), wlanguage.toInt(), lpdata.toString(), cb.toInt()) as Int) else 0
