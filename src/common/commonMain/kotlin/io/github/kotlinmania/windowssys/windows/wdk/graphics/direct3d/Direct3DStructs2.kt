@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public data class D3DKMT_ADAPTER_VERIFIER_OPTION(
    public var Type: D3DKMT_ADAPTER_VERIFIER_OPTION_TYPE = 0,
    public var Mode: D3DKMT_VERIFIER_OPTION_MODE = 0,
    public var Data: D3DKMT_ADAPTER_VERIFIER_OPTION_DATA = D3DKMT_ADAPTER_VERIFIER_OPTION_DATA(),
)

public data class D3DKMT_ADAPTER_VERIFIER_OPTION_DATA(public var VidMmFlags: D3DKMT_ADAPTER_VERIFIER_VIDMM_FLAGS = D3DKMT_ADAPTER_VERIFIER_VIDMM_FLAGS(), public var VidMmTrimInterval: D3DKMT_ADAPTER_VERIFIER_VIDMM_TRIM_INTERVAL = D3DKMT_ADAPTER_VERIFIER_VIDMM_TRIM_INTERVAL())

public data class D3DKMT_ADAPTER_VERIFIER_VIDMM_FLAGS(public var Anonymous: D3DKMT_ADAPTER_VERIFIER_VIDMM_FLAGS_0 = D3DKMT_ADAPTER_VERIFIER_VIDMM_FLAGS_0(), public var Value: UInt = 0u)

public data class D3DKMT_ADAPTER_VERIFIER_VIDMM_FLAGS_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_ADAPTER_VERIFIER_VIDMM_TRIM_INTERVAL(
    public var MinimumTrimInterval: ULong = 0uL,
    public var MaximumTrimInterval: ULong = 0uL,
    public var IdleTrimInterval: ULong = 0uL,
)

public data class D3DKMT_ADJUSTFULLSCREENGAMMA(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Scale: D3DDDI_DXGI_RGB = D3DDDI_DXGI_RGB(),
    public var Offset: D3DDDI_DXGI_RGB = D3DDDI_DXGI_RGB(),
)

public data class D3DKMT_AUXILIARYPRESENTINFO(public var size: UInt = 0u, public var type: D3DKMT_AUXILIARYPRESENTINFO_TYPE = 0)

public data class D3DKMT_BDDFALLBACK_CTL(public var ForceBddHeadlessNextFallback: Boolean = false)

public data class D3DKMT_BLOCKLIST_INFO(public var Size: UInt = 0u, public var BlockList: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_BLOCKLIST_INFO) return false
        if (this.Size != other.Size) return false
        if (!this.BlockList.contentEquals(other.BlockList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.BlockList.contentHashCode()
        return result
    }
}

public data class D3DKMT_BLTMODEL_PRESENTHISTORYTOKEN(
    public var hLogicalSurface: ULong = 0uL,
    public var hPhysicalSurface: ULong = 0uL,
    public var EventId: ULong = 0uL,
    public var DirtyRegions: D3DKMT_DIRTYREGIONS = D3DKMT_DIRTYREGIONS(),
)

public data class D3DKMT_BRIGHTNESS_INFO(
    public var Type: D3DKMT_BRIGHTNESS_INFO_TYPE = 0,
    public var ChildUid: UInt = 0u,
    public var Anonymous: D3DKMT_BRIGHTNESS_INFO_0 = D3DKMT_BRIGHTNESS_INFO_0(),
)

public data class D3DKMT_BRIGHTNESS_INFO_0(
    public var PossibleLevels: D3DKMT_BRIGHTNESS_POSSIBLE_LEVELS = D3DKMT_BRIGHTNESS_POSSIBLE_LEVELS(),
    public var Brightness: UByte = 0u,
    public var BrightnessCaps: DXGK_BRIGHTNESS_CAPS = DXGK_BRIGHTNESS_CAPS(),
    public var BrightnessState: DXGK_BRIGHTNESS_STATE = DXGK_BRIGHTNESS_STATE(),
    public var OptimizationLevel: DXGK_BACKLIGHT_OPTIMIZATION_LEVEL = 0,
    public var ReductionInfo: DXGK_BACKLIGHT_INFO = DXGK_BACKLIGHT_INFO(),
    public var VerboseLogging: Boolean = false,
    public var NitRanges: DXGK_BRIGHTNESS_GET_NIT_RANGES_OUT = DXGK_BRIGHTNESS_GET_NIT_RANGES_OUT(),
    public var GetBrightnessMillinits: DXGK_BRIGHTNESS_GET_OUT = DXGK_BRIGHTNESS_GET_OUT(),
    public var SetBrightnessMillinits: DXGK_BRIGHTNESS_SET_IN = DXGK_BRIGHTNESS_SET_IN(),
)

public data class D3DKMT_BRIGHTNESS_POSSIBLE_LEVELS(public var LevelCount: UByte = 0u, public var BrightnessLevels: UByteArray = UByteArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_BRIGHTNESS_POSSIBLE_LEVELS) return false
        if (this.LevelCount != other.LevelCount) return false
        if (!this.BrightnessLevels.contentEquals(other.BrightnessLevels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LevelCount.hashCode()
        result = 31 * result + this.BrightnessLevels.contentHashCode()
        return result
    }
}

public data class D3DKMT_BUDGETCHANGENOTIFICATION(public var Context: Long = 0L, public var Budget: ULong = 0uL)

public data class D3DKMT_CANCEL_PRESENTS(
    public var cbSize: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var Flags: D3DKMT_CANCEL_PRESENTS_FLAGS = D3DKMT_CANCEL_PRESENTS_FLAGS(),
    public var Operation: D3DKMT_CANCEL_PRESENTS_OPERATION = 0,
    public var CancelFromPresentId: ULong = 0uL,
    public var CompSurfaceLuid: LUID = LUID(),
    public var BindId: ULong = 0uL,
)

public data class D3DKMT_CANCEL_PRESENTS_FLAGS(public var Anonymous: D3DKMT_CANCEL_PRESENTS_FLAGS_0 = D3DKMT_CANCEL_PRESENTS_FLAGS_0())

