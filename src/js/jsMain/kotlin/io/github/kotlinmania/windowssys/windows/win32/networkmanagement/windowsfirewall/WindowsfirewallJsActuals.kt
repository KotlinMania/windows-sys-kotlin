@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

private val windowsWin32NetworkmanagementWindowsfirewallNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ncFreeNetconProperties(pprops: MutPtr<NetconProperties>) {
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) {
        windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(pprops.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(pszwname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: MutPtr<NetisoErrorType>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername.rawAddress.toString(), netisoerror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: MutPtr<UInt>, pppublicappcs: MutPtr<MutPtr<InetFirewallAppContainer>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(flags.toInt(), pdwnumpublicappcs.rawAddress.toString(), pppublicappcs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumerateAppContainerRules(newenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(newenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationFreeAppContainers(ppublicappcs: ConstPtr<InetFirewallAppContainer>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(ppublicappcs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: MutPtr<UInt>, appcontainersids: MutPtr<MutPtr<SidAndAttributes>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(pdwnumpublicappcs.rawAddress.toString(), appcontainersids.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: ConstPtr<CVoid>, callback: PnetisoEdpIdCallbackFn, hoperation: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(wszservername.rawAddress.toString(), dwflags.toInt(), context.rawAddress.toString(), 0L.toString(), hoperation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(hoperation.rawAddress.toString(), bwaitforoperation) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: ConstPtr<CVoid>, registrationobject: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(flags.toInt(), 0L.toString(), context.rawAddress.toString(), registrationobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: ConstPtr<SidAndAttributes>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), appcontainersids.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: ConstPtr<Pcwstr>, binariescount: UInt): Hresult =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(applicationcontainersid.rawAddress.toString(), packagefullname.rawAddress.toString(), packagefolder.rawAddress.toString(), displayname.rawAddress.toString(), bbinariesfullycomputed, binaries.rawAddress.toString(), binariescount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(registrationobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
