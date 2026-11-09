@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32StorageIndexserverNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): HRESULT =
    if (_windowsWin32StorageIndexserverNapiAddon != null) (_windowsWin32StorageIndexserverNapiAddon.windowssys_windows_win32_storage_indexserver_BindIFilterFromStorage(pstg.toString(), punkouter.toString(), ppiunk.toString()) as Int) else 0

public actual fun BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): HRESULT =
    if (_windowsWin32StorageIndexserverNapiAddon != null) (_windowsWin32StorageIndexserverNapiAddon.windowssys_windows_win32_storage_indexserver_BindIFilterFromStream(pstm.toString(), punkouter.toString(), ppiunk.toString()) as Int) else 0

public actual fun LoadIFilter(pwcspath: PCWSTR, punkouter: Long, ppiunk: Long): HRESULT =
    if (_windowsWin32StorageIndexserverNapiAddon != null) (_windowsWin32StorageIndexserverNapiAddon.windowssys_windows_win32_storage_indexserver_LoadIFilter(pwcspath.toString(), punkouter.toString(), ppiunk.toString()) as Int) else 0

public actual fun LoadIFilterEx(pwcspath: PCWSTR, dwflags: UInt, riid: Long, ppiunk: Long): HRESULT =
    if (_windowsWin32StorageIndexserverNapiAddon != null) (_windowsWin32StorageIndexserverNapiAddon.windowssys_windows_win32_storage_indexserver_LoadIFilterEx(pwcspath.toString(), dwflags.toInt(), riid.toString(), ppiunk.toString()) as Int) else 0
