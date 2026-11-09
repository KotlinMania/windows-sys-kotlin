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

public expect fun AddDllDirectory(newdirectory: PCWSTR): Long

public expect fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): HANDLE

public expect fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): HANDLE

public expect fun DisableThreadLibraryCalls(hlibmodule: HMODULE): BOOL

public expect fun EndUpdateResourceA(hupdate: HANDLE, fdiscard: BOOL): BOOL

public expect fun EndUpdateResourceW(hupdate: HANDLE, fdiscard: BOOL): BOOL

public expect fun EnumResourceLanguagesA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL

public expect fun EnumResourceLanguagesExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL

public expect fun EnumResourceLanguagesExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL

public expect fun EnumResourceLanguagesW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL

public expect fun EnumResourceNamesA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL

public expect fun EnumResourceNamesExA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL

public expect fun EnumResourceNamesExW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL

public expect fun EnumResourceNamesW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL

public expect fun EnumResourceTypesA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL

public expect fun EnumResourceTypesExA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL

public expect fun EnumResourceTypesExW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL

public expect fun EnumResourceTypesW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL

public expect fun FindResourceA(hmodule: HMODULE, lpname: PCSTR, lptype: PCSTR): HRSRC

public expect fun FindResourceExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): HRSRC

public expect fun FindResourceExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): HRSRC

public expect fun FindResourceW(hmodule: HMODULE, lpname: PCWSTR, lptype: PCWSTR): HRSRC

public expect fun FreeLibraryAndExitThread(hlibmodule: HMODULE, dwexitcode: UInt): Nothing

public expect fun FreeResource(hresdata: HGLOBAL): BOOL

public expect fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt

public expect fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt

public expect fun GetModuleFileNameA(hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt

public expect fun GetModuleFileNameW(hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun GetModuleHandleA(lpmodulename: PCSTR): HMODULE

public expect fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL

public expect fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL

public expect fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE

public expect fun GetProcAddress(hmodule: HMODULE, lpprocname: PCSTR): FARPROC

public expect fun LoadLibraryA(lplibfilename: PCSTR): HMODULE

public expect fun LoadLibraryExA(lplibfilename: PCSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE

public expect fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE

public expect fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE

public expect fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt

public expect fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): HMODULE

public expect fun LoadResource(hmodule: HMODULE, hresinfo: HRSRC): HGLOBAL

public expect fun LockResource(hresdata: HGLOBAL): Long

public expect fun QueryOptionalDelayLoadedAPI(hparentmodule: HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL

public expect fun RemoveDllDirectory(cookie: Long): BOOL

public expect fun SetDefaultDllDirectories(directoryflags: LOAD_LIBRARY_FLAGS): BOOL

public expect fun SetDllDirectoryA(lppathname: PCSTR): BOOL

public expect fun SetDllDirectoryW(lppathname: PCWSTR): BOOL

public expect fun SizeofResource(hmodule: HMODULE, hresinfo: HRSRC): UInt

public expect fun UpdateResourceA(hupdate: HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL

public expect fun UpdateResourceW(hupdate: HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL
