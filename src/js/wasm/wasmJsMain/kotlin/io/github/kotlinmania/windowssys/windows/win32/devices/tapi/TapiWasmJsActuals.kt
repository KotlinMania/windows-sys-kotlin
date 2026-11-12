@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesTapiNapiAddon(): Boolean

private val windowsWin32DevicesTapiNapiAvailable: Boolean = initWindowsWin32DevicesTapiNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiOpenTnefStream(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiOpenTnefStream(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiOpenTnefStreamEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesTapiOpenTnefStreamEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAccept(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAccept(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAddProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAddProvider(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAddProviderA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAddProviderA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAddProviderW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAddProviderW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAddToConference(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAddToConference(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAgentSpecific(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAgentSpecific(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineAnswer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineAnswer(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineBlindTransfer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineBlindTransfer(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineBlindTransferA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineBlindTransferA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineBlindTransferW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineBlindTransferW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineClose(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineCompleteCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineCompleteCall(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineCompleteTransfer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineCompleteTransfer(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigDialog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigDialog(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigDialogA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigDialogEdit(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogEdit(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigDialogEditA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogEditA(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigDialogEditW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogEditW(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigDialogW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineConfigProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineConfigProvider(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineCreateAgentA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineCreateAgentW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDeallocateCall(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDeallocateCall(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDevSpecific(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDevSpecific(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDevSpecificFeature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDevSpecificFeature(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDial(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDial(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDialA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDialA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDialW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDialW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineDrop(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineDrop(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineForward(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineForward(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineForwardA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineForwardA(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineForwardW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineForwardW(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGatherDigits(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGatherDigits(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGatherDigitsA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGatherDigitsA(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGatherDigitsW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGatherDigitsW(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGenerateDigits(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGenerateDigits(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGenerateDigitsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGenerateDigitsA(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGenerateDigitsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGenerateDigitsW(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGenerateTone(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGenerateTone(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressCaps(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressCapsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressCapsA(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressCapsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressCapsW(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressID(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressID(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressIDA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressIDA(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressIDW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressIDW(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressStatus(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressStatusA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressStatusA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAddressStatusW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAddressStatusW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentCapsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentCapsA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentCapsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentCapsW(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentSessionList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentSessionList(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentStatusA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentStatusA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAgentStatusW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAgentStatusW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAppPriority(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAppPriority(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAppPriorityA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAppPriorityA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetAppPriorityW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetAppPriorityW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCallInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCallInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCallInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCallInfoA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCallInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCallInfoW(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCallStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCallStatus(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCountry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCountry(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCountryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCountryA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetCountryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetCountryW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetDevCaps(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetDevCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetDevCapsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetDevCapsA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetDevCapsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetDevCapsW(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetDevConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetDevConfig(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetDevConfigA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetDevConfigA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetDevConfigW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetDevConfigW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetGroupListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetGroupListA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetGroupListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetGroupListW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetID(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetID(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetIDA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetIDA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetIDW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetIDW(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetIcon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetIcon(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetIconA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetIconA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetIconW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetIconW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetLineDevStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetLineDevStatus(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetMessage(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetNewCalls(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetNewCalls(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetNumRings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetNumRings(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetProviderList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetProviderList(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetProviderListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetProviderListA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetProviderListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetProviderListW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetProxyStatus(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetProxyStatus(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetQueueInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetQueueInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetQueueListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetQueueListA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetQueueListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetQueueListW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetRequest(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetRequest(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetRequestA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetRequestA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetRequestW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetRequestW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetStatusMessages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetStatusMessages(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetTranslateCaps(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetTranslateCaps(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineHandoff(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineHandoff(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineHandoffA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineHandoffA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineHandoffW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineHandoffW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineHold(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineHold(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineInitialize(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineInitialize(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineInitializeExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineInitializeExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineInitializeExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineInitializeExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineMakeCall(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineMakeCall(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineMakeCallA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineMakeCallA(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineMakeCallW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineMakeCallW(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineMonitorDigits(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineMonitorDigits(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineMonitorMedia(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineMonitorMedia(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineMonitorTones(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineMonitorTones(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineOpen(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineOpen(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineOpenA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineOpenA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineOpenW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineOpenW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePark(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePark(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineParkA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineParkA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineParkW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineParkW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePickup(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePickup(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePickupA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePickupA(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePickupW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePickupW(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePrepareAddToConference(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePrepareAddToConference(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineProxyMessage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineProxyMessage(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineProxyResponse(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineProxyResponse(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineRedirect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineRedirect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineRedirectA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineRedirectA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineRedirectW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineRedirectW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineRemoveFromConference(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineRemoveFromConference(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineRemoveProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineRemoveProvider(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSecureCall(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSecureCall(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSendUserUserInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSendUserUserInfo(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAgentActivity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAgentActivity(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAgentGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAgentGroup(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAgentSessionState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAgentSessionState(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAgentState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAgentState(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAgentStateEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAgentStateEx(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAppPriority(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAppPriority(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAppPriorityA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAppPriorityA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAppPriorityW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAppPriorityW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetAppSpecific(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetAppSpecific(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetCallData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetCallData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetCallParams(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetCallParams(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetCallPrivilege(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetCallPrivilege(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetCallTreatment(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetCallTreatment(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetCurrentLocation(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetCurrentLocation(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetDevConfig(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetDevConfig(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetDevConfigA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetDevConfigA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetDevConfigW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetDevConfigW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetLineDevStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetLineDevStatus(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetMediaControl(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetMediaControl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int, p10: String, p11: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetMediaMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetMediaMode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetNumRings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetNumRings(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetStatusMessages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetStatusMessages(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetTerminal(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetTerminal(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetTollList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetTollList(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetTollListA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetTollListA(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetTollListW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetTollListW(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetupConference(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetupConference(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetupConferenceA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetupConferenceA(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetupConferenceW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetupConferenceW(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetupTransfer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetupTransfer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetupTransferA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetupTransferA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSetupTransferW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSetupTransferW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineShutdown(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineShutdown(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineSwapHold(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineSwapHold(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineTranslateAddress(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineTranslateAddress(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineTranslateAddressA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineTranslateAddressA(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineTranslateAddressW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineTranslateAddressW(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineTranslateDialog(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineTranslateDialog(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineTranslateDialogA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineTranslateDialogA(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineTranslateDialogW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineTranslateDialogW(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineUncompleteCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineUncompleteCall(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineUnhold(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineUnhold(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineUnpark(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineUnpark(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineUnparkA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineUnparkA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiLineUnparkW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiLineUnparkW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneClose(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneConfigDialog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneConfigDialog(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneConfigDialogA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneConfigDialogA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneConfigDialogW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneConfigDialogW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneDevSpecific(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneDevSpecific(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetData(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetDevCaps(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetDevCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetDisplay(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetDisplay(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetGain(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetGain(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetID(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetIDA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetIDA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetIDW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetIDW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetIcon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetIcon(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetIconA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetIconA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetIconW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetIconW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetLamp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetLamp(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetMessage(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetRing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetRing(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatus(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetStatusA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatusA(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetStatusW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatusW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneGetVolume(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneGetVolume(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneInitialize(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneInitialize(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneInitializeExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneInitializeExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneInitializeExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneInitializeExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneOpen(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetData(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetDisplay(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetDisplay(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetGain(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetGain(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetLamp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetLamp(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetRing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetRing(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneSetVolume(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneSetVolume(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiPhoneShutdown(p0)")
private external fun wasmWindowssysWindowsWin32DevicesTapiPhoneShutdown(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiGetLocationInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiGetLocationInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestDrop(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestDrop(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestMakeCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestMakeCall(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestMediaCall(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestMediaCall(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

public actual fun getTnefStreamCodepage(lpstream: MutPtr, lpulcodepage: MutPtr, lpulsubcodepage: MutPtr): Hresult =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(lpstream.rawAddress.toString(), lpulcodepage.rawAddress.toString(), lpulsubcodepage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTnefStream(lpvsupport: MutPtr, lpstream: MutPtr, lpszstreamname: ConstPtr, ulflags: UInt, lpmessage: MutPtr, wkeyval: UShort, lpptnef: MutPtr): Hresult =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiOpenTnefStream(lpvsupport.rawAddress.toString(), lpstream.rawAddress.toString(), lpszstreamname.rawAddress.toString(), ulflags.toInt(), lpmessage.rawAddress.toString(), wkeyval.toInt(), lpptnef.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTnefStreamEx(lpvsupport: MutPtr, lpstream: MutPtr, lpszstreamname: ConstPtr, ulflags: UInt, lpmessage: MutPtr, wkeyval: UShort, lpadressbook: MutPtr, lpptnef: MutPtr): Hresult =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiOpenTnefStreamEx(lpvsupport.rawAddress.toString(), lpstream.rawAddress.toString(), lpszstreamname.rawAddress.toString(), ulflags.toInt(), lpmessage.rawAddress.toString(), wkeyval.toInt(), lpadressbook.rawAddress.toString(), lpptnef.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAccept(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAddProvider(lpszproviderfilename.rawAddress.toString(), hwndowner.rawAddress.toString(), lpdwpermanentproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAddProviderA(lpszproviderfilename.rawAddress.toString(), hwndowner.rawAddress.toString(), lpdwpermanentproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAddProviderW(lpszproviderfilename.rawAddress.toString(), hwndowner.rawAddress.toString(), lpdwpermanentproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall.toInt(), hconsultcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineAnswer(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineBlindTransfer(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineBlindTransferA(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineBlindTransferW(hcall.toInt(), lpszdestaddressw.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineClose(hline: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineClose(hline.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: MutPtr, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineCompleteCall(hcall.toInt(), lpdwcompletionid.rawAddress.toString(), dwcompletionmode.toInt(), dwmessageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: MutPtr, dwtransfermode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), lphconfcall.rawAddress.toString(), dwtransfermode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigDialog(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogA(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogEdit(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceconfigin.rawAddress.toString(), dwsize.toInt(), lpdeviceconfigout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogEditA(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceconfigin.rawAddress.toString(), dwsize.toInt(), lpdeviceconfigout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogEditW(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceconfigin.rawAddress.toString(), dwsize.toInt(), lpdeviceconfigout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigDialogW(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineConfigProvider(hwndowner.rawAddress.toString(), dwpermanentproviderid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentA(hline.toInt(), lpszagentid.rawAddress.toString(), lpszagentpin.rawAddress.toString(), lphagent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: MutPtr, lphagentsession: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(hline.toInt(), hagent.toInt(), lpszagentpin.rawAddress.toString(), dwworkingaddressid.toInt(), lpgroupid.rawAddress.toString(), lphagentsession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: MutPtr, lphagentsession: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(hline.toInt(), hagent.toInt(), lpszagentpin.rawAddress.toString(), dwworkingaddressid.toInt(), lpgroupid.rawAddress.toString(), lphagentsession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineCreateAgentW(hline.toInt(), lpszagentid.rawAddress.toString(), lpszagentpin.rawAddress.toString(), lphagent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDeallocateCall(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDial(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDialA(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDialW(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineDrop(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress.toString(), dwnumdigits.toInt(), lpszterminationdigits.rawAddress.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress.toString(), dwnumdigits.toInt(), lpszterminationdigits.rawAddress.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress.toString(), dwnumdigits.toInt(), lpszterminationdigits.rawAddress.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress.toString(), dwduration.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress.toString(), dwduration.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress.toString(), dwduration.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), lptones.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressID(hline.toInt(), lpdwaddressid.rawAddress.toString(), dwaddressmode.toInt(), lpsaddress.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressIDA(hline.toInt(), lpdwaddressid.rawAddress.toString(), dwaddressmode.toInt(), lpsaddress.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressIDW(hline.toInt(), lpdwaddressid.rawAddress.toString(), dwaddressmode.toInt(), lpsaddress.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentInfo(hline.toInt(), hagent.toInt(), lpagentinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), lpagentsessioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentSessionList(hline.toInt(), hagent.toInt(), lpagentsessionlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), lpagentstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), lpagentstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAppPriority(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpextensionname.rawAddress.toString(), lpdwpriority.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAppPriorityA(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpextensionname.rawAddress.toString(), lpdwpriority.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetAppPriorityW(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpextensionname.rawAddress.toString(), lpdwpriority.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCallInfo(hcall.toInt(), lpcallinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCallInfoA(hcall.toInt(), lpcallinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCallInfoW(hcall.toInt(), lpcallinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCallStatus(hcall.toInt(), lpcallstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(hcall.toInt(), lpcalllist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetGroupListA(hline.toInt(), lpgrouplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetGroupListW(hline.toInt(), lpgrouplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetIcon(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetIconA(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetIconW(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetLineDevStatus(hline.toInt(), lplinedevstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(hline.toInt(), lplinedevstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(hline.toInt(), lplinedevstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: MutPtr, dwtimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetMessage(hlineapp.toInt(), lpmessage.rawAddress.toString(), dwtimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), lpcalllist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetNumRings(hline.toInt(), dwaddressid.toInt(), lpdwnumrings.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetProviderList(dwapiversion.toInt(), lpproviderlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetProviderListA(dwapiversion.toInt(), lpproviderlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetProviderListW(dwapiversion.toInt(), lpproviderlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), lplineproxyreqestlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), lplinequeueinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: MutPtr, lpqueuelist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetQueueListA(hline.toInt(), lpgroupid.rawAddress.toString(), lpqueuelist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: MutPtr, lpqueuelist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetQueueListW(hline.toInt(), lpgroupid.rawAddress.toString(), lpqueuelist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: MutPtr, lpdwaddressstates: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetStatusMessages(hline.toInt(), lpdwlinestates.rawAddress.toString(), lpdwaddressstates.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineHandoff(hcall.toInt(), lpszfilename.rawAddress.toString(), dwmediamode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineHandoffA(hcall.toInt(), lpszfilename.rawAddress.toString(), dwmediamode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineHandoffW(hcall.toInt(), lpszfilename.rawAddress.toString(), dwmediamode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHold(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineHold(hcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitialize(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineInitialize(lphlineapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitializeExA(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lplineinitializeexparams: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineInitializeExA(lphlineapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lplineinitializeexparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitializeExW(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lplineinitializeexparams: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineInitializeExW(lphlineapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lplineinitializeexparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCall(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineMakeCall(hline.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCallA(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineMakeCallA(hline.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCallW(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineMakeCallW(hline.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall.toInt(), dwmediamodes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorTones(hcall: UInt, lptonelist: ConstPtr, dwnumentries: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineMonitorTones(hcall.toInt(), lptonelist.rawAddress.toString(), dwnumentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr, lpextensionid: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.rawAddress.toString(), lpextensionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineOpen(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePark(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress.toString(), lpnondiraddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineParkA(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress.toString(), lpnondiraddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineParkW(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress.toString(), lpnondiraddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePickup(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), lpszgroupid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePickupA(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), lpszgroupid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePickupW(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), lpszgroupid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePrepareAddToConference(hconfcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(hconfcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(hconfcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: MutPtr, dwresult: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineProxyResponse(hline.toInt(), lpproxyrequest.rawAddress.toString(), dwresult.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineRedirect(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineRedirectA(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineRedirectW(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineRemoveProvider(dwpermanentproviderid.toInt(), hwndowner.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSecureCall(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSecureCall(hcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSendUserUserInfo(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAppPriority(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpszextensionname.rawAddress.toString(), dwpriority.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAppPriorityA(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpszextensionname.rawAddress.toString(), dwpriority.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAppPriorityW(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpszextensionname.rawAddress.toString(), dwpriority.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall.toInt(), dwappspecific.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallData(hcall: UInt, lpcalldata: MutPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetCallData(hcall.toInt(), lpcalldata.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), lpdialparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: MutPtr, dwsendingflowspecsize: UInt, lpreceivingflowspec: MutPtr, dwreceivingflowspecsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(hcall.toInt(), lpsendingflowspec.rawAddress.toString(), dwsendingflowspecsize.toInt(), lpreceivingflowspec.rawAddress.toString(), dwreceivingflowspecsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall.toInt(), dwtreatment.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), dwsize.toInt(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), dwsize.toInt(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), dwsize.toInt(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: ConstPtr, dwdigitnumentries: UInt, lpmedialist: ConstPtr, dwmedianumentries: UInt, lptonelist: ConstPtr, dwtonenumentries: UInt, lpcallstatelist: ConstPtr, dwcallstatenumentries: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdigitlist.rawAddress.toString(), dwdigitnumentries.toInt(), lpmedialist.rawAddress.toString(), dwmedianumentries.toInt(), lptonelist.rawAddress.toString(), dwtonenumentries.toInt(), lpcallstatelist.rawAddress.toString(), dwcallstatenumentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall.toInt(), dwmediamodes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.rawAddress.toString(), dwtolllistoption.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.rawAddress.toString(), dwtolllistoption.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressinw.rawAddress.toString(), dwtolllistoption.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetupConference(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress.toString(), lphconsultcall.rawAddress.toString(), dwnumparties.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetupConferenceA(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress.toString(), lphconsultcall.rawAddress.toString(), dwnumparties.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetupConferenceW(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress.toString(), lphconsultcall.rawAddress.toString(), dwnumparties.toInt(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetupTransfer(hcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetupTransferA(hcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSetupTransferW(hcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineShutdown(hlineapp: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineShutdown(hlineapp.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall.toInt(), hheldcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress.toString(), lpszaddressin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress.toString(), lpszaddressin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress.toString(), lpszaddressin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineUncompleteCall(hline.toInt(), dwcompletionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnhold(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineUnhold(hcall.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineUnpark(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineUnparkA(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiLineUnparkW(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneClose(hphone: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneClose(hphone.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneConfigDialog(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneConfigDialogA(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneConfigDialogW(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneDevSpecific(hphone: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneDevSpecific(hphone.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: MutPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetData(hphone.toInt(), dwdataid.toInt(), lpdata.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetDisplay(hphone.toInt(), lpdisplay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), lpdwgain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(hphone.toInt(), lpdwhookswitchdevs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetID(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetID(hphone.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetIDA(hphone.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetIDW(hphone.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetIcon(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetIconA(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetIconW(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), lpdwlampmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: MutPtr, dwtimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetMessage(hphoneapp.toInt(), lpmessage.rawAddress.toString(), dwtimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: MutPtr, lpdwvolume: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetRing(hphone.toInt(), lpdwringmode.rawAddress.toString(), lpdwvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatus(hphone.toInt(), lpphonestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatusA(hphone.toInt(), lpphonestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: MutPtr, lpdwbuttonmodes: MutPtr, lpdwbuttonstates: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(hphone.toInt(), lpdwphonestates.rawAddress.toString(), lpdwbuttonmodes.rawAddress.toString(), lpdwbuttonstates.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetStatusW(hphone.toInt(), lpphonestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), lpdwvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitialize(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneInitialize(lphphoneapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitializeExA(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lpphoneinitializeexparams: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneInitializeExA(lphphoneapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lpphoneinitializeexparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitializeExW(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lpphoneinitializeexparams: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneInitializeExW(lphphoneapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lpphoneinitializeexparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr, lpextensionid: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.rawAddress.toString(), lpextensionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), lphphone.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivilege.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: ConstPtr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetData(hphone.toInt(), dwdataid.toInt(), lpdata.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), lpsdisplay.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiGetLocationInfo(lpszcountrycode.rawAddress.toString(), lpszcitycode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(lpszcountrycode.rawAddress.toString(), lpszcitycode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(lpszcountrycodew.rawAddress.toString(), lpszcitycodew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestDrop(hwnd.rawAddress.toString(), wrequestid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestMakeCall(lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestMediaCall(hwnd.rawAddress.toString(), wrequestid.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceid.rawAddress.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(hwnd.rawAddress.toString(), wrequestid.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceid.rawAddress.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAvailable) wasmWindowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(hwnd.rawAddress.toString(), wrequestid.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceid.rawAddress.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