public data class D3DKMT_CANCEL_PRESENTS_FLAGS_0(public var ReprogramInterrupt: D3DKMT_CANCEL_PRESENTS_FLAGS_0_0 = D3DKMT_CANCEL_PRESENTS_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_CANCEL_PRESENTS_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_CHANGESURFACEPOINTER(
    public var hDC: HDC = 0L,
    public var hBitmap: HANDLE = 0L,
    public var pSurfacePointer: Long = 0L,
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Pitch: UInt = 0u,
)

public data class D3DKMT_CHANGEVIDEOMEMORYRESERVATION(
    public var hProcess: HANDLE = 0L,
    public var hAdapter: UInt = 0u,
    public var MemorySegmentGroup: D3DKMT_MEMORY_SEGMENT_GROUP = 0,
    public var Reservation: ULong = 0uL,
    public var PhysicalAdapterIndex: UInt = 0u,
)

public data class D3DKMT_CHECKMONITORPOWERSTATE(public var hAdapter: UInt = 0u, public var VidPnSourceId: UInt = 0u)

public data class D3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT(
    public var hDevice: UInt = 0u,
    public var PlaneCount: UInt = 0u,
    public var pOverlayPlanes: Long = 0L,
    public var Supported: BOOL = 0,
    public var ReturnInfo: D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO = D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO(),
)

public data class D3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT2(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var PlaneCount: UInt = 0u,
    public var pOverlayPlanes: Long = 0L,
    public var Supported: BOOL = 0,
    public var ReturnInfo: D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO = D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO(),
)

public data class D3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT3(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var PlaneCount: UInt = 0u,
    public var ppOverlayPlanes: Long = 0L,
    public var PostCompositionCount: UInt = 0u,
    public var ppPostComposition: Long = 0L,
    public var Supported: BOOL = 0,
    public var ReturnInfo: D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO = D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO(),
)

public data class D3DKMT_CHECKOCCLUSION(public var hWindow: HWND = 0L)

public data class D3DKMT_CHECKSHAREDRESOURCEACCESS(public var hResource: UInt = 0u, public var ClientPid: UInt = 0u)

public data class D3DKMT_CHECKVIDPNEXCLUSIVEOWNERSHIP(public var hAdapter: UInt = 0u, public var VidPnSourceId: UInt = 0u)

public data class D3DKMT_CHECK_MULTIPLANE_OVERLAY_PLANE(
    public var hResource: UInt = 0u,
    public var CompSurfaceLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
    public var PlaneAttributes: D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES = D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES(),
)

public data class D3DKMT_CHECK_MULTIPLANE_OVERLAY_PLANE2(
    public var LayerIndex: UInt = 0u,
    public var hResource: UInt = 0u,
    public var CompSurfaceLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
    public var PlaneAttributes: D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES2 = D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES2(),
)

public data class D3DKMT_CHECK_MULTIPLANE_OVERLAY_PLANE3(
    public var LayerIndex: UInt = 0u,
    public var hResource: UInt = 0u,
    public var CompSurfaceLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
    public var pPlaneAttributes: Long = 0L,
)

public data class D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO(public var Anonymous: D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO_0 = D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO_0())

public data class D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO_0(public var Anonymous: D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO_0_0 = D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_CHECK_MULTIPLANE_OVERLAY_SUPPORT_RETURN_INFO_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_CLOSEADAPTER(public var hAdapter: UInt = 0u)

public data class D3DKMT_COMPOSITION_PRESENTHISTORYTOKEN(public var hPrivateData: ULong = 0uL)

public data class D3DKMT_CONFIGURESHAREDRESOURCE(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var IsDwm: Boolean = false,
    public var hProcess: HANDLE = 0L,
    public var AllowAccess: Boolean = false,
)

public data class D3DKMT_CONNECT_DOORBELL(public var hHwQueue: UInt = 0u, public var Flags: D3DKMT_CONNECT_DOORBELL_FLAGS = D3DKMT_CONNECT_DOORBELL_FLAGS())

public data class D3DKMT_CONNECT_DOORBELL_FLAGS(public var Anonymous: D3DKMT_CONNECT_DOORBELL_FLAGS_0 = D3DKMT_CONNECT_DOORBELL_FLAGS_0())

public data class D3DKMT_CONNECT_DOORBELL_FLAGS_0(public var Anonymous: D3DKMT_CONNECT_DOORBELL_FLAGS_0_0 = D3DKMT_CONNECT_DOORBELL_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_CONNECT_DOORBELL_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_CPDRIVERNAME(public var ContentProtectionFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_CPDRIVERNAME) return false
        if (!this.ContentProtectionFileName.contentEquals(other.ContentProtectionFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ContentProtectionFileName.contentHashCode()
    }
}

public data class D3DKMT_CREATEALLOCATION(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var Anonymous1: D3DKMT_CREATEALLOCATION_0 = D3DKMT_CREATEALLOCATION_0(),
    public var PrivateDriverDataSize: UInt = 0u,
    public var NumAllocations: UInt = 0u,
    public var Anonymous2: D3DKMT_CREATEALLOCATION_1 = D3DKMT_CREATEALLOCATION_1(),
    public var Flags: D3DKMT_CREATEALLOCATIONFLAGS = D3DKMT_CREATEALLOCATIONFLAGS(),
    public var hPrivateRuntimeResourceHandle: HANDLE = 0L,
)

public data class D3DKMT_CREATEALLOCATION_0(public var pStandardAllocation: Long = 0L, public var pPrivateDriverData: Long = 0L)

public data class D3DKMT_CREATEALLOCATION_1(public var pAllocationInfo: Long = 0L, public var pAllocationInfo2: Long = 0L)

public data class D3DKMT_CREATEALLOCATIONFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_CREATECONTEXT(
    public var hDevice: UInt = 0u,
    public var NodeOrdinal: UInt = 0u,
    public var EngineAffinity: UInt = 0u,
    public var Flags: D3DDDI_CREATECONTEXTFLAGS = D3DDDI_CREATECONTEXTFLAGS(),
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var ClientHint: D3DKMT_CLIENTHINT = 0,
    public var hContext: UInt = 0u,
    public var pCommandBuffer: Long = 0L,
    public var CommandBufferSize: UInt = 0u,
    public var pAllocationList: Long = 0L,
    public var AllocationListSize: UInt = 0u,
    public var pPatchLocationList: Long = 0L,
    public var PatchLocationListSize: UInt = 0u,
    public var CommandBuffer: ULong = 0uL,
)

public data class D3DKMT_CREATECONTEXTVIRTUAL(
    public var hDevice: UInt = 0u,
    public var NodeOrdinal: UInt = 0u,
    public var EngineAffinity: UInt = 0u,
    public var Flags: D3DDDI_CREATECONTEXTFLAGS = D3DDDI_CREATECONTEXTFLAGS(),
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var ClientHint: D3DKMT_CLIENTHINT = 0,
    public var hContext: UInt = 0u,
)

public data class D3DKMT_CREATEDCFROMMEMORY(
    public var pMemory: Long = 0L,
    public var Format: D3DDDIFORMAT = 0u,
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Pitch: UInt = 0u,
    public var hDeviceDc: HDC = 0L,
    public var pColorTable: Long = 0L,
    public var hDc: HDC = 0L,
    public var hBitmap: HANDLE = 0L,
)

public data class D3DKMT_CREATEDEVICE(
    public var Anonymous: D3DKMT_CREATEDEVICE_0 = D3DKMT_CREATEDEVICE_0(),
    public var Flags: D3DKMT_CREATEDEVICEFLAGS = D3DKMT_CREATEDEVICEFLAGS(),
    public var hDevice: UInt = 0u,
    public var pCommandBuffer: Long = 0L,
    public var CommandBufferSize: UInt = 0u,
    public var pAllocationList: Long = 0L,
    public var AllocationListSize: UInt = 0u,
    public var pPatchLocationList: Long = 0L,
    public var PatchLocationListSize: UInt = 0u,
)

public data class D3DKMT_CREATEDEVICE_0(public var hAdapter: UInt = 0u, public var pAdapter: Long = 0L)

public data class D3DKMT_CREATEDEVICEFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_CREATEHWCONTEXT(
    public var hDevice: UInt = 0u,
    public var NodeOrdinal: UInt = 0u,
    public var EngineAffinity: UInt = 0u,
    public var Flags: D3DDDI_CREATEHWCONTEXTFLAGS = D3DDDI_CREATEHWCONTEXTFLAGS(),
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var hHwContext: UInt = 0u,
)

public data class D3DKMT_CREATEHWQUEUE(
    public var hHwContext: UInt = 0u,
    public var Flags: D3DDDI_CREATEHWQUEUEFLAGS = D3DDDI_CREATEHWQUEUEFLAGS(),
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var hHwQueue: UInt = 0u,
    public var hHwQueueProgressFence: UInt = 0u,
    public var HwQueueProgressFenceCPUVirtualAddress: Long = 0L,
    public var HwQueueProgressFenceGPUVirtualAddress: ULong = 0uL,
)

public data class D3DKMT_CREATEKEYEDMUTEX(
    public var InitialValue: ULong = 0uL,
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
)

public data class D3DKMT_CREATEKEYEDMUTEX2(
    public var InitialValue: ULong = 0uL,
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var Flags: D3DKMT_CREATEKEYEDMUTEX2_FLAGS = D3DKMT_CREATEKEYEDMUTEX2_FLAGS(),
)

public data class D3DKMT_CREATEKEYEDMUTEX2_FLAGS(public var Anonymous: D3DKMT_CREATEKEYEDMUTEX2_FLAGS_0 = D3DKMT_CREATEKEYEDMUTEX2_FLAGS_0())

public data class D3DKMT_CREATEKEYEDMUTEX2_FLAGS_0(public var Anonymous: D3DKMT_CREATEKEYEDMUTEX2_FLAGS_0_0 = D3DKMT_CREATEKEYEDMUTEX2_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_CREATEKEYEDMUTEX2_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_CREATENATIVEFENCE(public var hDevice: UInt = 0u, public var Info: D3DDDI_CREATENATIVEFENCEINFO = D3DDDI_CREATENATIVEFENCEINFO())

public data class D3DKMT_CREATEOVERLAY(
    public var VidPnSourceId: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var OverlayInfo: D3DDDI_KERNELOVERLAYINFO = D3DDDI_KERNELOVERLAYINFO(),
    public var hOverlay: UInt = 0u,
)

public data class D3DKMT_CREATEPAGINGQUEUE(
    public var hDevice: UInt = 0u,
    public var Priority: D3DDDI_PAGINGQUEUE_PRIORITY = 0,
    public var hPagingQueue: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var FenceValueCPUVirtualAddress: Long = 0L,
    public var PhysicalAdapterIndex: UInt = 0u,
)

public data class D3DKMT_CREATEPROTECTEDSESSION(
    public var hDevice: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var hHandle: UInt = 0u,
)

public data class D3DKMT_CREATESTANDARDALLOCATION(
    public var Type: D3DKMT_STANDARDALLOCATIONTYPE = 0,
    public var Anonymous: D3DKMT_CREATESTANDARDALLOCATION_0 = D3DKMT_CREATESTANDARDALLOCATION_0(),
    public var Flags: D3DKMT_CREATESTANDARDALLOCATIONFLAGS = D3DKMT_CREATESTANDARDALLOCATIONFLAGS(),
)

public data class D3DKMT_CREATESTANDARDALLOCATION_0(public var ExistingHeapData: D3DKMT_STANDARDALLOCATION_EXISTINGHEAP = D3DKMT_STANDARDALLOCATION_EXISTINGHEAP())

public data class D3DKMT_CREATESTANDARDALLOCATIONFLAGS(public var Anonymous: D3DKMT_CREATESTANDARDALLOCATIONFLAGS_0 = D3DKMT_CREATESTANDARDALLOCATIONFLAGS_0())

public data class D3DKMT_CREATESTANDARDALLOCATIONFLAGS_0(public var Anonymous: D3DKMT_CREATESTANDARDALLOCATIONFLAGS_0_0 = D3DKMT_CREATESTANDARDALLOCATIONFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_CREATESTANDARDALLOCATIONFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_CREATESYNCFILE(
    public var hDevice: UInt = 0u,
    public var hMonitoredFence: UInt = 0u,
    public var FenceValue: ULong = 0uL,
    public var hSyncFile: ULong = 0uL,
)

public data class D3DKMT_CREATESYNCHRONIZATIONOBJECT(
    public var hDevice: UInt = 0u,
    public var Info: D3DDDI_SYNCHRONIZATIONOBJECTINFO = D3DDDI_SYNCHRONIZATIONOBJECTINFO(),
    public var hSyncObject: UInt = 0u,
)

public data class D3DKMT_CREATESYNCHRONIZATIONOBJECT2(
    public var hDevice: UInt = 0u,
    public var Info: D3DDDI_SYNCHRONIZATIONOBJECTINFO2 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2(),
    public var hSyncObject: UInt = 0u,
)

public data class D3DKMT_CREATE_DOORBELL(
    public var hHwQueue: UInt = 0u,
    public var hRingBuffer: UInt = 0u,
    public var hRingBufferControl: UInt = 0u,
    public var Flags: D3DKMT_CREATE_DOORBELL_FLAGS = D3DKMT_CREATE_DOORBELL_FLAGS(),
    public var PrivateDriverDataSize: UInt = 0u,
    public var PrivateDriverData: Long = 0L,
    public var DoorbellCPUVirtualAddress: Long = 0L,
    public var DoorbellSecondaryCPUVirtualAddress: Long = 0L,
    public var DoorbellStatusCPUVirtualAddress: Long = 0L,
)

public data class D3DKMT_CREATE_DOORBELL_FLAGS(public var Anonymous: D3DKMT_CREATE_DOORBELL_FLAGS_0 = D3DKMT_CREATE_DOORBELL_FLAGS_0())

public data class D3DKMT_CREATE_DOORBELL_FLAGS_0(public var Anonymous: D3DKMT_CREATE_DOORBELL_FLAGS_0_0 = D3DKMT_CREATE_DOORBELL_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_CREATE_DOORBELL_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_CREATE_OUTPUTDUPL(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var KeyedMutexCount: UInt = 0u,
    public var RequiredKeyedMutexCount: UInt = 0u,
    public var KeyedMutexs: List<D3DKMT_OUTPUTDUPL_KEYEDMUTEX> = List(3) { D3DKMT_OUTPUTDUPL_KEYEDMUTEX() },
    public var Flags: D3DKMT_OUTPUTDUPLCREATIONFLAGS = D3DKMT_OUTPUTDUPLCREATIONFLAGS(),
)

public data class D3DKMT_CROSSADAPTERRESOURCE_SUPPORT(public var SupportTier: D3DKMT_CROSSADAPTERRESOURCE_SUPPORT_TIER = 0)

public data class D3DKMT_CURRENTDISPLAYMODE(public var VidPnSourceId: UInt = 0u, public var DisplayMode: D3DKMT_DISPLAYMODE = D3DKMT_DISPLAYMODE())

public data class D3DKMT_DEBUG_SNAPSHOT_ESCAPE(public var Length: UInt = 0u, public var Buffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_DEBUG_SNAPSHOT_ESCAPE) return false
        if (this.Length != other.Length) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class D3DKMT_DESTROYALLOCATION(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: Long = 0L,
    public var AllocationCount: UInt = 0u,
)

public data class D3DKMT_DESTROYALLOCATION2(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: Long = 0L,
    public var AllocationCount: UInt = 0u,
    public var Flags: D3DDDICB_DESTROYALLOCATION2FLAGS = D3DDDICB_DESTROYALLOCATION2FLAGS(),
)

public data class D3DKMT_DESTROYCONTEXT(public var hContext: UInt = 0u)

public data class D3DKMT_DESTROYDCFROMMEMORY(public var hDc: HDC = 0L, public var hBitmap: HANDLE = 0L)

public data class D3DKMT_DESTROYDEVICE(public var hDevice: UInt = 0u)

public data class D3DKMT_DESTROYHWCONTEXT(public var hHwContext: UInt = 0u)

public data class D3DKMT_DESTROYHWQUEUE(public var hHwQueue: UInt = 0u)

public data class D3DKMT_DESTROYKEYEDMUTEX(public var hKeyedMutex: UInt = 0u)

public data class D3DKMT_DESTROYOVERLAY(public var hDevice: UInt = 0u, public var hOverlay: UInt = 0u)

public data class D3DKMT_DESTROYPROTECTEDSESSION(public var hHandle: UInt = 0u)

public data class D3DKMT_DESTROYSYNCHRONIZATIONOBJECT(public var hSyncObject: UInt = 0u)

public data class D3DKMT_DESTROY_DOORBELL(public var hHwQueue: UInt = 0u)

public data class D3DKMT_DESTROY_OUTPUTDUPL(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var bDestroyAllContexts: BOOL = 0,
)

public data class D3DKMT_DEVICEPAGEFAULT_STATE(
    public var FaultedPrimitiveAPISequenceNumber: ULong = 0uL,
    public var FaultedPipelineStage: DXGK_RENDER_PIPELINE_STAGE = 0,
    public var FaultedBindTableEntry: UInt = 0u,
    public var PageFaultFlags: DXGK_PAGE_FAULT_FLAGS = 0,
    public var FaultErrorCode: DXGK_FAULT_ERROR_CODE = DXGK_FAULT_ERROR_CODE(),
    public var FaultedVirtualAddress: ULong = 0uL,
)

public data class D3DKMT_DEVICEPRESENT_QUEUE_STATE(public var VidPnSourceId: UInt = 0u, public var bQueuedPresentLimitReached: Boolean = false)

public data class D3DKMT_DEVICEPRESENT_STATE(public var VidPnSourceId: UInt = 0u, public var PresentStats: D3DKMT_PRESENT_STATS = D3DKMT_PRESENT_STATS())

public data class D3DKMT_DEVICEPRESENT_STATE_DWM(public var VidPnSourceId: UInt = 0u, public var PresentStatsDWM: D3DKMT_PRESENT_STATS_DWM = D3DKMT_PRESENT_STATS_DWM())

public data class D3DKMT_DEVICERESET_STATE(public var Anonymous: D3DKMT_DEVICERESET_STATE_0 = D3DKMT_DEVICERESET_STATE_0())

public data class D3DKMT_DEVICERESET_STATE_0(public var Anonymous: D3DKMT_DEVICERESET_STATE_0_0 = D3DKMT_DEVICERESET_STATE_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_DEVICERESET_STATE_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_DEVICE_ESCAPE(public var Type: D3DKMT_DEVICEESCAPE_TYPE = 0, public var Anonymous: D3DKMT_DEVICE_ESCAPE_0 = D3DKMT_DEVICE_ESCAPE_0())

public data class D3DKMT_DEVICE_ESCAPE_0(public var VidPnFromAllocation: D3DKMT_DEVICE_ESCAPE_0_0 = D3DKMT_DEVICE_ESCAPE_0_0())

public data class D3DKMT_DEVICE_ESCAPE_0_0(public var hPrimaryAllocation: UInt = 0u, public var VidPnSourceId: UInt = 0u)

public data class D3DKMT_DEVICE_IDS(
    public var VendorID: UInt = 0u,
    public var DeviceID: UInt = 0u,
    public var SubVendorID: UInt = 0u,
    public var SubSystemID: UInt = 0u,
    public var RevisionID: UInt = 0u,
    public var BusType: UInt = 0u,
)

public data class D3DKMT_DIRECTFLIP_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_DIRTYREGIONS(public var NumRects: UInt = 0u, public var Rects: List<RECT> = List(16) { RECT() })

public data class D3DKMT_DISPLAYMODE(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Format: D3DDDIFORMAT = 0u,
    public var IntegerRefreshRate: UInt = 0u,
    public var RefreshRate: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var ScanLineOrdering: D3DDDI_VIDEO_SIGNAL_SCANLINE_ORDERING = 0,
    public var DisplayOrientation: D3DDDI_ROTATION = 0,
    public var DisplayFixedOutput: UInt = 0u,
    public var Flags: D3DKMDT_DISPLAYMODE_FLAGS = D3DKMDT_DISPLAYMODE_FLAGS(),
)

public data class D3DKMT_DISPLAYMODELIST(
    public var VidPnSourceId: UInt = 0u,
    public var ModeCount: UInt = 0u,
    public var pModeList: List<D3DKMT_DISPLAYMODE> = List(1) { D3DKMT_DISPLAYMODE() },
)

public data class D3DKMT_DISPLAY_CAPS(public var Anonymous: D3DKMT_DISPLAY_CAPS_0 = D3DKMT_DISPLAY_CAPS_0())

public data class D3DKMT_DISPLAY_CAPS_0(public var Anonymous: D3DKMT_DISPLAY_CAPS_0_0 = D3DKMT_DISPLAY_CAPS_0_0(), public var Value: ULong = 0uL)

public data class D3DKMT_DISPLAY_CAPS_0_0(public var _bitfield: ULong = 0uL)

public data class D3DKMT_DISPLAY_UMD_FILENAMEINFO(public var Version: KMT_DISPLAY_UMD_VERSION = 0, public var UmdFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_DISPLAY_UMD_FILENAMEINFO) return false
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

public data class D3DKMT_DLIST_DRIVER_NAME(public var DListFileName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_DLIST_DRIVER_NAME) return false
        if (!this.DListFileName.contentEquals(other.DListFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DListFileName.contentHashCode()
    }
}

public data class D3DKMT_DMM_ESCAPE(
    public var Type: D3DKMT_DMMESCAPETYPE = 0,
    public var ProvidedBufferSize: ULong = 0uL,
    public var MinRequiredBufferSize: ULong = 0uL,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_DMM_ESCAPE) return false
        if (this.Type != other.Type) return false
        if (this.ProvidedBufferSize != other.ProvidedBufferSize) return false
        if (this.MinRequiredBufferSize != other.MinRequiredBufferSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.ProvidedBufferSize.hashCode()
        result = 31 * result + this.MinRequiredBufferSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class D3DKMT_DOD_SET_DIRTYRECT_MODE(public var bForceFullScreenDirty: BOOL = 0)

public data class D3DKMT_DRIVERCAPS_EXT(public var Anonymous: D3DKMT_DRIVERCAPS_EXT_0 = D3DKMT_DRIVERCAPS_EXT_0())

public data class D3DKMT_DRIVERCAPS_EXT_0(public var Anonymous: D3DKMT_DRIVERCAPS_EXT_0_0 = D3DKMT_DRIVERCAPS_EXT_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_DRIVERCAPS_EXT_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_DRIVER_DESCRIPTION(public var DriverDescription: UShortArray = UShortArray(4096)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_DRIVER_DESCRIPTION) return false
        if (!this.DriverDescription.contentEquals(other.DriverDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DriverDescription.contentHashCode()
    }
}

public data class D3DKMT_ENUMADAPTERS(public var NumAdapters: UInt = 0u, public var Adapters: List<D3DKMT_ADAPTERINFO> = List(16) { D3DKMT_ADAPTERINFO() })

public data class D3DKMT_ENUMADAPTERS2(public var NumAdapters: UInt = 0u, public var pAdapters: Long = 0L)

public data class D3DKMT_ENUMADAPTERS3(
    public var Filter: D3DKMT_ENUMADAPTERS_FILTER = D3DKMT_ENUMADAPTERS_FILTER(),
    public var NumAdapters: UInt = 0u,
    public var pAdapters: Long = 0L,
)

public data class D3DKMT_ENUMADAPTERS_FILTER(public var Anonymous: D3DKMT_ENUMADAPTERS_FILTER_0 = D3DKMT_ENUMADAPTERS_FILTER_0(), public var Value: ULong = 0uL)

public data class D3DKMT_ENUMADAPTERS_FILTER_0(public var _bitfield: ULong = 0uL)

public data class D3DKMT_ESCAPE(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var Type: D3DKMT_ESCAPETYPE = 0,
    public var Flags: D3DDDI_ESCAPEFLAGS = D3DDDI_ESCAPEFLAGS(),
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE(
    public var Type: D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE_TYPE = 0,
    public var VidPnSourceId: UInt = 0u,
    public var ProcessBoostEligible: Boolean = false,
    public var VSyncMultiplier: UInt = 0u,
    public var BaseDesktopDuration: UInt = 0u,
    public var Reserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE) return false
        if (this.Type != other.Type) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        if (this.ProcessBoostEligible != other.ProcessBoostEligible) return false
        if (this.VSyncMultiplier != other.VSyncMultiplier) return false
        if (this.BaseDesktopDuration != other.BaseDesktopDuration) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        result = 31 * result + this.ProcessBoostEligible.hashCode()
        result = 31 * result + this.VSyncMultiplier.hashCode()
        result = 31 * result + this.BaseDesktopDuration.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_EVICT(
    public var hDevice: UInt = 0u,
    public var NumAllocations: UInt = 0u,
    public var AllocationList: Long = 0L,
    public var Flags: D3DDDI_EVICT_FLAGS = D3DDDI_EVICT_FLAGS(),
    public var NumBytesToTrim: ULong = 0uL,
)

public data class D3DKMT_EVICTION_CRITERIA(
    public var MinimumSize: ULong = 0uL,
    public var MaximumSize: ULong = 0uL,
    public var Anonymous: D3DKMT_EVICTION_CRITERIA_0 = D3DKMT_EVICTION_CRITERIA_0(),
)

public data class D3DKMT_EVICTION_CRITERIA_0(public var Anonymous: D3DKMT_EVICTION_CRITERIA_0_0 = D3DKMT_EVICTION_CRITERIA_0_0())

public data class D3DKMT_EVICTION_CRITERIA_0_0(public var Flags: D3DKMT_EVICTION_CRITERIA_0_0_0 = D3DKMT_EVICTION_CRITERIA_0_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_EVICTION_CRITERIA_0_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_FENCE_PRESENTHISTORYTOKEN(public var Key: ULong = 0uL)

public data class D3DKMT_FLIPINFOFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_FLIPMANAGER_AUXILIARYPRESENTINFO(
    public var auxiliaryPresentInfo: D3DKMT_AUXILIARYPRESENTINFO = D3DKMT_AUXILIARYPRESENTINFO(),
    public var flipManagerTracingId: UInt = 0u,
    public var customDurationChanged: BOOL = 0,
    public var FlipAdapterLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
    public var independentFlipStage: D3DKMT_FLIPMODEL_INDEPENDENT_FLIP_STAGE = 0,
    public var FlipCompletedQpc: ULong = 0uL,
    public var HwPresentDurationQpc: UInt = 0u,
    public var WasCanceled: BOOL = 0,
    public var ConvertedToNonIFlip: BOOL = 0,
)

public data class D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN(
    public var hPrivateData: ULong = 0uL,
    public var PresentAtQpc: ULong = 0uL,
    public var Flags: D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN_0 = D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN_0(),
)

public data class D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN_0(public var Anonymous: D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN_0_0 = D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_FLIPMANAGER_PRESENTHISTORYTOKEN_0_0(public var _bitfield: UInt = 0u)

public class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN(
    public var FenceValue: ULong = 0uL,
    public var hLogicalSurface: ULong = 0uL,
    public var dxgContext: ULong = 0uL,
    public var VidPnSourceId: UInt = 0u,
    public var SwapChainIndex: UInt = 0u,
    public var PresentLimitSemaphoreId: ULong = 0uL,
    public var FlipInterval: D3DDDI_FLIPINTERVAL_TYPE = 0,
    public var Flags: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS(),
    public var hCompSurf: Long = 0L,
    public var compSurfLuid: LUID = LUID(),
    public var confirmationCookie: ULong = 0uL,
    public var CompositionSyncKey: ULong = 0uL,
    public var RemainingTokens: UInt = 0u,
    public var ScrollRect: RECT = RECT(),
    public var ScrollOffset: POINT = POINT(),
    public var PresentCount: UInt = 0u,
    public var RevealColor: FloatArray = FloatArray(4),
    public var Rotation: D3DDDI_ROTATION = 0,
    public var Anonymous: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0 = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0(),
    public var InkCookie: UInt = 0u,
    public var SourceRect: RECT = RECT(),
    public var DestWidth: UInt = 0u,
    public var DestHeight: UInt = 0u,
    public var TargetRect: RECT = RECT(),
    public var Transform: FloatArray = FloatArray(6),
    public var CustomDuration: UInt = 0u,
    public var CustomDurationFlipInterval: D3DDDI_FLIPINTERVAL_TYPE = 0,
    public var PlaneIndex: UInt = 0u,
    public var ColorSpace: D3DDDI_COLOR_SPACE_TYPE = 0,
    public var DirtyRegions: D3DKMT_DIRTYREGIONS = D3DKMT_DIRTYREGIONS(),
)

public data class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0(public var ScatterBlts: D3DKMT_SCATTERBLTS = D3DKMT_SCATTERBLTS(), public var Anonymous: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0_0 = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0_0())

public data class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0_0(
    public var hSyncObject: HANDLE = 0L,
    public var HDRMetaDataType: D3DDDI_HDR_METADATA_TYPE = 0,
    public var Anonymous: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0_0_0 = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0_0_0(),
)

public data class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKEN_0_0_0(public var HDRMetaDataHDR10: D3DDDI_HDR_METADATA_HDR10 = D3DDDI_HDR_METADATA_HDR10(), public var HDRMetaDataHDR10Plus: D3DDDI_HDR_METADATA_HDR10PLUS = D3DDDI_HDR_METADATA_HDR10PLUS())

public data class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS(public var Anonymous: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS_0 = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS_0())

public data class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS_0(public var Anonymous: D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS_0_0 = D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_FLIPMODEL_PRESENTHISTORYTOKENFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_FLIPOVERLAY(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var hSource: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
)

public data class D3DKMT_FLIPQUEUEINFO(
    public var MaxHardwareFlipQueueLength: UInt = 0u,
    public var MaxSoftwareFlipQueueLength: UInt = 0u,
    public var FlipFlags: D3DKMT_FLIPINFOFLAGS = D3DKMT_FLIPINFOFLAGS(),
)

public data class D3DKMT_FLUSHHEAPTRANSITIONS(public var hAdapter: UInt = 0u)

public data class D3DKMT_FREEGPUVIRTUALADDRESS(
    public var hAdapter: UInt = 0u,
    public var BaseAddress: ULong = 0uL,
    public var Size: ULong = 0uL,
)

public data class D3DKMT_GDIMODEL_PRESENTHISTORYTOKEN(
    public var hLogicalSurface: ULong = 0uL,
    public var hPhysicalSurface: ULong = 0uL,
    public var ScrollRect: RECT = RECT(),
    public var ScrollOffset: POINT = POINT(),
    public var DirtyRegions: D3DKMT_DIRTYREGIONS = D3DKMT_DIRTYREGIONS(),
)

public data class D3DKMT_GDIMODEL_SYSMEM_PRESENTHISTORYTOKEN(
    public var hlsurf: ULong = 0uL,
    public var dwDirtyFlags: UInt = 0u,
    public var uiCookie: ULong = 0uL,
)

public data class D3DKMT_GETALLOCATIONPRIORITY(
    public var hDevice: UInt = 0u,
    public var hResource: UInt = 0u,
    public var phAllocationList: Long = 0L,
    public var AllocationCount: UInt = 0u,
    public var pPriorities: Long = 0L,
)

public data class D3DKMT_GETCONTEXTINPROCESSSCHEDULINGPRIORITY(public var hContext: UInt = 0u, public var Priority: Int = 0)

public data class D3DKMT_GETCONTEXTSCHEDULINGPRIORITY(public var hContext: UInt = 0u, public var Priority: Int = 0)

public data class D3DKMT_GETDEVICESTATE(
    public var hDevice: UInt = 0u,
    public var StateType: D3DKMT_DEVICESTATE_TYPE = 0,
    public var Anonymous: D3DKMT_GETDEVICESTATE_0 = D3DKMT_GETDEVICESTATE_0(),
)

public data class D3DKMT_GETDEVICESTATE_0(
    public var ExecutionState: D3DKMT_DEVICEEXECUTION_STATE = 0,
    public var PresentState: D3DKMT_DEVICEPRESENT_STATE = D3DKMT_DEVICEPRESENT_STATE(),
    public var ResetState: D3DKMT_DEVICERESET_STATE = D3DKMT_DEVICERESET_STATE(),
    public var PresentStateDWM: D3DKMT_DEVICEPRESENT_STATE_DWM = D3DKMT_DEVICEPRESENT_STATE_DWM(),
    public var PageFaultState: D3DKMT_DEVICEPAGEFAULT_STATE = D3DKMT_DEVICEPAGEFAULT_STATE(),
    public var PresentQueueState: D3DKMT_DEVICEPRESENT_QUEUE_STATE = D3DKMT_DEVICEPRESENT_QUEUE_STATE(),
)

public data class D3DKMT_GETDISPLAYMODELIST(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var pModeList: Long = 0L,
    public var ModeCount: UInt = 0u,
)

public data class D3DKMT_GETMULTISAMPLEMETHODLIST(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Format: D3DDDIFORMAT = 0u,
    public var pMethodList: Long = 0L,
    public var MethodCount: UInt = 0u,
)

public data class D3DKMT_GETOVERLAYSTATE(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var OverlayEnabled: Boolean = false,
)

public data class D3DKMT_GETPRESENTHISTORY(
    public var hAdapter: UInt = 0u,
    public var ProvidedSize: UInt = 0u,
    public var WrittenSize: UInt = 0u,
    public var pTokens: Long = 0L,
    public var NumTokens: UInt = 0u,
)

public data class D3DKMT_GETPROCESSDEVICEREMOVALSUPPORT(
    public var hProcess: HANDLE = 0L,
    public var AdapterLuid: LUID = LUID(),
    public var Support: Boolean = false,
)

public data class D3DKMT_GETRUNTIMEDATA(
    public var hAdapter: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var pRuntimeData: Long = 0L,
    public var RuntimeDataSize: UInt = 0u,
)

public data class D3DKMT_GETSCANLINE(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var InVerticalBlank: Boolean = false,
    public var ScanLine: UInt = 0u,
)

public data class D3DKMT_GETSHAREDPRIMARYHANDLE(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var hSharedPrimary: UInt = 0u,
)

public data class D3DKMT_GETSHAREDRESOURCEADAPTERLUID(
    public var hGlobalShare: UInt = 0u,
    public var hNtHandle: HANDLE = 0L,
    public var AdapterLuid: LUID = LUID(),
)

public data class D3DKMT_GETVERTICALBLANKEVENT(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var phEvent: Long = 0L,
)

public data class D3DKMT_GET_DEVICE_VIDPN_OWNERSHIP_INFO(public var hDevice: UInt = 0u, public var bFailedDwmAcquireVidPn: Boolean = false)

public data class D3DKMT_GET_GPUMMU_CAPS(public var PhysicalAdapterIndex: UInt = 0u, public var GpuMmuCaps: DXGK_ESCAPE_GPUMMUCAPS = DXGK_ESCAPE_GPUMMUCAPS())

public data class D3DKMT_GET_MULTIPLANE_OVERLAY_CAPS(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var MaxPlanes: UInt = 0u,
    public var MaxRGBPlanes: UInt = 0u,
    public var MaxYUVPlanes: UInt = 0u,
    public var OverlayCaps: D3DKMT_MULTIPLANE_OVERLAY_CAPS = D3DKMT_MULTIPLANE_OVERLAY_CAPS(),
    public var MaxStretchFactor: Float = 0.0f,
    public var MaxShrinkFactor: Float = 0.0f,
)

public data class D3DKMT_GET_POST_COMPOSITION_CAPS(
    public var hAdapter: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var MaxStretchFactor: Float = 0.0f,
    public var MaxShrinkFactor: Float = 0.0f,
)

public data class D3DKMT_GET_PTE(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var PageTableLevel: UInt = 0u,
    public var PageTableIndex: UIntArray = UIntArray(6),
    public var b64KBPte: Boolean = false,
    public var NumPtes: UInt = 0u,
    public var Pte: List<DXGK_PTE> = List(64) { DXGK_PTE() },
    public var NumValidEntries: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_GET_PTE) return false
        if (this.PhysicalAdapterIndex != other.PhysicalAdapterIndex) return false
        if (this.PageTableLevel != other.PageTableLevel) return false
        if (!this.PageTableIndex.contentEquals(other.PageTableIndex)) return false
        if (this.b64KBPte != other.b64KBPte) return false
        if (this.NumPtes != other.NumPtes) return false
        if (this.Pte != other.Pte) return false
        if (this.NumValidEntries != other.NumValidEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalAdapterIndex.hashCode()
        result = 31 * result + this.PageTableLevel.hashCode()
        result = 31 * result + this.PageTableIndex.contentHashCode()
        result = 31 * result + this.b64KBPte.hashCode()
        result = 31 * result + this.NumPtes.hashCode()
        result = 31 * result + this.Pte.hashCode()
        result = 31 * result + this.NumValidEntries.hashCode()
        return result
    }
}

public data class D3DKMT_GET_SEGMENT_CAPS(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var NumSegments: UInt = 0u,
    public var SegmentCaps: List<D3DKMT_SEGMENT_CAPS> = List(32) { D3DKMT_SEGMENT_CAPS() },
)

public data class D3DKMT_GPUMMU_CAPS(public var Flags: D3DKMT_GPUMMU_CAPS_0 = D3DKMT_GPUMMU_CAPS_0(), public var VirtualAddressBitCount: UInt = 0u)

public data class D3DKMT_GPUMMU_CAPS_0(public var Anonymous: D3DKMT_GPUMMU_CAPS_0_0 = D3DKMT_GPUMMU_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_GPUMMU_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_GPUVERSION(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var BiosVersion: UShortArray = UShortArray(32),
    public var GpuArchitecture: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_GPUVERSION) return false
        if (this.PhysicalAdapterIndex != other.PhysicalAdapterIndex) return false
        if (!this.BiosVersion.contentEquals(other.BiosVersion)) return false
        if (!this.GpuArchitecture.contentEquals(other.GpuArchitecture)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalAdapterIndex.hashCode()
        result = 31 * result + this.BiosVersion.contentHashCode()
        result = 31 * result + this.GpuArchitecture.contentHashCode()
        return result
    }
}

public data class D3DKMT_HISTORY_BUFFER_STATUS(public var Enabled: Boolean = false, public var Reserved: UInt = 0u)

public data class D3DKMT_HWDRM_SUPPORT(public var Supported: Boolean = false)

public data class D3DKMT_HYBRID_DLIST_DLL_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_HYBRID_LIST(
    public var State: D3DKMT_GPU_PREFERENCE_QUERY_STATE = 0,
    public var AdapterLuid: LUID = LUID(),
    public var bUserPreferenceQuery: BOOL = 0,
    public var QueryType: D3DKMT_GPU_PREFERENCE_QUERY_TYPE = 0,
)

public data class D3DKMT_INDEPENDENTFLIP_SECONDARY_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_INDEPENDENTFLIP_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_INVALIDATEACTIVEVIDPN(
    public var hAdapter: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
)

public data class D3DKMT_INVALIDATECACHE(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var Offset: ULong = 0uL,
    public var Length: ULong = 0uL,
)

public data class D3DKMT_ISBADDRIVERFORHWPROTECTIONDISABLED(public var Disabled: BOOL = 0)

public data class D3DKMT_KMD_DRIVER_VERSION(public var DriverVersion: Long = 0L)

public data class D3DKMT_LOCK(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var PrivateDriverData: UInt = 0u,
    public var NumPages: UInt = 0u,
    public var pPages: Long = 0L,
    public var pData: Long = 0L,
    public var Flags: D3DDDICB_LOCKFLAGS = D3DDDICB_LOCKFLAGS(),
    public var GpuVirtualAddress: ULong = 0uL,
)

public data class D3DKMT_LOCK2(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var Flags: D3DDDICB_LOCK2FLAGS = D3DDDICB_LOCK2FLAGS(),
    public var pData: Long = 0L,
)

public data class D3DKMT_MARKDEVICEASERROR(public var hDevice: UInt = 0u, public var Reason: D3DKMT_DEVICE_ERROR_REASON = 0)

public data class D3DKMT_MIRACASTCOMPANIONDRIVERNAME(public var MiracastCompanionDriverName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_MIRACASTCOMPANIONDRIVERNAME) return false
        if (!this.MiracastCompanionDriverName.contentEquals(other.MiracastCompanionDriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.MiracastCompanionDriverName.contentHashCode()
    }
}

public data class D3DKMT_MIRACAST_CHUNK_DATA(
    public var ChunkInfo: DXGK_MIRACAST_CHUNK_INFO = DXGK_MIRACAST_CHUNK_INFO(),
    public var PrivateDriverDataSize: UInt = 0u,
    public var PrivateDriverData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_MIRACAST_CHUNK_DATA) return false
        if (this.ChunkInfo != other.ChunkInfo) return false
        if (this.PrivateDriverDataSize != other.PrivateDriverDataSize) return false
        if (!this.PrivateDriverData.contentEquals(other.PrivateDriverData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ChunkInfo.hashCode()
        result = 31 * result + this.PrivateDriverDataSize.hashCode()
        result = 31 * result + this.PrivateDriverData.contentHashCode()
        return result
    }
}

public data class D3DKMT_MIRACAST_DISPLAY_DEVICE_CAPS(
    public var HdcpSupported: Boolean = false,
    public var DefaultControlPort: UInt = 0u,
    public var UsesIhvSolution: Boolean = false,
)

public data class D3DKMT_MIRACAST_DISPLAY_DEVICE_STATUS(public var State: D3DKMT_MIRACAST_DISPLAY_DEVICE_STATE = 0)

public data class D3DKMT_MIRACAST_DISPLAY_STOP_SESSIONS(
    public var AdapterLuid: LUID = LUID(),
    public var TargetId: UInt = 0u,
    public var StopReason: UInt = 0u,
)

public data class D3DKMT_MOVE_RECT(public var SourcePoint: POINT = POINT(), public var DestRect: RECT = RECT())

public data class D3DKMT_MPO3DDI_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_MPOKERNELCAPS_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_MULTIPLANEOVERLAY_DECODE_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_MULTIPLANEOVERLAY_HUD_SUPPORT(
    public var VidPnSourceId: UInt = 0u,
    public var Update: BOOL = 0,
    public var KernelSupported: BOOL = 0,
    public var HudSupported: BOOL = 0,
)

public data class D3DKMT_MULTIPLANEOVERLAY_SECONDARY_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_MULTIPLANEOVERLAY_STRETCH_SUPPORT(
    public var VidPnSourceId: UInt = 0u,
    public var Update: BOOL = 0,
    public var Supported: BOOL = 0,
)

public data class D3DKMT_MULTIPLANEOVERLAY_SUPPORT(public var Supported: BOOL = 0)

public data class D3DKMT_MULTIPLANE_OVERLAY(
    public var LayerIndex: UInt = 0u,
    public var Enabled: BOOL = 0,
    public var hAllocation: UInt = 0u,
    public var PlaneAttributes: D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES = D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES(),
)

public data class D3DKMT_MULTIPLANE_OVERLAY2(
    public var LayerIndex: UInt = 0u,
    public var Enabled: BOOL = 0,
    public var hAllocation: UInt = 0u,
    public var PlaneAttributes: D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES2 = D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES2(),
)

public data class D3DKMT_MULTIPLANE_OVERLAY3(
    public var LayerIndex: UInt = 0u,
    public var InputFlags: D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS = D3DKMT_PLANE_SPECIFIC_INPUT_FLAGS(),
    public var FlipInterval: D3DDDI_FLIPINTERVAL_TYPE = 0,
    public var MaxImmediateFlipLine: UInt = 0u,
    public var AllocationCount: UInt = 0u,
    public var pAllocationList: Long = 0L,
    public var DriverPrivateDataSize: UInt = 0u,
    public var pDriverPrivateData: Long = 0L,
    public var pPlaneAttributes: Long = 0L,
    public var hFlipToFence: UInt = 0u,
    public var hFlipAwayFence: UInt = 0u,
    public var FlipToFenceValue: ULong = 0uL,
    public var FlipAwayFenceValue: ULong = 0uL,
)

public data class D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES(
    public var Flags: UInt = 0u,
    public var SrcRect: RECT = RECT(),
    public var DstRect: RECT = RECT(),
    public var ClipRect: RECT = RECT(),
    public var Rotation: D3DDDI_ROTATION = 0,
    public var Blend: D3DKMT_MULTIPLANE_OVERLAY_BLEND = 0,
    public var DirtyRectCount: UInt = 0u,
    public var pDirtyRects: Long = 0L,
    public var VideoFrameFormat: D3DKMT_MULTIPLANE_OVERLAY_VIDEO_FRAME_FORMAT = 0,
    public var YCbCrFlags: UInt = 0u,
    public var StereoFormat: D3DKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT = 0,
    public var StereoLeftViewFrame0: BOOL = 0,
    public var StereoBaseViewFrame0: BOOL = 0,
    public var StereoFlipMode: DXGKMT_MULTIPLANE_OVERLAY_STEREO_FLIP_MODE = 0,
    public var StretchQuality: DXGKMT_MULTIPLANE_OVERLAY_STRETCH_QUALITY = 0,
)

public data class D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES2(
    public var Flags: UInt = 0u,
    public var SrcRect: RECT = RECT(),
    public var DstRect: RECT = RECT(),
    public var ClipRect: RECT = RECT(),
    public var Rotation: D3DDDI_ROTATION = 0,
    public var Blend: D3DKMT_MULTIPLANE_OVERLAY_BLEND = 0,
    public var DirtyRectCount: UInt = 0u,
    public var pDirtyRects: Long = 0L,
    public var VideoFrameFormat: D3DKMT_MULTIPLANE_OVERLAY_VIDEO_FRAME_FORMAT = 0,
    public var ColorSpace: D3DDDI_COLOR_SPACE_TYPE = 0,
    public var StereoFormat: D3DKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT = 0,
    public var StereoLeftViewFrame0: BOOL = 0,
    public var StereoBaseViewFrame0: BOOL = 0,
    public var StereoFlipMode: DXGKMT_MULTIPLANE_OVERLAY_STEREO_FLIP_MODE = 0,
    public var StretchQuality: DXGKMT_MULTIPLANE_OVERLAY_STRETCH_QUALITY = 0,
    public var Reserved1: UInt = 0u,
)

public data class D3DKMT_MULTIPLANE_OVERLAY_ATTRIBUTES3(
    public var Flags: UInt = 0u,
    public var SrcRect: RECT = RECT(),
    public var DstRect: RECT = RECT(),
    public var ClipRect: RECT = RECT(),
    public var Rotation: D3DDDI_ROTATION = 0,
    public var Blend: D3DKMT_MULTIPLANE_OVERLAY_BLEND = 0,
    public var DirtyRectCount: UInt = 0u,
    public var pDirtyRects: Long = 0L,
    public var ColorSpace: D3DDDI_COLOR_SPACE_TYPE = 0,
    public var StretchQuality: DXGKMT_MULTIPLANE_OVERLAY_STRETCH_QUALITY = 0,
    public var SDRWhiteLevel: UInt = 0u,
)

public data class D3DKMT_MULTIPLANE_OVERLAY_CAPS(public var Anonymous: D3DKMT_MULTIPLANE_OVERLAY_CAPS_0 = D3DKMT_MULTIPLANE_OVERLAY_CAPS_0())

public data class D3DKMT_MULTIPLANE_OVERLAY_CAPS_0(public var Anonymous: D3DKMT_MULTIPLANE_OVERLAY_CAPS_0_0 = D3DKMT_MULTIPLANE_OVERLAY_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_MULTIPLANE_OVERLAY_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION(
    public var Flags: D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS = D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS(),
    public var SrcRect: RECT = RECT(),
    public var DstRect: RECT = RECT(),
    public var Rotation: D3DDDI_ROTATION = 0,
)

public data class D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS(public var Anonymous: D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS_0 = D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS_0())

public data class D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS_0(public var Anonymous: D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS_0_0 = D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION_WITH_SOURCE(public var VidPnSourceId: UInt = 0u, public var PostComposition: D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION = D3DKMT_MULTIPLANE_OVERLAY_POST_COMPOSITION())

public data class D3DKMT_MULTISAMPLEMETHOD(
    public var NumSamples: UInt = 0u,
    public var NumQualityLevels: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class D3DKMT_NODEMETADATA(public var NodeOrdinalAndAdapterIndex: UInt = 0u, public var NodeData: DXGK_NODEMETADATA = DXGK_NODEMETADATA())

public data class D3DKMT_NODE_PERFDATA(
    public var NodeOrdinal: UInt = 0u,
    public var PhysicalAdapterIndex: UInt = 0u,
    public var Frequency: ULong = 0uL,
    public var MaxFrequency: ULong = 0uL,
    public var MaxFrequencyOC: ULong = 0uL,
    public var Voltage: UInt = 0u,
    public var VoltageMax: UInt = 0u,
    public var VoltageMaxOC: UInt = 0u,
    public var MaxTransitionLatency: ULong = 0uL,
)

public data class D3DKMT_NOTIFY_WORK_SUBMISSION(public var hHwQueue: UInt = 0u, public var Flags: D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS = D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS())

public data class D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS(public var Anonymous: D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS_0 = D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS_0())

public data class D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS_0(public var Anonymous: D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS_0_0 = D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_NOTIFY_WORK_SUBMISSION_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_OFFERALLOCATIONS(
    public var hDevice: UInt = 0u,
    public var pResources: Long = 0L,
    public var HandleList: Long = 0L,
    public var NumAllocations: UInt = 0u,
    public var Priority: D3DKMT_OFFER_PRIORITY = 0,
    public var Flags: D3DKMT_OFFER_FLAGS = D3DKMT_OFFER_FLAGS(),
)

public data class D3DKMT_OFFER_FLAGS(public var Anonymous: D3DKMT_OFFER_FLAGS_0 = D3DKMT_OFFER_FLAGS_0())

public data class D3DKMT_OFFER_FLAGS_0(public var Anonymous: D3DKMT_OFFER_FLAGS_0_0 = D3DKMT_OFFER_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_OFFER_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_OPENADAPTERFROMDEVICENAME(
    public var pDeviceName: PCWSTR = 0L,
    public var hAdapter: UInt = 0u,
    public var AdapterLuid: LUID = LUID(),
)

public data class D3DKMT_OPENADAPTERFROMGDIDISPLAYNAME(
    public var DeviceName: UShortArray = UShortArray(32),
    public var hAdapter: UInt = 0u,
    public var AdapterLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_OPENADAPTERFROMGDIDISPLAYNAME) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.AdapterLuid != other.AdapterLuid) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceName.contentHashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.AdapterLuid.hashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        return result
    }
}

public data class D3DKMT_OPENADAPTERFROMHDC(
    public var hDc: HDC = 0L,
    public var hAdapter: UInt = 0u,
    public var AdapterLuid: LUID = LUID(),
    public var VidPnSourceId: UInt = 0u,
)

public data class D3DKMT_OPENADAPTERFROMLUID(public var AdapterLuid: LUID = LUID(), public var hAdapter: UInt = 0u)

public data class D3DKMT_OPENGLINFO(
    public var UmdOpenGlIcdFileName: UShortArray = UShortArray(260),
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_OPENGLINFO) return false
        if (!this.UmdOpenGlIcdFileName.contentEquals(other.UmdOpenGlIcdFileName)) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UmdOpenGlIcdFileName.contentHashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class D3DKMT_OPENKEYEDMUTEX(public var hSharedHandle: UInt = 0u, public var hKeyedMutex: UInt = 0u)

public data class D3DKMT_OPENKEYEDMUTEX2(
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
)

public data class D3DKMT_OPENKEYEDMUTEXFROMNTHANDLE(
    public var hNtHandle: HANDLE = 0L,
    public var hKeyedMutex: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
)

public data class D3DKMT_OPENNATIVEFENCEFROMNTHANDLE(
    public var hNtHandle: HANDLE = 0L,
    public var hDevice: UInt = 0u,
    public var EngineAffinity: UInt = 0u,
    public var Flags: D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS = D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS(),
    public var hSyncObject: UInt = 0u,
    public var NativeFenceMapping: D3DDDI_NATIVEFENCEMAPPING = D3DDDI_NATIVEFENCEMAPPING(),
)

public data class D3DKMT_OPENNTHANDLEFROMNAME(
    public var dwDesiredAccess: UInt = 0u,
    public var pObjAttrib: Long = 0L,
    public var hNtHandle: HANDLE = 0L,
)

public data class D3DKMT_OPENPROTECTEDSESSIONFROMNTHANDLE(public var hNtHandle: HANDLE = 0L, public var hHandle: UInt = 0u)

public data class D3DKMT_OPENRESOURCE(
    public var hDevice: UInt = 0u,
    public var hGlobalShare: UInt = 0u,
    public var NumAllocations: UInt = 0u,
    public var Anonymous: D3DKMT_OPENRESOURCE_0 = D3DKMT_OPENRESOURCE_0(),
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var pResourcePrivateDriverData: Long = 0L,
    public var ResourcePrivateDriverDataSize: UInt = 0u,
    public var pTotalPrivateDriverDataBuffer: Long = 0L,
    public var TotalPrivateDriverDataBufferSize: UInt = 0u,
    public var hResource: UInt = 0u,
)

public data class D3DKMT_OPENRESOURCE_0(public var pOpenAllocationInfo: Long = 0L, public var pOpenAllocationInfo2: Long = 0L)

public data class D3DKMT_OPENRESOURCEFROMNTHANDLE(
    public var hDevice: UInt = 0u,
    public var hNtHandle: HANDLE = 0L,
    public var NumAllocations: UInt = 0u,
    public var pOpenAllocationInfo2: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
    public var pPrivateRuntimeData: Long = 0L,
    public var ResourcePrivateDriverDataSize: UInt = 0u,
    public var pResourcePrivateDriverData: Long = 0L,
    public var TotalPrivateDriverDataBufferSize: UInt = 0u,
    public var pTotalPrivateDriverDataBuffer: Long = 0L,
    public var hResource: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
    public var pKeyedMutexPrivateRuntimeData: Long = 0L,
    public var KeyedMutexPrivateRuntimeDataSize: UInt = 0u,
    public var hSyncObject: UInt = 0u,
)

public data class D3DKMT_OPENSYNCHRONIZATIONOBJECT(
    public var hSharedHandle: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_OPENSYNCHRONIZATIONOBJECT) return false
        if (this.hSharedHandle != other.hSharedHandle) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSharedHandle.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_OPENSYNCOBJECTFROMNTHANDLE(public var hNtHandle: HANDLE = 0L, public var hSyncObject: UInt = 0u)

public data class D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2(
    public var hNtHandle: HANDLE = 0L,
    public var hDevice: UInt = 0u,
    public var Flags: D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS = D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS(),
    public var hSyncObject: UInt = 0u,
    public var Anonymous: D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0 = D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0(),
)

public data class D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0(public var MonitoredFence: D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0_0 = D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0_0(), public var Reserved: ULongArray = ULongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0) return false
        if (this.MonitoredFence != other.MonitoredFence) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MonitoredFence.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DKMT_OPENSYNCOBJECTFROMNTHANDLE2_0_0(
    public var FenceValueCPUVirtualAddress: Long = 0L,
    public var FenceValueGPUVirtualAddress: ULong = 0uL,
    public var EngineAffinity: UInt = 0u,
)

public data class D3DKMT_OPENSYNCOBJECTNTHANDLEFROMNAME(
    public var dwDesiredAccess: UInt = 0u,
    public var pObjAttrib: Long = 0L,
    public var hNtHandle: HANDLE = 0L,
)

public data class D3DKMT_OUTDUPL_POINTER_SHAPE_INFO(
    public var Type: D3DKMT_OUTDUPL_POINTER_SHAPE_TYPE = 0,
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Pitch: UInt = 0u,
    public var HotSpot: POINT = POINT(),
)

public data class D3DKMT_OUTPUTDUPLCONTEXTSCOUNT(public var VidPnSourceId: UInt = 0u, public var OutputDuplicationCount: UInt = 0u)

public data class D3DKMT_OUTPUTDUPLCREATIONFLAGS(public var Anonymous: D3DKMT_OUTPUTDUPLCREATIONFLAGS_0 = D3DKMT_OUTPUTDUPLCREATIONFLAGS_0())

public data class D3DKMT_OUTPUTDUPLCREATIONFLAGS_0(public var Anonymous: D3DKMT_OUTPUTDUPLCREATIONFLAGS_0_0 = D3DKMT_OUTPUTDUPLCREATIONFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_OUTPUTDUPLCREATIONFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_OUTPUTDUPLPRESENT(
    public var hContext: UInt = 0u,
    public var hSource: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var BroadcastContextCount: UInt = 0u,
    public var BroadcastContext: UIntArray = UIntArray(64),
    public var PresentRegions: D3DKMT_PRESENT_RGNS = D3DKMT_PRESENT_RGNS(),
    public var Flags: D3DKMT_OUTPUTDUPLPRESENTFLAGS = D3DKMT_OUTPUTDUPLPRESENTFLAGS(),
    public var hIndirectContext: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_OUTPUTDUPLPRESENT) return false
        if (this.hContext != other.hContext) return false
        if (this.hSource != other.hSource) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        if (this.BroadcastContextCount != other.BroadcastContextCount) return false
        if (!this.BroadcastContext.contentEquals(other.BroadcastContext)) return false
        if (this.PresentRegions != other.PresentRegions) return false
        if (this.Flags != other.Flags) return false
        if (this.hIndirectContext != other.hIndirectContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.hSource.hashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        result = 31 * result + this.BroadcastContextCount.hashCode()
        result = 31 * result + this.BroadcastContext.contentHashCode()
        result = 31 * result + this.PresentRegions.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.hIndirectContext.hashCode()
        return result
    }
}
