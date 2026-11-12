@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmEngineOption
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmServiceState
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon(): Boolean

private val windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable: Boolean = initWindowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0()")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(p0: String, p1: String, p2: String, p3: String): Int

public actual fun fwpmBfeStateGet0(): FwpmServiceState =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmBfeStateSubscribeChanges0(deviceobject: MutPtr, callback: FwpmServiceStateChangeCallback0, context: ConstPtr, changehandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(deviceobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(changehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle.rawAddress.toString(), callout.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle.rawAddress.toString(), id.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle.rawAddress.toString(), id.toInt(), callout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr, callout: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), callout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle.rawAddress.toString(), id.toString(), connection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineClose0(enginehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle.rawAddress.toString(), option, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr, session: ConstPtr, enginehandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername.rawAddress.toString(), authnservice.toInt(), authidentity.rawAddress.toString(), session.rawAddress.toString(), enginehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle.rawAddress.toString(), option, newvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle.rawAddress.toString(), filter.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle.rawAddress.toString(), id.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle.rawAddress.toString(), id.toString(), filter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr, filter: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), filter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFreeMemory0(p: MutPtr) {
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), sd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, keymodkey: ConstPtr, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, keymodkey: ConstPtr, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, keymodkey: ConstPtr, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle.rawAddress.toString(), id.toInt(), layer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr, layer: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), layer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle.rawAddress.toString(), provider.rawAddress.toString(), sd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr, provider: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), provider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle.rawAddress.toString(), sublayer.rawAddress.toString(), sd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr, sublayer: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), sublayer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle.rawAddress.toString(), idpstatistics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentries: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentries.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr, inboundfilterid: MutPtr, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr, virtualiftunnelinfo: ConstPtr, inboundfilterid: MutPtr, id: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), virtualiftunnelinfo.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle.rawAddress.toString(), id.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr, inboundspi: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr, inboundspi: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr, inboundspi: UInt): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle.rawAddress.toString(), flags.toString(), newvalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle.rawAddress.toString(), id.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle.rawAddress.toString(), id.toString(), sa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr, sa: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr, sa: MutPtr): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
