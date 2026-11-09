@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun WnvOpen(): HANDLE =
    if (_windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon != null) (_windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvOpen() as String).toLong() else 0L

public actual fun WnvRequestNotification(wnvhandle: HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon != null) (_windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvRequestNotification(wnvhandle.toString(), notificationparam.toString(), overlapped.toString(), bytestransferred.toString()) as Int).toUInt() else 0u
