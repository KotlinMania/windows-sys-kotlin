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

public actual fun AddDllDirectory(newdirectory: PCWSTR): Long =
    0L

public actual fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): HANDLE =
    0L

public actual fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): HANDLE =
    0L

public actual fun DisableThreadLibraryCalls(hlibmodule: HMODULE): BOOL =
    0

public actual fun EndUpdateResourceA(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    0

public actual fun EndUpdateResourceW(hupdate: HANDLE, fdiscard: BOOL): BOOL =
    0

public actual fun EnumResourceLanguagesA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL =
    0

public actual fun EnumResourceLanguagesExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    0

public actual fun EnumResourceLanguagesExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    0

public actual fun EnumResourceLanguagesW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL =
    0

public actual fun EnumResourceNamesA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL =
    0

public actual fun EnumResourceNamesExA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    0

public actual fun EnumResourceNamesExW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    0

public actual fun EnumResourceNamesW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL =
    0

public actual fun EnumResourceTypesA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL =
    0

public actual fun EnumResourceTypesExA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    0

public actual fun EnumResourceTypesExW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL =
    0

public actual fun EnumResourceTypesW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL =
    0

public actual fun FindResourceA(hmodule: HMODULE, lpname: PCSTR, lptype: PCSTR): HRSRC =
    0L

public actual fun FindResourceExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): HRSRC =
    0L

public actual fun FindResourceExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): HRSRC =
    0L

public actual fun FindResourceW(hmodule: HMODULE, lpname: PCWSTR, lptype: PCWSTR): HRSRC =
    0L

public actual fun FreeLibraryAndExitThread(hlibmodule: HMODULE, dwexitcode: UInt): Nothing =
    error("Unreachable noreturn C function FreeLibraryAndExitThread")

public actual fun FreeResource(hresdata: HGLOBAL): BOOL =
    0

public actual fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    0u

public actual fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    0u

public actual fun GetModuleFileNameA(hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleFileNameW(hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleHandleA(lpmodulename: PCSTR): HMODULE =
    0L

public actual fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL =
    0

public actual fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL =
    0

public actual fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    0L

public actual fun GetProcAddress(hmodule: HMODULE, lpprocname: PCSTR): FARPROC =
    null

public actual fun LoadLibraryA(lplibfilename: PCSTR): HMODULE =
    0L

public actual fun LoadLibraryExA(lplibfilename: PCSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    0L

public actual fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE =
    0L

public actual fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE =
    0L

public actual fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt =
    0u

public actual fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): HMODULE =
    0L

public actual fun LoadResource(hmodule: HMODULE, hresinfo: HRSRC): HGLOBAL =
    0L

public actual fun LockResource(hresdata: HGLOBAL): Long =
    0L

public actual fun QueryOptionalDelayLoadedAPI(hparentmodule: HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL =
    0

public actual fun RemoveDllDirectory(cookie: Long): BOOL =
    0

public actual fun SetDefaultDllDirectories(directoryflags: LOAD_LIBRARY_FLAGS): BOOL =
    0

public actual fun SetDllDirectoryA(lppathname: PCSTR): BOOL =
    0

public actual fun SetDllDirectoryW(lppathname: PCWSTR): BOOL =
    0

public actual fun SizeofResource(hmodule: HMODULE, hresinfo: HRSRC): UInt =
    0u

public actual fun UpdateResourceA(hupdate: HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    0

public actual fun UpdateResourceW(hupdate: HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL =
    0
