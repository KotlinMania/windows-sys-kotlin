@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemHypervisorNapiAddon(): Boolean

private val windowsWin32SystemHypervisorNapiAvailable: Boolean = initWindowsWin32SystemHypervisorNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorCallStackUnwind(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorCallStackUnwind(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorForceArchitecture(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorForceArchitecture(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorForceNestedHostMode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorForceNestedHostMode(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorForcePagingMode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorForcePagingMode(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetArchitecture(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetArchitecture(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetGuestOsInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetPagingMode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetPagingMode(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetRegisterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetRegisterValue(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGetVpCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGetVpCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorInKernelSpace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorInKernelSpace(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCreatePartition(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCreatePartition(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCreateTrigger(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvDeletePartition(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvDeletePartition(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetCapability(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetCapability(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvMapGpaRange(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvResetPartition(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvResetPartition(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSetupPartition(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSetupPartition(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvTranslateGva(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvTranslateGva(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(p0: String, p1: String, p2: String, p3: String): Int

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr, fixbuffersize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualaddress.toString(), fixbuffer.rawAddress.toString(), fixbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(vmrsfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callStackUnwind(vmsavedstatedumphandle: MutPtr, vpid: UInt, imageinfo: ConstPtr, imageinfocount: UInt, framecount: UInt, callstack: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorCallStackUnwind(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), imageinfo.rawAddress.toString(), imageinfocount.toInt(), framecount.toInt(), callstack.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr, found: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), typename.rawAddress.toString(), fieldname.rawAddress.toString(), offset.rawAddress.toString(), found.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualtrustlevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorForceArchitecture(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), architecture) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, hostmode: Bool, oldmode: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorForceNestedHostMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), hostmode, oldmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forcePagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: PagingMode): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorForcePagingMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), pagingmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualtrustlevel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetArchitecture(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), architecture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevels: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualtrustlevels.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, virtualtrustlevels: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress.toString(), virtualtrustlevels.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr, virtualtrustlevel: UByte, guestosinfo: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetGuestOsInfo(vmsavedstatedumphandle.rawAddress.toString(), virtualtrustlevel.toInt(), guestosinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr, memorychunkpagesize: MutPtr, memorychunks: MutPtr, memorychunkcount: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(vmsavedstatedumphandle.rawAddress.toString(), memorychunkpagesize.rawAddress.toString(), memorychunks.rawAddress.toString(), memorychunkcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr, guestrawsavedmemorysize: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(vmsavedstatedumphandle.rawAddress.toString(), guestrawsavedmemorysize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress.toString(), memoryblockcachelimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, enabled: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), enabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetPagingMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), pagingmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisterValue(vmsavedstatedumphandle: MutPtr, vpid: UInt, registerid: UInt, registervalue: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetRegisterValue(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), registerid.toInt(), registervalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), typename.rawAddress.toString(), typefieldinfomap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr): Handle =
    if (windowsWin32SystemHypervisorNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(vmsavedstatedumphandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, size: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), typename.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVpCount(vmsavedstatedumphandle: MutPtr, vpcount: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGetVpCount(vmsavedstatedumphandle.rawAddress.toString(), vpcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle.rawAddress.toString(), physicaladdress.toString(), rawsavedmemoryoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr, unmappedregionsize: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualaddress.toString(), physicaladdress.rawAddress.toString(), unmappedregionsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr, devicetype: HdvDeviceType, deviceclassid: ConstPtr, deviceinstanceid: ConstPtr, deviceinterface: ConstPtr, devicecontext: ConstPtr, devicehandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(devicehosthandle.rawAddress.toString(), devicetype, deviceclassid.rawAddress.toString(), deviceinstanceid.rawAddress.toString(), deviceinterface.rawAddress.toString(), devicecontext.rawAddress.toString(), devicehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateGuestMemoryAperture(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(requestor.rawAddress.toString(), guestphysicaladdress.toString(), bytecount.toInt(), writeprotected, mappedaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(requestor.rawAddress.toString(), barindex, offsetinpages.toString(), lengthinpages.toString(), mappingflags, sectionhandle.rawAddress.toString(), sectionoffsetinpages.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDeliverGuestInterrupt(requestor: ConstPtr, msiaddress: ULong, msidata: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(requestor.rawAddress.toString(), msiaddress.toString(), msidata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr, mappedaddress: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(requestor.rawAddress.toString(), mappedaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(requestor.rawAddress.toString(), barindex, offsetinpages.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(computesystem.rawAddress.toString(), devicehosthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(computesystem.rawAddress.toString(), flags, devicehosthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvReadGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(requestor.rawAddress.toString(), guestphysicaladdress.toString(), bytecount.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvRegisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(requestor.rawAddress.toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString(), doorbellevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(devicehosthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvUnregisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(requestor.rawAddress.toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvWriteGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(requestor.rawAddress.toString(), guestphysicaladdress.toString(), bytecount.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inKernelSpace(vmsavedstatedumphandle: MutPtr, vpid: UInt, inkernelspace: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorInKernelSpace(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), inkernelspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr, vpid: UInt, activevirtualtrustlevelenabled: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), activevirtualtrustlevelenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr, enabled: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(vmsavedstatedumphandle.rawAddress.toString(), enabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateFile(vmrsfile.rawAddress.toString(), vmsavedstatedumphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(binfile.rawAddress.toString(), vsvfile.rawAddress.toString(), vmsavedstatedumphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(vmsavedstatedumphandle.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseaddress.toString(), sizeofbase.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle.rawAddress.toString(), imagename.rawAddress.toString(), imagetimestamp.toInt(), modulename.rawAddress.toString(), baseaddress.toString(), sizeofbase.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr, usersymbols: Pcwstr, force: Bool): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress.toString(), usersymbols.rawAddress.toString(), force) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr, vsvpath: MutPtr, vmrspath: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(vmname.rawAddress.toString(), snapshotname.rawAddress.toString(), binpath.rawAddress.toString(), vsvpath.rawAddress.toString(), vmrspath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(vmsavedstatedumphandle.rawAddress.toString(), physicaladdress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), bytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr, rawsavedmemoryoffset: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(vmsavedstatedumphandle.rawAddress.toString(), rawsavedmemoryoffset.toString(), buffer.rawAddress.toString(), buffersize.toInt(), bytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, buffer: MutPtr, buffersize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), globalname.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(vmsavedstatedumphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr, size: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), globalname.rawAddress.toString(), virtualaddress.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr, standaloneaddresscount: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), startaddress.toString(), endaddress.toString(), callbackcontext.rawAddress.toString(), 0L.toString(), standaloneaddress.rawAddress.toString(), standaloneaddresscount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress.toString(), memoryblockcachelimit.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(migrationhandle.rawAddress.toString(), partition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr, advicebuffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(partition.toString(), gparanges.rawAddress.toString(), gparangescount.toInt(), advice, advicebuffer.rawAddress.toString(), advicebuffersizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAllocateVpciResource(providerid: ConstPtr, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(providerid.rawAddress.toString(), flags, resourcedescriptor.rawAddress.toString(), resourcedescriptorsizeinbytes.toInt(), vpciresource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr, eventhandle: Handle, porthandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(partition.toString(), parameters.rawAddress.toString(), eventhandle.rawAddress.toString(), porthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreatePartition(partition: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCreatePartition(partition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: MutPtr, eventhandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCreateTrigger(partition.toString(), parameters.rawAddress.toString(), triggerhandle.rawAddress.toString(), eventhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr, propertycount: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(partition.toString(), vpindex.toInt(), properties.rawAddress.toString(), propertycount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(partition.toString(), logicaldeviceid.toString(), vpciresource.rawAddress.toString(), flags, notificationeventhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(partition.toString(), porthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(partition.toString(), triggerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition.toString(), vpindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition.toString(), logicaldeviceid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorCreateEmulator(callbacks: ConstPtr, emulator: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(callbacks.rawAddress.toString(), emulator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorDestroyEmulator(emulator: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(emulator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorTryIoEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, ioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(emulator.rawAddress.toString(), context.rawAddress.toString(), vpcontext.rawAddress.toString(), ioinstructioncontext.rawAddress.toString(), emulatorreturnstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, mmioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(emulator.rawAddress.toString(), context.rawAddress.toString(), vpcontext.rawAddress.toString(), mmioinstructioncontext.rawAddress.toString(), emulatorreturnstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetCapability(capabilitycode, capabilitybuffer.rawAddress.toString(), capabilitybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr, vpcount: UInt, targetvpcount: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(partition.toString(), destination.toString(), destinationmode, targetvps.rawAddress.toString(), vpcount.toInt(), targetvpcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(partition.toString(), counterset, buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(partition.toString(), propertycode, propertybuffer.rawAddress.toString(), propertybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(partition.toString(), vpindex.toInt(), counterset, buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(partition.toString(), vpindex.toInt(), eax.toInt(), ecx.toInt(), cpuidoutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt(), writtensize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt(), writtensize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), registernames.rawAddress.toString(), registercount.toInt(), registervalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr, targetsizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(partition.toString(), logicaldeviceid.toString(), index.toInt(), multimessagenumber.toInt(), target.rawAddress.toString(), targetsizeinbytes.toInt(), byteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr, notificationsizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(partition.toString(), logicaldeviceid.toString(), notification.rawAddress.toString(), notificationsizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(partition.toString(), logicaldeviceid.toString(), propertycode, propertybuffer.rawAddress.toString(), propertybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvMapGpaRange(partition.toString(), sourceaddress.rawAddress.toString(), guestaddress.toString(), sizeinbytes.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(partition.toString(), process.rawAddress.toString(), sourceaddress.rawAddress.toString(), guestaddress.toString(), sizeinbytes.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr, msiaddress: MutPtr, msidata: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt(), messagecount.toInt(), target.rawAddress.toString(), msiaddress.rawAddress.toString(), msidata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr, mappings: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString(), mappingcount.rawAddress.toString(), mappings.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr, messagesizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(partition.toString(), vpindex.toInt(), sintindex.toInt(), message.rawAddress.toString(), messagesizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr, bitmapsizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(partition.toString(), guestaddress.toString(), rangesizeinbytes.toString(), bitmap.rawAddress.toString(), bitmapsizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), register.rawAddress.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr, eventhandle: Handle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(partition.toString(), matchdata.rawAddress.toString(), eventhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr, interruptcontrolsize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(partition.toString(), interrupt.rawAddress.toString(), interruptcontrolsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvResetPartition(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt(), target.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr, exitcontextsizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(partition.toString(), vpindex.toInt(), exitcontext.rawAddress.toString(), exitcontextsizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(partition.toString(), porthandle.rawAddress.toString(), propertycode, propertyvalue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr, propertybuffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(partition.toString(), propertycode, propertybuffer.rawAddress.toString(), propertybuffersizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), registernames.rawAddress.toString(), registercount.toInt(), registervalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, buffer.rawAddress.toString(), buffersizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), buffer.rawAddress.toString(), buffersizeinbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition.toString(), logicaldeviceid.toString(), powerstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(partition.toString(), migrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr, gpa: MutPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvTranslateGva(partition.toString(), vpindex.toInt(), gva.toString(), translateflags, translationresult.rawAddress.toString(), gpa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition.toString(), guestaddress.toString(), sizeinbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(partition.toString(), matchdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(partition.toString(), parameters.rawAddress.toString(), triggerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: ConstPtr): Hresult =
    if (windowsWin32SystemHypervisorNapiAvailable) wasmWindowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), register.rawAddress.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
