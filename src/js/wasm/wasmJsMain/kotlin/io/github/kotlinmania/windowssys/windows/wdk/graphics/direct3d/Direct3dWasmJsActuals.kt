@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkGraphicsDirect3dNapiAddon(): Boolean

private val windowsWdkGraphicsDirect3dNapiAvailable: Boolean = initWindowsWdkGraphicsDirect3dNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTAdjustFullscreenGamma(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTAdjustFullscreenGamma(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCancelPresents(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCancelPresents(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeSurfacePointer(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTChangeSurfacePointer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeVideoMemoryReservation(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTChangeVideoMemoryReservation(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership()")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMonitorPowerState(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMonitorPowerState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport3(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport3(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckOcclusion(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckOcclusion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckSharedResourceAccess(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckSharedResourceAccess(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckVidPnExclusiveOwnership(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckVidPnExclusiveOwnership(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCloseAdapter(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCloseAdapter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTConfigureSharedResource(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTConfigureSharedResource(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContext(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContextVirtual(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContextVirtual(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDCFromMemory(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDCFromMemory(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDevice(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDevice(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwContext(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOutputDupl(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOutputDupl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOverlay(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOverlay(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreatePagingQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreatePagingQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateProtectedSession(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateProtectedSession(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyContext(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDCFromMemory(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDCFromMemory(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDevice(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDevice(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwContext(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyKeyedMutex(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyKeyedMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOutputDupl(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOutputDupl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOverlay(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOverlay(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyPagingQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyPagingQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyProtectedSession(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyProtectedSession(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroySynchronizationObject(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroySynchronizationObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters3(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters3(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTEscape(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEscape(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTEvict(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEvict(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTFlipOverlay(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTFlipOverlay(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTFlushHeapTransitions(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTFlushHeapTransitions(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTFreeGpuVirtualAddress(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTFreeGpuVirtualAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetAllocationPriority(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetAllocationPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextInProcessSchedulingPriority(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextInProcessSchedulingPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextSchedulingPriority(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextSchedulingPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDWMVerticalBlankEvent(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetDWMVerticalBlankEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDeviceState(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetDeviceState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDisplayModeList(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetDisplayModeList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultiPlaneOverlayCaps(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultiPlaneOverlayCaps(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultisampleMethodList(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultisampleMethodList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetOverlayState(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetOverlayState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPostCompositionCaps(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetPostCompositionCaps(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentHistory(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentHistory(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentQueueEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentQueueEvent(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessDeviceRemovalSupport(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessDeviceRemovalSupport(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessSchedulingPriorityClass(p0, p1)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessSchedulingPriorityClass(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetResourcePresentPrivateDriverData(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetResourcePresentPrivateDriverData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetRuntimeData(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetRuntimeData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetScanLine(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetScanLine(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedPrimaryHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedPrimaryHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedResourceAdapterLuid(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedResourceAdapterLuid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateActiveVidPn(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateActiveVidPn(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateCache(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateCache(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTLock(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTLock2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTLock2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTMakeResident(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTMakeResident(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTMapGpuVirtualAddress(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTMapGpuVirtualAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTMarkDeviceAsError(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTMarkDeviceAsError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOfferAllocations(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOfferAllocations(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromDeviceName(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromDeviceName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromGdiDisplayName(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromGdiDisplayName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromHdc(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromHdc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromLuid(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromLuid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutexFromNtHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutexFromNtHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenNtHandleFromName(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenNtHandleFromName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenProtectedSessionFromNtHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenProtectedSessionFromNtHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResourceFromNtHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResourceFromNtHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectNtHandleFromName(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectNtHandleFromName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSynchronizationObject(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSynchronizationObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetFrameInfo(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetFrameInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetMetaData(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetMetaData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetPointerShapeData(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetPointerShapeData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresent(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresentToHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresentToHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplReleaseFrame(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplReleaseFrame(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTPollDisplayChildren(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPollDisplayChildren(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresent(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay3(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay3(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentRedirected(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentRedirected(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAdapterInfo(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAdapterInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAllocationResidency(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAllocationResidency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryClockCalibration(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryClockCalibration(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryFSEBlock(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryFSEBlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProcessOfferInfo(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProcessOfferInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionInfoFromNtHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionInfoFromNtHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionStatus(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfo(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfoFromNtHandle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfoFromNtHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryStatistics(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryStatistics(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVidPnExclusiveOwnership(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVidPnExclusiveOwnership(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVideoMemoryInfo(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVideoMemoryInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterTrimNotification(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterTrimNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterVailProcess(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterVailProcess(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseProcessVidPnSourceOwners(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseProcessVidPnSourceOwners(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTRender(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTRender(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTReserveGpuVirtualAddress(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReserveGpuVirtualAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetAllocationPriority(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetAllocationPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextInProcessSchedulingPriority(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextInProcessSchedulingPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextSchedulingPriority(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextSchedulingPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayMode(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayPrivateDriverFormat(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayPrivateDriverFormat(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetFSEBlock(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetFSEBlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetGammaRamp(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetGammaRamp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetHwProtectionTeardownRecovery(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetHwProtectionTeardownRecovery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetMonitorColorSpaceTransform(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetMonitorColorSpaceTransform(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetProcessSchedulingPriorityClass(p0, p1)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetProcessSchedulingPriorityClass(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetQueuedLimit(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetQueuedLimit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetStablePowerState(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetStablePowerState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetSyncRefreshCountWaitTarget(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetSyncRefreshCountWaitTarget(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceHwProtection(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceHwProtection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner1(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner1(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner2(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTShareObjects(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTShareObjects(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryLockNotification(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryLockNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryUnLockNotification(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryUnLockNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromCpu(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromCpu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommand(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommand(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommandToHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommandToHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentBltToHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentBltToHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentToHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentToHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitSignalSyncObjectsToHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitSignalSyncObjectsToHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitWaitForSyncObjectsToHwQueue(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitWaitForSyncObjectsToHwQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTTrimProcessCommitment(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTTrimProcessCommitment(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTUnregisterTrimNotification(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUnregisterTrimNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateAllocationProperty(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateAllocationProperty(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateGpuVirtualAddress(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateGpuVirtualAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateOverlay(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateOverlay(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForIdle(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForIdle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromCpu(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromCpu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromGpu(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromGpu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent2(p0)")
private external fun wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent2(p0: String): Int

public actual fun d3DKMTAcquireKeyedMutex(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTAcquireKeyedMutex2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTAdjustFullscreenGamma(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTAdjustFullscreenGamma(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCancelPresents(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCancelPresents(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTChangeSurfacePointer(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTChangeSurfacePointer(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTChangeVideoMemoryReservation(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTChangeVideoMemoryReservation(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckExclusiveOwnership(): Boolean =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckMonitorPowerState(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMonitorPowerState(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckMultiPlaneOverlaySupport(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckMultiPlaneOverlaySupport2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckMultiPlaneOverlaySupport3(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport3(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckOcclusion(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckOcclusion(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckSharedResourceAccess(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckSharedResourceAccess(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCheckVidPnExclusiveOwnership(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckVidPnExclusiveOwnership(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCloseAdapter(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCloseAdapter(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTConfigureSharedResource(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTConfigureSharedResource(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateAllocation(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateAllocation2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateContext(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContext(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateContextVirtual(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContextVirtual(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateDCFromMemory(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDCFromMemory(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateDevice(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDevice(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateHwContext(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwContext(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateHwQueue(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateKeyedMutex(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateKeyedMutex2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateOutputDupl(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOutputDupl(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateOverlay(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOverlay(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreatePagingQueue(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreatePagingQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateProtectedSession(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateProtectedSession(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateSynchronizationObject(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTCreateSynchronizationObject2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyAllocation(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyAllocation2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyContext(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyContext(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyDCFromMemory(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDCFromMemory(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyDevice(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDevice(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyHwContext(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwContext(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyHwQueue(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyKeyedMutex(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyKeyedMutex(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyOutputDupl(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOutputDupl(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyOverlay(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOverlay(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyPagingQueue(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyPagingQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroyProtectedSession(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyProtectedSession(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTDestroySynchronizationObject(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTDestroySynchronizationObject(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTEnumAdapters(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTEnumAdapters2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTEnumAdapters3(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters3(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTEscape(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEscape(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTEvict(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTEvict(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTFlipOverlay(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTFlipOverlay(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTFlushHeapTransitions(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTFlushHeapTransitions(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTFreeGpuVirtualAddress(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTFreeGpuVirtualAddress(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetAllocationPriority(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetAllocationPriority(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetContextInProcessSchedulingPriority(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextInProcessSchedulingPriority(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetContextSchedulingPriority(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextSchedulingPriority(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetDWMVerticalBlankEvent(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetDWMVerticalBlankEvent(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetDeviceState(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetDeviceState(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetDisplayModeList(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetDisplayModeList(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetMultiPlaneOverlayCaps(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultiPlaneOverlayCaps(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetMultisampleMethodList(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultisampleMethodList(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetOverlayState(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetOverlayState(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetPostCompositionCaps(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetPostCompositionCaps(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetPresentHistory(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentHistory(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetPresentQueueEvent(hadapter: UInt, param1: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentQueueEvent(hadapter.toInt(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetProcessDeviceRemovalSupport(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessDeviceRemovalSupport(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetProcessSchedulingPriorityClass(param0: Handle, param1: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessSchedulingPriorityClass(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetResourcePresentPrivateDriverData(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetResourcePresentPrivateDriverData(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetRuntimeData(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetRuntimeData(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetScanLine(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetScanLine(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetSharedPrimaryHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedPrimaryHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTGetSharedResourceAdapterLuid(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedResourceAdapterLuid(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTInvalidateActiveVidPn(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateActiveVidPn(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTInvalidateCache(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateCache(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTLock(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTLock(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTLock2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTLock2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTMakeResident(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTMakeResident(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTMapGpuVirtualAddress(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTMapGpuVirtualAddress(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTMarkDeviceAsError(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTMarkDeviceAsError(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOfferAllocations(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOfferAllocations(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenAdapterFromDeviceName(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromDeviceName(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenAdapterFromGdiDisplayName(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromGdiDisplayName(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenAdapterFromHdc(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromHdc(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenAdapterFromLuid(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromLuid(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenKeyedMutex(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenKeyedMutex2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenKeyedMutexFromNtHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutexFromNtHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenNtHandleFromName(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenNtHandleFromName(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenProtectedSessionFromNtHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenProtectedSessionFromNtHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenResource(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenResource2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenResourceFromNtHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResourceFromNtHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenSyncObjectFromNtHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenSyncObjectFromNtHandle2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenSyncObjectNtHandleFromName(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectNtHandleFromName(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOpenSynchronizationObject(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSynchronizationObject(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOutputDuplGetFrameInfo(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetFrameInfo(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOutputDuplGetMetaData(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetMetaData(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOutputDuplGetPointerShapeData(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetPointerShapeData(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOutputDuplPresent(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresent(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOutputDuplPresentToHwQueue(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresentToHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTOutputDuplReleaseFrame(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplReleaseFrame(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTPollDisplayChildren(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPollDisplayChildren(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTPresent(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresent(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTPresentMultiPlaneOverlay(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTPresentMultiPlaneOverlay2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTPresentMultiPlaneOverlay3(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay3(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTPresentRedirected(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTPresentRedirected(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryAdapterInfo(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAdapterInfo(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryAllocationResidency(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAllocationResidency(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryClockCalibration(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryClockCalibration(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryFSEBlock(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryFSEBlock(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryProcessOfferInfo(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProcessOfferInfo(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryProtectedSessionInfoFromNtHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionInfoFromNtHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryProtectedSessionStatus(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionStatus(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryResourceInfo(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfo(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryResourceInfoFromNtHandle(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfoFromNtHandle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryStatistics(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryStatistics(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryVidPnExclusiveOwnership(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVidPnExclusiveOwnership(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTQueryVideoMemoryInfo(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVideoMemoryInfo(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTReclaimAllocations(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTReclaimAllocations2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTRegisterTrimNotification(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterTrimNotification(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTRegisterVailProcess(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterVailProcess(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTReleaseKeyedMutex(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTReleaseKeyedMutex2(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTReleaseProcessVidPnSourceOwners(param0: Handle): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseProcessVidPnSourceOwners(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTRender(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTRender(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTReserveGpuVirtualAddress(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTReserveGpuVirtualAddress(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetAllocationPriority(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetAllocationPriority(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetContextInProcessSchedulingPriority(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextInProcessSchedulingPriority(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetContextSchedulingPriority(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextSchedulingPriority(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetDisplayMode(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayMode(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetDisplayPrivateDriverFormat(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayPrivateDriverFormat(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetFSEBlock(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetFSEBlock(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetGammaRamp(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetGammaRamp(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetHwProtectionTeardownRecovery(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetHwProtectionTeardownRecovery(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetMonitorColorSpaceTransform(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetMonitorColorSpaceTransform(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetProcessSchedulingPriorityClass(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetProcessSchedulingPriorityClass(param0.rawAddress.toString(), param1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetQueuedLimit(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetQueuedLimit(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetStablePowerState(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetStablePowerState(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetSyncRefreshCountWaitTarget(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetSyncRefreshCountWaitTarget(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetVidPnSourceHwProtection(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceHwProtection(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetVidPnSourceOwner(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetVidPnSourceOwner1(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner1(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSetVidPnSourceOwner2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTShareObjects(cobjects: UInt, hobjects: ConstPtr, pobjectattributes: ConstPtr, dwdesiredaccess: UInt, phsharednthandle: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTShareObjects(cobjects.toInt(), hobjects.rawAddress.toString(), pobjectattributes.rawAddress.toString(), dwdesiredaccess.toInt(), phsharednthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSharedPrimaryLockNotification(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryLockNotification(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSharedPrimaryUnLockNotification(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryUnLockNotification(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSignalSynchronizationObject(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSignalSynchronizationObject2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSignalSynchronizationObjectFromCpu(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromCpu(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSignalSynchronizationObjectFromGpu(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSignalSynchronizationObjectFromGpu2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSubmitCommand(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommand(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSubmitCommandToHwQueue(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommandToHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSubmitPresentBltToHwQueue(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentBltToHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSubmitPresentToHwQueue(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentToHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSubmitSignalSyncObjectsToHwQueue(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitSignalSyncObjectsToHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitWaitForSyncObjectsToHwQueue(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTTrimProcessCommitment(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTTrimProcessCommitment(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTUnlock(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTUnlock2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTUnregisterTrimNotification(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUnregisterTrimNotification(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTUpdateAllocationProperty(param0: MutPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateAllocationProperty(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTUpdateGpuVirtualAddress(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateGpuVirtualAddress(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTUpdateOverlay(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateOverlay(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForIdle(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForIdle(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForSynchronizationObject(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForSynchronizationObject2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForSynchronizationObjectFromCpu(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromCpu(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForSynchronizationObjectFromGpu(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromGpu(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForVerticalBlankEvent(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun d3DKMTWaitForVerticalBlankEvent2(param0: ConstPtr): Ntstatus =
    if (windowsWdkGraphicsDirect3dNapiAvailable) wasmWindowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent2(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
