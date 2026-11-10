@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Paletteentry

public data class D3dkmtAdapterVerifierOption(
    public var type: D3dkmtAdapterVerifierOptionType = 0,
    public var mode: D3dkmtVerifierOptionMode = 0,
    public var data: D3dkmtAdapterVerifierOptionData = D3dkmtAdapterVerifierOptionData(),
)

public data class D3dkmtAdapterVerifierOptionData(public var vidMmFlags: D3dkmtAdapterVerifierVidmmFlags = D3dkmtAdapterVerifierVidmmFlags(), public var vidMmTrimInterval: D3dkmtAdapterVerifierVidmmTrimInterval = D3dkmtAdapterVerifierVidmmTrimInterval())

public data class D3dkmtAdapterVerifierVidmmFlags(public var anonymous: D3dkmtAdapterVerifierVidmmFlags0 = D3dkmtAdapterVerifierVidmmFlags0(), public var value: UInt = 0u)

public data class D3dkmtAdapterVerifierVidmmFlags0(public var bitfield: UInt = 0u)

public data class D3dkmtAdapterVerifierVidmmTrimInterval(
    public var minimumTrimInterval: ULong = 0uL,
    public var maximumTrimInterval: ULong = 0uL,
    public var idleTrimInterval: ULong = 0uL,
)

public data class D3dkmtAdjustfullscreengamma(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var scale: D3dddiDxgiRgb = D3dddiDxgiRgb(),
    public var offset: D3dddiDxgiRgb = D3dddiDxgiRgb(),
)

public data class D3dkmtAuxiliarypresentinfo(public var size: UInt = 0u, public var type: D3dkmtAuxiliarypresentinfoType = 0)

public data class D3dkmtBddfallbackCtl(public var forceBddHeadlessNextFallback: Boolean = false)

public data class D3dkmtBlocklistInfo(public var size: UInt = 0u, public var blockList: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtBlocklistInfo) return false
        if (this.size != other.size) return false
        if (!this.blockList.contentEquals(other.blockList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.blockList.contentHashCode()
        return result
    }
}

public data class D3dkmtBltmodelPresenthistorytoken(
    public var hLogicalSurface: ULong = 0uL,
    public var hPhysicalSurface: ULong = 0uL,
    public var eventId: ULong = 0uL,
    public var dirtyRegions: D3dkmtDirtyregions = D3dkmtDirtyregions(),
)

public data class D3dkmtBrightnessInfo(
    public var type: D3dkmtBrightnessInfoType = 0,
    public var childUid: UInt = 0u,
    public var anonymous: D3dkmtBrightnessInfo0 = D3dkmtBrightnessInfo0(),
)

public data class D3dkmtBrightnessInfo0(
    public var possibleLevels: D3dkmtBrightnessPossibleLevels = D3dkmtBrightnessPossibleLevels(),
    public var brightness: UByte = 0u,
    public var brightnessCaps: DxgkBrightnessCaps = DxgkBrightnessCaps(),
    public var brightnessState: DxgkBrightnessState = DxgkBrightnessState(),
    public var optimizationLevel: DxgkBacklightOptimizationLevel = 0,
    public var reductionInfo: DxgkBacklightInfo = DxgkBacklightInfo(),
    public var verboseLogging: Boolean = false,
    public var nitRanges: DxgkBrightnessGetNitRangesOut = DxgkBrightnessGetNitRangesOut(),
    public var getBrightnessMillinits: DxgkBrightnessGetOut = DxgkBrightnessGetOut(),
    public var setBrightnessMillinits: DxgkBrightnessSetIn = DxgkBrightnessSetIn(),
)

public data class D3dkmtBrightnessPossibleLevels(public var levelCount: UByte = 0u, public var brightnessLevels: UByteArray = UByteArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtBrightnessPossibleLevels) return false
        if (this.levelCount != other.levelCount) return false
        if (!this.brightnessLevels.contentEquals(other.brightnessLevels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.levelCount.hashCode()
        result = 31 * result + this.brightnessLevels.contentHashCode()
        return result
    }
}

public data class D3dkmtBudgetchangenotification(public var context: COpaquePointer? = null, public var budget: ULong = 0uL)

public data class D3dkmtCancelPresents(
    public var cbSize: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var flags: D3dkmtCancelPresentsFlags = D3dkmtCancelPresentsFlags(),
    public var operation: D3dkmtCancelPresentsOperation = 0,
    public var cancelFromPresentId: ULong = 0uL,
    public var compSurfaceLuid: Luid = Luid(),
    public var bindId: ULong = 0uL,
)

public data class D3dkmtCancelPresentsFlags(public var anonymous: D3dkmtCancelPresentsFlags0 = D3dkmtCancelPresentsFlags0())

public data class D3dkmtCancelPresentsFlags0(public var reprogramInterrupt: D3dkmtCancelPresentsFlags00 = D3dkmtCancelPresentsFlags00(), public var value: UInt = 0u)

public data class D3dkmtCancelPresentsFlags00(public var bitfield: UInt = 0u)

public data class D3dkmtChangesurfacepointer(
    public var hDC: Hdc = null,
    public var hBitmap: Handle = null,
    public var pSurfacePointer: COpaquePointer? = null,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
)

public data class D3dkmtChangevideomemoryreservation(
    public var hProcess: Handle = null,
    public var hAdapter: UInt = 0u,
    public var memorySegmentGroup: D3dkmtMemorySegmentGroup = 0,
    public var reservation: ULong = 0uL,
    public var physicalAdapterIndex: UInt = 0u,
)

public data class D3dkmtCheckmonitorpowerstate(public var hAdapter: UInt = 0u, public var vidPnSourceId: UInt = 0u)

public data class D3dkmtCheckmultiplaneoverlaysupport(
    public var hDevice: UInt = 0u,
    public var planeCount: UInt = 0u,
    public var pOverlayPlanes: D3dkmtCheckMultiplaneOverlayPlane? = null,
    public var supported: Bool = 0,
    public var returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
)

public data class D3dkmtCheckmultiplaneoverlaysupport2(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var planeCount: UInt = 0u,
    public var pOverlayPlanes: D3dkmtCheckMultiplaneOverlayPlane2? = null,
    public var supported: Bool = 0,
    public var returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
)

public data class D3dkmtCheckmultiplaneoverlaysupport3(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var planeCount: UInt = 0u,
    public var ppOverlayPlanes: COpaquePointer? = null,
    public var postCompositionCount: UInt = 0u,
    public var ppPostComposition: COpaquePointer? = null,
    public var supported: Bool = 0,
    public var returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
)

public data class D3dkmtCheckocclusion(public var hWindow: Hwnd = null)

public data class D3dkmtChecksharedresourceaccess(public var hResource: UInt = 0u, public var clientPid: UInt = 0u)

public data class D3dkmtCheckvidpnexclusiveownership(public var hAdapter: UInt = 0u, public var vidPnSourceId: UInt = 0u)

public data class D3dkmtCheckMultiplaneOverlayPlane(
    public var hResource: UInt = 0u,
    public var compSurfaceLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes = D3dkmtMultiplaneOverlayAttributes(),
)

public data class D3dkmtCheckMultiplaneOverlayPlane2(
    public var layerIndex: UInt = 0u,
    public var hResource: UInt = 0u,
    public var compSurfaceLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes2 = D3dkmtMultiplaneOverlayAttributes2(),
)

