@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public data class D3DDDIARG_CREATERESOURCE(
    public var Format: D3DDDIFORMAT = 0u,
    public var Pool: D3DDDI_POOL = 0,
    public var MultisampleType: D3DDDIMULTISAMPLE_TYPE = 0,
    public var MultisampleQuality: UInt = 0u,
    public var pSurfList: Long = 0L,
    public var SurfCount: UInt = 0u,
    public var MipLevels: UInt = 0u,
    public var Fvf: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var RefreshRate: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var hResource: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var Flags: D3DDDI_RESOURCEFLAGS = D3DDDI_RESOURCEFLAGS(),
    public var Rotation: D3DDDI_ROTATION = 0,
)

public data class D3DDDIARG_CREATERESOURCE2(
    public var Format: D3DDDIFORMAT = 0u,
    public var Pool: D3DDDI_POOL = 0,
    public var MultisampleType: D3DDDIMULTISAMPLE_TYPE = 0,
    public var MultisampleQuality: UInt = 0u,
    public var pSurfList: Long = 0L,
    public var SurfCount: UInt = 0u,
    public var MipLevels: UInt = 0u,
    public var Fvf: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var RefreshRate: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var hResource: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var Flags: D3DDDI_RESOURCEFLAGS = D3DDDI_RESOURCEFLAGS(),
    public var Rotation: D3DDDI_ROTATION = 0,
    public var Flags2: D3DDDI_RESOURCEFLAGS2 = D3DDDI_RESOURCEFLAGS2(),
)

public data class D3DDDICB_DESTROYALLOCATION2FLAGS(public var Anonymous: D3DDDICB_DESTROYALLOCATION2FLAGS_0 = D3DDDICB_DESTROYALLOCATION2FLAGS_0())

