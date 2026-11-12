package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun d3DKMTAcquireKeyedMutex(param0: MutPtr<D3dkmtAcquirekeyedmutex>): Ntstatus

public expect fun d3DKMTAcquireKeyedMutex2(param0: MutPtr<D3dkmtAcquirekeyedmutex2>): Ntstatus

public expect fun d3DKMTAdjustFullscreenGamma(param0: ConstPtr<D3dkmtAdjustfullscreengamma>): Ntstatus

public expect fun d3DKMTCancelPresents(param0: ConstPtr<D3dkmtCancelPresents>): Ntstatus

public expect fun d3DKMTChangeSurfacePointer(param0: ConstPtr<D3dkmtChangesurfacepointer>): Ntstatus

public expect fun d3DKMTChangeVideoMemoryReservation(param0: ConstPtr<D3dkmtChangevideomemoryreservation>): Ntstatus

public expect fun d3DKMTCheckExclusiveOwnership(): Boolean

public expect fun d3DKMTCheckMonitorPowerState(param0: ConstPtr<D3dkmtCheckmonitorpowerstate>): Ntstatus

public expect fun d3DKMTCheckMultiPlaneOverlaySupport(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport>): Ntstatus

public expect fun d3DKMTCheckMultiPlaneOverlaySupport2(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport2>): Ntstatus

public expect fun d3DKMTCheckMultiPlaneOverlaySupport3(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport3>): Ntstatus

public expect fun d3DKMTCheckOcclusion(param0: ConstPtr<D3dkmtCheckocclusion>): Ntstatus

public expect fun d3DKMTCheckSharedResourceAccess(param0: ConstPtr<D3dkmtChecksharedresourceaccess>): Ntstatus

public expect fun d3DKMTCheckVidPnExclusiveOwnership(param0: ConstPtr<D3dkmtCheckvidpnexclusiveownership>): Ntstatus

public expect fun d3DKMTCloseAdapter(param0: ConstPtr<D3dkmtCloseadapter>): Ntstatus

public expect fun d3DKMTConfigureSharedResource(param0: ConstPtr<D3dkmtConfiguresharedresource>): Ntstatus

