@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32FoundationNapiAddon(): Boolean

private val windowsWin32FoundationNapiAvailable: Boolean = initWindowsWin32FoundationNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32FoundationCloseHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationCompareObjectHandles(p0, p1)")
private external fun wasmWindowssysWindowsWin32FoundationCompareObjectHandles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationDuplicateHandle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32FoundationDuplicateHandle(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationFreeLibrary(p0)")
private external fun wasmWindowssysWindowsWin32FoundationFreeLibrary(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationGetHandleInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32FoundationGetHandleInformation(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationGetLastError()")
private external fun wasmWindowssysWindowsWin32FoundationGetLastError(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationGlobalFree(p0)")
private external fun wasmWindowssysWindowsWin32FoundationGlobalFree(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationLocalFree(p0)")
private external fun wasmWindowssysWindowsWin32FoundationLocalFree(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationRtlNtStatusToDosError(p0)")
private external fun wasmWindowssysWindowsWin32FoundationRtlNtStatusToDosError(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSetHandleInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32FoundationSetHandleInformation(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSetLastError(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSetLastError(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSetLastErrorEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32FoundationSetLastErrorEx(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysAddRefString(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSysAddRefString(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysAllocString(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSysAllocString(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysAllocStringByteLen(p0, p1)")
private external fun wasmWindowssysWindowsWin32FoundationSysAllocStringByteLen(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysAllocStringLen(p0, p1)")
private external fun wasmWindowssysWindowsWin32FoundationSysAllocStringLen(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysFreeString(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSysFreeString(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysReAllocString(p0, p1)")
private external fun wasmWindowssysWindowsWin32FoundationSysReAllocString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysReAllocStringLen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32FoundationSysReAllocStringLen(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysReleaseString(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSysReleaseString(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysStringByteLen(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSysStringByteLen(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32FoundationSysStringLen(p0)")
private external fun wasmWindowssysWindowsWin32FoundationSysStringLen(p0: String): Int

public actual fun closeHandle(hobject: Handle): Bool =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationCloseHandle(hobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationCompareObjectHandles(hfirstobjecthandle.rawAddress.toString(), hsecondobjecthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: MutPtr<Handle>, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationDuplicateHandle(hsourceprocesshandle.rawAddress.toString(), hsourcehandle.rawAddress.toString(), htargetprocesshandle.rawAddress.toString(), lptargethandle.rawAddress.toString(), dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationFreeLibrary(hlibmodule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHandleInformation(hobject: Handle, lpdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationGetHandleInformation(hobject.rawAddress.toString(), lpdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastError(): Win32Error =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationGetLastError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFree(hmem: Hglobal): Hglobal =
    if (windowsWin32FoundationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32FoundationGlobalFree(hmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFree(hmem: Hlocal): Hlocal =
    if (windowsWin32FoundationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32FoundationLocalFree(hmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationRtlNtStatusToDosError(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationSetHandleInformation(hobject.rawAddress.toString(), dwmask.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLastError(dwerrcode: Win32Error) {
    if (windowsWin32FoundationNapiAvailable) {
        wasmWindowssysWindowsWin32FoundationSetLastError(dwerrcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    if (windowsWin32FoundationNapiAvailable) {
        wasmWindowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationSysAddRefString(bstrstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    if (windowsWin32FoundationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32FoundationSysAllocString(psz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    if (windowsWin32FoundationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32FoundationSysAllocStringByteLen(psz.rawAddress.toString(), len.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    if (windowsWin32FoundationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32FoundationSysAllocStringLen(strin.rawAddress.toString(), ui.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysFreeString(bstrstring: Bstr) {
    if (windowsWin32FoundationNapiAvailable) {
        wasmWindowssysWindowsWin32FoundationSysFreeString(bstrstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysReAllocString(pbstr: MutPtr<Bstr>, psz: Pcwstr): Int =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationSysReAllocString(pbstr.rawAddress.toString(), psz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReAllocStringLen(pbstr: MutPtr<Bstr>, psz: Pcwstr, len: UInt): Int =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationSysReAllocStringLen(pbstr.rawAddress.toString(), psz.rawAddress.toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysReleaseString(bstrstring: Bstr) {
    if (windowsWin32FoundationNapiAvailable) {
        wasmWindowssysWindowsWin32FoundationSysReleaseString(bstrstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationSysStringByteLen(bstr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysStringLen(pbstr: Bstr): UInt =
    if (windowsWin32FoundationNapiAvailable) wasmWindowssysWindowsWin32FoundationSysStringLen(pbstr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
