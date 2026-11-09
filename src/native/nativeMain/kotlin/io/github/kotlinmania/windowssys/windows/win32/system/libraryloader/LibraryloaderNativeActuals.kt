@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddDllDirectory(newdirectory: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_AddDllDirectory(newdirectory.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_BeginUpdateResourceA(pfilename.toCPointer<ByteVar>(), bdeleteexistingresources)?.toLong() ?: 0L

public actual fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_BeginUpdateResourceW(pfilename.toCPointer<ByteVar>(), bdeleteexistingresources)?.toLong() ?: 0L

public actual fun DisableThreadLibraryCalls(hlibmodule: HMODULE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_DisableThreadLibraryCalls(hlibmodule.toCPointer<ByteVar>())

public actual fun EndUpdateResourceA(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EndUpdateResourceA(hupdate.toCPointer<ByteVar>(), fdiscard)

public actual fun EndUpdateResourceW(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EndUpdateResourceW(hupdate.toCPointer<ByteVar>(), fdiscard)

public actual fun EnumResourceLanguagesA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesA(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumResourceLanguagesExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExA(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun EnumResourceLanguagesExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExW(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun EnumResourceLanguagesW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesW(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumResourceNamesA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceNamesA(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumResourceNamesExA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceNamesExA(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun EnumResourceNamesExW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceNamesExW(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun EnumResourceNamesW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceNamesW(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumResourceTypesA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceTypesA(hmodule.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumResourceTypesExA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceTypesExA(hmodule.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun EnumResourceTypesExW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceTypesExW(hmodule.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun EnumResourceTypesW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_EnumResourceTypesW(hmodule.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun FindResourceA(hmodule: HMODULE, lpname: PCSTR, lptype: PCSTR): HRSRC =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_FindResourceA(hmodule.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindResourceExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): HRSRC =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_FindResourceExA(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), wlanguage)?.toLong() ?: 0L

public actual fun FindResourceExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): HRSRC =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_FindResourceExW(hmodule.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), wlanguage)?.toLong() ?: 0L

public actual fun FindResourceW(hmodule: HMODULE, lpname: PCWSTR, lptype: PCWSTR): HRSRC =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_FindResourceW(hmodule.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FreeLibraryAndExitThread(hlibmodule: HMODULE, dwexitcode: UInt): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_FreeLibraryAndExitThread(hlibmodule.toCPointer<ByteVar>(), dwexitcode)
    error("Unreachable noreturn C function FreeLibraryAndExitThread")
}

public actual fun FreeResource(hresdata: HGLOBAL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_FreeResource(hresdata.toCPointer<ByteVar>())

public actual fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetDllDirectoryA(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetDllDirectoryW(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetModuleFileNameA(hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetModuleFileNameA(hmodule.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleFileNameW(hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetModuleFileNameW(hmodule.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleHandleA(lpmodulename: PCSTR): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetModuleHandleA(lpmodulename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetModuleHandleExA(dwflags, lpmodulename.toCPointer<ByteVar>(), phmodule.toCPointer<ByteVar>())

public actual fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetModuleHandleExW(dwflags, lpmodulename.toCPointer<ByteVar>(), phmodule.toCPointer<ByteVar>())

public actual fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_GetModuleHandleW(lpmodulename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetProcAddress(hmodule: HMODULE, lpprocname: PCSTR): FARPROC =
    null

public actual fun LoadLibraryA(lplibfilename: PCSTR): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadLibraryA(lplibfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadLibraryExA(lplibfilename: PCSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadLibraryExA(lplibfilename.toCPointer<ByteVar>(), hfile.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadLibraryExW(lplibfilename.toCPointer<ByteVar>(), hfile.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadLibraryW(lplibfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadModule(lpmodulename.toCPointer<ByteVar>(), lpparameterblock.toCPointer<ByteVar>())

public actual fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadPackagedLibrary(lpwlibfilename.toCPointer<ByteVar>(), reserved)?.toLong() ?: 0L

public actual fun LoadResource(hmodule: HMODULE, hresinfo: HRSRC): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LoadResource(hmodule.toCPointer<ByteVar>(), hresinfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LockResource(hresdata: HGLOBAL): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_LockResource(hresdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun QueryOptionalDelayLoadedAPI(hparentmodule: HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_QueryOptionalDelayLoadedAPI(hparentmodule.toCPointer<ByteVar>(), lpdllname.toCPointer<ByteVar>(), lpprocname.toCPointer<ByteVar>(), reserved)

public actual fun RemoveDllDirectory(cookie: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_RemoveDllDirectory(cookie.toCPointer<ByteVar>())

public actual fun SetDefaultDllDirectories(directoryflags: LOAD_LIBRARY_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_SetDefaultDllDirectories(directoryflags)

public actual fun SetDllDirectoryA(lppathname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_SetDllDirectoryA(lppathname.toCPointer<ByteVar>())

public actual fun SetDllDirectoryW(lppathname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_SetDllDirectoryW(lppathname.toCPointer<ByteVar>())

public actual fun SizeofResource(hmodule: HMODULE, hresinfo: HRSRC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_SizeofResource(hmodule.toCPointer<ByteVar>(), hresinfo.toCPointer<ByteVar>())

public actual fun UpdateResourceA(hupdate: HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_UpdateResourceA(hupdate.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), wlanguage, lpdata.toCPointer<ByteVar>(), cb)

public actual fun UpdateResourceW(hupdate: HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_UpdateResourceW(hupdate.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), wlanguage, lpdata.toCPointer<ByteVar>(), cb)