public expect fun d3DKMTCreateAllocation(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus

public expect fun d3DKMTCreateAllocation2(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus

public expect fun d3DKMTCreateContext(param0: MutPtr<D3dkmtCreatecontext>): Ntstatus

public expect fun d3DKMTCreateContextVirtual(param0: ConstPtr<D3dkmtCreatecontextvirtual>): Ntstatus

public expect fun d3DKMTCreateDCFromMemory(param0: MutPtr<D3dkmtCreatedcfrommemory>): Ntstatus

public expect fun d3DKMTCreateDevice(param0: MutPtr<D3dkmtCreatedevice>): Ntstatus

public expect fun d3DKMTCreateHwContext(param0: MutPtr<D3dkmtCreatehwcontext>): Ntstatus

public expect fun d3DKMTCreateHwQueue(param0: MutPtr<D3dkmtCreatehwqueue>): Ntstatus

public expect fun d3DKMTCreateKeyedMutex(param0: MutPtr<D3dkmtCreatekeyedmutex>): Ntstatus

public expect fun d3DKMTCreateKeyedMutex2(param0: MutPtr<D3dkmtCreatekeyedmutex2>): Ntstatus

public expect fun d3DKMTCreateOutputDupl(param0: ConstPtr<D3dkmtCreateOutputdupl>): Ntstatus

public expect fun d3DKMTCreateOverlay(param0: MutPtr<D3dkmtCreateoverlay>): Ntstatus

public expect fun d3DKMTCreatePagingQueue(param0: MutPtr<D3dkmtCreatepagingqueue>): Ntstatus

public expect fun d3DKMTCreateProtectedSession(param0: MutPtr<D3dkmtCreateprotectedsession>): Ntstatus

public expect fun d3DKMTCreateSynchronizationObject(param0: MutPtr<D3dkmtCreatesynchronizationobject>): Ntstatus

public expect fun d3DKMTCreateSynchronizationObject2(param0: MutPtr<D3dkmtCreatesynchronizationobject2>): Ntstatus

public expect fun d3DKMTDestroyAllocation(param0: ConstPtr<D3dkmtDestroyallocation>): Ntstatus

public expect fun d3DKMTDestroyAllocation2(param0: ConstPtr<D3dkmtDestroyallocation2>): Ntstatus

public expect fun d3DKMTDestroyContext(param0: ConstPtr<D3dkmtDestroycontext>): Ntstatus

public expect fun d3DKMTDestroyDCFromMemory(param0: ConstPtr<D3dkmtDestroydcfrommemory>): Ntstatus

public expect fun d3DKMTDestroyDevice(param0: ConstPtr<D3dkmtDestroydevice>): Ntstatus

public expect fun d3DKMTDestroyHwContext(param0: ConstPtr<D3dkmtDestroyhwcontext>): Ntstatus

public expect fun d3DKMTDestroyHwQueue(param0: ConstPtr<D3dkmtDestroyhwqueue>): Ntstatus

public expect fun d3DKMTDestroyKeyedMutex(param0: ConstPtr<D3dkmtDestroykeyedmutex>): Ntstatus

public expect fun d3DKMTDestroyOutputDupl(param0: ConstPtr<D3dkmtDestroyOutputdupl>): Ntstatus

public expect fun d3DKMTDestroyOverlay(param0: ConstPtr<D3dkmtDestroyoverlay>): Ntstatus

public expect fun d3DKMTDestroyPagingQueue(param0: MutPtr<D3dddiDestroypagingqueue>): Ntstatus

public expect fun d3DKMTDestroyProtectedSession(param0: MutPtr<D3dkmtDestroyprotectedsession>): Ntstatus

public expect fun d3DKMTDestroySynchronizationObject(param0: ConstPtr<D3dkmtDestroysynchronizationobject>): Ntstatus

public expect fun d3DKMTEnumAdapters(param0: MutPtr<D3dkmtEnumadapters>): Ntstatus

public expect fun d3DKMTEnumAdapters2(param0: MutPtr<D3dkmtEnumadapters2>): Ntstatus

public expect fun d3DKMTEnumAdapters3(param0: MutPtr<D3dkmtEnumadapters3>): Ntstatus

public expect fun d3DKMTEscape(param0: ConstPtr<D3dkmtEscape>): Ntstatus

public expect fun d3DKMTEvict(param0: MutPtr<D3dkmtEvict>): Ntstatus

public expect fun d3DKMTFlipOverlay(param0: ConstPtr<D3dkmtFlipoverlay>): Ntstatus

public expect fun d3DKMTFlushHeapTransitions(param0: ConstPtr<D3dkmtFlushheaptransitions>): Ntstatus

public expect fun d3DKMTFreeGpuVirtualAddress(param0: ConstPtr<D3dkmtFreegpuvirtualaddress>): Ntstatus

public expect fun d3DKMTGetAllocationPriority(param0: ConstPtr<D3dkmtGetallocationpriority>): Ntstatus

public expect fun d3DKMTGetContextInProcessSchedulingPriority(param0: MutPtr<D3dkmtGetcontextinprocessschedulingpriority>): Ntstatus

public expect fun d3DKMTGetContextSchedulingPriority(param0: MutPtr<D3dkmtGetcontextschedulingpriority>): Ntstatus

public expect fun d3DKMTGetDWMVerticalBlankEvent(param0: ConstPtr<D3dkmtGetverticalblankevent>): Ntstatus

public expect fun d3DKMTGetDeviceState(param0: MutPtr<D3dkmtGetdevicestate>): Ntstatus

public expect fun d3DKMTGetDisplayModeList(param0: MutPtr<D3dkmtGetdisplaymodelist>): Ntstatus

public expect fun d3DKMTGetMultiPlaneOverlayCaps(param0: MutPtr<D3dkmtGetMultiplaneOverlayCaps>): Ntstatus

public expect fun d3DKMTGetMultisampleMethodList(param0: MutPtr<D3dkmtGetmultisamplemethodlist>): Ntstatus

public expect fun d3DKMTGetOverlayState(param0: MutPtr<D3dkmtGetoverlaystate>): Ntstatus

public expect fun d3DKMTGetPostCompositionCaps(param0: MutPtr<D3dkmtGetPostCompositionCaps>): Ntstatus

public expect fun d3DKMTGetPresentHistory(param0: MutPtr<D3dkmtGetpresenthistory>): Ntstatus

public expect fun d3DKMTGetPresentQueueEvent(hadapter: UInt, param1: MutPtr<Handle>): Ntstatus

public expect fun d3DKMTGetProcessDeviceRemovalSupport(param0: MutPtr<D3dkmtGetprocessdeviceremovalsupport>): Ntstatus

public expect fun d3DKMTGetProcessSchedulingPriorityClass(param0: Handle, param1: MutPtr<D3dkmtSchedulingpriorityclass>): Ntstatus

public expect fun d3DKMTGetResourcePresentPrivateDriverData(param0: MutPtr<D3dddiGetresourcepresentprivatedriverdata>): Ntstatus

public expect fun d3DKMTGetRuntimeData(param0: MutPtr<D3dkmtGetruntimedata>): Ntstatus

public expect fun d3DKMTGetScanLine(param0: MutPtr<D3dkmtGetscanline>): Ntstatus

public expect fun d3DKMTGetSharedPrimaryHandle(param0: MutPtr<D3dkmtGetsharedprimaryhandle>): Ntstatus

public expect fun d3DKMTGetSharedResourceAdapterLuid(param0: MutPtr<D3dkmtGetsharedresourceadapterluid>): Ntstatus

public expect fun d3DKMTInvalidateActiveVidPn(param0: ConstPtr<D3dkmtInvalidateactivevidpn>): Ntstatus

public expect fun d3DKMTInvalidateCache(param0: ConstPtr<D3dkmtInvalidatecache>): Ntstatus

public expect fun d3DKMTLock(param0: MutPtr<D3dkmtLock>): Ntstatus

public expect fun d3DKMTLock2(param0: MutPtr<D3dkmtLock2>): Ntstatus

public expect fun d3DKMTMakeResident(param0: MutPtr<D3dddiMakeresident>): Ntstatus

public expect fun d3DKMTMapGpuVirtualAddress(param0: MutPtr<D3dddiMapgpuvirtualaddress>): Ntstatus

public expect fun d3DKMTMarkDeviceAsError(param0: ConstPtr<D3dkmtMarkdeviceaserror>): Ntstatus

public expect fun d3DKMTOfferAllocations(param0: ConstPtr<D3dkmtOfferallocations>): Ntstatus

public expect fun d3DKMTOpenAdapterFromDeviceName(param0: MutPtr<D3dkmtOpenadapterfromdevicename>): Ntstatus

public expect fun d3DKMTOpenAdapterFromGdiDisplayName(param0: MutPtr<D3dkmtOpenadapterfromgdidisplayname>): Ntstatus

public expect fun d3DKMTOpenAdapterFromHdc(param0: MutPtr<D3dkmtOpenadapterfromhdc>): Ntstatus

public expect fun d3DKMTOpenAdapterFromLuid(param0: MutPtr<D3dkmtOpenadapterfromluid>): Ntstatus

public expect fun d3DKMTOpenKeyedMutex(param0: MutPtr<D3dkmtOpenkeyedmutex>): Ntstatus

public expect fun d3DKMTOpenKeyedMutex2(param0: MutPtr<D3dkmtOpenkeyedmutex2>): Ntstatus

public expect fun d3DKMTOpenKeyedMutexFromNtHandle(param0: MutPtr<D3dkmtOpenkeyedmutexfromnthandle>): Ntstatus

public expect fun d3DKMTOpenNtHandleFromName(param0: MutPtr<D3dkmtOpennthandlefromname>): Ntstatus

public expect fun d3DKMTOpenProtectedSessionFromNtHandle(param0: MutPtr<D3dkmtOpenprotectedsessionfromnthandle>): Ntstatus

public expect fun d3DKMTOpenResource(param0: MutPtr<D3dkmtOpenresource>): Ntstatus

public expect fun d3DKMTOpenResource2(param0: MutPtr<D3dkmtOpenresource>): Ntstatus

public expect fun d3DKMTOpenResourceFromNtHandle(param0: MutPtr<D3dkmtOpenresourcefromnthandle>): Ntstatus

public expect fun d3DKMTOpenSyncObjectFromNtHandle(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle>): Ntstatus

public expect fun d3DKMTOpenSyncObjectFromNtHandle2(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle2>): Ntstatus

public expect fun d3DKMTOpenSyncObjectNtHandleFromName(param0: MutPtr<D3dkmtOpensyncobjectnthandlefromname>): Ntstatus

public expect fun d3DKMTOpenSynchronizationObject(param0: MutPtr<D3dkmtOpensynchronizationobject>): Ntstatus

public expect fun d3DKMTOutputDuplGetFrameInfo(param0: MutPtr<D3dkmtOutputduplGetFrameinfo>): Ntstatus

public expect fun d3DKMTOutputDuplGetMetaData(param0: MutPtr<D3dkmtOutputduplMetadata>): Ntstatus

public expect fun d3DKMTOutputDuplGetPointerShapeData(param0: MutPtr<D3dkmtOutputduplGetPointerShapeData>): Ntstatus

public expect fun d3DKMTOutputDuplPresent(param0: ConstPtr<D3dkmtOutputduplpresent>): Ntstatus

public expect fun d3DKMTOutputDuplPresentToHwQueue(param0: ConstPtr<D3dkmtOutputduplpresenttohwqueue>): Ntstatus

public expect fun d3DKMTOutputDuplReleaseFrame(param0: MutPtr<D3dkmtOutputduplReleaseFrame>): Ntstatus

public expect fun d3DKMTPollDisplayChildren(param0: ConstPtr<D3dkmtPolldisplaychildren>): Ntstatus

public expect fun d3DKMTPresent(param0: MutPtr<D3dkmtPresent>): Ntstatus

public expect fun d3DKMTPresentMultiPlaneOverlay(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay>): Ntstatus

public expect fun d3DKMTPresentMultiPlaneOverlay2(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay2>): Ntstatus

public expect fun d3DKMTPresentMultiPlaneOverlay3(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay3>): Ntstatus

public expect fun d3DKMTPresentRedirected(param0: ConstPtr<D3dkmtPresentRedirected>): Ntstatus

public expect fun d3DKMTQueryAdapterInfo(param0: MutPtr<D3dkmtQueryadapterinfo>): Ntstatus

public expect fun d3DKMTQueryAllocationResidency(param0: ConstPtr<D3dkmtQueryallocationresidency>): Ntstatus

public expect fun d3DKMTQueryClockCalibration(param0: MutPtr<D3dkmtQueryclockcalibration>): Ntstatus

public expect fun d3DKMTQueryFSEBlock(param0: MutPtr<D3dkmtQueryfseblock>): Ntstatus

public expect fun d3DKMTQueryProcessOfferInfo(param0: MutPtr<D3dkmtQueryprocessofferinfo>): Ntstatus

public expect fun d3DKMTQueryProtectedSessionInfoFromNtHandle(param0: MutPtr<D3dkmtQueryprotectedsessioninfofromnthandle>): Ntstatus

public expect fun d3DKMTQueryProtectedSessionStatus(param0: MutPtr<D3dkmtQueryprotectedsessionstatus>): Ntstatus

public expect fun d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: MutPtr<D3dkmtQueryremotevidpnsourcefromgdidisplayname>): Ntstatus

public expect fun d3DKMTQueryResourceInfo(param0: MutPtr<D3dkmtQueryresourceinfo>): Ntstatus

public expect fun d3DKMTQueryResourceInfoFromNtHandle(param0: MutPtr<D3dkmtQueryresourceinfofromnthandle>): Ntstatus

public expect fun d3DKMTQueryStatistics(param0: ConstPtr<D3dkmtQuerystatistics>): Ntstatus

public expect fun d3DKMTQueryVidPnExclusiveOwnership(param0: MutPtr<D3dkmtQueryvidpnexclusiveownership>): Ntstatus

public expect fun d3DKMTQueryVideoMemoryInfo(param0: MutPtr<D3dkmtQueryvideomemoryinfo>): Ntstatus

public expect fun d3DKMTReclaimAllocations(param0: MutPtr<D3dkmtReclaimallocations>): Ntstatus

public expect fun d3DKMTReclaimAllocations2(param0: MutPtr<D3dkmtReclaimallocations2>): Ntstatus

public expect fun d3DKMTRegisterTrimNotification(param0: MutPtr<D3dkmtRegistertrimnotification>): Ntstatus

public expect fun d3DKMTRegisterVailProcess(param0: ConstPtr<Guid>): Ntstatus

public expect fun d3DKMTReleaseKeyedMutex(param0: MutPtr<D3dkmtReleasekeyedmutex>): Ntstatus

public expect fun d3DKMTReleaseKeyedMutex2(param0: MutPtr<D3dkmtReleasekeyedmutex2>): Ntstatus

public expect fun d3DKMTReleaseProcessVidPnSourceOwners(param0: Handle): Ntstatus

public expect fun d3DKMTRender(param0: MutPtr<D3dkmtRender>): Ntstatus

public expect fun d3DKMTReserveGpuVirtualAddress(param0: MutPtr<D3dddiReservegpuvirtualaddress>): Ntstatus

public expect fun d3DKMTSetAllocationPriority(param0: ConstPtr<D3dkmtSetallocationpriority>): Ntstatus

public expect fun d3DKMTSetContextInProcessSchedulingPriority(param0: ConstPtr<D3dkmtSetcontextinprocessschedulingpriority>): Ntstatus

public expect fun d3DKMTSetContextSchedulingPriority(param0: ConstPtr<D3dkmtSetcontextschedulingpriority>): Ntstatus

public expect fun d3DKMTSetDisplayMode(param0: MutPtr<D3dkmtSetdisplaymode>): Ntstatus

public expect fun d3DKMTSetDisplayPrivateDriverFormat(param0: ConstPtr<D3dkmtSetdisplayprivatedriverformat>): Ntstatus

public expect fun d3DKMTSetFSEBlock(param0: ConstPtr<D3dkmtSetfseblock>): Ntstatus

public expect fun d3DKMTSetGammaRamp(param0: ConstPtr<D3dkmtSetgammaramp>): Ntstatus

public expect fun d3DKMTSetHwProtectionTeardownRecovery(param0: ConstPtr<D3dkmtSethwprotectionteardownrecovery>): Ntstatus

public expect fun d3DKMTSetMonitorColorSpaceTransform(param0: ConstPtr<D3dkmtSetColorspaceTransform>): Ntstatus

public expect fun d3DKMTSetProcessSchedulingPriorityClass(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus

public expect fun d3DKMTSetQueuedLimit(param0: ConstPtr<D3dkmtSetqueuedlimit>): Ntstatus

public expect fun d3DKMTSetStablePowerState(param0: ConstPtr<D3dkmtSetstablepowerstate>): Ntstatus

public expect fun d3DKMTSetSyncRefreshCountWaitTarget(param0: ConstPtr<D3dkmtSetsyncrefreshcountwaittarget>): Ntstatus

public expect fun d3DKMTSetVidPnSourceHwProtection(param0: ConstPtr<D3dkmtSetvidpnsourcehwprotection>): Ntstatus

public expect fun d3DKMTSetVidPnSourceOwner(param0: ConstPtr<D3dkmtSetvidpnsourceowner>): Ntstatus

public expect fun d3DKMTSetVidPnSourceOwner1(param0: ConstPtr<D3dkmtSetvidpnsourceowner1>): Ntstatus

public expect fun d3DKMTSetVidPnSourceOwner2(param0: ConstPtr<D3dkmtSetvidpnsourceowner2>): Ntstatus

public expect fun d3DKMTShareObjects(cobjects: UInt, hobjects: ConstPtr<UInt>, pobjectattributes: ConstPtr<ObjectAttributes>, dwdesiredaccess: UInt, phsharednthandle: MutPtr<Handle>): Ntstatus

public expect fun d3DKMTSharedPrimaryLockNotification(param0: ConstPtr<D3dkmtSharedprimarylocknotification>): Ntstatus

public expect fun d3DKMTSharedPrimaryUnLockNotification(param0: ConstPtr<D3dkmtSharedprimaryunlocknotification>): Ntstatus

public expect fun d3DKMTSignalSynchronizationObject(param0: ConstPtr<D3dkmtSignalsynchronizationobject>): Ntstatus

public expect fun d3DKMTSignalSynchronizationObject2(param0: ConstPtr<D3dkmtSignalsynchronizationobject2>): Ntstatus

public expect fun d3DKMTSignalSynchronizationObjectFromCpu(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromcpu>): Ntstatus

public expect fun d3DKMTSignalSynchronizationObjectFromGpu(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu>): Ntstatus

public expect fun d3DKMTSignalSynchronizationObjectFromGpu2(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu2>): Ntstatus

public expect fun d3DKMTSubmitCommand(param0: ConstPtr<D3dkmtSubmitcommand>): Ntstatus

public expect fun d3DKMTSubmitCommandToHwQueue(param0: ConstPtr<D3dkmtSubmitcommandtohwqueue>): Ntstatus

public expect fun d3DKMTSubmitPresentBltToHwQueue(param0: ConstPtr<D3dkmtSubmitpresentblttohwqueue>): Ntstatus

public expect fun d3DKMTSubmitPresentToHwQueue(param0: MutPtr<D3dkmtSubmitpresenttohwqueue>): Ntstatus

public expect fun d3DKMTSubmitSignalSyncObjectsToHwQueue(param0: ConstPtr<D3dkmtSubmitsignalsyncobjectstohwqueue>): Ntstatus

public expect fun d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: ConstPtr<D3dkmtSubmitwaitforsyncobjectstohwqueue>): Ntstatus

public expect fun d3DKMTTrimProcessCommitment(param0: MutPtr<D3dkmtTrimprocesscommitment>): Ntstatus

public expect fun d3DKMTUnlock(param0: ConstPtr<D3dkmtUnlock>): Ntstatus

public expect fun d3DKMTUnlock2(param0: ConstPtr<D3dkmtUnlock2>): Ntstatus

public expect fun d3DKMTUnregisterTrimNotification(param0: MutPtr<D3dkmtUnregistertrimnotification>): Ntstatus

public expect fun d3DKMTUpdateAllocationProperty(param0: MutPtr<D3dddiUpdateallocproperty>): Ntstatus

public expect fun d3DKMTUpdateGpuVirtualAddress(param0: ConstPtr<D3dkmtUpdategpuvirtualaddress>): Ntstatus

public expect fun d3DKMTUpdateOverlay(param0: ConstPtr<D3dkmtUpdateoverlay>): Ntstatus

public expect fun d3DKMTWaitForIdle(param0: ConstPtr<D3dkmtWaitforidle>): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObject(param0: ConstPtr<D3dkmtWaitforsynchronizationobject>): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObject2(param0: ConstPtr<D3dkmtWaitforsynchronizationobject2>): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObjectFromCpu(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromcpu>): Ntstatus

public expect fun d3DKMTWaitForSynchronizationObjectFromGpu(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromgpu>): Ntstatus

public expect fun d3DKMTWaitForVerticalBlankEvent(param0: ConstPtr<D3dkmtWaitforverticalblankevent>): Ntstatus

public expect fun d3DKMTWaitForVerticalBlankEvent2(param0: ConstPtr<D3dkmtWaitforverticalblankevent2>): Ntstatus
