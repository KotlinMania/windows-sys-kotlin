@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWdkGraphicsDirect3dNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun D3DKMTAcquireKeyedMutex(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTAcquireKeyedMutex(param0.toString()) as Int) else 0

public actual fun D3DKMTAcquireKeyedMutex2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTAcquireKeyedMutex2(param0.toString()) as Int) else 0

public actual fun D3DKMTAdjustFullscreenGamma(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTAdjustFullscreenGamma(param0.toString()) as Int) else 0

public actual fun D3DKMTCancelPresents(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCancelPresents(param0.toString()) as Int) else 0

public actual fun D3DKMTChangeSurfacePointer(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTChangeSurfacePointer(param0.toString()) as Int) else 0

public actual fun D3DKMTChangeVideoMemoryReservation(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTChangeVideoMemoryReservation(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckExclusiveOwnership(): Boolean =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckExclusiveOwnership() as Boolean) else false

public actual fun D3DKMTCheckMonitorPowerState(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckMonitorPowerState(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckMultiPlaneOverlaySupport(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckMultiPlaneOverlaySupport(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckMultiPlaneOverlaySupport2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckMultiPlaneOverlaySupport2(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckMultiPlaneOverlaySupport3(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckMultiPlaneOverlaySupport3(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckOcclusion(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckOcclusion(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckSharedResourceAccess(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckSharedResourceAccess(param0.toString()) as Int) else 0

public actual fun D3DKMTCheckVidPnExclusiveOwnership(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCheckVidPnExclusiveOwnership(param0.toString()) as Int) else 0

public actual fun D3DKMTCloseAdapter(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCloseAdapter(param0.toString()) as Int) else 0

public actual fun D3DKMTConfigureSharedResource(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTConfigureSharedResource(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateAllocation(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateAllocation(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateAllocation2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateAllocation2(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateContext(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateContext(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateContextVirtual(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateContextVirtual(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateDCFromMemory(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateDCFromMemory(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateDevice(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateDevice(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateHwContext(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateHwContext(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateKeyedMutex(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateKeyedMutex(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateKeyedMutex2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateKeyedMutex2(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateOutputDupl(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateOutputDupl(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateOverlay(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateOverlay(param0.toString()) as Int) else 0

public actual fun D3DKMTCreatePagingQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreatePagingQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateProtectedSession(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateProtectedSession(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateSynchronizationObject(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateSynchronizationObject(param0.toString()) as Int) else 0

public actual fun D3DKMTCreateSynchronizationObject2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTCreateSynchronizationObject2(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyAllocation(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyAllocation(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyAllocation2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyAllocation2(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyContext(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyContext(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyDCFromMemory(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyDCFromMemory(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyDevice(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyDevice(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyHwContext(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyHwContext(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyKeyedMutex(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyKeyedMutex(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyOutputDupl(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyOutputDupl(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyOverlay(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyOverlay(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyPagingQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyPagingQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroyProtectedSession(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroyProtectedSession(param0.toString()) as Int) else 0

public actual fun D3DKMTDestroySynchronizationObject(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTDestroySynchronizationObject(param0.toString()) as Int) else 0

public actual fun D3DKMTEnumAdapters(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTEnumAdapters(param0.toString()) as Int) else 0

public actual fun D3DKMTEnumAdapters2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTEnumAdapters2(param0.toString()) as Int) else 0

public actual fun D3DKMTEnumAdapters3(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTEnumAdapters3(param0.toString()) as Int) else 0

public actual fun D3DKMTEscape(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTEscape(param0.toString()) as Int) else 0

public actual fun D3DKMTEvict(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTEvict(param0.toString()) as Int) else 0

public actual fun D3DKMTFlipOverlay(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTFlipOverlay(param0.toString()) as Int) else 0

public actual fun D3DKMTFlushHeapTransitions(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTFlushHeapTransitions(param0.toString()) as Int) else 0

public actual fun D3DKMTFreeGpuVirtualAddress(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTFreeGpuVirtualAddress(param0.toString()) as Int) else 0

public actual fun D3DKMTGetAllocationPriority(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetAllocationPriority(param0.toString()) as Int) else 0

public actual fun D3DKMTGetContextInProcessSchedulingPriority(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetContextInProcessSchedulingPriority(param0.toString()) as Int) else 0

public actual fun D3DKMTGetContextSchedulingPriority(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetContextSchedulingPriority(param0.toString()) as Int) else 0

public actual fun D3DKMTGetDWMVerticalBlankEvent(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetDWMVerticalBlankEvent(param0.toString()) as Int) else 0

public actual fun D3DKMTGetDeviceState(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetDeviceState(param0.toString()) as Int) else 0

public actual fun D3DKMTGetDisplayModeList(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetDisplayModeList(param0.toString()) as Int) else 0

public actual fun D3DKMTGetMultiPlaneOverlayCaps(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetMultiPlaneOverlayCaps(param0.toString()) as Int) else 0

public actual fun D3DKMTGetMultisampleMethodList(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetMultisampleMethodList(param0.toString()) as Int) else 0

public actual fun D3DKMTGetOverlayState(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetOverlayState(param0.toString()) as Int) else 0

public actual fun D3DKMTGetPostCompositionCaps(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetPostCompositionCaps(param0.toString()) as Int) else 0

public actual fun D3DKMTGetPresentHistory(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetPresentHistory(param0.toString()) as Int) else 0

public actual fun D3DKMTGetPresentQueueEvent(hadapter: UInt, param1: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetPresentQueueEvent(hadapter.toInt(), param1.toString()) as Int) else 0

public actual fun D3DKMTGetProcessDeviceRemovalSupport(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetProcessDeviceRemovalSupport(param0.toString()) as Int) else 0

public actual fun D3DKMTGetProcessSchedulingPriorityClass(param0: HANDLE, param1: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetProcessSchedulingPriorityClass(param0.toString(), param1.toString()) as Int) else 0

public actual fun D3DKMTGetResourcePresentPrivateDriverData(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetResourcePresentPrivateDriverData(param0.toString()) as Int) else 0

public actual fun D3DKMTGetRuntimeData(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetRuntimeData(param0.toString()) as Int) else 0

public actual fun D3DKMTGetScanLine(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetScanLine(param0.toString()) as Int) else 0

public actual fun D3DKMTGetSharedPrimaryHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetSharedPrimaryHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTGetSharedResourceAdapterLuid(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTGetSharedResourceAdapterLuid(param0.toString()) as Int) else 0

public actual fun D3DKMTInvalidateActiveVidPn(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTInvalidateActiveVidPn(param0.toString()) as Int) else 0

public actual fun D3DKMTInvalidateCache(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTInvalidateCache(param0.toString()) as Int) else 0

public actual fun D3DKMTLock(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTLock(param0.toString()) as Int) else 0

public actual fun D3DKMTLock2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTLock2(param0.toString()) as Int) else 0

public actual fun D3DKMTMakeResident(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTMakeResident(param0.toString()) as Int) else 0

public actual fun D3DKMTMapGpuVirtualAddress(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTMapGpuVirtualAddress(param0.toString()) as Int) else 0

public actual fun D3DKMTMarkDeviceAsError(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTMarkDeviceAsError(param0.toString()) as Int) else 0

public actual fun D3DKMTOfferAllocations(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOfferAllocations(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenAdapterFromDeviceName(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenAdapterFromDeviceName(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenAdapterFromGdiDisplayName(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenAdapterFromGdiDisplayName(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenAdapterFromHdc(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenAdapterFromHdc(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenAdapterFromLuid(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenAdapterFromLuid(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenKeyedMutex(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenKeyedMutex(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenKeyedMutex2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenKeyedMutex2(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenKeyedMutexFromNtHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenKeyedMutexFromNtHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenNtHandleFromName(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenNtHandleFromName(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenProtectedSessionFromNtHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenProtectedSessionFromNtHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenResource(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenResource(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenResource2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenResource2(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenResourceFromNtHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenResourceFromNtHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenSyncObjectFromNtHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenSyncObjectFromNtHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenSyncObjectFromNtHandle2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenSyncObjectFromNtHandle2(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenSyncObjectNtHandleFromName(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenSyncObjectNtHandleFromName(param0.toString()) as Int) else 0

public actual fun D3DKMTOpenSynchronizationObject(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOpenSynchronizationObject(param0.toString()) as Int) else 0

public actual fun D3DKMTOutputDuplGetFrameInfo(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOutputDuplGetFrameInfo(param0.toString()) as Int) else 0

public actual fun D3DKMTOutputDuplGetMetaData(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOutputDuplGetMetaData(param0.toString()) as Int) else 0

public actual fun D3DKMTOutputDuplGetPointerShapeData(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOutputDuplGetPointerShapeData(param0.toString()) as Int) else 0

public actual fun D3DKMTOutputDuplPresent(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOutputDuplPresent(param0.toString()) as Int) else 0

public actual fun D3DKMTOutputDuplPresentToHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOutputDuplPresentToHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTOutputDuplReleaseFrame(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTOutputDuplReleaseFrame(param0.toString()) as Int) else 0

public actual fun D3DKMTPollDisplayChildren(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTPollDisplayChildren(param0.toString()) as Int) else 0

public actual fun D3DKMTPresent(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTPresent(param0.toString()) as Int) else 0

public actual fun D3DKMTPresentMultiPlaneOverlay(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTPresentMultiPlaneOverlay(param0.toString()) as Int) else 0

public actual fun D3DKMTPresentMultiPlaneOverlay2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTPresentMultiPlaneOverlay2(param0.toString()) as Int) else 0

public actual fun D3DKMTPresentMultiPlaneOverlay3(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTPresentMultiPlaneOverlay3(param0.toString()) as Int) else 0

public actual fun D3DKMTPresentRedirected(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTPresentRedirected(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryAdapterInfo(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryAdapterInfo(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryAllocationResidency(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryAllocationResidency(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryClockCalibration(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryClockCalibration(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryFSEBlock(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryFSEBlock(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryProcessOfferInfo(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryProcessOfferInfo(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryProtectedSessionInfoFromNtHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryProtectedSessionInfoFromNtHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryProtectedSessionStatus(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryProtectedSessionStatus(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryResourceInfo(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryResourceInfo(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryResourceInfoFromNtHandle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryResourceInfoFromNtHandle(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryStatistics(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryStatistics(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryVidPnExclusiveOwnership(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryVidPnExclusiveOwnership(param0.toString()) as Int) else 0

public actual fun D3DKMTQueryVideoMemoryInfo(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTQueryVideoMemoryInfo(param0.toString()) as Int) else 0

public actual fun D3DKMTReclaimAllocations(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTReclaimAllocations(param0.toString()) as Int) else 0

public actual fun D3DKMTReclaimAllocations2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTReclaimAllocations2(param0.toString()) as Int) else 0

public actual fun D3DKMTRegisterTrimNotification(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTRegisterTrimNotification(param0.toString()) as Int) else 0

public actual fun D3DKMTRegisterVailProcess(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTRegisterVailProcess(param0.toString()) as Int) else 0

public actual fun D3DKMTReleaseKeyedMutex(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTReleaseKeyedMutex(param0.toString()) as Int) else 0

public actual fun D3DKMTReleaseKeyedMutex2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTReleaseKeyedMutex2(param0.toString()) as Int) else 0

public actual fun D3DKMTReleaseProcessVidPnSourceOwners(param0: HANDLE): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTReleaseProcessVidPnSourceOwners(param0.toString()) as Int) else 0

public actual fun D3DKMTRender(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTRender(param0.toString()) as Int) else 0

public actual fun D3DKMTReserveGpuVirtualAddress(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTReserveGpuVirtualAddress(param0.toString()) as Int) else 0

public actual fun D3DKMTSetAllocationPriority(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetAllocationPriority(param0.toString()) as Int) else 0

public actual fun D3DKMTSetContextInProcessSchedulingPriority(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetContextInProcessSchedulingPriority(param0.toString()) as Int) else 0

public actual fun D3DKMTSetContextSchedulingPriority(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetContextSchedulingPriority(param0.toString()) as Int) else 0

public actual fun D3DKMTSetDisplayMode(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetDisplayMode(param0.toString()) as Int) else 0

public actual fun D3DKMTSetDisplayPrivateDriverFormat(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetDisplayPrivateDriverFormat(param0.toString()) as Int) else 0

public actual fun D3DKMTSetFSEBlock(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetFSEBlock(param0.toString()) as Int) else 0

public actual fun D3DKMTSetGammaRamp(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetGammaRamp(param0.toString()) as Int) else 0

public actual fun D3DKMTSetHwProtectionTeardownRecovery(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetHwProtectionTeardownRecovery(param0.toString()) as Int) else 0

public actual fun D3DKMTSetMonitorColorSpaceTransform(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetMonitorColorSpaceTransform(param0.toString()) as Int) else 0

public actual fun D3DKMTSetProcessSchedulingPriorityClass(param0: HANDLE, param1: D3DKMT_SCHEDULINGPRIORITYCLASS): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetProcessSchedulingPriorityClass(param0.toString(), param1) as Int) else 0

public actual fun D3DKMTSetQueuedLimit(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetQueuedLimit(param0.toString()) as Int) else 0

public actual fun D3DKMTSetStablePowerState(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetStablePowerState(param0.toString()) as Int) else 0

public actual fun D3DKMTSetSyncRefreshCountWaitTarget(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetSyncRefreshCountWaitTarget(param0.toString()) as Int) else 0

public actual fun D3DKMTSetVidPnSourceHwProtection(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetVidPnSourceHwProtection(param0.toString()) as Int) else 0

public actual fun D3DKMTSetVidPnSourceOwner(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetVidPnSourceOwner(param0.toString()) as Int) else 0

public actual fun D3DKMTSetVidPnSourceOwner1(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetVidPnSourceOwner1(param0.toString()) as Int) else 0

public actual fun D3DKMTSetVidPnSourceOwner2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSetVidPnSourceOwner2(param0.toString()) as Int) else 0

public actual fun D3DKMTShareObjects(cobjects: UInt, hobjects: Long, pobjectattributes: Long, dwdesiredaccess: UInt, phsharednthandle: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTShareObjects(cobjects.toInt(), hobjects.toString(), pobjectattributes.toString(), dwdesiredaccess.toInt(), phsharednthandle.toString()) as Int) else 0

public actual fun D3DKMTSharedPrimaryLockNotification(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSharedPrimaryLockNotification(param0.toString()) as Int) else 0

public actual fun D3DKMTSharedPrimaryUnLockNotification(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSharedPrimaryUnLockNotification(param0.toString()) as Int) else 0

public actual fun D3DKMTSignalSynchronizationObject(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSignalSynchronizationObject(param0.toString()) as Int) else 0

public actual fun D3DKMTSignalSynchronizationObject2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSignalSynchronizationObject2(param0.toString()) as Int) else 0

public actual fun D3DKMTSignalSynchronizationObjectFromCpu(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSignalSynchronizationObjectFromCpu(param0.toString()) as Int) else 0

public actual fun D3DKMTSignalSynchronizationObjectFromGpu(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSignalSynchronizationObjectFromGpu(param0.toString()) as Int) else 0

public actual fun D3DKMTSignalSynchronizationObjectFromGpu2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSignalSynchronizationObjectFromGpu2(param0.toString()) as Int) else 0

public actual fun D3DKMTSubmitCommand(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSubmitCommand(param0.toString()) as Int) else 0

public actual fun D3DKMTSubmitCommandToHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSubmitCommandToHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTSubmitPresentBltToHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSubmitPresentBltToHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTSubmitPresentToHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSubmitPresentToHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTSubmitSignalSyncObjectsToHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSubmitSignalSyncObjectsToHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTSubmitWaitForSyncObjectsToHwQueue(param0.toString()) as Int) else 0

public actual fun D3DKMTTrimProcessCommitment(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTTrimProcessCommitment(param0.toString()) as Int) else 0

public actual fun D3DKMTUnlock(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTUnlock(param0.toString()) as Int) else 0

public actual fun D3DKMTUnlock2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTUnlock2(param0.toString()) as Int) else 0

public actual fun D3DKMTUnregisterTrimNotification(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTUnregisterTrimNotification(param0.toString()) as Int) else 0

public actual fun D3DKMTUpdateAllocationProperty(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTUpdateAllocationProperty(param0.toString()) as Int) else 0

public actual fun D3DKMTUpdateGpuVirtualAddress(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTUpdateGpuVirtualAddress(param0.toString()) as Int) else 0

public actual fun D3DKMTUpdateOverlay(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTUpdateOverlay(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForIdle(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForIdle(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForSynchronizationObject(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForSynchronizationObject(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForSynchronizationObject2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForSynchronizationObject2(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForSynchronizationObjectFromCpu(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForSynchronizationObjectFromCpu(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForSynchronizationObjectFromGpu(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForSynchronizationObjectFromGpu(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForVerticalBlankEvent(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForVerticalBlankEvent(param0.toString()) as Int) else 0

public actual fun D3DKMTWaitForVerticalBlankEvent2(param0: Long): NTSTATUS =
    if (_windowsWdkGraphicsDirect3dNapiAddon != null) (_windowsWdkGraphicsDirect3dNapiAddon.windowssys_windows_wdk_graphics_direct3d_D3DKMTWaitForVerticalBlankEvent2(param0.toString()) as Int) else 0
