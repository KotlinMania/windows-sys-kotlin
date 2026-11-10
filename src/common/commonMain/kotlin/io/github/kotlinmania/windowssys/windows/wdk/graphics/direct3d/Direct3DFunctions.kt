package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun d3DKMTAcquireKeyedMutex(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTAcquireKeyedMutex2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTAdjustFullscreenGamma(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCancelPresents(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTChangeSurfacePointer(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTChangeVideoMemoryReservation(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckExclusiveOwnership(): Boolean

public expect fun d3DKMTCheckMonitorPowerState(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckMultiPlaneOverlaySupport(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckMultiPlaneOverlaySupport2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckMultiPlaneOverlaySupport3(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckOcclusion(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckSharedResourceAccess(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCheckVidPnExclusiveOwnership(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCloseAdapter(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTConfigureSharedResource(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateAllocation(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateAllocation2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateContext(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateContextVirtual(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateDCFromMemory(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateDevice(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateHwContext(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateKeyedMutex(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateKeyedMutex2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateOutputDupl(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateOverlay(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreatePagingQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateProtectedSession(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateSynchronizationObject(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTCreateSynchronizationObject2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyAllocation(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyAllocation2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyContext(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyDCFromMemory(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyDevice(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyHwContext(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyKeyedMutex(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyOutputDupl(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyOverlay(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyPagingQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroyProtectedSession(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTDestroySynchronizationObject(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTEnumAdapters(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTEnumAdapters2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTEnumAdapters3(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTEscape(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTEvict(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTFlipOverlay(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTFlushHeapTransitions(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTFreeGpuVirtualAddress(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetAllocationPriority(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetContextInProcessSchedulingPriority(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetContextSchedulingPriority(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetDWMVerticalBlankEvent(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetDeviceState(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetDisplayModeList(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetMultiPlaneOverlayCaps(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetMultisampleMethodList(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetOverlayState(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetPostCompositionCaps(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetPresentHistory(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetPresentQueueEvent(hadapter: UInt, param1: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetProcessDeviceRemovalSupport(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetProcessSchedulingPriorityClass(param0: Handle, param1: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetResourcePresentPrivateDriverData(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetRuntimeData(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetScanLine(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetSharedPrimaryHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTGetSharedResourceAdapterLuid(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTInvalidateActiveVidPn(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTInvalidateCache(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTLock(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTLock2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTMakeResident(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTMapGpuVirtualAddress(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTMarkDeviceAsError(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOfferAllocations(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenAdapterFromDeviceName(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenAdapterFromGdiDisplayName(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenAdapterFromHdc(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenAdapterFromLuid(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenKeyedMutex(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenKeyedMutex2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenKeyedMutexFromNtHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenNtHandleFromName(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenProtectedSessionFromNtHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenResource(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenResource2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenResourceFromNtHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenSyncObjectFromNtHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenSyncObjectFromNtHandle2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenSyncObjectNtHandleFromName(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOpenSynchronizationObject(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOutputDuplGetFrameInfo(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOutputDuplGetMetaData(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOutputDuplGetPointerShapeData(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOutputDuplPresent(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOutputDuplPresentToHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTOutputDuplReleaseFrame(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTPollDisplayChildren(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTPresent(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTPresentMultiPlaneOverlay(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTPresentMultiPlaneOverlay2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTPresentMultiPlaneOverlay3(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTPresentRedirected(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryAdapterInfo(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryAllocationResidency(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryClockCalibration(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryFSEBlock(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryProcessOfferInfo(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryProtectedSessionInfoFromNtHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryProtectedSessionStatus(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryResourceInfo(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryResourceInfoFromNtHandle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryStatistics(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryVidPnExclusiveOwnership(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTQueryVideoMemoryInfo(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTReclaimAllocations(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTReclaimAllocations2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTRegisterTrimNotification(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTRegisterVailProcess(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTReleaseKeyedMutex(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTReleaseKeyedMutex2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTReleaseProcessVidPnSourceOwners(param0: Handle): Ntstatus

public expect fun d3DKMTRender(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTReserveGpuVirtualAddress(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetAllocationPriority(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetContextInProcessSchedulingPriority(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetContextSchedulingPriority(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetDisplayMode(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetDisplayPrivateDriverFormat(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetFSEBlock(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetGammaRamp(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetHwProtectionTeardownRecovery(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetMonitorColorSpaceTransform(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetProcessSchedulingPriorityClass(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus

public expect fun d3DKMTSetQueuedLimit(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetStablePowerState(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetSyncRefreshCountWaitTarget(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetVidPnSourceHwProtection(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetVidPnSourceOwner(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetVidPnSourceOwner1(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSetVidPnSourceOwner2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTShareObjects(cobjects: UInt, hobjects: COpaquePointer?, pobjectattributes: COpaquePointer?, dwdesiredaccess: UInt, phsharednthandle: COpaquePointer?): Ntstatus

public expect fun d3DKMTSharedPrimaryLockNotification(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSharedPrimaryUnLockNotification(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSignalSynchronizationObject(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSignalSynchronizationObject2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSignalSynchronizationObjectFromCpu(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSignalSynchronizationObjectFromGpu(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSignalSynchronizationObjectFromGpu2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSubmitCommand(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSubmitCommandToHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSubmitPresentBltToHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSubmitPresentToHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSubmitSignalSyncObjectsToHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTTrimProcessCommitment(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTUnlock(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTUnlock2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTUnregisterTrimNotification(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTUpdateAllocationProperty(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTUpdateGpuVirtualAddress(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTUpdateOverlay(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForIdle(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObject(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObject2(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObjectFromCpu(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObjectFromGpu(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForVerticalBlankEvent(param0: COpaquePointer?): Ntstatus

public expect fun d3DKMTWaitForVerticalBlankEvent2(param0: COpaquePointer?): Ntstatus
