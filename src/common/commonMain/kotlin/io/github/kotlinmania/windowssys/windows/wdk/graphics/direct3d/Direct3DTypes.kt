package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

public typealias D3dddiformat = UInt

public typealias D3dddigpuvirtualaddressReservationType = Int

public typealias D3dddimultisampleType = Int

public typealias D3dddiColorSpaceType = Int

public typealias D3dddiDoorbellstatus = Int

public typealias D3dddiDriverescapetype = Int

public typealias D3dddiFlipintervalType = Int

public typealias D3dddiGammarampType = Int

public typealias D3dddiHdrMetadataType = Int

public typealias D3dddiOfferPriority = Int

public typealias D3dddiOutputWireColorSpaceType = Int

public typealias D3dddiPagingqueuePriority = Int

public typealias D3dddiPool = Int

public typealias D3dddiQueryregistryStatus = Int

public typealias D3dddiQueryregistryType = Int

public typealias D3dddiReclaimResult = Int

public typealias D3dddiRotation = Int

public typealias D3dddiScanlineordering = Int

public typealias D3dddiSynchronizationobjectType = Int

public typealias D3dddiUpdategpuvirtualaddressOperationType = Int

public typealias D3dddiVideoSignalScanlineOrdering = Int

public typealias D3dhalDp2operation = Int

public typealias D3dkmdtColorspaceTransformStageControl = Int

public typealias D3dkmdtColorBasis = Int

public typealias D3dkmdtComputePreemptionGranularity = Int

public typealias D3dkmdtEnumcofuncmodalityPivotType = Int

public typealias D3dkmdtGdisurfacetype = Int

public typealias D3dkmdtGraphicsPreemptionGranularity = Int

public typealias D3dkmdtGtfcompliance = Int

public typealias D3dkmdtModePreference = Int

public typealias D3dkmdtModePruningReason = Int

public typealias D3dkmdtMonitorCapabilitiesOrigin = Int

public typealias D3dkmdtMonitorConnectivityChecks = Int

public typealias D3dkmdtMonitorDescriptorType = Int

public typealias D3dkmdtMonitorFrequencyRangeConstraint = Int

public typealias D3dkmdtMonitorOrientation = Int

public typealias D3dkmdtMonitorOrientationAwareness = Int

public typealias D3dkmdtMonitorTimingType = Int

public typealias D3dkmdtPixelValueAccessMode = Int

public typealias D3dkmdtStandardallocationType = Int

public typealias D3dkmdtTextRenderingFormat = Int

public typealias D3dkmdtVideoOutputTechnology = Int

public typealias D3dkmdtVideoSignalStandard = Int

public typealias D3dkmdtVidpnPresentPathContent = Int

public typealias D3dkmdtVidpnPresentPathCopyprotectionType = Int

public typealias D3dkmdtVidpnPresentPathImportance = Int

public typealias D3dkmdtVidpnPresentPathRotation = Int

public typealias D3dkmdtVidpnPresentPathScaling = Int

public typealias D3dkmdtVidpnSourceModeType = Int

public typealias D3dkmtActivateSpecificDiagType = Int

public typealias D3dkmtAdapterVerifierOptionType = Int

public typealias D3dkmtAllocationresidencystatus = Int

public typealias D3dkmtAuxiliarypresentinfoType = Int

public typealias D3dkmtBrightnessInfoType = Int

public typealias D3dkmtCancelPresentsOperation = Int

public typealias D3dkmtClienthint = Int

public typealias D3dkmtCrossadapterresourceSupportTier = Int

public typealias D3dkmtDefragEscapeOperation = Int

public typealias D3dkmtDeviceescapeType = Int

public typealias D3dkmtDeviceexecutionState = Int

public typealias D3dkmtDevicestateType = Int

public typealias D3dkmtDeviceErrorReason = Int

public typealias D3dkmtDmmescapetype = Int

public typealias D3dkmtDriverversion = Int

public typealias D3dkmtEscapetype = Int

public typealias D3dkmtEscapePfnControlCommand = Int

public typealias D3dkmtEscapeVirtualRefreshRateType = Int

public typealias D3dkmtFlipmodelIndependentFlipStage = Int

public typealias D3dkmtGpuPreferenceQueryState = Int

public typealias D3dkmtGpuPreferenceQueryType = Int

public typealias D3dkmtMemorySegmentGroup = Int

public typealias D3dkmtMiracastDeviceStatus = Int

public typealias D3dkmtMiracastDisplayDeviceState = Int

public typealias D3dkmtMiracastDriverType = Int

public typealias D3dkmtMultiplaneOverlayBlend = Int

public typealias D3dkmtMultiplaneOverlayFlags = Int

public typealias D3dkmtMultiplaneOverlayStereoFormat = Int

public typealias D3dkmtMultiplaneOverlayVideoFrameFormat = Int

public typealias D3dkmtMultiplaneOverlayYcbCrFlags = Int

public typealias D3dkmtOfferPriority = Int

public typealias D3dkmtOutduplPointerShapeType = Int

public typealias D3dkmtOutputduplMetadatatype = Int

public typealias D3dkmtPnpKeyType = Int

public typealias D3dkmtPresentModel = Int

public typealias D3dkmtProcessVerifierOptionType = Int

public typealias D3dkmtProtectedSessionStatus = Int

public typealias D3dkmtQueryresultPreemptionAttemptResult = Int

public typealias D3dkmtQuerystatisticsAllocationPriorityClass = Int

public typealias D3dkmtQuerystatisticsDmaPacketType = Int

public typealias D3dkmtQuerystatisticsQueuePacketType = Int

public typealias D3dkmtQuerystatisticsSegmentType = Int

public typealias D3dkmtQuerystatisticsType = Int

public typealias D3dkmtQueuedlimitType = Int

public typealias D3dkmtSchedulingpriorityclass = Int

public typealias D3dkmtStandardallocationtype = Int

public typealias D3dkmtTdrdbgctrltype = Int

public typealias D3dkmtVadEscapeCommand = Int

public typealias D3dkmtVerifierOptionMode = Int

public typealias D3dkmtVidmmescapetype = Int

public typealias D3dkmtVidpnsourceownerType = Int

public typealias D3dkmtVidschescapetype = Int

public typealias D3dnthalDp2operation = Int

public typealias D3dvsdTokentype = Int

public typealias DisplayidDetailedTimingTypeIAspectRatio = Int

public typealias DisplayidDetailedTimingTypeIScanningMode = Int

public typealias DisplayidDetailedTimingTypeIStereoMode = Int

public typealias DisplayidDetailedTimingTypeISyncPolarity = Int

public typealias DxgkdtOpmDviCharacteristics = Int

public typealias DxgkmdtCertificateType = Int

public typealias DxgkmdtOpmAcpProtectionLevel = Int

public typealias DxgkmdtOpmBusTypeAndImplementation = Int

public typealias DxgkmdtOpmCgmsa = Int

public typealias DxgkmdtOpmConnectorType = Int

public typealias DxgkmdtOpmDpcpProtectionLevel = Int

public typealias DxgkmdtOpmHdcpFlag = Int

public typealias DxgkmdtOpmHdcpProtectionLevel = Int

public typealias DxgkmdtOpmImageAspectRatioEn300294 = Int

public typealias DxgkmdtOpmInterleaveFormat = Int

public typealias DxgkmdtOpmOutputHardwareProtection = Int

public typealias DxgkmdtOpmProtectionStandard = Int

public typealias DxgkmdtOpmProtectionType = Int

public typealias DxgkmdtOpmStatus = Int

public typealias DxgkmdtOpmTypeEnforcementHdcpProtectionLevel = Int

public typealias DxgkmdtOpmVideoOutputSemantics = Int

public typealias DxgkmtMultiplaneOverlayStereoFlipMode = Int

