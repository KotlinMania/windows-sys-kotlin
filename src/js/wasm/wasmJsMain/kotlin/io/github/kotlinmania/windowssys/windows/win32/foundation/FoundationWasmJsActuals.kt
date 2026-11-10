@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32FoundationNapiAddon(): Boolean

private val _windowsWin32FoundationNapiAvailable: Boolean = _initWindowsWin32FoundationNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_closeHandle(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_closeHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_compareObjectHandles(p0, p1)")
private external fun _wasm_windowssys_windows_win32_foundation_compareObjectHandles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_duplicateHandle(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_foundation_duplicateHandle(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_freeLibrary(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_freeLibrary(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_getHandleInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_foundation_getHandleInformation(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_getLastError()")
private external fun _wasm_windowssys_windows_win32_foundation_getLastError(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_globalFree(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_globalFree(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_localFree(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_localFree(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_rtlNtStatusToDosError(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_rtlNtStatusToDosError(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_setHandleInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_foundation_setHandleInformation(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_setLastError(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_setLastError(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_setLastErrorEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_foundation_setLastErrorEx(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysAddRefString(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_sysAddRefString(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysAllocString(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_sysAllocString(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysAllocStringByteLen(p0, p1)")
private external fun _wasm_windowssys_windows_win32_foundation_sysAllocStringByteLen(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysAllocStringLen(p0, p1)")
private external fun _wasm_windowssys_windows_win32_foundation_sysAllocStringLen(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysFreeString(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_sysFreeString(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysReAllocString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_foundation_sysReAllocString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysReAllocStringLen(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_foundation_sysReAllocStringLen(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysReleaseString(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_sysReleaseString(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysStringByteLen(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_sysStringByteLen(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_foundation_sysStringLen(p0)")
private external fun _wasm_windowssys_windows_win32_foundation_sysStringLen(p0: String): Int

public actual fun closeHandle(hobject: Handle): Bool =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_closeHandle((hobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_compareObjectHandles((hfirstobjecthandle?.value ?: 0L).toString(), (hsecondobjecthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: COpaquePointer?, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_duplicateHandle((hsourceprocesshandle?.value ?: 0L).toString(), (hsourcehandle?.value ?: 0L).toString(), (htargetprocesshandle?.value ?: 0L).toString(), (lptargethandle?.value ?: 0L).toString(), dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_freeLibrary((hlibmodule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHandleInformation(hobject: Handle, lpdwflags: COpaquePointer?): Bool =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_getHandleInformation((hobject?.value ?: 0L).toString(), (lpdwflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastError(): Win32Error =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_getLastError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFree(hmem: Hglobal): Hglobal =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_globalFree((hmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFree(hmem: Hlocal): Hlocal =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_localFree((hmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_rtlNtStatusToDosError(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_setHandleInformation((hobject?.value ?: 0L).toString(), dwmask.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLastError(dwerrcode: Win32Error) {
    if (_windowsWin32FoundationNapiAvailable) {
        _wasm_windowssys_windows_win32_foundation_setLastError(dwerrcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    if (_windowsWin32FoundationNapiAvailable) {
        _wasm_windowssys_windows_win32_foundation_setLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysAddRefString((bstrstring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysAllocString((psz?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysAllocStringByteLen((psz?.value ?: 0L).toString(), len.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysAllocStringLen((strin?.value ?: 0L).toString(), ui.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysFreeString(bstrstring: Bstr) {
    if (_windowsWin32FoundationNapiAvailable) {
        _wasm_windowssys_windows_win32_foundation_sysFreeString((bstrstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysReAllocString(pbstr: COpaquePointer?, psz: Pcwstr): Int =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysReAllocString((pbstr?.value ?: 0L).toString(), (psz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReAllocStringLen(pbstr: COpaquePointer?, psz: Pcwstr, len: UInt): Int =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysReAllocStringLen((pbstr?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReleaseString(bstrstring: Bstr) {
    if (_windowsWin32FoundationNapiAvailable) {
        _wasm_windowssys_windows_win32_foundation_sysReleaseString((bstrstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysStringByteLen((bstr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysStringLen(pbstr: Bstr): UInt =
    if (_windowsWin32FoundationNapiAvailable) _wasm_windowssys_windows_win32_foundation_sysStringLen((pbstr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
