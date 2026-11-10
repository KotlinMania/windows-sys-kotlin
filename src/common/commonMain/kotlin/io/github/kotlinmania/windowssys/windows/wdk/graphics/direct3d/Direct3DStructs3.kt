@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl

public data class D3dkmtOutputduplpresentflags(
    public var anonymous: D3dkmtOutputduplpresentflags0 = D3dkmtOutputduplpresentflags0(),
)

public data class D3dkmtOutputduplpresentflags0(
    public var anonymous: D3dkmtOutputduplpresentflags00 = D3dkmtOutputduplpresentflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtOutputduplpresentflags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtOutputduplpresenttohwqueue(
    public var hSource: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var broadcastHwQueueCount: UInt = 0u,
    public var hHwQueues: UInt? = null,
    public var presentRegions: D3dkmtPresentRgns = D3dkmtPresentRgns(),
    public var flags: D3dkmtOutputduplpresentflags = D3dkmtOutputduplpresentflags(),
    public var hIndirectHwQueue: UInt = 0u,
)

public data class D3dkmtOutputduplFrameinfo(
    public var lastPresentTime: Long = 0L,
    public var lastMouseUpdateTime: Long = 0L,
    public var accumulatedFrames: UInt = 0u,
    public var rectsCoalesced: Bool = 0,
    public var protectedContentMaskedOut: Bool = 0,
    public var pointerPosition: D3dkmtOutputduplPointerPosition = D3dkmtOutputduplPointerPosition(),
    public var totalMetadataBufferSize: UInt = 0u,
    public var pointerShapeBufferSize: UInt = 0u,
)

public data class D3dkmtOutputduplGetFrameinfo(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var frameInfo: D3dkmtOutputduplFrameinfo = D3dkmtOutputduplFrameinfo(),
)

public data class D3dkmtOutputduplGetPointerShapeData(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var bufferSizeSupplied: UInt = 0u,
    public var pShapeBuffer: COpaquePointer? = null,
    public var bufferSizeRequired: UInt = 0u,
    public var shapeInfo: D3dkmtOutduplPointerShapeInfo = D3dkmtOutduplPointerShapeInfo(),
)

public data class D3dkmtOutputduplKeyedmutex(
    public var hSharedSurfaceNt: Handle = null,
)

public data class D3dkmtOutputduplMetadata(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var type: D3dkmtOutputduplMetadatatype = 0,
    public var bufferSizeSupplied: UInt = 0u,
    public var pBuffer: COpaquePointer? = null,
    public var bufferSizeRequired: UInt = 0u,
)

public data class D3dkmtOutputduplPointerPosition(
    public var position: Point = Point(),
    public var visible: Bool = 0,
)

public data class D3dkmtOutputduplReleaseFrame(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var nextKeyMutexIdx: UInt = 0u,
)

public data class D3dkmtOutputduplSnapshot(
    public var size: UInt = 0u,
    public var sessionProcessCount: UInt = 0u,
    public var sessionActiveConnectionsCount: UInt = 0u,
    public var numVidPnSources: UInt = 0u,
    public var numOutputDuplContexts: UInt = 0u,
    public var padding: UInt = 0u,
    public var outputDuplDebugInfos: List<OutputduplContextDebugInfo> = List(1) { OutputduplContextDebugInfo() },
)

public data class D3dkmtPageTableLevelDesc(
    public var indexBitCount: UInt = 0u,
    public var indexMask: ULong = 0uL,
    public var indexShift: ULong = 0uL,
    public var lowerLevelsMask: ULong = 0uL,
    public var entryCoverageInPages: ULong = 0uL,
)

public data class D3dkmtPanelfitterSupport(
    public var supported: Bool = 0,
)

public data class D3dkmtParavirtualization(
    public var secureContainer: Boolean = false,
)

public data class D3dkmtPhysicalAdapterCount(
    public var count: UInt = 0u,
)

public data class D3dkmtPindirectflipresources(
    public var hDevice: UInt = 0u,
    public var resourceCount: UInt = 0u,
    public var pResourceList: UInt? = null,
)

public data class D3dkmtPlaneSpecificInputFlags(
    public var anonymous: D3dkmtPlaneSpecificInputFlags0 = D3dkmtPlaneSpecificInputFlags0(),
)

public data class D3dkmtPlaneSpecificInputFlags0(
    public var anonymous: D3dkmtPlaneSpecificInputFlags00 = D3dkmtPlaneSpecificInputFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPlaneSpecificInputFlags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtPlaneSpecificOutputFlags(
    public var anonymous: D3dkmtPlaneSpecificOutputFlags0 = D3dkmtPlaneSpecificOutputFlags0(),
)

public data class D3dkmtPlaneSpecificOutputFlags0(
    public var anonymous: D3dkmtPlaneSpecificOutputFlags00 = D3dkmtPlaneSpecificOutputFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPlaneSpecificOutputFlags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtPolldisplaychildren(
    public var hAdapter: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public class D3dkmtPresent(
    public var anonymous1: D3dkmtPresent0 = D3dkmtPresent0(),
    public var hWindow: Hwnd = null,
    public var vidPnSourceId: UInt = 0u,
    public var hSource: UInt = 0u,
    public var hDestination: UInt = 0u,
    public var color: UInt = 0u,
    public var dstRect: Rect = Rect(),
    public var srcRect: Rect = Rect(),
    public var subRectCnt: UInt = 0u,
    public var pSrcSubRects: Rect? = null,
    public var presentCount: UInt = 0u,
    public var flipInterval: D3dddiFlipintervalType = 0,
    public var flags: D3dkmtPresentflags = D3dkmtPresentflags(),
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var presentLimitSemaphore: Handle = null,
    public var presentHistoryToken: D3dkmtPresenthistorytoken = D3dkmtPresenthistorytoken(),
    public var pPresentRegions: D3dkmtPresentRgns? = null,
    public var anonymous2: D3dkmtPresent1 = D3dkmtPresent1(),
    public var duration: UInt = 0u,
    public var broadcastSrcAllocation: UInt? = null,
    public var broadcastDstAllocation: UInt? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var bOptimizeForComposition: Boolean = false,
)

public data class D3dkmtPresent0(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtPresent1(
    public var hAdapter: UInt = 0u,
    public var hIndirectContext: UInt = 0u,
)

public data class D3dkmtPresentflags(
    public var anonymous: D3dkmtPresentflags0 = D3dkmtPresentflags0(),
)

public data class D3dkmtPresentflags0(
    public var anonymous: D3dkmtPresentflags00 = D3dkmtPresentflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPresentflags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtPresenthistorytoken(
    public var model: D3dkmtPresentModel = 0,
    public var tokenSize: UInt = 0u,
    public var compositionBindingId: ULong = 0uL,
    public var token: D3dkmtPresenthistorytoken0 = D3dkmtPresenthistorytoken0(),
)

public data class D3dkmtPresenthistorytoken0(
    public var flip: D3dkmtFlipmodelPresenthistorytoken = D3dkmtFlipmodelPresenthistorytoken(),
    public var blt: D3dkmtBltmodelPresenthistorytoken = D3dkmtBltmodelPresenthistorytoken(),
    public var vistaBlt: ULong = 0uL,
    public var gdi: D3dkmtGdimodelPresenthistorytoken = D3dkmtGdimodelPresenthistorytoken(),
    public var fence: D3dkmtFencePresenthistorytoken = D3dkmtFencePresenthistorytoken(),
    public var gdiSysMem: D3dkmtGdimodelSysmemPresenthistorytoken = D3dkmtGdimodelSysmemPresenthistorytoken(),
    public var composition: D3dkmtCompositionPresenthistorytoken = D3dkmtCompositionPresenthistorytoken(),
    public var flipManager: D3dkmtFlipmanagerPresenthistorytoken = D3dkmtFlipmanagerPresenthistorytoken(),
    public var surfaceComplete: D3dkmtSurfacecompletePresenthistorytoken = D3dkmtSurfacecompletePresenthistorytoken(),
)

public data class D3dkmtPresentMultiplaneOverlay(
    public var anonymous: D3dkmtPresentMultiplaneOverlay0 = D3dkmtPresentMultiplaneOverlay0(),
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var vidPnSourceId: UInt = 0u,
    public var presentCount: UInt = 0u,
    public var flipInterval: D3dddiFlipintervalType = 0,
    public var flags: D3dkmtPresentflags = D3dkmtPresentflags(),
    public var presentPlaneCount: UInt = 0u,
    public var pPresentPlanes: D3dkmtMultiplaneOverlay? = null,
    public var duration: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentMultiplaneOverlay) return false
        if (this.anonymous != other.anonymous) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.presentCount != other.presentCount) return false
        if (this.flipInterval != other.flipInterval) return false
        if (this.flags != other.flags) return false
        if (this.presentPlaneCount != other.presentPlaneCount) return false
        if (this.pPresentPlanes != other.pPresentPlanes) return false
        if (this.duration != other.duration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.presentCount.hashCode()
        result = 31 * result + this.flipInterval.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentPlaneCount.hashCode()
        result = 31 * result + this.pPresentPlanes.hashCode()
        result = 31 * result + this.duration.hashCode()
        return result
    }
}

public data class D3dkmtPresentMultiplaneOverlay0(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtPresentMultiplaneOverlay2(
    public var hAdapter: UInt = 0u,
    public var anonymous: D3dkmtPresentMultiplaneOverlay20 = D3dkmtPresentMultiplaneOverlay20(),
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var vidPnSourceId: UInt = 0u,
    public var presentCount: UInt = 0u,
    public var flipInterval: D3dddiFlipintervalType = 0,
    public var flags: D3dkmtPresentflags = D3dkmtPresentflags(),
    public var presentPlaneCount: UInt = 0u,
    public var pPresentPlanes: D3dkmtMultiplaneOverlay2? = null,
    public var duration: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentMultiplaneOverlay2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.anonymous != other.anonymous) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.presentCount != other.presentCount) return false
        if (this.flipInterval != other.flipInterval) return false
        if (this.flags != other.flags) return false
        if (this.presentPlaneCount != other.presentPlaneCount) return false
        if (this.pPresentPlanes != other.pPresentPlanes) return false
        if (this.duration != other.duration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.presentCount.hashCode()
        result = 31 * result + this.flipInterval.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentPlaneCount.hashCode()
        result = 31 * result + this.pPresentPlanes.hashCode()
        result = 31 * result + this.duration.hashCode()
        return result
    }
}

public data class D3dkmtPresentMultiplaneOverlay20(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtPresentMultiplaneOverlay3(
    public var hAdapter: UInt = 0u,
    public var contextCount: UInt = 0u,
    public var pContextList: UInt? = null,
    public var vidPnSourceId: UInt = 0u,
    public var presentCount: UInt = 0u,
    public var flags: D3dkmtPresentMultiplaneOverlayFlags = D3dkmtPresentMultiplaneOverlayFlags(),
    public var presentPlaneCount: UInt = 0u,
    public var ppPresentPlanes: COpaquePointer? = null,
    public var pPostComposition: D3dkmtMultiplaneOverlayPostComposition? = null,
    public var duration: UInt = 0u,
    public var hDRMetaDataType: D3dddiHdrMetadataType = 0,
    public var hDRMetaDataSize: UInt = 0u,
    public var pHDRMetaData: COpaquePointer? = null,
    public var boostRefreshRateMultiplier: UInt = 0u,
)

public data class D3dkmtPresentMultiplaneOverlayFlags(
    public var anonymous: D3dkmtPresentMultiplaneOverlayFlags0 = D3dkmtPresentMultiplaneOverlayFlags0(),
)

public data class D3dkmtPresentMultiplaneOverlayFlags0(
    public var anonymous: D3dkmtPresentMultiplaneOverlayFlags00 = D3dkmtPresentMultiplaneOverlayFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPresentMultiplaneOverlayFlags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtPresentRedirected(
    public var hSyncObj: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var waitedFenceValue: ULong = 0uL,
    public var presentHistoryToken: D3dkmtPresenthistorytoken = D3dkmtPresenthistorytoken(),
    public var flags: D3dkmtPresentRedirectedFlags = D3dkmtPresentRedirectedFlags(),
    public var hSource: UInt = 0u,
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
)

public data class D3dkmtPresentRedirectedFlags(
    public var anonymous: D3dkmtPresentRedirectedFlags0 = D3dkmtPresentRedirectedFlags0(),
)

public data class D3dkmtPresentRedirectedFlags0(
    public var anonymous: D3dkmtPresentRedirectedFlags00 = D3dkmtPresentRedirectedFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPresentRedirectedFlags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtPresentRgns(
    public var dirtyRectCount: UInt = 0u,
    public var pDirtyRects: Rect? = null,
    public var moveRectCount: UInt = 0u,
    public var pMoveRects: D3dkmtMoveRect? = null,
)

public data class D3dkmtPresentStats(
    public var presentCount: UInt = 0u,
    public var presentRefreshCount: UInt = 0u,
    public var syncRefreshCount: UInt = 0u,
    public var syncQPCTime: Long = 0L,
    public var syncGPUTime: Long = 0L,
)

public data class D3dkmtPresentStatsDwm(
    public var presentCount: UInt = 0u,
    public var presentRefreshCount: UInt = 0u,
    public var presentQPCTime: Long = 0L,
    public var syncRefreshCount: UInt = 0u,
    public var syncQPCTime: Long = 0L,
    public var customPresentDuration: UInt = 0u,
)

public data class D3dkmtPresentStatsDwm2(
    public var cbSize: UInt = 0u,
    public var presentCount: UInt = 0u,
    public var presentRefreshCount: UInt = 0u,
    public var presentQPCTime: Long = 0L,
    public var syncRefreshCount: UInt = 0u,
    public var syncQPCTime: Long = 0L,
    public var customPresentDuration: UInt = 0u,
    public var virtualSyncRefreshCount: UInt = 0u,
    public var virtualSyncQPCTime: Long = 0L,
)

public data class D3dkmtProcessVerifierOption(
    public var hProcess: Handle = null,
    public var type: D3dkmtProcessVerifierOptionType = 0,
    public var mode: D3dkmtVerifierOptionMode = 0,
    public var data: D3dkmtProcessVerifierOptionData = D3dkmtProcessVerifierOptionData(),
)

public data class D3dkmtProcessVerifierOptionData(
    public var vidMmFlags: D3dkmtProcessVerifierVidmmFlags = D3dkmtProcessVerifierVidmmFlags(),
    public var vidMmRestrictBudget: D3dkmtProcessVerifierVidmmRestrictBudget = D3dkmtProcessVerifierVidmmRestrictBudget(),
)

public data class D3dkmtProcessVerifierVidmmFlags(
    public var anonymous: D3dkmtProcessVerifierVidmmFlags0 = D3dkmtProcessVerifierVidmmFlags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtProcessVerifierVidmmFlags0(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtProcessVerifierVidmmRestrictBudget(
    public var localBudget: ULong = 0uL,
    public var nonLocalBudget: ULong = 0uL,
)

public data class D3dkmtQueryadapterinfo(
    public var hAdapter: UInt = 0u,
    public var type: Kmtqueryadapterinfotype = 0,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
)

public data class D3dkmtQueryallocationresidency(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: UInt? = null,
    public var allocationCount: UInt = 0u,
    public var pResidencyStatus: Int? = null,
)

public data class D3dkmtQueryclockcalibration(
    public var hAdapter: UInt = 0u,
    public var nodeOrdinal: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var clockData: DxgkGpuclockdata = DxgkGpuclockdata(),
)

public data class D3dkmtQueryfseblock(
    public var adapterLuid: Luid = Luid(),
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var flags: D3dkmtQueryfseblockflags = D3dkmtQueryfseblockflags(),
)

public data class D3dkmtQueryfseblockflags(
    public var anonymous: D3dkmtQueryfseblockflags0 = D3dkmtQueryfseblockflags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtQueryfseblockflags0(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtQueryprocessofferinfo(
    public var cbSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var decommitUniqueness: ULong = 0uL,
    public var decommittableBytes: ULong = 0uL,
)

public data class D3dkmtQueryprotectedsessioninfofromnthandle(
    public var hNtHandle: Handle = null,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
)

public data class D3dkmtQueryprotectedsessionstatus(
    public var hHandle: UInt = 0u,
    public var status: D3dkmtProtectedSessionStatus = 0,
)

public data class D3dkmtQueryremotevidpnsourcefromgdidisplayname(
    public var deviceName: UShortArray = UShortArray(32),
    public var vidPnSourceId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryremotevidpnsourcefromgdidisplayname) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceName.contentHashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        return result
    }
}

public data class D3dkmtQueryresourceinfo(
    public var hDevice: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var totalPrivateDriverDataSize: UInt = 0u,
    public var resourcePrivateDriverDataSize: UInt = 0u,
    public var numAllocations: UInt = 0u,
)

public data class D3dkmtQueryresourceinfofromnthandle(
    public var hDevice: UInt = 0u,
    public var hNtHandle: Handle = null,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
    public var totalPrivateDriverDataSize: UInt = 0u,
    public var resourcePrivateDriverDataSize: UInt = 0u,
    public var numAllocations: UInt = 0u,
)

public data class D3dkmtQuerystatistics(
    public var type: D3dkmtQuerystatisticsType = 0,
    public var adapterLuid: Luid = Luid(),
    public var hProcess: Handle = null,
    public var queryResult: D3dkmtQuerystatisticsResult = D3dkmtQuerystatisticsResult(),
    public var anonymous: D3dkmtQuerystatistics0 = D3dkmtQuerystatistics0(),
)

public class D3dkmtQuerystatistics0(
    public var querySegment: D3dkmtQuerystatisticsQuerySegment = D3dkmtQuerystatisticsQuerySegment(),
    public var queryProcessSegment: D3dkmtQuerystatisticsQuerySegment = D3dkmtQuerystatisticsQuerySegment(),
    public var queryProcessSegmentGroup: D3dkmtMemorySegmentGroup = 0,
    public var queryNode: D3dkmtQuerystatisticsQueryNode = D3dkmtQuerystatisticsQueryNode(),
    public var queryProcessNode: D3dkmtQuerystatisticsQueryNode = D3dkmtQuerystatisticsQueryNode(),
    public var queryVidPnSource: D3dkmtQuerystatisticsQueryVidpnsource = D3dkmtQuerystatisticsQueryVidpnsource(),
    public var queryProcessVidPnSource: D3dkmtQuerystatisticsQueryVidpnsource = D3dkmtQuerystatisticsQueryVidpnsource(),
    public var queryPhysAdapter: D3dkmtQuerystatisticsQueryPhysicalAdapter = D3dkmtQuerystatisticsQueryPhysicalAdapter(),
    public var queryAdapter2: D3dkmtQuerystatisticsQueryAdapter2 = D3dkmtQuerystatisticsQueryAdapter2(),
    public var querySegment2: D3dkmtQuerystatisticsQuerySegment2 = D3dkmtQuerystatisticsQuerySegment2(),
    public var queryProcessAdapter2: D3dkmtQuerystatisticsQueryAdapter2 = D3dkmtQuerystatisticsQueryAdapter2(),
    public var queryProcessSegment2: D3dkmtQuerystatisticsQuerySegment2 = D3dkmtQuerystatisticsQuerySegment2(),
    public var queryProcessSegmentGroup2: D3dkmtQuerystatisticsQueryProcessSegmentGroup2 = D3dkmtQuerystatisticsQueryProcessSegmentGroup2(),
    public var querySegmentUsage: D3dkmtQuerystatisticsQuerySegmentUsage = D3dkmtQuerystatisticsQuerySegmentUsage(),
    public var querySegmentGroupUsage: D3dkmtQuerystatisticsQuerySegmentGroupUsage = D3dkmtQuerystatisticsQuerySegmentGroupUsage(),
    public var queryNode2: D3dkmtQuerystatisticsQueryNode2 = D3dkmtQuerystatisticsQueryNode2(),
    public var queryProcessNode2: D3dkmtQuerystatisticsQueryNode2 = D3dkmtQuerystatisticsQueryNode2(),
)

public class D3dkmtQuerystatisticsAdapterInformation(
    public var nbSegments: UInt = 0u,
    public var nodeCount: UInt = 0u,
    public var vidPnSourceCount: UInt = 0u,
    public var vSyncEnabled: UInt = 0u,
    public var tdrDetectedCount: UInt = 0u,
    public var zeroLengthDmaBuffers: Long = 0L,
    public var restartedPeriod: ULong = 0uL,
    public var referenceDmaBuffer: D3dkmtQuerystatsticsReferenceDmaBuffer = D3dkmtQuerystatsticsReferenceDmaBuffer(),
    public var renaming: D3dkmtQuerystatsticsRenaming = D3dkmtQuerystatsticsRenaming(),
    public var preparation: D3dkmtQuerystatsticsPrepration = D3dkmtQuerystatsticsPrepration(),
    public var pagingFault: D3dkmtQuerystatsticsPagingFault = D3dkmtQuerystatsticsPagingFault(),
    public var pagingTransfer: D3dkmtQuerystatsticsPagingTransfer = D3dkmtQuerystatsticsPagingTransfer(),
    public var swizzlingRange: D3dkmtQuerystatsticsSwizzlingRange = D3dkmtQuerystatsticsSwizzlingRange(),
    public var locks: D3dkmtQuerystatsticsLocks = D3dkmtQuerystatsticsLocks(),
    public var allocations: D3dkmtQuerystatsticsAllocations = D3dkmtQuerystatsticsAllocations(),
    public var terminations: D3dkmtQuerystatsticsTerminations = D3dkmtQuerystatsticsTerminations(),
    public var flags: D3dkmtQuerystatisticsAdapterInformationFlags = D3dkmtQuerystatisticsAdapterInformationFlags(),
    public var reserved: ULongArray = ULongArray(7),
)

public data class D3dkmtQuerystatisticsAdapterInformationFlags(
    public var anonymous: D3dkmtQuerystatisticsAdapterInformationFlags0 = D3dkmtQuerystatisticsAdapterInformationFlags0(),
)

public data class D3dkmtQuerystatisticsAdapterInformationFlags0(
    public var anonymous: D3dkmtQuerystatisticsAdapterInformationFlags00 = D3dkmtQuerystatisticsAdapterInformationFlags00(),
    public var value: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsAdapterInformationFlags00(
    public var bitfield: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsCommitmentData(
    public var totalBytesEvictedFromProcess: ULong = 0uL,
    public var bytesBySegmentPreference: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsCommitmentData) return false
        if (this.totalBytesEvictedFromProcess != other.totalBytesEvictedFromProcess) return false
        if (!this.bytesBySegmentPreference.contentEquals(other.bytesBySegmentPreference)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.totalBytesEvictedFromProcess.hashCode()
        result = 31 * result + this.bytesBySegmentPreference.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsCounter(
    public var count: UInt = 0u,
    public var bytes: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsDmaBuffer(
    public var size: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationListBytes: UInt = 0u,
    public var patchLocationListBytes: UInt = 0u,
)

public data class D3dkmtQuerystatisticsDmaPacketTypeInformation(
    public var packetSubmited: UInt = 0u,
    public var packetCompleted: UInt = 0u,
    public var packetPreempted: UInt = 0u,
    public var packetFaulted: UInt = 0u,
)

public data class D3dkmtQuerystatisticsMemory(
    public var totalBytesEvicted: ULong = 0uL,
    public var allocsCommitted: UInt = 0u,
    public var allocsResident: UInt = 0u,
)

public data class D3dkmtQuerystatisticsMemoryUsage(
    public var allocatedBytes: ULong = 0uL,
    public var freeBytes: ULong = 0uL,
    public var zeroBytes: ULong = 0uL,
    public var modifiedBytes: ULong = 0uL,
    public var standbyBytes: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsNodeInformation(
    public var globalInformation: D3dkmtQuerystatisticsProcessNodeInformation = D3dkmtQuerystatisticsProcessNodeInformation(),
    public var systemInformation: D3dkmtQuerystatisticsProcessNodeInformation = D3dkmtQuerystatisticsProcessNodeInformation(),
    public var nodePerfData: D3dkmtNodePerfdata = D3dkmtNodePerfdata(),
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsNodeInformation) return false
        if (this.globalInformation != other.globalInformation) return false
        if (this.systemInformation != other.systemInformation) return false
        if (this.nodePerfData != other.nodePerfData) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.globalInformation.hashCode()
        result = 31 * result + this.systemInformation.hashCode()
        result = 31 * result + this.nodePerfData.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsPacketInformation(
    public var queuePacket: List<D3dkmtQuerystatisticsQueuePacketTypeInformation> = List(8) { D3dkmtQuerystatisticsQueuePacketTypeInformation() },
    public var dmaPacket: List<D3dkmtQuerystatisticsDmaPacketTypeInformation> = List(4) { D3dkmtQuerystatisticsDmaPacketTypeInformation() },
)

public data class D3dkmtQuerystatisticsPhysicalAdapterInformation(
    public var adapterPerfData: D3dkmtAdapterPerfdata = D3dkmtAdapterPerfdata(),
    public var adapterPerfDataCaps: D3dkmtAdapterPerfdatacaps = D3dkmtAdapterPerfdatacaps(),
    public var gpuVersion: D3dkmtGpuversion = D3dkmtGpuversion(),
)

public data class D3dkmtQuerystatisticsPolicy(
    public var preferApertureForRead: ULongArray = ULongArray(5),
    public var preferAperture: ULongArray = ULongArray(5),
    public var memResetOnPaging: ULong = 0uL,
    public var removePagesFromWorkingSetOnPaging: ULong = 0uL,
    public var migrationEnabled: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsPolicy) return false
        if (!this.preferApertureForRead.contentEquals(other.preferApertureForRead)) return false
        if (!this.preferAperture.contentEquals(other.preferAperture)) return false
        if (this.memResetOnPaging != other.memResetOnPaging) return false
        if (this.removePagesFromWorkingSetOnPaging != other.removePagesFromWorkingSetOnPaging) return false
        if (this.migrationEnabled != other.migrationEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.preferApertureForRead.contentHashCode()
        result = 31 * result + this.preferAperture.contentHashCode()
        result = 31 * result + this.memResetOnPaging.hashCode()
        result = 31 * result + this.removePagesFromWorkingSetOnPaging.hashCode()
        result = 31 * result + this.migrationEnabled.hashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsPreemptionInformation(
    public var preemptionCounter: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsPreemptionInformation) return false
        if (!this.preemptionCounter.contentEquals(other.preemptionCounter)) return false
        return true
    }

    override fun hashCode(): Int = this.preemptionCounter.contentHashCode()
}

public data class D3dkmtQuerystatisticsProcessAdapterInformation(
    public var nbSegments: UInt = 0u,
    public var nodeCount: UInt = 0u,
    public var vidPnSourceCount: UInt = 0u,
    public var virtualMemoryUsage: UInt = 0u,
    public var dmaBuffer: D3dkmtQuerystatisticsDmaBuffer = D3dkmtQuerystatisticsDmaBuffer(),
    public var commitmentData: D3dkmtQuerystatisticsCommitmentData = D3dkmtQuerystatisticsCommitmentData(),
    public var policy: D3dkmtQuerystatisticsPolicy = D3dkmtQuerystatisticsPolicy(),
    public var processInterferenceCounters: D3dkmtQuerystatisticsProcessInterferenceCounters = D3dkmtQuerystatisticsProcessInterferenceCounters(),
    public var clientHint: D3dkmtClienthint = 0,
)

public data class D3dkmtQuerystatisticsProcessInformation(
    public var nodeCount: UInt = 0u,
    public var vidPnSourceCount: UInt = 0u,
    public var systemMemory: D3dkmtQuerystatisticsSystemMemory = D3dkmtQuerystatisticsSystemMemory(),
    public var reserved: ULongArray = ULongArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessInformation) return false
        if (this.nodeCount != other.nodeCount) return false
        if (this.vidPnSourceCount != other.vidPnSourceCount) return false
        if (this.systemMemory != other.systemMemory) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeCount.hashCode()
        result = 31 * result + this.vidPnSourceCount.hashCode()
        result = 31 * result + this.systemMemory.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsProcessInterferenceCounters(
    public var interferenceCount: ULongArray = ULongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessInterferenceCounters) return false
        if (!this.interferenceCount.contentEquals(other.interferenceCount)) return false
        return true
    }

    override fun hashCode(): Int = this.interferenceCount.contentHashCode()
}

public data class D3dkmtQuerystatisticsProcessNodeInformation(
    public var runningTime: Long = 0L,
    public var contextSwitch: UInt = 0u,
    public var preemptionStatistics: D3dkmtQuerystatisticsPreemptionInformation = D3dkmtQuerystatisticsPreemptionInformation(),
    public var packetStatistics: D3dkmtQuerystatisticsPacketInformation = D3dkmtQuerystatisticsPacketInformation(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessNodeInformation) return false
        if (this.runningTime != other.runningTime) return false
        if (this.contextSwitch != other.contextSwitch) return false
        if (this.preemptionStatistics != other.preemptionStatistics) return false
        if (this.packetStatistics != other.packetStatistics) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.runningTime.hashCode()
        result = 31 * result + this.contextSwitch.hashCode()
        result = 31 * result + this.preemptionStatistics.hashCode()
        result = 31 * result + this.packetStatistics.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsProcessSegmentGroupInformation(
    public var budget: ULong = 0uL,
    public var requested: ULong = 0uL,
    public var usage: ULong = 0uL,
    public var demoted: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessSegmentGroupInformation) return false
        if (this.budget != other.budget) return false
        if (this.requested != other.requested) return false
        if (this.usage != other.usage) return false
        if (!this.demoted.contentEquals(other.demoted)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.budget.hashCode()
        result = 31 * result + this.requested.hashCode()
        result = 31 * result + this.usage.hashCode()
        result = 31 * result + this.demoted.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsProcessSegmentInformation(
    public var bytesCommitted: ULong = 0uL,
    public var maximumWorkingSet: ULong = 0uL,
    public var minimumWorkingSet: ULong = 0uL,
    public var nbReferencedAllocationEvictedInPeriod: UInt = 0u,
    public var padding: UInt = 0u,
    public var videoMemory: D3dkmtQuerystatisticsVideoMemory = D3dkmtQuerystatisticsVideoMemory(),
    public var policy: D3dkmtQuerystatisticsProcessSegmentPolicy = D3dkmtQuerystatisticsProcessSegmentPolicy(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessSegmentInformation) return false
        if (this.bytesCommitted != other.bytesCommitted) return false
        if (this.maximumWorkingSet != other.maximumWorkingSet) return false
        if (this.minimumWorkingSet != other.minimumWorkingSet) return false
        if (this.nbReferencedAllocationEvictedInPeriod != other.nbReferencedAllocationEvictedInPeriod) return false
        if (this.padding != other.padding) return false
        if (this.videoMemory != other.videoMemory) return false
        if (this.policy != other.policy) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bytesCommitted.hashCode()
        result = 31 * result + this.maximumWorkingSet.hashCode()
        result = 31 * result + this.minimumWorkingSet.hashCode()
        result = 31 * result + this.nbReferencedAllocationEvictedInPeriod.hashCode()
        result = 31 * result + this.padding.hashCode()
        result = 31 * result + this.videoMemory.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsProcessSegmentPolicy(
    public var useMRU: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsProcessVidpnsourceInformation(
    public var frame: UInt = 0u,
    public var cancelledFrame: UInt = 0u,
    public var queuedPresent: UInt = 0u,
    public var padding: UInt = 0u,
    public var isVSyncEnabled: ULong = 0uL,
    public var vSyncOnTotalTimeMs: ULong = 0uL,
    public var vSyncOffKeepPhaseTotalTimeMs: ULong = 0uL,
    public var vSyncOffNoPhaseTotalTimeMs: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessVidpnsourceInformation) return false
        if (this.frame != other.frame) return false
        if (this.cancelledFrame != other.cancelledFrame) return false
        if (this.queuedPresent != other.queuedPresent) return false
        if (this.padding != other.padding) return false
        if (this.isVSyncEnabled != other.isVSyncEnabled) return false
        if (this.vSyncOnTotalTimeMs != other.vSyncOnTotalTimeMs) return false
        if (this.vSyncOffKeepPhaseTotalTimeMs != other.vSyncOffKeepPhaseTotalTimeMs) return false
        if (this.vSyncOffNoPhaseTotalTimeMs != other.vSyncOffNoPhaseTotalTimeMs) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.frame.hashCode()
        result = 31 * result + this.cancelledFrame.hashCode()
        result = 31 * result + this.queuedPresent.hashCode()
        result = 31 * result + this.padding.hashCode()
        result = 31 * result + this.isVSyncEnabled.hashCode()
        result = 31 * result + this.vSyncOnTotalTimeMs.hashCode()
        result = 31 * result + this.vSyncOffKeepPhaseTotalTimeMs.hashCode()
        result = 31 * result + this.vSyncOffNoPhaseTotalTimeMs.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsQueryAdapter2(
    public var physicalAdapterIndex: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQueryAdapterInformation2(
    public var physicalAdapterIndex: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQueryNode(
    public var nodeId: UInt = 0u,
)

public data class D3dkmtQuerystatisticsQueryNode2(
    public var physicalAdapterIndex: UShort = 0u,
    public var nodeOrdinal: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQueryPhysicalAdapter(
    public var physicalAdapterIndex: UInt = 0u,
)

public data class D3dkmtQuerystatisticsQueryProcessSegmentGroup2(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentGroup: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQuerySegment(
    public var segmentId: UInt = 0u,
)

public data class D3dkmtQuerystatisticsQuerySegment2(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentId: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQuerySegmentGroupUsage(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentGroup: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQuerySegmentUsage(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentId: UShort = 0u,
)

public data class D3dkmtQuerystatisticsQueryVidpnsource(
    public var vidPnSourceId: UInt = 0u,
)

public data class D3dkmtQuerystatisticsQueuePacketTypeInformation(
    public var packetSubmited: UInt = 0u,
    public var packetCompleted: UInt = 0u,
)

public data class D3dkmtQuerystatisticsResult(
    public var adapterInformation: D3dkmtQuerystatisticsAdapterInformation = D3dkmtQuerystatisticsAdapterInformation(),
    public var physAdapterInformation: D3dkmtQuerystatisticsPhysicalAdapterInformation = D3dkmtQuerystatisticsPhysicalAdapterInformation(),
    public var segmentInformation: D3dkmtQuerystatisticsSegmentInformation = D3dkmtQuerystatisticsSegmentInformation(),
    public var nodeInformation: D3dkmtQuerystatisticsNodeInformation = D3dkmtQuerystatisticsNodeInformation(),
    public var vidPnSourceInformation: D3dkmtQuerystatisticsVidpnsourceInformation = D3dkmtQuerystatisticsVidpnsourceInformation(),
    public var processInformation: D3dkmtQuerystatisticsProcessInformation = D3dkmtQuerystatisticsProcessInformation(),
    public var processAdapterInformation: D3dkmtQuerystatisticsProcessAdapterInformation = D3dkmtQuerystatisticsProcessAdapterInformation(),
    public var processSegmentInformation: D3dkmtQuerystatisticsProcessSegmentInformation = D3dkmtQuerystatisticsProcessSegmentInformation(),
    public var processNodeInformation: D3dkmtQuerystatisticsProcessNodeInformation = D3dkmtQuerystatisticsProcessNodeInformation(),
    public var processVidPnSourceInformation: D3dkmtQuerystatisticsProcessVidpnsourceInformation = D3dkmtQuerystatisticsProcessVidpnsourceInformation(),
    public var processSegmentGroupInformation: D3dkmtQuerystatisticsProcessSegmentGroupInformation = D3dkmtQuerystatisticsProcessSegmentGroupInformation(),
    public var segmentUsageInformation: D3dkmtQuerystatisticsMemoryUsage = D3dkmtQuerystatisticsMemoryUsage(),
    public var segmentGroupUsageInformation: D3dkmtQuerystatisticsMemoryUsage = D3dkmtQuerystatisticsMemoryUsage(),
)

public data class D3dkmtQuerystatisticsSegmentInformation(
    public var commitLimit: ULong = 0uL,
    public var bytesCommitted: ULong = 0uL,
    public var bytesResident: ULong = 0uL,
    public var memory: D3dkmtQuerystatisticsMemory = D3dkmtQuerystatisticsMemory(),
    public var aperture: UInt = 0u,
    public var totalBytesEvictedByPriority: ULongArray = ULongArray(5),
    public var systemMemoryEndAddress: ULong = 0uL,
    public var powerFlags: D3dkmtQuerystatisticsSegmentInformation0 = D3dkmtQuerystatisticsSegmentInformation0(),
    public var segmentProperties: D3dkmtQuerystatisticsSegmentInformation1 = D3dkmtQuerystatisticsSegmentInformation1(),
    public var reserved: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsSegmentInformation) return false
        if (this.commitLimit != other.commitLimit) return false
        if (this.bytesCommitted != other.bytesCommitted) return false
        if (this.bytesResident != other.bytesResident) return false
        if (this.memory != other.memory) return false
        if (this.aperture != other.aperture) return false
        if (!this.totalBytesEvictedByPriority.contentEquals(other.totalBytesEvictedByPriority)) return false
        if (this.systemMemoryEndAddress != other.systemMemoryEndAddress) return false
        if (this.powerFlags != other.powerFlags) return false
        if (this.segmentProperties != other.segmentProperties) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commitLimit.hashCode()
        result = 31 * result + this.bytesCommitted.hashCode()
        result = 31 * result + this.bytesResident.hashCode()
        result = 31 * result + this.memory.hashCode()
        result = 31 * result + this.aperture.hashCode()
        result = 31 * result + this.totalBytesEvictedByPriority.contentHashCode()
        result = 31 * result + this.systemMemoryEndAddress.hashCode()
        result = 31 * result + this.powerFlags.hashCode()
        result = 31 * result + this.segmentProperties.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatisticsSegmentInformation0(
    public var bitfield: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsSegmentInformation1(
    public var bitfield: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsSystemMemory(
    public var bytesAllocated: ULong = 0uL,
    public var bytesReserved: ULong = 0uL,
    public var smallAllocationBlocks: UInt = 0u,
    public var largeAllocationBlocks: UInt = 0u,
    public var writeCombinedBytesAllocated: ULong = 0uL,
    public var writeCombinedBytesReserved: ULong = 0uL,
    public var cachedBytesAllocated: ULong = 0uL,
    public var cachedBytesReserved: ULong = 0uL,
    public var sectionBytesAllocated: ULong = 0uL,
    public var sectionBytesReserved: ULong = 0uL,
    public var bytesZeroed: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsVideoMemory(
    public var allocsCommitted: UInt = 0u,
    public var allocsResidentInP: List<D3dkmtQuerystatisticsCounter> = List(5) { D3dkmtQuerystatisticsCounter() },
    public var allocsResidentInNonPreferred: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var totalBytesEvictedDueToPreparation: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsVidpnsourceInformation(
    public var globalInformation: D3dkmtQuerystatisticsProcessVidpnsourceInformation = D3dkmtQuerystatisticsProcessVidpnsourceInformation(),
    public var systemInformation: D3dkmtQuerystatisticsProcessVidpnsourceInformation = D3dkmtQuerystatisticsProcessVidpnsourceInformation(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsVidpnsourceInformation) return false
        if (this.globalInformation != other.globalInformation) return false
        if (this.systemInformation != other.systemInformation) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.globalInformation.hashCode()
        result = 31 * result + this.systemInformation.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtQuerystatsticsAllocations(
    public var created: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var destroyed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var opened: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var closed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var migratedSuccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var migratedFail: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var migratedAbandoned: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
)

public data class D3dkmtQuerystatsticsLocks(
    public var nbLocks: UInt = 0u,
    public var nbLocksWaitFlag: UInt = 0u,
    public var nbLocksDiscardFlag: UInt = 0u,
    public var nbLocksNoOverwrite: UInt = 0u,
    public var nbLocksNoReadSync: UInt = 0u,
    public var nbLocksLinearization: UInt = 0u,
    public var nbComplexLocks: UInt = 0u,
)

public class D3dkmtQuerystatsticsPagingFault(
    public var faults: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsFirstTimeAccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsReclaimed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsMigration: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsIncorrectResource: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsLostContent: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsEvicted: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsMemReset: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsUnresetSuccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsUnresetFail: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsUnresetSuccessRead: UInt = 0u,
    public var allocationsUnresetFailRead: UInt = 0u,
    public var evictions: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToPreparation: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToLock: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToClose: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToPurge: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToSuspendCPUAccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
)

public data class D3dkmtQuerystatsticsPagingTransfer(
    public var bytesFilled: ULong = 0uL,
    public var bytesDiscarded: ULong = 0uL,
    public var bytesMappedIntoAperture: ULong = 0uL,
    public var bytesUnmappedFromAperture: ULong = 0uL,
    public var bytesTransferredFromMdlToMemory: ULong = 0uL,
    public var bytesTransferredFromMemoryToMdl: ULong = 0uL,
    public var bytesTransferredFromApertureToMemory: ULong = 0uL,
    public var bytesTransferredFromMemoryToAperture: ULong = 0uL,
)

public data class D3dkmtQuerystatsticsPrepration(
    public var broadcastStall: UInt = 0u,
    public var nbDMAPrepared: UInt = 0u,
    public var nbDMAPreparedLongPath: UInt = 0u,
    public var immediateHighestPreparationPass: UInt = 0u,
    public var allocationsTrimmed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
)

public data class D3dkmtQuerystatsticsReferenceDmaBuffer(
    public var nbCall: UInt = 0u,
    public var nbAllocationsReferenced: UInt = 0u,
    public var maxNbAllocationsReferenced: UInt = 0u,
    public var nbNULLReference: UInt = 0u,
    public var nbWriteReference: UInt = 0u,
    public var nbRenamedAllocationsReferenced: UInt = 0u,
    public var nbIterationSearchingRenamedAllocation: UInt = 0u,
    public var nbLockedAllocationReferenced: UInt = 0u,
    public var nbAllocationWithValidPrepatchingInfoReferenced: UInt = 0u,
    public var nbAllocationWithInvalidPrepatchingInfoReferenced: UInt = 0u,
    public var nbDMABufferSuccessfullyPrePatched: UInt = 0u,
    public var nbPrimariesReferencesOverflow: UInt = 0u,
    public var nbAllocationWithNonPreferredResources: UInt = 0u,
    public var nbAllocationInsertedInMigrationTable: UInt = 0u,
)

public data class D3dkmtQuerystatsticsRenaming(
    public var nbAllocationsRenamed: UInt = 0u,
    public var nbAllocationsShrinked: UInt = 0u,
    public var nbRenamedBuffer: UInt = 0u,
    public var maxRenamingListLength: UInt = 0u,
    public var nbFailuresDueToRenamingLimit: UInt = 0u,
    public var nbFailuresDueToCreateAllocation: UInt = 0u,
    public var nbFailuresDueToOpenAllocation: UInt = 0u,
    public var nbFailuresDueToLowResource: UInt = 0u,
    public var nbFailuresDueToNonRetiredLimit: UInt = 0u,
)

public data class D3dkmtQuerystatsticsSwizzlingRange(
    public var nbRangesAcquired: UInt = 0u,
    public var nbRangesReleased: UInt = 0u,
)

public data class D3dkmtQuerystatsticsTerminations(
    public var terminatedShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var terminatedNonShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var destroyedShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var destroyedNonShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
)

public data class D3dkmtQueryvideomemoryinfo(
    public var hProcess: Handle = null,
    public var hAdapter: UInt = 0u,
    public var memorySegmentGroup: D3dkmtMemorySegmentGroup = 0,
    public var budget: ULong = 0uL,
    public var currentUsage: ULong = 0uL,
    public var currentReservation: ULong = 0uL,
    public var availableForReservation: ULong = 0uL,
    public var physicalAdapterIndex: UInt = 0u,
)

public data class D3dkmtQueryvidpnexclusiveownership(
    public var hProcess: Handle = null,
    public var hWindow: Hwnd = null,
    public var vidPnSourceId: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
    public var ownerType: D3dkmtVidpnsourceownerType = 0,
)

public data class D3dkmtQueryAdapterUniqueGuid(
    public var adapterUniqueGUID: UShortArray = UShortArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryAdapterUniqueGuid) return false
        if (!this.adapterUniqueGUID.contentEquals(other.adapterUniqueGUID)) return false
        return true
    }

    override fun hashCode(): Int = this.adapterUniqueGUID.contentHashCode()
}

public data class D3dkmtQueryDeviceIds(
    public var physicalAdapterIndex: UInt = 0u,
    public var deviceIds: D3dkmtDeviceIds = D3dkmtDeviceIds(),
)

public data class D3dkmtQueryGpummuCaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var caps: D3dkmtGpummuCaps = D3dkmtGpummuCaps(),
)

public data class D3dkmtQueryMiracastDriverType(
    public var miracastDriverType: D3dkmtMiracastDriverType = 0,
)

public data class D3dkmtQueryPhysicalAdapterPnpKey(
    public var physicalAdapterIndex: UInt = 0u,
    public var pnPKeyType: D3dkmtPnpKeyType = 0,
    public var pDest: Pwstr = null,
    public var pCchDest: UInt? = null,
)

public data class D3dkmtQueryScanoutCaps(
    public var vidPnSourceId: UInt = 0u,
    public var caps: UInt = 0u,
)

public data class D3dkmtReclaimallocations(
    public var hDevice: UInt = 0u,
    public var pResources: UInt? = null,
    public var handleList: UInt? = null,
    public var pDiscarded: Bool? = null,
    public var numAllocations: UInt = 0u,
)

public data class D3dkmtReclaimallocations2(
    public var hPagingQueue: UInt = 0u,
    public var numAllocations: UInt = 0u,
    public var pResources: UInt? = null,
    public var handleList: UInt? = null,
    public var anonymous: D3dkmtReclaimallocations20 = D3dkmtReclaimallocations20(),
    public var pagingFenceValue: ULong = 0uL,
)

public data class D3dkmtReclaimallocations20(
    public var pDiscarded: Bool? = null,
    public var pResults: Int? = null,
)

public data class D3dkmtRegisterbudgetchangenotification(
    public var hDevice: UInt = 0u,
    public var callback: Pfnd3dkmtBudgetchangenotificationcallback = null,
    public var context: COpaquePointer? = null,
    public var handle: COpaquePointer? = null,
)

public data class D3dkmtRegistertrimnotification(
    public var adapterLuid: Luid = Luid(),
    public var hDevice: UInt = 0u,
    public var callback: Pfnd3dkmtTrimnotificationcallback = null,
    public var context: COpaquePointer? = null,
    public var handle: COpaquePointer? = null,
)

public data class D3dkmtReleasekeyedmutex(
    public var hKeyedMutex: UInt = 0u,
    public var key: ULong = 0uL,
    public var fenceValue: ULong = 0uL,
)

public data class D3dkmtReleasekeyedmutex2(
    public var hKeyedMutex: UInt = 0u,
    public var key: ULong = 0uL,
    public var fenceValue: ULong = 0uL,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
)

public class D3dkmtRender(
    public var anonymous: D3dkmtRender0 = D3dkmtRender0(),
    public var commandOffset: UInt = 0u,
    public var commandLength: UInt = 0u,
    public var allocationCount: UInt = 0u,
    public var patchLocationCount: UInt = 0u,
    public var pNewCommandBuffer: COpaquePointer? = null,
    public var newCommandBufferSize: UInt = 0u,
    public var pNewAllocationList: D3dddiAllocationlist? = null,
    public var newAllocationListSize: UInt = 0u,
    public var pNewPatchLocationList: D3dddiPatchlocationlist? = null,
    public var newPatchLocationListSize: UInt = 0u,
    public var flags: D3dkmtRenderflags = D3dkmtRenderflags(),
    public var presentHistoryToken: ULong = 0uL,
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var queuedBufferCount: UInt = 0u,
    public var newCommandBuffer: ULong = 0uL,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
)

public data class D3dkmtRender0(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtRenderflags(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtRequestMachineCrashEscape(
    public var param1: Int = 0,
    public var param2: Int = 0,
    public var param3: Int = 0,
)

public data class D3dkmtScatterblt(
    public var hLogicalSurfaceDestination: ULong = 0uL,
    public var hDestinationCompSurfDWM: Long = 0L,
    public var destinationCompositionBindingId: ULong = 0uL,
    public var sourceRect: Rect = Rect(),
    public var destinationOffset: Point = Point(),
)

public data class D3dkmtScatterblts(
    public var numBlts: UInt = 0u,
    public var blts: List<D3dkmtScatterblt> = List(12) { D3dkmtScatterblt() },
)

public data class D3dkmtSegmentgroupsizeinfo(
    public var physicalAdapterIndex: UInt = 0u,
    public var legacyInfo: D3dkmtSegmentsizeinfo = D3dkmtSegmentsizeinfo(),
    public var localMemory: ULong = 0uL,
    public var nonLocalMemory: ULong = 0uL,
    public var nonBudgetMemory: ULong = 0uL,
)

public data class D3dkmtSegmentsizeinfo(
    public var dedicatedVideoMemorySize: ULong = 0uL,
    public var dedicatedSystemMemorySize: ULong = 0uL,
    public var sharedSystemMemorySize: ULong = 0uL,
)

public data class D3dkmtSegmentCaps(
    public var size: ULong = 0uL,
    public var pageSize: UInt = 0u,
    public var segmentId: UInt = 0u,
    public var bAperture: Boolean = false,
    public var bReservedSysMem: Boolean = false,
    public var budgetGroup: D3dkmtMemorySegmentGroup = 0,
)

public data class D3dkmtSetallocationpriority(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: UInt? = null,
    public var allocationCount: UInt = 0u,
    public var pPriorities: UInt? = null,
)

public data class D3dkmtSetcontextinprocessschedulingpriority(
    public var hContext: UInt = 0u,
    public var priority: Int = 0,
)

public data class D3dkmtSetcontextschedulingpriority(
    public var hContext: UInt = 0u,
    public var priority: Int = 0,
)

public data class D3dkmtSetdisplaymode(
    public var hDevice: UInt = 0u,
    public var hPrimaryAllocation: UInt = 0u,
    public var scanLineOrdering: D3dddiVideoSignalScanlineOrdering = 0,
    public var displayOrientation: D3dddiRotation = 0,
    public var privateDriverFormatAttribute: UInt = 0u,
    public var flags: D3dkmtSetdisplaymodeFlags = D3dkmtSetdisplaymodeFlags(),
)

public data class D3dkmtSetdisplaymodeFlags(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UInt = 0u,
)

public data class D3dkmtSetdisplayprivatedriverformat(
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var privateDriverFormatAttribute: UInt = 0u,
)

public data class D3dkmtSetfseblock(
    public var adapterLuid: Luid = Luid(),
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var flags: D3dkmtSetfseblockflags = D3dkmtSetfseblockflags(),
)

public data class D3dkmtSetfseblockflags(
    public var anonymous: D3dkmtSetfseblockflags0 = D3dkmtSetfseblockflags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtSetfseblockflags0(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtSetgammaramp(
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var type: D3dddiGammarampType = 0,
    public var anonymous: D3dkmtSetgammaramp0 = D3dkmtSetgammaramp0(),
    public var size: UInt = 0u,
)

public data class D3dkmtSetgammaramp0(
    public var pGammaRampRgb256x3x16: D3dddiGammaRampRgb256x3x16? = null,
    public var pGammaRampDXGI1: D3dddiGammaRampDxgi1? = null,
)

public data class D3dkmtSethwprotectionteardownrecovery(
    public var hAdapter: UInt = 0u,
    public var recovered: Bool = 0,
)

public data class D3dkmtSetqueuedlimit(
    public var hDevice: UInt = 0u,
    public var type: D3dkmtQueuedlimitType = 0,
    public var anonymous: D3dkmtSetqueuedlimit0 = D3dkmtSetqueuedlimit0(),
)

public data class D3dkmtSetqueuedlimit0(
    public var queuedPresentLimit: UInt = 0u,
    public var anonymous: D3dkmtSetqueuedlimit00 = D3dkmtSetqueuedlimit00(),
)

public data class D3dkmtSetqueuedlimit00(
    public var vidPnSourceId: UInt = 0u,
    public var queuedPendingFlipLimit: UInt = 0u,
)

public data class D3dkmtSetstablepowerstate(
    public var hAdapter: UInt = 0u,
    public var enabled: Bool = 0,
)

public data class D3dkmtSetsyncrefreshcountwaittarget(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var targetSyncRefreshCount: UInt = 0u,
)

public data class D3dkmtSetvidpnsourcehwprotection(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var hwProtected: Bool = 0,
)

public data class D3dkmtSetvidpnsourceowner(
    public var hDevice: UInt = 0u,
    public var pType: Int? = null,
    public var pVidPnSourceId: UInt? = null,
    public var vidPnSourceCount: UInt = 0u,
)

public data class D3dkmtSetvidpnsourceowner1(
    public var version0: D3dkmtSetvidpnsourceowner = D3dkmtSetvidpnsourceowner(),
    public var flags: D3dkmtVidpnsourceownerFlags = D3dkmtVidpnsourceownerFlags(),
)

public data class D3dkmtSetvidpnsourceowner2(
    public var version1: D3dkmtSetvidpnsourceowner1 = D3dkmtSetvidpnsourceowner1(),
    public var pVidPnSourceNtHandles: Int? = null,
)

public data class D3dkmtSetColorspaceTransform(
    public var adapterLuid: Luid = Luid(),
    public var vidPnTargetId: UInt = 0u,
    public var type: D3dddiGammarampType = 0,
    public var size: UInt = 0u,
    public var anonymous: D3dkmtSetColorspaceTransform0 = D3dkmtSetColorspaceTransform0(),
)

public data class D3dkmtSetColorspaceTransform0(
    public var pColorSpaceTransform: D3dkmdt3x4ColorspaceTransform? = null,
)

public data class D3dkmtSharedprimarylocknotification(
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var lockRect: Rectl = Rectl(),
)

public data class D3dkmtSharedprimaryunlocknotification(
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
)

public data class D3dkmtShareobjectwithhost(
    public var hDevice: UInt = 0u,
    public var hObject: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var hVailProcessNtHandle: ULong = 0uL,
)

public data class D3dkmtSignalsynchronizationobject(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobject) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class D3dkmtSignalsynchronizationobject2(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var anonymous: D3dkmtSignalsynchronizationobject20 = D3dkmtSignalsynchronizationobject20(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobject2) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        if (this.flags != other.flags) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class D3dkmtSignalsynchronizationobject20(
    public var fence: D3dkmtSignalsynchronizationobject200 = D3dkmtSignalsynchronizationobject200(),
    public var cpuEventHandle: Handle = null,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobject20) return false
        if (this.fence != other.fence) return false
        if (this.cpuEventHandle != other.cpuEventHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fence.hashCode()
        result = 31 * result + this.cpuEventHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtSignalsynchronizationobject200(
    public var fenceValue: ULong = 0uL,
)

public data class D3dkmtSignalsynchronizationobjectfromcpu(
    public var hDevice: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var fenceValueArray: ULong? = null,
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
)

public data class D3dkmtSignalsynchronizationobjectfromgpu(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var anonymous: D3dkmtSignalsynchronizationobjectfromgpu0 = D3dkmtSignalsynchronizationobjectfromgpu0(),
)

public data class D3dkmtSignalsynchronizationobjectfromgpu0(
    public var monitoredFenceValueArray: ULong? = null,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromgpu0) return false
        if (this.monitoredFenceValueArray != other.monitoredFenceValueArray) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitoredFenceValueArray.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtSignalsynchronizationobjectfromgpu2(
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContextArray: UInt? = null,
    public var anonymous: D3dkmtSignalsynchronizationobjectfromgpu20 = D3dkmtSignalsynchronizationobjectfromgpu20(),
)

public data class D3dkmtSignalsynchronizationobjectfromgpu20(
    public var fenceValue: ULong = 0uL,
    public var cpuEventHandle: Handle = null,
    public var monitoredFenceValueArray: ULong? = null,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromgpu20) return false
        if (this.fenceValue != other.fenceValue) return false
        if (this.cpuEventHandle != other.cpuEventHandle) return false
        if (this.monitoredFenceValueArray != other.monitoredFenceValueArray) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fenceValue.hashCode()
        result = 31 * result + this.cpuEventHandle.hashCode()
        result = 31 * result + this.monitoredFenceValueArray.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtStandardallocationExistingheap(
    public var size: Int = 0,
)

public data class D3dkmtSubmitcommand(
    public var commands: ULong = 0uL,
    public var commandLength: UInt = 0u,
    public var flags: D3dkmtSubmitcommandflags = D3dkmtSubmitcommandflags(),
    public var presentHistoryToken: ULong = 0uL,
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var numPrimaries: UInt = 0u,
    public var writtenPrimaries: UIntArray = UIntArray(16),
    public var numHistoryBuffers: UInt = 0u,
    public var historyBufferArray: UInt? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSubmitcommand) return false
        if (this.commands != other.commands) return false
        if (this.commandLength != other.commandLength) return false
        if (this.flags != other.flags) return false
        if (this.presentHistoryToken != other.presentHistoryToken) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.numPrimaries != other.numPrimaries) return false
        if (!this.writtenPrimaries.contentEquals(other.writtenPrimaries)) return false
        if (this.numHistoryBuffers != other.numHistoryBuffers) return false
        if (this.historyBufferArray != other.historyBufferArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commands.hashCode()
        result = 31 * result + this.commandLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentHistoryToken.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.numPrimaries.hashCode()
        result = 31 * result + this.writtenPrimaries.contentHashCode()
        result = 31 * result + this.numHistoryBuffers.hashCode()
        result = 31 * result + this.historyBufferArray.hashCode()
        return result
    }
}

public data class D3dkmtSubmitcommandflags(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtSubmitcommandtohwqueue(
    public var hHwQueue: UInt = 0u,
    public var hwQueueProgressFenceId: ULong = 0uL,
    public var commandBuffer: ULong = 0uL,
    public var commandLength: UInt = 0u,
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var numPrimaries: UInt = 0u,
    public var writtenPrimaries: UInt? = null,
)

public data class D3dkmtSubmitpresentblttohwqueue(
    public var hHwQueue: UInt = 0u,
    public var hwQueueProgressFenceId: ULong = 0uL,
    public var privatePresentData: D3dkmtPresent = D3dkmtPresent(),
)

public data class D3dkmtSubmitpresenttohwqueue(
    public var hHwQueues: UInt? = null,
    public var privatePresentData: D3dkmtPresent = D3dkmtPresent(),
)

public data class D3dkmtSubmitsignalsyncobjectstohwqueue(
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
    public var broadcastHwQueueCount: UInt = 0u,
    public var broadcastHwQueueArray: UInt? = null,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var fenceValueArray: ULong? = null,
)

public data class D3dkmtSubmitwaitforsyncobjectstohwqueue(
    public var hHwQueue: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var fenceValueArray: ULong? = null,
)

public data class D3dkmtSurfacecompletePresenthistorytoken(
    public var hLogicalSurface: ULong = 0uL,
)

public data class D3dkmtTdrdbgctrlEscape(
    public var tdrControl: D3dkmtTdrdbgctrltype = 0,
    public var anonymous: D3dkmtTdrdbgctrlEscape0 = D3dkmtTdrdbgctrlEscape0(),
)

public data class D3dkmtTdrdbgctrlEscape0(
    public var nodeOrdinal: UInt = 0u,
)

public data class D3dkmtTrackedworkloadSupport(
    public var physicalAdapterIndex: UInt = 0u,
    public var engineType: DxgkEngineType = 0,
    public var support: Bool = 0,
)

public data class D3dkmtTrimnotification(
    public var context: COpaquePointer? = null,
    public var flags: D3dddiTrimresidencysetFlags = D3dddiTrimresidencysetFlags(),
    public var numBytesToTrim: ULong = 0uL,
)

public data class D3dkmtTrimprocesscommitment(
    public var cbSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var flags: D3dkmtTrimprocesscommitmentFlags = D3dkmtTrimprocesscommitmentFlags(),
    public var decommitRequested: ULong = 0uL,
    public var numBytesDecommitted: ULong = 0uL,
)

public data class D3dkmtTrimprocesscommitmentFlags(
    public var anonymous: D3dkmtTrimprocesscommitmentFlags0 = D3dkmtTrimprocesscommitmentFlags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtTrimprocesscommitmentFlags0(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtUmdfilenameinfo(
    public var version: Kmtumdversion = 0,
    public var umdFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUmdfilenameinfo) return false
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

public data class D3dkmtUmdDriverVersion(
    public var driverVersion: Long = 0L,
)

public data class D3dkmtUnlock(
    public var hDevice: UInt = 0u,
    public var numAllocations: UInt = 0u,
    public var phAllocations: UInt? = null,
)

public data class D3dkmtUnlock2(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
)

public data class D3dkmtUnpindirectflipresources(
    public var hDevice: UInt = 0u,
    public var resourceCount: UInt = 0u,
    public var pResourceList: UInt? = null,
)

public data class D3dkmtUnregisterbudgetchangenotification(
    public var handle: COpaquePointer? = null,
)

public data class D3dkmtUnregistertrimnotification(
    public var handle: COpaquePointer? = null,
    public var callback: Pfnd3dkmtTrimnotificationcallback = null,
)

public data class D3dkmtUpdategpuvirtualaddress(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
    public var hFenceObject: UInt = 0u,
    public var numOperations: UInt = 0u,
    public var operations: D3dddiUpdategpuvirtualaddressOperation? = null,
    public var reserved0: Int = 0,
    public var reserved1: ULong = 0uL,
    public var fenceValue: ULong = 0uL,
    public var flags: D3dkmtUpdategpuvirtualaddress0 = D3dkmtUpdategpuvirtualaddress0(),
)

public data class D3dkmtUpdategpuvirtualaddress0(
    public var anonymous: D3dkmtUpdategpuvirtualaddress00 = D3dkmtUpdategpuvirtualaddress00(),
    public var value: UInt = 0u,
)

public data class D3dkmtUpdategpuvirtualaddress00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtUpdateoverlay(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var overlayInfo: D3dddiKerneloverlayinfo = D3dddiKerneloverlayinfo(),
)

public data class D3dkmtVadDesc(
    public var vadIndex: UInt = 0u,
    public var vadAddress: ULong = 0uL,
    public var numMappedRanges: UInt = 0u,
    public var vadType: UInt = 0u,
    public var startAddress: ULong = 0uL,
    public var endAddress: ULong = 0uL,
)

public data class D3dkmtVaRangeDesc(
    public var vadAddress: ULong = 0uL,
    public var vaRangeIndex: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var startAddress: ULong = 0uL,
    public var endAddress: ULong = 0uL,
    public var driverProtection: ULong = 0uL,
    public var ownerType: UInt = 0u,
    public var pOwner: ULong = 0uL,
    public var ownerOffset: ULong = 0uL,
    public var protection: UInt = 0u,
)

public data class D3dkmtVgpuinterfaceid(
    public var virtualGpuIntefaceId: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtVgpuinterfaceid) return false
        if (!this.virtualGpuIntefaceId.contentEquals(other.virtualGpuIntefaceId)) return false
        return true
    }

    override fun hashCode(): Int = this.virtualGpuIntefaceId.contentHashCode()
}

public data class D3dkmtVidmmEscape(
    public var type: D3dkmtVidmmescapetype = 0,
    public var anonymous: D3dkmtVidmmEscape0 = D3dkmtVidmmEscape0(),
)

public data class D3dkmtVidmmEscape0(
    public var setFault: D3dkmtVidmmEscape00 = D3dkmtVidmmEscape00(),
    public var evict: D3dkmtVidmmEscape01 = D3dkmtVidmmEscape01(),
    public var evictByNtHandle: D3dkmtVidmmEscape02 = D3dkmtVidmmEscape02(),
    public var getVads: D3dkmtVidmmEscape03 = D3dkmtVidmmEscape03(),
    public var setBudget: D3dkmtVidmmEscape04 = D3dkmtVidmmEscape04(),
    public var suspendProcess: D3dkmtVidmmEscape05 = D3dkmtVidmmEscape05(),
    public var resumeProcess: D3dkmtVidmmEscape06 = D3dkmtVidmmEscape06(),
    public var getBudget: D3dkmtVidmmEscape07 = D3dkmtVidmmEscape07(),
    public var setTrimIntervals: D3dkmtVidmmEscape08 = D3dkmtVidmmEscape08(),
    public var evictByCriteria: D3dkmtEvictionCriteria = D3dkmtEvictionCriteria(),
    public var wake: D3dkmtVidmmEscape09 = D3dkmtVidmmEscape09(),
    public var defrag: D3dkmtVidmmEscape010 = D3dkmtVidmmEscape010(),
    public var delayExecution: D3dkmtVidmmEscape011 = D3dkmtVidmmEscape011(),
    public var verifyIntegrity: D3dkmtVidmmEscape012 = D3dkmtVidmmEscape012(),
    public var delayedEvictionConfig: D3dkmtVidmmEscape013 = D3dkmtVidmmEscape013(),
)

public data class D3dkmtVidmmEscape010(
    public var operation: D3dkmtDefragEscapeOperation = 0,
    public var segmentId: UInt = 0u,
    public var totalCommitted: ULong = 0uL,
    public var totalFree: ULong = 0uL,
    public var largestGapBefore: ULong = 0uL,
    public var largestGapAfter: ULong = 0uL,
)

public data class D3dkmtVidmmEscape011(
    public var hPagingQueue: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var milliseconds: UInt = 0u,
    public var pagingFenceValue: ULong = 0uL,
)

public data class D3dkmtVidmmEscape013(
    public var timerValue: Long = 0L,
)

public data class D3dkmtVidmmEscape02(
    public var ntHandle: ULong = 0uL,
)

public data class D3dkmtVidmmEscape01(
    public var resourceHandle: UInt = 0u,
    public var allocationHandle: UInt = 0u,
    public var hProcess: Handle = null,
)

public data class D3dkmtVidmmEscape07(
    public var numBytesToTrim: ULong = 0uL,
)

public data class D3dkmtVidmmEscape03(
    public var anonymous: D3dkmtVidmmEscape030 = D3dkmtVidmmEscape030(),
    public var command: D3dkmtVadEscapeCommand = 0,
    public var status: Ntstatus = 0,
)

public data class D3dkmtVidmmEscape030(
    public var getNumVads: D3dkmtVidmmEscape0300 = D3dkmtVidmmEscape0300(),
    public var getVad: D3dkmtVadDesc = D3dkmtVadDesc(),
    public var getVadRange: D3dkmtVaRangeDesc = D3dkmtVaRangeDesc(),
    public var getGpuMmuCaps: D3dkmtGetGpummuCaps = D3dkmtGetGpummuCaps(),
    public var getPte: D3dkmtGetPte = D3dkmtGetPte(),
    public var getSegmentCaps: D3dkmtGetSegmentCaps = D3dkmtGetSegmentCaps(),
)

public data class D3dkmtVidmmEscape0300(
    public var numVads: UInt = 0u,
)

public data class D3dkmtVidmmEscape06(
    public var hProcess: Handle = null,
)

public data class D3dkmtVidmmEscape04(
    public var localMemoryBudget: ULong = 0uL,
    public var systemMemoryBudget: ULong = 0uL,
)

public data class D3dkmtVidmmEscape00(
    public var anonymous: D3dkmtVidmmEscape000 = D3dkmtVidmmEscape000(),
)

public data class D3dkmtVidmmEscape000(
    public var anonymous: D3dkmtVidmmEscape0000 = D3dkmtVidmmEscape0000(),
    public var value: UInt = 0u,
)

public data class D3dkmtVidmmEscape0000(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtVidmmEscape08(
    public var minTrimInterval: UInt = 0u,
    public var maxTrimInterval: UInt = 0u,
    public var idleTrimInterval: UInt = 0u,
)

public data class D3dkmtVidmmEscape05(
    public var hProcess: Handle = null,
    public var bAllowWakeOnSubmission: Bool = 0,
)

public data class D3dkmtVidmmEscape012(
    public var segmentId: UInt = 0u,
)

public data class D3dkmtVidmmEscape09(
    public var bFlush: Bool = 0,
)

public data class D3dkmtVidpnsourceownerFlags(
    public var anonymous: D3dkmtVidpnsourceownerFlags0 = D3dkmtVidpnsourceownerFlags0(),
)

public data class D3dkmtVidpnsourceownerFlags0(
    public var anonymous: D3dkmtVidpnsourceownerFlags00 = D3dkmtVidpnsourceownerFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtVidpnsourceownerFlags00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtVidschEscape(
    public var type: D3dkmtVidschescapetype = 0,
    public var anonymous: D3dkmtVidschEscape0 = D3dkmtVidschEscape0(),
    public var virtualRefreshRateControl: D3dkmtEscapeVirtualRefreshRate = D3dkmtEscapeVirtualRefreshRate(),
)

public data class D3dkmtVidschEscape0(
    public var preemptionControl: Bool = 0,
    public var enableContextDelay: Bool = 0,
    public var tdrControl2: D3dkmtVidschEscape00 = D3dkmtVidschEscape00(),
    public var suspendScheduler: Bool = 0,
    public var tdrControl: UInt = 0u,
    public var suspendTime: UInt = 0u,
    public var tdrLimit: D3dkmtVidschEscape01 = D3dkmtVidschEscape01(),
    public var pfnControl: D3dkmtEscapePfnControlCommand = 0,
)

public data class D3dkmtVidschEscape00(
    public var tdrControl: UInt = 0u,
    public var anonymous: D3dkmtVidschEscape000 = D3dkmtVidschEscape000(),
)

public data class D3dkmtVidschEscape000(
    public var nodeOrdinal: UInt = 0u,
)

public data class D3dkmtVidschEscape01(
    public var count: UInt = 0u,
    public var time: UInt = 0u,
)

public data class D3dkmtVirtualaddressflags(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtVirtualaddressinfo(
    public var virtualAddressFlags: D3dkmtVirtualaddressflags = D3dkmtVirtualaddressflags(),
)

public data class D3dkmtWaitforidle(
    public var hDevice: UInt = 0u,
)

public data class D3dkmtWaitforsynchronizationobject(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobject) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        return result
    }
}

public data class D3dkmtWaitforsynchronizationobject2(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
    public var anonymous: D3dkmtWaitforsynchronizationobject20 = D3dkmtWaitforsynchronizationobject20(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobject2) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class D3dkmtWaitforsynchronizationobject20(
    public var fence: D3dkmtWaitforsynchronizationobject200 = D3dkmtWaitforsynchronizationobject200(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobject20) return false
        if (this.fence != other.fence) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fence.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtWaitforsynchronizationobject200(
    public var fenceValue: ULong = 0uL,
)

public data class D3dkmtWaitforsynchronizationobjectfromcpu(
    public var hDevice: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var fenceValueArray: ULong? = null,
    public var hAsyncEvent: Handle = null,
    public var flags: D3dddiWaitforsynchronizationobjectfromcpuFlags = D3dddiWaitforsynchronizationobjectfromcpuFlags(),
)

public data class D3dkmtWaitforsynchronizationobjectfromgpu(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UInt? = null,
    public var anonymous: D3dkmtWaitforsynchronizationobjectfromgpu0 = D3dkmtWaitforsynchronizationobjectfromgpu0(),
)

public data class D3dkmtWaitforsynchronizationobjectfromgpu0(
    public var monitoredFenceValueArray: ULong? = null,
    public var fenceValue: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobjectfromgpu0) return false
        if (this.monitoredFenceValueArray != other.monitoredFenceValueArray) return false
        if (this.fenceValue != other.fenceValue) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitoredFenceValueArray.hashCode()
        result = 31 * result + this.fenceValue.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtWaitforverticalblankevent(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
)

public data class D3dkmtWaitforverticalblankevent2(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var numObjects: UInt = 0u,
    public var objectHandleArray: IntArray = IntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforverticalblankevent2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.numObjects != other.numObjects) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.numObjects.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        return result
    }
}

public data class D3dkmtWddm12Caps(
    public var preemptionCaps: D3dkmdtPreemptionCaps = D3dkmdtPreemptionCaps(),
    public var anonymous: D3dkmtWddm12Caps0 = D3dkmtWddm12Caps0(),
)

public data class D3dkmtWddm12Caps0(
    public var anonymous: D3dkmtWddm12Caps00 = D3dkmtWddm12Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm12Caps00(
    public var bitfield: UInt = 0u,
)
