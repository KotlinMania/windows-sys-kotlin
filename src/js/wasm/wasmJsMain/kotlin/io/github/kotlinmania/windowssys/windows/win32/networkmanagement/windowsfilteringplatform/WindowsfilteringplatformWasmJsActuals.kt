@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityW

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon(): Boolean

private val windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable: Boolean = initWindowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(p0: String, p1: String, p2: String, p3: String): Int

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr<FwpmCallout0>, sd: PsecurityDescriptor, id: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle.rawAddress.toString(), callout.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmCalloutEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle.rawAddress.toString(), id.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmCallout0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr<MutPtr<FwpmCallout0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle.rawAddress.toString(), id.toInt(), callout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, callout: MutPtr<MutPtr<FwpmCallout0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), callout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmCalloutSubscription0>, callback: FwpmCalloutChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmCalloutSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmConnectionEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmConnection0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr<MutPtr<FwpmConnection0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle.rawAddress.toString(), id.toString(), connection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionSubscribe0(enginehandle: Handle, subscription: ConstPtr<FwpmConnectionSubscription0>, callback: FwpmConnectionCallback0, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(enginehandle.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmDynamicKeywordSubscribe0(flags: UInt, callback: FwpmDynamicKeywordCallback0, context: ConstPtr<CVoid>, subscriptionhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(flags.toInt(), 0L.toString(), context.rawAddress.toString(), subscriptionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(subscriptionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineClose0(enginehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr<MutPtr<FwpValue0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle.rawAddress.toString(), option, value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr<SecWinntAuthIdentityW>, session: ConstPtr<FwpmSession0>, enginehandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername.rawAddress.toString(), authnservice.toInt(), authidentity.rawAddress.toString(), session.rawAddress.toString(), enginehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr<FwpValue0>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle.rawAddress.toString(), option, newvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr<FwpmFilter0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle.rawAddress.toString(), filter.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmFilterEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle.rawAddress.toString(), id.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmFilter0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr<MutPtr<FwpmFilter0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle.rawAddress.toString(), id.toString(), filter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, filter: MutPtr<MutPtr<FwpmFilter0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), filter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmFilterSubscription0>, callback: FwpmFilterChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmFilterSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFreeMemory0(p: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fwpmGetAppIdFromFileName0(filename: Pcwstr, appid: MutPtr<MutPtr<FwpByteBlob>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(filename.rawAddress.toString(), appid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext0>, tunnelpolicy: ConstPtr<FwpmProviderContext0>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), sd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext1>, tunnelpolicy: ConstPtr<FwpmProviderContext1>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext2>, tunnelpolicy: ConstPtr<FwpmProviderContext2>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext3>, tunnelpolicy: ConstPtr<FwpmProviderContext3>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmLayerEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmLayer0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr<MutPtr<FwpmLayer0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle.rawAddress.toString(), id.toInt(), layer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, layer: MutPtr<MutPtr<FwpmLayer0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), layer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmNetEventEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent2>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent3>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent4>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent5>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe0(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback0, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe1(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback1, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe2(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback2, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe3(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback3, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe4(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback4, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmNetEventSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(enginehandle.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr<FwpmProvider0>, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle.rawAddress.toString(), provider.rawAddress.toString(), sd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext1>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext2>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext3>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderContextEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext2>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext3>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmProviderContextSubscription0>, callback: FwpmProviderContextChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContextSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProvider0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, provider: MutPtr<MutPtr<FwpmProvider0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), provider.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmProviderSubscription0>, callback: FwpmProviderChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmProviderSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSessionEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSession0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr<FwpmSublayer0>, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle.rawAddress.toString(), sublayer.rawAddress.toString(), sd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSublayerEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSublayer0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, sublayer: MutPtr<MutPtr<FwpmSublayer0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), sublayer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmSublayerSubscription0>, callback: FwpmSublayerChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmSublayerSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSystemPortsGet0(enginehandle: Handle, sysports: MutPtr<MutPtr<FwpmSystemPorts0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(enginehandle.rawAddress.toString(), sysports.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSystemPortsSubscribe0(enginehandle: Handle, reserved: ConstPtr<CVoid>, callback: FwpmSystemPortsCallback0, context: ConstPtr<CVoid>, sysportshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(enginehandle.rawAddress.toString(), reserved.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), sysportshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSystemPortsUnsubscribe0(enginehandle: Handle, sysportshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(enginehandle.rawAddress.toString(), sysportshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionAbort0(enginehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionCommit0(enginehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventSubscribe0(enginehandle: Handle, subscription: ConstPtr<FwpmVswitchEventSubscription0>, callback: FwpmVswitchEventCallback0, context: ConstPtr<CVoid>, subscriptionhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), subscriptionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventUnsubscribe0(enginehandle: Handle, subscriptionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(enginehandle.rawAddress.toString(), subscriptionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr<IpsecDospStatistics0>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle.rawAddress.toString(), idpstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecDospStateEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecDospState0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics0>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics1>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerAddAndRegister0(enginehandle: Handle, keymanager: ConstPtr<IpsecKeyManager0>, keymanagercallbacks: ConstPtr<IpsecKeyManagerCallbacks0>, keymgmthandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(enginehandle.rawAddress.toString(), keymanager.rawAddress.toString(), keymanagercallbacks.rawAddress.toString(), keymgmthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Handle, reserved: ConstPtr<CVoid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), reserved.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Handle, reserved: ConstPtr<CVoid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), reserved.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerUnregisterAndDelete0(enginehandle: Handle, keymgmthandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(enginehandle.rawAddress.toString(), keymgmthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagersGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<IpsecKeyManager0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle0>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle1>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle0>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle1>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic1>, virtualiftunnelinfo: ConstPtr<IpsecVirtualIfTunnelInfo0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), virtualiftunnelinfo.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaContextEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle.rawAddress.toString(), id.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext1>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi0>, inboundspi: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: UInt): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSubscribe0(enginehandle: Handle, subscription: ConstPtr<IpsecSaContextSubscription0>, callback: IpsecSaContextCallback0, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<IpsecSaContextSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(enginehandle.rawAddress.toString(), eventshandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr<IpsecSaContext1>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle.rawAddress.toString(), flags.toString(), newvalues.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics0>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics1>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IkeextSaEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle.rawAddress.toString(), id.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails2>>>, numentriesreturned: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr<MutPtr<IkeextSaDetails0>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle.rawAddress.toString(), id.toString(), sa.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails1>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails2>>): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
