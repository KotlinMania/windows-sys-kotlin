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
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_addDllDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_beginUpdateResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_beginUpdateResourceW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_endUpdateResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_endUpdateResourceW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceNamesW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_enumResourceTypesW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_findResourceW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_freeResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getDllDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getDllDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_getModuleHandleW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryExA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryExW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadLibraryW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadModule
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadPackagedLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_loadResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_lockResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_removeDllDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_setDllDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_setDllDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_sizeofResource
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_updateResourceA
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.cinterop.windowssys_windows_win32_system_libraryloader_updateResourceW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addDllDirectory(newdirectory: Pcwstr): COpaquePointer? =
    windowssys_windows_win32_system_libraryloader_addDllDirectory(newdirectory?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    windowssys_windows_win32_system_libraryloader_beginUpdateResourceA(pfilename?.value?.toCPointer<ByteVar>(), bdeleteexistingresources)?.let { COpaquePointer(it.toLong()) }

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    windowssys_windows_win32_system_libraryloader_beginUpdateResourceW(pfilename?.value?.toCPointer<ByteVar>(), bdeleteexistingresources)?.let { COpaquePointer(it.toLong()) }

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls(hlibmodule?.value?.toCPointer<ByteVar>())

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    windowssys_windows_win32_system_libraryloader_endUpdateResourceA(hupdate?.value?.toCPointer<ByteVar>(), fdiscard)

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    windowssys_windows_win32_system_libraryloader_endUpdateResourceW(hupdate?.value?.toCPointer<ByteVar>(), fdiscard)

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceNamesA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceNamesExA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceNamesExW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceNamesW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceTypesA(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceTypesExA(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceTypesExW(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags, langid)

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    windowssys_windows_win32_system_libraryloader_enumResourceTypesW(hmodule?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    windowssys_windows_win32_system_libraryloader_findResourceA(hmodule?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    windowssys_windows_win32_system_libraryloader_findResourceExA(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage)?.let { COpaquePointer(it.toLong()) }

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    windowssys_windows_win32_system_libraryloader_findResourceExW(hmodule?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage)?.let { COpaquePointer(it.toLong()) }

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    windowssys_windows_win32_system_libraryloader_findResourceW(hmodule?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread(hlibmodule?.value?.toCPointer<ByteVar>(), dwexitcode)
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    windowssys_windows_win32_system_libraryloader_freeResource(hresdata?.value?.toCPointer<ByteVar>())

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    windowssys_windows_win32_system_libraryloader_getDllDirectoryA(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    windowssys_windows_win32_system_libraryloader_getDllDirectoryW(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    windowssys_windows_win32_system_libraryloader_getModuleFileNameA(hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssys_windows_win32_system_libraryloader_getModuleFileNameW(hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    windowssys_windows_win32_system_libraryloader_getModuleHandleA(lpmodulename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: COpaquePointer?): Bool =
    windowssys_windows_win32_system_libraryloader_getModuleHandleExA(dwflags, lpmodulename?.value?.toCPointer<ByteVar>(), phmodule?.value?.toCPointer<ByteVar>())

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: COpaquePointer?): Bool =
    windowssys_windows_win32_system_libraryloader_getModuleHandleExW(dwflags, lpmodulename?.value?.toCPointer<ByteVar>(), phmodule?.value?.toCPointer<ByteVar>())

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    windowssys_windows_win32_system_libraryloader_getModuleHandleW(lpmodulename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    null

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    windowssys_windows_win32_system_libraryloader_loadLibraryA(lplibfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    windowssys_windows_win32_system_libraryloader_loadLibraryExA(lplibfilename?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    windowssys_windows_win32_system_libraryloader_loadLibraryExW(lplibfilename?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    windowssys_windows_win32_system_libraryloader_loadLibraryW(lplibfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: COpaquePointer?): UInt =
    windowssys_windows_win32_system_libraryloader_loadModule(lpmodulename?.value?.toCPointer<ByteVar>(), lpparameterblock?.value?.toCPointer<ByteVar>())

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    windowssys_windows_win32_system_libraryloader_loadPackagedLibrary(lpwlibfilename?.value?.toCPointer<ByteVar>(), reserved)?.let { COpaquePointer(it.toLong()) }

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    windowssys_windows_win32_system_libraryloader_loadResource(hmodule?.value?.toCPointer<ByteVar>(), hresinfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lockResource(hresdata: Hglobal): COpaquePointer? =
    windowssys_windows_win32_system_libraryloader_lockResource(hresdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI(hparentmodule?.value?.toCPointer<ByteVar>(), lpdllname?.value?.toCPointer<ByteVar>(), lpprocname?.value?.toCPointer<ByteVar>(), reserved)

public actual fun removeDllDirectory(cookie: COpaquePointer?): Bool =
    windowssys_windows_win32_system_libraryloader_removeDllDirectory(cookie?.value?.toCPointer<ByteVar>())

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(directoryflags)

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    windowssys_windows_win32_system_libraryloader_setDllDirectoryA(lppathname?.value?.toCPointer<ByteVar>())

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    windowssys_windows_win32_system_libraryloader_setDllDirectoryW(lppathname?.value?.toCPointer<ByteVar>())

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    windowssys_windows_win32_system_libraryloader_sizeofResource(hmodule?.value?.toCPointer<ByteVar>(), hresinfo?.value?.toCPointer<ByteVar>())

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    windowssys_windows_win32_system_libraryloader_updateResourceA(hupdate?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage, lpdata?.value?.toCPointer<ByteVar>(), cb)

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    windowssys_windows_win32_system_libraryloader_updateResourceW(hupdate?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), wlanguage, lpdata?.value?.toCPointer<ByteVar>(), cb)
