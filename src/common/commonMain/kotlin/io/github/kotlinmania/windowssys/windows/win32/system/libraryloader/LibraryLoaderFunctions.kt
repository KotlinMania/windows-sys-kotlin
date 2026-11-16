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

public expect fun addDllDirectory(newdirectory: Pcwstr): MutPtr

public expect fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle

public expect fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle

public expect fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool

public expect fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool

public expect fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool

public expect fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool

public expect fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool

public expect fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool

public expect fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool

public expect fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool

public expect fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool

public expect fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool

public expect fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool

public expect fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool

public expect fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool

public expect fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool

public expect fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool

public expect fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc

public expect fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc

public expect fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc

public expect fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc

public expect fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing

public expect fun freeResource(hresdata: Hglobal): Bool

public expect fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt

public expect fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun getModuleHandleA(lpmodulename: Pcstr): Hmodule

public expect fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: MutPtr): Bool

public expect fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: MutPtr): Bool

public expect fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule

public expect fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc

public expect fun loadLibraryA(lplibfilename: Pcstr): Hmodule

public expect fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule

public expect fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule

public expect fun loadLibraryW(lplibfilename: Pcwstr): Hmodule

public expect fun loadModule(lpmodulename: Pcstr, lpparameterblock: ConstPtr): UInt

public expect fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule

public expect fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal

public expect fun lockResource(hresdata: Hglobal): MutPtr

public expect fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool

public expect fun removeDllDirectory(cookie: ConstPtr): Bool

public expect fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool

public expect fun setDllDirectoryA(lppathname: Pcstr): Bool

public expect fun setDllDirectoryW(lppathname: Pcwstr): Bool

public expect fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt

public expect fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: ConstPtr, cb: UInt): Bool

public expect fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: ConstPtr, cb: UInt): Bool
