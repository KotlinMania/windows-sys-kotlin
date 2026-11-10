@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.COpaquePointer
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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addDllDirectory(newdirectory: Pcwstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_addDllDirectory(newdirectory?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_beginUpdateResourceA(pfilename?.value?.toCPointer<ByteVar>(), bdeleteexistingresources)?.let { COpaquePointer(it.toLong()) }

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_beginUpdateResourceW(pfilename?.value?.toCPointer<ByteVar>(), bdeleteexistingresources)?.let { COpaquePointer(it.toLong()) }

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls(hlibmodule?.value?.toCPointer<ByteVar>())

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_endUpdateResourceA(hupdate?.value?.toCPointer<ByteVar>(), fdiscard)

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_endUpdateResourceW(hupdate?.value?.toCPointer<ByteVar>(), fdiscard)

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesExA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesExW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesA(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesExA(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesExW(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesW(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceA(hmodule?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceExA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage)?.let { COpaquePointer(it.toLong()) }

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceExW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage)?.let { COpaquePointer(it.toLong()) }

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceW(hmodule?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread(hlibmodule?.value?.toCPointer<ByteVar>(), dwexitcode)
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_freeResource(hresdata?.value?.toCPointer<ByteVar>())

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getDllDirectoryA(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getDllDirectoryW(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleFileNameA(hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleFileNameW(hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleA(lpmodulename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleExA(dwflags, lpmodulename?.value?.toCPointer<ByteVar>(), phmodule?.value?.toCPointer<ByteVar>())

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleExW(dwflags, lpmodulename?.value?.toCPointer<ByteVar>(), phmodule?.value?.toCPointer<ByteVar>())

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleW(lpmodulename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    null

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryA(lplibfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryExA(lplibfilename?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryExW(lplibfilename?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryW(lplibfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadModule(lpmodulename?.value?.toCPointer<ByteVar>(), lpparameterblock?.value?.toCPointer<ByteVar>())

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadPackagedLibrary(lpwlibfilename?.value?.toCPointer<ByteVar>(), reserved)?.let { COpaquePointer(it.toLong()) }

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadResource(hmodule?.value?.toCPointer<ByteVar>(), hresinfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lockResource(hresdata: Hglobal): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_lockResource(hresdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI(hparentmodule?.value?.toCPointer<ByteVar>(), lpdllname?.value?.toCPointer<ByteVar>(), lpprocname?.value?.toCPointer<ByteVar>(), reserved)

public actual fun removeDllDirectory(cookie: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_removeDllDirectory(cookie?.value?.toCPointer<ByteVar>())

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(directoryflags)

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_setDllDirectoryA(lppathname?.value?.toCPointer<ByteVar>())

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_setDllDirectoryW(lppathname?.value?.toCPointer<ByteVar>())

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_sizeofResource(hmodule?.value?.toCPointer<ByteVar>(), hresinfo?.value?.toCPointer<ByteVar>())

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_updateResourceA(hupdate?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage, lpdata?.value?.toCPointer<ByteVar>(), cb)

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_updateResourceW(hupdate?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage, lpdata?.value?.toCPointer<ByteVar>(), cb)
