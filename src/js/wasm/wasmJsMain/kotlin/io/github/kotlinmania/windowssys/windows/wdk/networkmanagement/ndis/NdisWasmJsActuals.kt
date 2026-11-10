@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkNetworkmanagementNdisNapiAddon(): Boolean

private val _windowsWdkNetworkmanagementNdisNapiAvailable: Boolean = _initWindowsWdkNetworkmanagementNdisNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock(p0: String, p1: Boolean, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(p0: Int, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(p0: Int, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(p0: Int, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(p0: Int, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Boolean)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory(p0: String, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId()")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment()")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion()")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory(p0: String, p1: Int, p2: Boolean, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory(p0: String, p1: Int, p2: Boolean, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration(p0: String, p1: String, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Boolean)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount()")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile(p0)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory(p0: String, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent(p0: String, p1: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

public actual fun ndisAcquireReadWriteLock(lock: COpaquePointer?, fwrite: Boolean, lockstate: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock((lock?.value ?: 0L).toString(), fwrite, (lockstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: COpaquePointer?, length: UInt, tag: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag((virtualaddress?.value ?: 0L).toString(), length.toInt(), tag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer((timer?.value ?: 0L).toString(), (timercancelled?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClAddParty(ndisvchandle: COpaquePointer?, protocolpartycontext: COpaquePointer?, callparameters: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty((ndisvchandle?.value ?: 0L).toString(), (protocolpartycontext?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseAddressFamily(ndisafhandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily((ndisafhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseCall(ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall((ndisvchandle?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDeregisterSap(ndissaphandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap((ndissaphandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDropParty(ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty((ndispartyhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(status, (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClMakeCall(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?, protocolpartycontext: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString(), (protocolpartycontext?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClModifyCallQoS(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClRegisterSap(ndisafhandle: COpaquePointer?, protocolsapcontext: COpaquePointer?, sap: COpaquePointer?, ndissaphandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap((ndisafhandle?.value ?: 0L).toString(), (protocolsapcontext?.value ?: 0L).toString(), (sap?.value ?: 0L).toString(), (ndissaphandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCloseConfiguration(configurationhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration((configurationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCloseFile(filehandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile((filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(status, (ndispartyhandle?.value ?: 0L).toString(), (callmgrpartycontext?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(status, (ndisafhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(status, (ndisvchandle?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc((ndisvchandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(status, (ndissaphandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected((ndisvchandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: COpaquePointer?, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall((ndissaphandle?.value ?: 0L).toString(), (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(closestatus, (ndisvchandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(dropstatus, (ndispartyhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(status, (ndispartyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(status, (ndisvchandle?.value ?: 0L).toString(), (ndispartyhandle?.value ?: 0L).toString(), (callmgrpartycontext?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(status, (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?, callmgrafcontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(status, (ndisafhandle?.value ?: 0L).toString(), (callmgrafcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: COpaquePointer?, callmgrsapcontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(status, (ndissaphandle?.value ?: 0L).toString(), (callmgrsapcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: COpaquePointer?, baseinstancename: COpaquePointer?, vcinstancename: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName((ndisvchandle?.value ?: 0L).toString(), (baseinstancename?.value ?: 0L).toString(), (vcinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoCreateVc(ndisbindinghandle: COpaquePointer?, ndisafhandle: COpaquePointer?, protocolvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc((ndisbindinghandle?.value ?: 0L).toString(), (ndisafhandle?.value ?: 0L).toString(), (protocolvccontext?.value ?: 0L).toString(), (ndisvchandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoDeleteVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc((ndisvchandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoGetTapiCallId(ndisvchandle: COpaquePointer?, tapicallid: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId((ndisvchandle?.value ?: 0L).toString(), (tapicallid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCompleteDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer((status?.value ?: 0L).toString(), (ndisdmahandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCopyBuffer(status: COpaquePointer?, buffer: COpaquePointer?, poolhandle: COpaquePointer?, memorydescriptor: COpaquePointer?, offset: UInt, length: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer((status?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (poolhandle?.value ?: 0L).toString(), (memorydescriptor?.value ?: 0L).toString(), offset.toInt(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisDeregisterTdiCallBack() {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisFreeMemory(virtualaddress: COpaquePointer?, length: UInt, memoryflags: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory((virtualaddress?.value ?: 0L).toString(), length.toInt(), memoryflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetCurrentProcessorCounts(pidlecount: COpaquePointer?, pkernelanduser: COpaquePointer?, pindex: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts((pidlecount?.value ?: 0L).toString(), (pkernelanduser?.value ?: 0L).toString(), (pindex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage((pcpuusage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetRoutineAddress(ndisroutinename: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress((ndisroutinename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetSharedDataAlignment(): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetVersion(): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMAssociateMiniport(driverhandle: COpaquePointer?, protocolhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport((driverhandle?.value ?: 0L).toString(), (protocolhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: COpaquePointer?, deviceinstance: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance((driverhandle?.value ?: 0L).toString(), (deviceinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance((ndisminiporthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext((ndisbindinghandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: COpaquePointer?, driverinstance: COpaquePointer?, devicecontext: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx((driverhandle?.value ?: 0L).toString(), (driverinstance?.value ?: 0L).toString(), (devicecontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisInitializeEvent(event: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeReadWriteLock(lock: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock((lock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeString(destination: COpaquePointer?, source: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString((destination?.value ?: 0L).toString(), (source?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeTimer(timer: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer((timer?.value ?: 0L).toString(), 0L.toString(), (functioncontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory((miniportadapterhandle?.value ?: 0L).toString(), length.toInt(), cached, (virtualaddress?.value ?: 0L).toString(), (physicaladdress?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, context: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync((miniportadapterhandle?.value ?: 0L).toString(), length.toInt(), cached, (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer((timer?.value ?: 0L).toString(), (timercancelled?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCloseLog(loghandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog((loghandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc((ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmCreateVc(miniportadapterhandle: COpaquePointer?, ndisafhandle: COpaquePointer?, miniportvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc((miniportadapterhandle?.value ?: 0L).toString(), (ndisafhandle?.value ?: 0L).toString(), (miniportvccontext?.value ?: 0L).toString(), (ndisvchandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc((ndisvchandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeleteVc(ndisvchandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc((ndisvchandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: COpaquePointer?, addressfamily: COpaquePointer?, cmcharacteristics: COpaquePointer?, sizeofcmcharacteristics: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily((miniportadapterhandle?.value ?: 0L).toString(), (addressfamily?.value ?: 0L).toString(), (cmcharacteristics?.value ?: 0L).toString(), sizeofcmcharacteristics.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(status, (ndisvchandle?.value ?: 0L).toString(), (callparameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(status, (ndisvchandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCreateLog(miniportadapterhandle: COpaquePointer?, size: UInt, loghandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog((miniportadapterhandle?.value ?: 0L).toString(), size.toInt(), (loghandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel((miniportdmahandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt, portoffset: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange((miniportadapterhandle?.value ?: 0L).toString(), initialport.toInt(), numberofports.toInt(), (portoffset?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFlushLog(loghandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog((loghandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory((miniportadapterhandle?.value ?: 0L).toString(), length.toInt(), cached, (virtualaddress?.value ?: 0L).toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: COpaquePointer?, physicaldeviceobject: COpaquePointer?, functionaldeviceobject: COpaquePointer?, nextdeviceobject: COpaquePointer?, allocatedresources: COpaquePointer?, allocatedresourcestranslated: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty((miniportadapterhandle?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (functionaldeviceobject?.value ?: 0L).toString(), (nextdeviceobject?.value ?: 0L).toString(), (allocatedresources?.value ?: 0L).toString(), (allocatedresourcestranslated?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: COpaquePointer?): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment((miniportadapterhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMInitializeTimer(timer: COpaquePointer?, miniportadapterhandle: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer((timer?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), 0L.toString(), (functioncontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMMapIoSpace(virtualaddress: COpaquePointer?, miniportadapterhandle: COpaquePointer?, physicaladdress: Long, length: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace((virtualaddress?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), physicaladdress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, miniporthandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName((padapterinstancename?.value ?: 0L).toString(), (miniporthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMReadDmaCounter(miniportdmahandle: COpaquePointer?): UInt =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter((miniportdmahandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: COpaquePointer?, miniportadapterhandle: COpaquePointer?, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: COpaquePointer?, maximumlength: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel((miniportdmahandle?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), dmachannel.toInt(), dma32bitaddresses, (dmadescription?.value ?: 0L).toString(), maximumlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterIoPortRange(portoffset: COpaquePointer?, miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange((portoffset?.value ?: 0L).toString(), (miniportadapterhandle?.value ?: 0L).toString(), initialport.toInt(), numberofports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRemoveMiniport(miniporthandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport((miniporthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMSetPeriodicTimer(timer: COpaquePointer?, millisecondperiod: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer((timer?.value ?: 0L).toString(), millisecondperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(microsecondstosleep.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace((miniportadapterhandle?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMWriteLogData(loghandle: COpaquePointer?, logbuffer: COpaquePointer?, logbuffersize: UInt): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData((loghandle?.value ?: 0L).toString(), (logbuffer?.value ?: 0L).toString(), logbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMapFile(status: COpaquePointer?, mappedbuffer: COpaquePointer?, filehandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile((status?.value ?: 0L).toString(), (mappedbuffer?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByIndex(status: COpaquePointer?, configurationhandle: COpaquePointer?, index: UInt, keyname: COpaquePointer?, keyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex((status?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), index.toInt(), (keyname?.value ?: 0L).toString(), (keyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByName(status: COpaquePointer?, configurationhandle: COpaquePointer?, subkeyname: COpaquePointer?, subkeyhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName((status?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), (subkeyname?.value ?: 0L).toString(), (subkeyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenFile(status: COpaquePointer?, filehandle: COpaquePointer?, filelength: COpaquePointer?, filename: COpaquePointer?, highestacceptableaddress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile((status?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), (filelength?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), highestacceptableaddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, ndisbindinghandle: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName((padapterinstancename?.value ?: 0L).toString(), (ndisbindinghandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisQueryBindInstanceName(padapterinstancename: COpaquePointer?, bindingcontext: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName((padapterinstancename?.value ?: 0L).toString(), (bindingcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings((ndisprotocolhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadConfiguration(status: COpaquePointer?, parametervalue: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametertype: NdisParameterType) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration((status?.value ?: 0L).toString(), (parametervalue?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), (keyword?.value ?: 0L).toString(), parametertype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadNetworkAddress(status: COpaquePointer?, networkaddress: COpaquePointer?, networkaddresslength: COpaquePointer?, configurationhandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress((status?.value ?: 0L).toString(), (networkaddress?.value ?: 0L).toString(), (networkaddresslength?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReleaseReadWriteLock(lock: COpaquePointer?, lockstate: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock((lock?.value ?: 0L).toString(), (lockstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisResetEvent(event: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetEvent(event: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetPeriodicTimer(ndistimer: COpaquePointer?, millisecondsperiod: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer((ndistimer?.value ?: 0L).toString(), millisecondsperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimer(timer: COpaquePointer?, millisecondstodelay: UInt) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer((timer?.value ?: 0L).toString(), millisecondstodelay.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimerEx(ndistimer: COpaquePointer?, millisecondstodelay: UInt, functioncontext: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx((ndistimer?.value ?: 0L).toString(), millisecondstodelay.toInt(), (functioncontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetupDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer((status?.value ?: 0L).toString(), (ndisdmahandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSystemProcessorCount(): Byte =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisUnmapFile(filehandle: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile((filehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: COpaquePointer?, length: UInt, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory((ndisadapterhandle?.value ?: 0L).toString(), length.toInt(), (virtualaddress?.value ?: 0L).toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWaitEvent(event: COpaquePointer?, mstowait: UInt): Boolean =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent((event?.value ?: 0L).toString(), mstowait.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisWriteConfiguration(status: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametervalue: COpaquePointer?) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration((status?.value ?: 0L).toString(), (configurationhandle?.value ?: 0L).toString(), (keyword?.value ?: 0L).toString(), (parametervalue?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: COpaquePointer?, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) {
        _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry((ndisadapterhandle?.value ?: 0L).toString(), errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteEventLogEntry(loghandle: COpaquePointer?, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: COpaquePointer?, datasize: UInt, data: COpaquePointer?): Int =
    if (_windowsWdkNetworkmanagementNdisNapiAvailable) _wasm_windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry((loghandle?.value ?: 0L).toString(), eventcode, uniqueeventvalue.toInt(), numstrings.toInt(), (stringslist?.value ?: 0L).toString(), datasize.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
