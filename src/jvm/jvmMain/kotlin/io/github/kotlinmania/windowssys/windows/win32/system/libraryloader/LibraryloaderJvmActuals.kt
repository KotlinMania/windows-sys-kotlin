@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemLibraryloaderJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_addDllDirectory(newdirectory: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_beginUpdateResourceA(pfilename: Long, bdeleteexistingresources: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_beginUpdateResourceW(pfilename: Long, bdeleteexistingresources: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls(hlibmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_endUpdateResourceA(hupdate: Long, fdiscard: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_endUpdateResourceW(hupdate: Long, fdiscard: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceNamesA(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceNamesExA(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceNamesExW(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceNamesW(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceTypesA(hmodule: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceTypesExA(hmodule: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceTypesExW(hmodule: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_enumResourceTypesW(hmodule: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_findResourceA(hmodule: Long, lpname: Long, lptype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_findResourceExA(hmodule: Long, lptype: Long, lpname: Long, wlanguage: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_findResourceExW(hmodule: Long, lptype: Long, lpname: Long, wlanguage: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_findResourceW(hmodule: Long, lpname: Long, lptype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread(hlibmodule: Long, dwexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_freeResource(hresdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getDllDirectoryA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getDllDirectoryW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getModuleFileNameA(hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getModuleFileNameW(hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getModuleHandleA(lpmodulename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getModuleHandleExA(dwflags: Int, lpmodulename: Long, phmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getModuleHandleExW(dwflags: Int, lpmodulename: Long, phmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_getModuleHandleW(lpmodulename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadLibraryA(lplibfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadLibraryExA(lplibfilename: Long, hfile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadLibraryExW(lplibfilename: Long, hfile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadLibraryW(lplibfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadModule(lpmodulename: Long, lpparameterblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadPackagedLibrary(lpwlibfilename: Long, reserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_loadResource(hmodule: Long, hresinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_lockResource(hresdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI(hparentmodule: Long, lpdllname: Long, lpprocname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_removeDllDirectory(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(directoryflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_setDllDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_setDllDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_sizeofResource(hmodule: Long, hresinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_updateResourceA(hupdate: Long, lptype: Long, lpname: Long, wlanguage: Short, lpdata: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_libraryloader_updateResourceW(hupdate: Long, lptype: Long, lpname: Long, wlanguage: Short, lpdata: Long, cb: Int): Int
}

public actual fun addDllDirectory(newdirectory: Pcwstr): COpaquePointer? =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_addDllDirectory((newdirectory?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_beginUpdateResourceA((pfilename?.value ?: 0L), bdeleteexistingresources).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_beginUpdateResourceW((pfilename?.value ?: 0L), bdeleteexistingresources).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls((hlibmodule?.value ?: 0L))

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_endUpdateResourceA((hupdate?.value ?: 0L), fdiscard)

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_endUpdateResourceW((hupdate?.value ?: 0L), fdiscard)

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA((hmodule?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), 0L, lparam)

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA((hmodule?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW((hmodule?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW((hmodule?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), 0L, lparam)

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceNamesA((hmodule?.value ?: 0L), (lptype?.value ?: 0L), 0L, lparam)

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceNamesExA((hmodule?.value ?: 0L), (lptype?.value ?: 0L), 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceNamesExW((hmodule?.value ?: 0L), (lptype?.value ?: 0L), 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceNamesW((hmodule?.value ?: 0L), (lptype?.value ?: 0L), 0L, lparam)

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceTypesA((hmodule?.value ?: 0L), 0L, lparam)

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceTypesExA((hmodule?.value ?: 0L), 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceTypesExW((hmodule?.value ?: 0L), 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_enumResourceTypesW((hmodule?.value ?: 0L), 0L, lparam)

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_findResourceA((hmodule?.value ?: 0L), (lpname?.value ?: 0L), (lptype?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_findResourceExA((hmodule?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), wlanguage.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_findResourceExW((hmodule?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), wlanguage.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_findResourceW((hmodule?.value ?: 0L), (lpname?.value ?: 0L), (lptype?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread((hlibmodule?.value ?: 0L), dwexitcode.toInt())
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_freeResource((hresdata?.value ?: 0L))

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getDllDirectoryA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getDllDirectoryW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getModuleFileNameA((hmodule?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getModuleFileNameW((hmodule?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getModuleHandleA((lpmodulename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: COpaquePointer?): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getModuleHandleExA(dwflags.toInt(), (lpmodulename?.value ?: 0L), (phmodule?.value ?: 0L))

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: COpaquePointer?): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getModuleHandleExW(dwflags.toInt(), (lpmodulename?.value ?: 0L), (phmodule?.value ?: 0L))

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_getModuleHandleW((lpmodulename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    null

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadLibraryA((lplibfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadLibraryExA((lplibfilename?.value ?: 0L), (hfile?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadLibraryExW((lplibfilename?.value ?: 0L), (hfile?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadLibraryW((lplibfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: COpaquePointer?): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadModule((lpmodulename?.value ?: 0L), (lpparameterblock?.value ?: 0L)).toUInt()

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadPackagedLibrary((lpwlibfilename?.value ?: 0L), reserved.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_loadResource((hmodule?.value ?: 0L), (hresinfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lockResource(hresdata: Hglobal): COpaquePointer? =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_lockResource((hresdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI((hparentmodule?.value ?: 0L), (lpdllname?.value ?: 0L), (lpprocname?.value ?: 0L), reserved.toInt())

public actual fun removeDllDirectory(cookie: COpaquePointer?): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_removeDllDirectory((cookie?.value ?: 0L))

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(directoryflags.toInt())

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_setDllDirectoryA((lppathname?.value ?: 0L))

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_setDllDirectoryW((lppathname?.value ?: 0L))

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_sizeofResource((hmodule?.value ?: 0L), (hresinfo?.value ?: 0L)).toUInt()

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_updateResourceA((hupdate?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), wlanguage.toShort(), (lpdata?.value ?: 0L), cb.toInt())

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssys_windows_win32_system_libraryloader_updateResourceW((hupdate?.value ?: 0L), (lptype?.value ?: 0L), (lpname?.value ?: 0L), wlanguage.toShort(), (lpdata?.value ?: 0L), cb.toInt())
