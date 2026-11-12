@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32FoundationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeHandle(hobject: Handle): Bool =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationCloseHandle(hobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationCompareObjectHandles(hfirstobjecthandle.rawAddress.toString(), hsecondobjecthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: MutPtr<Handle>, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationDuplicateHandle(hsourceprocesshandle.rawAddress.toString(), hsourcehandle.rawAddress.toString(), htargetprocesshandle.rawAddress.toString(), lptargethandle.rawAddress.toString(), dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationFreeLibrary(hlibmodule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHandleInformation(hobject: Handle, lpdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationGetHandleInformation(hobject.rawAddress.toString(), lpdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastError(): Win32Error =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationGetLastError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFree(hmem: Hglobal): Hglobal =
    if (windowsWin32FoundationNapiAddon != null) MutPtr((windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationGlobalFree(hmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFree(hmem: Hlocal): Hlocal =
    if (windowsWin32FoundationNapiAddon != null) MutPtr((windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationLocalFree(hmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationRtlNtStatusToDosError(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSetHandleInformation(hobject.rawAddress.toString(), dwmask.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLastError(dwerrcode: Win32Error) {
    if (windowsWin32FoundationNapiAddon != null) {
        windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSetLastError(dwerrcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    if (windowsWin32FoundationNapiAddon != null) {
        windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysAddRefString(bstrstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    if (windowsWin32FoundationNapiAddon != null) ConstPtr((windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysAllocString(psz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    if (windowsWin32FoundationNapiAddon != null) ConstPtr((windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysAllocStringByteLen(psz.rawAddress.toString(), len.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    if (windowsWin32FoundationNapiAddon != null) ConstPtr((windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysAllocStringLen(strin.rawAddress.toString(), ui.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysFreeString(bstrstring: Bstr) {
    if (windowsWin32FoundationNapiAddon != null) {
        windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysFreeString(bstrstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysReAllocString(pbstr: MutPtr<Bstr>, psz: Pcwstr): Int =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysReAllocString(pbstr.rawAddress.toString(), psz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReAllocStringLen(pbstr: MutPtr<Bstr>, psz: Pcwstr, len: UInt): Int =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysReAllocStringLen(pbstr.rawAddress.toString(), psz.rawAddress.toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReleaseString(bstrstring: Bstr) {
    if (windowsWin32FoundationNapiAddon != null) {
        windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysReleaseString(bstrstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysStringByteLen(bstr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysStringLen(pbstr: Bstr): UInt =
    if (windowsWin32FoundationNapiAddon != null) (windowsWin32FoundationNapiAddon.windowssysWindowsWin32FoundationSysStringLen(pbstr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