public typealias DxgkmtMultiplaneOverlayStretchQuality = Int

public typealias DxgkmtPowerSharedType = Int

public typealias DxgkvgpuEscapeType = Int

public typealias DxgkBacklightOptimizationLevel = Int

public typealias DxgkChildDeviceHpdAwareness = Int

public typealias DxgkDisplayDescriptorType = UByte

public typealias DxgkDisplayTechnology = UByte

public typealias DxgkDisplayUsage = UByte

public typealias DxgkEngineType = Int

public typealias DxgkGeneralErrorCode = Int

public typealias DxgkMiracastChunkType = Int

public typealias DxgkPageFaultFlags = Int

public typealias DxgkPtePageSize = Int

public typealias DxgkRenderPipelineStage = Int

public typealias Kmtqueryadapterinfotype = Int

public typealias Kmtumdversion = Int

public typealias KmtDisplayUmdVersion = Int

public fun interface Lpd3dhalContextdestroyallcbFn {
    public operator fun invoke(param0: MutPtr<D3dhalContextdestroyalldata>): UInt
}

public typealias Lpd3dhalContextdestroyallcb = Lpd3dhalContextdestroyallcbFn?

public fun interface Lpd3dhalContextdestroycbFn {
    public operator fun invoke(param0: MutPtr<D3dhalContextdestroydata>): UInt
}

public typealias Lpd3dhalContextdestroycb = Lpd3dhalContextdestroycbFn?

public fun interface Lpd3dhalDrawprimitivescbFn {
    public operator fun invoke(param0: MutPtr<D3dhalDrawprimitivesdata>): UInt
}

public typealias Lpd3dhalDrawprimitivescb = Lpd3dhalDrawprimitivescbFn?

public fun interface Lpd3dhalScenecapturecbFn {
    public operator fun invoke(param0: MutPtr<D3dhalScenecapturedata>): UInt
}

public typealias Lpd3dhalScenecapturecb = Lpd3dhalScenecapturecbFn?

public fun interface Lpd3dhalTexturedestroycbFn {
    public operator fun invoke(param0: MutPtr<D3dhalTexturedestroydata>): UInt
}

public typealias Lpd3dhalTexturedestroycb = Lpd3dhalTexturedestroycbFn?

public fun interface Lpd3dhalTexturegetsurfcbFn {
    public operator fun invoke(param0: MutPtr<D3dhalTexturegetsurfdata>): UInt
}

public typealias Lpd3dhalTexturegetsurfcb = Lpd3dhalTexturegetsurfcbFn?

public fun interface Lpd3dhalTextureswapcbFn {
    public operator fun invoke(param0: MutPtr<D3dhalTextureswapdata>): UInt
}

public typealias Lpd3dhalTextureswapcb = Lpd3dhalTextureswapcbFn?

public fun interface Lpd3dhalValidatetexturestagestatecbFn {
    public operator fun invoke(param0: MutPtr<D3dhalValidatetexturestagestatedata>): UInt
}

public typealias Lpd3dhalValidatetexturestagestatecb = Lpd3dhalValidatetexturestagestatecbFn?

public fun interface Lpd3dnthalContextdestroyallcbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalContextdestroyalldata>): UInt
}

public typealias Lpd3dnthalContextdestroyallcb = Lpd3dnthalContextdestroyallcbFn?

public fun interface Lpd3dnthalContextdestroycbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalContextdestroydata>): UInt
}

public typealias Lpd3dnthalContextdestroycb = Lpd3dnthalContextdestroycbFn?

public fun interface Lpd3dnthalScenecapturecbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalScenecapturedata>): UInt
}

public typealias Lpd3dnthalScenecapturecb = Lpd3dnthalScenecapturecbFn?

public fun interface Lpd3dnthalTexturecreatecbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalTexturecreatedata>): UInt
}

public typealias Lpd3dnthalTexturecreatecb = Lpd3dnthalTexturecreatecbFn?

public fun interface Lpd3dnthalTexturedestroycbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalTexturedestroydata>): UInt
}

public typealias Lpd3dnthalTexturedestroycb = Lpd3dnthalTexturedestroycbFn?

public fun interface Lpd3dnthalTexturegetsurfcbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalTexturegetsurfdata>): UInt
}

public typealias Lpd3dnthalTexturegetsurfcb = Lpd3dnthalTexturegetsurfcbFn?

public fun interface Lpd3dnthalTextureswapcbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalTextureswapdata>): UInt
}

public typealias Lpd3dnthalTextureswapcb = Lpd3dnthalTextureswapcbFn?

public fun interface Lpd3dnthalValidatetexturestagestatecbFn {
    public operator fun invoke(param0: MutPtr<D3dnthalValidatetexturestagestatedata>): UInt
}

public typealias Lpd3dnthalValidatetexturestagestatecb = Lpd3dnthalValidatetexturestagestatecbFn?

public typealias OutputduplContextDebugStatus = Int

public fun interface PdxgkFstateNotificationFn {
    public operator fun invoke(graphicsdevicehandle: MutPtr<CVoid>, componentindex: UInt, newfstate: UInt, prenotification: Boolean, privatehandle: MutPtr<CVoid>)
}

public typealias PdxgkFstateNotification = PdxgkFstateNotificationFn?

public fun interface PdxgkGraphicspowerUnregisterFn {
    public operator fun invoke(devicehandle: MutPtr<CVoid>, privatehandle: MutPtr<CVoid>): Ntstatus
}

public typealias PdxgkGraphicspowerUnregister = PdxgkGraphicspowerUnregisterFn?

public fun interface PdxgkInitialComponentStateFn {
    public operator fun invoke(graphicsdevicehandle: MutPtr<CVoid>, privatehandle: MutPtr<CVoid>, componentindex: UInt, isblockingtype: Boolean, initialfstate: UInt, componentguid: Guid, powercomponentmappingflag: UInt)
}

public typealias PdxgkInitialComponentState = PdxgkInitialComponentStateFn?

public fun interface PdxgkPowerNotificationFn {
    public operator fun invoke(graphicsdevicehandle: MutPtr<CVoid>, newgrfxpowerstate: DevicePowerState, prenotification: Boolean, privatehandle: MutPtr<CVoid>)
}

public typealias PdxgkPowerNotification = PdxgkPowerNotificationFn?

public fun interface PdxgkRemovalNotificationFn {
    public operator fun invoke(graphicsdevicehandle: MutPtr<CVoid>, privatehandle: MutPtr<CVoid>)
}

public typealias PdxgkRemovalNotification = PdxgkRemovalNotificationFn?

public fun interface PdxgkSetSharedPowerComponentStateFn {
    public operator fun invoke(devicehandle: MutPtr<CVoid>, privatehandle: MutPtr<CVoid>, componentindex: UInt, active: Boolean): Ntstatus
}

public typealias PdxgkSetSharedPowerComponentState = PdxgkSetSharedPowerComponentStateFn?

public fun interface Pfnd3dkmtAcquirekeyedmutexFn {
    public operator fun invoke(param0: MutPtr<D3dkmtAcquirekeyedmutex>): Ntstatus
}

public typealias Pfnd3dkmtAcquirekeyedmutex = Pfnd3dkmtAcquirekeyedmutexFn?

public fun interface Pfnd3dkmtAcquirekeyedmutex2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtAcquirekeyedmutex2>): Ntstatus
}

public typealias Pfnd3dkmtAcquirekeyedmutex2 = Pfnd3dkmtAcquirekeyedmutex2Fn?

public fun interface Pfnd3dkmtAdjustfullscreengammaFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtAdjustfullscreengamma>): Ntstatus
}

public typealias Pfnd3dkmtAdjustfullscreengamma = Pfnd3dkmtAdjustfullscreengammaFn?