public data class D3dkmtCheckMultiplaneOverlayPlane3(
    public var layerIndex: UInt = 0u,
    public var hResource: UInt = 0u,
    public var compSurfaceLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var pPlaneAttributes: D3dkmtMultiplaneOverlayAttributes3? = null,
)

public data class D3dkmtCheckMultiplaneOverlaySupportReturnInfo(public var anonymous: D3dkmtCheckMultiplaneOverlaySupportReturnInfo0 = D3dkmtCheckMultiplaneOverlaySupportReturnInfo0())

public data class D3dkmtCheckMultiplaneOverlaySupportReturnInfo0(public var anonymous: D3dkmtCheckMultiplaneOverlaySupportReturnInfo00 = D3dkmtCheckMultiplaneOverlaySupportReturnInfo00(), public var value: UInt = 0u)

public data class D3dkmtCheckMultiplaneOverlaySupportReturnInfo00(public var bitfield: UInt = 0u)

public data class D3dkmtCloseadapter(public var hAdapter: UInt = 0u)

public data class D3dkmtCompositionPresenthistorytoken(public var hPrivateData: ULong = 0uL)

public data class D3dkmtConfiguresharedresource(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var isDwm: Boolean = false,
    public var hProcess: Handle = null,
    public var allowAccess: Boolean = false,
)

public data class D3dkmtConnectDoorbell(public var hHwQueue: UInt = 0u, public var flags: D3dkmtConnectDoorbellFlags = D3dkmtConnectDoorbellFlags())

public data class D3dkmtConnectDoorbellFlags(public var anonymous: D3dkmtConnectDoorbellFlags0 = D3dkmtConnectDoorbellFlags0())

public data class D3dkmtConnectDoorbellFlags0(public var anonymous: D3dkmtConnectDoorbellFlags00 = D3dkmtConnectDoorbellFlags00(), public var value: UInt = 0u)

public data class D3dkmtConnectDoorbellFlags00(public var bitfield: UInt = 0u)

public data class D3dkmtCpdrivername(public var contentProtectionFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCpdrivername) return false
        if (!this.contentProtectionFileName.contentEquals(other.contentProtectionFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.contentProtectionFileName.contentHashCode()
    }
}

public data class D3dkmtCreateallocation(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var anonymous1: D3dkmtCreateallocation0 = D3dkmtCreateallocation0(),
    public var privateDriverDataSize: UInt = 0u,
    public var numAllocations: UInt = 0u,
    public var anonymous2: D3dkmtCreateallocation1 = D3dkmtCreateallocation1(),
    public var flags: D3dkmtCreateallocationflags = D3dkmtCreateallocationflags(),
    public var hPrivateRuntimeResourceHandle: Handle = null,
)

public data class D3dkmtCreateallocation0(public var pStandardAllocation: D3dkmtCreatestandardallocation? = null, public var pPrivateDriverData: COpaquePointer? = null)

public data class D3dkmtCreateallocation1(public var pAllocationInfo: D3dddiAllocationinfo? = null, public var pAllocationInfo2: D3dddiAllocationinfo2? = null)

public data class D3dkmtCreateallocationflags(public var bitfield: UInt = 0u)

public data class D3dkmtCreatecontext(
    public var hDevice: UInt = 0u,
    public var nodeOrdinal: UInt = 0u,
    public var engineAffinity: UInt = 0u,
    public var flags: D3dddiCreatecontextflags = D3dddiCreatecontextflags(),
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var clientHint: D3dkmtClienthint = 0,
    public var hContext: UInt = 0u,
    public var pCommandBuffer: COpaquePointer? = null,
    public var commandBufferSize: UInt = 0u,
    public var pAllocationList: D3dddiAllocationlist? = null,
    public var allocationListSize: UInt = 0u,
    public var pPatchLocationList: D3dddiPatchlocationlist? = null,
    public var patchLocationListSize: UInt = 0u,
    public var commandBuffer: ULong = 0uL,
)

public data class D3dkmtCreatecontextvirtual(
    public var hDevice: UInt = 0u,
    public var nodeOrdinal: UInt = 0u,
    public var engineAffinity: UInt = 0u,
    public var flags: D3dddiCreatecontextflags = D3dddiCreatecontextflags(),
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var clientHint: D3dkmtClienthint = 0,
    public var hContext: UInt = 0u,
)

public data class D3dkmtCreatedcfrommemory(
    public var pMemory: COpaquePointer? = null,
    public var format: D3dddiformat = 0u,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
    public var hDeviceDc: Hdc = null,
    public var pColorTable: Paletteentry? = null,
    public var hDc: Hdc = null,
    public var hBitmap: Handle = null,
)

public data class D3dkmtCreatedevice(
    public var anonymous: D3dkmtCreatedevice0 = D3dkmtCreatedevice0(),
    public var flags: D3dkmtCreatedeviceflags = D3dkmtCreatedeviceflags(),
    public var hDevice: UInt = 0u,
    public var pCommandBuffer: COpaquePointer? = null,
    public var commandBufferSize: UInt = 0u,
    public var pAllocationList: D3dddiAllocationlist? = null,
    public var allocationListSize: UInt = 0u,
    public var pPatchLocationList: D3dddiPatchlocationlist? = null,
    public var patchLocationListSize: UInt = 0u,
)

public data class D3dkmtCreatedevice0(public var hAdapter: UInt = 0u, public var pAdapter: COpaquePointer? = null)

public data class D3dkmtCreatedeviceflags(public var bitfield: UInt = 0u)

public data class D3dkmtCreatehwcontext(
    public var hDevice: UInt = 0u,
    public var nodeOrdinal: UInt = 0u,
    public var engineAffinity: UInt = 0u,
    public var flags: D3dddiCreatehwcontextflags = D3dddiCreatehwcontextflags(),
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var hHwContext: UInt = 0u,
)

public data class D3dkmtCreatehwqueue(
    public var hHwContext: UInt = 0u,
    public var flags: D3dddiCreatehwqueueflags = D3dddiCreatehwqueueflags(),
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var hHwQueue: UInt = 0u,
    public var hHwQueueProgressFence: UInt = 0u,
    public var hwQueueProgressFenceCPUVirtualAddress: COpaquePointer? = null,
    public var hwQueueProgressFenceGPUVirtualAddress: ULong = 0uL,
)

public data class D3dkmtCreatekeyedmutex(
    public var initialValue: ULong = 0uL,
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
)

public data class D3dkmtCreatekeyedmutex2(
    public var initialValue: ULong = 0uL,
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var flags: D3dkmtCreatekeyedmutex2Flags = D3dkmtCreatekeyedmutex2Flags(),
)

public data class D3dkmtCreatekeyedmutex2Flags(public var anonymous: D3dkmtCreatekeyedmutex2Flags0 = D3dkmtCreatekeyedmutex2Flags0())

public data class D3dkmtCreatekeyedmutex2Flags0(public var anonymous: D3dkmtCreatekeyedmutex2Flags00 = D3dkmtCreatekeyedmutex2Flags00(), public var value: UInt = 0u)

public data class D3dkmtCreatekeyedmutex2Flags00(public var bitfield: UInt = 0u)

public data class D3dkmtCreatenativefence(public var hDevice: UInt = 0u, public var info: D3dddiCreatenativefenceinfo = D3dddiCreatenativefenceinfo())

