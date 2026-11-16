@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

private val windowsWin32SystemRecoveryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    if (windowsWin32SystemRecoveryNapiAddon != null) {
        windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun applicationRecoveryInProgress(pbcancelled: MutPtr): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(pbcancelled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: MutPtr, ppvparameter: MutPtr, pdwpinginterval: MutPtr, pdwflags: MutPtr): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(hprocess.rawAddress.toString(), precoverycallback.rawAddress.toString(), ppvparameter.rawAddress.toString(), pdwpinginterval.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: MutPtr, pdwflags: MutPtr): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(hprocess.rawAddress.toString(), pwzcommandline.rawAddress.toString(), pcchsize.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: ConstPtr, dwpinginterval: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(0L.toString(), pvparameter.rawAddress.toString(), dwpinginterval.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(pwzcommandline.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterApplicationRestart(): Hresult =
    if (windowsWin32SystemRecoveryNapiAddon != null) (windowsWin32SystemRecoveryNapiAddon.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
