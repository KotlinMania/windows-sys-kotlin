@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRecoveryNapiAddon(): Boolean

private val windowsWin32SystemRecoveryNapiAvailable: Boolean = initWindowsWin32SystemRecoveryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(p0)")
private external fun wasmWindowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(p0)")
private external fun wasmWindowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback()")
private external fun wasmWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart()")
private external fun wasmWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart(): Int

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    if (windowsWin32SystemRecoveryNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun applicationRecoveryInProgress(pbcancelled: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(pbcancelled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: MutPtr<ApplicationRecoveryCallback>, ppvparameter: MutPtr<MutPtr<CVoid>>, pdwpinginterval: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(hprocess.rawAddress.toString(), precoverycallback.rawAddress.toString(), ppvparameter.rawAddress.toString(), pdwpinginterval.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(hprocess.rawAddress.toString(), pwzcommandline.rawAddress.toString(), pcchsize.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: ConstPtr<CVoid>, dwpinginterval: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(0L.toString(), pvparameter.rawAddress.toString(), dwpinginterval.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(pwzcommandline.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterApplicationRestart(): Hresult =
    if (windowsWin32SystemRecoveryNapiAvailable) wasmWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart() else throw UnsupportedOperationException("Native FFI addon is not available")
