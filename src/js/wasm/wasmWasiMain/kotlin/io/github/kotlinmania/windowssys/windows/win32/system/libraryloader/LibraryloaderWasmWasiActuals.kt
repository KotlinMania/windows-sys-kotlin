@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addDllDirectory(newdirectory: Pcwstr): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderAddDllDirectory")

public actual fun beginUpdateResourceA(pfilename: Pcstr, bdeleteexistingresources: Bool): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA")

public actual fun beginUpdateResourceW(pfilename: Pcwstr, bdeleteexistingresources: Bool): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW")

public actual fun disableThreadLibraryCalls(hlibmodule: Hmodule): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls")

public actual fun endUpdateResourceA(hupdate: Handle, fdiscard: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA")

public actual fun endUpdateResourceW(hupdate: Handle, fdiscard: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW")

public actual fun enumResourceLanguagesA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA")

public actual fun enumResourceLanguagesExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, lpenumfunc: Enumreslangproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA")

public actual fun enumResourceLanguagesExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW")

public actual fun enumResourceLanguagesW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, lpenumfunc: Enumreslangprocw, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW")

public actual fun enumResourceNamesA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA")

public actual fun enumResourceNamesExA(hmodule: Hmodule, lptype: Pcstr, lpenumfunc: Enumresnameproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA")

public actual fun enumResourceNamesExW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW")

public actual fun enumResourceNamesW(hmodule: Hmodule, lptype: Pcwstr, lpenumfunc: Enumresnameprocw, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW")

public actual fun enumResourceTypesA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA")

public actual fun enumResourceTypesExA(hmodule: Hmodule, lpenumfunc: Enumrestypeproca, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA")

public actual fun enumResourceTypesExW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long, dwflags: UInt, langid: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW")

public actual fun enumResourceTypesW(hmodule: Hmodule, lpenumfunc: Enumrestypeprocw, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW")

public actual fun findResourceA(hmodule: Hmodule, lpname: Pcstr, lptype: Pcstr): Hrsrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderFindResourceA")

public actual fun findResourceExA(hmodule: Hmodule, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort): Hrsrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderFindResourceExA")

public actual fun findResourceExW(hmodule: Hmodule, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort): Hrsrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderFindResourceExW")

public actual fun findResourceW(hmodule: Hmodule, lpname: Pcwstr, lptype: Pcwstr): Hrsrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderFindResourceW")

public actual fun freeLibraryAndExitThread(hlibmodule: Hmodule, dwexitcode: UInt): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread")

public actual fun freeResource(hresdata: Hglobal): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderFreeResource")

public actual fun getDllDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA")

public actual fun getDllDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW")

public actual fun getModuleFileNameA(hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA")

public actual fun getModuleFileNameW(hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW")

public actual fun getModuleHandleA(lpmodulename: Pcstr): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA")

public actual fun getModuleHandleExA(dwflags: UInt, lpmodulename: Pcstr, phmodule: MutPtr<Hmodule>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA")

public actual fun getModuleHandleExW(dwflags: UInt, lpmodulename: Pcwstr, phmodule: MutPtr<Hmodule>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW")

public actual fun getModuleHandleW(lpmodulename: Pcwstr): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW")

public actual fun getProcAddress(hmodule: Hmodule, lpprocname: Pcstr): Farproc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderGetProcAddress")

public actual fun loadLibraryA(lplibfilename: Pcstr): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadLibraryA")

public actual fun loadLibraryExA(lplibfilename: Pcstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA")

public actual fun loadLibraryExW(lplibfilename: Pcwstr, hfile: Handle, dwflags: LoadLibraryFlags): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW")

public actual fun loadLibraryW(lplibfilename: Pcwstr): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadLibraryW")

public actual fun loadModule(lpmodulename: Pcstr, lpparameterblock: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadModule")

public actual fun loadPackagedLibrary(lpwlibfilename: Pcwstr, reserved: UInt): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary")

public actual fun loadResource(hmodule: Hmodule, hresinfo: Hrsrc): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLoadResource")

public actual fun lockResource(hresdata: Hglobal): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderLockResource")

public actual fun queryOptionalDelayLoadedAPI(hparentmodule: Hmodule, lpdllname: Pcstr, lpprocname: Pcstr, reserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI")

public actual fun removeDllDirectory(cookie: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories")
private external fun wasiWindowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags: Int): Int

public actual fun setDefaultDllDirectories(directoryflags: LoadLibraryFlags): Bool =
    wasiWindowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(directoryflags.toInt())

public actual fun setDllDirectoryA(lppathname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA")

public actual fun setDllDirectoryW(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW")

public actual fun sizeofResource(hmodule: Hmodule, hresinfo: Hrsrc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderSizeofResource")

public actual fun updateResourceA(hupdate: Handle, lptype: Pcstr, lpname: Pcstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderUpdateResourceA")

public actual fun updateResourceW(hupdate: Handle, lptype: Pcwstr, lpname: Pcwstr, wlanguage: UShort, lpdata: ConstPtr<CVoid>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemLibraryloaderUpdateResourceW")
