@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementWindowsfirewallNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementWindowsfirewallNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementWindowsfirewallNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges(p0: String): Int

public actual fun ncFreeNetconProperties(pprops: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties((pprops?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName((pszwname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo((wszservername?.value ?: 0L).toString(), (netisoerror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: COpaquePointer?, pppublicappcs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(flags.toInt(), (pdwnumpublicappcs?.value ?: 0L).toString(), (pppublicappcs?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumerateAppContainerRules(newenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules((newenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationFreeAppContainers(ppublicappcs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers((ppublicappcs?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: COpaquePointer?, appcontainersids: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig((pdwnumpublicappcs?.value ?: 0L).toString(), (appcontainersids?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: COpaquePointer?, callback: PnetisoEdpIdCallbackFn, hoperation: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync((wszservername?.value ?: 0L).toString(), dwflags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), (hoperation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose((hoperation?.value ?: 0L).toString(), bwaitforoperation).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: COpaquePointer?, registrationobject: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(flags.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (registrationobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), (appcontainersids?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: COpaquePointer?, binariescount: UInt): Hresult =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries((applicationcontainersid?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString(), (packagefolder?.value ?: 0L).toString(), (displayname?.value ?: 0L).toString(), bbinariesfullycomputed, (binaries?.value ?: 0L).toString(), binariescount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges((registrationobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
