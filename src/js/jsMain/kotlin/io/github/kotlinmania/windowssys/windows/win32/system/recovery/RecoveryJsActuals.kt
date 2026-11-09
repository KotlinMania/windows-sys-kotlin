@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.APPLICATION_RECOVERY_CALLBACK

private val _windowsWin32SystemRecoveryNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ApplicationRecoveryFinished(bsuccess: BOOL) {
    if (_windowsWin32SystemRecoveryNapiAddon != null) {
        _windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_ApplicationRecoveryFinished(bsuccess)
    }
}

public actual fun ApplicationRecoveryInProgress(pbcancelled: Long): HRESULT =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_ApplicationRecoveryInProgress(pbcancelled.toString()) as Int) else 0

public actual fun GetApplicationRecoveryCallback(hprocess: HANDLE, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): HRESULT =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_GetApplicationRecoveryCallback(hprocess.toString(), precoverycallback.toString(), ppvparameter.toString(), pdwpinginterval.toString(), pdwflags.toString()) as Int) else 0

public actual fun GetApplicationRestartSettings(hprocess: HANDLE, pwzcommandline: PWSTR, pcchsize: Long, pdwflags: Long): HRESULT =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_GetApplicationRestartSettings(hprocess.toString(), pwzcommandline.toString(), pcchsize.toString(), pdwflags.toString()) as Int) else 0

public actual fun RegisterApplicationRecoveryCallback(precoveycallback: APPLICATION_RECOVERY_CALLBACK, pvparameter: Long, dwpinginterval: UInt, dwflags: UInt): HRESULT =
    0

public actual fun RegisterApplicationRestart(pwzcommandline: PCWSTR, dwflags: REGISTER_APPLICATION_RESTART_FLAGS): HRESULT =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_RegisterApplicationRestart(pwzcommandline.toString(), dwflags.toInt()) as Int) else 0

public actual fun UnregisterApplicationRecoveryCallback(): HRESULT =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_UnregisterApplicationRecoveryCallback() as Int) else 0

public actual fun UnregisterApplicationRestart(): HRESULT =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_UnregisterApplicationRestart() as Int) else 0
