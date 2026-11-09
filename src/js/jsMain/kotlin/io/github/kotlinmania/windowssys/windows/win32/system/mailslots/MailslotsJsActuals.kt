@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemMailslotsNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CreateMailslotA(lpname: PCSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    if (_windowsWin32SystemMailslotsNapiAddon != null) (_windowsWin32SystemMailslotsNapiAddon.windowssys_windows_win32_system_mailslots_CreateMailslotA(lpname.toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.toString()) as String).toLong() else 0L

public actual fun CreateMailslotW(lpname: PCWSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    if (_windowsWin32SystemMailslotsNapiAddon != null) (_windowsWin32SystemMailslotsNapiAddon.windowssys_windows_win32_system_mailslots_CreateMailslotW(lpname.toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.toString()) as String).toLong() else 0L

public actual fun GetMailslotInfo(hmailslot: HANDLE, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): BOOL =
    if (_windowsWin32SystemMailslotsNapiAddon != null) (_windowsWin32SystemMailslotsNapiAddon.windowssys_windows_win32_system_mailslots_GetMailslotInfo(hmailslot.toString(), lpmaxmessagesize.toString(), lpnextsize.toString(), lpmessagecount.toString(), lpreadtimeout.toString()) as Int) else 0

public actual fun SetMailslotInfo(hmailslot: HANDLE, lreadtimeout: UInt): BOOL =
    if (_windowsWin32SystemMailslotsNapiAddon != null) (_windowsWin32SystemMailslotsNapiAddon.windowssys_windows_win32_system_mailslots_SetMailslotInfo(hmailslot.toString(), lreadtimeout.toInt()) as Int) else 0
