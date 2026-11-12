@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderAddDllDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderFindResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderFindResourceExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderFindResourceExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderFindResourceW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderFreeResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadLibraryA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadLibraryW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadModule
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLoadResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderLockResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderSizeofResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderUpdateResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssysWindowsWin32SystemLibraryloaderUpdateResourceW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addDllDirectory(newdirectory: Pcwstr): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderAddDllDirectory(newdirectory.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(pfilename.rawAddress.toCPointer<ByteVar>(), bdeleteexistingresources)?.toLong() ?: 0L)

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(pfilename.rawAddress.toCPointer<ByteVar>(), bdeleteexistingresources)?.toLong() ?: 0L)

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(hlibmodule.rawAddress.toCPointer<ByteVar>())

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(hupdate.rawAddress.toCPointer<ByteVar>(), fdiscard)

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(hupdate.rawAddress.toCPointer<ByteVar>(), fdiscard)

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(hmodule.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(hmodule.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(hmodule.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(hmodule.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderFindResourceA(hmodule.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderFindResourceExA(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), wlanguage)?.toLong() ?: 0L)

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderFindResourceExW(hmodule.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), wlanguage)?.toLong() ?: 0L)

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderFindResourceW(hmodule.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(hlibmodule.rawAddress.toCPointer<ByteVar>(), dwexitcode)
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    windowssysWindowsWin32SystemLibraryloaderFreeResource(hresdata.rawAddress.toCPointer<ByteVar>())

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(nbufferlength, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(nbufferlength, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(hmodule.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(hmodule.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(lpmodulename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: MutPtr<Hmodule>): Bool =
    windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(dwflags, lpmodulename.rawAddress.toCPointer<ByteVar>(), phmodule.rawAddress.toCPointer<ByteVar>())

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: MutPtr<Hmodule>): Bool =
    windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(dwflags, lpmodulename.rawAddress.toCPointer<ByteVar>(), phmodule.rawAddress.toCPointer<ByteVar>())

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(lpmodulename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    null

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLoadLibraryA(lplibfilename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(lplibfilename.rawAddress.toCPointer<ByteVar>(), hfile.rawAddress.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L)

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(lplibfilename.rawAddress.toCPointer<ByteVar>(), hfile.rawAddress.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L)

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLoadLibraryW(lplibfilename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemLibraryloaderLoadModule(lpmodulename.rawAddress.toCPointer<ByteVar>(), lpparameterblock.rawAddress.toCPointer<ByteVar>())

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(lpwlibfilename.rawAddress.toCPointer<ByteVar>(), reserved)?.toLong() ?: 0L)

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLoadResource(hmodule.rawAddress.toCPointer<ByteVar>(), hresinfo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lockResource(hresdata: Hglobal): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32SystemLibraryloaderLockResource(hresdata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(hparentmodule.rawAddress.toCPointer<ByteVar>(), lpdllname.rawAddress.toCPointer<ByteVar>(), lpprocname.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun removeDllDirectory(cookie: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(cookie.rawAddress.toCPointer<ByteVar>())

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags)

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(lppathname.rawAddress.toCPointer<ByteVar>())

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(lppathname.rawAddress.toCPointer<ByteVar>())

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    windowssysWindowsWin32SystemLibraryloaderSizeofResource(hmodule.rawAddress.toCPointer<ByteVar>(), hresinfo.rawAddress.toCPointer<ByteVar>())

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    windowssysWindowsWin32SystemLibraryloaderUpdateResourceA(hupdate.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), wlanguage, lpdata.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    windowssysWindowsWin32SystemLibraryloaderUpdateResourceW(hupdate.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), wlanguage, lpdata.rawAddress.toCPointer<ByteVar>(), cb)
