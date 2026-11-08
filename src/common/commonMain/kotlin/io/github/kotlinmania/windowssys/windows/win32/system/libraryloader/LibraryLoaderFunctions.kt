package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROCFn
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HRSRC

public fun interface FnCallback {
    public operator fun invoke(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lparam: Long): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lparam: Long): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lparam: Long): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lparam: Long): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(hmodule: HMODULE, lptype: PCSTR, lparam: Long): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(hmodule: HMODULE, lptype: PCWSTR, lparam: Long): BOOL
}

public fun AddDllDirectory(newdirectory: PCWSTR): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddDllDirectory", longArrayOf(newdirectory))
}

public fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "BeginUpdateResourceA", longArrayOf(pfilename, bdeleteexistingresources.toLong()))
}

public fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "BeginUpdateResourceW", longArrayOf(pfilename, bdeleteexistingresources.toLong()))
}

public fun DisableThreadLibraryCalls(hlibmodule: HMODULE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DisableThreadLibraryCalls", longArrayOf(hlibmodule)).toInt()
}

public fun EndUpdateResourceA(hupdate: HANDLE, fdiscard: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EndUpdateResourceA", longArrayOf(hupdate, fdiscard.toLong())).toInt()
}

public fun EndUpdateResourceW(hupdate: HANDLE, fdiscard: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EndUpdateResourceW", longArrayOf(hupdate, fdiscard.toLong())).toInt()
}

public fun EnumResourceLanguagesA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesA", longArrayOf(hmodule, lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceLanguagesExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesExA", longArrayOf(hmodule, lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceLanguagesExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesExW", longArrayOf(hmodule, lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceLanguagesW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesW", longArrayOf(hmodule, lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceNamesA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesA", longArrayOf(hmodule, lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceNamesExA(hmodule: HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesExA", longArrayOf(hmodule, lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceNamesExW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesExW", longArrayOf(hmodule, lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceNamesW(hmodule: HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesW", longArrayOf(hmodule, lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceTypesA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesA", longArrayOf(hmodule, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceTypesExA(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesExA", longArrayOf(hmodule, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceTypesExW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesExW", longArrayOf(hmodule, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceTypesW(hmodule: HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesW", longArrayOf(hmodule, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun FindResourceA(hmodule: HMODULE, lpname: PCSTR, lptype: PCSTR): HRSRC {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindResourceA", longArrayOf(hmodule, lpname, lptype))
}

public fun FindResourceExA(hmodule: HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): HRSRC {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindResourceExA", longArrayOf(hmodule, lptype, lpname, wlanguage.toLong()))
}

public fun FindResourceExW(hmodule: HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): HRSRC {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindResourceExW", longArrayOf(hmodule, lptype, lpname, wlanguage.toLong()))
}

public fun FindResourceW(hmodule: HMODULE, lpname: PCWSTR, lptype: PCWSTR): HRSRC {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindResourceW", longArrayOf(hmodule, lpname, lptype))
}

public fun FreeLibraryAndExitThread(hlibmodule: HMODULE, dwexitcode: UInt): Nothing {
    Win32DynamicFfi.invoke("kernel32.dll", "FreeLibraryAndExitThread", longArrayOf(hlibmodule, dwexitcode.toLong()))
    error("unreachable")
}

public fun FreeResource(hresdata: HGLOBAL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeResource", longArrayOf(hresdata)).toInt()
}

public fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDllDirectoryA", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDllDirectoryW", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetModuleFileNameA(hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleFileNameA", longArrayOf(hmodule, lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleFileNameW(hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleFileNameW", longArrayOf(hmodule, lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleHandleA(lpmodulename: PCSTR): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleA", longArrayOf(lpmodulename))
}

public fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleExA", longArrayOf(dwflags.toLong(), lpmodulename, phmodule)).toInt()
}

public fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleExW", longArrayOf(dwflags.toLong(), lpmodulename, phmodule)).toInt()
}

public fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleW", longArrayOf(lpmodulename))
}

public fun GetProcAddress(hmodule: HMODULE, lpprocname: PCSTR): FARPROC {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "GetProcAddress", longArrayOf(hmodule, lpprocname))
    return if (rawRet == 0L) null else FARPROCFn { Win32DynamicFfi.invokePtr(rawRet, longArrayOf()) }
}

public fun LoadLibraryA(lplibfilename: PCSTR): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryA", longArrayOf(lplibfilename))
}

public fun LoadLibraryExA(lplibfilename: PCSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryExA", longArrayOf(lplibfilename, hfile, dwflags.toLong()))
}

public fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: HANDLE, dwflags: LOAD_LIBRARY_FLAGS): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryExW", longArrayOf(lplibfilename, hfile, dwflags.toLong()))
}

public fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryW", longArrayOf(lplibfilename))
}

public fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadModule", longArrayOf(lpmodulename, lpparameterblock)).toUInt()
}

public fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): HMODULE {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadPackagedLibrary", longArrayOf(lpwlibfilename, reserved.toLong()))
}

public fun LoadResource(hmodule: HMODULE, hresinfo: HRSRC): HGLOBAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadResource", longArrayOf(hmodule, hresinfo))
}

public fun LockResource(hresdata: HGLOBAL): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "LockResource", longArrayOf(hresdata))
}

public fun QueryOptionalDelayLoadedAPI(hparentmodule: HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-libraryloader-l2-1-0.dll", "QueryOptionalDelayLoadedAPI", longArrayOf(hparentmodule, lpdllname, lpprocname, reserved.toLong())).toInt()
}

public fun RemoveDllDirectory(cookie: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveDllDirectory", longArrayOf(cookie)).toInt()
}

public fun SetDefaultDllDirectories(directoryflags: LOAD_LIBRARY_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDefaultDllDirectories", longArrayOf(directoryflags.toLong())).toInt()
}

public fun SetDllDirectoryA(lppathname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDllDirectoryA", longArrayOf(lppathname)).toInt()
}

public fun SetDllDirectoryW(lppathname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDllDirectoryW", longArrayOf(lppathname)).toInt()
}

public fun SizeofResource(hmodule: HMODULE, hresinfo: HRSRC): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SizeofResource", longArrayOf(hmodule, hresinfo)).toUInt()
}

public fun UpdateResourceA(hupdate: HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateResourceA", longArrayOf(hupdate, lptype, lpname, wlanguage.toLong(), lpdata, cb.toLong())).toInt()
}

public fun UpdateResourceW(hupdate: HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateResourceW", longArrayOf(hupdate, lptype, lpname, wlanguage.toLong(), lpdata, cb.toLong())).toInt()
}