public data class D3dkmtCreateoverlay(
    public var vidPnSourceId: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var overlayInfo: D3dddiKerneloverlayinfo = D3dddiKerneloverlayinfo(),
    public var hOverlay: UInt = 0u,
)

public data class D3dkmtCreatepagingqueue(
    public var hDevice: UInt = 0u,
    public var priority: D3dddiPagingqueuePriority = 0,
    public var hPagingQueue: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var fenceValueCPUVirtualAddress: COpaquePointer? = null,
    public var physicalAdapterIndex: UInt = 0u,
)

public data class D3dkmtCreateprotectedsession(
    public var hDevice: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var hHandle: UInt = 0u,
)

public data class D3dkmtCreatestandardallocation(
    public var type: D3dkmtStandardallocationtype = 0,
    public var anonymous: D3dkmtCreatestandardallocation0 = D3dkmtCreatestandardallocation0(),
    public var flags: D3dkmtCreatestandardallocationflags = D3dkmtCreatestandardallocationflags(),
)

public data class D3dkmtCreatestandardallocation0(public var existingHeapData: D3dkmtStandardallocationExistingheap = D3dkmtStandardallocationExistingheap())

public data class D3dkmtCreatestandardallocationflags(public var anonymous: D3dkmtCreatestandardallocationflags0 = D3dkmtCreatestandardallocationflags0())

public data class D3dkmtCreatestandardallocationflags0(public var anonymous: D3dkmtCreatestandardallocationflags00 = D3dkmtCreatestandardallocationflags00(), public var value: UInt = 0u)

public data class D3dkmtCreatestandardallocationflags00(public var bitfield: UInt = 0u)

public data class D3dkmtCreatesyncfile(
    public var hDevice: UInt = 0u,
    public var hMonitoredFence: UInt = 0u,
    public var fenceValue: ULong = 0uL,
    public var hSyncFile: ULong = 0uL,
)

public data class D3dkmtCreatesynchronizationobject(
    public var hDevice: UInt = 0u,
    public var info: D3dddiSynchronizationobjectinfo = D3dddiSynchronizationobjectinfo(),
    public var hSyncObject: UInt = 0u,
)

public data class D3dkmtCreatesynchronizationobject2(
    public var hDevice: UInt = 0u,
    public var info: D3dddiSynchronizationobjectinfo2 = D3dddiSynchronizationobjectinfo2(),
    public var hSyncObject: UInt = 0u,
)

public data class D3dkmtCreateDoorbell(
    public var hHwQueue: UInt = 0u,
    public var hRingBuffer: UInt = 0u,
    public var hRingBufferControl: UInt = 0u,
    public var flags: D3dkmtCreateDoorbellFlags = D3dkmtCreateDoorbellFlags(),
    public var privateDriverDataSize: UInt = 0u,
    public var privateDriverData: COpaquePointer? = null,
    public var doorbellCPUVirtualAddress: COpaquePointer? = null,
    public var doorbellSecondaryCPUVirtualAddress: COpaquePointer? = null,
    public var doorbellStatusCPUVirtualAddress: COpaquePointer? = null,
)

public data class D3dkmtCreateDoorbellFlags(public var anonymous: D3dkmtCreateDoorbellFlags0 = D3dkmtCreateDoorbellFlags0())

public data class D3dkmtCreateDoorbellFlags0(public var anonymous: D3dkmtCreateDoorbellFlags00 = D3dkmtCreateDoorbellFlags00(), public var value: UInt = 0u)

public data class D3dkmtCreateDoorbellFlags00(public var bitfield: UInt = 0u)

public data class D3dkmtCreateOutputdupl(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var keyedMutexCount: UInt = 0u,
    public var requiredKeyedMutexCount: UInt = 0u,
    public var keyedMutexs: List<D3dkmtOutputduplKeyedmutex> = List(3) { D3dkmtOutputduplKeyedmutex() },
    public var flags: D3dkmtOutputduplcreationflags = D3dkmtOutputduplcreationflags(),
)

public data class D3dkmtCrossadapterresourceSupport(public var supportTier: D3dkmtCrossadapterresourceSupportTier = 0)

public data class D3dkmtCurrentdisplaymode(public var vidPnSourceId: UInt = 0u, public var displayMode: D3dkmtDisplaymode = D3dkmtDisplaymode())

public data class D3dkmtDebugSnapshotEscape(public var length: UInt = 0u, public var buffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDebugSnapshotEscape) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class D3dkmtDestroyallocation(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: UInt? = null,
    public var allocationCount: UInt = 0u,
)

public data class D3dkmtDestroyallocation2(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: UInt? = null,
    public var allocationCount: UInt = 0u,
    public var flags: D3dddicbDestroyallocation2flags = D3dddicbDestroyallocation2flags(),
)

public data class D3dkmtDestroycontext(public var hContext: UInt = 0u)

public data class D3dkmtDestroydcfrommemory(public var hDc: Hdc = null, public var hBitmap: Handle = null)

public data class D3dkmtDestroydevice(public var hDevice: UInt = 0u)

public data class D3dkmtDestroyhwcontext(public var hHwContext: UInt = 0u)

public data class D3dkmtDestroyhwqueue(public var hHwQueue: UInt = 0u)

public data class D3dkmtDestroykeyedmutex(public var hKeyedMutex: UInt = 0u)

public data class D3dkmtDestroyoverlay(public var hDevice: UInt = 0u, public var hOverlay: UInt = 0u)

public data class D3dkmtDestroyprotectedsession(public var hHandle: UInt = 0u)

public data class D3dkmtDestroysynchronizationobject(public var hSyncObject: UInt = 0u)

public data class D3dkmtDestroyDoorbell(public var hHwQueue: UInt = 0u)

public data class D3dkmtDestroyOutputdupl(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var bDestroyAllContexts: Bool = 0,
)

public data class D3dkmtDevicepagefaultState(
    public var faultedPrimitiveAPISequenceNumber: ULong = 0uL,
    public var faultedPipelineStage: DxgkRenderPipelineStage = 0,
    public var faultedBindTableEntry: UInt = 0u,
    public var pageFaultFlags: DxgkPageFaultFlags = 0,
    public var faultErrorCode: DxgkFaultErrorCode = DxgkFaultErrorCode(),
    public var faultedVirtualAddress: ULong = 0uL,
)

public data class D3dkmtDevicepresentQueueState(public var vidPnSourceId: UInt = 0u, public var bQueuedPresentLimitReached: Boolean = false)

public data class D3dkmtDevicepresentState(public var vidPnSourceId: UInt = 0u, public var presentStats: D3dkmtPresentStats = D3dkmtPresentStats())

public data class D3dkmtDevicepresentStateDwm(public var vidPnSourceId: UInt = 0u, public var presentStatsDWM: D3dkmtPresentStatsDwm = D3dkmtPresentStatsDwm())

public data class D3dkmtDeviceresetState(public var anonymous: D3dkmtDeviceresetState0 = D3dkmtDeviceresetState0())

public data class D3dkmtDeviceresetState0(public var anonymous: D3dkmtDeviceresetState00 = D3dkmtDeviceresetState00(), public var value: UInt = 0u)

public data class D3dkmtDeviceresetState00(public var bitfield: UInt = 0u)

public data class D3dkmtDeviceEscape(public var type: D3dkmtDeviceescapeType = 0, public var anonymous: D3dkmtDeviceEscape0 = D3dkmtDeviceEscape0())

