@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkNetworkmanagementNdisNapiAddon(): Boolean

private val windowsWdkNetworkmanagementNdisNapiAvailable: Boolean = initWindowsWdkNetworkmanagementNdisNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(p0: String, p1: Boolean, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(p0: Int, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(p0: Int, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(p0: Int, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(p0: Int, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Boolean)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(p0: String, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId()")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment()")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion()")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetVersion(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(p0: String, p1: Int, p2: Boolean, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(p0: String, p1: Int, p2: Boolean, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMSleep(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMapFile(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(p0: String, p1: String, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Boolean)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount()")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(p0)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(p0: String, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(p0: String, p1: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

public actual fun ndisAcquireReadWriteLock(lock: MutPtr, fwrite: Boolean, lockstate: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock.rawAddress.toString(), fwrite, lockstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr, length: UInt, tag: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress.rawAddress.toString(), length.toInt(), tag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer.rawAddress.toString(), timercancelled.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClAddParty(ndisvchandle: ConstPtr, protocolpartycontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle.rawAddress.toString(), protocolpartycontext.rawAddress.toString(), callparameters.rawAddress.toString(), ndispartyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr, callparameters: MutPtr, protocolpartycontext: ConstPtr, ndispartyhandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString(), protocolpartycontext.rawAddress.toString(), ndispartyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle.rawAddress.toString(), protocolsapcontext.rawAddress.toString(), sap.rawAddress.toString(), ndissaphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCloseFile(filehandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr, callparameters: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status, ndispartyhandle.rawAddress.toString(), callmgrpartycontext.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status, ndisafhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status, ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status, ndissaphandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr, ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle.rawAddress.toString(), ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status, ndispartyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status, ndisvchandle.rawAddress.toString(), ndispartyhandle.rawAddress.toString(), callmgrpartycontext.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr, callmgrafcontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status, ndisafhandle.rawAddress.toString(), callmgrafcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr, callmgrsapcontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status, ndissaphandle.rawAddress.toString(), callmgrsapcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr, baseinstancename: ConstPtr, vcinstancename: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle.rawAddress.toString(), baseinstancename.rawAddress.toString(), vcinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr, ndisafhandle: ConstPtr, protocolvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle.rawAddress.toString(), ndisafhandle.rawAddress.toString(), protocolvccontext.rawAddress.toString(), ndisvchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr, tapicallid: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle.rawAddress.toString(), tapicallid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisCompleteDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status.rawAddress.toString(), ndisdmahandle.rawAddress.toString(), buffer.rawAddress.toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisCopyBuffer(status: MutPtr, buffer: MutPtr, poolhandle: ConstPtr, memorydescriptor: ConstPtr, offset: UInt, length: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(status.rawAddress.toString(), buffer.rawAddress.toString(), poolhandle.rawAddress.toString(), memorydescriptor.rawAddress.toString(), offset.toInt(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisDeregisterTdiCallBack() {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisFreeMemory(virtualaddress: ConstPtr, length: UInt, memoryflags: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress.rawAddress.toString(), length.toInt(), memoryflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr, pkernelanduser: MutPtr, pindex: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount.rawAddress.toString(), pkernelanduser.rawAddress.toString(), pindex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr): MutPtr =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) MutPtr(wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetSharedDataAlignment(): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisGetVersion(): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisGetVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr, protocolhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle.rawAddress.toString(), protocolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr, deviceinstance: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle.rawAddress.toString(), deviceinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr): MutPtr =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) MutPtr(wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr, driverinstance: ConstPtr, devicecontext: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle.rawAddress.toString(), driverinstance.rawAddress.toString(), devicecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisInitializeEvent(event: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeReadWriteLock(lock: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeString(destination: MutPtr, source: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisInitializeTimer(timer: MutPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer.rawAddress.toString(), 0L.toString(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: MutPtr, physicaladdress: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, virtualaddress.rawAddress.toString(), physicaladdress.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, context: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer.rawAddress.toString(), timercancelled.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCloseLog(loghandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr, ndisafhandle: ConstPtr, miniportvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle.rawAddress.toString(), ndisafhandle.rawAddress.toString(), miniportvccontext.rawAddress.toString(), ndisvchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr, addressfamily: MutPtr, cmcharacteristics: MutPtr, sizeofcmcharacteristics: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle.rawAddress.toString(), addressfamily.rawAddress.toString(), cmcharacteristics.rawAddress.toString(), sizeofcmcharacteristics.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status, ndisvchandle.rawAddress.toString(), callparameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status, ndisvchandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr, size: UInt, loghandle: MutPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle.rawAddress.toString(), size.toInt(), loghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt, portoffset: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle.rawAddress.toString(), initialport.toInt(), numberofports.toInt(), portoffset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFlushLog(loghandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: ConstPtr, physicaladdress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle.rawAddress.toString(), length.toInt(), cached, virtualaddress.rawAddress.toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr, physicaldeviceobject: MutPtr, functionaldeviceobject: MutPtr, nextdeviceobject: MutPtr, allocatedresources: MutPtr, allocatedresourcestranslated: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), functionaldeviceobject.rawAddress.toString(), nextdeviceobject.rawAddress.toString(), allocatedresources.rawAddress.toString(), allocatedresourcestranslated.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMInitializeTimer(timer: ConstPtr, miniportadapterhandle: ConstPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), 0L.toString(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr, miniportadapterhandle: ConstPtr, physicaladdress: Long, length: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), physicaladdress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr, miniporthandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename.rawAddress.toString(), miniporthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr): UInt =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr, miniportadapterhandle: ConstPtr, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr, maximumlength: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), dmachannel.toInt(), dma32bitaddresses, dmadescription.rawAddress.toString(), maximumlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr, miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset.rawAddress.toString(), miniportadapterhandle.rawAddress.toString(), initialport.toInt(), numberofports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr, millisecondperiod: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(timer.rawAddress.toString(), millisecondperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr, virtualaddress: ConstPtr, length: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle.rawAddress.toString(), virtualaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisMWriteLogData(loghandle: ConstPtr, logbuffer: ConstPtr, logbuffersize: UInt): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle.rawAddress.toString(), logbuffer.rawAddress.toString(), logbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisMapFile(status: MutPtr, mappedbuffer: MutPtr, filehandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status.rawAddress.toString(), mappedbuffer.rawAddress.toString(), filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr, configurationhandle: ConstPtr, index: UInt, keyname: MutPtr, keyhandle: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), index.toInt(), keyname.rawAddress.toString(), keyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr, configurationhandle: ConstPtr, subkeyname: ConstPtr, subkeyhandle: MutPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), subkeyname.rawAddress.toString(), subkeyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisOpenFile(status: MutPtr, filehandle: MutPtr, filelength: MutPtr, filename: ConstPtr, highestacceptableaddress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status.rawAddress.toString(), filehandle.rawAddress.toString(), filelength.rawAddress.toString(), filename.rawAddress.toString(), highestacceptableaddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr, ndisbindinghandle: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename.rawAddress.toString(), ndisbindinghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr, bindingcontext: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename.rawAddress.toString(), bindingcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadConfiguration(status: MutPtr, parametervalue: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametertype: NdisParameterType) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status.rawAddress.toString(), parametervalue.rawAddress.toString(), configurationhandle.rawAddress.toString(), keyword.rawAddress.toString(), parametertype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReadNetworkAddress(status: MutPtr, networkaddress: MutPtr, networkaddresslength: MutPtr, configurationhandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(status.rawAddress.toString(), networkaddress.rawAddress.toString(), networkaddresslength.rawAddress.toString(), configurationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisReleaseReadWriteLock(lock: MutPtr, lockstate: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock.rawAddress.toString(), lockstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisResetEvent(event: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetEvent(event: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr, millisecondsperiod: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer.rawAddress.toString(), millisecondsperiod.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimer(timer: ConstPtr, millisecondstodelay: UInt) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer.rawAddress.toString(), millisecondstodelay.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetTimerEx(ndistimer: ConstPtr, millisecondstodelay: UInt, functioncontext: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer.rawAddress.toString(), millisecondstodelay.toInt(), functioncontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSetupDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status.rawAddress.toString(), ndisdmahandle.rawAddress.toString(), buffer.rawAddress.toString(), offset.toInt(), length.toInt(), writetodevice)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisSystemProcessorCount(): Byte =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisUnmapFile(filehandle: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr, length: UInt, virtualaddress: MutPtr, physicaladdress: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle.rawAddress.toString(), length.toInt(), virtualaddress.rawAddress.toString(), physicaladdress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWaitEvent(event: ConstPtr, mstowait: UInt): Boolean =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event.rawAddress.toString(), mstowait.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndisWriteConfiguration(status: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametervalue: ConstPtr) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status.rawAddress.toString(), configurationhandle.rawAddress.toString(), keyword.rawAddress.toString(), parametervalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    if (windowsWdkNetworkmanagementNdisNapiAvailable) {
        wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle.rawAddress.toString(), errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr, datasize: UInt, data: ConstPtr): Int =
    if (windowsWdkNetworkmanagementNdisNapiAvailable) wasmWindowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle.rawAddress.toString(), eventcode, uniqueeventvalue.toInt(), numstrings.toInt(), stringslist.rawAddress.toString(), datasize.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
