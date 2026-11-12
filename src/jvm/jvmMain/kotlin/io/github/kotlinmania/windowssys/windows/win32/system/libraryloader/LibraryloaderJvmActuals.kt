@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemLibraryloaderJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemLibraryloaderJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderAddDllDirectory(newdirectory: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(pfilename: Long, bdeleteexistingresources: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(pfilename: Long, bdeleteexistingresources: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(hlibmodule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(hupdate: Long, fdiscard: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(hupdate: Long, fdiscard: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(hmodule: Long, lptype: Long, lpname: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(hmodule: Long, lptype: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(hmodule: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(hmodule: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(hmodule: Long, lpenumfunc: Long, lparam: Long, dwflags: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(hmodule: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderFindResourceA(hmodule: Long, lpname: Long, lptype: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderFindResourceExA(hmodule: Long, lptype: Long, lpname: Long, wlanguage: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderFindResourceExW(hmodule: Long, lptype: Long, lpname: Long, wlanguage: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderFindResourceW(hmodule: Long, lpname: Long, lptype: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(hlibmodule: Long, dwexitcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderFreeResource(hresdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(lpmodulename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(dwflags: Int, lpmodulename: Long, phmodule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(dwflags: Int, lpmodulename: Long, phmodule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(lpmodulename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadLibraryA(lplibfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(lplibfilename: Long, hfile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(lplibfilename: Long, hfile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadLibraryW(lplibfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadModule(lpmodulename: Long, lpparameterblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(lpwlibfilename: Long, reserved: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLoadResource(hmodule: Long, hresinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderLockResource(hresdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(hparentmodule: Long, lpdllname: Long, lpprocname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderSizeofResource(hmodule: Long, hresinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderUpdateResourceA(hupdate: Long, lptype: Long, lpname: Long, wlanguage: Short, lpdata: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemLibraryloaderUpdateResourceW(hupdate: Long, lptype: Long, lpname: Long, wlanguage: Short, lpdata: Long, cb: Int): Int
}

public actual fun addDllDirectory(newdirectory: Pcwstr): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderAddDllDirectory(newdirectory.rawAddress))

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(pfilename.rawAddress, bdeleteexistingresources))

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(pfilename.rawAddress, bdeleteexistingresources))

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(hlibmodule.rawAddress)

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(hupdate.rawAddress, fdiscard)

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(hupdate.rawAddress, fdiscard)

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(hmodule.rawAddress, lptype.rawAddress, lpname.rawAddress, 0L, lparam)

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(hmodule.rawAddress, lptype.rawAddress, lpname.rawAddress, 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(hmodule.rawAddress, lptype.rawAddress, lpname.rawAddress, 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(hmodule.rawAddress, lptype.rawAddress, lpname.rawAddress, 0L, lparam)

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(hmodule.rawAddress, lptype.rawAddress, 0L, lparam)

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(hmodule.rawAddress, lptype.rawAddress, 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(hmodule.rawAddress, lptype.rawAddress, 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(hmodule.rawAddress, lptype.rawAddress, 0L, lparam)

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(hmodule.rawAddress, 0L, lparam)

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(hmodule.rawAddress, 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(hmodule.rawAddress, 0L, lparam, dwflags.toInt(), langid.toShort())

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(hmodule.rawAddress, 0L, lparam)

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderFindResourceA(hmodule.rawAddress, lpname.rawAddress, lptype.rawAddress))

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderFindResourceExA(hmodule.rawAddress, lptype.rawAddress, lpname.rawAddress, wlanguage.toShort()))

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderFindResourceExW(hmodule.rawAddress, lptype.rawAddress, lpname.rawAddress, wlanguage.toShort()))

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderFindResourceW(hmodule.rawAddress, lpname.rawAddress, lptype.rawAddress))

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing {
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(hlibmodule.rawAddress, dwexitcode.toInt())
    error("Unreachable noreturn C function freeLibraryAndExitThread")
}

public actual fun freeResource(hresdata: Hglobal): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderFreeResource(hresdata.rawAddress)

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(hmodule.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(hmodule.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(lpmodulename.rawAddress))

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: MutPtr<Hmodule>): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(dwflags.toInt(), lpmodulename.rawAddress, phmodule.rawAddress)

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: MutPtr<Hmodule>): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(dwflags.toInt(), lpmodulename.rawAddress, phmodule.rawAddress)

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(lpmodulename.rawAddress))

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    null

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadLibraryA(lplibfilename.rawAddress))

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(lplibfilename.rawAddress, hfile.rawAddress, dwflags.toInt()))

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(lplibfilename.rawAddress, hfile.rawAddress, dwflags.toInt()))

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadLibraryW(lplibfilename.rawAddress))

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadModule(lpmodulename.rawAddress, lpparameterblock.rawAddress).toUInt()

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(lpwlibfilename.rawAddress, reserved.toInt()))

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLoadResource(hmodule.rawAddress, hresinfo.rawAddress))

public actual fun lockResource(hresdata: Hglobal): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderLockResource(hresdata.rawAddress))

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(hparentmodule.rawAddress, lpdllname.rawAddress, lpprocname.rawAddress, reserved.toInt())

public actual fun removeDllDirectory(cookie: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(cookie.rawAddress)

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags.toInt())

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(lppathname.rawAddress)

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(lppathname.rawAddress)

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderSizeofResource(hmodule.rawAddress, hresinfo.rawAddress).toUInt()

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderUpdateResourceA(hupdate.rawAddress, lptype.rawAddress, lpname.rawAddress, wlanguage.toShort(), lpdata.rawAddress, cb.toInt())

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    WindowsWin32SystemLibraryloaderJniBridge.windowssysWindowsWin32SystemLibraryloaderUpdateResourceW(hupdate.rawAddress, lptype.rawAddress, lpname.rawAddress, wlanguage.toShort(), lpdata.rawAddress, cb.toInt())