public data class D3dkmtDeviceEscape0(public var vidPnFromAllocation: D3dkmtDeviceEscape00 = D3dkmtDeviceEscape00())

public data class D3dkmtDeviceEscape00(public var hPrimaryAllocation: UInt = 0u, public var vidPnSourceId: UInt = 0u)

public data class D3dkmtDeviceIds(
    public var vendorID: UInt = 0u,
    public var deviceID: UInt = 0u,
    public var subVendorID: UInt = 0u,
    public var subSystemID: UInt = 0u,
    public var revisionID: UInt = 0u,
    public var busType: UInt = 0u,
)

public data class D3dkmtDirectflipSupport(public var supported: Bool = 0)

public data class D3dkmtDirtyregions(public var numRects: UInt = 0u, public var rects: List<Rect> = List(16) { Rect() })

public data class D3dkmtDisplaymode(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var integerRefreshRate: UInt = 0u,
    public var refreshRate: D3dddiRational = D3dddiRational(),
    public var scanLineOrdering: D3dddiVideoSignalScanlineOrdering = 0,
    public var displayOrientation: D3dddiRotation = 0,
    public var displayFixedOutput: UInt = 0u,
    public var flags: D3dkmdtDisplaymodeFlags = D3dkmdtDisplaymodeFlags(),
)

public data class D3dkmtDisplaymodelist(
    public var vidPnSourceId: UInt = 0u,
    public var modeCount: UInt = 0u,
    public var pModeList: List<D3dkmtDisplaymode> = List(1) { D3dkmtDisplaymode() },
)

public data class D3dkmtDisplayCaps(public var anonymous: D3dkmtDisplayCaps0 = D3dkmtDisplayCaps0())

public data class D3dkmtDisplayCaps0(public var anonymous: D3dkmtDisplayCaps00 = D3dkmtDisplayCaps00(), public var value: ULong = 0uL)

public data class D3dkmtDisplayCaps00(public var bitfield: ULong = 0uL)

public data class D3dkmtDisplayUmdFilenameinfo(public var version: KmtDisplayUmdVersion = 0, public var umdFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDisplayUmdFilenameinfo) return false
        if (this.version != other.version) return false
        if (!this.umdFileName.contentEquals(other.umdFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.umdFileName.contentHashCode()
        return result
    }
}

public data class D3dkmtDlistDriverName(public var dListFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDlistDriverName) return false
        if (!this.dListFileName.contentEquals(other.dListFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.dListFileName.contentHashCode()
    }
}

