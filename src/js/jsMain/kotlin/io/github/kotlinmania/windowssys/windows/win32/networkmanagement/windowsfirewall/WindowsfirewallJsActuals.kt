@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private val _windowsWin32NetworkmanagementWindowsfirewallNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ncFreeNetconProperties(pprops: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) {
        _windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties((pprops?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName((pszwname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo((wszservername?.value ?: 0L).toString(), (netisoerror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: COpaquePointer?, pppublicappcs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(flags.toInt(), (pdwnumpublicappcs?.value ?: 0L).toString(), (pppublicappcs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumerateAppContainerRules(newenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules((newenum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationFreeAppContainers(ppublicappcs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers((ppublicappcs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: COpaquePointer?, appcontainersids: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig((pdwnumpublicappcs?.value ?: 0L).toString(), (appcontainersids?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: COpaquePointer?, callback: PnetisoEdpIdCallbackFn, hoperation: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync((wszservername?.value ?: 0L).toString(), dwflags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), (hoperation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose((hoperation?.value ?: 0L).toString(), bwaitforoperation) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: COpaquePointer?, registrationobject: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(flags.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (registrationobject?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), (appcontainersids?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: COpaquePointer?, binariescount: UInt): Hresult =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries((applicationcontainersid?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString(), (packagefolder?.value ?: 0L).toString(), (displayname?.value ?: 0L).toString(), bbinariesfullycomputed, (binaries?.value ?: 0L).toString(), binariescount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges((registrationobject?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
