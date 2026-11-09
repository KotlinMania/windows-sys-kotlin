@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32StorageOperationrecorderNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun OperationEnd(operationendparams: Long): BOOL =
    if (_windowsWin32StorageOperationrecorderNapiAddon != null) (_windowsWin32StorageOperationrecorderNapiAddon.windowssys_windows_win32_storage_operationrecorder_OperationEnd(operationendparams.toString()) as Int) else 0

public actual fun OperationStart(operationstartparams: Long): BOOL =
    if (_windowsWin32StorageOperationrecorderNapiAddon != null) (_windowsWin32StorageOperationrecorderNapiAddon.windowssys_windows_win32_storage_operationrecorder_OperationStart(operationstartparams.toString()) as Int) else 0