public fun interface Pfnd3dkmtBudgetchangenotificationcallbackFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtBudgetchangenotification>)
}

public typealias Pfnd3dkmtBudgetchangenotificationcallback = Pfnd3dkmtBudgetchangenotificationcallbackFn?

public fun interface Pfnd3dkmtCancelpresentsFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCancelPresents>): Ntstatus
}

public typealias Pfnd3dkmtCancelpresents = Pfnd3dkmtCancelpresentsFn?

public fun interface Pfnd3dkmtChangesurfacepointerFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtChangesurfacepointer>): Ntstatus
}

public typealias Pfnd3dkmtChangesurfacepointer = Pfnd3dkmtChangesurfacepointerFn?

public fun interface Pfnd3dkmtChangevideomemoryreservationFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtChangevideomemoryreservation>): Ntstatus
}

public typealias Pfnd3dkmtChangevideomemoryreservation = Pfnd3dkmtChangevideomemoryreservationFn?

public fun interface Pfnd3dkmtCheckexclusiveownershipFn {
    public operator fun invoke(): Boolean
}

public typealias Pfnd3dkmtCheckexclusiveownership = Pfnd3dkmtCheckexclusiveownershipFn?

public fun interface Pfnd3dkmtCheckmonitorpowerstateFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCheckmonitorpowerstate>): Ntstatus
}

public typealias Pfnd3dkmtCheckmonitorpowerstate = Pfnd3dkmtCheckmonitorpowerstateFn?

public fun interface Pfnd3dkmtCheckmultiplaneoverlaysupportFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport>): Ntstatus
}

public typealias Pfnd3dkmtCheckmultiplaneoverlaysupport = Pfnd3dkmtCheckmultiplaneoverlaysupportFn?

public fun interface Pfnd3dkmtCheckmultiplaneoverlaysupport2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport2>): Ntstatus
}

public typealias Pfnd3dkmtCheckmultiplaneoverlaysupport2 = Pfnd3dkmtCheckmultiplaneoverlaysupport2Fn?

public fun interface Pfnd3dkmtCheckmultiplaneoverlaysupport3Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport3>): Ntstatus
}

public typealias Pfnd3dkmtCheckmultiplaneoverlaysupport3 = Pfnd3dkmtCheckmultiplaneoverlaysupport3Fn?

public fun interface Pfnd3dkmtCheckocclusionFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCheckocclusion>): Ntstatus
}

public typealias Pfnd3dkmtCheckocclusion = Pfnd3dkmtCheckocclusionFn?

public fun interface Pfnd3dkmtChecksharedresourceaccessFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtChecksharedresourceaccess>): Ntstatus
}

public typealias Pfnd3dkmtChecksharedresourceaccess = Pfnd3dkmtChecksharedresourceaccessFn?

public fun interface Pfnd3dkmtCheckvidpnexclusiveownershipFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCheckvidpnexclusiveownership>): Ntstatus
}

public typealias Pfnd3dkmtCheckvidpnexclusiveownership = Pfnd3dkmtCheckvidpnexclusiveownershipFn?

public fun interface Pfnd3dkmtCloseadapterFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCloseadapter>): Ntstatus
}

public typealias Pfnd3dkmtCloseadapter = Pfnd3dkmtCloseadapterFn?

public fun interface Pfnd3dkmtConfiguresharedresourceFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtConfiguresharedresource>): Ntstatus
}

public typealias Pfnd3dkmtConfiguresharedresource = Pfnd3dkmtConfiguresharedresourceFn?

public fun interface Pfnd3dkmtConnectdoorbellFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtConnectDoorbell>): Ntstatus
}

public typealias Pfnd3dkmtConnectdoorbell = Pfnd3dkmtConnectdoorbellFn?

public fun interface Pfnd3dkmtCreateallocationFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus
}

public typealias Pfnd3dkmtCreateallocation = Pfnd3dkmtCreateallocationFn?

public fun interface Pfnd3dkmtCreateallocation2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus
}

public typealias Pfnd3dkmtCreateallocation2 = Pfnd3dkmtCreateallocation2Fn?

public fun interface Pfnd3dkmtCreatecontextFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatecontext>): Ntstatus
}

public typealias Pfnd3dkmtCreatecontext = Pfnd3dkmtCreatecontextFn?

public fun interface Pfnd3dkmtCreatecontextvirtualFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatecontextvirtual>): Ntstatus
}

public typealias Pfnd3dkmtCreatecontextvirtual = Pfnd3dkmtCreatecontextvirtualFn?

public fun interface Pfnd3dkmtCreatedcfrommemoryFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatedcfrommemory>): Ntstatus
}

public typealias Pfnd3dkmtCreatedcfrommemory = Pfnd3dkmtCreatedcfrommemoryFn?

public fun interface Pfnd3dkmtCreatedeviceFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatedevice>): Ntstatus
}

public typealias Pfnd3dkmtCreatedevice = Pfnd3dkmtCreatedeviceFn?

public fun interface Pfnd3dkmtCreatedoorbellFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCreateDoorbell>): Ntstatus
}

public typealias Pfnd3dkmtCreatedoorbell = Pfnd3dkmtCreatedoorbellFn?

public fun interface Pfnd3dkmtCreatehwqueueFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatehwqueue>): Ntstatus
}

public typealias Pfnd3dkmtCreatehwqueue = Pfnd3dkmtCreatehwqueueFn?

public fun interface Pfnd3dkmtCreatekeyedmutexFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatekeyedmutex>): Ntstatus
}

public typealias Pfnd3dkmtCreatekeyedmutex = Pfnd3dkmtCreatekeyedmutexFn?

public fun interface Pfnd3dkmtCreatekeyedmutex2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatekeyedmutex2>): Ntstatus
}

public typealias Pfnd3dkmtCreatekeyedmutex2 = Pfnd3dkmtCreatekeyedmutex2Fn?

public fun interface Pfnd3dkmtCreatenativefenceFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatenativefence>): Ntstatus
}

public typealias Pfnd3dkmtCreatenativefence = Pfnd3dkmtCreatenativefenceFn?

public fun interface Pfnd3dkmtCreateoutputduplFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtCreateOutputdupl>): Ntstatus
}

public typealias Pfnd3dkmtCreateoutputdupl = Pfnd3dkmtCreateoutputduplFn?

public fun interface Pfnd3dkmtCreateoverlayFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreateoverlay>): Ntstatus
}

public typealias Pfnd3dkmtCreateoverlay = Pfnd3dkmtCreateoverlayFn?

public fun interface Pfnd3dkmtCreatepagingqueueFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatepagingqueue>): Ntstatus
}

public typealias Pfnd3dkmtCreatepagingqueue = Pfnd3dkmtCreatepagingqueueFn?

public fun interface Pfnd3dkmtCreateprotectedsessionFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreateprotectedsession>): Ntstatus
}

public typealias Pfnd3dkmtCreateprotectedsession = Pfnd3dkmtCreateprotectedsessionFn?

public fun interface Pfnd3dkmtCreatesynchronizationobjectFn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatesynchronizationobject>): Ntstatus
}

public typealias Pfnd3dkmtCreatesynchronizationobject = Pfnd3dkmtCreatesynchronizationobjectFn?

public fun interface Pfnd3dkmtCreatesynchronizationobject2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtCreatesynchronizationobject2>): Ntstatus
}

public typealias Pfnd3dkmtCreatesynchronizationobject2 = Pfnd3dkmtCreatesynchronizationobject2Fn?

public fun interface Pfnd3dkmtDestroyallocationFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroyallocation>): Ntstatus
}

public typealias Pfnd3dkmtDestroyallocation = Pfnd3dkmtDestroyallocationFn?

public fun interface Pfnd3dkmtDestroyallocation2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroyallocation2>): Ntstatus
}

