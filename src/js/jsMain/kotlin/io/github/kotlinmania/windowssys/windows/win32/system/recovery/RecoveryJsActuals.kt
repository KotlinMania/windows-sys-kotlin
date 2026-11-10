@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

private val _windowsWin32SystemRecoveryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    if (_windowsWin32SystemRecoveryNapiAddon != null) {
        _windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_applicationRecoveryFinished(bsuccess)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun applicationRecoveryInProgress(pbcancelled: COpaquePointer?): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_applicationRecoveryInProgress((pbcancelled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: COpaquePointer?, ppvparameter: COpaquePointer?, pdwpinginterval: COpaquePointer?, pdwflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_getApplicationRecoveryCallback((hprocess?.value ?: 0L).toString(), (precoverycallback?.value ?: 0L).toString(), (ppvparameter?.value ?: 0L).toString(), (pdwpinginterval?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: COpaquePointer?, pdwflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_getApplicationRestartSettings((hprocess?.value ?: 0L).toString(), (pwzcommandline?.value ?: 0L).toString(), (pcchsize?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: COpaquePointer?, dwpinginterval: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_registerApplicationRecoveryCallback(0L.toString(), (pvparameter?.value ?: 0L).toString(), dwpinginterval.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_registerApplicationRestart((pwzcommandline?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_unregisterApplicationRecoveryCallback() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterApplicationRestart(): Hresult =
    if (_windowsWin32SystemRecoveryNapiAddon != null) (_windowsWin32SystemRecoveryNapiAddon.windowssys_windows_win32_system_recovery_unregisterApplicationRestart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
