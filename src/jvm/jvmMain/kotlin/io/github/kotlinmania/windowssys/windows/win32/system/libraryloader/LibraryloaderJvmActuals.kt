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

private object WindowsWin32SystemLibraryloaderJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_AddDllDirectory(newdirectory: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_BeginUpdateResourceA(pfilename: Long, bdeleteexistingresources: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_BeginUpdateResourceW(pfilename: Long, bdeleteexistingresources: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_DisableThreadLibraryCalls(hlibmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EndUpdateResourceA(hupdate: Long, fdiscard: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EndUpdateResourceW(hupdate: Long, fdiscard: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesA(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExA(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExW(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesW(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceNamesA(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceNamesExA(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceNamesExW(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceNamesW(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceTypesA(hmodule: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceTypesExA(hmodule: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceTypesExW(hmodule: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_EnumResourceTypesW(hmodule: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_FindResourceA(hmodule: Long, lpname: Long, lptype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_FindResourceExA(hmodule: Long, lptype: Long, lpname: Long, wlanguage: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_FindResourceExW(hmodule: Long, lptype: Long, lpname: Long, wlanguage: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_FindResourceW(hmodule: Long, lpname: Long, lptype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_FreeLibraryAndExitThread(hlibmodule: Long, dwexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_FreeResource(hresdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetDllDirectoryA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetDllDirectoryW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetModuleFileNameA(hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetModuleFileNameW(hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetModuleHandleA(lpmodulename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetModuleHandleExA(dwflags: Int, lpmodulename: Long, phmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetModuleHandleExW(dwflags: Int, lpmodulename: Long, phmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_GetModuleHandleW(lpmodulename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadLibraryA(lplibfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadLibraryExA(lplibfilename: Long, hfile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadLibraryExW(lplibfilename: Long, hfile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadLibraryW(lplibfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadModule(lpmodulename: Long, lpparameterblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadPackagedLibrary(lpwlibfilename: Long, reserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LoadResource(hmodule: Long, hresinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_LockResource(hresdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_QueryOptionalDelayLoadedAPI(hparentmodule: Long, lpdllname: Long, lpprocname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_RemoveDllDirectory(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_SetDefaultDllDirectories(directoryflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_SetDllDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_SetDllDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_SizeofResource(hmodule: Long, hresinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_UpdateResourceA(hupdate: Long, lptype: Long, lpname: Long, wlanguage: Short, lpdata: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_UpdateResourceW(hupdate: Long, lptype: Long, lpname: Long, wlanguage: Short, lpdata: Long, cb: Int): Int
}

public actual fun AddDllDirectory(newdirectory: PCWSTR): Long =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_AddDllDirectory(newdirectory)

public actual fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): HANDLE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_BeginUpdateResourceA(pfilename, bdeleteexistingresources)

public actual fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): HANDLE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_BeginUpdateResourceW(pfilename, bdeleteexistingresources)

public actual fun DisableThreadLibraryCalls(hlibmodule: HMODULE): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_DisableThreadLibraryCalls(hlibmodule)

public actual fun EndUpdateResourceA(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EndUpdateResourceA(hupdate, fdiscard)

public actual fun EndUpdateResourceW(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EndUpdateResourceW(hupdate, fdiscard)

public actual fun EnumResourceLanguagesA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesA(hmodule, lptype, lpname, lpenumfunc.toLong(), lparam)

public actual fun EnumResourceLanguagesExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExA(hmodule, lptype, lpname, lpenumfunc.toLong(), lparam, dwflags.toInt(), langid.toShort())

public actual fun EnumResourceLanguagesExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExW(hmodule, lptype, lpname, lpenumfunc.toLong(), lparam, dwflags.toInt(), langid.toShort())

public actual fun EnumResourceLanguagesW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesW(hmodule, lptype, lpname, lpenumfunc.toLong(), lparam)

public actual fun EnumResourceNamesA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceNamesA(hmodule, lptype, lpenumfunc.toLong(), lparam)

public actual fun EnumResourceNamesExA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceNamesExA(hmodule, lptype, lpenumfunc.toLong(), lparam, dwflags.toInt(), langid.toShort())

public actual fun EnumResourceNamesExW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceNamesExW(hmodule, lptype, lpenumfunc.toLong(), lparam, dwflags.toInt(), langid.toShort())

public actual fun EnumResourceNamesW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceNamesW(hmodule, lptype, lpenumfunc.toLong(), lparam)

public actual fun EnumResourceTypesA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceTypesA(hmodule, lpenumfunc.toLong(), lparam)

public actual fun EnumResourceTypesExA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceTypesExA(hmodule, lpenumfunc.toLong(), lparam, dwflags.toInt(), langid.toShort())

public actual fun EnumResourceTypesExW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceTypesExW(hmodule, lpenumfunc.toLong(), lparam, dwflags.toInt(), langid.toShort())

public actual fun EnumResourceTypesW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_EnumResourceTypesW(hmodule, lpenumfunc.toLong(), lparam)

public actual fun FindResourceA(hmodule: HMODULE, lpname: PCSTR, lptype: PCSTR): HRSRC =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_FindResourceA(hmodule, lpname, lptype)

public actual fun FindResourceExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): HRSRC =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_FindResourceExA(hmodule, lptype, lpname, wlanguage.toShort())

public actual fun FindResourceExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): HRSRC =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_FindResourceExW(hmodule, lptype, lpname, wlanguage.toShort())

public actual fun FindResourceW(hmodule: HMODULE, lpname: PCWSTR, lptype: PCWSTR): HRSRC =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_FindResourceW(hmodule, lpname, lptype)

public actual fun FreeLibraryAndExitThread(hlibmodule: HMODULE, dwexitcode: UInt): Nothing {
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_FreeLibraryAndExitThread(hlibmodule, dwexitcode.toInt())
    error("Unreachable noreturn C function FreeLibraryAndExitThread")
}

public actual fun FreeResource(hresdata: HGLOBAL): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_FreeResource(hresdata)

public actual fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetDllDirectoryA(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetDllDirectoryW(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetModuleFileNameA(hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetModuleFileNameA(hmodule, lpfilename, nsize.toInt()).toUInt()

public actual fun GetModuleFileNameW(hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetModuleFileNameW(hmodule, lpfilename, nsize.toInt()).toUInt()

public actual fun GetModuleHandleA(lpmodulename: PCSTR): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetModuleHandleA(lpmodulename)

public actual fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetModuleHandleExA(dwflags.toInt(), lpmodulename, phmodule)

public actual fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetModuleHandleExW(dwflags.toInt(), lpmodulename, phmodule)

public actual fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_GetModuleHandleW(lpmodulename)

public actual fun GetProcAddress(hmodule: HMODULE, lpprocname: PCSTR): FARPROC =
    null

public actual fun LoadLibraryA(lplibfilename: PCSTR): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadLibraryA(lplibfilename)

public actual fun LoadLibraryExA(lplibfilename: PCSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadLibraryExA(lplibfilename, hfile, dwflags.toInt())

public actual fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadLibraryExW(lplibfilename, hfile, dwflags.toInt())

public actual fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadLibraryW(lplibfilename)

public actual fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadModule(lpmodulename, lpparameterblock).toUInt()

public actual fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): HMODULE =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadPackagedLibrary(lpwlibfilename, reserved.toInt())

public actual fun LoadResource(hmodule: HMODULE, hresinfo: HRSRC): HGLOBAL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LoadResource(hmodule, hresinfo)

public actual fun LockResource(hresdata: HGLOBAL): Long =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_LockResource(hresdata)

public actual fun QueryOptionalDelayLoadedAPI(hparentmodule: HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_QueryOptionalDelayLoadedAPI(hparentmodule, lpdllname, lpprocname, reserved.toInt())

public actual fun RemoveDllDirectory(cookie: Long): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_RemoveDllDirectory(cookie)

public actual fun SetDefaultDllDirectories(directoryflags: LOAD_LIBRARY_FLAGS): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_SetDefaultDllDirectories(directoryflags.toInt())

public actual fun SetDllDirectoryA(lppathname: PCSTR): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_SetDllDirectoryA(lppathname)

public actual fun SetDllDirectoryW(lppathname: PCWSTR): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_SetDllDirectoryW(lppathname)

public actual fun SizeofResource(hmodule: HMODULE, hresinfo: HRSRC): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_SizeofResource(hmodule, hresinfo).toUInt()

public actual fun UpdateResourceA(hupdate: HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_UpdateResourceA(hupdate, lptype, lpname, wlanguage.toShort(), lpdata, cb.toInt())

public actual fun UpdateResourceW(hupdate: HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_UpdateResourceW(hupdate, lptype, lpname, wlanguage.toShort(), lpdata, cb.toInt())
