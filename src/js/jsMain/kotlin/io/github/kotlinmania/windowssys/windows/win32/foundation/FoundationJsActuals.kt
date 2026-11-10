@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32FoundationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeHandle(hobject: Handle): Bool =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_closeHandle((hobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_compareObjectHandles((hfirstobjecthandle?.value ?: 0L).toString(), (hsecondobjecthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: COpaquePointer?, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_duplicateHandle((hsourceprocesshandle?.value ?: 0L).toString(), (hsourcehandle?.value ?: 0L).toString(), (htargetprocesshandle?.value ?: 0L).toString(), (lptargethandle?.value ?: 0L).toString(), dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_freeLibrary((hlibmodule?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHandleInformation(hobject: Handle, lpdwflags: COpaquePointer?): Bool =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_getHandleInformation((hobject?.value ?: 0L).toString(), (lpdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastError(): Win32Error =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_getLastError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFree(hmem: Hglobal): Hglobal =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_globalFree((hmem?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFree(hmem: Hlocal): Hlocal =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_localFree((hmem?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_rtlNtStatusToDosError(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_setHandleInformation((hobject?.value ?: 0L).toString(), dwmask.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLastError(dwerrcode: Win32Error) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_setLastError(dwerrcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_setLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysAddRefString((bstrstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysAllocString((psz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysAllocStringByteLen((psz?.value ?: 0L).toString(), len.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysAllocStringLen((strin?.value ?: 0L).toString(), ui.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysFreeString(bstrstring: Bstr) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysFreeString((bstrstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysReAllocString(pbstr: COpaquePointer?, psz: Pcwstr): Int =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysReAllocString((pbstr?.value ?: 0L).toString(), (psz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReAllocStringLen(pbstr: COpaquePointer?, psz: Pcwstr, len: UInt): Int =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysReAllocStringLen((pbstr?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReleaseString(bstrstring: Bstr) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysReleaseString((bstrstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysStringByteLen((bstr?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysStringLen(pbstr: Bstr): UInt =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_sysStringLen((pbstr?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