public data class D3dkmtDmmEscape(
    public var type: D3dkmtDmmescapetype = 0,
    public var providedBufferSize: Int = 0,
    public var minRequiredBufferSize: Int = 0,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDmmEscape) return false
        if (this.type != other.type) return false
        if (this.providedBufferSize != other.providedBufferSize) return false
        if (this.minRequiredBufferSize != other.minRequiredBufferSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.providedBufferSize.hashCode()
        result = 31 * result + this.minRequiredBufferSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class D3dkmtDodSetDirtyrectMode(public var bForceFullScreenDirty: Bool = 0)

public data class D3dkmtDrivercapsExt(public var anonymous: D3dkmtDrivercapsExt0 = D3dkmtDrivercapsExt0())

public data class D3dkmtDrivercapsExt0(public var anonymous: D3dkmtDrivercapsExt00 = D3dkmtDrivercapsExt00(), public var value: UInt = 0u)

public data class D3dkmtDrivercapsExt00(public var bitfield: UInt = 0u)

public data class D3dkmtDriverDescription(public var driverDescription: UShortArray = UShortArray(4096)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDriverDescription) return false
        if (!this.driverDescription.contentEquals(other.driverDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.driverDescription.contentHashCode()
    }
}

public data class D3dkmtEnumadapters(public var numAdapters: UInt = 0u, public var adapters: List<D3dkmtAdapterinfo> = List(16) { D3dkmtAdapterinfo() })

public data class D3dkmtEnumadapters2(public var numAdapters: UInt = 0u, public var pAdapters: D3dkmtAdapterinfo? = null)

public data class D3dkmtEnumadapters3(
    public var filter: D3dkmtEnumadaptersFilter = D3dkmtEnumadaptersFilter(),
    public var numAdapters: UInt = 0u,
    public var pAdapters: D3dkmtAdapterinfo? = null,
)

public data class D3dkmtEnumadaptersFilter(public var anonymous: D3dkmtEnumadaptersFilter0 = D3dkmtEnumadaptersFilter0(), public var value: ULong = 0uL)

public data class D3dkmtEnumadaptersFilter0(public var bitfield: ULong = 0uL)

public data class D3dkmtEscape(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var type: D3dkmtEscapetype = 0,
    public var flags: D3dddiEscapeflags = D3dddiEscapeflags(),
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtEscapeVirtualRefreshRate(
    public var type: D3dkmtEscapeVirtualRefreshRateType = 0,
    public var vidPnSourceId: UInt = 0u,
    public var processBoostEligible: Boolean = false,
    public var vSyncMultiplier: UInt = 0u,
    public var baseDesktopDuration: UInt = 0u,
    public var reserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtEscapeVirtualRefreshRate) return false
        if (this.type != other.type) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.processBoostEligible != other.processBoostEligible) return false
        if (this.vSyncMultiplier != other.vSyncMultiplier) return false
        if (this.baseDesktopDuration != other.baseDesktopDuration) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.processBoostEligible.hashCode()
        result = 31 * result + this.vSyncMultiplier.hashCode()
        result = 31 * result + this.baseDesktopDuration.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtEvict(
    public var hDevice: UInt = 0u,
    public var numAllocations: UInt = 0u,
    public var allocationList: UInt? = null,
    public var flags: D3dddiEvictFlags = D3dddiEvictFlags(),
    public var numBytesToTrim: ULong = 0uL,
)

public data class D3dkmtEvictionCriteria(
    public var minimumSize: ULong = 0uL,
    public var maximumSize: ULong = 0uL,
    public var anonymous: D3dkmtEvictionCriteria0 = D3dkmtEvictionCriteria0(),
)

public data class D3dkmtEvictionCriteria0(public var anonymous: D3dkmtEvictionCriteria00 = D3dkmtEvictionCriteria00())

public data class D3dkmtEvictionCriteria00(public var flags: D3dkmtEvictionCriteria000 = D3dkmtEvictionCriteria000(), public var value: UInt = 0u)

public data class D3dkmtEvictionCriteria000(public var bitfield: UInt = 0u)

public data class D3dkmtFencePresenthistorytoken(public var key: ULong = 0uL)

public data class D3dkmtFlipinfoflags(public var bitfield: UInt = 0u)

public data class D3dkmtFlipmanagerAuxiliarypresentinfo(
    public var auxiliaryPresentInfo: D3dkmtAuxiliarypresentinfo = D3dkmtAuxiliarypresentinfo(),
    public var flipManagerTracingId: UInt = 0u,
    public var customDurationChanged: Bool = 0,
    public var flipAdapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var independentFlipStage: D3dkmtFlipmodelIndependentFlipStage = 0,
    public var flipCompletedQpc: ULong = 0uL,
    public var hwPresentDurationQpc: UInt = 0u,
    public var wasCanceled: Bool = 0,
    public var convertedToNonIFlip: Bool = 0,
)

public data class D3dkmtFlipmanagerPresenthistorytoken(
    public var hPrivateData: ULong = 0uL,
    public var presentAtQpc: ULong = 0uL,
    public var flags: D3dkmtFlipmanagerPresenthistorytoken0 = D3dkmtFlipmanagerPresenthistorytoken0(),
)

public data class D3dkmtFlipmanagerPresenthistorytoken0(public var anonymous: D3dkmtFlipmanagerPresenthistorytoken00 = D3dkmtFlipmanagerPresenthistorytoken00(), public var value: UInt = 0u)

public data class D3dkmtFlipmanagerPresenthistorytoken00(public var bitfield: UInt = 0u)

public class D3dkmtFlipmodelPresenthistorytoken(
    public var fenceValue: ULong = 0uL,
    public var hLogicalSurface: ULong = 0uL,
    public var dxgContext: Int = 0,
    public var vidPnSourceId: UInt = 0u,
    public var swapChainIndex: UInt = 0u,
    public var presentLimitSemaphoreId: ULong = 0uL,
    public var flipInterval: D3dddiFlipintervalType = 0,
    public var flags: D3dkmtFlipmodelPresenthistorytokenflags = D3dkmtFlipmodelPresenthistorytokenflags(),
    public var hCompSurf: Long = 0L,
    public var compSurfLuid: Luid = Luid(),
    public var confirmationCookie: ULong = 0uL,
    public var compositionSyncKey: ULong = 0uL,
    public var remainingTokens: UInt = 0u,
    public var scrollRect: Rect = Rect(),
    public var scrollOffset: Point = Point(),
    public var presentCount: UInt = 0u,
    public var revealColor: FloatArray = FloatArray(4),
    public var rotation: D3dddiRotation = 0,
    public var anonymous: D3dkmtFlipmodelPresenthistorytoken0 = D3dkmtFlipmodelPresenthistorytoken0(),
    public var inkCookie: UInt = 0u,
    public var sourceRect: Rect = Rect(),
    public var destWidth: UInt = 0u,
    public var destHeight: UInt = 0u,
    public var targetRect: Rect = Rect(),
    public var transform: FloatArray = FloatArray(6),
    public var customDuration: UInt = 0u,
    public var customDurationFlipInterval: D3dddiFlipintervalType = 0,
    public var planeIndex: UInt = 0u,
    public var colorSpace: D3dddiColorSpaceType = 0,
    public var dirtyRegions: D3dkmtDirtyregions = D3dkmtDirtyregions(),
)

public data class D3dkmtFlipmodelPresenthistorytoken0(public var scatterBlts: D3dkmtScatterblts = D3dkmtScatterblts(), public var anonymous: D3dkmtFlipmodelPresenthistorytoken00 = D3dkmtFlipmodelPresenthistorytoken00())

public data class D3dkmtFlipmodelPresenthistorytoken00(
    public var hSyncObject: Handle = null,
    public var hDRMetaDataType: D3dddiHdrMetadataType = 0,
    public var anonymous: D3dkmtFlipmodelPresenthistorytoken000 = D3dkmtFlipmodelPresenthistorytoken000(),
)

public data class D3dkmtFlipmodelPresenthistorytoken000(public var hDRMetaDataHDR10: D3dddiHdrMetadataHdr10 = D3dddiHdrMetadataHdr10(), public var hDRMetaDataHDR10Plus: D3dddiHdrMetadataHdr10plus = D3dddiHdrMetadataHdr10plus())

public data class D3dkmtFlipmodelPresenthistorytokenflags(public var anonymous: D3dkmtFlipmodelPresenthistorytokenflags0 = D3dkmtFlipmodelPresenthistorytokenflags0())

public data class D3dkmtFlipmodelPresenthistorytokenflags0(public var anonymous: D3dkmtFlipmodelPresenthistorytokenflags00 = D3dkmtFlipmodelPresenthistorytokenflags00(), public var value: UInt = 0u)

public data class D3dkmtFlipmodelPresenthistorytokenflags00(public var bitfield: UInt = 0u)

public data class D3dkmtFlipoverlay(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var hSource: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
)

public data class D3dkmtFlipqueueinfo(
    public var maxHardwareFlipQueueLength: UInt = 0u,
    public var maxSoftwareFlipQueueLength: UInt = 0u,
    public var flipFlags: D3dkmtFlipinfoflags = D3dkmtFlipinfoflags(),
)

public data class D3dkmtFlushheaptransitions(public var hAdapter: UInt = 0u)

public data class D3dkmtFreegpuvirtualaddress(
    public var hAdapter: UInt = 0u,
    public var baseAddress: ULong = 0uL,
    public var size: ULong = 0uL,
)

public data class D3dkmtGdimodelPresenthistorytoken(
    public var hLogicalSurface: ULong = 0uL,
    public var hPhysicalSurface: ULong = 0uL,
    public var scrollRect: Rect = Rect(),
    public var scrollOffset: Point = Point(),
    public var dirtyRegions: D3dkmtDirtyregions = D3dkmtDirtyregions(),
)

public data class D3dkmtGdimodelSysmemPresenthistorytoken(
    public var hlsurf: ULong = 0uL,
    public var dwDirtyFlags: UInt = 0u,
    public var uiCookie: ULong = 0uL,
)

public data class D3dkmtGetallocationpriority(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: UInt? = null,
    public var allocationCount: UInt = 0u,
    public var pPriorities: UInt? = null,
)

public data class D3dkmtGetcontextinprocessschedulingpriority(public var hContext: UInt = 0u, public var priority: Int = 0)

public data class D3dkmtGetcontextschedulingpriority(public var hContext: UInt = 0u, public var priority: Int = 0)

public data class D3dkmtGetdevicestate(
    public var hDevice: UInt = 0u,
    public var stateType: D3dkmtDevicestateType = 0,
    public var anonymous: D3dkmtGetdevicestate0 = D3dkmtGetdevicestate0(),
)

public data class D3dkmtGetdevicestate0(
    public var executionState: D3dkmtDeviceexecutionState = 0,
    public var presentState: D3dkmtDevicepresentState = D3dkmtDevicepresentState(),
    public var resetState: D3dkmtDeviceresetState = D3dkmtDeviceresetState(),
    public var presentStateDWM: D3dkmtDevicepresentStateDwm = D3dkmtDevicepresentStateDwm(),
    public var pageFaultState: D3dkmtDevicepagefaultState = D3dkmtDevicepagefaultState(),
    public var presentQueueState: D3dkmtDevicepresentQueueState = D3dkmtDevicepresentQueueState(),
)

public data class D3dkmtGetdisplaymodelist(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var pModeList: D3dkmtDisplaymode? = null,
    public var modeCount: UInt = 0u,
)

public data class D3dkmtGetmultisamplemethodlist(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var pMethodList: D3dkmtMultisamplemethod? = null,
    public var methodCount: UInt = 0u,
)

public data class D3dkmtGetoverlaystate(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var overlayEnabled: Boolean = false,
)

public data class D3dkmtGetpresenthistory(
    public var hAdapter: UInt = 0u,
    public var providedSize: UInt = 0u,
    public var writtenSize: UInt = 0u,
    public var pTokens: D3dkmtPresenthistorytoken? = null,
    public var numTokens: UInt = 0u,
)

public data class D3dkmtGetprocessdeviceremovalsupport(
    public var hProcess: Handle = null,
    public var adapterLuid: Luid = Luid(),
    public var support: Boolean = false,
)

public data class D3dkmtGetruntimedata(
    public var hAdapter: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var pRuntimeData: COpaquePointer? = null,
    public var runtimeDataSize: UInt = 0u,
)

public data class D3dkmtGetscanline(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var inVerticalBlank: Boolean = false,
    public var scanLine: UInt = 0u,
)

public data class D3dkmtGetsharedprimaryhandle(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var hSharedPrimary: UInt = 0u,
)

public data class D3dkmtGetsharedresourceadapterluid(
    public var hGlobalShare: UInt = 0u,
    public var hNtHandle: Handle = null,
    public var adapterLuid: Luid = Luid(),
)

public data class D3dkmtGetverticalblankevent(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var phEvent: Int? = null,
)

public data class D3dkmtGetDeviceVidpnOwnershipInfo(public var hDevice: UInt = 0u, public var bFailedDwmAcquireVidPn: Boolean = false)

public data class D3dkmtGetGpummuCaps(public var physicalAdapterIndex: UInt = 0u, public var gpuMmuCaps: DxgkEscapeGpummucaps = DxgkEscapeGpummucaps())

public data class D3dkmtGetMultiplaneOverlayCaps(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var maxPlanes: UInt = 0u,
    public var maxRGBPlanes: UInt = 0u,
    public var maxYUVPlanes: UInt = 0u,
    public var overlayCaps: D3dkmtMultiplaneOverlayCaps = D3dkmtMultiplaneOverlayCaps(),
    public var maxStretchFactor: Float = 0.0f,
    public var maxShrinkFactor: Float = 0.0f,
)

public data class D3dkmtGetPostCompositionCaps(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var maxStretchFactor: Float = 0.0f,
    public var maxShrinkFactor: Float = 0.0f,
)

public data class D3dkmtGetPte(
    public var physicalAdapterIndex: UInt = 0u,
    public var pageTableLevel: UInt = 0u,
    public var pageTableIndex: UIntArray = UIntArray(6),
    public var b64KBPte: Boolean = false,
    public var numPtes: UInt = 0u,
    public var pte: List<DxgkPte> = List(64) { DxgkPte() },
    public var numValidEntries: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetPte) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (this.pageTableLevel != other.pageTableLevel) return false
        if (!this.pageTableIndex.contentEquals(other.pageTableIndex)) return false
        if (this.b64KBPte != other.b64KBPte) return false
        if (this.numPtes != other.numPtes) return false
        if (this.pte != other.pte) return false
        if (this.numValidEntries != other.numValidEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.pageTableLevel.hashCode()
        result = 31 * result + this.pageTableIndex.contentHashCode()
        result = 31 * result + this.b64KBPte.hashCode()
        result = 31 * result + this.numPtes.hashCode()
        result = 31 * result + this.pte.hashCode()
        result = 31 * result + this.numValidEntries.hashCode()
        return result
    }
}

