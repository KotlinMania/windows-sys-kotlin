@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32DevicesSerialcommunicationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ComDBClaimNextFreePort(hcomdb: HCOMDB, comnumber: Long): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBClaimNextFreePort(hcomdb.toString(), comnumber.toString()) as Int) else 0

public actual fun ComDBClaimPort(hcomdb: HCOMDB, comnumber: UInt, forceclaim: BOOL, forced: Long): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBClaimPort(hcomdb.toString(), comnumber.toInt(), forceclaim, forced.toString()) as Int) else 0

public actual fun ComDBClose(hcomdb: HCOMDB): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBClose(hcomdb.toString()) as Int) else 0

public actual fun ComDBGetCurrentPortUsage(hcomdb: HCOMDB, buffer: Long, buffersize: UInt, reporttype: UInt, maxportsreported: Long): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBGetCurrentPortUsage(hcomdb.toString(), buffer.toString(), buffersize.toInt(), reporttype.toInt(), maxportsreported.toString()) as Int) else 0

public actual fun ComDBOpen(phcomdb: Long): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBOpen(phcomdb.toString()) as Int) else 0

public actual fun ComDBReleasePort(hcomdb: HCOMDB, comnumber: UInt): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBReleasePort(hcomdb.toString(), comnumber.toInt()) as Int) else 0

public actual fun ComDBResizeDatabase(hcomdb: HCOMDB, newsize: UInt): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_ComDBResizeDatabase(hcomdb.toString(), newsize.toInt()) as Int) else 0