public typealias Pfnd3dkmtDestroyallocation2 = Pfnd3dkmtDestroyallocation2Fn?

public fun interface Pfnd3dkmtDestroycontextFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroycontext>): Ntstatus
}

public typealias Pfnd3dkmtDestroycontext = Pfnd3dkmtDestroycontextFn?

public fun interface Pfnd3dkmtDestroydcfrommemoryFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroydcfrommemory>): Ntstatus
}

public typealias Pfnd3dkmtDestroydcfrommemory = Pfnd3dkmtDestroydcfrommemoryFn?

public fun interface Pfnd3dkmtDestroydeviceFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroydevice>): Ntstatus
}

public typealias Pfnd3dkmtDestroydevice = Pfnd3dkmtDestroydeviceFn?

public fun interface Pfnd3dkmtDestroydoorbellFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroyDoorbell>): Ntstatus
}

public typealias Pfnd3dkmtDestroydoorbell = Pfnd3dkmtDestroydoorbellFn?

public fun interface Pfnd3dkmtDestroyhwqueueFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroyhwqueue>): Ntstatus
}

public typealias Pfnd3dkmtDestroyhwqueue = Pfnd3dkmtDestroyhwqueueFn?

public fun interface Pfnd3dkmtDestroykeyedmutexFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroykeyedmutex>): Ntstatus
}

public typealias Pfnd3dkmtDestroykeyedmutex = Pfnd3dkmtDestroykeyedmutexFn?

public fun interface Pfnd3dkmtDestroyoutputduplFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroyOutputdupl>): Ntstatus
}

public typealias Pfnd3dkmtDestroyoutputdupl = Pfnd3dkmtDestroyoutputduplFn?

public fun interface Pfnd3dkmtDestroyoverlayFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroyoverlay>): Ntstatus
}

public typealias Pfnd3dkmtDestroyoverlay = Pfnd3dkmtDestroyoverlayFn?

public fun interface Pfnd3dkmtDestroypagingqueueFn {
    public operator fun invoke(param0: MutPtr<D3dddiDestroypagingqueue>): Ntstatus
}

public typealias Pfnd3dkmtDestroypagingqueue = Pfnd3dkmtDestroypagingqueueFn?

public fun interface Pfnd3dkmtDestroyprotectedsessionFn {
    public operator fun invoke(param0: MutPtr<D3dkmtDestroyprotectedsession>): Ntstatus
}

public typealias Pfnd3dkmtDestroyprotectedsession = Pfnd3dkmtDestroyprotectedsessionFn?

public fun interface Pfnd3dkmtDestroysynchronizationobjectFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtDestroysynchronizationobject>): Ntstatus
}

public typealias Pfnd3dkmtDestroysynchronizationobject = Pfnd3dkmtDestroysynchronizationobjectFn?

public fun interface Pfnd3dkmtEnumadaptersFn {
    public operator fun invoke(param0: MutPtr<D3dkmtEnumadapters>): Ntstatus
}

public typealias Pfnd3dkmtEnumadapters = Pfnd3dkmtEnumadaptersFn?

public fun interface Pfnd3dkmtEnumadapters2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtEnumadapters2>): Ntstatus
}

public typealias Pfnd3dkmtEnumadapters2 = Pfnd3dkmtEnumadapters2Fn?

public fun interface Pfnd3dkmtEnumadapters3Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtEnumadapters3>): Ntstatus
}

public typealias Pfnd3dkmtEnumadapters3 = Pfnd3dkmtEnumadapters3Fn?

public fun interface Pfnd3dkmtEscapeFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtEscape>): Ntstatus
}

public typealias Pfnd3dkmtEscape = Pfnd3dkmtEscapeFn?

public fun interface Pfnd3dkmtEvictFn {
    public operator fun invoke(param0: MutPtr<D3dkmtEvict>): Ntstatus
}

public typealias Pfnd3dkmtEvict = Pfnd3dkmtEvictFn?

public fun interface Pfnd3dkmtFlipoverlayFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtFlipoverlay>): Ntstatus
}

public typealias Pfnd3dkmtFlipoverlay = Pfnd3dkmtFlipoverlayFn?

public fun interface Pfnd3dkmtFlushheaptransitionsFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtFlushheaptransitions>): Ntstatus
}

public typealias Pfnd3dkmtFlushheaptransitions = Pfnd3dkmtFlushheaptransitionsFn?

public fun interface Pfnd3dkmtFreegpuvirtualaddressFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtFreegpuvirtualaddress>): Ntstatus
}

public typealias Pfnd3dkmtFreegpuvirtualaddress = Pfnd3dkmtFreegpuvirtualaddressFn?

public fun interface Pfnd3dkmtGetallocationpriorityFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtGetallocationpriority>): Ntstatus
}

public typealias Pfnd3dkmtGetallocationpriority = Pfnd3dkmtGetallocationpriorityFn?

public fun interface Pfnd3dkmtGetcontextinprocessschedulingpriorityFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetcontextinprocessschedulingpriority>): Ntstatus
}

public typealias Pfnd3dkmtGetcontextinprocessschedulingpriority = Pfnd3dkmtGetcontextinprocessschedulingpriorityFn?

public fun interface Pfnd3dkmtGetcontextschedulingpriorityFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetcontextschedulingpriority>): Ntstatus
}

public typealias Pfnd3dkmtGetcontextschedulingpriority = Pfnd3dkmtGetcontextschedulingpriorityFn?

public fun interface Pfnd3dkmtGetdevicestateFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetdevicestate>): Ntstatus
}

public typealias Pfnd3dkmtGetdevicestate = Pfnd3dkmtGetdevicestateFn?

public fun interface Pfnd3dkmtGetdisplaymodelistFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetdisplaymodelist>): Ntstatus
}

public typealias Pfnd3dkmtGetdisplaymodelist = Pfnd3dkmtGetdisplaymodelistFn?

public fun interface Pfnd3dkmtGetdwmverticalblankeventFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtGetverticalblankevent>): Ntstatus
}

public typealias Pfnd3dkmtGetdwmverticalblankevent = Pfnd3dkmtGetdwmverticalblankeventFn?

public fun interface Pfnd3dkmtGetmultiplaneoverlaycapsFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetMultiplaneOverlayCaps>): Ntstatus
}

public typealias Pfnd3dkmtGetmultiplaneoverlaycaps = Pfnd3dkmtGetmultiplaneoverlaycapsFn?

public fun interface Pfnd3dkmtGetmultisamplemethodlistFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetmultisamplemethodlist>): Ntstatus
}

public typealias Pfnd3dkmtGetmultisamplemethodlist = Pfnd3dkmtGetmultisamplemethodlistFn?

public fun interface Pfnd3dkmtGetoverlaystateFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetoverlaystate>): Ntstatus
}

public typealias Pfnd3dkmtGetoverlaystate = Pfnd3dkmtGetoverlaystateFn?

public fun interface Pfnd3dkmtGetpostcompositioncapsFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetPostCompositionCaps>): Ntstatus
}

public typealias Pfnd3dkmtGetpostcompositioncaps = Pfnd3dkmtGetpostcompositioncapsFn?

public fun interface Pfnd3dkmtGetpresenthistoryFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetpresenthistory>): Ntstatus
}

public typealias Pfnd3dkmtGetpresenthistory = Pfnd3dkmtGetpresenthistoryFn?

public fun interface Pfnd3dkmtGetprocessdeviceremovalsupportFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetprocessdeviceremovalsupport>): Ntstatus
}

public typealias Pfnd3dkmtGetprocessdeviceremovalsupport = Pfnd3dkmtGetprocessdeviceremovalsupportFn?