public data class D3dkmtGetSegmentCaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var numSegments: UInt = 0u,
    public var segmentCaps: List<D3dkmtSegmentCaps> = List(32) { D3dkmtSegmentCaps() },
)

public data class D3dkmtGpummuCaps(public var flags: D3dkmtGpummuCaps0 = D3dkmtGpummuCaps0(), public var virtualAddressBitCount: UInt = 0u)

public data class D3dkmtGpummuCaps0(public var anonymous: D3dkmtGpummuCaps00 = D3dkmtGpummuCaps00(), public var value: UInt = 0u)

public data class D3dkmtGpummuCaps00(public var bitfield: UInt = 0u)

public data class D3dkmtGpuversion(
    public var physicalAdapterIndex: UInt = 0u,
    public var biosVersion: UShortArray = UShortArray(32),
    public var gpuArchitecture: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGpuversion) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (!this.biosVersion.contentEquals(other.biosVersion)) return false
        if (!this.gpuArchitecture.contentEquals(other.gpuArchitecture)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.biosVersion.contentHashCode()
        result = 31 * result + this.gpuArchitecture.contentHashCode()
        return result
    }
}

public data class D3dkmtHistoryBufferStatus(public var enabled: Boolean = false, public var reserved: UInt = 0u)

public data class D3dkmtHwdrmSupport(public var supported: Boolean = false)

public data class D3dkmtHybridDlistDllSupport(public var supported: Bool = 0)

public data class D3dkmtHybridList(
    public var state: D3dkmtGpuPreferenceQueryState = 0,
    public var adapterLuid: Luid = Luid(),
    public var bUserPreferenceQuery: Bool = 0,
    public var queryType: D3dkmtGpuPreferenceQueryType = 0,
)

public data class D3dkmtIndependentflipSecondarySupport(public var supported: Bool = 0)

public data class D3dkmtIndependentflipSupport(public var supported: Bool = 0)

public data class D3dkmtInvalidateactivevidpn(
    public var hAdapter: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
)

public data class D3dkmtInvalidatecache(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var offset: Int = 0,
    public var length: Int = 0,
)

public data class D3dkmtIsbaddriverforhwprotectiondisabled(public var disabled: Bool = 0)

public data class D3dkmtKmdDriverVersion(public var driverVersion: Long = 0L)

public data class D3dkmtLock(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var privateDriverData: UInt = 0u,
    public var numPages: UInt = 0u,
    public var pPages: UInt? = null,
    public var pData: COpaquePointer? = null,
    public var flags: D3dddicbLockflags = D3dddicbLockflags(),
    public var gpuVirtualAddress: ULong = 0uL,
)

public data class D3dkmtLock2(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var flags: D3dddicbLock2flags = D3dddicbLock2flags(),
    public var pData: COpaquePointer? = null,
)

public data class D3dkmtMarkdeviceaserror(public var hDevice: UInt = 0u, public var reason: D3dkmtDeviceErrorReason = 0)

public data class D3dkmtMiracastcompaniondrivername(public var miracastCompanionDriverName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMiracastcompaniondrivername) return false
        if (!this.miracastCompanionDriverName.contentEquals(other.miracastCompanionDriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.miracastCompanionDriverName.contentHashCode()
    }
}

public data class D3dkmtMiracastChunkData(
    public var chunkInfo: DxgkMiracastChunkInfo = DxgkMiracastChunkInfo(),
    public var privateDriverDataSize: UInt = 0u,
    public var privateDriverData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMiracastChunkData) return false
        if (this.chunkInfo != other.chunkInfo) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (!this.privateDriverData.contentEquals(other.privateDriverData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chunkInfo.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.privateDriverData.contentHashCode()
        return result
    }
}

public data class D3dkmtMiracastDisplayDeviceCaps(
    public var hdcpSupported: Boolean = false,
    public var defaultControlPort: UInt = 0u,
    public var usesIhvSolution: Boolean = false,
)

public data class D3dkmtMiracastDisplayDeviceStatus(public var state: D3dkmtMiracastDisplayDeviceState = 0)

public data class D3dkmtMiracastDisplayStopSessions(
    public var adapterLuid: Luid = Luid(),
    public var targetId: UInt = 0u,
    public var stopReason: UInt = 0u,
)

public data class D3dkmtMoveRect(public var sourcePoint: Point = Point(), public var destRect: Rect = Rect())

public data class D3dkmtMpo3ddiSupport(public var supported: Bool = 0)

public data class D3dkmtMpokernelcapsSupport(public var supported: Bool = 0)

