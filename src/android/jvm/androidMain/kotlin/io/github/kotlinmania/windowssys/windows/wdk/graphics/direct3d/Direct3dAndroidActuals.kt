@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkGraphicsDirect3dJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTAdjustFullscreenGamma(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCancelPresents(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeSurfacePointer(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeVideoMemoryReservation(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMonitorPowerState(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport3(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckOcclusion(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckSharedResourceAccess(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckVidPnExclusiveOwnership(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCloseAdapter(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTConfigureSharedResource(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContext(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContextVirtual(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDCFromMemory(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDevice(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwContext(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOutputDupl(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOverlay(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreatePagingQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateProtectedSession(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyContext(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDCFromMemory(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDevice(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwContext(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyKeyedMutex(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOutputDupl(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOverlay(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyPagingQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyProtectedSession(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroySynchronizationObject(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters3(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTEscape(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTEvict(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTFlipOverlay(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTFlushHeapTransitions(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTFreeGpuVirtualAddress(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetAllocationPriority(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextInProcessSchedulingPriority(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextSchedulingPriority(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDWMVerticalBlankEvent(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDeviceState(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDisplayModeList(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultiPlaneOverlayCaps(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultisampleMethodList(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetOverlayState(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPostCompositionCaps(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentHistory(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentQueueEvent(hadapter: Int, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessDeviceRemovalSupport(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessSchedulingPriorityClass(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetResourcePresentPrivateDriverData(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetRuntimeData(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetScanLine(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedPrimaryHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedResourceAdapterLuid(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateActiveVidPn(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateCache(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTLock(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTLock2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTMakeResident(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTMapGpuVirtualAddress(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTMarkDeviceAsError(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOfferAllocations(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromDeviceName(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromGdiDisplayName(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromHdc(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromLuid(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutexFromNtHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenNtHandleFromName(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenProtectedSessionFromNtHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResourceFromNtHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectNtHandleFromName(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSynchronizationObject(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetFrameInfo(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetMetaData(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetPointerShapeData(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresent(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresentToHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplReleaseFrame(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTPollDisplayChildren(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTPresent(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay3(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentRedirected(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAdapterInfo(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAllocationResidency(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryClockCalibration(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryFSEBlock(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProcessOfferInfo(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionInfoFromNtHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionStatus(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfo(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfoFromNtHandle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryStatistics(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVidPnExclusiveOwnership(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVideoMemoryInfo(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterTrimNotification(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterVailProcess(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseProcessVidPnSourceOwners(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTRender(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTReserveGpuVirtualAddress(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetAllocationPriority(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextInProcessSchedulingPriority(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextSchedulingPriority(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayMode(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayPrivateDriverFormat(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetFSEBlock(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetGammaRamp(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetHwProtectionTeardownRecovery(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetMonitorColorSpaceTransform(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetProcessSchedulingPriorityClass(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetQueuedLimit(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetStablePowerState(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetSyncRefreshCountWaitTarget(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceHwProtection(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner1(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTShareObjects(cobjects: Int, hobjects: Long, pobjectattributes: Long, dwdesiredaccess: Int, phsharednthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryLockNotification(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryUnLockNotification(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromCpu(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommand(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommandToHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentBltToHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentToHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitSignalSyncObjectsToHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTTrimProcessCommitment(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTUnregisterTrimNotification(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateAllocationProperty(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateGpuVirtualAddress(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateOverlay(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForIdle(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject2(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromCpu(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromGpu(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent2(param0: Long): Int
}

public actual fun d3DKMTAcquireKeyedMutex(param0: MutPtr<D3dkmtAcquirekeyedmutex>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex(param0.rawAddress)

public actual fun d3DKMTAcquireKeyedMutex2(param0: MutPtr<D3dkmtAcquirekeyedmutex2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex2(param0.rawAddress)

public actual fun d3DKMTAdjustFullscreenGamma(param0: ConstPtr<D3dkmtAdjustfullscreengamma>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTAdjustFullscreenGamma(param0.rawAddress)

public actual fun d3DKMTCancelPresents(param0: ConstPtr<D3dkmtCancelPresents>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCancelPresents(param0.rawAddress)

public actual fun d3DKMTChangeSurfacePointer(param0: ConstPtr<D3dkmtChangesurfacepointer>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeSurfacePointer(param0.rawAddress)

public actual fun d3DKMTChangeVideoMemoryReservation(param0: ConstPtr<D3dkmtChangevideomemoryreservation>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeVideoMemoryReservation(param0.rawAddress)

public actual fun d3DKMTCheckExclusiveOwnership(): Boolean =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership()

public actual fun d3DKMTCheckMonitorPowerState(param0: ConstPtr<D3dkmtCheckmonitorpowerstate>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMonitorPowerState(param0.rawAddress)

public actual fun d3DKMTCheckMultiPlaneOverlaySupport(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport(param0.rawAddress)

public actual fun d3DKMTCheckMultiPlaneOverlaySupport2(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport2(param0.rawAddress)

public actual fun d3DKMTCheckMultiPlaneOverlaySupport3(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport3>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport3(param0.rawAddress)

public actual fun d3DKMTCheckOcclusion(param0: ConstPtr<D3dkmtCheckocclusion>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckOcclusion(param0.rawAddress)

public actual fun d3DKMTCheckSharedResourceAccess(param0: ConstPtr<D3dkmtChecksharedresourceaccess>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckSharedResourceAccess(param0.rawAddress)

public actual fun d3DKMTCheckVidPnExclusiveOwnership(param0: ConstPtr<D3dkmtCheckvidpnexclusiveownership>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckVidPnExclusiveOwnership(param0.rawAddress)

public actual fun d3DKMTCloseAdapter(param0: ConstPtr<D3dkmtCloseadapter>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCloseAdapter(param0.rawAddress)

public actual fun d3DKMTConfigureSharedResource(param0: ConstPtr<D3dkmtConfiguresharedresource>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTConfigureSharedResource(param0.rawAddress)

public actual fun d3DKMTCreateAllocation(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation(param0.rawAddress)

public actual fun d3DKMTCreateAllocation2(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation2(param0.rawAddress)

public actual fun d3DKMTCreateContext(param0: MutPtr<D3dkmtCreatecontext>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContext(param0.rawAddress)

public actual fun d3DKMTCreateContextVirtual(param0: ConstPtr<D3dkmtCreatecontextvirtual>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContextVirtual(param0.rawAddress)

public actual fun d3DKMTCreateDCFromMemory(param0: MutPtr<D3dkmtCreatedcfrommemory>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDCFromMemory(param0.rawAddress)

public actual fun d3DKMTCreateDevice(param0: MutPtr<D3dkmtCreatedevice>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDevice(param0.rawAddress)

public actual fun d3DKMTCreateHwContext(param0: MutPtr<D3dkmtCreatehwcontext>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwContext(param0.rawAddress)

public actual fun d3DKMTCreateHwQueue(param0: MutPtr<D3dkmtCreatehwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwQueue(param0.rawAddress)

public actual fun d3DKMTCreateKeyedMutex(param0: MutPtr<D3dkmtCreatekeyedmutex>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex(param0.rawAddress)

public actual fun d3DKMTCreateKeyedMutex2(param0: MutPtr<D3dkmtCreatekeyedmutex2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex2(param0.rawAddress)

public actual fun d3DKMTCreateOutputDupl(param0: ConstPtr<D3dkmtCreateOutputdupl>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOutputDupl(param0.rawAddress)

public actual fun d3DKMTCreateOverlay(param0: MutPtr<D3dkmtCreateoverlay>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOverlay(param0.rawAddress)

public actual fun d3DKMTCreatePagingQueue(param0: MutPtr<D3dkmtCreatepagingqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreatePagingQueue(param0.rawAddress)

public actual fun d3DKMTCreateProtectedSession(param0: MutPtr<D3dkmtCreateprotectedsession>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateProtectedSession(param0.rawAddress)

public actual fun d3DKMTCreateSynchronizationObject(param0: MutPtr<D3dkmtCreatesynchronizationobject>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject(param0.rawAddress)

public actual fun d3DKMTCreateSynchronizationObject2(param0: MutPtr<D3dkmtCreatesynchronizationobject2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject2(param0.rawAddress)

public actual fun d3DKMTDestroyAllocation(param0: ConstPtr<D3dkmtDestroyallocation>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation(param0.rawAddress)

public actual fun d3DKMTDestroyAllocation2(param0: ConstPtr<D3dkmtDestroyallocation2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation2(param0.rawAddress)

public actual fun d3DKMTDestroyContext(param0: ConstPtr<D3dkmtDestroycontext>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyContext(param0.rawAddress)

public actual fun d3DKMTDestroyDCFromMemory(param0: ConstPtr<D3dkmtDestroydcfrommemory>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDCFromMemory(param0.rawAddress)

public actual fun d3DKMTDestroyDevice(param0: ConstPtr<D3dkmtDestroydevice>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDevice(param0.rawAddress)

public actual fun d3DKMTDestroyHwContext(param0: ConstPtr<D3dkmtDestroyhwcontext>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwContext(param0.rawAddress)

public actual fun d3DKMTDestroyHwQueue(param0: ConstPtr<D3dkmtDestroyhwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwQueue(param0.rawAddress)

public actual fun d3DKMTDestroyKeyedMutex(param0: ConstPtr<D3dkmtDestroykeyedmutex>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyKeyedMutex(param0.rawAddress)

public actual fun d3DKMTDestroyOutputDupl(param0: ConstPtr<D3dkmtDestroyOutputdupl>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOutputDupl(param0.rawAddress)

public actual fun d3DKMTDestroyOverlay(param0: ConstPtr<D3dkmtDestroyoverlay>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOverlay(param0.rawAddress)

public actual fun d3DKMTDestroyPagingQueue(param0: MutPtr<D3dddiDestroypagingqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyPagingQueue(param0.rawAddress)

public actual fun d3DKMTDestroyProtectedSession(param0: MutPtr<D3dkmtDestroyprotectedsession>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyProtectedSession(param0.rawAddress)

public actual fun d3DKMTDestroySynchronizationObject(param0: ConstPtr<D3dkmtDestroysynchronizationobject>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroySynchronizationObject(param0.rawAddress)

public actual fun d3DKMTEnumAdapters(param0: MutPtr<D3dkmtEnumadapters>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters(param0.rawAddress)

public actual fun d3DKMTEnumAdapters2(param0: MutPtr<D3dkmtEnumadapters2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters2(param0.rawAddress)

public actual fun d3DKMTEnumAdapters3(param0: MutPtr<D3dkmtEnumadapters3>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters3(param0.rawAddress)

public actual fun d3DKMTEscape(param0: ConstPtr<D3dkmtEscape>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTEscape(param0.rawAddress)

public actual fun d3DKMTEvict(param0: MutPtr<D3dkmtEvict>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTEvict(param0.rawAddress)

public actual fun d3DKMTFlipOverlay(param0: ConstPtr<D3dkmtFlipoverlay>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTFlipOverlay(param0.rawAddress)

public actual fun d3DKMTFlushHeapTransitions(param0: ConstPtr<D3dkmtFlushheaptransitions>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTFlushHeapTransitions(param0.rawAddress)

public actual fun d3DKMTFreeGpuVirtualAddress(param0: ConstPtr<D3dkmtFreegpuvirtualaddress>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTFreeGpuVirtualAddress(param0.rawAddress)

public actual fun d3DKMTGetAllocationPriority(param0: ConstPtr<D3dkmtGetallocationpriority>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetAllocationPriority(param0.rawAddress)

public actual fun d3DKMTGetContextInProcessSchedulingPriority(param0: MutPtr<D3dkmtGetcontextinprocessschedulingpriority>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextInProcessSchedulingPriority(param0.rawAddress)

public actual fun d3DKMTGetContextSchedulingPriority(param0: MutPtr<D3dkmtGetcontextschedulingpriority>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextSchedulingPriority(param0.rawAddress)

public actual fun d3DKMTGetDWMVerticalBlankEvent(param0: ConstPtr<D3dkmtGetverticalblankevent>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDWMVerticalBlankEvent(param0.rawAddress)

public actual fun d3DKMTGetDeviceState(param0: MutPtr<D3dkmtGetdevicestate>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDeviceState(param0.rawAddress)

public actual fun d3DKMTGetDisplayModeList(param0: MutPtr<D3dkmtGetdisplaymodelist>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDisplayModeList(param0.rawAddress)

public actual fun d3DKMTGetMultiPlaneOverlayCaps(param0: MutPtr<D3dkmtGetMultiplaneOverlayCaps>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultiPlaneOverlayCaps(param0.rawAddress)

public actual fun d3DKMTGetMultisampleMethodList(param0: MutPtr<D3dkmtGetmultisamplemethodlist>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultisampleMethodList(param0.rawAddress)

public actual fun d3DKMTGetOverlayState(param0: MutPtr<D3dkmtGetoverlaystate>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetOverlayState(param0.rawAddress)

public actual fun d3DKMTGetPostCompositionCaps(param0: MutPtr<D3dkmtGetPostCompositionCaps>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPostCompositionCaps(param0.rawAddress)

public actual fun d3DKMTGetPresentHistory(param0: MutPtr<D3dkmtGetpresenthistory>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentHistory(param0.rawAddress)

public actual fun d3DKMTGetPresentQueueEvent(hadapter: UInt, param1: MutPtr<Handle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentQueueEvent(hadapter.toInt(), param1.rawAddress)

public actual fun d3DKMTGetProcessDeviceRemovalSupport(param0: MutPtr<D3dkmtGetprocessdeviceremovalsupport>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessDeviceRemovalSupport(param0.rawAddress)

public actual fun d3DKMTGetProcessSchedulingPriorityClass(param0: Handle, param1: MutPtr<D3dkmtSchedulingpriorityclass>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessSchedulingPriorityClass(param0.rawAddress, param1.rawAddress)

public actual fun d3DKMTGetResourcePresentPrivateDriverData(param0: MutPtr<D3dddiGetresourcepresentprivatedriverdata>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetResourcePresentPrivateDriverData(param0.rawAddress)

public actual fun d3DKMTGetRuntimeData(param0: MutPtr<D3dkmtGetruntimedata>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetRuntimeData(param0.rawAddress)

public actual fun d3DKMTGetScanLine(param0: MutPtr<D3dkmtGetscanline>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetScanLine(param0.rawAddress)

public actual fun d3DKMTGetSharedPrimaryHandle(param0: MutPtr<D3dkmtGetsharedprimaryhandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedPrimaryHandle(param0.rawAddress)

public actual fun d3DKMTGetSharedResourceAdapterLuid(param0: MutPtr<D3dkmtGetsharedresourceadapterluid>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedResourceAdapterLuid(param0.rawAddress)

public actual fun d3DKMTInvalidateActiveVidPn(param0: ConstPtr<D3dkmtInvalidateactivevidpn>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateActiveVidPn(param0.rawAddress)

public actual fun d3DKMTInvalidateCache(param0: ConstPtr<D3dkmtInvalidatecache>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateCache(param0.rawAddress)

public actual fun d3DKMTLock(param0: MutPtr<D3dkmtLock>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTLock(param0.rawAddress)

public actual fun d3DKMTLock2(param0: MutPtr<D3dkmtLock2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTLock2(param0.rawAddress)

public actual fun d3DKMTMakeResident(param0: MutPtr<D3dddiMakeresident>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTMakeResident(param0.rawAddress)

public actual fun d3DKMTMapGpuVirtualAddress(param0: MutPtr<D3dddiMapgpuvirtualaddress>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTMapGpuVirtualAddress(param0.rawAddress)

public actual fun d3DKMTMarkDeviceAsError(param0: ConstPtr<D3dkmtMarkdeviceaserror>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTMarkDeviceAsError(param0.rawAddress)

public actual fun d3DKMTOfferAllocations(param0: ConstPtr<D3dkmtOfferallocations>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOfferAllocations(param0.rawAddress)

public actual fun d3DKMTOpenAdapterFromDeviceName(param0: MutPtr<D3dkmtOpenadapterfromdevicename>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromDeviceName(param0.rawAddress)

public actual fun d3DKMTOpenAdapterFromGdiDisplayName(param0: MutPtr<D3dkmtOpenadapterfromgdidisplayname>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromGdiDisplayName(param0.rawAddress)

public actual fun d3DKMTOpenAdapterFromHdc(param0: MutPtr<D3dkmtOpenadapterfromhdc>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromHdc(param0.rawAddress)

public actual fun d3DKMTOpenAdapterFromLuid(param0: MutPtr<D3dkmtOpenadapterfromluid>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromLuid(param0.rawAddress)

public actual fun d3DKMTOpenKeyedMutex(param0: MutPtr<D3dkmtOpenkeyedmutex>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex(param0.rawAddress)

public actual fun d3DKMTOpenKeyedMutex2(param0: MutPtr<D3dkmtOpenkeyedmutex2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex2(param0.rawAddress)

public actual fun d3DKMTOpenKeyedMutexFromNtHandle(param0: MutPtr<D3dkmtOpenkeyedmutexfromnthandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutexFromNtHandle(param0.rawAddress)

public actual fun d3DKMTOpenNtHandleFromName(param0: MutPtr<D3dkmtOpennthandlefromname>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenNtHandleFromName(param0.rawAddress)

public actual fun d3DKMTOpenProtectedSessionFromNtHandle(param0: MutPtr<D3dkmtOpenprotectedsessionfromnthandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenProtectedSessionFromNtHandle(param0.rawAddress)

public actual fun d3DKMTOpenResource(param0: MutPtr<D3dkmtOpenresource>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource(param0.rawAddress)

public actual fun d3DKMTOpenResource2(param0: MutPtr<D3dkmtOpenresource>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource2(param0.rawAddress)

public actual fun d3DKMTOpenResourceFromNtHandle(param0: MutPtr<D3dkmtOpenresourcefromnthandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResourceFromNtHandle(param0.rawAddress)

public actual fun d3DKMTOpenSyncObjectFromNtHandle(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle(param0.rawAddress)

public actual fun d3DKMTOpenSyncObjectFromNtHandle2(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle2(param0.rawAddress)

public actual fun d3DKMTOpenSyncObjectNtHandleFromName(param0: MutPtr<D3dkmtOpensyncobjectnthandlefromname>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectNtHandleFromName(param0.rawAddress)

public actual fun d3DKMTOpenSynchronizationObject(param0: MutPtr<D3dkmtOpensynchronizationobject>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSynchronizationObject(param0.rawAddress)

public actual fun d3DKMTOutputDuplGetFrameInfo(param0: MutPtr<D3dkmtOutputduplGetFrameinfo>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetFrameInfo(param0.rawAddress)

public actual fun d3DKMTOutputDuplGetMetaData(param0: MutPtr<D3dkmtOutputduplMetadata>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetMetaData(param0.rawAddress)

public actual fun d3DKMTOutputDuplGetPointerShapeData(param0: MutPtr<D3dkmtOutputduplGetPointerShapeData>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetPointerShapeData(param0.rawAddress)

public actual fun d3DKMTOutputDuplPresent(param0: ConstPtr<D3dkmtOutputduplpresent>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresent(param0.rawAddress)

public actual fun d3DKMTOutputDuplPresentToHwQueue(param0: ConstPtr<D3dkmtOutputduplpresenttohwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresentToHwQueue(param0.rawAddress)

public actual fun d3DKMTOutputDuplReleaseFrame(param0: MutPtr<D3dkmtOutputduplReleaseFrame>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplReleaseFrame(param0.rawAddress)

public actual fun d3DKMTPollDisplayChildren(param0: ConstPtr<D3dkmtPolldisplaychildren>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTPollDisplayChildren(param0.rawAddress)

public actual fun d3DKMTPresent(param0: MutPtr<D3dkmtPresent>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresent(param0.rawAddress)

public actual fun d3DKMTPresentMultiPlaneOverlay(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay(param0.rawAddress)

public actual fun d3DKMTPresentMultiPlaneOverlay2(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay2(param0.rawAddress)

public actual fun d3DKMTPresentMultiPlaneOverlay3(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay3>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay3(param0.rawAddress)

public actual fun d3DKMTPresentRedirected(param0: ConstPtr<D3dkmtPresentRedirected>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentRedirected(param0.rawAddress)

public actual fun d3DKMTQueryAdapterInfo(param0: MutPtr<D3dkmtQueryadapterinfo>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAdapterInfo(param0.rawAddress)

public actual fun d3DKMTQueryAllocationResidency(param0: ConstPtr<D3dkmtQueryallocationresidency>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAllocationResidency(param0.rawAddress)

public actual fun d3DKMTQueryClockCalibration(param0: MutPtr<D3dkmtQueryclockcalibration>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryClockCalibration(param0.rawAddress)

public actual fun d3DKMTQueryFSEBlock(param0: MutPtr<D3dkmtQueryfseblock>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryFSEBlock(param0.rawAddress)

public actual fun d3DKMTQueryProcessOfferInfo(param0: MutPtr<D3dkmtQueryprocessofferinfo>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProcessOfferInfo(param0.rawAddress)

public actual fun d3DKMTQueryProtectedSessionInfoFromNtHandle(param0: MutPtr<D3dkmtQueryprotectedsessioninfofromnthandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionInfoFromNtHandle(param0.rawAddress)

public actual fun d3DKMTQueryProtectedSessionStatus(param0: MutPtr<D3dkmtQueryprotectedsessionstatus>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionStatus(param0.rawAddress)

public actual fun d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: MutPtr<D3dkmtQueryremotevidpnsourcefromgdidisplayname>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0.rawAddress)

public actual fun d3DKMTQueryResourceInfo(param0: MutPtr<D3dkmtQueryresourceinfo>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfo(param0.rawAddress)

public actual fun d3DKMTQueryResourceInfoFromNtHandle(param0: MutPtr<D3dkmtQueryresourceinfofromnthandle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfoFromNtHandle(param0.rawAddress)

public actual fun d3DKMTQueryStatistics(param0: ConstPtr<D3dkmtQuerystatistics>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryStatistics(param0.rawAddress)

public actual fun d3DKMTQueryVidPnExclusiveOwnership(param0: MutPtr<D3dkmtQueryvidpnexclusiveownership>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVidPnExclusiveOwnership(param0.rawAddress)

public actual fun d3DKMTQueryVideoMemoryInfo(param0: MutPtr<D3dkmtQueryvideomemoryinfo>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVideoMemoryInfo(param0.rawAddress)

public actual fun d3DKMTReclaimAllocations(param0: MutPtr<D3dkmtReclaimallocations>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations(param0.rawAddress)

public actual fun d3DKMTReclaimAllocations2(param0: MutPtr<D3dkmtReclaimallocations2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations2(param0.rawAddress)

public actual fun d3DKMTRegisterTrimNotification(param0: MutPtr<D3dkmtRegistertrimnotification>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterTrimNotification(param0.rawAddress)

public actual fun d3DKMTRegisterVailProcess(param0: ConstPtr<Guid>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterVailProcess(param0.rawAddress)

public actual fun d3DKMTReleaseKeyedMutex(param0: MutPtr<D3dkmtReleasekeyedmutex>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex(param0.rawAddress)

public actual fun d3DKMTReleaseKeyedMutex2(param0: MutPtr<D3dkmtReleasekeyedmutex2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex2(param0.rawAddress)

public actual fun d3DKMTReleaseProcessVidPnSourceOwners(param0: Handle): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseProcessVidPnSourceOwners(param0.rawAddress)

public actual fun d3DKMTRender(param0: MutPtr<D3dkmtRender>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTRender(param0.rawAddress)

public actual fun d3DKMTReserveGpuVirtualAddress(param0: MutPtr<D3dddiReservegpuvirtualaddress>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTReserveGpuVirtualAddress(param0.rawAddress)

public actual fun d3DKMTSetAllocationPriority(param0: ConstPtr<D3dkmtSetallocationpriority>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetAllocationPriority(param0.rawAddress)

public actual fun d3DKMTSetContextInProcessSchedulingPriority(param0: ConstPtr<D3dkmtSetcontextinprocessschedulingpriority>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextInProcessSchedulingPriority(param0.rawAddress)

public actual fun d3DKMTSetContextSchedulingPriority(param0: ConstPtr<D3dkmtSetcontextschedulingpriority>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextSchedulingPriority(param0.rawAddress)

public actual fun d3DKMTSetDisplayMode(param0: MutPtr<D3dkmtSetdisplaymode>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayMode(param0.rawAddress)

public actual fun d3DKMTSetDisplayPrivateDriverFormat(param0: ConstPtr<D3dkmtSetdisplayprivatedriverformat>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayPrivateDriverFormat(param0.rawAddress)

public actual fun d3DKMTSetFSEBlock(param0: ConstPtr<D3dkmtSetfseblock>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetFSEBlock(param0.rawAddress)

public actual fun d3DKMTSetGammaRamp(param0: ConstPtr<D3dkmtSetgammaramp>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetGammaRamp(param0.rawAddress)

public actual fun d3DKMTSetHwProtectionTeardownRecovery(param0: ConstPtr<D3dkmtSethwprotectionteardownrecovery>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetHwProtectionTeardownRecovery(param0.rawAddress)

public actual fun d3DKMTSetMonitorColorSpaceTransform(param0: ConstPtr<D3dkmtSetColorspaceTransform>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetMonitorColorSpaceTransform(param0.rawAddress)

public actual fun d3DKMTSetProcessSchedulingPriorityClass(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetProcessSchedulingPriorityClass(param0.rawAddress, param1)

public actual fun d3DKMTSetQueuedLimit(param0: ConstPtr<D3dkmtSetqueuedlimit>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetQueuedLimit(param0.rawAddress)

public actual fun d3DKMTSetStablePowerState(param0: ConstPtr<D3dkmtSetstablepowerstate>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetStablePowerState(param0.rawAddress)

public actual fun d3DKMTSetSyncRefreshCountWaitTarget(param0: ConstPtr<D3dkmtSetsyncrefreshcountwaittarget>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetSyncRefreshCountWaitTarget(param0.rawAddress)

public actual fun d3DKMTSetVidPnSourceHwProtection(param0: ConstPtr<D3dkmtSetvidpnsourcehwprotection>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceHwProtection(param0.rawAddress)

public actual fun d3DKMTSetVidPnSourceOwner(param0: ConstPtr<D3dkmtSetvidpnsourceowner>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner(param0.rawAddress)

public actual fun d3DKMTSetVidPnSourceOwner1(param0: ConstPtr<D3dkmtSetvidpnsourceowner1>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner1(param0.rawAddress)

public actual fun d3DKMTSetVidPnSourceOwner2(param0: ConstPtr<D3dkmtSetvidpnsourceowner2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner2(param0.rawAddress)

public actual fun d3DKMTShareObjects(cobjects: UInt, hobjects: ConstPtr<UInt>, pobjectattributes: ConstPtr<ObjectAttributes>, dwdesiredaccess: UInt, phsharednthandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTShareObjects(cobjects.toInt(), hobjects.rawAddress, pobjectattributes.rawAddress, dwdesiredaccess.toInt(), phsharednthandle.rawAddress)

public actual fun d3DKMTSharedPrimaryLockNotification(param0: ConstPtr<D3dkmtSharedprimarylocknotification>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryLockNotification(param0.rawAddress)

public actual fun d3DKMTSharedPrimaryUnLockNotification(param0: ConstPtr<D3dkmtSharedprimaryunlocknotification>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryUnLockNotification(param0.rawAddress)

public actual fun d3DKMTSignalSynchronizationObject(param0: ConstPtr<D3dkmtSignalsynchronizationobject>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject(param0.rawAddress)

public actual fun d3DKMTSignalSynchronizationObject2(param0: ConstPtr<D3dkmtSignalsynchronizationobject2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject2(param0.rawAddress)

public actual fun d3DKMTSignalSynchronizationObjectFromCpu(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromcpu>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromCpu(param0.rawAddress)

public actual fun d3DKMTSignalSynchronizationObjectFromGpu(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu(param0.rawAddress)

public actual fun d3DKMTSignalSynchronizationObjectFromGpu2(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu2(param0.rawAddress)

public actual fun d3DKMTSubmitCommand(param0: ConstPtr<D3dkmtSubmitcommand>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommand(param0.rawAddress)

public actual fun d3DKMTSubmitCommandToHwQueue(param0: ConstPtr<D3dkmtSubmitcommandtohwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommandToHwQueue(param0.rawAddress)

public actual fun d3DKMTSubmitPresentBltToHwQueue(param0: ConstPtr<D3dkmtSubmitpresentblttohwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentBltToHwQueue(param0.rawAddress)

public actual fun d3DKMTSubmitPresentToHwQueue(param0: MutPtr<D3dkmtSubmitpresenttohwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentToHwQueue(param0.rawAddress)

public actual fun d3DKMTSubmitSignalSyncObjectsToHwQueue(param0: ConstPtr<D3dkmtSubmitsignalsyncobjectstohwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitSignalSyncObjectsToHwQueue(param0.rawAddress)

public actual fun d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: ConstPtr<D3dkmtSubmitwaitforsyncobjectstohwqueue>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitWaitForSyncObjectsToHwQueue(param0.rawAddress)

public actual fun d3DKMTTrimProcessCommitment(param0: MutPtr<D3dkmtTrimprocesscommitment>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTTrimProcessCommitment(param0.rawAddress)

public actual fun d3DKMTUnlock(param0: ConstPtr<D3dkmtUnlock>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock(param0.rawAddress)

public actual fun d3DKMTUnlock2(param0: ConstPtr<D3dkmtUnlock2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock2(param0.rawAddress)

public actual fun d3DKMTUnregisterTrimNotification(param0: MutPtr<D3dkmtUnregistertrimnotification>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTUnregisterTrimNotification(param0.rawAddress)

public actual fun d3DKMTUpdateAllocationProperty(param0: MutPtr<D3dddiUpdateallocproperty>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateAllocationProperty(param0.rawAddress)

public actual fun d3DKMTUpdateGpuVirtualAddress(param0: ConstPtr<D3dkmtUpdategpuvirtualaddress>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateGpuVirtualAddress(param0.rawAddress)

public actual fun d3DKMTUpdateOverlay(param0: ConstPtr<D3dkmtUpdateoverlay>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateOverlay(param0.rawAddress)

public actual fun d3DKMTWaitForIdle(param0: ConstPtr<D3dkmtWaitforidle>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForIdle(param0.rawAddress)

public actual fun d3DKMTWaitForSynchronizationObject(param0: ConstPtr<D3dkmtWaitforsynchronizationobject>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject(param0.rawAddress)

public actual fun d3DKMTWaitForSynchronizationObject2(param0: ConstPtr<D3dkmtWaitforsynchronizationobject2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject2(param0.rawAddress)

public actual fun d3DKMTWaitForSynchronizationObjectFromCpu(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromcpu>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromCpu(param0.rawAddress)

public actual fun d3DKMTWaitForSynchronizationObjectFromGpu(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromgpu>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromGpu(param0.rawAddress)

public actual fun d3DKMTWaitForVerticalBlankEvent(param0: ConstPtr<D3dkmtWaitforverticalblankevent>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent(param0.rawAddress)

public actual fun d3DKMTWaitForVerticalBlankEvent2(param0: ConstPtr<D3dkmtWaitforverticalblankevent2>): Ntstatus =
    WindowsWdkGraphicsDirect3dJniBridge.windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent2(param0.rawAddress)