public fun interface Pfnd3dkmtGetprocessschedulingpriorityclassFn {
    public operator fun invoke(param0: Handle, param1: MutPtr<D3dkmtSchedulingpriorityclass>): Ntstatus
}

public typealias Pfnd3dkmtGetprocessschedulingpriorityclass = Pfnd3dkmtGetprocessschedulingpriorityclassFn?

public fun interface Pfnd3dkmtGetresourcepresentprivatedriverdataFn {
    public operator fun invoke(param0: MutPtr<D3dddiGetresourcepresentprivatedriverdata>): Ntstatus
}

public typealias Pfnd3dkmtGetresourcepresentprivatedriverdata = Pfnd3dkmtGetresourcepresentprivatedriverdataFn?

public fun interface Pfnd3dkmtGetruntimedataFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetruntimedata>): Ntstatus
}

public typealias Pfnd3dkmtGetruntimedata = Pfnd3dkmtGetruntimedataFn?

public fun interface Pfnd3dkmtGetscanlineFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetscanline>): Ntstatus
}

public typealias Pfnd3dkmtGetscanline = Pfnd3dkmtGetscanlineFn?

public fun interface Pfnd3dkmtGetsharedprimaryhandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetsharedprimaryhandle>): Ntstatus
}

public typealias Pfnd3dkmtGetsharedprimaryhandle = Pfnd3dkmtGetsharedprimaryhandleFn?

public fun interface Pfnd3dkmtGetsharedresourceadapterluidFn {
    public operator fun invoke(param0: MutPtr<D3dkmtGetsharedresourceadapterluid>): Ntstatus
}

public typealias Pfnd3dkmtGetsharedresourceadapterluid = Pfnd3dkmtGetsharedresourceadapterluidFn?

public fun interface Pfnd3dkmtInvalidateactivevidpnFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtInvalidateactivevidpn>): Ntstatus
}

public typealias Pfnd3dkmtInvalidateactivevidpn = Pfnd3dkmtInvalidateactivevidpnFn?

public fun interface Pfnd3dkmtInvalidatecacheFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtInvalidatecache>): Ntstatus
}

public typealias Pfnd3dkmtInvalidatecache = Pfnd3dkmtInvalidatecacheFn?

public fun interface Pfnd3dkmtLockFn {
    public operator fun invoke(param0: MutPtr<D3dkmtLock>): Ntstatus
}

public typealias Pfnd3dkmtLock = Pfnd3dkmtLockFn?

public fun interface Pfnd3dkmtLock2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtLock2>): Ntstatus
}

public typealias Pfnd3dkmtLock2 = Pfnd3dkmtLock2Fn?

public fun interface Pfnd3dkmtMakeresidentFn {
    public operator fun invoke(param0: MutPtr<D3dddiMakeresident>): Ntstatus
}

public typealias Pfnd3dkmtMakeresident = Pfnd3dkmtMakeresidentFn?

public fun interface Pfnd3dkmtMapgpuvirtualaddressFn {
    public operator fun invoke(param0: MutPtr<D3dddiMapgpuvirtualaddress>): Ntstatus
}

public typealias Pfnd3dkmtMapgpuvirtualaddress = Pfnd3dkmtMapgpuvirtualaddressFn?

public fun interface Pfnd3dkmtMarkdeviceaserrorFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtMarkdeviceaserror>): Ntstatus
}

public typealias Pfnd3dkmtMarkdeviceaserror = Pfnd3dkmtMarkdeviceaserrorFn?

public fun interface Pfnd3dkmtNotifyworksubmissionFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtNotifyWorkSubmission>): Ntstatus
}

public typealias Pfnd3dkmtNotifyworksubmission = Pfnd3dkmtNotifyworksubmissionFn?

public fun interface Pfnd3dkmtOfferallocationsFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtOfferallocations>): Ntstatus
}

public typealias Pfnd3dkmtOfferallocations = Pfnd3dkmtOfferallocationsFn?

public fun interface Pfnd3dkmtOpenadapterfromdevicenameFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenadapterfromdevicename>): Ntstatus
}

public typealias Pfnd3dkmtOpenadapterfromdevicename = Pfnd3dkmtOpenadapterfromdevicenameFn?

public fun interface Pfnd3dkmtOpenadapterfromgdidisplaynameFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenadapterfromgdidisplayname>): Ntstatus
}

public typealias Pfnd3dkmtOpenadapterfromgdidisplayname = Pfnd3dkmtOpenadapterfromgdidisplaynameFn?

public fun interface Pfnd3dkmtOpenadapterfromhdcFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenadapterfromhdc>): Ntstatus
}

public typealias Pfnd3dkmtOpenadapterfromhdc = Pfnd3dkmtOpenadapterfromhdcFn?

public fun interface Pfnd3dkmtOpenadapterfromluidFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenadapterfromluid>): Ntstatus
}

public typealias Pfnd3dkmtOpenadapterfromluid = Pfnd3dkmtOpenadapterfromluidFn?

public fun interface Pfnd3dkmtOpenkeyedmutexFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenkeyedmutex>): Ntstatus
}

public typealias Pfnd3dkmtOpenkeyedmutex = Pfnd3dkmtOpenkeyedmutexFn?

public fun interface Pfnd3dkmtOpenkeyedmutex2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenkeyedmutex2>): Ntstatus
}

public typealias Pfnd3dkmtOpenkeyedmutex2 = Pfnd3dkmtOpenkeyedmutex2Fn?

public fun interface Pfnd3dkmtOpenkeyedmutexfromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenkeyedmutexfromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtOpenkeyedmutexfromnthandle = Pfnd3dkmtOpenkeyedmutexfromnthandleFn?

public fun interface Pfnd3dkmtOpennativefencefromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpennativefencefromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtOpennativefencefromnthandle = Pfnd3dkmtOpennativefencefromnthandleFn?

public fun interface Pfnd3dkmtOpennthandlefromnameFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpennthandlefromname>): Ntstatus
}

public typealias Pfnd3dkmtOpennthandlefromname = Pfnd3dkmtOpennthandlefromnameFn?

public fun interface Pfnd3dkmtOpenprotectedsessionfromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenprotectedsessionfromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtOpenprotectedsessionfromnthandle = Pfnd3dkmtOpenprotectedsessionfromnthandleFn?

public fun interface Pfnd3dkmtOpenresourceFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenresource>): Ntstatus
}

public typealias Pfnd3dkmtOpenresource = Pfnd3dkmtOpenresourceFn?

public fun interface Pfnd3dkmtOpenresource2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenresource>): Ntstatus
}

public typealias Pfnd3dkmtOpenresource2 = Pfnd3dkmtOpenresource2Fn?

public fun interface Pfnd3dkmtOpenresourcefromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpenresourcefromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtOpenresourcefromnthandle = Pfnd3dkmtOpenresourcefromnthandleFn?

public fun interface Pfnd3dkmtOpensynchronizationobjectFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpensynchronizationobject>): Ntstatus
}

public typealias Pfnd3dkmtOpensynchronizationobject = Pfnd3dkmtOpensynchronizationobjectFn?

public fun interface Pfnd3dkmtOpensyncobjectfromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtOpensyncobjectfromnthandle = Pfnd3dkmtOpensyncobjectfromnthandleFn?

public fun interface Pfnd3dkmtOpensyncobjectfromnthandle2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle2>): Ntstatus
}

public typealias Pfnd3dkmtOpensyncobjectfromnthandle2 = Pfnd3dkmtOpensyncobjectfromnthandle2Fn?

public fun interface Pfnd3dkmtOpensyncobjectnthandlefromnameFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOpensyncobjectnthandlefromname>): Ntstatus
}

public typealias Pfnd3dkmtOpensyncobjectnthandlefromname = Pfnd3dkmtOpensyncobjectnthandlefromnameFn?

