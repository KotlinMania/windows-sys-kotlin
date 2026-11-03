package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(hmodule: Foundation.HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lparam: Long): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lparam: Long): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(hmodule: Foundation.HMODULE, lptype: PCSTR, lpname: PCSTR, lparam: Long): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpname: PCWSTR, lparam: Long): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(hmodule: Foundation.HMODULE, lptype: PCSTR, lparam: Long): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(hmodule: Foundation.HMODULE, lptype: PCWSTR, lparam: Long): BOOL
}

public fun AddDllDirectory(newdirectory: PCWSTR): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddDllDirectory", longArrayOf(newdirectory))
}

public fun BeginUpdateResourceA(pfilename: PCSTR, bdeleteexistingresources: BOOL): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "BeginUpdateResourceA", longArrayOf(pfilename, bdeleteexistingresources.toLong()))
    return Foundation.HANDLE()
}

public fun BeginUpdateResourceW(pfilename: PCWSTR, bdeleteexistingresources: BOOL): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "BeginUpdateResourceW", longArrayOf(pfilename, bdeleteexistingresources.toLong()))
    return Foundation.HANDLE()
}

public fun DisableThreadLibraryCalls(hlibmodule: Foundation.HMODULE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DisableThreadLibraryCalls", longArrayOf(Win32DynamicFfi.objectSlot(hlibmodule))).toInt()
}

public fun EndUpdateResourceA(hupdate: Foundation.HANDLE, fdiscard: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EndUpdateResourceA", longArrayOf(Win32DynamicFfi.objectSlot(hupdate), fdiscard.toLong())).toInt()
}

public fun EndUpdateResourceW(hupdate: Foundation.HANDLE, fdiscard: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EndUpdateResourceW", longArrayOf(Win32DynamicFfi.objectSlot(hupdate), fdiscard.toLong())).toInt()
}

public fun EnumResourceLanguagesA(hmodule: Foundation.HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceLanguagesExA(hmodule: Foundation.HMODULE, lptype: PCSTR, lpname: PCSTR, lpenumfunc: ENUMRESLANGPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesExA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceLanguagesExW(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesExW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceLanguagesW(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpname: PCWSTR, lpenumfunc: ENUMRESLANGPROCW, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceLanguagesW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, lpname, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceNamesA(hmodule: Foundation.HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceNamesExA(hmodule: Foundation.HMODULE, lptype: PCSTR, lpenumfunc: ENUMRESNAMEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesExA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceNamesExW(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesExW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceNamesW(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpenumfunc: ENUMRESNAMEPROCW, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceNamesW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceTypesA(hmodule: Foundation.HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun EnumResourceTypesExA(hmodule: Foundation.HMODULE, lpenumfunc: ENUMRESTYPEPROCA, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesExA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceTypesExW(hmodule: Foundation.HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long, dwflags: UInt, langid: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesExW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), Win32DynamicFfi.objectSlot(lpenumfunc), lparam, dwflags.toLong(), langid.toLong())).toInt()
}

public fun EnumResourceTypesW(hmodule: Foundation.HMODULE, lpenumfunc: ENUMRESTYPEPROCW, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumResourceTypesW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), Win32DynamicFfi.objectSlot(lpenumfunc), lparam)).toInt()
}

public fun FindResourceA(hmodule: Foundation.HMODULE, lpname: PCSTR, lptype: PCSTR): Foundation.HRSRC {
    Win32DynamicFfi.invoke("kernel32.dll", "FindResourceA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lpname, lptype))
    return Foundation.HRSRC()
}

public fun FindResourceExA(hmodule: Foundation.HMODULE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort): Foundation.HRSRC {
    Win32DynamicFfi.invoke("kernel32.dll", "FindResourceExA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, lpname, wlanguage.toLong()))
    return Foundation.HRSRC()
}

public fun FindResourceExW(hmodule: Foundation.HMODULE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort): Foundation.HRSRC {
    Win32DynamicFfi.invoke("kernel32.dll", "FindResourceExW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lptype, lpname, wlanguage.toLong()))
    return Foundation.HRSRC()
}

public fun FindResourceW(hmodule: Foundation.HMODULE, lpname: PCWSTR, lptype: PCWSTR): Foundation.HRSRC {
    Win32DynamicFfi.invoke("kernel32.dll", "FindResourceW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lpname, lptype))
    return Foundation.HRSRC()
}

public fun FreeLibraryAndExitThread(hlibmodule: Foundation.HMODULE, dwexitcode: UInt): Nothing {
    Win32DynamicFfi.invoke("kernel32.dll", "FreeLibraryAndExitThread", longArrayOf(Win32DynamicFfi.objectSlot(hlibmodule), dwexitcode.toLong()))
    error("unreachable")
}

public fun FreeResource(hresdata: Foundation.HGLOBAL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeResource", longArrayOf(Win32DynamicFfi.objectSlot(hresdata))).toInt()
}

public fun GetDllDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDllDirectoryA", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetDllDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDllDirectoryW", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetModuleFileNameA(hmodule: Foundation.HMODULE, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleFileNameW(hmodule: Foundation.HMODULE, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleHandleA(lpmodulename: PCSTR): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleA", longArrayOf(lpmodulename))
    return Foundation.HMODULE()
}

public fun GetModuleHandleExA(dwflags: UInt, lpmodulename: PCSTR, phmodule: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleExA", longArrayOf(dwflags.toLong(), lpmodulename, phmodule)).toInt()
}

public fun GetModuleHandleExW(dwflags: UInt, lpmodulename: PCWSTR, phmodule: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleExW", longArrayOf(dwflags.toLong(), lpmodulename, phmodule)).toInt()
}

public fun GetModuleHandleW(lpmodulename: PCWSTR): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "GetModuleHandleW", longArrayOf(lpmodulename))
    return Foundation.HMODULE()
}

public fun GetProcAddress(hmodule: Foundation.HMODULE, lpprocname: PCSTR): Foundation.FARPROC {
    Win32DynamicFfi.invoke("kernel32.dll", "GetProcAddress", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), lpprocname))
    return Foundation.FARPROC()
}

public fun LoadLibraryA(lplibfilename: PCSTR): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryA", longArrayOf(lplibfilename))
    return Foundation.HMODULE()
}

public fun LoadLibraryExA(lplibfilename: PCSTR, hfile: Foundation.HANDLE, dwflags: LOAD_LIBRARY_FLAGS): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryExA", longArrayOf(lplibfilename, Win32DynamicFfi.objectSlot(hfile), dwflags.toLong()))
    return Foundation.HMODULE()
}

public fun LoadLibraryExW(lplibfilename: PCWSTR, hfile: Foundation.HANDLE, dwflags: LOAD_LIBRARY_FLAGS): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryExW", longArrayOf(lplibfilename, Win32DynamicFfi.objectSlot(hfile), dwflags.toLong()))
    return Foundation.HMODULE()
}

public fun LoadLibraryW(lplibfilename: PCWSTR): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "LoadLibraryW", longArrayOf(lplibfilename))
    return Foundation.HMODULE()
}

