@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECTL

public data class D3DKMT_OUTPUTDUPLPRESENTFLAGS(public var Anonymous: D3DKMT_OUTPUTDUPLPRESENTFLAGS_0 = D3DKMT_OUTPUTDUPLPRESENTFLAGS_0())

public data class D3DKMT_OUTPUTDUPLPRESENTFLAGS_0(public var Anonymous: D3DKMT_OUTPUTDUPLPRESENTFLAGS_0_0 = D3DKMT_OUTPUTDUPLPRESENTFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_OUTPUTDUPLPRESENTFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_OUTPUTDUPLPRESENTTOHWQUEUE(
    public var hSource: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var BroadcastHwQueueCount: UInt = 0u,
    public var hHwQueues: Long = 0L,
    public var PresentRegions: D3DKMT_PRESENT_RGNS = D3DKMT_PRESENT_RGNS(),
    public var Flags: D3DKMT_OUTPUTDUPLPRESENTFLAGS = D3DKMT_OUTPUTDUPLPRESENTFLAGS(),
    public var hIndirectHwQueue: UInt = 0u,
)

public data class D3DKMT_OUTPUTDUPL_FRAMEINFO(
    public var LastPresentTime: Long = 0L,
    public var LastMouseUpdateTime: Long = 0L,
    public var AccumulatedFrames: UInt = 0u,
    public var RectsCoalesced: BOOL = 0,
    public var ProtectedContentMaskedOut: BOOL = 0,
    public var PointerPosition: D3DKMT_OUTPUTDUPL_POINTER_POSITION = D3DKMT_OUTPUTDUPL_POINTER_POSITION(),
    public var TotalMetadataBufferSize: UInt = 0u,
    public var PointerShapeBufferSize: UInt = 0u,
)

public data class D3DKMT_OUTPUTDUPL_GET_FRAMEINFO(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var FrameInfo: D3DKMT_OUTPUTDUPL_FRAMEINFO = D3DKMT_OUTPUTDUPL_FRAMEINFO(),
)

public data class D3DKMT_OUTPUTDUPL_GET_POINTER_SHAPE_DATA(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var BufferSizeSupplied: UInt = 0u,
    public var pShapeBuffer: Long = 0L,
    public var BufferSizeRequired: UInt = 0u,
    public var ShapeInfo: D3DKMT_OUTDUPL_POINTER_SHAPE_INFO = D3DKMT_OUTDUPL_POINTER_SHAPE_INFO(),
)

public data class D3DKMT_OUTPUTDUPL_KEYEDMUTEX(public var hSharedSurfaceNt: HANDLE = 0L)

public data class D3DKMT_OUTPUTDUPL_METADATA(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Type: D3DKMT_OUTPUTDUPL_METADATATYPE = 0,
    public var BufferSizeSupplied: UInt = 0u,
    public var pBuffer: Long = 0L,
    public var BufferSizeRequired: UInt = 0u,
)

public data class D3DKMT_OUTPUTDUPL_POINTER_POSITION(public var Position: POINT = POINT(), public var Visible: BOOL = 0)

public data class D3DKMT_OUTPUTDUPL_RELEASE_FRAME(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var NextKeyMutexIdx: UInt = 0u,
)

public data class D3DKMT_OUTPUTDUPL_SNAPSHOT(
    public var Size: UInt = 0u,
    public var SessionProcessCount: UInt = 0u,
    public var SessionActiveConnectionsCount: UInt = 0u,
    public var NumVidPnSources: UInt = 0u,
    public var NumOutputDuplContexts: UInt = 0u,
    public var Padding: UInt = 0u,
    public var OutputDuplDebugInfos: List<OUTPUTDUPL_CONTEXT_DEBUG_INFO> = List(1) { OUTPUTDUPL_CONTEXT_DEBUG_INFO() },
)

public data class D3DKMT_PAGE_TABLE_LEVEL_DESC(
    public var IndexBitCount: UInt = 0u,
    public var IndexMask: ULong = 0uL,
    public var IndexShift: ULong = 0uL,
    public var LowerLevelsMask: ULong = 0uL,
    public var EntryCoverageInPages: ULong = 0uL,
)

public data class D3DKMT_PANELFITTER_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_PARAVIRTUALIZATION(public var SecureContainer: Boolean = false)

public data class D3DKMT_PHYSICAL_ADAPTER_COUNT(public var Count: UInt = 0u)

public data class D3DKMT_PINDIRECTFLIPRESOURCES(
    public var hDevice: UInt = 0u,
    public var ResourceCount: UInt = 0u,
    public var pResourceList: Long = 0L,
)

public data class D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS(public var Anonymous: D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS_0 = D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS_0())

public data class D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS_0(public var Anonymous: D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS_0_0 = D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS(public var Anonymous: D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS_0 = D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS_0())

public data class D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS_0(public var Anonymous: D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS_0_0 = D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_PLANE_SPECIFIC_OUTPUT_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_POLLDISPLAYCHILDREN(public var hAdapter: UInt = 0u, public var _bitfield: UInt = 0u)

public class D3DKMT_PRESENT(
    public var Anonymous1: D3DKMT_PRESENT_0 = D3DKMT_PRESENT_0(),
    public var hWindow: HWND = 0L,
    public var VidPnSourceId: UInt = 0u,
    public var hSource: UInt = 0u,
    public var hDestination: UInt = 0u,
    public var Color: UInt = 0u,
    public var DstRect: RECT = RECT(),
    public var SrcRect: RECT = RECT(),
    public var SubRectCnt: UInt = 0u,
    public var pSrcSubRects: Long = 0L,
    public var PresentCount: UInt = 0u,
    public var FlipInterval: D3DDDI_FLIPINTERVAL_TYPE = 0,
    public var Flags: D3DKMT_PRESENTFLAGS = D3DKMT_PRESENTFLAGS(),
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var PresentLimitSemaphore: HANDLE = 0L,
    public var PresentHistoryToken: D3DKMT_PRESENTHISTORYTOKEN = D3DKMT_PRESENTHISTORYTOKEN(),
    public var pPresentRegions: Long = 0L,
    public var Anonymous2: D3DKMT_PRESENT_1 = D3DKMT_PRESENT_1(),
    public var Duration: UInt = 0u,
    public var BroadcastSrcAllocation: Long = 0L,
    public var BroadcastDstAllocation: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var bOptimizeForComposition: Boolean = false,
)

public data class D3DKMT_PRESENT_0(public var hDevice: UInt = 0u, public var hContext: UInt = 0u)

public data class D3DKMT_PRESENT_1(public var hAdapter: UInt = 0u, public var hIndirectContext: UInt = 0u)

public data class D3DKMT_PRESENTFLAGS(public var Anonymous: D3DKMT_PRESENTFLAGS_0 = D3DKMT_PRESENTFLAGS_0())

public data class D3DKMT_PRESENTFLAGS_0(public var Anonymous: D3DKMT_PRESENTFLAGS_0_0 = D3DKMT_PRESENTFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_PRESENTFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_PRESENTHISTORYTOKEN(
    public var Model: D3DKMT_PRESENT_MODEL = 0,
    public var TokenSize: UInt = 0u,
    public var CompositionBindingId: ULong = 0uL,
    public var Token: D3DKMT_PRESENTHISTORYTOKEN_0 = D3DKMT_PRESENTHISTORYTOKEN_0(),
)

public data class D3DKMT_PRESENTHISTORYTOKEN_0(
    public var Flip: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN(),
    public var Blt: D3DKMT_BLTMODEL_PRESENTHISTORYTOKEN = D3DKMT_BLTMODEL_PRESENTHISTORYTOKEN(),
    public var VistaBlt: ULong = 0uL,
    public var Gdi: D3DKMT_GDIMODEL_PRESENTHISTORYTOKEN = D3DKMT_GDIMODEL_PRESENTHISTORYTOKEN(),
    public var Fence: D3DKMT_FENCE_PRESENTHISTORYTOKEN = D3DKMT_FENCE_PRESENTHISTORYTOKEN(),
    public var GdiSysMem: D3DKMT_GDIMODEL_SYSMEM_PRESENTHISTORYTOKEN = D3DKMT_GDIMODEL_SYSMEM_PRESENTHISTORYTOKEN(),
    public var Composition: D3DKMT_COMPOSITION_PRESENTHISTORYTOKEN = D3DKMT_COMPOSITION_PRESENTHISTORYTOKEN(),
    public var FlipManager: D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN = D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN(),
    public var SurfaceComplete: D3DKMT_SURFACECOMPLETE_PRESENTHISTORYTOKEN = D3DKMT_SURFACECOMPLETE_PRESENTHISTORYTOKEN(),
)

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY(
    public var Anonymous: D3DKMT_PRESENT_MULTIPLANE_OVERLAY_0 = D3DKMT_PRESENT_MULTIPLANE_OVERLAY_0(),
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var VidPnSourceId: UInt = 0u,
    public var PresentCount: UInt = 0u,
    public var FlipInterval: D3DDDI_FLIPINTERVAL_TYPE = 0,
    public var Flags: D3DKMT_PRESENTFLAGS = D3DKMT_PRESENTFLAGS(),
    public var PresentPlaneCount: UInt = 0u,
    public var pPresentPlanes: Long = 0L,
    public var Duration: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_PRESENT_MULTIPLANE_OVERLAY) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.BroadcastContextCount != other.BroadcastContextCount) return false
        if (!this.BroadcastContext.contentEquals(other.BroadcastContext)) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        if (this.PresentCount != other.PresentCount) return false
        if (this.FlipInterval != other.FlipInterval) return false
        if (this.Flags != other.Flags) return false
        if (this.PresentPlaneCount != other.PresentPlaneCount) return false
        if (this.pPresentPlanes != other.pPresentPlanes) return false
        if (this.Duration != other.Duration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.BroadcastContextCount.hashCode()
        result = 31 * result + this.BroadcastContext.contentHashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        result = 31 * result + this.PresentCount.hashCode()
        result = 31 * result + this.FlipInterval.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.PresentPlaneCount.hashCode()
        result = 31 * result + this.pPresentPlanes.hashCode()
        result = 31 * result + this.Duration.hashCode()
        return result
    }
}

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY_0(public var hDevice: UInt = 0u, public var hContext: UInt = 0u)

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY2(
    public var hAdapter: UInt = 0u,
    public var Anonymous: D3DKMT_PRESENT_MULTIPLANE_OVERLAY2_0 = D3DKMT_PRESENT_MULTIPLANE_OVERLAY2_0(),
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var VidPnSourceId: UInt = 0u,
    public var PresentCount: UInt = 0u,
    public var FlipInterval: D3DDDI_FLIPINTERVAL_TYPE = 0,
    public var Flags: D3DKMT_PRESENTFLAGS = D3DKMT_PRESENTFLAGS(),
    public var PresentPlaneCount: UInt = 0u,
    public var pPresentPlanes: Long = 0L,
    public var Duration: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_PRESENT_MULTIPLANE_OVERLAY2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.BroadcastContextCount != other.BroadcastContextCount) return false
        if (!this.BroadcastContext.contentEquals(other.BroadcastContext)) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        if (this.PresentCount != other.PresentCount) return false
        if (this.FlipInterval != other.FlipInterval) return false
        if (this.Flags != other.Flags) return false
        if (this.PresentPlaneCount != other.PresentPlaneCount) return false
        if (this.pPresentPlanes != other.pPresentPlanes) return false
        if (this.Duration != other.Duration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.BroadcastContextCount.hashCode()
        result = 31 * result + this.BroadcastContext.contentHashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        result = 31 * result + this.PresentCount.hashCode()
        result = 31 * result + this.FlipInterval.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.PresentPlaneCount.hashCode()
        result = 31 * result + this.pPresentPlanes.hashCode()
        result = 31 * result + this.Duration.hashCode()
        return result
    }
}

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY2_0(public var hDevice: UInt = 0u, public var hContext: UInt = 0u)

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY3(
    public var hAdapter: UInt = 0u,
    public var ContextCount: UInt = 0u,
    public var pContextList: Long = 0L,
    public var VidPnSourceId: UInt = 0u,
    public var PresentCount: UInt = 0u,
    public var Flags: D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS = D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS(),
    public var PresentPlaneCount: UInt = 0u,
    public var ppPresentPlanes: Long = 0L,
    public var pPostComposition: Long = 0L,
    public var Duration: UInt = 0u,
    public var HDRMetaDataType: D3DDDI_HDR_METADATA_TYPE = 0,
    public var HDRMetaDataSize: UInt = 0u,
    public var pHDRMetaData: Long = 0L,
    public var BoostRefreshRateMultiplier: UInt = 0u,
)

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS(public var Anonymous: D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS_0 = D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS_0())

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS_0(public var Anonymous: D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS_0_0 = D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_PRESENT_MULTIPLANE_OVERLAY_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_PRESENT_REDIRECTED(
    public var hSyncObj: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var WaitedFenceValue: ULong = 0uL,
    public var PresentHistoryToken: D3DKMT_PRESENTHISTORYTOKEN = D3DKMT_PRESENTHISTORYTOKEN(),
    public var Flags: D3DKMT_PRESENT_REDIRECTED_FLAGS = D3DKMT_PRESENT_REDIRECTED_FLAGS(),
    public var hSource: UInt = 0u,
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
)

public data class D3DKMT_PRESENT_REDIRECTED_FLAGS(public var Anonymous: D3DKMT_PRESENT_REDIRECTED_FLAGS_0 = D3DKMT_PRESENT_REDIRECTED_FLAGS_0())

public data class D3DKMT_PRESENT_REDIRECTED_FLAGS_0(public var Anonymous: D3DKMT_PRESENT_REDIRECTED_FLAGS_0_0 = D3DKMT_PRESENT_REDIRECTED_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_PRESENT_REDIRECTED_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_PRESENT_RGNS(
    public var DirtyRectCount: UInt = 0u,
    public var pDirtyRects: Long = 0L,
    public var MoveRectCount: UInt = 0u,
    public var pMoveRects: Long = 0L,
)

public data class D3DKMT_PRESENT_STATS(
    public var PresentCount: UInt = 0u,
    public var PresentRefreshCount: UInt = 0u,
    public var SyncRefreshCount: UInt = 0u,
    public var SyncQPCTime: Long = 0L,
    public var SyncGPUTime: Long = 0L,
)

public data class D3DKMT_PRESENT_STATS_DWM(
    public var PresentCount: UInt = 0u,
    public var PresentRefreshCount: UInt = 0u,
    public var PresentQPCTime: Long = 0L,
    public var SyncRefreshCount: UInt = 0u,
    public var SyncQPCTime: Long = 0L,
    public var CustomPresentDuration: UInt = 0u,
)

public data class D3DKMT_PRESENT_STATS_DWM2(
    public var cbSize: UInt = 0u,
    public var PresentCount: UInt = 0u,
    public var PresentRefreshCount: UInt = 0u,
    public var PresentQPCTime: Long = 0L,
    public var SyncRefreshCount: UInt = 0u,
    public var SyncQPCTime: Long = 0L,
    public var CustomPresentDuration: UInt = 0u,
    public var VirtualSyncRefreshCount: UInt = 0u,
    public var VirtualSyncQPCTime: Long = 0L,
)

public data class D3DKMT_PROCESS_VERIFIER_OPTION(
    public var hProcess: HANDLE = 0L,
    public var Type: D3DKMT_PROCESS_VERIFIER_OPTION_TYPE = 0,
    public var Mode: D3DKMT_VERIFIER_OPTION_MODE = 0,
    public var Data: D3DKMT_PROCESS_VERIFIER_OPTION_DATA = D3DKMT_PROCESS_VERIFIER_OPTION_DATA(),
)

public data class D3DKMT_PROCESS_VERIFIER_OPTION_DATA(public var VidMmFlags: D3DKMT_PROCESS_VERIFIER_VIDMM_FLAGS = D3DKMT_PROCESS_VERIFIER_VIDMM_FLAGS(), public var VidMmRestrictBudget: D3DKMT_PROCESS_VERIFIER_VIDMM_RESTRICT_BUDGET = D3DKMT_PROCESS_VERIFIER_VIDMM_RESTRICT_BUDGET())

public data class D3DKMT_PROCESS_VERIFIER_VIDMM_FLAGS(public var Anonymous: D3DKMT_PROCESS_VERIFIER_VIDMM_FLAGS_0 = D3DKMT_PROCESS_VERIFIER_VIDMM_FLAGS_0(), public var Value: UInt = 0u)

public data class D3DKMT_PROCESS_VERIFIER_VIDMM_FLAGS_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_PROCESS_VERIFIER_VIDMM_RESTRICT_BUDGET(public var LocalBudget: ULong = 0uL, public var NonLocalBudget: ULong = 0uL)

public data class D3DKMT_QUERYADAPTERINFO(
    public var hAdapter: UInt = 0u,
    public var Type: KMTQUERYADAPTERINFOTYPE = 0,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
)

public data class D3DKMT_QUERYALLOCATIONRESIDENCY(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: Long = 0L,
    public var AllocationCount: UInt = 0u,
    public var pResidencyStatus: Long = 0L,
)

public data class D3DKMT_QUERYCLOCKCALIBRATION(
    public var hAdapter: UInt = 0u,
    public var NodeOrdinal: UInt = 0u,
    public var PhysicalAdapterIndex: UInt = 0u,
    public var ClockData: DXGK_GPUCLOCKDATA = DXGK_GPUCLOCKDATA(),
)

public data class D3DKMT_QUERYFSEBLOCK(
    public var AdapterLuid: LUID = LUID(),
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Flags: D3DKMT_QUERYFSEBLOCKFLAGS = D3DKMT_QUERYFSEBLOCKFLAGS(),
)

public data class D3DKMT_QUERYFSEBLOCKFLAGS(public var Anonymous: D3DKMT_QUERYFSEBLOCKFLAGS_0 = D3DKMT_QUERYFSEBLOCKFLAGS_0(), public var Value: UInt = 0u)

public data class D3DKMT_QUERYFSEBLOCKFLAGS_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_QUERYPROCESSOFFERINFO(
    public var cbSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var DecommitUniqueness: ULong = 0uL,
    public var DecommittableBytes: ULong = 0uL,
)

public data class D3DKMT_QUERYPROTECTEDSESSIONINFOFROMNTHANDLE(
    public var hNtHandle: HANDLE = 0L,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
)

public data class D3DKMT_QUERYPROTECTEDSESSIONSTATUS(public var hHandle: UInt = 0u, public var Status: D3DKMT_PROTECTED_SESSION_STATUS = 0)

public data class D3DKMT_QUERYREMOTEVIDPNSOURCEFROMGDIDISPLAYNAME(public var DeviceName: UShortArray = UShortArray(32), public var VidPnSourceId: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYREMOTEVIDPNSOURCEFROMGDIDISPLAYNAME) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceName.contentHashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        return result
    }
}

public data class D3DKMT_QUERYRESOURCEINFO(
    public var hDevice: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var TotalPrivateDriverDataSize: UInt = 0u,
    public var ResourcePrivateDriverDataSize: UInt = 0u,
    public var NumAllocations: UInt = 0u,
)

public data class D3DKMT_QUERYRESOURCEINFOFROMNTHANDLE(
    public var hDevice: UInt = 0u,
    public var hNtHandle: HANDLE = 0L,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var TotalPrivateDriverDataSize: UInt = 0u,
    public var ResourcePrivateDriverDataSize: UInt = 0u,
    public var NumAllocations: UInt = 0u,
)

public data class D3DKMT_QUERYSTATISTICS(
    public var Type: D3DKMT_QUERYSTATISTICS_TYPE = 0,
    public var AdapterLuid: LUID = LUID(),
    public var hProcess: HANDLE = 0L,
    public var QueryResult: D3DKMT_QUERYSTATISTICS_RESULT = D3DKMT_QUERYSTATISTICS_RESULT(),
    public var Anonymous: D3DKMT_QUERYSTATISTICS_0 = D3DKMT_QUERYSTATISTICS_0(),
)

public class D3DKMT_QUERYSTATISTICS_0(
    public var QuerySegment: D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT = D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT(),
    public var QueryProcessSegment: D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT = D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT(),
    public var QueryProcessSegmentGroup: D3DKMT_MEMORY_SEGMENT_GROUP = 0,
    public var QueryNode: D3DKMT_QUERYSTATISTICS_QUERY_NODE = D3DKMT_QUERYSTATISTICS_QUERY_NODE(),
    public var QueryProcessNode: D3DKMT_QUERYSTATISTICS_QUERY_NODE = D3DKMT_QUERYSTATISTICS_QUERY_NODE(),
    public var QueryVidPnSource: D3DKMT_QUERYSTATISTICS_QUERY_VIDPNSOURCE = D3DKMT_QUERYSTATISTICS_QUERY_VIDPNSOURCE(),
    public var QueryProcessVidPnSource: D3DKMT_QUERYSTATISTICS_QUERY_VIDPNSOURCE = D3DKMT_QUERYSTATISTICS_QUERY_VIDPNSOURCE(),
    public var QueryPhysAdapter: D3DKMT_QUERYSTATISTICS_QUERY_PHYSICAL_ADAPTER = D3DKMT_QUERYSTATISTICS_QUERY_PHYSICAL_ADAPTER(),
    public var QueryAdapter2: D3DKMT_QUERYSTATISTICS_QUERY_ADAPTER2 = D3DKMT_QUERYSTATISTICS_QUERY_ADAPTER2(),
    public var QuerySegment2: D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT2 = D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT2(),
    public var QueryProcessAdapter2: D3DKMT_QUERYSTATISTICS_QUERY_ADAPTER2 = D3DKMT_QUERYSTATISTICS_QUERY_ADAPTER2(),
    public var QueryProcessSegment2: D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT2 = D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT2(),
    public var QueryProcessSegmentGroup2: D3DKMT_QUERYSTATISTICS_QUERY_PROCESS_SEGMENT_GROUP2 = D3DKMT_QUERYSTATISTICS_QUERY_PROCESS_SEGMENT_GROUP2(),
    public var QuerySegmentUsage: D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT_USAGE = D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT_USAGE(),
    public var QuerySegmentGroupUsage: D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT_GROUP_USAGE = D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT_GROUP_USAGE(),
    public var QueryNode2: D3DKMT_QUERYSTATISTICS_QUERY_NODE2 = D3DKMT_QUERYSTATISTICS_QUERY_NODE2(),
    public var QueryProcessNode2: D3DKMT_QUERYSTATISTICS_QUERY_NODE2 = D3DKMT_QUERYSTATISTICS_QUERY_NODE2(),
)

public class D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION(
    public var NbSegments: UInt = 0u,
    public var NodeCount: UInt = 0u,
    public var VidPnSourceCount: UInt = 0u,
    public var VSyncEnabled: UInt = 0u,
    public var TdrDetectedCount: UInt = 0u,
    public var ZeroLengthDmaBuffers: Long = 0L,
    public var RestartedPeriod: ULong = 0uL,
    public var ReferenceDmaBuffer: D3DKMT_QUERYSTATSTICS_REFERENCE_DMA_BUFFER = D3DKMT_QUERYSTATSTICS_REFERENCE_DMA_BUFFER(),
    public var Renaming: D3DKMT_QUERYSTATSTICS_RENAMING = D3DKMT_QUERYSTATSTICS_RENAMING(),
    public var Preparation: D3DKMT_QUERYSTATSTICS_PREPRATION = D3DKMT_QUERYSTATSTICS_PREPRATION(),
    public var PagingFault: D3DKMT_QUERYSTATSTICS_PAGING_FAULT = D3DKMT_QUERYSTATSTICS_PAGING_FAULT(),
    public var PagingTransfer: D3DKMT_QUERYSTATSTICS_PAGING_TRANSFER = D3DKMT_QUERYSTATSTICS_PAGING_TRANSFER(),
    public var SwizzlingRange: D3DKMT_QUERYSTATSTICS_SWIZZLING_RANGE = D3DKMT_QUERYSTATSTICS_SWIZZLING_RANGE(),
    public var Locks: D3DKMT_QUERYSTATSTICS_LOCKS = D3DKMT_QUERYSTATSTICS_LOCKS(),
    public var Allocations: D3DKMT_QUERYSTATSTICS_ALLOCATIONS = D3DKMT_QUERYSTATSTICS_ALLOCATIONS(),
    public var Terminations: D3DKMT_QUERYSTATSTICS_TERMINATIONS = D3DKMT_QUERYSTATSTICS_TERMINATIONS(),
    public var Flags: D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS = D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS(),
    public var Reserved: ULongArray = ULongArray(7),
)

public data class D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS(public var Anonymous: D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS_0 = D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS_0())

public data class D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS_0(public var Anonymous: D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS_0_0 = D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS_0_0(), public var Value: ULong = 0uL)

public data class D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION_FLAGS_0_0(public var _bitfield: ULong = 0uL)

public data class D3DKMT_QUERYSTATISTICS_COMMITMENT_DATA(public var TotalBytesEvictedFromProcess: ULong = 0uL, public var BytesBySegmentPreference: ULongArray = ULongArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_COMMITMENT_DATA) return false
        if (this.TotalBytesEvictedFromProcess != other.TotalBytesEvictedFromProcess) return false
        if (!this.BytesBySegmentPreference.contentEquals(other.BytesBySegmentPreference)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TotalBytesEvictedFromProcess.hashCode()
        result = 31 * result + this.BytesBySegmentPreference.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_COUNTER(public var Count: UInt = 0u, public var Bytes: ULong = 0uL)

public data class D3DKMT_QUERYSTATISTICS_DMA_BUFFER(
    public var Size: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var AllocationListBytes: UInt = 0u,
    public var PatchLocationListBytes: UInt = 0u,
)

public data class D3DKMT_QUERYSTATISTICS_DMA_PACKET_TYPE_INFORMATION(
    public var PacketSubmited: UInt = 0u,
    public var PacketCompleted: UInt = 0u,
    public var PacketPreempted: UInt = 0u,
    public var PacketFaulted: UInt = 0u,
)

public data class D3DKMT_QUERYSTATISTICS_MEMORY(
    public var TotalBytesEvicted: ULong = 0uL,
    public var AllocsCommitted: UInt = 0u,
    public var AllocsResident: UInt = 0u,
)

public data class D3DKMT_QUERYSTATISTICS_MEMORY_USAGE(
    public var AllocatedBytes: ULong = 0uL,
    public var FreeBytes: ULong = 0uL,
    public var ZeroBytes: ULong = 0uL,
    public var ModifiedBytes: ULong = 0uL,
    public var StandbyBytes: ULong = 0uL,
)

public data class D3DKMT_QUERYSTATISTICS_NODE_INFORMATION(
    public var GlobalInformation: D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION(),
    public var SystemInformation: D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION(),
    public var NodePerfData: D3DKMT_NODE_PERFDATA = D3DKMT_NODE_PERFDATA(),
    public var Reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_NODE_INFORMATION) return false
        if (this.GlobalInformation != other.GlobalInformation) return false
        if (this.SystemInformation != other.SystemInformation) return false
        if (this.NodePerfData != other.NodePerfData) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GlobalInformation.hashCode()
        result = 31 * result + this.SystemInformation.hashCode()
        result = 31 * result + this.NodePerfData.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_PACKET_INFORMATION(public var QueuePacket: List<D3DKMT_QUERYSTATISTICS_QUEUE_PACKET_TYPE_INFORMATION> = List(8) { D3DKMT_QUERYSTATISTICS_QUEUE_PACKET_TYPE_INFORMATION() }, public var DmaPacket: List<D3DKMT_QUERYSTATISTICS_DMA_PACKET_TYPE_INFORMATION> = List(4) { D3DKMT_QUERYSTATISTICS_DMA_PACKET_TYPE_INFORMATION() })

public data class D3DKMT_QUERYSTATISTICS_PHYSICAL_ADAPTER_INFORMATION(
    public var AdapterPerfData: D3DKMT_ADAPTER_PERFDATA = D3DKMT_ADAPTER_PERFDATA(),
    public var AdapterPerfDataCaps: D3DKMT_ADAPTER_PERFDATACAPS = D3DKMT_ADAPTER_PERFDATACAPS(),
    public var GpuVersion: D3DKMT_GPUVERSION = D3DKMT_GPUVERSION(),
)

public data class D3DKMT_QUERYSTATISTICS_POLICY(
    public var PreferApertureForRead: ULongArray = ULongArray(5),
    public var PreferAperture: ULongArray = ULongArray(5),
    public var MemResetOnPaging: ULong = 0uL,
    public var RemovePagesFromWorkingSetOnPaging: ULong = 0uL,
    public var MigrationEnabled: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_POLICY) return false
        if (!this.PreferApertureForRead.contentEquals(other.PreferApertureForRead)) return false
        if (!this.PreferAperture.contentEquals(other.PreferAperture)) return false
        if (this.MemResetOnPaging != other.MemResetOnPaging) return false
        if (this.RemovePagesFromWorkingSetOnPaging != other.RemovePagesFromWorkingSetOnPaging) return false
        if (this.MigrationEnabled != other.MigrationEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PreferApertureForRead.contentHashCode()
        result = 31 * result + this.PreferAperture.contentHashCode()
        result = 31 * result + this.MemResetOnPaging.hashCode()
        result = 31 * result + this.RemovePagesFromWorkingSetOnPaging.hashCode()
        result = 31 * result + this.MigrationEnabled.hashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_PREEMPTION_INFORMATION(public var PreemptionCounter: UIntArray = UIntArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PREEMPTION_INFORMATION) return false
        if (!this.PreemptionCounter.contentEquals(other.PreemptionCounter)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.PreemptionCounter.contentHashCode()
    }
}

public data class D3DKMT_QUERYSTATISTICS_PROCESS_ADAPTER_INFORMATION(
    public var NbSegments: UInt = 0u,
    public var NodeCount: UInt = 0u,
    public var VidPnSourceCount: UInt = 0u,
    public var VirtualMemoryUsage: UInt = 0u,
    public var DmaBuffer: D3DKMT_QUERYSTATISTICS_DMA_BUFFER = D3DKMT_QUERYSTATISTICS_DMA_BUFFER(),
    public var CommitmentData: D3DKMT_QUERYSTATISTICS_COMMITMENT_DATA = D3DKMT_QUERYSTATISTICS_COMMITMENT_DATA(),
    public var _Policy: D3DKMT_QUERYSTATISTICS_POLICY = D3DKMT_QUERYSTATISTICS_POLICY(),
    public var ProcessInterferenceCounters: D3DKMT_QUERYSTATISTICS_PROCESS_INTERFERENCE_COUNTERS = D3DKMT_QUERYSTATISTICS_PROCESS_INTERFERENCE_COUNTERS(),
    public var ClientHint: D3DKMT_CLIENTHINT = 0,
)

public data class D3DKMT_QUERYSTATISTICS_PROCESS_INFORMATION(
    public var NodeCount: UInt = 0u,
    public var VidPnSourceCount: UInt = 0u,
    public var SystemMemory: D3DKMT_QUERYSTATISTICS_SYSTEM_MEMORY = D3DKMT_QUERYSTATISTICS_SYSTEM_MEMORY(),
    public var Reserved: ULongArray = ULongArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PROCESS_INFORMATION) return false
        if (this.NodeCount != other.NodeCount) return false
        if (this.VidPnSourceCount != other.VidPnSourceCount) return false
        if (this.SystemMemory != other.SystemMemory) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NodeCount.hashCode()
        result = 31 * result + this.VidPnSourceCount.hashCode()
        result = 31 * result + this.SystemMemory.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_PROCESS_INTERFERENCE_COUNTERS(public var InterferenceCount: ULongArray = ULongArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PROCESS_INTERFERENCE_COUNTERS) return false
        if (!this.InterferenceCount.contentEquals(other.InterferenceCount)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.InterferenceCount.contentHashCode()
    }
}

public data class D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION(
    public var RunningTime: Long = 0L,
    public var ContextSwitch: UInt = 0u,
    public var PreemptionStatistics: D3DKMT_QUERYSTATISTICS_PREEMPTION_INFORMATION = D3DKMT_QUERYSTATISTICS_PREEMPTION_INFORMATION(),
    public var PacketStatistics: D3DKMT_QUERYSTATISTICS_PACKET_INFORMATION = D3DKMT_QUERYSTATISTICS_PACKET_INFORMATION(),
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION) return false
        if (this.RunningTime != other.RunningTime) return false
        if (this.ContextSwitch != other.ContextSwitch) return false
        if (this.PreemptionStatistics != other.PreemptionStatistics) return false
        if (this.PacketStatistics != other.PacketStatistics) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RunningTime.hashCode()
        result = 31 * result + this.ContextSwitch.hashCode()
        result = 31 * result + this.PreemptionStatistics.hashCode()
        result = 31 * result + this.PacketStatistics.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_GROUP_INFORMATION(
    public var Budget: ULong = 0uL,
    public var Requested: ULong = 0uL,
    public var Usage: ULong = 0uL,
    public var Demoted: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_GROUP_INFORMATION) return false
        if (this.Budget != other.Budget) return false
        if (this.Requested != other.Requested) return false
        if (this.Usage != other.Usage) return false
        if (!this.Demoted.contentEquals(other.Demoted)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Budget.hashCode()
        result = 31 * result + this.Requested.hashCode()
        result = 31 * result + this.Usage.hashCode()
        result = 31 * result + this.Demoted.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_INFORMATION(
    public var BytesCommitted: ULong = 0uL,
    public var MaximumWorkingSet: ULong = 0uL,
    public var MinimumWorkingSet: ULong = 0uL,
    public var NbReferencedAllocationEvictedInPeriod: UInt = 0u,
    public var Padding: UInt = 0u,
    public var VideoMemory: D3DKMT_QUERYSTATISTICS_VIDEO_MEMORY = D3DKMT_QUERYSTATISTICS_VIDEO_MEMORY(),
    public var _Policy: D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_POLICY = D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_POLICY(),
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_INFORMATION) return false
        if (this.BytesCommitted != other.BytesCommitted) return false
        if (this.MaximumWorkingSet != other.MaximumWorkingSet) return false
        if (this.MinimumWorkingSet != other.MinimumWorkingSet) return false
        if (this.NbReferencedAllocationEvictedInPeriod != other.NbReferencedAllocationEvictedInPeriod) return false
        if (this.Padding != other.Padding) return false
        if (this.VideoMemory != other.VideoMemory) return false
        if (this._Policy != other._Policy) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BytesCommitted.hashCode()
        result = 31 * result + this.MaximumWorkingSet.hashCode()
        result = 31 * result + this.MinimumWorkingSet.hashCode()
        result = 31 * result + this.NbReferencedAllocationEvictedInPeriod.hashCode()
        result = 31 * result + this.Padding.hashCode()
        result = 31 * result + this.VideoMemory.hashCode()
        result = 31 * result + this._Policy.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_POLICY(public var UseMRU: ULong = 0uL)

public data class D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION(
    public var Frame: UInt = 0u,
    public var CancelledFrame: UInt = 0u,
    public var QueuedPresent: UInt = 0u,
    public var Padding: UInt = 0u,
    public var IsVSyncEnabled: ULong = 0uL,
    public var VSyncOnTotalTimeMs: ULong = 0uL,
    public var VSyncOffKeepPhaseTotalTimeMs: ULong = 0uL,
    public var VSyncOffNoPhaseTotalTimeMs: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION) return false
        if (this.Frame != other.Frame) return false
        if (this.CancelledFrame != other.CancelledFrame) return false
        if (this.QueuedPresent != other.QueuedPresent) return false
        if (this.Padding != other.Padding) return false
        if (this.IsVSyncEnabled != other.IsVSyncEnabled) return false
        if (this.VSyncOnTotalTimeMs != other.VSyncOnTotalTimeMs) return false
        if (this.VSyncOffKeepPhaseTotalTimeMs != other.VSyncOffKeepPhaseTotalTimeMs) return false
        if (this.VSyncOffNoPhaseTotalTimeMs != other.VSyncOffNoPhaseTotalTimeMs) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Frame.hashCode()
        result = 31 * result + this.CancelledFrame.hashCode()
        result = 31 * result + this.QueuedPresent.hashCode()
        result = 31 * result + this.Padding.hashCode()
        result = 31 * result + this.IsVSyncEnabled.hashCode()
        result = 31 * result + this.VSyncOnTotalTimeMs.hashCode()
        result = 31 * result + this.VSyncOffKeepPhaseTotalTimeMs.hashCode()
        result = 31 * result + this.VSyncOffNoPhaseTotalTimeMs.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_QUERY_ADAPTER2(public var PhysicalAdapterIndex: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_ADAPTER_INFORMATION2(public var PhysicalAdapterIndex: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_NODE(public var NodeId: UInt = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_NODE2(public var PhysicalAdapterIndex: UShort = 0u, public var NodeOrdinal: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_PHYSICAL_ADAPTER(public var PhysicalAdapterIndex: UInt = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_PROCESS_SEGMENT_GROUP2(public var PhysicalAdapterIndex: UShort = 0u, public var SegmentGroup: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT(public var SegmentId: UInt = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT2(public var PhysicalAdapterIndex: UShort = 0u, public var SegmentId: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT_GROUP_USAGE(public var PhysicalAdapterIndex: UShort = 0u, public var SegmentGroup: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_SEGMENT_USAGE(public var PhysicalAdapterIndex: UShort = 0u, public var SegmentId: UShort = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUERY_VIDPNSOURCE(public var VidPnSourceId: UInt = 0u)

public data class D3DKMT_QUERYSTATISTICS_QUEUE_PACKET_TYPE_INFORMATION(public var PacketSubmited: UInt = 0u, public var PacketCompleted: UInt = 0u)

public data class D3DKMT_QUERYSTATISTICS_RESULT(
    public var AdapterInformation: D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION = D3DKMT_QUERYSTATISTICS_ADAPTER_INFORMATION(),
    public var PhysAdapterInformation: D3DKMT_QUERYSTATISTICS_PHYSICAL_ADAPTER_INFORMATION = D3DKMT_QUERYSTATISTICS_PHYSICAL_ADAPTER_INFORMATION(),
    public var SegmentInformation: D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION = D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION(),
    public var NodeInformation: D3DKMT_QUERYSTATISTICS_NODE_INFORMATION = D3DKMT_QUERYSTATISTICS_NODE_INFORMATION(),
    public var VidPnSourceInformation: D3DKMT_QUERYSTATISTICS_VIDPNSOURCE_INFORMATION = D3DKMT_QUERYSTATISTICS_VIDPNSOURCE_INFORMATION(),
    public var ProcessInformation: D3DKMT_QUERYSTATISTICS_PROCESS_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_INFORMATION(),
    public var ProcessAdapterInformation: D3DKMT_QUERYSTATISTICS_PROCESS_ADAPTER_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_ADAPTER_INFORMATION(),
    public var ProcessSegmentInformation: D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_INFORMATION(),
    public var ProcessNodeInformation: D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_NODE_INFORMATION(),
    public var ProcessVidPnSourceInformation: D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION(),
    public var ProcessSegmentGroupInformation: D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_GROUP_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_GROUP_INFORMATION(),
    public var SegmentUsageInformation: D3DKMT_QUERYSTATISTICS_MEMORY_USAGE = D3DKMT_QUERYSTATISTICS_MEMORY_USAGE(),
    public var SegmentGroupUsageInformation: D3DKMT_QUERYSTATISTICS_MEMORY_USAGE = D3DKMT_QUERYSTATISTICS_MEMORY_USAGE(),
)

public data class D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION(
    public var CommitLimit: ULong = 0uL,
    public var BytesCommitted: ULong = 0uL,
    public var BytesResident: ULong = 0uL,
    public var Memory: D3DKMT_QUERYSTATISTICS_MEMORY = D3DKMT_QUERYSTATISTICS_MEMORY(),
    public var Aperture: UInt = 0u,
    public var TotalBytesEvictedByPriority: ULongArray = ULongArray(5),
    public var SystemMemoryEndAddress: ULong = 0uL,
    public var PowerFlags: D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION_0 = D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION_0(),
    public var SegmentProperties: D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION_1 = D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION_1(),
    public var Reserved: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION) return false
        if (this.CommitLimit != other.CommitLimit) return false
        if (this.BytesCommitted != other.BytesCommitted) return false
        if (this.BytesResident != other.BytesResident) return false
        if (this.Memory != other.Memory) return false
        if (this.Aperture != other.Aperture) return false
        if (!this.TotalBytesEvictedByPriority.contentEquals(other.TotalBytesEvictedByPriority)) return false
        if (this.SystemMemoryEndAddress != other.SystemMemoryEndAddress) return false
        if (this.PowerFlags != other.PowerFlags) return false
        if (this.SegmentProperties != other.SegmentProperties) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CommitLimit.hashCode()
        result = 31 * result + this.BytesCommitted.hashCode()
        result = 31 * result + this.BytesResident.hashCode()
        result = 31 * result + this.Memory.hashCode()
        result = 31 * result + this.Aperture.hashCode()
        result = 31 * result + this.TotalBytesEvictedByPriority.contentHashCode()
        result = 31 * result + this.SystemMemoryEndAddress.hashCode()
        result = 31 * result + this.PowerFlags.hashCode()
        result = 31 * result + this.SegmentProperties.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION_0(public var _bitfield: ULong = 0uL)

public data class D3DKMT_QUERYSTATISTICS_SEGMENT_INFORMATION_1(public var _bitfield: ULong = 0uL)

public data class D3DKMT_QUERYSTATISTICS_SYSTEM_MEMORY(
    public var BytesAllocated: ULong = 0uL,
    public var BytesReserved: ULong = 0uL,
    public var SmallAllocationBlocks: UInt = 0u,
    public var LargeAllocationBlocks: UInt = 0u,
    public var WriteCombinedBytesAllocated: ULong = 0uL,
    public var WriteCombinedBytesReserved: ULong = 0uL,
    public var CachedBytesAllocated: ULong = 0uL,
    public var CachedBytesReserved: ULong = 0uL,
    public var SectionBytesAllocated: ULong = 0uL,
    public var SectionBytesReserved: ULong = 0uL,
    public var BytesZeroed: ULong = 0uL,
)

public data class D3DKMT_QUERYSTATISTICS_VIDEO_MEMORY(
    public var AllocsCommitted: UInt = 0u,
    public var AllocsResidentInP: List<D3DKMT_QUERYSTATISTICS_COUNTER> = List(5) { D3DKMT_QUERYSTATISTICS_COUNTER() },
    public var AllocsResidentInNonPreferred: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var TotalBytesEvictedDueToPreparation: ULong = 0uL,
)

public data class D3DKMT_QUERYSTATISTICS_VIDPNSOURCE_INFORMATION(
    public var GlobalInformation: D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION(),
    public var SystemInformation: D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION = D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE_INFORMATION(),
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERYSTATISTICS_VIDPNSOURCE_INFORMATION) return false
        if (this.GlobalInformation != other.GlobalInformation) return false
        if (this.SystemInformation != other.SystemInformation) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GlobalInformation.hashCode()
        result = 31 * result + this.SystemInformation.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_QUERYSTATSTICS_ALLOCATIONS(
    public var Created: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var Destroyed: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var Opened: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var Closed: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var MigratedSuccess: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var MigratedFail: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var MigratedAbandoned: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
)

public data class D3DKMT_QUERYSTATSTICS_LOCKS(
    public var NbLocks: UInt = 0u,
    public var NbLocksWaitFlag: UInt = 0u,
    public var NbLocksDiscardFlag: UInt = 0u,
    public var NbLocksNoOverwrite: UInt = 0u,
    public var NbLocksNoReadSync: UInt = 0u,
    public var NbLocksLinearization: UInt = 0u,
    public var NbComplexLocks: UInt = 0u,
)

public class D3DKMT_QUERYSTATSTICS_PAGING_FAULT(
    public var Faults: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var FaultsFirstTimeAccess: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var FaultsReclaimed: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var FaultsMigration: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var FaultsIncorrectResource: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var FaultsLostContent: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var FaultsEvicted: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var AllocationsMEM_RESET: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var AllocationsUnresetSuccess: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var AllocationsUnresetFail: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var AllocationsUnresetSuccessRead: UInt = 0u,
    public var AllocationsUnresetFailRead: UInt = 0u,
    public var Evictions: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var EvictionsDueToPreparation: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var EvictionsDueToLock: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var EvictionsDueToClose: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var EvictionsDueToPurge: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var EvictionsDueToSuspendCPUAccess: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
)

public data class D3DKMT_QUERYSTATSTICS_PAGING_TRANSFER(
    public var BytesFilled: ULong = 0uL,
    public var BytesDiscarded: ULong = 0uL,
    public var BytesMappedIntoAperture: ULong = 0uL,
    public var BytesUnmappedFromAperture: ULong = 0uL,
    public var BytesTransferredFromMdlToMemory: ULong = 0uL,
    public var BytesTransferredFromMemoryToMdl: ULong = 0uL,
    public var BytesTransferredFromApertureToMemory: ULong = 0uL,
    public var BytesTransferredFromMemoryToAperture: ULong = 0uL,
)

public data class D3DKMT_QUERYSTATSTICS_PREPRATION(
    public var BroadcastStall: UInt = 0u,
    public var NbDMAPrepared: UInt = 0u,
    public var NbDMAPreparedLongPath: UInt = 0u,
    public var ImmediateHighestPreparationPass: UInt = 0u,
    public var AllocationsTrimmed: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
)

public data class D3DKMT_QUERYSTATSTICS_REFERENCE_DMA_BUFFER(
    public var NbCall: UInt = 0u,
    public var NbAllocationsReferenced: UInt = 0u,
    public var MaxNbAllocationsReferenced: UInt = 0u,
    public var NbNULLReference: UInt = 0u,
    public var NbWriteReference: UInt = 0u,
    public var NbRenamedAllocationsReferenced: UInt = 0u,
    public var NbIterationSearchingRenamedAllocation: UInt = 0u,
    public var NbLockedAllocationReferenced: UInt = 0u,
    public var NbAllocationWithValidPrepatchingInfoReferenced: UInt = 0u,
    public var NbAllocationWithInvalidPrepatchingInfoReferenced: UInt = 0u,
    public var NbDMABufferSuccessfullyPrePatched: UInt = 0u,
    public var NbPrimariesReferencesOverflow: UInt = 0u,
    public var NbAllocationWithNonPreferredResources: UInt = 0u,
    public var NbAllocationInsertedInMigrationTable: UInt = 0u,
)

public data class D3DKMT_QUERYSTATSTICS_RENAMING(
    public var NbAllocationsRenamed: UInt = 0u,
    public var NbAllocationsShrinked: UInt = 0u,
    public var NbRenamedBuffer: UInt = 0u,
    public var MaxRenamingListLength: UInt = 0u,
    public var NbFailuresDueToRenamingLimit: UInt = 0u,
    public var NbFailuresDueToCreateAllocation: UInt = 0u,
    public var NbFailuresDueToOpenAllocation: UInt = 0u,
    public var NbFailuresDueToLowResource: UInt = 0u,
    public var NbFailuresDueToNonRetiredLimit: UInt = 0u,
)

public data class D3DKMT_QUERYSTATSTICS_SWIZZLING_RANGE(public var NbRangesAcquired: UInt = 0u, public var NbRangesReleased: UInt = 0u)

public data class D3DKMT_QUERYSTATSTICS_TERMINATIONS(
    public var TerminatedShared: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var TerminatedNonShared: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var DestroyedShared: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
    public var DestroyedNonShared: D3DKMT_QUERYSTATISTICS_COUNTER = D3DKMT_QUERYSTATISTICS_COUNTER(),
)

public data class D3DKMT_QUERYVIDEOMEMORYINFO(
    public var hProcess: HANDLE = 0L,
    public var hAdapter: UInt = 0u,
    public var MemorySegmentGroup: D3DKMT_MEMORY_SEGMENT_GROUP = 0,
    public var Budget: ULong = 0uL,
    public var CurrentUsage: ULong = 0uL,
    public var CurrentReservation: ULong = 0uL,
    public var AvailableForReservation: ULong = 0uL,
    public var PhysicalAdapterIndex: UInt = 0u,
)

public data class D3DKMT_QUERYVIDPNEXCLUSIVEOWNERSHIP(
    public var hProcess: HANDLE = 0L,
    public var hWindow: HWND = 0L,
    public var VidPnSourceId: UInt = 0u,
    public var AdapterLuid: LUID = LUID(),
    public var OwnerType: D3DKMT_VIDPNSOURCEOWNER_TYPE = 0,
)

public data class D3DKMT_QUERY_ADAPTER_UNIQUE_GUID(public var AdapterUniqueGUID: UShortArray = UShortArray(40)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_QUERY_ADAPTER_UNIQUE_GUID) return false
        if (!this.AdapterUniqueGUID.contentEquals(other.AdapterUniqueGUID)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.AdapterUniqueGUID.contentHashCode()
    }
}

public data class D3DKMT_QUERY_DEVICE_IDS(public var PhysicalAdapterIndex: UInt = 0u, public var DeviceIds: D3DKMT_DEVICE_IDS = D3DKMT_DEVICE_IDS())

public data class D3DKMT_QUERY_GPUMMU_CAPS(public var PhysicalAdapterIndex: UInt = 0u, public var Caps: D3DKMT_GPUMMU_CAPS = D3DKMT_GPUMMU_CAPS())

public data class D3DKMT_QUERY_MIRACAST_DRIVER_TYPE(public var MiracastDriverType: D3DKMT_MIRACAST_DRIVER_TYPE = 0)

public data class D3DKMT_QUERY_PHYSICAL_ADAPTER_PNP_KEY(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var PnPKeyType: D3DKMT_PNP_KEY_TYPE = 0,
    public var pDest: PWSTR = 0L,
    public var pCchDest: Long = 0L,
)

public data class D3DKMT_QUERY_SCANOUT_CAPS(public var VidPnSourceId: UInt = 0u, public var Caps: UInt = 0u)

public data class D3DKMT_RECLAIMALLOCATIONS(
    public var hDevice: UInt = 0u,
    public var pResources: Long = 0L,
    public var HandleList: Long = 0L,
    public var pDiscarded: Long = 0L,
    public var NumAllocations: UInt = 0u,
)

public data class D3DKMT_RECLAIMALLOCATIONS2(
    public var hPagingQueue: UInt = 0u,
    public var NumAllocations: UInt = 0u,
    public var pResources: Long = 0L,
    public var HandleList: Long = 0L,
    public var Anonymous: D3DKMT_RECLAIMALLOCATIONS2_0 = D3DKMT_RECLAIMALLOCATIONS2_0(),
    public var PagingFenceValue: ULong = 0uL,
)

public data class D3DKMT_RECLAIMALLOCATIONS2_0(public var pDiscarded: Long = 0L, public var pResults: Long = 0L)

public data class D3DKMT_REGISTERBUDGETCHANGENOTIFICATION(
    public var hDevice: UInt = 0u,
    public var Callback: PFND3DKMT_BUDGETCHANGENOTIFICATIONCALLBACK = null,
    public var Context: Long = 0L,
    public var Handle: Long = 0L,
)

public data class D3DKMT_REGISTERTRIMNOTIFICATION(
    public var AdapterLuid: LUID = LUID(),
    public var hDevice: UInt = 0u,
    public var Callback: PFND3DKMT_TRIMNOTIFICATIONCALLBACK = null,
    public var Context: Long = 0L,
    public var Handle: Long = 0L,
)

public data class D3DKMT_RELEASEKEYEDMUTEX(
    public var hKeyedMutex: UInt = 0u,
    public var Key: ULong = 0uL,
    public var FenceValue: ULong = 0uL,
)

public data class D3DKMT_RELEASEKEYEDMUTEX2(
    public var hKeyedMutex: UInt = 0u,
    public var Key: ULong = 0uL,
    public var FenceValue: ULong = 0uL,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
)

public class D3DKMT_RENDER(
    public var Anonymous: D3DKMT_RENDER_0 = D3DKMT_RENDER_0(),
    public var CommandOffset: UInt = 0u,
    public var CommandLength: UInt = 0u,
    public var AllocationCount: UInt = 0u,
    public var PatchLocationCount: UInt = 0u,
    public var pNewCommandBuffer: Long = 0L,
    public var NewCommandBufferSize: UInt = 0u,
    public var pNewAllocationList: Long = 0L,
    public var NewAllocationListSize: UInt = 0u,
    public var pNewPatchLocationList: Long = 0L,
    public var NewPatchLocationListSize: UInt = 0u,
    public var Flags: D3DKMT_RENDERFLAGS = D3DKMT_RENDERFLAGS(),
    public var PresentHistoryToken: ULong = 0uL,
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var QueuedBufferCount: UInt = 0u,
    public var NewCommandBuffer: ULong = 0uL,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
)

public data class D3DKMT_RENDER_0(public var hDevice: UInt = 0u, public var hContext: UInt = 0u)

public data class D3DKMT_RENDERFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_REQUEST_MACHINE_CRASH_ESCAPE(
    public var Param1: ULong = 0uL,
    public var Param2: ULong = 0uL,
    public var Param3: ULong = 0uL,
)

public data class D3DKMT_SCATTERBLT(
    public var hLogicalSurfaceDestination: ULong = 0uL,
    public var hDestinationCompSurfDWM: Long = 0L,
    public var DestinationCompositionBindingId: ULong = 0uL,
    public var SourceRect: RECT = RECT(),
    public var DestinationOffset: POINT = POINT(),
)

public data class D3DKMT_SCATTERBLTS(public var NumBlts: UInt = 0u, public var Blts: List<D3DKMT_SCATTERBLT> = List(12) { D3DKMT_SCATTERBLT() })

public data class D3DKMT_SEGMENTGROUPSIZEINFO(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var LegacyInfo: D3DKMT_SEGMENTSIZEINFO = D3DKMT_SEGMENTSIZEINFO(),
    public var LocalMemory: ULong = 0uL,
    public var NonLocalMemory: ULong = 0uL,
    public var NonBudgetMemory: ULong = 0uL,
)

public data class D3DKMT_SEGMENTSIZEINFO(
    public var DedicatedVideoMemorySize: ULong = 0uL,
    public var DedicatedSystemMemorySize: ULong = 0uL,
    public var SharedSystemMemorySize: ULong = 0uL,
)

public data class D3DKMT_SEGMENT_CAPS(
    public var Size: ULong = 0uL,
    public var PageSize: UInt = 0u,
    public var SegmentId: UInt = 0u,
    public var bAperture: Boolean = false,
    public var bReservedSysMem: Boolean = false,
    public var BudgetGroup: D3DKMT_MEMORY_SEGMENT_GROUP = 0,
)

public data class D3DKMT_SETALLOCATIONPRIORITY(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: Long = 0L,
    public var AllocationCount: UInt = 0u,
    public var pPriorities: Long = 0L,
)

public data class D3DKMT_SETCONTEXTINPROCESSSCHEDULINGPRIORITY(public var hContext: UInt = 0u, public var Priority: Int = 0)

public data class D3DKMT_SETCONTEXTSCHEDULINGPRIORITY(public var hContext: UInt = 0u, public var Priority: Int = 0)

public data class D3DKMT_SETDISPLAYMODE(
    public var hDevice: UInt = 0u,
    public var hPrimaryAllocation: UInt = 0u,
    public var ScanLineOrdering: D3DDDI_VIDEO_SIGNAL_SCANLINE_ORDERING = 0,
    public var DisplayOrientation: D3DDDI_ROTATION = 0,
    public var PrivateDriverFormatAttribute: UInt = 0u,
    public var Flags: D3DKMT_SETDISPLAYMODE_FLAGS = D3DKMT_SETDISPLAYMODE_FLAGS(),
)

public data class D3DKMT_SETDISPLAYMODE_FLAGS(public var _bitfield1: UByte = 0u, public var _bitfield2: UInt = 0u)

public data class D3DKMT_SETDISPLAYPRIVATEDRIVERFORMAT(
    public var hDevice: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var PrivateDriverFormatAttribute: UInt = 0u,
)

public data class D3DKMT_SETFSEBLOCK(
    public var AdapterLuid: LUID = LUID(),
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Flags: D3DKMT_SETFSEBLOCKFLAGS = D3DKMT_SETFSEBLOCKFLAGS(),
)

public data class D3DKMT_SETFSEBLOCKFLAGS(public var Anonymous: D3DKMT_SETFSEBLOCKFLAGS_0 = D3DKMT_SETFSEBLOCKFLAGS_0(), public var Value: UInt = 0u)

public data class D3DKMT_SETFSEBLOCKFLAGS_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_SETGAMMARAMP(
    public var hDevice: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Type: D3DDDI_GAMMARAMP_TYPE = 0,
    public var Anonymous: D3DKMT_SETGAMMARAMP_0 = D3DKMT_SETGAMMARAMP_0(),
    public var Size: UInt = 0u,
)

public data class D3DKMT_SETGAMMARAMP_0(public var pGammaRampRgb256x3x16: Long = 0L, public var pGammaRampDXGI1: Long = 0L)

public data class D3DKMT_SETHWPROTECTIONTEARDOWNRECOVERY(public var hAdapter: UInt = 0u, public var Recovered: BOOL = 0)

public data class D3DKMT_SETQUEUEDLIMIT(
    public var hDevice: UInt = 0u,
    public var Type: D3DKMT_QUEUEDLIMIT_TYPE = 0,
    public var Anonymous: D3DKMT_SETQUEUEDLIMIT_0 = D3DKMT_SETQUEUEDLIMIT_0(),
)

public data class D3DKMT_SETQUEUEDLIMIT_0(public var QueuedPresentLimit: UInt = 0u, public var Anonymous: D3DKMT_SETQUEUEDLIMIT_0_0 = D3DKMT_SETQUEUEDLIMIT_0_0())

public data class D3DKMT_SETQUEUEDLIMIT_0_0(public var VidPnSourceId: UInt = 0u, public var QueuedPendingFlipLimit: UInt = 0u)

public data class D3DKMT_SETSTABLEPOWERSTATE(public var hAdapter: UInt = 0u, public var Enabled: BOOL = 0)

public data class D3DKMT_SETSYNCREFRESHCOUNTWAITTARGET(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var TargetSyncRefreshCount: UInt = 0u,
)

public data class D3DKMT_SETVIDPNSOURCEHWPROTECTION(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var HwProtected: BOOL = 0,
)

public data class D3DKMT_SETVIDPNSOURCEOWNER(
    public var hDevice: UInt = 0u,
    public var pType: Long = 0L,
    public var pVidPnSourceId: Long = 0L,
    public var VidPnSourceCount: UInt = 0u,
)

public data class D3DKMT_SETVIDPNSOURCEOWNER1(public var Version0: D3DKMT_SETVIDPNSOURCEOWNER = D3DKMT_SETVIDPNSOURCEOWNER(), public var Flags: D3DKMT_VIDPNSOURCEOWNER_FLAGS = D3DKMT_VIDPNSOURCEOWNER_FLAGS())

public data class D3DKMT_SETVIDPNSOURCEOWNER2(public var Version1: D3DKMT_SETVIDPNSOURCEOWNER1 = D3DKMT_SETVIDPNSOURCEOWNER1(), public var pVidPnSourceNtHandles: Long = 0L)

public data class D3DKMT_SET_COLORSPACE_TRANSFORM(
    public var AdapterLuid: LUID = LUID(),
    public var VidPnTargetId: UInt = 0u,
    public var Type: D3DDDI_GAMMARAMP_TYPE = 0,
    public var Size: UInt = 0u,
    public var Anonymous: D3DKMT_SET_COLORSPACE_TRANSFORM_0 = D3DKMT_SET_COLORSPACE_TRANSFORM_0(),
)

public data class D3DKMT_SET_COLORSPACE_TRANSFORM_0(public var pColorSpaceTransform: Long = 0L)

public data class D3DKMT_SHAREDPRIMARYLOCKNOTIFICATION(
    public var AdapterLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
    public var LockRect: RECTL = RECTL(),
)

public data class D3DKMT_SHAREDPRIMARYUNLOCKNOTIFICATION(public var AdapterLuid: LUID = LUID(), public var VidPnSourceId: UInt = 0u)

public data class D3DKMT_SHAREOBJECTWITHHOST(
    public var hDevice: UInt = 0u,
    public var hObject: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var hVailProcessNtHandle: ULong = 0uL,
)

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECT(
    public var hContext: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: UIntArray = UIntArray(32),
    public var Flags: D3DDDICB_SIGNALFLAGS = D3DDDICB_SIGNALFLAGS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_SIGNALSYNCHRONIZATIONOBJECT) return false
        if (this.hContext != other.hContext) return false
        if (this.ObjectCount != other.ObjectCount) return false
        if (!this.ObjectHandleArray.contentEquals(other.ObjectHandleArray)) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.ObjectCount.hashCode()
        result = 31 * result + this.ObjectHandleArray.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2(
    public var hContext: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: UIntArray = UIntArray(32),
    public var Flags: D3DDDICB_SIGNALFLAGS = D3DDDICB_SIGNALFLAGS(),
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var Anonymous: D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0 = D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2) return false
        if (this.hContext != other.hContext) return false
        if (this.ObjectCount != other.ObjectCount) return false
        if (!this.ObjectHandleArray.contentEquals(other.ObjectHandleArray)) return false
        if (this.Flags != other.Flags) return false
        if (this.BroadcastContextCount != other.BroadcastContextCount) return false
        if (!this.BroadcastContext.contentEquals(other.BroadcastContext)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.ObjectCount.hashCode()
        result = 31 * result + this.ObjectHandleArray.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.BroadcastContextCount.hashCode()
        result = 31 * result + this.BroadcastContext.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0(
    public var Fence: D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0_0 = D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0_0(),
    public var CpuEventHandle: HANDLE = 0L,
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0) return false
        if (this.Fence != other.Fence) return false
        if (this.CpuEventHandle != other.CpuEventHandle) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Fence.hashCode()
        result = 31 * result + this.CpuEventHandle.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECT2_0_0(public var FenceValue: ULong = 0uL)

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMCPU(
    public var hDevice: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var FenceValueArray: Long = 0L,
    public var Flags: D3DDDICB_SIGNALFLAGS = D3DDDICB_SIGNALFLAGS(),
)

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU(
    public var hContext: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var Anonymous: D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU_0 = D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU_0(),
)

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU_0(public var MonitoredFenceValueArray: Long = 0L, public var Reserved: ULongArray = ULongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU_0) return false
        if (this.MonitoredFenceValueArray != other.MonitoredFenceValueArray) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MonitoredFenceValueArray.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2(
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var Flags: D3DDDICB_SIGNALFLAGS = D3DDDICB_SIGNALFLAGS(),
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContextArray: Long = 0L,
    public var Anonymous: D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2_0 = D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2_0(),
)

public data class D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2_0(
    public var FenceValue: ULong = 0uL,
    public var CpuEventHandle: HANDLE = 0L,
    public var MonitoredFenceValueArray: Long = 0L,
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2_0) return false
        if (this.FenceValue != other.FenceValue) return false
        if (this.CpuEventHandle != other.CpuEventHandle) return false
        if (this.MonitoredFenceValueArray != other.MonitoredFenceValueArray) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FenceValue.hashCode()
        result = 31 * result + this.CpuEventHandle.hashCode()
        result = 31 * result + this.MonitoredFenceValueArray.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_STANDARDALLOCATION_EXISTINGHEAP(public var Size: ULong = 0uL)

public data class D3DKMT_SUBMITCOMMAND(
    public var Commands: ULong = 0uL,
    public var CommandLength: UInt = 0u,
    public var Flags: D3DKMT_SUBMITCOMMANDFLAGS = D3DKMT_SUBMITCOMMANDFLAGS(),
    public var PresentHistoryToken: ULong = 0uL,
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var NumPrimaries: UInt = 0u,
    public var WrittenPrimaries: UIntArray = UIntArray(16),
    public var NumHistoryBuffers: UInt = 0u,
    public var HistoryBufferArray: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_SUBMITCOMMAND) return false
        if (this.Commands != other.Commands) return false
        if (this.CommandLength != other.CommandLength) return false
        if (this.Flags != other.Flags) return false
        if (this.PresentHistoryToken != other.PresentHistoryToken) return false
        if (this.BroadcastContextCount != other.BroadcastContextCount) return false
        if (!this.BroadcastContext.contentEquals(other.BroadcastContext)) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.PrivateDriverDataSize != other.PrivateDriverDataSize) return false
        if (this.NumPrimaries != other.NumPrimaries) return false
        if (!this.WrittenPrimaries.contentEquals(other.WrittenPrimaries)) return false
        if (this.NumHistoryBuffers != other.NumHistoryBuffers) return false
        if (this.HistoryBufferArray != other.HistoryBufferArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Commands.hashCode()
        result = 31 * result + this.CommandLength.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.PresentHistoryToken.hashCode()
        result = 31 * result + this.BroadcastContextCount.hashCode()
        result = 31 * result + this.BroadcastContext.contentHashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.PrivateDriverDataSize.hashCode()
        result = 31 * result + this.NumPrimaries.hashCode()
        result = 31 * result + this.WrittenPrimaries.contentHashCode()
        result = 31 * result + this.NumHistoryBuffers.hashCode()
        result = 31 * result + this.HistoryBufferArray.hashCode()
        return result
    }
}

public data class D3DKMT_SUBMITCOMMANDFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_SUBMITCOMMANDTOHWQUEUE(
    public var hHwQueue: UInt = 0u,
    public var HwQueueProgressFenceId: ULong = 0uL,
    public var CommandBuffer: ULong = 0uL,
    public var CommandLength: UInt = 0u,
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var NumPrimaries: UInt = 0u,
    public var WrittenPrimaries: Long = 0L,
)

public data class D3DKMT_SUBMITPRESENTBLTTOHWQUEUE(
    public var hHwQueue: UInt = 0u,
    public var HwQueueProgressFenceId: ULong = 0uL,
    public var PrivatePresentData: D3DKMT_PRESENT = D3DKMT_PRESENT(),
)

public data class D3DKMT_SUBMITPRESENTTOHWQUEUE(public var hHwQueues: Long = 0L, public var PrivatePresentData: D3DKMT_PRESENT = D3DKMT_PRESENT())

public data class D3DKMT_SUBMITSIGNALSYNCOBJECTSTOHWQUEUE(
    public var Flags: D3DDDICB_SIGNALFLAGS = D3DDDICB_SIGNALFLAGS(),
    public var BroadcastHwQueueCount: UInt = 0u,
    public var BroadcastHwQueueArray: Long = 0L,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var FenceValueArray: Long = 0L,
)

public data class D3DKMT_SUBMITWAITFORSYNCOBJECTSTOHWQUEUE(
    public var hHwQueue: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var FenceValueArray: Long = 0L,
)

public data class D3DKMT_SURFACECOMPLETE_PRESENTHISTORYTOKEN(public var hLogicalSurface: ULong = 0uL)

public data class D3DKMT_TDRDBGCTRL_ESCAPE(public var TdrControl: D3DKMT_TDRDBGCTRLTYPE = 0, public var Anonymous: D3DKMT_TDRDBGCTRL_ESCAPE_0 = D3DKMT_TDRDBGCTRL_ESCAPE_0())

public data class D3DKMT_TDRDBGCTRL_ESCAPE_0(public var NodeOrdinal: UInt = 0u)

public data class D3DKMT_TRACKEDWORKLOAD_SUPPORT(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var EngineType: DXGK_ENGINE_TYPE = 0,
    public var Support: BOOL = 0,
)

public data class D3DKMT_TRIMNOTIFICATION(
    public var Context: Long = 0L,
    public var Flags: D3DDDI_TRIMRESIDENCYSET_FLAGS = D3DDDI_TRIMRESIDENCYSET_FLAGS(),
    public var NumBytesToTrim: ULong = 0uL,
)

public data class D3DKMT_TRIMPROCESSCOMMITMENT(
    public var cbSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var Flags: D3DKMT_TRIMPROCESSCOMMITMENT_FLAGS = D3DKMT_TRIMPROCESSCOMMITMENT_FLAGS(),
    public var DecommitRequested: ULong = 0uL,
    public var NumBytesDecommitted: ULong = 0uL,
)

public data class D3DKMT_TRIMPROCESSCOMMITMENT_FLAGS(public var Anonymous: D3DKMT_TRIMPROCESSCOMMITMENT_FLAGS_0 = D3DKMT_TRIMPROCESSCOMMITMENT_FLAGS_0(), public var Value: UInt = 0u)

public data class D3DKMT_TRIMPROCESSCOMMITMENT_FLAGS_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_UMDFILENAMEINFO(public var Version: KMTUMDVERSION = 0, public var UmdFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_UMDFILENAMEINFO) return false
        if (this.Version != other.Version) return false
        if (!this.UmdFileName.contentEquals(other.UmdFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.UmdFileName.contentHashCode()
        return result
    }
}

public data class D3DKMT_UMD_DRIVER_VERSION(public var DriverVersion: Long = 0L)

public data class D3DKMT_UNLOCK(
    public var hDevice: UInt = 0u,
    public var NumAllocations: UInt = 0u,
    public var phAllocations: Long = 0L,
)

public data class D3DKMT_UNLOCK2(public var hDevice: UInt = 0u, public var hAllocation: UInt = 0u)

public data class D3DKMT_UNPINDIRECTFLIPRESOURCES(
    public var hDevice: UInt = 0u,
    public var ResourceCount: UInt = 0u,
    public var pResourceList: Long = 0L,
)

public data class D3DKMT_UNREGISTERBUDGETCHANGENOTIFICATION(public var Handle: Long = 0L)

public data class D3DKMT_UNREGISTERTRIMNOTIFICATION(public var Handle: Long = 0L, public var Callback: PFND3DKMT_TRIMNOTIFICATIONCALLBACK = null)

public data class D3DKMT_UPDATEGPUVIRTUALADDRESS(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
    public var hFenceObject: UInt = 0u,
    public var NumOperations: UInt = 0u,
    public var Operations: Long = 0L,
    public var Reserved0: ULong = 0uL,
    public var Reserved1: ULong = 0uL,
    public var FenceValue: ULong = 0uL,
    public var Flags: D3DKMT_UPDATEGPUVIRTUALADDRESS_0 = D3DKMT_UPDATEGPUVIRTUALADDRESS_0(),
)

public data class D3DKMT_UPDATEGPUVIRTUALADDRESS_0(public var Anonymous: D3DKMT_UPDATEGPUVIRTUALADDRESS_0_0 = D3DKMT_UPDATEGPUVIRTUALADDRESS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_UPDATEGPUVIRTUALADDRESS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_UPDATEOVERLAY(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var OverlayInfo: D3DDDI_KERNELOVERLAYINFO = D3DDDI_KERNELOVERLAYINFO(),
)

public data class D3DKMT_VAD_DESC(
    public var VadIndex: UInt = 0u,
    public var VadAddress: ULong = 0uL,
    public var NumMappedRanges: UInt = 0u,
    public var VadType: UInt = 0u,
    public var StartAddress: ULong = 0uL,
    public var EndAddress: ULong = 0uL,
)

public data class D3DKMT_VA_RANGE_DESC(
    public var VadAddress: ULong = 0uL,
    public var VaRangeIndex: UInt = 0u,
    public var PhysicalAdapterIndex: UInt = 0u,
    public var StartAddress: ULong = 0uL,
    public var EndAddress: ULong = 0uL,
    public var DriverProtection: ULong = 0uL,
    public var OwnerType: UInt = 0u,
    public var pOwner: ULong = 0uL,
    public var OwnerOffset: ULong = 0uL,
    public var Protection: UInt = 0u,
)

public data class D3DKMT_VGPUINTERFACEID(public var VirtualGpuIntefaceId: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_VGPUINTERFACEID) return false
        if (!this.VirtualGpuIntefaceId.contentEquals(other.VirtualGpuIntefaceId)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.VirtualGpuIntefaceId.contentHashCode()
    }
}

public data class D3DKMT_VIDMM_ESCAPE(public var Type: D3DKMT_VIDMMESCAPETYPE = 0, public var Anonymous: D3DKMT_VIDMM_ESCAPE_0 = D3DKMT_VIDMM_ESCAPE_0())

public data class D3DKMT_VIDMM_ESCAPE_0(
    public var SetFault: D3DKMT_VIDMM_ESCAPE_0_0 = D3DKMT_VIDMM_ESCAPE_0_0(),
    public var Evict: D3DKMT_VIDMM_ESCAPE_0_1 = D3DKMT_VIDMM_ESCAPE_0_1(),
    public var EvictByNtHandle: D3DKMT_VIDMM_ESCAPE_0_2 = D3DKMT_VIDMM_ESCAPE_0_2(),
    public var GetVads: D3DKMT_VIDMM_ESCAPE_0_3 = D3DKMT_VIDMM_ESCAPE_0_3(),
    public var SetBudget: D3DKMT_VIDMM_ESCAPE_0_4 = D3DKMT_VIDMM_ESCAPE_0_4(),
    public var SuspendProcess: D3DKMT_VIDMM_ESCAPE_0_5 = D3DKMT_VIDMM_ESCAPE_0_5(),
    public var ResumeProcess: D3DKMT_VIDMM_ESCAPE_0_6 = D3DKMT_VIDMM_ESCAPE_0_6(),
    public var GetBudget: D3DKMT_VIDMM_ESCAPE_0_7 = D3DKMT_VIDMM_ESCAPE_0_7(),
    public var SetTrimIntervals: D3DKMT_VIDMM_ESCAPE_0_8 = D3DKMT_VIDMM_ESCAPE_0_8(),
    public var EvictByCriteria: D3DKMT_EVICTION_CRITERIA = D3DKMT_EVICTION_CRITERIA(),
    public var Wake: D3DKMT_VIDMM_ESCAPE_0_9 = D3DKMT_VIDMM_ESCAPE_0_9(),
    public var Defrag: D3DKMT_VIDMM_ESCAPE_0_10 = D3DKMT_VIDMM_ESCAPE_0_10(),
    public var DelayExecution: D3DKMT_VIDMM_ESCAPE_0_11 = D3DKMT_VIDMM_ESCAPE_0_11(),
    public var VerifyIntegrity: D3DKMT_VIDMM_ESCAPE_0_12 = D3DKMT_VIDMM_ESCAPE_0_12(),
    public var DelayedEvictionConfig: D3DKMT_VIDMM_ESCAPE_0_13 = D3DKMT_VIDMM_ESCAPE_0_13(),
)

public data class D3DKMT_VIDMM_ESCAPE_0_10(
    public var Operation: D3DKMT_DEFRAG_ESCAPE_OPERATION = 0,
    public var SegmentId: UInt = 0u,
    public var TotalCommitted: ULong = 0uL,
    public var TotalFree: ULong = 0uL,
    public var LargestGapBefore: ULong = 0uL,
    public var LargestGapAfter: ULong = 0uL,
)

public data class D3DKMT_VIDMM_ESCAPE_0_11(
    public var hPagingQueue: UInt = 0u,
    public var PhysicalAdapterIndex: UInt = 0u,
    public var Milliseconds: UInt = 0u,
    public var PagingFenceValue: ULong = 0uL,
)

public data class D3DKMT_VIDMM_ESCAPE_0_13(public var TimerValue: Long = 0L)

public data class D3DKMT_VIDMM_ESCAPE_0_2(public var NtHandle: ULong = 0uL)

public data class D3DKMT_VIDMM_ESCAPE_0_1(
    public var ResourceHandle: UInt = 0u,
    public var AllocationHandle: UInt = 0u,
    public var hProcess: HANDLE = 0L,
)

public data class D3DKMT_VIDMM_ESCAPE_0_7(public var NumBytesToTrim: ULong = 0uL)

public data class D3DKMT_VIDMM_ESCAPE_0_3(
    public var Anonymous: D3DKMT_VIDMM_ESCAPE_0_3_0 = D3DKMT_VIDMM_ESCAPE_0_3_0(),
    public var Command: D3DKMT_VAD_ESCAPE_COMMAND = 0,
    public var Status: NTSTATUS = 0,
)

public data class D3DKMT_VIDMM_ESCAPE_0_3_0(
    public var GetNumVads: D3DKMT_VIDMM_ESCAPE_0_3_0_0 = D3DKMT_VIDMM_ESCAPE_0_3_0_0(),
    public var GetVad: D3DKMT_VAD_DESC = D3DKMT_VAD_DESC(),
    public var GetVadRange: D3DKMT_VA_RANGE_DESC = D3DKMT_VA_RANGE_DESC(),
    public var GetGpuMmuCaps: D3DKMT_GET_GPUMMU_CAPS = D3DKMT_GET_GPUMMU_CAPS(),
    public var GetPte: D3DKMT_GET_PTE = D3DKMT_GET_PTE(),
    public var GetSegmentCaps: D3DKMT_GET_SEGMENT_CAPS = D3DKMT_GET_SEGMENT_CAPS(),
)

public data class D3DKMT_VIDMM_ESCAPE_0_3_0_0(public var NumVads: UInt = 0u)

public data class D3DKMT_VIDMM_ESCAPE_0_6(public var hProcess: HANDLE = 0L)

public data class D3DKMT_VIDMM_ESCAPE_0_4(public var LocalMemoryBudget: ULong = 0uL, public var SystemMemoryBudget: ULong = 0uL)

public data class D3DKMT_VIDMM_ESCAPE_0_0(public var Anonymous: D3DKMT_VIDMM_ESCAPE_0_0_0 = D3DKMT_VIDMM_ESCAPE_0_0_0())

public data class D3DKMT_VIDMM_ESCAPE_0_0_0(public var Anonymous: D3DKMT_VIDMM_ESCAPE_0_0_0_0 = D3DKMT_VIDMM_ESCAPE_0_0_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_VIDMM_ESCAPE_0_0_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_VIDMM_ESCAPE_0_8(
    public var MinTrimInterval: UInt = 0u,
    public var MaxTrimInterval: UInt = 0u,
    public var IdleTrimInterval: UInt = 0u,
)

public data class D3DKMT_VIDMM_ESCAPE_0_5(public var hProcess: HANDLE = 0L, public var bAllowWakeOnSubmission: BOOL = 0)

public data class D3DKMT_VIDMM_ESCAPE_0_12(public var SegmentId: UInt = 0u)

public data class D3DKMT_VIDMM_ESCAPE_0_9(public var bFlush: BOOL = 0)

public data class D3DKMT_VIDPNSOURCEOWNER_FLAGS(public var Anonymous: D3DKMT_VIDPNSOURCEOWNER_FLAGS_0 = D3DKMT_VIDPNSOURCEOWNER_FLAGS_0())

public data class D3DKMT_VIDPNSOURCEOWNER_FLAGS_0(public var Anonymous: D3DKMT_VIDPNSOURCEOWNER_FLAGS_0_0 = D3DKMT_VIDPNSOURCEOWNER_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_VIDPNSOURCEOWNER_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_VIDSCH_ESCAPE(
    public var Type: D3DKMT_VIDSCHESCAPETYPE = 0,
    public var Anonymous: D3DKMT_VIDSCH_ESCAPE_0 = D3DKMT_VIDSCH_ESCAPE_0(),
    public var VirtualRefreshRateControl: D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE = D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE(),
)

public data class D3DKMT_VIDSCH_ESCAPE_0(
    public var PreemptionControl: BOOL = 0,
    public var EnableContextDelay: BOOL = 0,
    public var TdrControl2: D3DKMT_VIDSCH_ESCAPE_0_0 = D3DKMT_VIDSCH_ESCAPE_0_0(),
    public var SuspendScheduler: BOOL = 0,
    public var TdrControl: UInt = 0u,
    public var SuspendTime: UInt = 0u,
    public var TdrLimit: D3DKMT_VIDSCH_ESCAPE_0_1 = D3DKMT_VIDSCH_ESCAPE_0_1(),
    public var PfnControl: D3DKMT_ESCAPE_PFN_CONTROL_COMMAND = 0,
)

public data class D3DKMT_VIDSCH_ESCAPE_0_0(public var TdrControl: UInt = 0u, public var Anonymous: D3DKMT_VIDSCH_ESCAPE_0_0_0 = D3DKMT_VIDSCH_ESCAPE_0_0_0())

public data class D3DKMT_VIDSCH_ESCAPE_0_0_0(public var NodeOrdinal: UInt = 0u)

public data class D3DKMT_VIDSCH_ESCAPE_0_1(public var Count: UInt = 0u, public var Time: UInt = 0u)

public data class D3DKMT_VIRTUALADDRESSFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_VIRTUALADDRESSINFO(public var VirtualAddressFlags: D3DKMT_VIRTUALADDRESSFLAGS = D3DKMT_VIRTUALADDRESSFLAGS())

public data class D3DKMT_WAITFORIDLE(public var hDevice: UInt = 0u)

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECT(
    public var hContext: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_WAITFORSYNCHRONIZATIONOBJECT) return false
        if (this.hContext != other.hContext) return false
        if (this.ObjectCount != other.ObjectCount) return false
        if (!this.ObjectHandleArray.contentEquals(other.ObjectHandleArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.ObjectCount.hashCode()
        result = 31 * result + this.ObjectHandleArray.contentHashCode()
        return result
    }
}

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2(
    public var hContext: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: UIntArray = UIntArray(32),
    public var Anonymous: D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0 = D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2) return false
        if (this.hContext != other.hContext) return false
        if (this.ObjectCount != other.ObjectCount) return false
        if (!this.ObjectHandleArray.contentEquals(other.ObjectHandleArray)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.ObjectCount.hashCode()
        result = 31 * result + this.ObjectHandleArray.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0(public var Fence: D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0_0 = D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0_0(), public var Reserved: ULongArray = ULongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0) return false
        if (this.Fence != other.Fence) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Fence.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECT2_0_0(public var FenceValue: ULong = 0uL)

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMCPU(
    public var hDevice: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var FenceValueArray: Long = 0L,
    public var hAsyncEvent: HANDLE = 0L,
    public var Flags: D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS = D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS(),
)

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPU(
    public var hContext: UInt = 0u,
    public var ObjectCount: UInt = 0u,
    public var ObjectHandleArray: Long = 0L,
    public var Anonymous: D3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPU_0 = D3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPU_0(),
)

public data class D3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPU_0(
    public var MonitoredFenceValueArray: Long = 0L,
    public var FenceValue: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPU_0) return false
        if (this.MonitoredFenceValueArray != other.MonitoredFenceValueArray) return false
        if (this.FenceValue != other.FenceValue) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MonitoredFenceValueArray.hashCode()
        result = 31 * result + this.FenceValue.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_WAITFORVERTICALBLANKEVENT(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
)

public data class D3DKMT_WAITFORVERTICALBLANKEVENT2(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var NumObjects: UInt = 0u,
    public var ObjectHandleArray: LongArray = LongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_WAITFORVERTICALBLANKEVENT2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        if (this.NumObjects != other.NumObjects) return false
        if (!this.ObjectHandleArray.contentEquals(other.ObjectHandleArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        result = 31 * result + this.NumObjects.hashCode()
        result = 31 * result + this.ObjectHandleArray.contentHashCode()
        return result
    }
}

public data class D3DKMT_WDDM_1_2_CAPS(public var PreemptionCaps: D3DKMDT_PREEMPTION_CAPS = D3DKMDT_PREEMPTION_CAPS(), public var Anonymous: D3DKMT_WDDM_1_2_CAPS_0 = D3DKMT_WDDM_1_2_CAPS_0())

public data class D3DKMT_WDDM_1_2_CAPS_0(public var Anonymous: D3DKMT_WDDM_1_2_CAPS_0_0 = D3DKMT_WDDM_1_2_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_1_2_CAPS_0_0(public var _bitfield: UInt = 0u)