public fun interface Pfnd3dkmtOutputduplgetframeinfoFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOutputduplGetFrameinfo>): Ntstatus
}

public typealias Pfnd3dkmtOutputduplgetframeinfo = Pfnd3dkmtOutputduplgetframeinfoFn?

public fun interface Pfnd3dkmtOutputduplgetmetadataFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOutputduplMetadata>): Ntstatus
}

public typealias Pfnd3dkmtOutputduplgetmetadata = Pfnd3dkmtOutputduplgetmetadataFn?

public fun interface Pfnd3dkmtOutputduplgetpointershapedataFn {
    public operator fun invoke(param0: MutPtr<D3dkmtOutputduplGetPointerShapeData>): Ntstatus
}

public typealias Pfnd3dkmtOutputduplgetpointershapedata = Pfnd3dkmtOutputduplgetpointershapedataFn?

public fun interface Pfnd3dkmtOutputduplpresentFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtOutputduplpresent>): Ntstatus
}

public typealias Pfnd3dkmtOutputduplpresent = Pfnd3dkmtOutputduplpresentFn?

public fun interface Pfnd3dkmtOutputduplpresenttohwqueueFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtOutputduplpresenttohwqueue>): Ntstatus
}

public typealias Pfnd3dkmtOutputduplpresenttohwqueue = Pfnd3dkmtOutputduplpresenttohwqueueFn?

public fun interface Pfnd3dkmtOutputduplreleaseframeFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtOutputduplReleaseFrame>): Ntstatus
}

public typealias Pfnd3dkmtOutputduplreleaseframe = Pfnd3dkmtOutputduplreleaseframeFn?

public fun interface Pfnd3dkmtPindirectflipresourcesFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtPindirectflipresources>): Ntstatus
}

public typealias Pfnd3dkmtPindirectflipresources = Pfnd3dkmtPindirectflipresourcesFn?

public fun interface Pfnd3dkmtPolldisplaychildrenFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtPolldisplaychildren>): Ntstatus
}

public typealias Pfnd3dkmtPolldisplaychildren = Pfnd3dkmtPolldisplaychildrenFn?

public fun interface Pfnd3dkmtPresentFn {
    public operator fun invoke(param0: MutPtr<D3dkmtPresent>): Ntstatus
}

public typealias Pfnd3dkmtPresent = Pfnd3dkmtPresentFn?

public fun interface Pfnd3dkmtPresentmultiplaneoverlayFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay>): Ntstatus
}

public typealias Pfnd3dkmtPresentmultiplaneoverlay = Pfnd3dkmtPresentmultiplaneoverlayFn?

public fun interface Pfnd3dkmtPresentmultiplaneoverlay2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay2>): Ntstatus
}

public typealias Pfnd3dkmtPresentmultiplaneoverlay2 = Pfnd3dkmtPresentmultiplaneoverlay2Fn?

public fun interface Pfnd3dkmtPresentmultiplaneoverlay3Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay3>): Ntstatus
}

public typealias Pfnd3dkmtPresentmultiplaneoverlay3 = Pfnd3dkmtPresentmultiplaneoverlay3Fn?

public fun interface Pfnd3dkmtQueryadapterinfoFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryadapterinfo>): Ntstatus
}

public typealias Pfnd3dkmtQueryadapterinfo = Pfnd3dkmtQueryadapterinfoFn?

public fun interface Pfnd3dkmtQueryallocationresidencyFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtQueryallocationresidency>): Ntstatus
}

public typealias Pfnd3dkmtQueryallocationresidency = Pfnd3dkmtQueryallocationresidencyFn?

public fun interface Pfnd3dkmtQueryclockcalibrationFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryclockcalibration>): Ntstatus
}

public typealias Pfnd3dkmtQueryclockcalibration = Pfnd3dkmtQueryclockcalibrationFn?

public fun interface Pfnd3dkmtQueryfseblockFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryfseblock>): Ntstatus
}

public typealias Pfnd3dkmtQueryfseblock = Pfnd3dkmtQueryfseblockFn?

public fun interface Pfnd3dkmtQueryhybridlistvalueFn {
    public operator fun invoke(param0: MutPtr<D3dkmtHybridList>): Ntstatus
}

public typealias Pfnd3dkmtQueryhybridlistvalue = Pfnd3dkmtQueryhybridlistvalueFn?

public fun interface Pfnd3dkmtQueryprocessofferinfoFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryprocessofferinfo>): Ntstatus
}

public typealias Pfnd3dkmtQueryprocessofferinfo = Pfnd3dkmtQueryprocessofferinfoFn?

public fun interface Pfnd3dkmtQueryprotectedsessioninfofromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryprotectedsessioninfofromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtQueryprotectedsessioninfofromnthandle = Pfnd3dkmtQueryprotectedsessioninfofromnthandleFn?

public fun interface Pfnd3dkmtQueryprotectedsessionstatusFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryprotectedsessionstatus>): Ntstatus
}

public typealias Pfnd3dkmtQueryprotectedsessionstatus = Pfnd3dkmtQueryprotectedsessionstatusFn?

public fun interface Pfnd3dkmtQueryremotevidpnsourcefromgdidisplaynameFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryremotevidpnsourcefromgdidisplayname>): Ntstatus
}

public typealias Pfnd3dkmtQueryremotevidpnsourcefromgdidisplayname = Pfnd3dkmtQueryremotevidpnsourcefromgdidisplaynameFn?

public fun interface Pfnd3dkmtQueryresourceinfoFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryresourceinfo>): Ntstatus
}

public typealias Pfnd3dkmtQueryresourceinfo = Pfnd3dkmtQueryresourceinfoFn?

public fun interface Pfnd3dkmtQueryresourceinfofromnthandleFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryresourceinfofromnthandle>): Ntstatus
}

public typealias Pfnd3dkmtQueryresourceinfofromnthandle = Pfnd3dkmtQueryresourceinfofromnthandleFn?

public fun interface Pfnd3dkmtQuerystatisticsFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtQuerystatistics>): Ntstatus
}

public typealias Pfnd3dkmtQuerystatistics = Pfnd3dkmtQuerystatisticsFn?

public fun interface Pfnd3dkmtQueryvideomemoryinfoFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryvideomemoryinfo>): Ntstatus
}

public typealias Pfnd3dkmtQueryvideomemoryinfo = Pfnd3dkmtQueryvideomemoryinfoFn?

public fun interface Pfnd3dkmtQueryvidpnexclusiveownershipFn {
    public operator fun invoke(param0: MutPtr<D3dkmtQueryvidpnexclusiveownership>): Ntstatus
}

public typealias Pfnd3dkmtQueryvidpnexclusiveownership = Pfnd3dkmtQueryvidpnexclusiveownershipFn?

public fun interface Pfnd3dkmtReclaimallocationsFn {
    public operator fun invoke(param0: MutPtr<D3dkmtReclaimallocations>): Ntstatus
}

public typealias Pfnd3dkmtReclaimallocations = Pfnd3dkmtReclaimallocationsFn?

public fun interface Pfnd3dkmtReclaimallocations2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtReclaimallocations2>): Ntstatus
}

public typealias Pfnd3dkmtReclaimallocations2 = Pfnd3dkmtReclaimallocations2Fn?

public fun interface Pfnd3dkmtRegisterbudgetchangenotificationFn {
    public operator fun invoke(param0: MutPtr<D3dkmtRegisterbudgetchangenotification>): Ntstatus
}

public typealias Pfnd3dkmtRegisterbudgetchangenotification = Pfnd3dkmtRegisterbudgetchangenotificationFn?

public fun interface Pfnd3dkmtRegistertrimnotificationFn {
    public operator fun invoke(param0: MutPtr<D3dkmtRegistertrimnotification>): Ntstatus
}

