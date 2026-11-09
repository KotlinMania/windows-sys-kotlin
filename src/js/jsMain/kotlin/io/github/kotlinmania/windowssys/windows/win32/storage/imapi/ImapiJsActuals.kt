@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEBUFFER
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEMORE
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPFREEBUFFER

private val _windowsWin32StorageImapiNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CloseIMsgSession(lpmsgsess: LPMSGSESS) {
    if (_windowsWin32StorageImapiNapiAddon != null) {
        _windowsWin32StorageImapiNapiAddon.windowssys_windows_win32_storage_imapi_CloseIMsgSession(lpmsgsess.toString())
    }
}

public actual fun GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): HRESULT =
    if (_windowsWin32StorageImapiNapiAddon != null) (_windowsWin32StorageImapiNapiAddon.windowssys_windows_win32_storage_imapi_GetAttribIMsgOnIStg(lpobject.toString(), lpproptagarray.toString(), lpppropattrarray.toString()) as Int) else 0

public actual fun MapStorageSCode(stgscode: Int): Int =
    if (_windowsWin32StorageImapiNapiAddon != null) (_windowsWin32StorageImapiNapiAddon.windowssys_windows_win32_storage_imapi_MapStorageSCode(stgscode) as Int) else 0

public actual fun OpenIMsgOnIStg(lpmsgsess: LPMSGSESS, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, lpmapisup: Long, lpstg: Long, lpfmsgcallrelease: Long, ulcallerdata: UInt, ulflags: UInt, lppmsg: Long): Int =
    0

public actual fun OpenIMsgSession(lpmalloc: Long, ulflags: UInt, lppmsgsess: Long): Int =
    if (_windowsWin32StorageImapiNapiAddon != null) (_windowsWin32StorageImapiNapiAddon.windowssys_windows_win32_storage_imapi_OpenIMsgSession(lpmalloc.toString(), ulflags.toInt(), lppmsgsess.toString()) as Int) else 0

public actual fun SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): HRESULT =
    if (_windowsWin32StorageImapiNapiAddon != null) (_windowsWin32StorageImapiNapiAddon.windowssys_windows_win32_storage_imapi_SetAttribIMsgOnIStg(lpobject.toString(), lpproptags.toString(), lppropattrs.toString(), lpppropproblems.toString()) as Int) else 0
