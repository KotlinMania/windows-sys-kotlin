package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun D3DKMTAcquireKeyedMutex(param0: Long): NTSTATUS

public expect fun D3DKMTAcquireKeyedMutex2(param0: Long): NTSTATUS

public expect fun D3DKMTAdjustFullscreenGamma(param0: Long): NTSTATUS

public expect fun D3DKMTCancelPresents(param0: Long): NTSTATUS

public expect fun D3DKMTChangeSurfacePointer(param0: Long): NTSTATUS

public expect fun D3DKMTChangeVideoMemoryReservation(param0: Long): NTSTATUS

public expect fun D3DKMTCheckExclusiveOwnership(): Boolean

public expect fun D3DKMTCheckMonitorPowerState(param0: Long): NTSTATUS

public expect fun D3DKMTCheckMultiPlaneOverlaySupport(param0: Long): NTSTATUS

public expect fun D3DKMTCheckMultiPlaneOverlaySupport2(param0: Long): NTSTATUS

public expect fun D3DKMTCheckMultiPlaneOverlaySupport3(param0: Long): NTSTATUS

public expect fun D3DKMTCheckOcclusion(param0: Long): NTSTATUS

public expect fun D3DKMTCheckSharedResourceAccess(param0: Long): NTSTATUS

public expect fun D3DKMTCheckVidPnExclusiveOwnership(param0: Long): NTSTATUS

public expect fun D3DKMTCloseAdapter(param0: Long): NTSTATUS

public expect fun D3DKMTConfigureSharedResource(param0: Long): NTSTATUS

public expect fun D3DKMTCreateAllocation(param0: Long): NTSTATUS

public expect fun D3DKMTCreateAllocation2(param0: Long): NTSTATUS

public expect fun D3DKMTCreateContext(param0: Long): NTSTATUS

public expect fun D3DKMTCreateContextVirtual(param0: Long): NTSTATUS

public expect fun D3DKMTCreateDCFromMemory(param0: Long): NTSTATUS

public expect fun D3DKMTCreateDevice(param0: Long): NTSTATUS

public expect fun D3DKMTCreateHwContext(param0: Long): NTSTATUS

public expect fun D3DKMTCreateHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTCreateKeyedMutex(param0: Long): NTSTATUS

public expect fun D3DKMTCreateKeyedMutex2(param0: Long): NTSTATUS

public expect fun D3DKMTCreateOutputDupl(param0: Long): NTSTATUS

public expect fun D3DKMTCreateOverlay(param0: Long): NTSTATUS

public expect fun D3DKMTCreatePagingQueue(param0: Long): NTSTATUS

public expect fun D3DKMTCreateProtectedSession(param0: Long): NTSTATUS

public expect fun D3DKMTCreateSynchronizationObject(param0: Long): NTSTATUS