public typealias Pfnd3dkmtRegistertrimnotification = Pfnd3dkmtRegistertrimnotificationFn?

public fun interface Pfnd3dkmtReleasekeyedmutexFn {
    public operator fun invoke(param0: MutPtr<D3dkmtReleasekeyedmutex>): Ntstatus
}

public typealias Pfnd3dkmtReleasekeyedmutex = Pfnd3dkmtReleasekeyedmutexFn?

public fun interface Pfnd3dkmtReleasekeyedmutex2Fn {
    public operator fun invoke(param0: MutPtr<D3dkmtReleasekeyedmutex2>): Ntstatus
}

public typealias Pfnd3dkmtReleasekeyedmutex2 = Pfnd3dkmtReleasekeyedmutex2Fn?

public fun interface Pfnd3dkmtReleaseprocessvidpnsourceownersFn {
    public operator fun invoke(param0: Handle): Ntstatus
}

public typealias Pfnd3dkmtReleaseprocessvidpnsourceowners = Pfnd3dkmtReleaseprocessvidpnsourceownersFn?

public fun interface Pfnd3dkmtRenderFn {
    public operator fun invoke(param0: MutPtr<D3dkmtRender>): Ntstatus
}

public typealias Pfnd3dkmtRender = Pfnd3dkmtRenderFn?

public fun interface Pfnd3dkmtReservegpuvirtualaddressFn {
    public operator fun invoke(param0: MutPtr<D3dddiReservegpuvirtualaddress>): Ntstatus
}

public typealias Pfnd3dkmtReservegpuvirtualaddress = Pfnd3dkmtReservegpuvirtualaddressFn?

public fun interface Pfnd3dkmtSetallocationpriorityFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetallocationpriority>): Ntstatus
}

public typealias Pfnd3dkmtSetallocationpriority = Pfnd3dkmtSetallocationpriorityFn?

public fun interface Pfnd3dkmtSetcontextinprocessschedulingpriorityFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetcontextinprocessschedulingpriority>): Ntstatus
}

public typealias Pfnd3dkmtSetcontextinprocessschedulingpriority = Pfnd3dkmtSetcontextinprocessschedulingpriorityFn?

public fun interface Pfnd3dkmtSetcontextschedulingpriorityFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetcontextschedulingpriority>): Ntstatus
}

public typealias Pfnd3dkmtSetcontextschedulingpriority = Pfnd3dkmtSetcontextschedulingpriorityFn?

public fun interface Pfnd3dkmtSetdisplaymodeFn {
    public operator fun invoke(param0: MutPtr<D3dkmtSetdisplaymode>): Ntstatus
}

public typealias Pfnd3dkmtSetdisplaymode = Pfnd3dkmtSetdisplaymodeFn?

public fun interface Pfnd3dkmtSetdisplayprivatedriverformatFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetdisplayprivatedriverformat>): Ntstatus
}

public typealias Pfnd3dkmtSetdisplayprivatedriverformat = Pfnd3dkmtSetdisplayprivatedriverformatFn?

public fun interface Pfnd3dkmtSetfseblockFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetfseblock>): Ntstatus
}

public typealias Pfnd3dkmtSetfseblock = Pfnd3dkmtSetfseblockFn?

public fun interface Pfnd3dkmtSetgammarampFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetgammaramp>): Ntstatus
}

public typealias Pfnd3dkmtSetgammaramp = Pfnd3dkmtSetgammarampFn?

public fun interface Pfnd3dkmtSethwprotectionteardownrecoveryFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSethwprotectionteardownrecovery>): Ntstatus
}

public typealias Pfnd3dkmtSethwprotectionteardownrecovery = Pfnd3dkmtSethwprotectionteardownrecoveryFn?

public fun interface Pfnd3dkmtSethybridlistvvalueFn {
    public operator fun invoke(param0: MutPtr<D3dkmtHybridList>): Ntstatus
}

public typealias Pfnd3dkmtSethybridlistvvalue = Pfnd3dkmtSethybridlistvvalueFn?

public fun interface Pfnd3dkmtSetprocessschedulingpriorityclassFn {
    public operator fun invoke(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus
}

public typealias Pfnd3dkmtSetprocessschedulingpriorityclass = Pfnd3dkmtSetprocessschedulingpriorityclassFn?

public fun interface Pfnd3dkmtSetqueuedlimitFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetqueuedlimit>): Ntstatus
}

public typealias Pfnd3dkmtSetqueuedlimit = Pfnd3dkmtSetqueuedlimitFn?

public fun interface Pfnd3dkmtSetstablepowerstateFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetstablepowerstate>): Ntstatus
}

public typealias Pfnd3dkmtSetstablepowerstate = Pfnd3dkmtSetstablepowerstateFn?

public fun interface Pfnd3dkmtSetstereoenabledFn {
    public operator fun invoke(param0: Bool): Ntstatus
}

public typealias Pfnd3dkmtSetstereoenabled = Pfnd3dkmtSetstereoenabledFn?

public fun interface Pfnd3dkmtSetsyncrefreshcountwaittargetFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetsyncrefreshcountwaittarget>): Ntstatus
}

public typealias Pfnd3dkmtSetsyncrefreshcountwaittarget = Pfnd3dkmtSetsyncrefreshcountwaittargetFn?

public fun interface Pfnd3dkmtSetvidpnsourcehwprotectionFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetvidpnsourcehwprotection>): Ntstatus
}

public typealias Pfnd3dkmtSetvidpnsourcehwprotection = Pfnd3dkmtSetvidpnsourcehwprotectionFn?

public fun interface Pfnd3dkmtSetvidpnsourceownerFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetvidpnsourceowner>): Ntstatus
}

public typealias Pfnd3dkmtSetvidpnsourceowner = Pfnd3dkmtSetvidpnsourceownerFn?

public fun interface Pfnd3dkmtSetvidpnsourceowner1Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetvidpnsourceowner1>): Ntstatus
}

public typealias Pfnd3dkmtSetvidpnsourceowner1 = Pfnd3dkmtSetvidpnsourceowner1Fn?

public fun interface Pfnd3dkmtSetvidpnsourceowner2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSetvidpnsourceowner2>): Ntstatus
}

public typealias Pfnd3dkmtSetvidpnsourceowner2 = Pfnd3dkmtSetvidpnsourceowner2Fn?

public fun interface Pfnd3dkmtSharedprimarylocknotificationFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSharedprimarylocknotification>): Ntstatus
}

public typealias Pfnd3dkmtSharedprimarylocknotification = Pfnd3dkmtSharedprimarylocknotificationFn?

public fun interface Pfnd3dkmtSharedprimaryunlocknotificationFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSharedprimaryunlocknotification>): Ntstatus
}

public typealias Pfnd3dkmtSharedprimaryunlocknotification = Pfnd3dkmtSharedprimaryunlocknotificationFn?

public fun interface Pfnd3dkmtShareobjectsFn {
    public operator fun invoke(cobjects: UInt, hobjects: ConstPtr<UInt>, pobjectattributes: ConstPtr<ObjectAttributes>, dwdesiredaccess: UInt, phsharednthandle: MutPtr<Handle>): Ntstatus
}

public typealias Pfnd3dkmtShareobjects = Pfnd3dkmtShareobjectsFn?

public fun interface Pfnd3dkmtSignalsynchronizationobjectFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSignalsynchronizationobject>): Ntstatus
}

public typealias Pfnd3dkmtSignalsynchronizationobject = Pfnd3dkmtSignalsynchronizationobjectFn?

public fun interface Pfnd3dkmtSignalsynchronizationobject2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSignalsynchronizationobject2>): Ntstatus
}

public typealias Pfnd3dkmtSignalsynchronizationobject2 = Pfnd3dkmtSignalsynchronizationobject2Fn?

