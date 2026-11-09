@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32FoundationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CloseHandle(hobject: HANDLE): BOOL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_CloseHandle(hobject.toString()) as Int) else 0

public actual fun CompareObjectHandles(hfirstobjecthandle: HANDLE, hsecondobjecthandle: HANDLE): BOOL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_CompareObjectHandles(hfirstobjecthandle.toString(), hsecondobjecthandle.toString()) as Int) else 0

public actual fun DuplicateHandle(hsourceprocesshandle: HANDLE, hsourcehandle: HANDLE, htargetprocesshandle: HANDLE, lptargethandle: Long, dwdesiredaccess: UInt, binherithandle: BOOL, dwoptions: DUPLICATE_HANDLE_OPTIONS): BOOL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_DuplicateHandle(hsourceprocesshandle.toString(), hsourcehandle.toString(), htargetprocesshandle.toString(), lptargethandle.toString(), dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt()) as Int) else 0

public actual fun FreeLibrary(hlibmodule: HMODULE): BOOL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_FreeLibrary(hlibmodule.toString()) as Int) else 0

public actual fun GetHandleInformation(hobject: HANDLE, lpdwflags: Long): BOOL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_GetHandleInformation(hobject.toString(), lpdwflags.toString()) as Int) else 0

public actual fun GetLastError(): WIN32_ERROR =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_GetLastError() as Int).toUInt() else 0u

public actual fun GlobalFree(hmem: HGLOBAL): HGLOBAL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_GlobalFree(hmem.toString()) as String).toLong() else 0L

public actual fun LocalFree(hmem: HLOCAL): HLOCAL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_LocalFree(hmem.toString()) as String).toLong() else 0L

public actual fun RtlNtStatusToDosError(status: NTSTATUS): UInt =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_RtlNtStatusToDosError(status) as Int).toUInt() else 0u

public actual fun SetHandleInformation(hobject: HANDLE, dwmask: UInt, dwflags: HANDLE_FLAGS): BOOL =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SetHandleInformation(hobject.toString(), dwmask.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SetLastError(dwerrcode: WIN32_ERROR) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SetLastError(dwerrcode.toInt())
    }
}

public actual fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
    }
}

public actual fun SysAddRefString(bstrstring: BSTR): HRESULT =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysAddRefString(bstrstring.toString()) as Int) else 0

public actual fun SysAllocString(psz: PCWSTR): BSTR =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysAllocString(psz.toString()) as String).toLong() else 0L

public actual fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysAllocStringByteLen(psz.toString(), len.toInt()) as String).toLong() else 0L

public actual fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysAllocStringLen(strin.toString(), ui.toInt()) as String).toLong() else 0L

public actual fun SysFreeString(bstrstring: BSTR) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysFreeString(bstrstring.toString())
    }
}

public actual fun SysReAllocString(pbstr: Long, psz: PCWSTR): Int =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysReAllocString(pbstr.toString(), psz.toString()) as Int) else 0

public actual fun SysReAllocStringLen(pbstr: Long, psz: PCWSTR, len: UInt): Int =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysReAllocStringLen(pbstr.toString(), psz.toString(), len.toInt()) as Int) else 0

public actual fun SysReleaseString(bstrstring: BSTR) {
    if (_windowsWin32FoundationNapiAddon != null) {
        _windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysReleaseString(bstrstring.toString())
    }
}

public actual fun SysStringByteLen(bstr: BSTR): UInt =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysStringByteLen(bstr.toString()) as Int).toUInt() else 0u

public actual fun SysStringLen(pbstr: BSTR): UInt =
    if (_windowsWin32FoundationNapiAddon != null) (_windowsWin32FoundationNapiAddon.windowssys_windows_win32_foundation_SysStringLen(pbstr.toString()) as Int).toUInt() else 0u
