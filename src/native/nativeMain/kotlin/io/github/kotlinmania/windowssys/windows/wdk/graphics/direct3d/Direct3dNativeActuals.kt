@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTAcquireKeyedMutex
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTAcquireKeyedMutex2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTAdjustFullscreenGamma
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCancelPresents
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTChangeSurfacePointer
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTChangeVideoMemoryReservation
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckExclusiveOwnership
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMonitorPowerState
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMultiPlaneOverlaySupport
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMultiPlaneOverlaySupport2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMultiPlaneOverlaySupport3
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckOcclusion
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckSharedResourceAccess
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckVidPnExclusiveOwnership
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCloseAdapter
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTConfigureSharedResource
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateAllocation
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateAllocation2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateContext
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateContextVirtual
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateDCFromMemory
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateDevice
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateHwContext
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateKeyedMutex
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateKeyedMutex2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateOutputDupl
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateOverlay
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreatePagingQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateProtectedSession
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateSynchronizationObject
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateSynchronizationObject2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyAllocation
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyAllocation2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyContext
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyDCFromMemory
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyDevice
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyHwContext
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyKeyedMutex
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyOutputDupl
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyOverlay
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyPagingQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyProtectedSession
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroySynchronizationObject
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTEnumAdapters
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTEnumAdapters2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTEnumAdapters3
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTEscape
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTEvict
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTFlipOverlay
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTFlushHeapTransitions
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTFreeGpuVirtualAddress
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetAllocationPriority
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetContextInProcessSchedulingPriority
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetContextSchedulingPriority
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetDWMVerticalBlankEvent
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetDeviceState
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetDisplayModeList
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetMultiPlaneOverlayCaps
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetMultisampleMethodList
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetOverlayState
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetPostCompositionCaps
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetPresentHistory
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetPresentQueueEvent
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetProcessDeviceRemovalSupport
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetProcessSchedulingPriorityClass
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetResourcePresentPrivateDriverData
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetRuntimeData
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetScanLine
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetSharedPrimaryHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTGetSharedResourceAdapterLuid
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTInvalidateActiveVidPn
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTInvalidateCache
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTLock
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTLock2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTMakeResident
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTMapGpuVirtualAddress
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTMarkDeviceAsError
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOfferAllocations
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromDeviceName
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromGdiDisplayName
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromHdc
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromLuid
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenKeyedMutex
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenKeyedMutex2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenKeyedMutexFromNtHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenNtHandleFromName
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenProtectedSessionFromNtHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenResource
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenResource2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenResourceFromNtHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSyncObjectFromNtHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSyncObjectFromNtHandle2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSyncObjectNtHandleFromName
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSynchronizationObject
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplGetFrameInfo
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplGetMetaData
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplGetPointerShapeData
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplPresent
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplPresentToHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplReleaseFrame
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTPollDisplayChildren
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTPresent
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentMultiPlaneOverlay
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentMultiPlaneOverlay2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentMultiPlaneOverlay3
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentRedirected
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryAdapterInfo
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryAllocationResidency
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryClockCalibration
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryFSEBlock
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryProcessOfferInfo
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryProtectedSessionInfoFromNtHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryProtectedSessionStatus
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryResourceInfo
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryResourceInfoFromNtHandle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryStatistics
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryVidPnExclusiveOwnership
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryVideoMemoryInfo
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTReclaimAllocations
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTReclaimAllocations2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTRegisterTrimNotification
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTRegisterVailProcess
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTReleaseKeyedMutex
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTReleaseKeyedMutex2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTReleaseProcessVidPnSourceOwners
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTRender
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTReserveGpuVirtualAddress
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetAllocationPriority
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetContextInProcessSchedulingPriority
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetContextSchedulingPriority
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetDisplayMode
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetDisplayPrivateDriverFormat
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetFSEBlock
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetGammaRamp
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetHwProtectionTeardownRecovery
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetMonitorColorSpaceTransform
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetProcessSchedulingPriorityClass
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetQueuedLimit
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetStablePowerState
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetSyncRefreshCountWaitTarget
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceHwProtection
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceOwner
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceOwner1
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceOwner2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTShareObjects
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSharedPrimaryLockNotification
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSharedPrimaryUnLockNotification
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObject
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObject2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObjectFromCpu
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObjectFromGpu
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObjectFromGpu2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitCommand
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitCommandToHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitPresentBltToHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitPresentToHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitSignalSyncObjectsToHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitWaitForSyncObjectsToHwQueue
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTTrimProcessCommitment
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTUnlock
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTUnlock2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTUnregisterTrimNotification
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTUpdateAllocationProperty
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTUpdateGpuVirtualAddress
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTUpdateOverlay
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForIdle
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObject
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObject2
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObjectFromCpu
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObjectFromGpu
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForVerticalBlankEvent
import io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d.cinterop.windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForVerticalBlankEvent2
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun d3DKMTAcquireKeyedMutex(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTAcquireKeyedMutex(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTAcquireKeyedMutex2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTAcquireKeyedMutex2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTAdjustFullscreenGamma(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTAdjustFullscreenGamma(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCancelPresents(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCancelPresents(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTChangeSurfacePointer(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTChangeSurfacePointer(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTChangeVideoMemoryReservation(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTChangeVideoMemoryReservation(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckExclusiveOwnership(): Boolean =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckExclusiveOwnership()

public actual fun d3DKMTCheckMonitorPowerState(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMonitorPowerState(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckMultiPlaneOverlaySupport(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMultiPlaneOverlaySupport(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckMultiPlaneOverlaySupport2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMultiPlaneOverlaySupport2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckMultiPlaneOverlaySupport3(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckMultiPlaneOverlaySupport3(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckOcclusion(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckOcclusion(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckSharedResourceAccess(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckSharedResourceAccess(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCheckVidPnExclusiveOwnership(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCheckVidPnExclusiveOwnership(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCloseAdapter(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCloseAdapter(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTConfigureSharedResource(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTConfigureSharedResource(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateAllocation(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateAllocation(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateAllocation2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateAllocation2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateContext(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateContext(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateContextVirtual(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateContextVirtual(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateDCFromMemory(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateDCFromMemory(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateDevice(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateDevice(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateHwContext(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateHwContext(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateKeyedMutex(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateKeyedMutex(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateKeyedMutex2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateKeyedMutex2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateOutputDupl(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateOutputDupl(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateOverlay(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateOverlay(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreatePagingQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreatePagingQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateProtectedSession(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateProtectedSession(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateSynchronizationObject(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateSynchronizationObject(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTCreateSynchronizationObject2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTCreateSynchronizationObject2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyAllocation(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyAllocation(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyAllocation2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyAllocation2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyContext(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyContext(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyDCFromMemory(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyDCFromMemory(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyDevice(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyDevice(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyHwContext(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyHwContext(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyKeyedMutex(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyKeyedMutex(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyOutputDupl(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyOutputDupl(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyOverlay(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyOverlay(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyPagingQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyPagingQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroyProtectedSession(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroyProtectedSession(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTDestroySynchronizationObject(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTDestroySynchronizationObject(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTEnumAdapters(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTEnumAdapters(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTEnumAdapters2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTEnumAdapters2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTEnumAdapters3(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTEnumAdapters3(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTEscape(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTEscape(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTEvict(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTEvict(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTFlipOverlay(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTFlipOverlay(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTFlushHeapTransitions(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTFlushHeapTransitions(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTFreeGpuVirtualAddress(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTFreeGpuVirtualAddress(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetAllocationPriority(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetAllocationPriority(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetContextInProcessSchedulingPriority(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetContextInProcessSchedulingPriority(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetContextSchedulingPriority(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetContextSchedulingPriority(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetDWMVerticalBlankEvent(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetDWMVerticalBlankEvent(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetDeviceState(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetDeviceState(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetDisplayModeList(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetDisplayModeList(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetMultiPlaneOverlayCaps(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetMultiPlaneOverlayCaps(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetMultisampleMethodList(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetMultisampleMethodList(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetOverlayState(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetOverlayState(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetPostCompositionCaps(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetPostCompositionCaps(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetPresentHistory(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetPresentHistory(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetPresentQueueEvent(hadapter: UInt, param1: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetPresentQueueEvent(hadapter, param1?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetProcessDeviceRemovalSupport(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetProcessDeviceRemovalSupport(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetProcessSchedulingPriorityClass(param0: Handle, param1: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetProcessSchedulingPriorityClass(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetResourcePresentPrivateDriverData(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetResourcePresentPrivateDriverData(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetRuntimeData(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetRuntimeData(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetScanLine(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetScanLine(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetSharedPrimaryHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetSharedPrimaryHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTGetSharedResourceAdapterLuid(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTGetSharedResourceAdapterLuid(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTInvalidateActiveVidPn(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTInvalidateActiveVidPn(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTInvalidateCache(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTInvalidateCache(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTLock(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTLock(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTLock2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTLock2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTMakeResident(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTMakeResident(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTMapGpuVirtualAddress(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTMapGpuVirtualAddress(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTMarkDeviceAsError(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTMarkDeviceAsError(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOfferAllocations(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOfferAllocations(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenAdapterFromDeviceName(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromDeviceName(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenAdapterFromGdiDisplayName(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromGdiDisplayName(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenAdapterFromHdc(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromHdc(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenAdapterFromLuid(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenAdapterFromLuid(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenKeyedMutex(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenKeyedMutex(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenKeyedMutex2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenKeyedMutex2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenKeyedMutexFromNtHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenKeyedMutexFromNtHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenNtHandleFromName(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenNtHandleFromName(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenProtectedSessionFromNtHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenProtectedSessionFromNtHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenResource(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenResource(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenResource2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenResource2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenResourceFromNtHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenResourceFromNtHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenSyncObjectFromNtHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSyncObjectFromNtHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenSyncObjectFromNtHandle2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSyncObjectFromNtHandle2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenSyncObjectNtHandleFromName(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSyncObjectNtHandleFromName(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOpenSynchronizationObject(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOpenSynchronizationObject(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOutputDuplGetFrameInfo(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplGetFrameInfo(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOutputDuplGetMetaData(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplGetMetaData(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOutputDuplGetPointerShapeData(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplGetPointerShapeData(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOutputDuplPresent(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplPresent(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOutputDuplPresentToHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplPresentToHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTOutputDuplReleaseFrame(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTOutputDuplReleaseFrame(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTPollDisplayChildren(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTPollDisplayChildren(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTPresent(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTPresent(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTPresentMultiPlaneOverlay(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentMultiPlaneOverlay(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTPresentMultiPlaneOverlay2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentMultiPlaneOverlay2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTPresentMultiPlaneOverlay3(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentMultiPlaneOverlay3(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTPresentRedirected(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTPresentRedirected(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryAdapterInfo(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryAdapterInfo(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryAllocationResidency(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryAllocationResidency(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryClockCalibration(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryClockCalibration(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryFSEBlock(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryFSEBlock(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryProcessOfferInfo(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryProcessOfferInfo(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryProtectedSessionInfoFromNtHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryProtectedSessionInfoFromNtHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryProtectedSessionStatus(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryProtectedSessionStatus(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryResourceInfo(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryResourceInfo(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryResourceInfoFromNtHandle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryResourceInfoFromNtHandle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryStatistics(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryStatistics(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryVidPnExclusiveOwnership(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryVidPnExclusiveOwnership(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTQueryVideoMemoryInfo(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTQueryVideoMemoryInfo(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTReclaimAllocations(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTReclaimAllocations(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTReclaimAllocations2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTReclaimAllocations2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTRegisterTrimNotification(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTRegisterTrimNotification(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTRegisterVailProcess(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTRegisterVailProcess(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTReleaseKeyedMutex(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTReleaseKeyedMutex(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTReleaseKeyedMutex2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTReleaseKeyedMutex2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTReleaseProcessVidPnSourceOwners(param0: Handle): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTReleaseProcessVidPnSourceOwners(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTRender(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTRender(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTReserveGpuVirtualAddress(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTReserveGpuVirtualAddress(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetAllocationPriority(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetAllocationPriority(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetContextInProcessSchedulingPriority(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetContextInProcessSchedulingPriority(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetContextSchedulingPriority(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetContextSchedulingPriority(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetDisplayMode(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetDisplayMode(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetDisplayPrivateDriverFormat(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetDisplayPrivateDriverFormat(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetFSEBlock(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetFSEBlock(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetGammaRamp(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetGammaRamp(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetHwProtectionTeardownRecovery(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetHwProtectionTeardownRecovery(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetMonitorColorSpaceTransform(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetMonitorColorSpaceTransform(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetProcessSchedulingPriorityClass(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetProcessSchedulingPriorityClass(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun d3DKMTSetQueuedLimit(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetQueuedLimit(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetStablePowerState(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetStablePowerState(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetSyncRefreshCountWaitTarget(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetSyncRefreshCountWaitTarget(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetVidPnSourceHwProtection(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceHwProtection(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetVidPnSourceOwner(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceOwner(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetVidPnSourceOwner1(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceOwner1(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSetVidPnSourceOwner2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSetVidPnSourceOwner2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTShareObjects(cobjects: UInt, hobjects: COpaquePointer?, pobjectattributes: COpaquePointer?, dwdesiredaccess: UInt, phsharednthandle: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTShareObjects(cobjects, hobjects?.value?.toCPointer<ByteVar>(), pobjectattributes?.value?.toCPointer<ByteVar>(), dwdesiredaccess, phsharednthandle?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSharedPrimaryLockNotification(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSharedPrimaryLockNotification(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSharedPrimaryUnLockNotification(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSharedPrimaryUnLockNotification(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSignalSynchronizationObject(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObject(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSignalSynchronizationObject2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObject2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSignalSynchronizationObjectFromCpu(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObjectFromCpu(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSignalSynchronizationObjectFromGpu(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObjectFromGpu(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSignalSynchronizationObjectFromGpu2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSignalSynchronizationObjectFromGpu2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSubmitCommand(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitCommand(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSubmitCommandToHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitCommandToHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSubmitPresentBltToHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitPresentBltToHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSubmitPresentToHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitPresentToHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSubmitSignalSyncObjectsToHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitSignalSyncObjectsToHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTTrimProcessCommitment(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTTrimProcessCommitment(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTUnlock(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTUnlock(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTUnlock2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTUnlock2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTUnregisterTrimNotification(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTUnregisterTrimNotification(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTUpdateAllocationProperty(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTUpdateAllocationProperty(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTUpdateGpuVirtualAddress(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTUpdateGpuVirtualAddress(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTUpdateOverlay(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTUpdateOverlay(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForIdle(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForIdle(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForSynchronizationObject(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObject(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForSynchronizationObject2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObject2(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForSynchronizationObjectFromCpu(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObjectFromCpu(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForSynchronizationObjectFromGpu(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForSynchronizationObjectFromGpu(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForVerticalBlankEvent(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForVerticalBlankEvent(param0?.value?.toCPointer<ByteVar>())

public actual fun d3DKMTWaitForVerticalBlankEvent2(param0: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_graphics_direct3d_d3DKMTWaitForVerticalBlankEvent2(param0?.value?.toCPointer<ByteVar>())