public expect fun D3DKMTCreateSynchronizationObject2(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyAllocation(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyAllocation2(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyContext(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyDCFromMemory(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyDevice(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyHwContext(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyKeyedMutex(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyOutputDupl(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyOverlay(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyPagingQueue(param0: Long): NTSTATUS

public expect fun D3DKMTDestroyProtectedSession(param0: Long): NTSTATUS

public expect fun D3DKMTDestroySynchronizationObject(param0: Long): NTSTATUS

public expect fun D3DKMTEnumAdapters(param0: Long): NTSTATUS

public expect fun D3DKMTEnumAdapters2(param0: Long): NTSTATUS

public expect fun D3DKMTEnumAdapters3(param0: Long): NTSTATUS

public expect fun D3DKMTEscape(param0: Long): NTSTATUS

public expect fun D3DKMTEvict(param0: Long): NTSTATUS

public expect fun D3DKMTFlipOverlay(param0: Long): NTSTATUS

public expect fun D3DKMTFlushHeapTransitions(param0: Long): NTSTATUS

public expect fun D3DKMTFreeGpuVirtualAddress(param0: Long): NTSTATUS

public expect fun D3DKMTGetAllocationPriority(param0: Long): NTSTATUS

public expect fun D3DKMTGetContextInProcessSchedulingPriority(param0: Long): NTSTATUS

public expect fun D3DKMTGetContextSchedulingPriority(param0: Long): NTSTATUS

public expect fun D3DKMTGetDWMVerticalBlankEvent(param0: Long): NTSTATUS

public expect fun D3DKMTGetDeviceState(param0: Long): NTSTATUS

public expect fun D3DKMTGetDisplayModeList(param0: Long): NTSTATUS

public expect fun D3DKMTGetMultiPlaneOverlayCaps(param0: Long): NTSTATUS

public expect fun D3DKMTGetMultisampleMethodList(param0: Long): NTSTATUS

public expect fun D3DKMTGetOverlayState(param0: Long): NTSTATUS

public expect fun D3DKMTGetPostCompositionCaps(param0: Long): NTSTATUS

public expect fun D3DKMTGetPresentHistory(param0: Long): NTSTATUS

public expect fun D3DKMTGetPresentQueueEvent(hadapter: UInt, param1: Long): NTSTATUS

public expect fun D3DKMTGetProcessDeviceRemovalSupport(param0: Long): NTSTATUS

public expect fun D3DKMTGetProcessSchedulingPriorityClass(param0: HANDLE, param1: Long): NTSTATUS

public expect fun D3DKMTGetResourcePresentPrivateDriverData(param0: Long): NTSTATUS

public expect fun D3DKMTGetRuntimeData(param0: Long): NTSTATUS

public expect fun D3DKMTGetScanLine(param0: Long): NTSTATUS

public expect fun D3DKMTGetSharedPrimaryHandle(param0: Long): NTSTATUS

public expect fun D3DKMTGetSharedResourceAdapterLuid(param0: Long): NTSTATUS

public expect fun D3DKMTInvalidateActiveVidPn(param0: Long): NTSTATUS

public expect fun D3DKMTInvalidateCache(param0: Long): NTSTATUS

public expect fun D3DKMTLock(param0: Long): NTSTATUS

public expect fun D3DKMTLock2(param0: Long): NTSTATUS

public expect fun D3DKMTMakeResident(param0: Long): NTSTATUS

public expect fun D3DKMTMapGpuVirtualAddress(param0: Long): NTSTATUS

public expect fun D3DKMTMarkDeviceAsError(param0: Long): NTSTATUS

public expect fun D3DKMTOfferAllocations(param0: Long): NTSTATUS

public expect fun D3DKMTOpenAdapterFromDeviceName(param0: Long): NTSTATUS

public expect fun D3DKMTOpenAdapterFromGdiDisplayName(param0: Long): NTSTATUS

public expect fun D3DKMTOpenAdapterFromHdc(param0: Long): NTSTATUS

public expect fun D3DKMTOpenAdapterFromLuid(param0: Long): NTSTATUS

public expect fun D3DKMTOpenKeyedMutex(param0: Long): NTSTATUS

public expect fun D3DKMTOpenKeyedMutex2(param0: Long): NTSTATUS

public expect fun D3DKMTOpenKeyedMutexFromNtHandle(param0: Long): NTSTATUS

public expect fun D3DKMTOpenNtHandleFromName(param0: Long): NTSTATUS

public expect fun D3DKMTOpenProtectedSessionFromNtHandle(param0: Long): NTSTATUS

public expect fun D3DKMTOpenResource(param0: Long): NTSTATUS

public expect fun D3DKMTOpenResource2(param0: Long): NTSTATUS

public expect fun D3DKMTOpenResourceFromNtHandle(param0: Long): NTSTATUS

public expect fun D3DKMTOpenSyncObjectFromNtHandle(param0: Long): NTSTATUS

public expect fun D3DKMTOpenSyncObjectFromNtHandle2(param0: Long): NTSTATUS

public expect fun D3DKMTOpenSyncObjectNtHandleFromName(param0: Long): NTSTATUS

public expect fun D3DKMTOpenSynchronizationObject(param0: Long): NTSTATUS

public expect fun D3DKMTOutputDuplGetFrameInfo(param0: Long): NTSTATUS

public expect fun D3DKMTOutputDuplGetMetaData(param0: Long): NTSTATUS

public expect fun D3DKMTOutputDuplGetPointerShapeData(param0: Long): NTSTATUS

public expect fun D3DKMTOutputDuplPresent(param0: Long): NTSTATUS

public expect fun D3DKMTOutputDuplPresentToHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTOutputDuplReleaseFrame(param0: Long): NTSTATUS

public expect fun D3DKMTPollDisplayChildren(param0: Long): NTSTATUS

public expect fun D3DKMTPresent(param0: Long): NTSTATUS

public expect fun D3DKMTPresentMultiPlaneOverlay(param0: Long): NTSTATUS

public expect fun D3DKMTPresentMultiPlaneOverlay2(param0: Long): NTSTATUS

public expect fun D3DKMTPresentMultiPlaneOverlay3(param0: Long): NTSTATUS

public expect fun D3DKMTPresentRedirected(param0: Long): NTSTATUS

public expect fun D3DKMTQueryAdapterInfo(param0: Long): NTSTATUS

public expect fun D3DKMTQueryAllocationResidency(param0: Long): NTSTATUS

public expect fun D3DKMTQueryClockCalibration(param0: Long): NTSTATUS

public expect fun D3DKMTQueryFSEBlock(param0: Long): NTSTATUS

public expect fun D3DKMTQueryProcessOfferInfo(param0: Long): NTSTATUS

public expect fun D3DKMTQueryProtectedSessionInfoFromNtHandle(param0: Long): NTSTATUS

public expect fun D3DKMTQueryProtectedSessionStatus(param0: Long): NTSTATUS

public expect fun D3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: Long): NTSTATUS

public expect fun D3DKMTQueryResourceInfo(param0: Long): NTSTATUS

public expect fun D3DKMTQueryResourceInfoFromNtHandle(param0: Long): NTSTATUS

public expect fun D3DKMTQueryStatistics(param0: Long): NTSTATUS

public expect fun D3DKMTQueryVidPnExclusiveOwnership(param0: Long): NTSTATUS

public expect fun D3DKMTQueryVideoMemoryInfo(param0: Long): NTSTATUS

public expect fun D3DKMTReclaimAllocations(param0: Long): NTSTATUS

public expect fun D3DKMTReclaimAllocations2(param0: Long): NTSTATUS

public expect fun D3DKMTRegisterTrimNotification(param0: Long): NTSTATUS

public expect fun D3DKMTRegisterVailProcess(param0: Long): NTSTATUS

public expect fun D3DKMTReleaseKeyedMutex(param0: Long): NTSTATUS

public expect fun D3DKMTReleaseKeyedMutex2(param0: Long): NTSTATUS

public expect fun D3DKMTReleaseProcessVidPnSourceOwners(param0: HANDLE): NTSTATUS

public expect fun D3DKMTRender(param0: Long): NTSTATUS

public expect fun D3DKMTReserveGpuVirtualAddress(param0: Long): NTSTATUS

public expect fun D3DKMTSetAllocationPriority(param0: Long): NTSTATUS

public expect fun D3DKMTSetContextInProcessSchedulingPriority(param0: Long): NTSTATUS

public expect fun D3DKMTSetContextSchedulingPriority(param0: Long): NTSTATUS

public expect fun D3DKMTSetDisplayMode(param0: Long): NTSTATUS

public expect fun D3DKMTSetDisplayPrivateDriverFormat(param0: Long): NTSTATUS

public expect fun D3DKMTSetFSEBlock(param0: Long): NTSTATUS

public expect fun D3DKMTSetGammaRamp(param0: Long): NTSTATUS

public expect fun D3DKMTSetHwProtectionTeardownRecovery(param0: Long): NTSTATUS

public expect fun D3DKMTSetMonitorColorSpaceTransform(param0: Long): NTSTATUS

public expect fun D3DKMTSetProcessSchedulingPriorityClass(param0: HANDLE, param1: D3DKMT_SCHEDULINGPRIORITYCLASS): NTSTATUS

public expect fun D3DKMTSetQueuedLimit(param0: Long): NTSTATUS

public expect fun D3DKMTSetStablePowerState(param0: Long): NTSTATUS

public expect fun D3DKMTSetSyncRefreshCountWaitTarget(param0: Long): NTSTATUS

public expect fun D3DKMTSetVidPnSourceHwProtection(param0: Long): NTSTATUS

public expect fun D3DKMTSetVidPnSourceOwner(param0: Long): NTSTATUS

public expect fun D3DKMTSetVidPnSourceOwner1(param0: Long): NTSTATUS

public expect fun D3DKMTSetVidPnSourceOwner2(param0: Long): NTSTATUS

public expect fun D3DKMTShareObjects(cobjects: UInt, hobjects: Long, pobjectattributes: Long, dwdesiredaccess: UInt, phsharednthandle: Long): NTSTATUS

public expect fun D3DKMTSharedPrimaryLockNotification(param0: Long): NTSTATUS

public expect fun D3DKMTSharedPrimaryUnLockNotification(param0: Long): NTSTATUS

public expect fun D3DKMTSignalSynchronizationObject(param0: Long): NTSTATUS

public expect fun D3DKMTSignalSynchronizationObject2(param0: Long): NTSTATUS

public expect fun D3DKMTSignalSynchronizationObjectFromCpu(param0: Long): NTSTATUS

public expect fun D3DKMTSignalSynchronizationObjectFromGpu(param0: Long): NTSTATUS

public expect fun D3DKMTSignalSynchronizationObjectFromGpu2(param0: Long): NTSTATUS

public expect fun D3DKMTSubmitCommand(param0: Long): NTSTATUS

public expect fun D3DKMTSubmitCommandToHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTSubmitPresentBltToHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTSubmitPresentToHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTSubmitSignalSyncObjectsToHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: Long): NTSTATUS

public expect fun D3DKMTTrimProcessCommitment(param0: Long): NTSTATUS

public expect fun D3DKMTUnlock(param0: Long): NTSTATUS

public expect fun D3DKMTUnlock2(param0: Long): NTSTATUS

public expect fun D3DKMTUnregisterTrimNotification(param0: Long): NTSTATUS

public expect fun D3DKMTUpdateAllocationProperty(param0: Long): NTSTATUS

public expect fun D3DKMTUpdateGpuVirtualAddress(param0: Long): NTSTATUS

public expect fun D3DKMTUpdateOverlay(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForIdle(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForSynchronizationObject(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForSynchronizationObject2(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForSynchronizationObjectFromCpu(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForSynchronizationObjectFromGpu(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForVerticalBlankEvent(param0: Long): NTSTATUS

public expect fun D3DKMTWaitForVerticalBlankEvent2(param0: Long): NTSTATUS