public fun interface Pfnd3dkmtSignalsynchronizationobjectfromcpuFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromcpu>): Ntstatus
}

public typealias Pfnd3dkmtSignalsynchronizationobjectfromcpu = Pfnd3dkmtSignalsynchronizationobjectfromcpuFn?

public fun interface Pfnd3dkmtSignalsynchronizationobjectfromgpuFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu>): Ntstatus
}

public typealias Pfnd3dkmtSignalsynchronizationobjectfromgpu = Pfnd3dkmtSignalsynchronizationobjectfromgpuFn?

public fun interface Pfnd3dkmtSignalsynchronizationobjectfromgpu2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu2>): Ntstatus
}

public typealias Pfnd3dkmtSignalsynchronizationobjectfromgpu2 = Pfnd3dkmtSignalsynchronizationobjectfromgpu2Fn?

public fun interface Pfnd3dkmtSubmitcommandFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSubmitcommand>): Ntstatus
}

public typealias Pfnd3dkmtSubmitcommand = Pfnd3dkmtSubmitcommandFn?

public fun interface Pfnd3dkmtSubmitcommandtohwqueueFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSubmitcommandtohwqueue>): Ntstatus
}

public typealias Pfnd3dkmtSubmitcommandtohwqueue = Pfnd3dkmtSubmitcommandtohwqueueFn?

public fun interface Pfnd3dkmtSubmitpresentblttohwqueueFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSubmitpresentblttohwqueue>): Ntstatus
}

public typealias Pfnd3dkmtSubmitpresentblttohwqueue = Pfnd3dkmtSubmitpresentblttohwqueueFn?

public fun interface Pfnd3dkmtSubmitpresenttohwqueueFn {
    public operator fun invoke(param0: MutPtr<D3dkmtSubmitpresenttohwqueue>): Ntstatus
}

public typealias Pfnd3dkmtSubmitpresenttohwqueue = Pfnd3dkmtSubmitpresenttohwqueueFn?

public fun interface Pfnd3dkmtSubmitsignalsyncobjectstohwqueueFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSubmitsignalsyncobjectstohwqueue>): Ntstatus
}

public typealias Pfnd3dkmtSubmitsignalsyncobjectstohwqueue = Pfnd3dkmtSubmitsignalsyncobjectstohwqueueFn?

public fun interface Pfnd3dkmtSubmitwaitforsyncobjectstohwqueueFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtSubmitwaitforsyncobjectstohwqueue>): Ntstatus
}

public typealias Pfnd3dkmtSubmitwaitforsyncobjectstohwqueue = Pfnd3dkmtSubmitwaitforsyncobjectstohwqueueFn?

public fun interface Pfnd3dkmtTrimnotificationcallbackFn {
    public operator fun invoke(param0: MutPtr<D3dkmtTrimnotification>)
}

public typealias Pfnd3dkmtTrimnotificationcallback = Pfnd3dkmtTrimnotificationcallbackFn?

public fun interface Pfnd3dkmtTrimprocesscommitmentFn {
    public operator fun invoke(param0: MutPtr<D3dkmtTrimprocesscommitment>): Ntstatus
}

public typealias Pfnd3dkmtTrimprocesscommitment = Pfnd3dkmtTrimprocesscommitmentFn?

public fun interface Pfnd3dkmtUnlockFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtUnlock>): Ntstatus
}

public typealias Pfnd3dkmtUnlock = Pfnd3dkmtUnlockFn?

public fun interface Pfnd3dkmtUnlock2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtUnlock2>): Ntstatus
}

public typealias Pfnd3dkmtUnlock2 = Pfnd3dkmtUnlock2Fn?

public fun interface Pfnd3dkmtUnpindirectflipresourcesFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtUnpindirectflipresources>): Ntstatus
}

public typealias Pfnd3dkmtUnpindirectflipresources = Pfnd3dkmtUnpindirectflipresourcesFn?

public fun interface Pfnd3dkmtUnregisterbudgetchangenotificationFn {
    public operator fun invoke(param0: MutPtr<D3dkmtUnregisterbudgetchangenotification>): Ntstatus
}

public typealias Pfnd3dkmtUnregisterbudgetchangenotification = Pfnd3dkmtUnregisterbudgetchangenotificationFn?

public fun interface Pfnd3dkmtUnregistertrimnotificationFn {
    public operator fun invoke(param0: MutPtr<D3dkmtUnregistertrimnotification>): Ntstatus
}

public typealias Pfnd3dkmtUnregistertrimnotification = Pfnd3dkmtUnregistertrimnotificationFn?

public fun interface Pfnd3dkmtUpdateallocationpropertyFn {
    public operator fun invoke(param0: MutPtr<D3dddiUpdateallocproperty>): Ntstatus
}

public typealias Pfnd3dkmtUpdateallocationproperty = Pfnd3dkmtUpdateallocationpropertyFn?

public fun interface Pfnd3dkmtUpdategpuvirtualaddressFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtUpdategpuvirtualaddress>): Ntstatus
}

public typealias Pfnd3dkmtUpdategpuvirtualaddress = Pfnd3dkmtUpdategpuvirtualaddressFn?

public fun interface Pfnd3dkmtUpdateoverlayFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtUpdateoverlay>): Ntstatus
}

public typealias Pfnd3dkmtUpdateoverlay = Pfnd3dkmtUpdateoverlayFn?

public fun interface Pfnd3dkmtWaitforidleFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforidle>): Ntstatus
}

public typealias Pfnd3dkmtWaitforidle = Pfnd3dkmtWaitforidleFn?

public fun interface Pfnd3dkmtWaitforsynchronizationobjectFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforsynchronizationobject>): Ntstatus
}

public typealias Pfnd3dkmtWaitforsynchronizationobject = Pfnd3dkmtWaitforsynchronizationobjectFn?

public fun interface Pfnd3dkmtWaitforsynchronizationobject2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforsynchronizationobject2>): Ntstatus
}

public typealias Pfnd3dkmtWaitforsynchronizationobject2 = Pfnd3dkmtWaitforsynchronizationobject2Fn?

public fun interface Pfnd3dkmtWaitforsynchronizationobjectfromcpuFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromcpu>): Ntstatus
}

public typealias Pfnd3dkmtWaitforsynchronizationobjectfromcpu = Pfnd3dkmtWaitforsynchronizationobjectfromcpuFn?

public fun interface Pfnd3dkmtWaitforsynchronizationobjectfromgpuFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromgpu>): Ntstatus
}

public typealias Pfnd3dkmtWaitforsynchronizationobjectfromgpu = Pfnd3dkmtWaitforsynchronizationobjectfromgpuFn?

public fun interface Pfnd3dkmtWaitforverticalblankeventFn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforverticalblankevent>): Ntstatus
}

public typealias Pfnd3dkmtWaitforverticalblankevent = Pfnd3dkmtWaitforverticalblankeventFn?

public fun interface Pfnd3dkmtWaitforverticalblankevent2Fn {
    public operator fun invoke(param0: ConstPtr<D3dkmtWaitforverticalblankevent2>): Ntstatus
}

public typealias Pfnd3dkmtWaitforverticalblankevent2 = Pfnd3dkmtWaitforverticalblankevent2Fn?

public fun interface Pfnd3dntparseunknowncommandFn {
    public operator fun invoke(lpvcommands: MutPtr<CVoid>, lplpvreturnedcommand: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias Pfnd3dntparseunknowncommand = Pfnd3dntparseunknowncommandFn?

public fun interface Pfnd3dparseunknowncommandFn {
    public operator fun invoke(lpvcommands: MutPtr<CVoid>, lplpvreturnedcommand: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias Pfnd3dparseunknowncommand = Pfnd3dparseunknowncommandFn?