public fun LoadModule(lpmodulename: PCSTR, lpparameterblock: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadModule", longArrayOf(lpmodulename, lpparameterblock)).toUInt()
}

public fun LoadPackagedLibrary(lpwlibfilename: PCWSTR, reserved: UInt): Foundation.HMODULE {
    Win32DynamicFfi.invoke("kernel32.dll", "LoadPackagedLibrary", longArrayOf(lpwlibfilename, reserved.toLong()))
    return Foundation.HMODULE()
}

public fun LoadResource(hmodule: Foundation.HMODULE, hresinfo: Foundation.HRSRC): Foundation.HGLOBAL {
    Win32DynamicFfi.invoke("kernel32.dll", "LoadResource", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), Win32DynamicFfi.objectSlot(hresinfo)))
    return Foundation.HGLOBAL()
}

public fun LockResource(hresdata: Foundation.HGLOBAL): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "LockResource", longArrayOf(Win32DynamicFfi.objectSlot(hresdata)))
}

public fun QueryOptionalDelayLoadedAPI(hparentmodule: Foundation.HMODULE, lpdllname: PCSTR, lpprocname: PCSTR, reserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-libraryloader-l2-1-0.dll", "QueryOptionalDelayLoadedAPI", longArrayOf(Win32DynamicFfi.objectSlot(hparentmodule), lpdllname, lpprocname, reserved.toLong())).toInt()
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

public fun SizeofResource(hmodule: Foundation.HMODULE, hresinfo: Foundation.HRSRC): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SizeofResource", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), Win32DynamicFfi.objectSlot(hresinfo))).toUInt()
}

public fun UpdateResourceA(hupdate: Foundation.HANDLE, lptype: PCSTR, lpname: PCSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateResourceA", longArrayOf(Win32DynamicFfi.objectSlot(hupdate), lptype, lpname, wlanguage.toLong(), lpdata, cb.toLong())).toInt()
}

public fun UpdateResourceW(hupdate: Foundation.HANDLE, lptype: PCWSTR, lpname: PCWSTR, wlanguage: UShort, lpdata: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateResourceW", longArrayOf(Win32DynamicFfi.objectSlot(hupdate), lptype, lpname, wlanguage.toLong(), lpdata, cb.toLong())).toInt()
}
