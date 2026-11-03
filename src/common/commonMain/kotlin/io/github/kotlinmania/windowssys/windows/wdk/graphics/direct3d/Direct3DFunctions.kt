package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun D3DKMTAcquireKeyedMutex(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTAcquireKeyedMutex", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTAcquireKeyedMutex2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTAcquireKeyedMutex2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTAdjustFullscreenGamma(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTAdjustFullscreenGamma", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCancelPresents(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCancelPresents", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTChangeSurfacePointer(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTChangeSurfacePointer", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTChangeVideoMemoryReservation(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTChangeVideoMemoryReservation", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckExclusiveOwnership(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckExclusiveOwnership", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun D3DKMTCheckMonitorPowerState(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckMonitorPowerState", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckMultiPlaneOverlaySupport(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckMultiPlaneOverlaySupport", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckMultiPlaneOverlaySupport2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckMultiPlaneOverlaySupport2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckMultiPlaneOverlaySupport3(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckMultiPlaneOverlaySupport3", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckOcclusion(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckOcclusion", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckSharedResourceAccess(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckSharedResourceAccess", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCheckVidPnExclusiveOwnership(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCheckVidPnExclusiveOwnership", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCloseAdapter(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCloseAdapter", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTConfigureSharedResource(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTConfigureSharedResource", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateAllocation(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateAllocation", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateAllocation2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateAllocation2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateContext(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateContext", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateContextVirtual(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateContextVirtual", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateDCFromMemory(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateDCFromMemory", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateDevice(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateDevice", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateHwContext(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateHwContext", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateKeyedMutex(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateKeyedMutex", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateKeyedMutex2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateKeyedMutex2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateOutputDupl(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateOutputDupl", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateOverlay(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateOverlay", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreatePagingQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreatePagingQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateProtectedSession(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateProtectedSession", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateSynchronizationObject(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateSynchronizationObject", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTCreateSynchronizationObject2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTCreateSynchronizationObject2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyAllocation(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyAllocation", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyAllocation2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyAllocation2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyContext(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyContext", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyDCFromMemory(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyDCFromMemory", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyDevice(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyDevice", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyHwContext(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyHwContext", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyKeyedMutex(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyKeyedMutex", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyOutputDupl(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyOutputDupl", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyOverlay(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyOverlay", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyPagingQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyPagingQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroyProtectedSession(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroyProtectedSession", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTDestroySynchronizationObject(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTDestroySynchronizationObject", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTEnumAdapters(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTEnumAdapters", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTEnumAdapters2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTEnumAdapters2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTEnumAdapters3(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("api-ms-win-dx-d3dkmt-l1-1-6.dll", "D3DKMTEnumAdapters3", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTEscape(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTEscape", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTEvict(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTEvict", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTFlipOverlay(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTFlipOverlay", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTFlushHeapTransitions(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTFlushHeapTransitions", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTFreeGpuVirtualAddress(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTFreeGpuVirtualAddress", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetAllocationPriority(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetAllocationPriority", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetContextInProcessSchedulingPriority(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetContextInProcessSchedulingPriority", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetContextSchedulingPriority(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetContextSchedulingPriority", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetDWMVerticalBlankEvent(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetDWMVerticalBlankEvent", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetDeviceState(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetDeviceState", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetDisplayModeList(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetDisplayModeList", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetMultiPlaneOverlayCaps(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetMultiPlaneOverlayCaps", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetMultisampleMethodList(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetMultisampleMethodList", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetOverlayState(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetOverlayState", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetPostCompositionCaps(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetPostCompositionCaps", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetPresentHistory(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetPresentHistory", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetPresentQueueEvent(hadapter: UInt, param1: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetPresentQueueEvent", longArrayOf(hadapter.toLong(), param1))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetProcessDeviceRemovalSupport(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetProcessDeviceRemovalSupport", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetProcessSchedulingPriorityClass(param0: Win32.Foundation.HANDLE, param1: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetProcessSchedulingPriorityClass", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetResourcePresentPrivateDriverData(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetResourcePresentPrivateDriverData", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetRuntimeData(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetRuntimeData", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetScanLine(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetScanLine", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetSharedPrimaryHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetSharedPrimaryHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTGetSharedResourceAdapterLuid(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTGetSharedResourceAdapterLuid", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTInvalidateActiveVidPn(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTInvalidateActiveVidPn", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTInvalidateCache(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTInvalidateCache", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTLock(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTLock", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTLock2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTLock2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTMakeResident(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTMakeResident", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTMapGpuVirtualAddress(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTMapGpuVirtualAddress", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTMarkDeviceAsError(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTMarkDeviceAsError", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOfferAllocations(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOfferAllocations", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenAdapterFromDeviceName(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenAdapterFromDeviceName", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenAdapterFromGdiDisplayName(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenAdapterFromGdiDisplayName", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenAdapterFromHdc(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenAdapterFromHdc", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenAdapterFromLuid(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenAdapterFromLuid", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenKeyedMutex(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenKeyedMutex", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenKeyedMutex2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenKeyedMutex2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenKeyedMutexFromNtHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenKeyedMutexFromNtHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenNtHandleFromName(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenNtHandleFromName", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenProtectedSessionFromNtHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenProtectedSessionFromNtHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenResource(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenResource", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenResource2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenResource2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenResourceFromNtHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenResourceFromNtHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenSyncObjectFromNtHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenSyncObjectFromNtHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenSyncObjectFromNtHandle2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenSyncObjectFromNtHandle2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenSyncObjectNtHandleFromName(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenSyncObjectNtHandleFromName", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOpenSynchronizationObject(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOpenSynchronizationObject", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOutputDuplGetFrameInfo(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOutputDuplGetFrameInfo", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOutputDuplGetMetaData(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOutputDuplGetMetaData", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOutputDuplGetPointerShapeData(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOutputDuplGetPointerShapeData", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOutputDuplPresent(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOutputDuplPresent", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOutputDuplPresentToHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("api-ms-win-dx-d3dkmt-l1-1-4.dll", "D3DKMTOutputDuplPresentToHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTOutputDuplReleaseFrame(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTOutputDuplReleaseFrame", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTPollDisplayChildren(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTPollDisplayChildren", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTPresent(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTPresent", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTPresentMultiPlaneOverlay(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTPresentMultiPlaneOverlay", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTPresentMultiPlaneOverlay2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTPresentMultiPlaneOverlay2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTPresentMultiPlaneOverlay3(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTPresentMultiPlaneOverlay3", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTPresentRedirected(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTPresentRedirected", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryAdapterInfo(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryAdapterInfo", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryAllocationResidency(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryAllocationResidency", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryClockCalibration(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryClockCalibration", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryFSEBlock(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryFSEBlock", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryProcessOfferInfo(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryProcessOfferInfo", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryProtectedSessionInfoFromNtHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryProtectedSessionInfoFromNtHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryProtectedSessionStatus(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryProtectedSessionStatus", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryRemoteVidPnSourceFromGdiDisplayName", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryResourceInfo(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryResourceInfo", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryResourceInfoFromNtHandle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryResourceInfoFromNtHandle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryStatistics(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryStatistics", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryVidPnExclusiveOwnership(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryVidPnExclusiveOwnership", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTQueryVideoMemoryInfo(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTQueryVideoMemoryInfo", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTReclaimAllocations(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTReclaimAllocations", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTReclaimAllocations2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTReclaimAllocations2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTRegisterTrimNotification(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTRegisterTrimNotification", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTRegisterVailProcess(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTRegisterVailProcess", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTReleaseKeyedMutex(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTReleaseKeyedMutex", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTReleaseKeyedMutex2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTReleaseKeyedMutex2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTReleaseProcessVidPnSourceOwners(param0: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTReleaseProcessVidPnSourceOwners", longArrayOf(Win32DynamicFfi.objectSlot(param0)))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTRender(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTRender", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTReserveGpuVirtualAddress(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTReserveGpuVirtualAddress", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetAllocationPriority(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetAllocationPriority", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetContextInProcessSchedulingPriority(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetContextInProcessSchedulingPriority", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetContextSchedulingPriority(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetContextSchedulingPriority", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetDisplayMode(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetDisplayMode", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetDisplayPrivateDriverFormat(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetDisplayPrivateDriverFormat", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetFSEBlock(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetFSEBlock", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetGammaRamp(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetGammaRamp", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetHwProtectionTeardownRecovery(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetHwProtectionTeardownRecovery", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetMonitorColorSpaceTransform(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetMonitorColorSpaceTransform", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetProcessSchedulingPriorityClass(param0: Win32.Foundation.HANDLE, param1: D3DKMT_SCHEDULINGPRIORITYCLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetProcessSchedulingPriorityClass", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetQueuedLimit(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetQueuedLimit", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetStablePowerState(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetStablePowerState", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetSyncRefreshCountWaitTarget(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetSyncRefreshCountWaitTarget", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetVidPnSourceHwProtection(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetVidPnSourceHwProtection", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetVidPnSourceOwner(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetVidPnSourceOwner", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetVidPnSourceOwner1(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetVidPnSourceOwner1", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSetVidPnSourceOwner2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSetVidPnSourceOwner2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTShareObjects(cobjects: UInt, hobjects: Long, pobjectattributes: Long, dwdesiredaccess: UInt, phsharednthandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTShareObjects", longArrayOf(cobjects.toLong(), hobjects, pobjectattributes, dwdesiredaccess.toLong(), phsharednthandle))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSharedPrimaryLockNotification(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSharedPrimaryLockNotification", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSharedPrimaryUnLockNotification(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSharedPrimaryUnLockNotification", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSignalSynchronizationObject(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSignalSynchronizationObject", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSignalSynchronizationObject2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSignalSynchronizationObject2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSignalSynchronizationObjectFromCpu(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSignalSynchronizationObjectFromCpu", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSignalSynchronizationObjectFromGpu(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSignalSynchronizationObjectFromGpu", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSignalSynchronizationObjectFromGpu2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSignalSynchronizationObjectFromGpu2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSubmitCommand(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSubmitCommand", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSubmitCommandToHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSubmitCommandToHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSubmitPresentBltToHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("api-ms-win-dx-d3dkmt-l1-1-4.dll", "D3DKMTSubmitPresentBltToHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSubmitPresentToHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("api-ms-win-dx-d3dkmt-l1-1-4.dll", "D3DKMTSubmitPresentToHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSubmitSignalSyncObjectsToHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSubmitSignalSyncObjectsToHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTSubmitWaitForSyncObjectsToHwQueue", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTTrimProcessCommitment(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTTrimProcessCommitment", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTUnlock(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTUnlock", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTUnlock2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTUnlock2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTUnregisterTrimNotification(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTUnregisterTrimNotification", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTUpdateAllocationProperty(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTUpdateAllocationProperty", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTUpdateGpuVirtualAddress(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTUpdateGpuVirtualAddress", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTUpdateOverlay(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTUpdateOverlay", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForIdle(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForIdle", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForSynchronizationObject(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForSynchronizationObject", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForSynchronizationObject2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForSynchronizationObject2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForSynchronizationObjectFromCpu(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForSynchronizationObjectFromCpu", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForSynchronizationObjectFromGpu(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForSynchronizationObjectFromGpu", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForVerticalBlankEvent(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForVerticalBlankEvent", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}

public fun D3DKMTWaitForVerticalBlankEvent2(param0: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("gdi32.dll", "D3DKMTWaitForVerticalBlankEvent2", longArrayOf(param0))
    return Win32.Foundation.NTSTATUS()
}
