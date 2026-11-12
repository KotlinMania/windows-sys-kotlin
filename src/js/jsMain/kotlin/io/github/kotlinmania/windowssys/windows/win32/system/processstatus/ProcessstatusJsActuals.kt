@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

private val windowsWin32SystemProcessstatusNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(lpimagebase.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEnumPageFilesA(0L.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEnumPageFilesW(0L.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEnumProcessModules(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: EnumProcessModulesExFlags): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString(), dwfilterflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusEnumProcesses(lpidprocess.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(imagebase.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetModuleInformation(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpmodinfo.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(pperformanceinformation.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(process.rawAddress.toString(), ppsmemcounters.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetWsChanges(hprocess.rawAddress.toString(), lpwatchinfo.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusGetWsChangesEx(hprocess.rawAddress.toString(), lpwatchinfoex.rawAddress.toString(), cb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(lpimagebase.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(0L.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(0L.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(hprocess.rawAddress.toString(), lphmodule.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString(), dwfilterflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32EnumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32EnumProcesses(lpidprocess.rawAddress.toString(), cb.toInt(), lpcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(imagebase.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(imagebase.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(hprocess.rawAddress.toString(), lpv.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpbasename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpfilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(hprocess.rawAddress.toString(), hmodule.rawAddress.toString(), lpmodinfo.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(pperformanceinformation.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(hprocess.rawAddress.toString(), lpimagefilename.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(process.rawAddress.toString(), ppsmemcounters.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetWsChanges(hprocess.rawAddress.toString(), lpwatchinfo.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(hprocess.rawAddress.toString(), lpwatchinfoex.rawAddress.toString(), cb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusQueryWorkingSet(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    if (windowsWin32SystemProcessstatusNapiAddon != null) (windowsWin32SystemProcessstatusNapiAddon.windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(hprocess.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