public data class D3DDDICB_DESTROYALLOCATION2FLAGS_0(public var Anonymous: D3DDDICB_DESTROYALLOCATION2FLAGS_0_0 = D3DDDICB_DESTROYALLOCATION2FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDICB_DESTROYALLOCATION2FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDICB_LOCK2FLAGS(public var Anonymous: D3DDDICB_LOCK2FLAGS_0 = D3DDDICB_LOCK2FLAGS_0())

public data class D3DDDICB_LOCK2FLAGS_0(public var Anonymous: D3DDDICB_LOCK2FLAGS_0_0 = D3DDDICB_LOCK2FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDICB_LOCK2FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDICB_LOCKFLAGS(public var Anonymous: D3DDDICB_LOCKFLAGS_0 = D3DDDICB_LOCKFLAGS_0())

public data class D3DDDICB_LOCKFLAGS_0(public var Anonymous: D3DDDICB_LOCKFLAGS_0_0 = D3DDDICB_LOCKFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDICB_LOCKFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDICB_SIGNALFLAGS(public var Anonymous: D3DDDICB_SIGNALFLAGS_0 = D3DDDICB_SIGNALFLAGS_0())

public data class D3DDDICB_SIGNALFLAGS_0(public var Anonymous: D3DDDICB_SIGNALFLAGS_0_0 = D3DDDICB_SIGNALFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDICB_SIGNALFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE(public var Anonymous: D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE_0 = D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE_0())

public data class D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE_0(public var Anonymous: D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE_0_0 = D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE_0_0(), public var Value: ULong = 0uL)

public data class D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE_0_0(public var _bitfield: ULong = 0uL)

public data class D3DDDIRECT(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class D3DDDI_ALLOCATIONINFO(
    public var hAllocation: UInt = 0u,
    public var pSystemMem: Long = 0L,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Flags: D3DDDI_ALLOCATIONINFO_0 = D3DDDI_ALLOCATIONINFO_0(),
)

public data class D3DDDI_ALLOCATIONINFO_0(public var Anonymous: D3DDDI_ALLOCATIONINFO_0_0 = D3DDDI_ALLOCATIONINFO_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_ALLOCATIONINFO_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_ALLOCATIONINFO2(
    public var hAllocation: UInt = 0u,
    public var Anonymous1: D3DDDI_ALLOCATIONINFO2_0 = D3DDDI_ALLOCATIONINFO2_0(),
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var VidPnSourceId: UInt = 0u,
    public var Flags: D3DDDI_ALLOCATIONINFO2_1 = D3DDDI_ALLOCATIONINFO2_1(),
    public var GpuVirtualAddress: ULong = 0uL,
    public var Anonymous2: D3DDDI_ALLOCATIONINFO2_2 = D3DDDI_ALLOCATIONINFO2_2(),
    public var Reserved: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_ALLOCATIONINFO2) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.PrivateDriverDataSize != other.PrivateDriverDataSize) return false
        if (this.VidPnSourceId != other.VidPnSourceId) return false
        if (this.Flags != other.Flags) return false
        if (this.GpuVirtualAddress != other.GpuVirtualAddress) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.Anonymous1.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.PrivateDriverDataSize.hashCode()
        result = 31 * result + this.VidPnSourceId.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.GpuVirtualAddress.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DDDI_ALLOCATIONINFO2_0(public var hSection: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(), public var pSystemMem: Long = 0L)

public data class D3DDDI_ALLOCATIONINFO2_2(public var Priority: UInt = 0u, public var Unused: ULong = 0uL)

public data class D3DDDI_ALLOCATIONINFO2_1(public var Anonymous: D3DDDI_ALLOCATIONINFO2_1_0 = D3DDDI_ALLOCATIONINFO2_1_0(), public var Value: UInt = 0u)

public data class D3DDDI_ALLOCATIONINFO2_1_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_ALLOCATIONLIST(public var hAllocation: UInt = 0u, public var Anonymous: D3DDDI_ALLOCATIONLIST_0 = D3DDDI_ALLOCATIONLIST_0())

public data class D3DDDI_ALLOCATIONLIST_0(public var Anonymous: D3DDDI_ALLOCATIONLIST_0_0 = D3DDDI_ALLOCATIONLIST_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_ALLOCATIONLIST_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_CREATECONTEXTFLAGS(public var Anonymous: D3DDDI_CREATECONTEXTFLAGS_0 = D3DDDI_CREATECONTEXTFLAGS_0())

public data class D3DDDI_CREATECONTEXTFLAGS_0(public var Anonymous: D3DDDI_CREATECONTEXTFLAGS_0_0 = D3DDDI_CREATECONTEXTFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_CREATECONTEXTFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_CREATEHWCONTEXTFLAGS(public var Anonymous: D3DDDI_CREATEHWCONTEXTFLAGS_0 = D3DDDI_CREATEHWCONTEXTFLAGS_0())

public data class D3DDDI_CREATEHWCONTEXTFLAGS_0(public var Anonymous: D3DDDI_CREATEHWCONTEXTFLAGS_0_0 = D3DDDI_CREATEHWCONTEXTFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_CREATEHWCONTEXTFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_CREATEHWQUEUEFLAGS(public var Anonymous: D3DDDI_CREATEHWQUEUEFLAGS_0 = D3DDDI_CREATEHWQUEUEFLAGS_0())

public data class D3DDDI_CREATEHWQUEUEFLAGS_0(public var Anonymous: D3DDDI_CREATEHWQUEUEFLAGS_0_0 = D3DDDI_CREATEHWQUEUEFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_CREATEHWQUEUEFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_CREATENATIVEFENCEINFO(
    public var InitialFenceValue: ULong = 0uL,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var EngineAffinity: UInt = 0u,
    public var Flags: D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS = D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS(),
    public var hSyncObject: UInt = 0u,
    public var NativeFenceMapping: D3DDDI_NATIVEFENCEMAPPING = D3DDDI_NATIVEFENCEMAPPING(),
)

public data class D3DDDI_DESTROYPAGINGQUEUE(public var hPagingQueue: UInt = 0u)

public data class D3DDDI_DRIVERESCAPE_CPUEVENTUSAGE(
    public var EscapeType: D3DDDI_DRIVERESCAPETYPE = 0,
    public var hSyncObject: UInt = 0u,
    public var hKmdCpuEvent: ULong = 0uL,
    public var Usage: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_DRIVERESCAPE_CPUEVENTUSAGE) return false
        if (this.EscapeType != other.EscapeType) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.hKmdCpuEvent != other.hKmdCpuEvent) return false
        if (!this.Usage.contentEquals(other.Usage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EscapeType.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.hKmdCpuEvent.hashCode()
        result = 31 * result + this.Usage.contentHashCode()
        return result
    }
}

public data class D3DDDI_DRIVERESCAPE_TRANSLATEALLOCATIONEHANDLE(public var EscapeType: D3DDDI_DRIVERESCAPETYPE = 0, public var hAllocation: UInt = 0u)

public data class D3DDDI_DRIVERESCAPE_TRANSLATERESOURCEHANDLE(public var EscapeType: D3DDDI_DRIVERESCAPETYPE = 0, public var hResource: UInt = 0u)

public data class D3DDDI_DXGI_RGB(
    public var Red: Float = 0.0f,
    public var Green: Float = 0.0f,
    public var Blue: Float = 0.0f,
)

public data class D3DDDI_ESCAPEFLAGS(public var Anonymous: D3DDDI_ESCAPEFLAGS_0 = D3DDDI_ESCAPEFLAGS_0())

public data class D3DDDI_ESCAPEFLAGS_0(public var Anonymous: D3DDDI_ESCAPEFLAGS_0_0 = D3DDDI_ESCAPEFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_ESCAPEFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_EVICT_FLAGS(public var Anonymous: D3DDDI_EVICT_FLAGS_0 = D3DDDI_EVICT_FLAGS_0())

public data class D3DDDI_EVICT_FLAGS_0(public var Anonymous: D3DDDI_EVICT_FLAGS_0_0 = D3DDDI_EVICT_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_EVICT_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_GAMMA_RAMP_DXGI_1(
    public var Scale: D3DDDI_DXGI_RGB = D3DDDI_DXGI_RGB(),
    public var Offset: D3DDDI_DXGI_RGB = D3DDDI_DXGI_RGB(),
    public var GammaCurve: List<D3DDDI_DXGI_RGB> = List(1025) { D3DDDI_DXGI_RGB() },
)

public data class D3DDDI_GAMMA_RAMP_RGB256x3x16(
    public var Red: UShortArray = UShortArray(256),
    public var Green: UShortArray = UShortArray(256),
    public var Blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_GAMMA_RAMP_RGB256x3x16) return false
        if (!this.Red.contentEquals(other.Red)) return false
        if (!this.Green.contentEquals(other.Green)) return false
        if (!this.Blue.contentEquals(other.Blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Red.contentHashCode()
        result = 31 * result + this.Green.contentHashCode()
        result = 31 * result + this.Blue.contentHashCode()
        return result
    }
}

public data class D3DDDI_GETRESOURCEPRESENTPRIVATEDRIVERDATA(
    public var hResource: UInt = 0u,
    public var PrivateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
)

public data class D3DDDI_HDR_METADATA_HDR10(
    public var RedPrimary: UShortArray = UShortArray(2),
    public var GreenPrimary: UShortArray = UShortArray(2),
    public var BluePrimary: UShortArray = UShortArray(2),
    public var WhitePoint: UShortArray = UShortArray(2),
    public var MaxMasteringLuminance: UInt = 0u,
    public var MinMasteringLuminance: UInt = 0u,
    public var MaxContentLightLevel: UShort = 0u,
    public var MaxFrameAverageLightLevel: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_HDR_METADATA_HDR10) return false
        if (!this.RedPrimary.contentEquals(other.RedPrimary)) return false
        if (!this.GreenPrimary.contentEquals(other.GreenPrimary)) return false
        if (!this.BluePrimary.contentEquals(other.BluePrimary)) return false
        if (!this.WhitePoint.contentEquals(other.WhitePoint)) return false
        if (this.MaxMasteringLuminance != other.MaxMasteringLuminance) return false
        if (this.MinMasteringLuminance != other.MinMasteringLuminance) return false
        if (this.MaxContentLightLevel != other.MaxContentLightLevel) return false
        if (this.MaxFrameAverageLightLevel != other.MaxFrameAverageLightLevel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RedPrimary.contentHashCode()
        result = 31 * result + this.GreenPrimary.contentHashCode()
        result = 31 * result + this.BluePrimary.contentHashCode()
        result = 31 * result + this.WhitePoint.contentHashCode()
        result = 31 * result + this.MaxMasteringLuminance.hashCode()
        result = 31 * result + this.MinMasteringLuminance.hashCode()
        result = 31 * result + this.MaxContentLightLevel.hashCode()
        result = 31 * result + this.MaxFrameAverageLightLevel.hashCode()
        return result
    }
}

public data class D3DDDI_HDR_METADATA_HDR10PLUS(public var Data: UByteArray = UByteArray(72)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_HDR_METADATA_HDR10PLUS) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class D3DDDI_KERNELOVERLAYINFO(
    public var hAllocation: UInt = 0u,
    public var DstRect: D3DDDIRECT = D3DDDIRECT(),
    public var SrcRect: D3DDDIRECT = D3DDDIRECT(),
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
)

public data class D3DDDI_MAKERESIDENT(
    public var hPagingQueue: UInt = 0u,
    public var NumAllocations: UInt = 0u,
    public var AllocationList: Long = 0L,
    public var PriorityList: Long = 0L,
    public var Flags: D3DDDI_MAKERESIDENT_FLAGS = D3DDDI_MAKERESIDENT_FLAGS(),
    public var PagingFenceValue: ULong = 0uL,
    public var NumBytesToTrim: ULong = 0uL,
)

public data class D3DDDI_MAKERESIDENT_FLAGS(public var Anonymous: D3DDDI_MAKERESIDENT_FLAGS_0 = D3DDDI_MAKERESIDENT_FLAGS_0())

public data class D3DDDI_MAKERESIDENT_FLAGS_0(public var Anonymous: D3DDDI_MAKERESIDENT_FLAGS_0_0 = D3DDDI_MAKERESIDENT_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_MAKERESIDENT_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_MAPGPUVIRTUALADDRESS(
    public var hPagingQueue: UInt = 0u,
    public var BaseAddress: ULong = 0uL,
    public var MinimumAddress: ULong = 0uL,
    public var MaximumAddress: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var OffsetInPages: ULong = 0uL,
    public var SizeInPages: ULong = 0uL,
    public var Protection: D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE = D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE(),
    public var DriverProtection: ULong = 0uL,
    public var Reserved0: UInt = 0u,
    public var Reserved1: ULong = 0uL,
    public var VirtualAddress: ULong = 0uL,
    public var PagingFenceValue: ULong = 0uL,
)

public data class D3DDDI_MULTISAMPLINGMETHOD(public var NumSamples: UInt = 0u, public var NumQualityLevels: UInt = 0u)

public data class D3DDDI_NATIVEFENCEMAPPING(
    public var CurrentValueCpuVa: Long = 0L,
    public var CurrentValueGpuVa: ULong = 0uL,
    public var MonitoredValueGpuVa: ULong = 0uL,
)

public data class D3DDDI_OFFER_FLAGS(public var Anonymous: D3DDDI_OFFER_FLAGS_0 = D3DDDI_OFFER_FLAGS_0())

public data class D3DDDI_OFFER_FLAGS_0(public var Anonymous: D3DDDI_OFFER_FLAGS_0_0 = D3DDDI_OFFER_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_OFFER_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_OPENALLOCATIONINFO(
    public var hAllocation: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
)

public data class D3DDDI_OPENALLOCATIONINFO2(
    public var hAllocation: UInt = 0u,
    public var pPrivateDriverData: Long = 0L,
    public var PrivateDriverDataSize: UInt = 0u,
    public var GpuVirtualAddress: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_OPENALLOCATIONINFO2) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.PrivateDriverDataSize != other.PrivateDriverDataSize) return false
        if (this.GpuVirtualAddress != other.GpuVirtualAddress) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.PrivateDriverDataSize.hashCode()
        result = 31 * result + this.GpuVirtualAddress.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class D3DDDI_PATCHLOCATIONLIST(
    public var AllocationIndex: UInt = 0u,
    public var Anonymous: D3DDDI_PATCHLOCATIONLIST_0 = D3DDDI_PATCHLOCATIONLIST_0(),
    public var DriverId: UInt = 0u,
    public var AllocationOffset: UInt = 0u,
    public var PatchOffset: UInt = 0u,
    public var SplitOffset: UInt = 0u,
)

public data class D3DDDI_PATCHLOCATIONLIST_0(public var Anonymous: D3DDDI_PATCHLOCATIONLIST_0_0 = D3DDDI_PATCHLOCATIONLIST_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_PATCHLOCATIONLIST_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_QUERYREGISTRY_FLAGS(public var Anonymous: D3DDDI_QUERYREGISTRY_FLAGS_0 = D3DDDI_QUERYREGISTRY_FLAGS_0())

public data class D3DDDI_QUERYREGISTRY_FLAGS_0(public var Anonymous: D3DDDI_QUERYREGISTRY_FLAGS_0_0 = D3DDDI_QUERYREGISTRY_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_QUERYREGISTRY_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_QUERYREGISTRY_INFO(
    public var QueryType: D3DDDI_QUERYREGISTRY_TYPE = 0,
    public var QueryFlags: D3DDDI_QUERYREGISTRY_FLAGS = D3DDDI_QUERYREGISTRY_FLAGS(),
    public var ValueName: UShortArray = UShortArray(260),
    public var ValueType: UInt = 0u,
    public var PhysicalAdapterIndex: UInt = 0u,
    public var OutputValueSize: UInt = 0u,
    public var Status: D3DDDI_QUERYREGISTRY_STATUS = 0,
    public var Anonymous: D3DDDI_QUERYREGISTRY_INFO_0 = D3DDDI_QUERYREGISTRY_INFO_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_QUERYREGISTRY_INFO) return false
        if (this.QueryType != other.QueryType) return false
        if (this.QueryFlags != other.QueryFlags) return false
        if (!this.ValueName.contentEquals(other.ValueName)) return false
        if (this.ValueType != other.ValueType) return false
        if (this.PhysicalAdapterIndex != other.PhysicalAdapterIndex) return false
        if (this.OutputValueSize != other.OutputValueSize) return false
        if (this.Status != other.Status) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.QueryType.hashCode()
        result = 31 * result + this.QueryFlags.hashCode()
        result = 31 * result + this.ValueName.contentHashCode()
        result = 31 * result + this.ValueType.hashCode()
        result = 31 * result + this.PhysicalAdapterIndex.hashCode()
        result = 31 * result + this.OutputValueSize.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class D3DDDI_QUERYREGISTRY_INFO_0(
    public var OutputDword: UInt = 0u,
    public var OutputQword: ULong = 0uL,
    public var OutputString: UShortArray = UShortArray(1),
    public var OutputBinary: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_QUERYREGISTRY_INFO_0) return false
        if (this.OutputDword != other.OutputDword) return false
        if (this.OutputQword != other.OutputQword) return false
        if (!this.OutputString.contentEquals(other.OutputString)) return false
        if (!this.OutputBinary.contentEquals(other.OutputBinary)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OutputDword.hashCode()
        result = 31 * result + this.OutputQword.hashCode()
        result = 31 * result + this.OutputString.contentHashCode()
        result = 31 * result + this.OutputBinary.contentHashCode()
        return result
    }
}

public data class D3DDDI_RATIONAL(public var Numerator: UInt = 0u, public var Denominator: UInt = 0u)

public data class D3DDDI_RESERVEGPUVIRTUALADDRESS(
    public var Anonymous1: D3DDDI_RESERVEGPUVIRTUALADDRESS_0 = D3DDDI_RESERVEGPUVIRTUALADDRESS_0(),
    public var BaseAddress: ULong = 0uL,
    public var MinimumAddress: ULong = 0uL,
    public var MaximumAddress: ULong = 0uL,
    public var Size: ULong = 0uL,
    public var Anonymous2: D3DDDI_RESERVEGPUVIRTUALADDRESS_1 = D3DDDI_RESERVEGPUVIRTUALADDRESS_1(),
    public var Anonymous3: D3DDDI_RESERVEGPUVIRTUALADDRESS_2 = D3DDDI_RESERVEGPUVIRTUALADDRESS_2(),
    public var VirtualAddress: ULong = 0uL,
    public var Anonymous4: D3DDDI_RESERVEGPUVIRTUALADDRESS_3 = D3DDDI_RESERVEGPUVIRTUALADDRESS_3(),
)

public data class D3DDDI_RESERVEGPUVIRTUALADDRESS_0(public var hPagingQueue: UInt = 0u, public var hAdapter: UInt = 0u)

public data class D3DDDI_RESERVEGPUVIRTUALADDRESS_1(public var ReservationType: D3DDDIGPUVIRTUALADDRESS_RESERVATION_TYPE = 0, public var Reserved0: UInt = 0u)

public data class D3DDDI_RESERVEGPUVIRTUALADDRESS_2(public var DriverProtection: ULong = 0uL, public var Reserved1: ULong = 0uL)

public data class D3DDDI_RESERVEGPUVIRTUALADDRESS_3(public var PagingFenceValue: ULong = 0uL, public var Reserved2: ULong = 0uL)

public data class D3DDDI_RESOURCEFLAGS(public var Anonymous: D3DDDI_RESOURCEFLAGS_0 = D3DDDI_RESOURCEFLAGS_0())

public data class D3DDDI_RESOURCEFLAGS_0(public var Anonymous: D3DDDI_RESOURCEFLAGS_0_0 = D3DDDI_RESOURCEFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_RESOURCEFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_RESOURCEFLAGS2(public var Anonymous: D3DDDI_RESOURCEFLAGS2_0 = D3DDDI_RESOURCEFLAGS2_0())

public data class D3DDDI_RESOURCEFLAGS2_0(public var Anonymous: D3DDDI_RESOURCEFLAGS2_0_0 = D3DDDI_RESOURCEFLAGS2_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_RESOURCEFLAGS2_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_SEGMENTPREFERENCE(public var Anonymous: D3DDDI_SEGMENTPREFERENCE_0 = D3DDDI_SEGMENTPREFERENCE_0())

public data class D3DDDI_SEGMENTPREFERENCE_0(public var Anonymous: D3DDDI_SEGMENTPREFERENCE_0_0 = D3DDDI_SEGMENTPREFERENCE_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_SEGMENTPREFERENCE_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_SURFACEINFO(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Depth: UInt = 0u,
    public var pSysMem: Long = 0L,
    public var SysMemPitch: UInt = 0u,
    public var SysMemSlicePitch: UInt = 0u,
)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO(public var Type: D3DDDI_SYNCHRONIZATIONOBJECT_TYPE = 0, public var Anonymous: D3DDDI_SYNCHRONIZATIONOBJECTINFO_0 = D3DDDI_SYNCHRONIZATIONOBJECTINFO_0())

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO_0(
    public var SynchronizationMutex: D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_0 = D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_0(),
    public var Semaphore: D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_1 = D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_1(),
    public var Reserved: D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_2 = D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_2(),
)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_2(public var Reserved: UIntArray = UIntArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_2) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved.contentHashCode()
    }
}

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_1(public var MaxCount: UInt = 0u, public var InitialCount: UInt = 0u)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO_0_0(public var InitialState: BOOL = 0)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2(
    public var Type: D3DDDI_SYNCHRONIZATIONOBJECT_TYPE = 0,
    public var Flags: D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS = D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS(),
    public var Anonymous: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0(),
    public var SharedHandle: UInt = 0u,
)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0(
    public var SynchronizationMutex: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_0 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_0(),
    public var Semaphore: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_1 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_1(),
    public var Fence: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_2 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_2(),
    public var CPUNotification: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_3 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_3(),
    public var MonitoredFence: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_4 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_4(),
    public var PeriodicMonitoredFence: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_5 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_5(),
    public var Reserved: D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_6 = D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_6(),
)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_3(public var Event: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE())

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_2(public var FenceValue: ULong = 0uL)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_4(
    public var InitialFenceValue: ULong = 0uL,
    public var FenceValueCPUVirtualAddress: Long = 0L,
    public var FenceValueGPUVirtualAddress: ULong = 0uL,
    public var EngineAffinity: UInt = 0u,
    public var Padding: UInt = 0u,
)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_5(
    public var hAdapter: UInt = 0u,
    public var VidPnTargetId: UInt = 0u,
    public var Time: ULong = 0uL,
    public var FenceValueCPUVirtualAddress: Long = 0L,
    public var FenceValueGPUVirtualAddress: ULong = 0uL,
    public var EngineAffinity: UInt = 0u,
    public var Padding: UInt = 0u,
)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_6(public var Reserved: ULongArray = ULongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_6) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved.contentHashCode()
    }
}

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_1(public var MaxCount: UInt = 0u, public var InitialCount: UInt = 0u)

public data class D3DDDI_SYNCHRONIZATIONOBJECTINFO2_0_0(public var InitialState: BOOL = 0)

public data class D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS(public var Anonymous: D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS_0 = D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS_0())

public data class D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS_0(public var Anonymous: D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS_0_0 = D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_SYNCHRONIZATIONOBJECT_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_TRIMRESIDENCYSET_FLAGS(public var Anonymous: D3DDDI_TRIMRESIDENCYSET_FLAGS_0 = D3DDDI_TRIMRESIDENCYSET_FLAGS_0())

public data class D3DDDI_TRIMRESIDENCYSET_FLAGS_0(public var Anonymous: D3DDDI_TRIMRESIDENCYSET_FLAGS_0_0 = D3DDDI_TRIMRESIDENCYSET_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_TRIMRESIDENCYSET_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_UPDATEALLOCPROPERTY(
    public var hPagingQueue: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var SupportedSegmentSet: UInt = 0u,
    public var PreferredSegment: D3DDDI_SEGMENTPREFERENCE = D3DDDI_SEGMENTPREFERENCE(),
    public var Flags: D3DDDI_UPDATEALLOCPROPERTY_FLAGS = D3DDDI_UPDATEALLOCPROPERTY_FLAGS(),
    public var PagingFenceValue: ULong = 0uL,
    public var Anonymous: D3DDDI_UPDATEALLOCPROPERTY_0 = D3DDDI_UPDATEALLOCPROPERTY_0(),
)

public data class D3DDDI_UPDATEALLOCPROPERTY_0(public var Anonymous: D3DDDI_UPDATEALLOCPROPERTY_0_0 = D3DDDI_UPDATEALLOCPROPERTY_0_0(), public var PropertyMaskValue: UInt = 0u)

public data class D3DDDI_UPDATEALLOCPROPERTY_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_UPDATEALLOCPROPERTY_FLAGS(public var Anonymous: D3DDDI_UPDATEALLOCPROPERTY_FLAGS_0 = D3DDDI_UPDATEALLOCPROPERTY_FLAGS_0())

public data class D3DDDI_UPDATEALLOCPROPERTY_FLAGS_0(public var Anonymous: D3DDDI_UPDATEALLOCPROPERTY_FLAGS_0_0 = D3DDDI_UPDATEALLOCPROPERTY_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_UPDATEALLOCPROPERTY_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION(public var OperationType: D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_TYPE = 0, public var Anonymous: D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0 = D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0())

public data class D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0(
    public var Map: D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_0 = D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_0(),
    public var MapProtect: D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_1 = D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_1(),
    public var Unmap: D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_2 = D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_2(),
    public var Copy: D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_3 = D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_3(),
)

public data class D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_3(
    public var SourceAddress: ULong = 0uL,
    public var SizeInBytes: ULong = 0uL,
    public var DestAddress: ULong = 0uL,
)

public data class D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_1(
    public var BaseAddress: ULong = 0uL,
    public var SizeInBytes: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var AllocationOffsetInBytes: ULong = 0uL,
    public var AllocationSizeInBytes: ULong = 0uL,
    public var Protection: D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE = D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE(),
    public var DriverProtection: ULong = 0uL,
)

public data class D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_0(
    public var BaseAddress: ULong = 0uL,
    public var SizeInBytes: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var AllocationOffsetInBytes: ULong = 0uL,
    public var AllocationSizeInBytes: ULong = 0uL,
)

public data class D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_0_2(
    public var BaseAddress: ULong = 0uL,
    public var SizeInBytes: ULong = 0uL,
    public var Protection: D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE = D3DDDIGPUVIRTUALADDRESS_PROTECTION_TYPE(),
)

public data class D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS(public var Anonymous: D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS_0 = D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS_0())

public data class D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS_0(public var Anonymous: D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS_0_0 = D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DDDI_WAITFORSYNCHRONIZATIONOBJECTFROMCPU_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DGPU_PHYSICAL_ADDRESS(
    public var SegmentId: UInt = 0u,
    public var Padding: UInt = 0u,
    public var SegmentOffset: ULong = 0uL,
)

public data class D3DHAL_CLIPPEDTRIANGLEFAN(
    public var FirstVertexOffset: UInt = 0u,
    public var dwEdgeFlags: UInt = 0u,
    public var PrimitiveCount: UInt = 0u,
)

public data class D3DHAL_CONTEXTDESTROYALLDATA(public var dwPID: UInt = 0u, public var ddrval: HRESULT = 0)

public data class D3DHAL_CONTEXTDESTROYDATA(public var dwhContext: ULong = 0uL, public var ddrval: HRESULT = 0)

public class D3DHAL_D3DDX6EXTENDEDCAPS(
    public var dwSize: UInt = 0u,
    public var dwMinTextureWidth: UInt = 0u,
    public var dwMaxTextureWidth: UInt = 0u,
    public var dwMinTextureHeight: UInt = 0u,
    public var dwMaxTextureHeight: UInt = 0u,
    public var dwMinStippleWidth: UInt = 0u,
    public var dwMaxStippleWidth: UInt = 0u,
    public var dwMinStippleHeight: UInt = 0u,
    public var dwMaxStippleHeight: UInt = 0u,
    public var dwMaxTextureRepeat: UInt = 0u,
    public var dwMaxTextureAspectRatio: UInt = 0u,
    public var dwMaxAnisotropy: UInt = 0u,
    public var dvGuardBandLeft: Float = 0.0f,
    public var dvGuardBandTop: Float = 0.0f,
    public var dvGuardBandRight: Float = 0.0f,
    public var dvGuardBandBottom: Float = 0.0f,
    public var dvExtentsAdjust: Float = 0.0f,
    public var dwStencilCaps: UInt = 0u,
    public var dwFVFCaps: UInt = 0u,
    public var dwTextureOpCaps: UInt = 0u,
    public var wMaxTextureBlendStages: UShort = 0u,
    public var wMaxSimultaneousTextures: UShort = 0u,
)

public class D3DHAL_D3DEXTENDEDCAPS(
    public var dwSize: UInt = 0u,
    public var dwMinTextureWidth: UInt = 0u,
    public var dwMaxTextureWidth: UInt = 0u,
    public var dwMinTextureHeight: UInt = 0u,
    public var dwMaxTextureHeight: UInt = 0u,
    public var dwMinStippleWidth: UInt = 0u,
    public var dwMaxStippleWidth: UInt = 0u,
    public var dwMinStippleHeight: UInt = 0u,
    public var dwMaxStippleHeight: UInt = 0u,
    public var dwMaxTextureRepeat: UInt = 0u,
    public var dwMaxTextureAspectRatio: UInt = 0u,
    public var dwMaxAnisotropy: UInt = 0u,
    public var dvGuardBandLeft: Float = 0.0f,
    public var dvGuardBandTop: Float = 0.0f,
    public var dvGuardBandRight: Float = 0.0f,
    public var dvGuardBandBottom: Float = 0.0f,
    public var dvExtentsAdjust: Float = 0.0f,
    public var dwStencilCaps: UInt = 0u,
    public var dwFVFCaps: UInt = 0u,
    public var dwTextureOpCaps: UInt = 0u,
    public var wMaxTextureBlendStages: UShort = 0u,
    public var wMaxSimultaneousTextures: UShort = 0u,
    public var dwMaxActiveLights: UInt = 0u,
    public var dvMaxVertexW: Float = 0.0f,
    public var wMaxUserClipPlanes: UShort = 0u,
    public var wMaxVertexBlendMatrices: UShort = 0u,
    public var dwVertexProcessingCaps: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var dwReserved4: UInt = 0u,
)

public data class D3DHAL_DP2ADDDIRTYRECT(public var dwSurface: UInt = 0u, public var rDirtyArea: Win32.Foundation.RECTL = Win32.Foundation.RECTL())

public data class D3DHAL_DP2BLT(
    public var dwSource: UInt = 0u,
    public var rSource: Win32.Foundation.RECTL = Win32.Foundation.RECTL(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Win32.Foundation.RECTL = Win32.Foundation.RECTL(),
    public var dwDestMipLevel: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class D3DHAL_DP2CLEAR(
    public var dwFlags: UInt = 0u,
    public var dwFillColor: UInt = 0u,
    public var dvFillDepth: Float = 0.0f,
    public var dwFillStencil: UInt = 0u,
    public var Rects: List<Win32.Foundation.RECT> = List(1) { Win32.Foundation.RECT() },
)

public data class D3DHAL_DP2COLORFILL(
    public var dwSurface: UInt = 0u,
    public var rRect: Win32.Foundation.RECTL = Win32.Foundation.RECTL(),
    public var Color: UInt = 0u,
)

public data class D3DHAL_DP2COMMAND(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var Anonymous: D3DHAL_DP2COMMAND_0 = D3DHAL_DP2COMMAND_0(),
)

public data class D3DHAL_DP2COMMAND_0(public var wPrimitiveCount: UShort = 0u, public var wStateCount: UShort = 0u)

public data class D3DHAL_DP2CREATELIGHT(public var dwIndex: UInt = 0u)

public data class D3DHAL_DP2CREATEPIXELSHADER(public var dwHandle: UInt = 0u, public var dwCodeSize: UInt = 0u)

public data class D3DHAL_DP2CREATEVERTEXSHADER(
    public var dwHandle: UInt = 0u,
    public var dwDeclSize: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
)

public data class D3DHAL_DP2CREATEVERTEXSHADERDECL(public var dwHandle: UInt = 0u, public var dwNumVertexElements: UInt = 0u)

public data class D3DHAL_DP2CREATEVERTEXSHADERFUNC(public var dwHandle: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3DHAL_DP2DELETEQUERY(public var dwQueryID: UInt = 0u)

public data class D3DHAL_DP2DRAWRECTPATCH(public var Handle: UInt = 0u, public var Flags: UInt = 0u)

public data class D3DHAL_DP2DRAWTRIPATCH(public var Handle: UInt = 0u, public var Flags: UInt = 0u)

public data class D3DHAL_DP2EXT(public var dwExtToken: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3DHAL_DP2INDEXEDLINELIST(public var wV1: UShort = 0u, public var wV2: UShort = 0u)

public data class D3DHAL_DP2INDEXEDLINESTRIP(public var wV: UShortArray = UShortArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DHAL_DP2INDEXEDLINESTRIP) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3DHAL_DP2INDEXEDTRIANGLEFAN(public var wV: UShortArray = UShortArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DHAL_DP2INDEXEDTRIANGLEFAN) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3DHAL_DP2INDEXEDTRIANGLELIST(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
    public var wFlags: UShort = 0u,
)

public data class D3DHAL_DP2INDEXEDTRIANGLELIST2(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
)

public data class D3DHAL_DP2INDEXEDTRIANGLESTRIP(public var wV: UShortArray = UShortArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DHAL_DP2INDEXEDTRIANGLESTRIP) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3DHAL_DP2ISSUEQUERY(public var dwQueryID: UInt = 0u, public var dwFlags: UInt = 0u)

public data class D3DHAL_DP2LINELIST(public var wVStart: UShort = 0u)

public data class D3DHAL_DP2LINESTRIP(public var wVStart: UShort = 0u)

public data class D3DHAL_DP2PIXELSHADER(public var dwHandle: UInt = 0u)

public data class D3DHAL_DP2POINTS(public var wCount: UShort = 0u, public var wVStart: UShort = 0u)

public data class D3DHAL_DP2RESPONSE(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wStateCount: UShort = 0u,
    public var dwTotalSize: UInt = 0u,
)

public data class D3DHAL_DP2RESPONSEQUERY(public var dwQueryID: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3DHAL_DP2SETCLIPPLANE(public var dwIndex: UInt = 0u, public var plane: FloatArray = FloatArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DHAL_DP2SETCLIPPLANE) return false
        if (this.dwIndex != other.dwIndex) return false
        if (!this.plane.contentEquals(other.plane)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.plane.contentHashCode()
        return result
    }
}

public data class D3DHAL_DP2SETCONVOLUTIONKERNELMONO(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class D3DHAL_DP2SETDEPTHSTENCIL(public var hZBuffer: UInt = 0u)

public data class D3DHAL_DP2SETINDICES(public var dwVBHandle: UInt = 0u, public var dwStride: UInt = 0u)

public data class D3DHAL_DP2SETLIGHT(public var dwIndex: UInt = 0u, public var dwDataType: UInt = 0u)

public data class D3DHAL_DP2SETPALETTE(
    public var dwPaletteHandle: UInt = 0u,
    public var dwPaletteFlags: UInt = 0u,
    public var dwSurfaceHandle: UInt = 0u,
)

public data class D3DHAL_DP2SETPIXELSHADERCONST(public var dwRegister: UInt = 0u, public var dwCount: UInt = 0u)

public data class D3DHAL_DP2SETPRIORITY(public var dwDDSurface: UInt = 0u, public var dwPriority: UInt = 0u)

public data class D3DHAL_DP2SETRENDERTARGET(public var hRenderTarget: UInt = 0u, public var hZBuffer: UInt = 0u)

public data class D3DHAL_DP2SETRENDERTARGET2(public var RTIndex: UInt = 0u, public var hRenderTarget: UInt = 0u)

public data class D3DHAL_DP2SETSTREAMSOURCE(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3DHAL_DP2SETSTREAMSOURCE2(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3DHAL_DP2SETSTREAMSOURCEFREQ(public var dwStream: UInt = 0u, public var dwDivider: UInt = 0u)

public data class D3DHAL_DP2SETSTREAMSOURCEUM(public var dwStream: UInt = 0u, public var dwStride: UInt = 0u)

public data class D3DHAL_DP2SETTEXLOD(public var dwDDSurface: UInt = 0u, public var dwLOD: UInt = 0u)

public data class D3DHAL_DP2SETVERTEXSHADERCONST(public var dwRegister: UInt = 0u, public var dwCount: UInt = 0u)

public data class D3DHAL_DP2STARTVERTEX(public var wVStart: UShort = 0u)

public data class D3DHAL_DP2SURFACEBLT(
    public var dwSource: UInt = 0u,
    public var rSource: Win32.Foundation.RECTL = Win32.Foundation.RECTL(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Win32.Foundation.RECTL = Win32.Foundation.RECTL(),
    public var dwDestMipLevel: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class D3DHAL_DP2TEXBLT(
    public var dwDDDestSurface: UInt = 0u,
    public var dwDDSrcSurface: UInt = 0u,
    public var pDest: Win32.Foundation.POINT = Win32.Foundation.POINT(),
    public var rSrc: Win32.Foundation.RECTL = Win32.Foundation.RECTL(),
    public var dwFlags: UInt = 0u,
)

public data class D3DHAL_DP2TEXTURESTAGESTATE(
    public var wStage: UShort = 0u,
    public var TSState: UShort = 0u,
    public var dwValue: UInt = 0u,
)

public data class D3DHAL_DP2TRIANGLEFAN(public var wVStart: UShort = 0u)

public data class D3DHAL_DP2TRIANGLEFAN_IMM(public var dwEdgeFlags: UInt = 0u)

public data class D3DHAL_DP2TRIANGLELIST(public var wVStart: UShort = 0u)

public data class D3DHAL_DP2TRIANGLESTRIP(public var wVStart: UShort = 0u)

public data class D3DHAL_DP2UPDATEPALETTE(
    public var dwPaletteHandle: UInt = 0u,
    public var wStartIndex: UShort = 0u,
    public var wNumEntries: UShort = 0u,
)

public data class D3DHAL_DP2VERTEXSHADER(public var dwHandle: UInt = 0u)

public data class D3DHAL_DP2VIEWPORTINFO(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
)

public data class D3DHAL_DP2WINFO(public var dvWNear: Float = 0.0f, public var dvWFar: Float = 0.0f)

public data class D3DHAL_DP2ZRANGE(public var dvMinZ: Float = 0.0f, public var dvMaxZ: Float = 0.0f)

public data class D3DHAL_DRAWPRIMCOUNTS(
    public var wNumStateChanges: UShort = 0u,
    public var wPrimitiveType: UShort = 0u,
    public var wVertexType: UShort = 0u,
    public var wNumVertices: UShort = 0u,
)

public data class D3DHAL_DRAWPRIMITIVESDATA(
    public var dwhContext: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var lpvData: Long = 0L,
    public var dwFVFControl: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DHAL_SCENECAPTUREDATA(
    public var dwhContext: ULong = 0uL,
    public var dwFlag: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DHAL_TEXTUREDESTROYDATA(
    public var dwhContext: ULong = 0uL,
    public var dwHandle: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DHAL_TEXTUREGETSURFDATA(
    public var dwhContext: ULong = 0uL,
    public var lpDDS: ULong = 0uL,
    public var dwHandle: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DHAL_TEXTURESWAPDATA(
    public var dwhContext: ULong = 0uL,
    public var dwHandle1: UInt = 0u,
    public var dwHandle2: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DHAL_VALIDATETEXTURESTAGESTATEDATA(
    public var dwhContext: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var dwReserved: ULong = 0uL,
    public var dwNumPasses: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DKMDT_2DREGION(public var cx: UInt = 0u, public var cy: UInt = 0u)

public data class D3DKMDT_3x4_COLORSPACE_TRANSFORM(
    public var ColorMatrix3x4: FloatArray = FloatArray(12),
    public var ScalarMultiplier: Float = 0.0f,
    public var LookupTable1D: List<D3DDDI_DXGI_RGB> = List(4096) { D3DDDI_DXGI_RGB() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMDT_3x4_COLORSPACE_TRANSFORM) return false
        if (!this.ColorMatrix3x4.contentEquals(other.ColorMatrix3x4)) return false
        if (this.ScalarMultiplier != other.ScalarMultiplier) return false
        if (this.LookupTable1D != other.LookupTable1D) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ColorMatrix3x4.contentHashCode()
        result = 31 * result + this.ScalarMultiplier.hashCode()
        result = 31 * result + this.LookupTable1D.hashCode()
        return result
    }
}

public data class D3DKMDT_COLORSPACE_TRANSFORM_MATRIX_V2(
    public var StageControlLookupTable1DDegamma: D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL = 0,
    public var LookupTable1DDegamma: List<D3DDDI_DXGI_RGB> = List(4096) { D3DDDI_DXGI_RGB() },
    public var StageControlColorMatrix3x3: D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL = 0,
    public var ColorMatrix3x3: FloatArray = FloatArray(9),
    public var StageControlLookupTable1DRegamma: D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL = 0,
    public var LookupTable1DRegamma: List<D3DDDI_DXGI_RGB> = List(4096) { D3DDDI_DXGI_RGB() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMDT_COLORSPACE_TRANSFORM_MATRIX_V2) return false
        if (this.StageControlLookupTable1DDegamma != other.StageControlLookupTable1DDegamma) return false
        if (this.LookupTable1DDegamma != other.LookupTable1DDegamma) return false
        if (this.StageControlColorMatrix3x3 != other.StageControlColorMatrix3x3) return false
        if (!this.ColorMatrix3x3.contentEquals(other.ColorMatrix3x3)) return false
        if (this.StageControlLookupTable1DRegamma != other.StageControlLookupTable1DRegamma) return false
        if (this.LookupTable1DRegamma != other.LookupTable1DRegamma) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StageControlLookupTable1DDegamma.hashCode()
        result = 31 * result + this.LookupTable1DDegamma.hashCode()
        result = 31 * result + this.StageControlColorMatrix3x3.hashCode()
        result = 31 * result + this.ColorMatrix3x3.contentHashCode()
        result = 31 * result + this.StageControlLookupTable1DRegamma.hashCode()
        result = 31 * result + this.LookupTable1DRegamma.hashCode()
        return result
    }
}

public data class D3DKMDT_COLOR_COEFF_DYNAMIC_RANGES(
    public var FirstChannel: UInt = 0u,
    public var SecondChannel: UInt = 0u,
    public var ThirdChannel: UInt = 0u,
    public var FourthChannel: UInt = 0u,
)

public data class D3DKMDT_DISPLAYMODE_FLAGS(public var _bitfield1: UInt = 0u, public var _bitfield2: UInt = 0u)

public data class D3DKMDT_FREQUENCY_RANGE(
    public var MinVSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var MaxVSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var MinHSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var MaxHSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
)

public data class D3DKMDT_GAMMA_RAMP(
    public var Type: D3DDDI_GAMMARAMP_TYPE = 0,
    public var DataSize: ULong = 0uL,
    public var Data: D3DKMDT_GAMMA_RAMP_0 = D3DKMDT_GAMMA_RAMP_0(),
)

public data class D3DKMDT_GAMMA_RAMP_0(
    public var pRgb256x3x16: Long = 0L,
    public var pDxgi1: Long = 0L,
    public var p3x4: Long = 0L,
    public var pMatrixV2: Long = 0L,
    public var pRaw: Long = 0L,
)

public data class D3DKMDT_GDISURFACEDATA(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Format: D3DDDIFORMAT = 0u,
    public var Type: D3DKMDT_GDISURFACETYPE = 0,
    public var Flags: D3DKMDT_GDISURFACEFLAGS = D3DKMDT_GDISURFACEFLAGS(),
    public var Pitch: UInt = 0u,
)

public data class D3DKMDT_GDISURFACEFLAGS(public var Anonymous: D3DKMDT_GDISURFACEFLAGS_0 = D3DKMDT_GDISURFACEFLAGS_0())

public data class D3DKMDT_GDISURFACEFLAGS_0(public var Anonymous: D3DKMDT_GDISURFACEFLAGS_0_0 = D3DKMDT_GDISURFACEFLAGS_0_0(), public var Value: UInt = 0u)

public data class D3DKMDT_GDISURFACEFLAGS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMDT_GRAPHICS_RENDERING_FORMAT(
    public var PrimSurfSize: D3DKMDT_2DREGION = D3DKMDT_2DREGION(),
    public var VisibleRegionSize: D3DKMDT_2DREGION = D3DKMDT_2DREGION(),
    public var Stride: UInt = 0u,
    public var PixelFormat: D3DDDIFORMAT = 0u,
    public var ColorBasis: D3DKMDT_COLOR_BASIS = 0,
    public var PixelValueAccessMode: D3DKMDT_PIXEL_VALUE_ACCESS_MODE = 0,
)

public data class D3DKMDT_MONITOR_DESCRIPTOR(
    public var Id: UInt = 0u,
    public var Type: D3DKMDT_MONITOR_DESCRIPTOR_TYPE = 0,
    public var DataSize: ULong = 0uL,
    public var pData: Long = 0L,
    public var Origin: D3DKMDT_MONITOR_CAPABILITIES_ORIGIN = 0,
)

public data class D3DKMDT_MONITOR_FREQUENCY_RANGE(
    public var Origin: D3DKMDT_MONITOR_CAPABILITIES_ORIGIN = 0,
    public var RangeLimits: D3DKMDT_FREQUENCY_RANGE = D3DKMDT_FREQUENCY_RANGE(),
    public var ConstraintType: D3DKMDT_MONITOR_FREQUENCY_RANGE_CONSTRAINT = 0,
    public var Constraint: D3DKMDT_MONITOR_FREQUENCY_RANGE_0 = D3DKMDT_MONITOR_FREQUENCY_RANGE_0(),
)

public data class D3DKMDT_MONITOR_FREQUENCY_RANGE_0(public var ActiveSize: D3DKMDT_2DREGION = D3DKMDT_2DREGION(), public var MaxPixelRate: ULong = 0uL)

public data class D3DKMDT_MONITOR_SOURCE_MODE(
    public var Id: UInt = 0u,
    public var VideoSignalInfo: D3DKMDT_VIDEO_SIGNAL_INFO = D3DKMDT_VIDEO_SIGNAL_INFO(),
    public var ColorBasis: D3DKMDT_COLOR_BASIS = 0,
    public var ColorCoeffDynamicRanges: D3DKMDT_COLOR_COEFF_DYNAMIC_RANGES = D3DKMDT_COLOR_COEFF_DYNAMIC_RANGES(),
    public var Origin: D3DKMDT_MONITOR_CAPABILITIES_ORIGIN = 0,
    public var Preference: D3DKMDT_MODE_PREFERENCE = 0,
)

public data class D3DKMDT_PALETTEDATA(
    public var Red: UByte = 0u,
    public var Green: UByte = 0u,
    public var Blue: UByte = 0u,
    public var Unused: UByte = 0u,
)

public data class D3DKMDT_PREEMPTION_CAPS(public var GraphicsPreemptionGranularity: D3DKMDT_GRAPHICS_PREEMPTION_GRANULARITY = 0, public var ComputePreemptionGranularity: D3DKMDT_COMPUTE_PREEMPTION_GRANULARITY = 0)

public data class D3DKMDT_SHADOWSURFACEDATA(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Format: D3DDDIFORMAT = 0u,
    public var Pitch: UInt = 0u,
)

public data class D3DKMDT_SHAREDPRIMARYSURFACEDATA(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Format: D3DDDIFORMAT = 0u,
    public var RefreshRate: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var VidPnSourceId: UInt = 0u,
)

public data class D3DKMDT_STAGINGSURFACEDATA(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Pitch: UInt = 0u,
)

public data class D3DKMDT_VIDEO_PRESENT_SOURCE(public var Id: UInt = 0u, public var dwReserved: UInt = 0u)

public data class D3DKMDT_VIDEO_PRESENT_TARGET(
    public var Id: UInt = 0u,
    public var VideoOutputTechnology: D3DKMDT_VIDEO_OUTPUT_TECHNOLOGY = 0,
    public var VideoOutputHpdAwareness: DXGK_CHILD_DEVICE_HPD_AWARENESS = 0,
    public var MonitorOrientationAwareness: D3DKMDT_MONITOR_ORIENTATION_AWARENESS = 0,
    public var SupportsSdtvModes: Boolean = false,
)

public data class D3DKMDT_VIDEO_SIGNAL_INFO(
    public var VideoStandard: D3DKMDT_VIDEO_SIGNAL_STANDARD = 0,
    public var TotalSize: D3DKMDT_2DREGION = D3DKMDT_2DREGION(),
    public var ActiveSize: D3DKMDT_2DREGION = D3DKMDT_2DREGION(),
    public var VSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var HSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
    public var PixelRate: ULong = 0uL,
    public var Anonymous: D3DKMDT_VIDEO_SIGNAL_INFO_0 = D3DKMDT_VIDEO_SIGNAL_INFO_0(),
)

public data class D3DKMDT_VIDEO_SIGNAL_INFO_0(public var AdditionalSignalInfo: D3DKMDT_VIDEO_SIGNAL_INFO_0_0 = D3DKMDT_VIDEO_SIGNAL_INFO_0_0(), public var ScanLineOrdering: D3DDDI_VIDEO_SIGNAL_SCANLINE_ORDERING = 0)

public data class D3DKMDT_VIDEO_SIGNAL_INFO_0_0(public var _bitfield: Int = 0)

public data class D3DKMDT_VIDPN_HW_CAPABILITY(public var _bitfield: UInt = 0u)

public data class D3DKMDT_VIDPN_PRESENT_PATH(
    public var VidPnSourceId: UInt = 0u,
    public var VidPnTargetId: UInt = 0u,
    public var ImportanceOrdinal: D3DKMDT_VIDPN_PRESENT_PATH_IMPORTANCE = 0,
    public var ContentTransformation: D3DKMDT_VIDPN_PRESENT_PATH_TRANSFORMATION = D3DKMDT_VIDPN_PRESENT_PATH_TRANSFORMATION(),
    public var VisibleFromActiveTLOffset: D3DKMDT_2DREGION = D3DKMDT_2DREGION(),
    public var VisibleFromActiveBROffset: D3DKMDT_2DREGION = D3DKMDT_2DREGION(),
    public var VidPnTargetColorBasis: D3DKMDT_COLOR_BASIS = 0,
    public var VidPnTargetColorCoeffDynamicRanges: D3DKMDT_COLOR_COEFF_DYNAMIC_RANGES = D3DKMDT_COLOR_COEFF_DYNAMIC_RANGES(),
    public var Content: D3DKMDT_VIDPN_PRESENT_PATH_CONTENT = 0,
    public var CopyProtection: D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION = D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION(),
    public var GammaRamp: D3DKMDT_GAMMA_RAMP = D3DKMDT_GAMMA_RAMP(),
)

public data class D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION(
    public var CopyProtectionType: D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION_TYPE = 0,
    public var APSTriggerBits: UInt = 0u,
    public var OEMCopyProtection: UByteArray = UByteArray(256),
    public var CopyProtectionSupport: D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION_SUPPORT = D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION_SUPPORT(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION) return false
        if (this.CopyProtectionType != other.CopyProtectionType) return false
        if (this.APSTriggerBits != other.APSTriggerBits) return false
        if (!this.OEMCopyProtection.contentEquals(other.OEMCopyProtection)) return false
        if (this.CopyProtectionSupport != other.CopyProtectionSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CopyProtectionType.hashCode()
        result = 31 * result + this.APSTriggerBits.hashCode()
        result = 31 * result + this.OEMCopyProtection.contentHashCode()
        result = 31 * result + this.CopyProtectionSupport.hashCode()
        return result
    }
}

public data class D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION_SUPPORT(public var _bitfield: UInt = 0u)

public data class D3DKMDT_VIDPN_PRESENT_PATH_ROTATION_SUPPORT(public var _bitfield: UInt = 0u)

public data class D3DKMDT_VIDPN_PRESENT_PATH_SCALING_SUPPORT(public var _bitfield: UInt = 0u)

public data class D3DKMDT_VIDPN_PRESENT_PATH_TRANSFORMATION(
    public var Scaling: D3DKMDT_VIDPN_PRESENT_PATH_SCALING = 0,
    public var ScalingSupport: D3DKMDT_VIDPN_PRESENT_PATH_SCALING_SUPPORT = D3DKMDT_VIDPN_PRESENT_PATH_SCALING_SUPPORT(),
    public var Rotation: D3DKMDT_VIDPN_PRESENT_PATH_ROTATION = 0,
    public var RotationSupport: D3DKMDT_VIDPN_PRESENT_PATH_ROTATION_SUPPORT = D3DKMDT_VIDPN_PRESENT_PATH_ROTATION_SUPPORT(),
)

public data class D3DKMDT_VIDPN_SOURCE_MODE(
    public var Id: UInt = 0u,
    public var Type: D3DKMDT_VIDPN_SOURCE_MODE_TYPE = 0,
    public var Format: D3DKMDT_VIDPN_SOURCE_MODE_0 = D3DKMDT_VIDPN_SOURCE_MODE_0(),
)

public data class D3DKMDT_VIDPN_SOURCE_MODE_0(public var Graphics: D3DKMDT_GRAPHICS_RENDERING_FORMAT = D3DKMDT_GRAPHICS_RENDERING_FORMAT(), public var Text: D3DKMDT_TEXT_RENDERING_FORMAT = 0)

public data class D3DKMDT_VIDPN_TARGET_MODE(
    public var Id: UInt = 0u,
    public var VideoSignalInfo: D3DKMDT_VIDEO_SIGNAL_INFO = D3DKMDT_VIDEO_SIGNAL_INFO(),
    public var Anonymous: D3DKMDT_VIDPN_TARGET_MODE_0 = D3DKMDT_VIDPN_TARGET_MODE_0(),
    public var MinimumVSyncFreq: D3DDDI_RATIONAL = D3DDDI_RATIONAL(),
)

public data class D3DKMDT_VIDPN_TARGET_MODE_0(public var WireFormatAndPreference: D3DKMDT_WIRE_FORMAT_AND_PREFERENCE = D3DKMDT_WIRE_FORMAT_AND_PREFERENCE(), public var Anonymous: D3DKMDT_VIDPN_TARGET_MODE_0_0 = D3DKMDT_VIDPN_TARGET_MODE_0_0())

public data class D3DKMDT_VIDPN_TARGET_MODE_0_0(public var _bitfield: Int = 0)

public data class D3DKMDT_VIRTUALGPUSURFACEDATA(
    public var Size: ULong = 0uL,
    public var Alignment: UInt = 0u,
    public var DriverSegmentId: UInt = 0u,
    public var PrivateDriverData: UInt = 0u,
)

public data class D3DKMDT_WIRE_FORMAT_AND_PREFERENCE(public var Anonymous: D3DKMDT_WIRE_FORMAT_AND_PREFERENCE_0 = D3DKMDT_WIRE_FORMAT_AND_PREFERENCE_0(), public var Value: UInt = 0u)

public data class D3DKMDT_WIRE_FORMAT_AND_PREFERENCE_0(public var _bitfield: Int = 0)

public data class D3DKMT_ACQUIREKEYEDMUTEX(
    public var hKeyedMutex: UInt = 0u,
    public var Key: ULong = 0uL,
    public var pTimeout: Long = 0L,
    public var FenceValue: ULong = 0uL,
)

public data class D3DKMT_ACQUIREKEYEDMUTEX2(
    public var hKeyedMutex: UInt = 0u,
    public var Key: ULong = 0uL,
    public var pTimeout: Long = 0L,
    public var FenceValue: ULong = 0uL,
    public var pPrivateRuntimeData: Long = 0L,
    public var PrivateRuntimeDataSize: UInt = 0u,
)

public data class D3DKMT_ACTIVATE_SPECIFIC_DIAG_ESCAPE(public var Type: D3DKMT_ACTIVATE_SPECIFIC_DIAG_TYPE = 0, public var Activate: BOOL = 0)

public data class D3DKMT_ADAPTERADDRESS(
    public var BusNumber: UInt = 0u,
    public var DeviceNumber: UInt = 0u,
    public var FunctionNumber: UInt = 0u,
)

public data class D3DKMT_ADAPTERINFO(
    public var hAdapter: UInt = 0u,
    public var AdapterLuid: Win32.Foundation.LUID = Win32.Foundation.LUID(),
    public var NumOfSources: UInt = 0u,
    public var bPrecisePresentRegionsPreferred: BOOL = 0,
)

public data class D3DKMT_ADAPTERREGISTRYINFO(
    public var AdapterString: UShortArray = UShortArray(260),
    public var BiosString: UShortArray = UShortArray(260),
    public var DacType: UShortArray = UShortArray(260),
    public var ChipType: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_ADAPTERREGISTRYINFO) return false
        if (!this.AdapterString.contentEquals(other.AdapterString)) return false
        if (!this.BiosString.contentEquals(other.BiosString)) return false
        if (!this.DacType.contentEquals(other.DacType)) return false
        if (!this.ChipType.contentEquals(other.ChipType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdapterString.contentHashCode()
        result = 31 * result + this.BiosString.contentHashCode()
        result = 31 * result + this.DacType.contentHashCode()
        result = 31 * result + this.ChipType.contentHashCode()
        return result
    }
}

public data class D3DKMT_ADAPTERTYPE(public var Anonymous: D3DKMT_ADAPTERTYPE_0 = D3DKMT_ADAPTERTYPE_0())

public data class D3DKMT_ADAPTERTYPE_0(public var Anonymous: D3DKMT_ADAPTERTYPE_0_0 = D3DKMT_ADAPTERTYPE_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_ADAPTERTYPE_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_ADAPTER_PERFDATA(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var MemoryFrequency: ULong = 0uL,
    public var MaxMemoryFrequency: ULong = 0uL,
    public var MaxMemoryFrequencyOC: ULong = 0uL,
    public var MemoryBandwidth: ULong = 0uL,
    public var PCIEBandwidth: ULong = 0uL,
    public var FanRPM: UInt = 0u,
    public var Power: UInt = 0u,
    public var Temperature: UInt = 0u,
    public var PowerStateOverride: UByte = 0u,
)

public data class D3DKMT_ADAPTER_PERFDATACAPS(
    public var PhysicalAdapterIndex: UInt = 0u,
    public var MaxMemoryBandwidth: ULong = 0uL,
    public var MaxPCIEBandwidth: ULong = 0uL,
    public var MaxFanRPM: UInt = 0u,
    public var TemperatureMax: UInt = 0u,
    public var TemperatureWarning: UInt = 0u,
)
