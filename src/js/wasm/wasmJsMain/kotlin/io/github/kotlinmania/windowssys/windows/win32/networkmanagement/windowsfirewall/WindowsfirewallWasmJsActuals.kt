@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementWindowsfirewallNapiAddon(): Boolean

private val windowsWin32NetworkmanagementWindowsfirewallNapiAvailable: Boolean = initWindowsWin32NetworkmanagementWindowsfirewallNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(p0: String): Int

public actual fun ncFreeNetconProperties(pprops: MutPtr<NetconProperties>) {
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(pprops.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(pszwname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: MutPtr<NetisoErrorType>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername.rawAddress.toString(), netisoerror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: MutPtr<UInt>, pppublicappcs: MutPtr<MutPtr<InetFirewallAppContainer>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(flags.toInt(), pdwnumpublicappcs.rawAddress.toString(), pppublicappcs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationEnumerateAppContainerRules(newenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(newenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationFreeAppContainers(ppublicappcs: ConstPtr<InetFirewallAppContainer>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(ppublicappcs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: MutPtr<UInt>, appcontainersids: MutPtr<MutPtr<SidAndAttributes>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(pdwnumpublicappcs.rawAddress.toString(), appcontainersids.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: ConstPtr<CVoid>, callback: PnetisoEdpIdCallbackFn, hoperation: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(wszservername.rawAddress.toString(), dwflags.toInt(), context.rawAddress.toString(), 0L.toString(), hoperation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(hoperation.rawAddress.toString(), bwaitforoperation).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: ConstPtr<CVoid>, registrationobject: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(flags.toInt(), 0L.toString(), context.rawAddress.toString(), registrationobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: ConstPtr<SidAndAttributes>): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), appcontainersids.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: ConstPtr<Pcwstr>, binariescount: UInt): Hresult =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(applicationcontainersid.rawAddress.toString(), packagefullname.rawAddress.toString(), packagefolder.rawAddress.toString(), displayname.rawAddress.toString(), bbinariesfullycomputed, binaries.rawAddress.toString(), binariescount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfirewallNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(registrationobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