public data class D3dkmtMultiplaneoverlayDecodeSupport(public var supported: Bool = 0)

public data class D3dkmtMultiplaneoverlayHudSupport(
    public var vidPnSourceId: UInt = 0u,
    public var update: Bool = 0,
    public var kernelSupported: Bool = 0,
    public var hudSupported: Bool = 0,
)

public data class D3dkmtMultiplaneoverlaySecondarySupport(public var supported: Bool = 0)

public data class D3dkmtMultiplaneoverlayStretchSupport(
    public var vidPnSourceId: UInt = 0u,
    public var update: Bool = 0,
    public var supported: Bool = 0,
)

public data class D3dkmtMultiplaneoverlaySupport(public var supported: Bool = 0)

public data class D3dkmtMultiplaneOverlay(
    public var layerIndex: UInt = 0u,
    public var enabled: Bool = 0,
    public var hAllocation: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes = D3dkmtMultiplaneOverlayAttributes(),
)

public data class D3dkmtMultiplaneOverlay2(
    public var layerIndex: UInt = 0u,
    public var enabled: Bool = 0,
    public var hAllocation: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes2 = D3dkmtMultiplaneOverlayAttributes2(),
)

public data class D3dkmtMultiplaneOverlay3(
    public var layerIndex: UInt = 0u,
    public var inputFlags: D3dkmtPlaneSpecificInputFlags = D3dkmtPlaneSpecificInputFlags(),
    public var flipInterval: D3dddiFlipintervalType = 0,
    public var maxImmediateFlipLine: UInt = 0u,
    public var allocationCount: UInt = 0u,
    public var pAllocationList: UInt? = null,
    public var driverPrivateDataSize: UInt = 0u,
    public var pDriverPrivateData: COpaquePointer? = null,
    public var pPlaneAttributes: D3dkmtMultiplaneOverlayAttributes3? = null,
    public var hFlipToFence: UInt = 0u,
    public var hFlipAwayFence: UInt = 0u,
    public var flipToFenceValue: ULong = 0uL,
    public var flipAwayFenceValue: ULong = 0uL,
)

public data class D3dkmtMultiplaneOverlayAttributes(
    public var flags: UInt = 0u,
    public var srcRect: Rect = Rect(),
    public var dstRect: Rect = Rect(),
    public var clipRect: Rect = Rect(),
    public var rotation: D3dddiRotation = 0,
    public var blend: D3dkmtMultiplaneOverlayBlend = 0,
    public var dirtyRectCount: UInt = 0u,
    public var pDirtyRects: Rect? = null,
    public var videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat = 0,
    public var yCbCrFlags: UInt = 0u,
    public var stereoFormat: D3dkmtMultiplaneOverlayStereoFormat = 0,
    public var stereoLeftViewFrame0: Bool = 0,
    public var stereoBaseViewFrame0: Bool = 0,
    public var stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode = 0,
    public var stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = 0,
)

public data class D3dkmtMultiplaneOverlayAttributes2(
    public var flags: UInt = 0u,
    public var srcRect: Rect = Rect(),
    public var dstRect: Rect = Rect(),
    public var clipRect: Rect = Rect(),
    public var rotation: D3dddiRotation = 0,
    public var blend: D3dkmtMultiplaneOverlayBlend = 0,
    public var dirtyRectCount: UInt = 0u,
    public var pDirtyRects: Rect? = null,
    public var videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat = 0,
    public var colorSpace: D3dddiColorSpaceType = 0,
    public var stereoFormat: D3dkmtMultiplaneOverlayStereoFormat = 0,
    public var stereoLeftViewFrame0: Bool = 0,
    public var stereoBaseViewFrame0: Bool = 0,
    public var stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode = 0,
    public var stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = 0,
    public var reserved1: UInt = 0u,
)

public data class D3dkmtMultiplaneOverlayAttributes3(
    public var flags: UInt = 0u,
    public var srcRect: Rect = Rect(),
    public var dstRect: Rect = Rect(),
    public var clipRect: Rect = Rect(),
    public var rotation: D3dddiRotation = 0,
    public var blend: D3dkmtMultiplaneOverlayBlend = 0,
    public var dirtyRectCount: UInt = 0u,
    public var pDirtyRects: Rect? = null,
    public var colorSpace: D3dddiColorSpaceType = 0,
    public var stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = 0,
    public var sDRWhiteLevel: UInt = 0u,
)

public data class D3dkmtMultiplaneOverlayCaps(public var anonymous: D3dkmtMultiplaneOverlayCaps0 = D3dkmtMultiplaneOverlayCaps0())

public data class D3dkmtMultiplaneOverlayCaps0(public var anonymous: D3dkmtMultiplaneOverlayCaps00 = D3dkmtMultiplaneOverlayCaps00(), public var value: UInt = 0u)

public data class D3dkmtMultiplaneOverlayCaps00(public var bitfield: UInt = 0u)

public data class D3dkmtMultiplaneOverlayPostComposition(
    public var flags: D3dkmtMultiplaneOverlayPostCompositionFlags = D3dkmtMultiplaneOverlayPostCompositionFlags(),
    public var srcRect: Rect = Rect(),
    public var dstRect: Rect = Rect(),
    public var rotation: D3dddiRotation = 0,
)

public data class D3dkmtMultiplaneOverlayPostCompositionFlags(public var anonymous: D3dkmtMultiplaneOverlayPostCompositionFlags0 = D3dkmtMultiplaneOverlayPostCompositionFlags0())

public data class D3dkmtMultiplaneOverlayPostCompositionFlags0(public var anonymous: D3dkmtMultiplaneOverlayPostCompositionFlags00 = D3dkmtMultiplaneOverlayPostCompositionFlags00(), public var value: UInt = 0u)

public data class D3dkmtMultiplaneOverlayPostCompositionFlags00(public var bitfield: UInt = 0u)

public data class D3dkmtMultiplaneOverlayPostCompositionWithSource(public var vidPnSourceId: UInt = 0u, public var postComposition: D3dkmtMultiplaneOverlayPostComposition = D3dkmtMultiplaneOverlayPostComposition())

public data class D3dkmtMultisamplemethod(
    public var numSamples: UInt = 0u,
    public var numQualityLevels: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class D3dkmtNodemetadata(public var nodeOrdinalAndAdapterIndex: UInt = 0u, public var nodeData: DxgkNodemetadata = DxgkNodemetadata())

public data class D3dkmtNodePerfdata(
    public var nodeOrdinal: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var frequency: ULong = 0uL,
    public var maxFrequency: ULong = 0uL,
    public var maxFrequencyOC: ULong = 0uL,
    public var voltage: UInt = 0u,
    public var voltageMax: UInt = 0u,
    public var voltageMaxOC: UInt = 0u,
    public var maxTransitionLatency: ULong = 0uL,
)

public data class D3dkmtNotifyWorkSubmission(public var hHwQueue: UInt = 0u, public var flags: D3dkmtNotifyWorkSubmissionFlags = D3dkmtNotifyWorkSubmissionFlags())

public data class D3dkmtNotifyWorkSubmissionFlags(public var anonymous: D3dkmtNotifyWorkSubmissionFlags0 = D3dkmtNotifyWorkSubmissionFlags0())

public data class D3dkmtNotifyWorkSubmissionFlags0(public var anonymous: D3dkmtNotifyWorkSubmissionFlags00 = D3dkmtNotifyWorkSubmissionFlags00(), public var value: UInt = 0u)

public data class D3dkmtNotifyWorkSubmissionFlags00(public var bitfield: UInt = 0u)

public data class D3dkmtOfferallocations(
    public var hDevice: UInt = 0u,
    public var pResources: UInt? = null,
    public var handleList: UInt? = null,
    public var numAllocations: UInt = 0u,
    public var priority: D3dkmtOfferPriority = 0,
    public var flags: D3dkmtOfferFlags = D3dkmtOfferFlags(),
)

public data class D3dkmtOfferFlags(public var anonymous: D3dkmtOfferFlags0 = D3dkmtOfferFlags0())

public data class D3dkmtOfferFlags0(public var anonymous: D3dkmtOfferFlags00 = D3dkmtOfferFlags00(), public var value: UInt = 0u)

public data class D3dkmtOfferFlags00(public var bitfield: UInt = 0u)

public data class D3dkmtOpenadapterfromdevicename(
    public var pDeviceName: Pcwstr = null,
    public var hAdapter: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
)

public data class D3dkmtOpenadapterfromgdidisplayname(
    public var deviceName: UShortArray = UShortArray(32),
    public var hAdapter: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenadapterfromgdidisplayname) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceName.contentHashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        return result
    }
}

