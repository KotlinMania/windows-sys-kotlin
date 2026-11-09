@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32SystemSetupandmigrationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun OOBEComplete(isoobecomplete: Long): BOOL =
    if (_windowsWin32SystemSetupandmigrationNapiAddon != null) (_windowsWin32SystemSetupandmigrationNapiAddon.windowssys_windows_win32_system_setupandmigration_OOBEComplete(isoobecomplete.toString()) as Int) else 0

public actual fun RegisterWaitUntilOOBECompleted(oobecompletedcallback: OOBE_COMPLETED_CALLBACK, callbackcontext: Long, waithandle: Long): BOOL =
    if (_windowsWin32SystemSetupandmigrationNapiAddon != null) (_windowsWin32SystemSetupandmigrationNapiAddon.windowssys_windows_win32_system_setupandmigration_RegisterWaitUntilOOBECompleted(oobecompletedcallback.toLong().toString(), callbackcontext.toString(), waithandle.toString()) as Int) else 0

public actual fun UnregisterWaitUntilOOBECompleted(waithandle: Long): BOOL =
    if (_windowsWin32SystemSetupandmigrationNapiAddon != null) (_windowsWin32SystemSetupandmigrationNapiAddon.windowssys_windows_win32_system_setupandmigration_UnregisterWaitUntilOOBECompleted(waithandle.toString()) as Int) else 0