public data class D3dkmtOpenadapterfromhdc(
    public var hDc: Hdc = null,
    public var hAdapter: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
)

public data class D3dkmtOpenadapterfromluid(public var adapterLuid: Luid = Luid(), public var hAdapter: UInt = 0u)

public data class D3dkmtOpenglinfo(
    public var umdOpenGlIcdFileName: UShortArray = UShortArray(260),
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenglinfo) return false
        if (!this.umdOpenGlIcdFileName.contentEquals(other.umdOpenGlIcdFileName)) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.umdOpenGlIcdFileName.contentHashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class D3dkmtOpenkeyedmutex(public var hSharedHandle: UInt = 0u, public var hKeyedMutex: UInt = 0u)

public data class D3dkmtOpenkeyedmutex2(
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
)

public data class D3dkmtOpenkeyedmutexfromnthandle(
    public var hNtHandle: Handle = null,
    public var hKeyedMutex: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
)

public data class D3dkmtOpennativefencefromnthandle(
    public var hNtHandle: Handle = null,
    public var hDevice: UInt = 0u,
    public var engineAffinity: UInt = 0u,
    public var flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
    public var hSyncObject: UInt = 0u,
    public var nativeFenceMapping: D3dddiNativefencemapping = D3dddiNativefencemapping(),
)

public data class D3dkmtOpennthandlefromname(
    public var dwDesiredAccess: UInt = 0u,
    public var pObjAttrib: ObjectAttributes? = null,
    public var hNtHandle: Handle = null,
)

public data class D3dkmtOpenprotectedsessionfromnthandle(public var hNtHandle: Handle = null, public var hHandle: UInt = 0u)

public data class D3dkmtOpenresource(
    public var hDevice: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var numAllocations: UInt = 0u,
    public var anonymous: D3dkmtOpenresource0 = D3dkmtOpenresource0(),
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var pResourcePrivateDriverData: COpaquePointer? = null,
    public var resourcePrivateDriverDataSize: UInt = 0u,
    public var pTotalPrivateDriverDataBuffer: COpaquePointer? = null,
    public var totalPrivateDriverDataBufferSize: UInt = 0u,
    public var hResource: UInt = 0u,
)

public data class D3dkmtOpenresource0(public var pOpenAllocationInfo: D3dddiOpenallocationinfo? = null, public var pOpenAllocationInfo2: D3dddiOpenallocationinfo2? = null)

public data class D3dkmtOpenresourcefromnthandle(
    public var hDevice: UInt = 0u,
    public var hNtHandle: Handle = null,
    public var numAllocations: UInt = 0u,
    public var pOpenAllocationInfo2: D3dddiOpenallocationinfo2? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var resourcePrivateDriverDataSize: UInt = 0u,
    public var pResourcePrivateDriverData: COpaquePointer? = null,
    public var totalPrivateDriverDataBufferSize: UInt = 0u,
    public var pTotalPrivateDriverDataBuffer: COpaquePointer? = null,
    public var hResource: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
    public var pKeyedMutexPrivateRuntimeData: COpaquePointer? = null,
    public var keyedMutexPrivateRuntimeDataSize: UInt = 0u,
    public var hSyncObject: UInt = 0u,
)

public data class D3dkmtOpensynchronizationobject(
    public var hSharedHandle: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensynchronizationobject) return false
        if (this.hSharedHandle != other.hSharedHandle) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSharedHandle.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtOpensyncobjectfromnthandle(public var hNtHandle: Handle = null, public var hSyncObject: UInt = 0u)

public data class D3dkmtOpensyncobjectfromnthandle2(
    public var hNtHandle: Handle = null,
    public var hDevice: UInt = 0u,
    public var flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
    public var hSyncObject: UInt = 0u,
    public var anonymous: D3dkmtOpensyncobjectfromnthandle20 = D3dkmtOpensyncobjectfromnthandle20(),
)

public data class D3dkmtOpensyncobjectfromnthandle20(public var monitoredFence: D3dkmtOpensyncobjectfromnthandle200 = D3dkmtOpensyncobjectfromnthandle200(), public var reserved: ULongArray = ULongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensyncobjectfromnthandle20) return false
        if (this.monitoredFence != other.monitoredFence) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitoredFence.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtOpensyncobjectfromnthandle200(
    public var fenceValueCPUVirtualAddress: COpaquePointer? = null,
    public var fenceValueGPUVirtualAddress: ULong = 0uL,
    public var engineAffinity: UInt = 0u,
)

public data class D3dkmtOpensyncobjectnthandlefromname(
    public var dwDesiredAccess: UInt = 0u,
    public var pObjAttrib: ObjectAttributes? = null,
    public var hNtHandle: Handle = null,
)

public data class D3dkmtOutduplPointerShapeInfo(
    public var type: D3dkmtOutduplPointerShapeType = 0,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
    public var hotSpot: Point = Point(),
)

public data class D3dkmtOutputduplcontextscount(public var vidPnSourceId: UInt = 0u, public var outputDuplicationCount: UInt = 0u)

public data class D3dkmtOutputduplcreationflags(public var anonymous: D3dkmtOutputduplcreationflags0 = D3dkmtOutputduplcreationflags0())

public data class D3dkmtOutputduplcreationflags0(public var anonymous: D3dkmtOutputduplcreationflags00 = D3dkmtOutputduplcreationflags00(), public var value: UInt = 0u)

public data class D3dkmtOutputduplcreationflags00(public var bitfield: UInt = 0u)

public data class D3dkmtOutputduplpresent(
    public var hContext: UInt = 0u,
    public var hSource: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var presentRegions: D3dkmtPresentRgns = D3dkmtPresentRgns(),
    public var flags: D3dkmtOutputduplpresentflags = D3dkmtOutputduplpresentflags(),
    public var hIndirectContext: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOutputduplpresent) return false
        if (this.hContext != other.hContext) return false
        if (this.hSource != other.hSource) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.presentRegions != other.presentRegions) return false
        if (this.flags != other.flags) return false
        if (this.hIndirectContext != other.hIndirectContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.hSource.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.presentRegions.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hIndirectContext.hashCode()
        return result
    }
}
