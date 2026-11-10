@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl

public data class D3dddiargCreateresource(
    public var format: D3dddiformat = 0u,
    public var pool: D3dddiPool = 0,
    public var multisampleType: D3dddimultisampleType = 0,
    public var multisampleQuality: UInt = 0u,
    public var pSurfList: D3dddiSurfaceinfo? = null,
    public var surfCount: UInt = 0u,
    public var mipLevels: UInt = 0u,
    public var fvf: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var refreshRate: D3dddiRational = D3dddiRational(),
    public var hResource: Handle = null,
    public var flags: D3dddiResourceflags = D3dddiResourceflags(),
    public var rotation: D3dddiRotation = 0,
)

public data class D3dddiargCreateresource2(
    public var format: D3dddiformat = 0u,
    public var pool: D3dddiPool = 0,
    public var multisampleType: D3dddimultisampleType = 0,
    public var multisampleQuality: UInt = 0u,
    public var pSurfList: D3dddiSurfaceinfo? = null,
    public var surfCount: UInt = 0u,
    public var mipLevels: UInt = 0u,
    public var fvf: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var refreshRate: D3dddiRational = D3dddiRational(),
    public var hResource: Handle = null,
    public var flags: D3dddiResourceflags = D3dddiResourceflags(),
    public var rotation: D3dddiRotation = 0,
    public var flags2: D3dddiResourceflags2 = D3dddiResourceflags2(),
)

public data class D3dddicbDestroyallocation2flags(public var anonymous: D3dddicbDestroyallocation2flags0 = D3dddicbDestroyallocation2flags0())

public data class D3dddicbDestroyallocation2flags0(public var anonymous: D3dddicbDestroyallocation2flags00 = D3dddicbDestroyallocation2flags00(), public var value: UInt = 0u)

public data class D3dddicbDestroyallocation2flags00(public var bitfield: UInt = 0u)

public data class D3dddicbLock2flags(public var anonymous: D3dddicbLock2flags0 = D3dddicbLock2flags0())

public data class D3dddicbLock2flags0(public var anonymous: D3dddicbLock2flags00 = D3dddicbLock2flags00(), public var value: UInt = 0u)

public data class D3dddicbLock2flags00(public var bitfield: UInt = 0u)

public data class D3dddicbLockflags(public var anonymous: D3dddicbLockflags0 = D3dddicbLockflags0())

public data class D3dddicbLockflags0(public var anonymous: D3dddicbLockflags00 = D3dddicbLockflags00(), public var value: UInt = 0u)

public data class D3dddicbLockflags00(public var bitfield: UInt = 0u)

public data class D3dddicbSignalflags(public var anonymous: D3dddicbSignalflags0 = D3dddicbSignalflags0())

public data class D3dddicbSignalflags0(public var anonymous: D3dddicbSignalflags00 = D3dddicbSignalflags00(), public var value: UInt = 0u)

public data class D3dddicbSignalflags00(public var bitfield: UInt = 0u)

public data class D3dddigpuvirtualaddressProtectionType(public var anonymous: D3dddigpuvirtualaddressProtectionType0 = D3dddigpuvirtualaddressProtectionType0())

public data class D3dddigpuvirtualaddressProtectionType0(public var anonymous: D3dddigpuvirtualaddressProtectionType00 = D3dddigpuvirtualaddressProtectionType00(), public var value: ULong = 0uL)

public data class D3dddigpuvirtualaddressProtectionType00(public var bitfield: ULong = 0uL)

public data class D3dddirect(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class D3dddiAllocationinfo(
    public var hAllocation: UInt = 0u,
    public var pSystemMem: COpaquePointer? = null,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var flags: D3dddiAllocationinfo0 = D3dddiAllocationinfo0(),
)

public data class D3dddiAllocationinfo0(public var anonymous: D3dddiAllocationinfo00 = D3dddiAllocationinfo00(), public var value: UInt = 0u)

public data class D3dddiAllocationinfo00(public var bitfield: UInt = 0u)

public data class D3dddiAllocationinfo2(
    public var hAllocation: UInt = 0u,
    public var anonymous1: D3dddiAllocationinfo20 = D3dddiAllocationinfo20(),
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var flags: D3dddiAllocationinfo21 = D3dddiAllocationinfo21(),
    public var gpuVirtualAddress: ULong = 0uL,
    public var anonymous2: D3dddiAllocationinfo22 = D3dddiAllocationinfo22(),
    public var reserved: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiAllocationinfo2) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.flags != other.flags) return false
        if (this.gpuVirtualAddress != other.gpuVirtualAddress) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.gpuVirtualAddress.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dddiAllocationinfo20(public var hSection: Handle = null, public var pSystemMem: COpaquePointer? = null)

public data class D3dddiAllocationinfo22(public var priority: UInt = 0u, public var unused: Int = 0)

public data class D3dddiAllocationinfo21(public var anonymous: D3dddiAllocationinfo210 = D3dddiAllocationinfo210(), public var value: UInt = 0u)

public data class D3dddiAllocationinfo210(public var bitfield: UInt = 0u)

public data class D3dddiAllocationlist(public var hAllocation: UInt = 0u, public var anonymous: D3dddiAllocationlist0 = D3dddiAllocationlist0())

public data class D3dddiAllocationlist0(public var anonymous: D3dddiAllocationlist00 = D3dddiAllocationlist00(), public var value: UInt = 0u)

public data class D3dddiAllocationlist00(public var bitfield: UInt = 0u)

public data class D3dddiCreatecontextflags(public var anonymous: D3dddiCreatecontextflags0 = D3dddiCreatecontextflags0())

public data class D3dddiCreatecontextflags0(public var anonymous: D3dddiCreatecontextflags00 = D3dddiCreatecontextflags00(), public var value: UInt = 0u)

public data class D3dddiCreatecontextflags00(public var bitfield: UInt = 0u)

public data class D3dddiCreatehwcontextflags(public var anonymous: D3dddiCreatehwcontextflags0 = D3dddiCreatehwcontextflags0())

public data class D3dddiCreatehwcontextflags0(public var anonymous: D3dddiCreatehwcontextflags00 = D3dddiCreatehwcontextflags00(), public var value: UInt = 0u)

public data class D3dddiCreatehwcontextflags00(public var bitfield: UInt = 0u)

public data class D3dddiCreatehwqueueflags(public var anonymous: D3dddiCreatehwqueueflags0 = D3dddiCreatehwqueueflags0())

public data class D3dddiCreatehwqueueflags0(public var anonymous: D3dddiCreatehwqueueflags00 = D3dddiCreatehwqueueflags00(), public var value: UInt = 0u)

public data class D3dddiCreatehwqueueflags00(public var bitfield: UInt = 0u)

public data class D3dddiCreatenativefenceinfo(
    public var initialFenceValue: ULong = 0uL,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var engineAffinity: UInt = 0u,
    public var flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
    public var hSyncObject: UInt = 0u,
    public var nativeFenceMapping: D3dddiNativefencemapping = D3dddiNativefencemapping(),
)

public data class D3dddiDestroypagingqueue(public var hPagingQueue: UInt = 0u)

public data class D3dddiDriverescapeCpueventusage(
    public var escapeType: D3dddiDriverescapetype = 0,
    public var hSyncObject: UInt = 0u,
    public var hKmdCpuEvent: ULong = 0uL,
    public var usage: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiDriverescapeCpueventusage) return false
        if (this.escapeType != other.escapeType) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.hKmdCpuEvent != other.hKmdCpuEvent) return false
        if (!this.usage.contentEquals(other.usage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.escapeType.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.hKmdCpuEvent.hashCode()
        result = 31 * result + this.usage.contentHashCode()
        return result
    }
}

public data class D3dddiDriverescapeTranslateallocationehandle(public var escapeType: D3dddiDriverescapetype = 0, public var hAllocation: UInt = 0u)

public data class D3dddiDriverescapeTranslateresourcehandle(public var escapeType: D3dddiDriverescapetype = 0, public var hResource: UInt = 0u)

public data class D3dddiDxgiRgb(
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
)

public data class D3dddiEscapeflags(public var anonymous: D3dddiEscapeflags0 = D3dddiEscapeflags0())

public data class D3dddiEscapeflags0(public var anonymous: D3dddiEscapeflags00 = D3dddiEscapeflags00(), public var value: UInt = 0u)

public data class D3dddiEscapeflags00(public var bitfield: UInt = 0u)

public data class D3dddiEvictFlags(public var anonymous: D3dddiEvictFlags0 = D3dddiEvictFlags0())

public data class D3dddiEvictFlags0(public var anonymous: D3dddiEvictFlags00 = D3dddiEvictFlags00(), public var value: UInt = 0u)

public data class D3dddiEvictFlags00(public var bitfield: UInt = 0u)

public data class D3dddiGammaRampDxgi1(
    public var scale: D3dddiDxgiRgb = D3dddiDxgiRgb(),
    public var offset: D3dddiDxgiRgb = D3dddiDxgiRgb(),
    public var gammaCurve: List<D3dddiDxgiRgb> = List(1025) { D3dddiDxgiRgb() },
)

public data class D3dddiGammaRampRgb256x3x16(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiGammaRampRgb256x3x16) return false
        if (!this.red.contentEquals(other.red)) return false
        if (!this.green.contentEquals(other.green)) return false
        if (!this.blue.contentEquals(other.blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.red.contentHashCode()
        result = 31 * result + this.green.contentHashCode()
        result = 31 * result + this.blue.contentHashCode()
        return result
    }
}

public data class D3dddiGetresourcepresentprivatedriverdata(
    public var hResource: UInt = 0u,
    public var privateDriverDataSize: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
)

public data class D3dddiHdrMetadataHdr10(
    public var redPrimary: UShortArray = UShortArray(2),
    public var greenPrimary: UShortArray = UShortArray(2),
    public var bluePrimary: UShortArray = UShortArray(2),
    public var whitePoint: UShortArray = UShortArray(2),
    public var maxMasteringLuminance: UInt = 0u,
    public var minMasteringLuminance: UInt = 0u,
    public var maxContentLightLevel: UShort = 0u,
    public var maxFrameAverageLightLevel: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiHdrMetadataHdr10) return false
        if (!this.redPrimary.contentEquals(other.redPrimary)) return false
        if (!this.greenPrimary.contentEquals(other.greenPrimary)) return false
        if (!this.bluePrimary.contentEquals(other.bluePrimary)) return false
        if (!this.whitePoint.contentEquals(other.whitePoint)) return false
        if (this.maxMasteringLuminance != other.maxMasteringLuminance) return false
        if (this.minMasteringLuminance != other.minMasteringLuminance) return false
        if (this.maxContentLightLevel != other.maxContentLightLevel) return false
        if (this.maxFrameAverageLightLevel != other.maxFrameAverageLightLevel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.redPrimary.contentHashCode()
        result = 31 * result + this.greenPrimary.contentHashCode()
        result = 31 * result + this.bluePrimary.contentHashCode()
        result = 31 * result + this.whitePoint.contentHashCode()
        result = 31 * result + this.maxMasteringLuminance.hashCode()
        result = 31 * result + this.minMasteringLuminance.hashCode()
        result = 31 * result + this.maxContentLightLevel.hashCode()
        result = 31 * result + this.maxFrameAverageLightLevel.hashCode()
        return result
    }
}

public data class D3dddiHdrMetadataHdr10plus(public var data: UByteArray = UByteArray(72)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiHdrMetadataHdr10plus) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

public data class D3dddiKerneloverlayinfo(
    public var hAllocation: UInt = 0u,
    public var dstRect: D3dddirect = D3dddirect(),
    public var srcRect: D3dddirect = D3dddirect(),
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
)

public data class D3dddiMakeresident(
    public var hPagingQueue: UInt = 0u,
    public var numAllocations: UInt = 0u,
    public var allocationList: UInt? = null,
    public var priorityList: UInt? = null,
    public var flags: D3dddiMakeresidentFlags = D3dddiMakeresidentFlags(),
    public var pagingFenceValue: ULong = 0uL,
    public var numBytesToTrim: ULong = 0uL,
)

public data class D3dddiMakeresidentFlags(public var anonymous: D3dddiMakeresidentFlags0 = D3dddiMakeresidentFlags0())

public data class D3dddiMakeresidentFlags0(public var anonymous: D3dddiMakeresidentFlags00 = D3dddiMakeresidentFlags00(), public var value: UInt = 0u)

public data class D3dddiMakeresidentFlags00(public var bitfield: UInt = 0u)

public data class D3dddiMapgpuvirtualaddress(
    public var hPagingQueue: UInt = 0u,
    public var baseAddress: ULong = 0uL,
    public var minimumAddress: ULong = 0uL,
    public var maximumAddress: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var offsetInPages: ULong = 0uL,
    public var sizeInPages: ULong = 0uL,
    public var protection: D3dddigpuvirtualaddressProtectionType = D3dddigpuvirtualaddressProtectionType(),
    public var driverProtection: ULong = 0uL,
    public var reserved0: UInt = 0u,
    public var reserved1: ULong = 0uL,
    public var virtualAddress: ULong = 0uL,
    public var pagingFenceValue: ULong = 0uL,
)

public data class D3dddiMultisamplingmethod(public var numSamples: UInt = 0u, public var numQualityLevels: UInt = 0u)

public data class D3dddiNativefencemapping(
    public var currentValueCpuVa: COpaquePointer? = null,
    public var currentValueGpuVa: ULong = 0uL,
    public var monitoredValueGpuVa: ULong = 0uL,
)

public data class D3dddiOfferFlags(public var anonymous: D3dddiOfferFlags0 = D3dddiOfferFlags0())

public data class D3dddiOfferFlags0(public var anonymous: D3dddiOfferFlags00 = D3dddiOfferFlags00(), public var value: UInt = 0u)

public data class D3dddiOfferFlags00(public var bitfield: UInt = 0u)

public data class D3dddiOpenallocationinfo(
    public var hAllocation: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
)

public data class D3dddiOpenallocationinfo2(
    public var hAllocation: UInt = 0u,
    public var pPrivateDriverData: COpaquePointer? = null,
    public var privateDriverDataSize: UInt = 0u,
    public var gpuVirtualAddress: ULong = 0uL,
    public var reserved: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiOpenallocationinfo2) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.gpuVirtualAddress != other.gpuVirtualAddress) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.gpuVirtualAddress.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dddiPatchlocationlist(
    public var allocationIndex: UInt = 0u,
    public var anonymous: D3dddiPatchlocationlist0 = D3dddiPatchlocationlist0(),
    public var driverId: UInt = 0u,
    public var allocationOffset: UInt = 0u,
    public var patchOffset: UInt = 0u,
    public var splitOffset: UInt = 0u,
)

public data class D3dddiPatchlocationlist0(public var anonymous: D3dddiPatchlocationlist00 = D3dddiPatchlocationlist00(), public var value: UInt = 0u)

public data class D3dddiPatchlocationlist00(public var bitfield: UInt = 0u)

public data class D3dddiQueryregistryFlags(public var anonymous: D3dddiQueryregistryFlags0 = D3dddiQueryregistryFlags0())

public data class D3dddiQueryregistryFlags0(public var anonymous: D3dddiQueryregistryFlags00 = D3dddiQueryregistryFlags00(), public var value: UInt = 0u)

public data class D3dddiQueryregistryFlags00(public var bitfield: UInt = 0u)

public data class D3dddiQueryregistryInfo(
    public var queryType: D3dddiQueryregistryType = 0,
    public var queryFlags: D3dddiQueryregistryFlags = D3dddiQueryregistryFlags(),
    public var valueName: UShortArray = UShortArray(260),
    public var valueType: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var outputValueSize: UInt = 0u,
    public var status: D3dddiQueryregistryStatus = 0,
    public var anonymous: D3dddiQueryregistryInfo0 = D3dddiQueryregistryInfo0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiQueryregistryInfo) return false
        if (this.queryType != other.queryType) return false
        if (this.queryFlags != other.queryFlags) return false
        if (!this.valueName.contentEquals(other.valueName)) return false
        if (this.valueType != other.valueType) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (this.outputValueSize != other.outputValueSize) return false
        if (this.status != other.status) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.queryType.hashCode()
        result = 31 * result + this.queryFlags.hashCode()
        result = 31 * result + this.valueName.contentHashCode()
        result = 31 * result + this.valueType.hashCode()
        result = 31 * result + this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.outputValueSize.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class D3dddiQueryregistryInfo0(
    public var outputDword: UInt = 0u,
    public var outputQword: ULong = 0uL,
    public var outputString: UShortArray = UShortArray(1),
    public var outputBinary: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiQueryregistryInfo0) return false
        if (this.outputDword != other.outputDword) return false
        if (this.outputQword != other.outputQword) return false
        if (!this.outputString.contentEquals(other.outputString)) return false
        if (!this.outputBinary.contentEquals(other.outputBinary)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputDword.hashCode()
        result = 31 * result + this.outputQword.hashCode()
        result = 31 * result + this.outputString.contentHashCode()
        result = 31 * result + this.outputBinary.contentHashCode()
        return result
    }
}

public data class D3dddiRational(public var numerator: UInt = 0u, public var denominator: UInt = 0u)

public data class D3dddiReservegpuvirtualaddress(
    public var anonymous1: D3dddiReservegpuvirtualaddress0 = D3dddiReservegpuvirtualaddress0(),
    public var baseAddress: ULong = 0uL,
    public var minimumAddress: ULong = 0uL,
    public var maximumAddress: ULong = 0uL,
    public var size: ULong = 0uL,
    public var anonymous2: D3dddiReservegpuvirtualaddress1 = D3dddiReservegpuvirtualaddress1(),
    public var anonymous3: D3dddiReservegpuvirtualaddress2 = D3dddiReservegpuvirtualaddress2(),
    public var virtualAddress: ULong = 0uL,
    public var anonymous4: D3dddiReservegpuvirtualaddress3 = D3dddiReservegpuvirtualaddress3(),
)

public data class D3dddiReservegpuvirtualaddress0(public var hPagingQueue: UInt = 0u, public var hAdapter: UInt = 0u)

public data class D3dddiReservegpuvirtualaddress1(public var reservationType: D3dddigpuvirtualaddressReservationType = 0, public var reserved0: UInt = 0u)

public data class D3dddiReservegpuvirtualaddress2(public var driverProtection: ULong = 0uL, public var reserved1: ULong = 0uL)

public data class D3dddiReservegpuvirtualaddress3(public var pagingFenceValue: ULong = 0uL, public var reserved2: ULong = 0uL)

public data class D3dddiResourceflags(public var anonymous: D3dddiResourceflags0 = D3dddiResourceflags0())

public data class D3dddiResourceflags0(public var anonymous: D3dddiResourceflags00 = D3dddiResourceflags00(), public var value: UInt = 0u)

public data class D3dddiResourceflags00(public var bitfield: UInt = 0u)

public data class D3dddiResourceflags2(public var anonymous: D3dddiResourceflags20 = D3dddiResourceflags20())

public data class D3dddiResourceflags20(public var anonymous: D3dddiResourceflags200 = D3dddiResourceflags200(), public var value: UInt = 0u)

public data class D3dddiResourceflags200(public var bitfield: UInt = 0u)

public data class D3dddiSegmentpreference(public var anonymous: D3dddiSegmentpreference0 = D3dddiSegmentpreference0())

public data class D3dddiSegmentpreference0(public var anonymous: D3dddiSegmentpreference00 = D3dddiSegmentpreference00(), public var value: UInt = 0u)

public data class D3dddiSegmentpreference00(public var bitfield: UInt = 0u)

public data class D3dddiSurfaceinfo(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var depth: UInt = 0u,
    public var pSysMem: COpaquePointer? = null,
    public var sysMemPitch: UInt = 0u,
    public var sysMemSlicePitch: UInt = 0u,
)

public data class D3dddiSynchronizationobjectinfo(public var type: D3dddiSynchronizationobjectType = 0, public var anonymous: D3dddiSynchronizationobjectinfo0 = D3dddiSynchronizationobjectinfo0())

public data class D3dddiSynchronizationobjectinfo0(
    public var synchronizationMutex: D3dddiSynchronizationobjectinfo00 = D3dddiSynchronizationobjectinfo00(),
    public var semaphore: D3dddiSynchronizationobjectinfo01 = D3dddiSynchronizationobjectinfo01(),
    public var reserved: D3dddiSynchronizationobjectinfo02 = D3dddiSynchronizationobjectinfo02(),
)

public data class D3dddiSynchronizationobjectinfo02(public var reserved: UIntArray = UIntArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo02) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved.contentHashCode()
    }
}

public data class D3dddiSynchronizationobjectinfo01(public var maxCount: UInt = 0u, public var initialCount: UInt = 0u)

public data class D3dddiSynchronizationobjectinfo00(public var initialState: Bool = 0)

public data class D3dddiSynchronizationobjectinfo2(
    public var type: D3dddiSynchronizationobjectType = 0,
    public var flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
    public var anonymous: D3dddiSynchronizationobjectinfo20 = D3dddiSynchronizationobjectinfo20(),
    public var sharedHandle: UInt = 0u,
)

public data class D3dddiSynchronizationobjectinfo20(
    public var synchronizationMutex: D3dddiSynchronizationobjectinfo200 = D3dddiSynchronizationobjectinfo200(),
    public var semaphore: D3dddiSynchronizationobjectinfo201 = D3dddiSynchronizationobjectinfo201(),
    public var fence: D3dddiSynchronizationobjectinfo202 = D3dddiSynchronizationobjectinfo202(),
    public var cPUNotification: D3dddiSynchronizationobjectinfo203 = D3dddiSynchronizationobjectinfo203(),
    public var monitoredFence: D3dddiSynchronizationobjectinfo204 = D3dddiSynchronizationobjectinfo204(),
    public var periodicMonitoredFence: D3dddiSynchronizationobjectinfo205 = D3dddiSynchronizationobjectinfo205(),
    public var reserved: D3dddiSynchronizationobjectinfo206 = D3dddiSynchronizationobjectinfo206(),
)

public data class D3dddiSynchronizationobjectinfo203(public var event: Handle = null)

public data class D3dddiSynchronizationobjectinfo202(public var fenceValue: ULong = 0uL)

public data class D3dddiSynchronizationobjectinfo204(
    public var initialFenceValue: ULong = 0uL,
    public var fenceValueCPUVirtualAddress: COpaquePointer? = null,
    public var fenceValueGPUVirtualAddress: ULong = 0uL,
    public var engineAffinity: UInt = 0u,
    public var padding: UInt = 0u,
)

public data class D3dddiSynchronizationobjectinfo205(
    public var hAdapter: UInt = 0u,
    public var vidPnTargetId: UInt = 0u,
    public var time: ULong = 0uL,
    public var fenceValueCPUVirtualAddress: COpaquePointer? = null,
    public var fenceValueGPUVirtualAddress: ULong = 0uL,
    public var engineAffinity: UInt = 0u,
    public var padding: UInt = 0u,
)

public data class D3dddiSynchronizationobjectinfo206(public var reserved: ULongArray = ULongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo206) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved.contentHashCode()
    }
}

public data class D3dddiSynchronizationobjectinfo201(public var maxCount: UInt = 0u, public var initialCount: UInt = 0u)

public data class D3dddiSynchronizationobjectinfo200(public var initialState: Bool = 0)

public data class D3dddiSynchronizationobjectFlags(public var anonymous: D3dddiSynchronizationobjectFlags0 = D3dddiSynchronizationobjectFlags0())

public data class D3dddiSynchronizationobjectFlags0(public var anonymous: D3dddiSynchronizationobjectFlags00 = D3dddiSynchronizationobjectFlags00(), public var value: UInt = 0u)

public data class D3dddiSynchronizationobjectFlags00(public var bitfield: UInt = 0u)

public data class D3dddiTrimresidencysetFlags(public var anonymous: D3dddiTrimresidencysetFlags0 = D3dddiTrimresidencysetFlags0())

public data class D3dddiTrimresidencysetFlags0(public var anonymous: D3dddiTrimresidencysetFlags00 = D3dddiTrimresidencysetFlags00(), public var value: UInt = 0u)

public data class D3dddiTrimresidencysetFlags00(public var bitfield: UInt = 0u)

public data class D3dddiUpdateallocproperty(
    public var hPagingQueue: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var supportedSegmentSet: UInt = 0u,
    public var preferredSegment: D3dddiSegmentpreference = D3dddiSegmentpreference(),
    public var flags: D3dddiUpdateallocpropertyFlags = D3dddiUpdateallocpropertyFlags(),
    public var pagingFenceValue: ULong = 0uL,
    public var anonymous: D3dddiUpdateallocproperty0 = D3dddiUpdateallocproperty0(),
)

public data class D3dddiUpdateallocproperty0(public var anonymous: D3dddiUpdateallocproperty00 = D3dddiUpdateallocproperty00(), public var propertyMaskValue: UInt = 0u)

public data class D3dddiUpdateallocproperty00(public var bitfield: UInt = 0u)

public data class D3dddiUpdateallocpropertyFlags(public var anonymous: D3dddiUpdateallocpropertyFlags0 = D3dddiUpdateallocpropertyFlags0())

public data class D3dddiUpdateallocpropertyFlags0(public var anonymous: D3dddiUpdateallocpropertyFlags00 = D3dddiUpdateallocpropertyFlags00(), public var value: UInt = 0u)

public data class D3dddiUpdateallocpropertyFlags00(public var bitfield: UInt = 0u)

public data class D3dddiUpdategpuvirtualaddressOperation(public var operationType: D3dddiUpdategpuvirtualaddressOperationType = 0, public var anonymous: D3dddiUpdategpuvirtualaddressOperation0 = D3dddiUpdategpuvirtualaddressOperation0())

public data class D3dddiUpdategpuvirtualaddressOperation0(
    public var map: D3dddiUpdategpuvirtualaddressOperation00 = D3dddiUpdategpuvirtualaddressOperation00(),
    public var mapProtect: D3dddiUpdategpuvirtualaddressOperation01 = D3dddiUpdategpuvirtualaddressOperation01(),
    public var unmap: D3dddiUpdategpuvirtualaddressOperation02 = D3dddiUpdategpuvirtualaddressOperation02(),
    public var copy: D3dddiUpdategpuvirtualaddressOperation03 = D3dddiUpdategpuvirtualaddressOperation03(),
)

public data class D3dddiUpdategpuvirtualaddressOperation03(
    public var sourceAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var destAddress: ULong = 0uL,
)

public data class D3dddiUpdategpuvirtualaddressOperation01(
    public var baseAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var allocationOffsetInBytes: ULong = 0uL,
    public var allocationSizeInBytes: ULong = 0uL,
    public var protection: D3dddigpuvirtualaddressProtectionType = D3dddigpuvirtualaddressProtectionType(),
    public var driverProtection: ULong = 0uL,
)

public data class D3dddiUpdategpuvirtualaddressOperation00(
    public var baseAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var allocationOffsetInBytes: ULong = 0uL,
    public var allocationSizeInBytes: ULong = 0uL,
)

public data class D3dddiUpdategpuvirtualaddressOperation02(
    public var baseAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var protection: D3dddigpuvirtualaddressProtectionType = D3dddigpuvirtualaddressProtectionType(),
)

public data class D3dddiWaitforsynchronizationobjectfromcpuFlags(public var anonymous: D3dddiWaitforsynchronizationobjectfromcpuFlags0 = D3dddiWaitforsynchronizationobjectfromcpuFlags0())

public data class D3dddiWaitforsynchronizationobjectfromcpuFlags0(public var anonymous: D3dddiWaitforsynchronizationobjectfromcpuFlags00 = D3dddiWaitforsynchronizationobjectfromcpuFlags00(), public var value: UInt = 0u)

public data class D3dddiWaitforsynchronizationobjectfromcpuFlags00(public var bitfield: UInt = 0u)

public data class D3dgpuPhysicalAddress(
    public var segmentId: UInt = 0u,
    public var padding: UInt = 0u,
    public var segmentOffset: ULong = 0uL,
)

public data class D3dhalClippedtrianglefan(
    public var firstVertexOffset: UInt = 0u,
    public var dwEdgeFlags: UInt = 0u,
    public var primitiveCount: UInt = 0u,
)

public data class D3dhalContextdestroyalldata(public var dwPID: UInt = 0u, public var ddrval: Hresult = 0)

public data class D3dhalContextdestroydata(public var dwhContext: Int = 0, public var ddrval: Hresult = 0)

public class D3dhalD3ddx6extendedcaps(
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

public class D3dhalD3dextendedcaps(
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

public data class D3dhalDp2adddirtyrect(public var dwSurface: UInt = 0u, public var rDirtyArea: Rectl = Rectl())

public data class D3dhalDp2blt(
    public var dwSource: UInt = 0u,
    public var rSource: Rectl = Rectl(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Rectl = Rectl(),
    public var dwDestMipLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dhalDp2clear(
    public var dwFlags: UInt = 0u,
    public var dwFillColor: UInt = 0u,
    public var dvFillDepth: Float = 0.0f,
    public var dwFillStencil: UInt = 0u,
    public var rects: List<Rect> = List(1) { Rect() },
)

public data class D3dhalDp2colorfill(
    public var dwSurface: UInt = 0u,
    public var rRect: Rectl = Rectl(),
    public var color: UInt = 0u,
)

public data class D3dhalDp2command(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var anonymous: D3dhalDp2command0 = D3dhalDp2command0(),
)

public data class D3dhalDp2command0(public var wPrimitiveCount: UShort = 0u, public var wStateCount: UShort = 0u)

public data class D3dhalDp2createlight(public var dwIndex: UInt = 0u)

public data class D3dhalDp2createpixelshader(public var dwHandle: UInt = 0u, public var dwCodeSize: UInt = 0u)

public data class D3dhalDp2createvertexshader(
    public var dwHandle: UInt = 0u,
    public var dwDeclSize: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
)

public data class D3dhalDp2createvertexshaderdecl(public var dwHandle: UInt = 0u, public var dwNumVertexElements: UInt = 0u)

public data class D3dhalDp2createvertexshaderfunc(public var dwHandle: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3dhalDp2deletequery(public var dwQueryID: UInt = 0u)

public data class D3dhalDp2drawrectpatch(public var handle: UInt = 0u, public var flags: UInt = 0u)

public data class D3dhalDp2drawtripatch(public var handle: UInt = 0u, public var flags: UInt = 0u)

public data class D3dhalDp2ext(public var dwExtToken: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3dhalDp2indexedlinelist(public var wV1: UShort = 0u, public var wV2: UShort = 0u)

public data class D3dhalDp2indexedlinestrip(public var wV: UShortArray = UShortArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2indexedlinestrip) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3dhalDp2indexedtrianglefan(public var wV: UShortArray = UShortArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2indexedtrianglefan) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3dhalDp2indexedtrianglelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
    public var wFlags: UShort = 0u,
)

public data class D3dhalDp2indexedtrianglelist2(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
)

public data class D3dhalDp2indexedtrianglestrip(public var wV: UShortArray = UShortArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2indexedtrianglestrip) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3dhalDp2issuequery(public var dwQueryID: UInt = 0u, public var dwFlags: UInt = 0u)

public data class D3dhalDp2linelist(public var wVStart: UShort = 0u)

public data class D3dhalDp2linestrip(public var wVStart: UShort = 0u)

public data class D3dhalDp2pixelshader(public var dwHandle: UInt = 0u)

public data class D3dhalDp2points(public var wCount: UShort = 0u, public var wVStart: UShort = 0u)

public data class D3dhalDp2response(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wStateCount: UShort = 0u,
    public var dwTotalSize: UInt = 0u,
)

public data class D3dhalDp2responsequery(public var dwQueryID: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3dhalDp2setclipplane(public var dwIndex: UInt = 0u, public var plane: FloatArray = FloatArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2setclipplane) return false
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

public data class D3dhalDp2setconvolutionkernelmono(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class D3dhalDp2setdepthstencil(public var hZBuffer: UInt = 0u)

public data class D3dhalDp2setindices(public var dwVBHandle: UInt = 0u, public var dwStride: UInt = 0u)

public data class D3dhalDp2setlight(public var dwIndex: UInt = 0u, public var dwDataType: UInt = 0u)

public data class D3dhalDp2setpalette(
    public var dwPaletteHandle: UInt = 0u,
    public var dwPaletteFlags: UInt = 0u,
    public var dwSurfaceHandle: UInt = 0u,
)

public data class D3dhalDp2setpixelshaderconst(public var dwRegister: UInt = 0u, public var dwCount: UInt = 0u)

public data class D3dhalDp2setpriority(public var dwDDSurface: UInt = 0u, public var dwPriority: UInt = 0u)

public data class D3dhalDp2setrendertarget(public var hRenderTarget: UInt = 0u, public var hZBuffer: UInt = 0u)

public data class D3dhalDp2setrendertarget2(public var rTIndex: UInt = 0u, public var hRenderTarget: UInt = 0u)

public data class D3dhalDp2setstreamsource(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3dhalDp2setstreamsource2(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3dhalDp2setstreamsourcefreq(public var dwStream: UInt = 0u, public var dwDivider: UInt = 0u)

public data class D3dhalDp2setstreamsourceum(public var dwStream: UInt = 0u, public var dwStride: UInt = 0u)

public data class D3dhalDp2settexlod(public var dwDDSurface: UInt = 0u, public var dwLOD: UInt = 0u)

public data class D3dhalDp2setvertexshaderconst(public var dwRegister: UInt = 0u, public var dwCount: UInt = 0u)

public data class D3dhalDp2startvertex(public var wVStart: UShort = 0u)

public data class D3dhalDp2surfaceblt(
    public var dwSource: UInt = 0u,
    public var rSource: Rectl = Rectl(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Rectl = Rectl(),
    public var dwDestMipLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dhalDp2texblt(
    public var dwDDDestSurface: UInt = 0u,
    public var dwDDSrcSurface: UInt = 0u,
    public var pDest: Point = Point(),
    public var rSrc: Rectl = Rectl(),
    public var dwFlags: UInt = 0u,
)

public data class D3dhalDp2texturestagestate(
    public var wStage: UShort = 0u,
    public var tSState: UShort = 0u,
    public var dwValue: UInt = 0u,
)

public data class D3dhalDp2trianglefan(public var wVStart: UShort = 0u)

public data class D3dhalDp2trianglefanImm(public var dwEdgeFlags: UInt = 0u)

public data class D3dhalDp2trianglelist(public var wVStart: UShort = 0u)

public data class D3dhalDp2trianglestrip(public var wVStart: UShort = 0u)

public data class D3dhalDp2updatepalette(
    public var dwPaletteHandle: UInt = 0u,
    public var wStartIndex: UShort = 0u,
    public var wNumEntries: UShort = 0u,
)

public data class D3dhalDp2vertexshader(public var dwHandle: UInt = 0u)

public data class D3dhalDp2viewportinfo(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
)

public data class D3dhalDp2winfo(public var dvWNear: Float = 0.0f, public var dvWFar: Float = 0.0f)

public data class D3dhalDp2zrange(public var dvMinZ: Float = 0.0f, public var dvMaxZ: Float = 0.0f)

public data class D3dhalDrawprimcounts(
    public var wNumStateChanges: UShort = 0u,
    public var wPrimitiveType: UShort = 0u,
    public var wVertexType: UShort = 0u,
    public var wNumVertices: UShort = 0u,
)

public data class D3dhalDrawprimitivesdata(
    public var dwhContext: Int = 0,
    public var dwFlags: UInt = 0u,
    public var lpvData: COpaquePointer? = null,
    public var dwFVFControl: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dhalScenecapturedata(
    public var dwhContext: Int = 0,
    public var dwFlag: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dhalTexturedestroydata(
    public var dwhContext: Int = 0,
    public var dwHandle: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dhalTexturegetsurfdata(
    public var dwhContext: Int = 0,
    public var lpDDS: Int = 0,
    public var dwHandle: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dhalTextureswapdata(
    public var dwhContext: Int = 0,
    public var dwHandle1: UInt = 0u,
    public var dwHandle2: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dhalValidatetexturestagestatedata(
    public var dwhContext: Int = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: Int = 0,
    public var dwNumPasses: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dkmdt2dregion(public var cx: UInt = 0u, public var cy: UInt = 0u)

public data class D3dkmdt3x4ColorspaceTransform(
    public var colorMatrix3x4: FloatArray = FloatArray(12),
    public var scalarMultiplier: Float = 0.0f,
    public var lookupTable1D: List<D3dddiDxgiRgb> = List(4096) { D3dddiDxgiRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdt3x4ColorspaceTransform) return false
        if (!this.colorMatrix3x4.contentEquals(other.colorMatrix3x4)) return false
        if (this.scalarMultiplier != other.scalarMultiplier) return false
        if (this.lookupTable1D != other.lookupTable1D) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.colorMatrix3x4.contentHashCode()
        result = 31 * result + this.scalarMultiplier.hashCode()
        result = 31 * result + this.lookupTable1D.hashCode()
        return result
    }
}

public data class D3dkmdtColorspaceTransformMatrixV2(
    public var stageControlLookupTable1DDegamma: D3dkmdtColorspaceTransformStageControl = 0,
    public var lookupTable1DDegamma: List<D3dddiDxgiRgb> = List(4096) { D3dddiDxgiRgb() },
    public var stageControlColorMatrix3x3: D3dkmdtColorspaceTransformStageControl = 0,
    public var colorMatrix3x3: FloatArray = FloatArray(9),
    public var stageControlLookupTable1DRegamma: D3dkmdtColorspaceTransformStageControl = 0,
    public var lookupTable1DRegamma: List<D3dddiDxgiRgb> = List(4096) { D3dddiDxgiRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdtColorspaceTransformMatrixV2) return false
        if (this.stageControlLookupTable1DDegamma != other.stageControlLookupTable1DDegamma) return false
        if (this.lookupTable1DDegamma != other.lookupTable1DDegamma) return false
        if (this.stageControlColorMatrix3x3 != other.stageControlColorMatrix3x3) return false
        if (!this.colorMatrix3x3.contentEquals(other.colorMatrix3x3)) return false
        if (this.stageControlLookupTable1DRegamma != other.stageControlLookupTable1DRegamma) return false
        if (this.lookupTable1DRegamma != other.lookupTable1DRegamma) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stageControlLookupTable1DDegamma.hashCode()
        result = 31 * result + this.lookupTable1DDegamma.hashCode()
        result = 31 * result + this.stageControlColorMatrix3x3.hashCode()
        result = 31 * result + this.colorMatrix3x3.contentHashCode()
        result = 31 * result + this.stageControlLookupTable1DRegamma.hashCode()
        result = 31 * result + this.lookupTable1DRegamma.hashCode()
        return result
    }
}

public data class D3dkmdtColorCoeffDynamicRanges(
    public var firstChannel: UInt = 0u,
    public var secondChannel: UInt = 0u,
    public var thirdChannel: UInt = 0u,
    public var fourthChannel: UInt = 0u,
)

public data class D3dkmdtDisplaymodeFlags(public var bitfield1: UInt = 0u, public var bitfield2: UInt = 0u)

public data class D3dkmdtFrequencyRange(
    public var minVSyncFreq: D3dddiRational = D3dddiRational(),
    public var maxVSyncFreq: D3dddiRational = D3dddiRational(),
    public var minHSyncFreq: D3dddiRational = D3dddiRational(),
    public var maxHSyncFreq: D3dddiRational = D3dddiRational(),
)

public data class D3dkmdtGammaRamp(
    public var type: D3dddiGammarampType = 0,
    public var dataSize: Int = 0,
    public var data: D3dkmdtGammaRamp0 = D3dkmdtGammaRamp0(),
)

public data class D3dkmdtGammaRamp0(
    public var pRgb256x3x16: D3dddiGammaRampRgb256x3x16? = null,
    public var pDxgi1: D3dddiGammaRampDxgi1? = null,
    public var p3x4: D3dkmdt3x4ColorspaceTransform? = null,
    public var pMatrixV2: D3dkmdtColorspaceTransformMatrixV2? = null,
    public var pRaw: COpaquePointer? = null,
)

public data class D3dkmdtGdisurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var type: D3dkmdtGdisurfacetype = 0,
    public var flags: D3dkmdtGdisurfaceflags = D3dkmdtGdisurfaceflags(),
    public var pitch: UInt = 0u,
)

public data class D3dkmdtGdisurfaceflags(public var anonymous: D3dkmdtGdisurfaceflags0 = D3dkmdtGdisurfaceflags0())

public data class D3dkmdtGdisurfaceflags0(public var anonymous: D3dkmdtGdisurfaceflags00 = D3dkmdtGdisurfaceflags00(), public var value: UInt = 0u)

public data class D3dkmdtGdisurfaceflags00(public var bitfield: UInt = 0u)

public data class D3dkmdtGraphicsRenderingFormat(
    public var primSurfSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var visibleRegionSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var stride: UInt = 0u,
    public var pixelFormat: D3dddiformat = 0u,
    public var colorBasis: D3dkmdtColorBasis = 0,
    public var pixelValueAccessMode: D3dkmdtPixelValueAccessMode = 0,
)

public data class D3dkmdtMonitorDescriptor(
    public var id: UInt = 0u,
    public var type: D3dkmdtMonitorDescriptorType = 0,
    public var dataSize: Int = 0,
    public var pData: COpaquePointer? = null,
    public var origin: D3dkmdtMonitorCapabilitiesOrigin = 0,
)

public data class D3dkmdtMonitorFrequencyRange(
    public var origin: D3dkmdtMonitorCapabilitiesOrigin = 0,
    public var rangeLimits: D3dkmdtFrequencyRange = D3dkmdtFrequencyRange(),
    public var constraintType: D3dkmdtMonitorFrequencyRangeConstraint = 0,
    public var constraint: D3dkmdtMonitorFrequencyRange0 = D3dkmdtMonitorFrequencyRange0(),
)

public data class D3dkmdtMonitorFrequencyRange0(public var activeSize: D3dkmdt2dregion = D3dkmdt2dregion(), public var maxPixelRate: Int = 0)

public data class D3dkmdtMonitorSourceMode(
    public var id: UInt = 0u,
    public var videoSignalInfo: D3dkmdtVideoSignalInfo = D3dkmdtVideoSignalInfo(),
    public var colorBasis: D3dkmdtColorBasis = 0,
    public var colorCoeffDynamicRanges: D3dkmdtColorCoeffDynamicRanges = D3dkmdtColorCoeffDynamicRanges(),
    public var origin: D3dkmdtMonitorCapabilitiesOrigin = 0,
    public var preference: D3dkmdtModePreference = 0,
)

public data class D3dkmdtPalettedata(
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
    public var unused: UByte = 0u,
)

public data class D3dkmdtPreemptionCaps(public var graphicsPreemptionGranularity: D3dkmdtGraphicsPreemptionGranularity = 0, public var computePreemptionGranularity: D3dkmdtComputePreemptionGranularity = 0)

public data class D3dkmdtShadowsurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var pitch: UInt = 0u,
)

public data class D3dkmdtSharedprimarysurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var refreshRate: D3dddiRational = D3dddiRational(),
    public var vidPnSourceId: UInt = 0u,
)

public data class D3dkmdtStagingsurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
)

public data class D3dkmdtVideoPresentSource(public var id: UInt = 0u, public var dwReserved: UInt = 0u)

public data class D3dkmdtVideoPresentTarget(
    public var id: UInt = 0u,
    public var videoOutputTechnology: D3dkmdtVideoOutputTechnology = 0,
    public var videoOutputHpdAwareness: DxgkChildDeviceHpdAwareness = 0,
    public var monitorOrientationAwareness: D3dkmdtMonitorOrientationAwareness = 0,
    public var supportsSdtvModes: Boolean = false,
)

public data class D3dkmdtVideoSignalInfo(
    public var videoStandard: D3dkmdtVideoSignalStandard = 0,
    public var totalSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var activeSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var vSyncFreq: D3dddiRational = D3dddiRational(),
    public var hSyncFreq: D3dddiRational = D3dddiRational(),
    public var pixelRate: Int = 0,
    public var anonymous: D3dkmdtVideoSignalInfo0 = D3dkmdtVideoSignalInfo0(),
)

public data class D3dkmdtVideoSignalInfo0(public var additionalSignalInfo: D3dkmdtVideoSignalInfo00 = D3dkmdtVideoSignalInfo00(), public var scanLineOrdering: D3dddiVideoSignalScanlineOrdering = 0)

public data class D3dkmdtVideoSignalInfo00(public var bitfield: Int = 0)

public data class D3dkmdtVidpnHwCapability(public var bitfield: UInt = 0u)

public data class D3dkmdtVidpnPresentPath(
    public var vidPnSourceId: UInt = 0u,
    public var vidPnTargetId: UInt = 0u,
    public var importanceOrdinal: D3dkmdtVidpnPresentPathImportance = 0,
    public var contentTransformation: D3dkmdtVidpnPresentPathTransformation = D3dkmdtVidpnPresentPathTransformation(),
    public var visibleFromActiveTLOffset: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var visibleFromActiveBROffset: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var vidPnTargetColorBasis: D3dkmdtColorBasis = 0,
    public var vidPnTargetColorCoeffDynamicRanges: D3dkmdtColorCoeffDynamicRanges = D3dkmdtColorCoeffDynamicRanges(),
    public var content: D3dkmdtVidpnPresentPathContent = 0,
    public var copyProtection: D3dkmdtVidpnPresentPathCopyprotection = D3dkmdtVidpnPresentPathCopyprotection(),
    public var gammaRamp: D3dkmdtGammaRamp = D3dkmdtGammaRamp(),
)

public data class D3dkmdtVidpnPresentPathCopyprotection(
    public var copyProtectionType: D3dkmdtVidpnPresentPathCopyprotectionType = 0,
    public var aPSTriggerBits: UInt = 0u,
    public var oEMCopyProtection: UByteArray = UByteArray(256),
    public var copyProtectionSupport: D3dkmdtVidpnPresentPathCopyprotectionSupport = D3dkmdtVidpnPresentPathCopyprotectionSupport(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdtVidpnPresentPathCopyprotection) return false
        if (this.copyProtectionType != other.copyProtectionType) return false
        if (this.aPSTriggerBits != other.aPSTriggerBits) return false
        if (!this.oEMCopyProtection.contentEquals(other.oEMCopyProtection)) return false
        if (this.copyProtectionSupport != other.copyProtectionSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.copyProtectionType.hashCode()
        result = 31 * result + this.aPSTriggerBits.hashCode()
        result = 31 * result + this.oEMCopyProtection.contentHashCode()
        result = 31 * result + this.copyProtectionSupport.hashCode()
        return result
    }
}

public data class D3dkmdtVidpnPresentPathCopyprotectionSupport(public var bitfield: UInt = 0u)

public data class D3dkmdtVidpnPresentPathRotationSupport(public var bitfield: UInt = 0u)

public data class D3dkmdtVidpnPresentPathScalingSupport(public var bitfield: UInt = 0u)

public data class D3dkmdtVidpnPresentPathTransformation(
    public var scaling: D3dkmdtVidpnPresentPathScaling = 0,
    public var scalingSupport: D3dkmdtVidpnPresentPathScalingSupport = D3dkmdtVidpnPresentPathScalingSupport(),
    public var rotation: D3dkmdtVidpnPresentPathRotation = 0,
    public var rotationSupport: D3dkmdtVidpnPresentPathRotationSupport = D3dkmdtVidpnPresentPathRotationSupport(),
)

public data class D3dkmdtVidpnSourceMode(
    public var id: UInt = 0u,
    public var type: D3dkmdtVidpnSourceModeType = 0,
    public var format: D3dkmdtVidpnSourceMode0 = D3dkmdtVidpnSourceMode0(),
)

public data class D3dkmdtVidpnSourceMode0(public var graphics: D3dkmdtGraphicsRenderingFormat = D3dkmdtGraphicsRenderingFormat(), public var text: D3dkmdtTextRenderingFormat = 0)

public data class D3dkmdtVidpnTargetMode(
    public var id: UInt = 0u,
    public var videoSignalInfo: D3dkmdtVideoSignalInfo = D3dkmdtVideoSignalInfo(),
    public var anonymous: D3dkmdtVidpnTargetMode0 = D3dkmdtVidpnTargetMode0(),
    public var minimumVSyncFreq: D3dddiRational = D3dddiRational(),
)

public data class D3dkmdtVidpnTargetMode0(public var wireFormatAndPreference: D3dkmdtWireFormatAndPreference = D3dkmdtWireFormatAndPreference(), public var anonymous: D3dkmdtVidpnTargetMode00 = D3dkmdtVidpnTargetMode00())

public data class D3dkmdtVidpnTargetMode00(public var bitfield: Int = 0)

public data class D3dkmdtVirtualgpusurfacedata(
    public var size: ULong = 0uL,
    public var alignment: UInt = 0u,
    public var driverSegmentId: UInt = 0u,
    public var privateDriverData: UInt = 0u,
)

public data class D3dkmdtWireFormatAndPreference(public var anonymous: D3dkmdtWireFormatAndPreference0 = D3dkmdtWireFormatAndPreference0(), public var value: UInt = 0u)

public data class D3dkmdtWireFormatAndPreference0(public var bitfield: Int = 0)

public data class D3dkmtAcquirekeyedmutex(
    public var hKeyedMutex: UInt = 0u,
    public var key: ULong = 0uL,
    public var pTimeout: Long? = null,
    public var fenceValue: ULong = 0uL,
)

public data class D3dkmtAcquirekeyedmutex2(
    public var hKeyedMutex: UInt = 0u,
    public var key: ULong = 0uL,
    public var pTimeout: Long? = null,
    public var fenceValue: ULong = 0uL,
    public var pPrivateRuntimeData: COpaquePointer? = null,
    public var privateRuntimeDataSize: UInt = 0u,
)

public data class D3dkmtActivateSpecificDiagEscape(public var type: D3dkmtActivateSpecificDiagType = 0, public var activate: Bool = 0)

public data class D3dkmtAdapteraddress(
    public var busNumber: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var functionNumber: UInt = 0u,
)

public data class D3dkmtAdapterinfo(
    public var hAdapter: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
    public var numOfSources: UInt = 0u,
    public var bPrecisePresentRegionsPreferred: Bool = 0,
)

public data class D3dkmtAdapterregistryinfo(
    public var adapterString: UShortArray = UShortArray(260),
    public var biosString: UShortArray = UShortArray(260),
    public var dacType: UShortArray = UShortArray(260),
    public var chipType: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtAdapterregistryinfo) return false
        if (!this.adapterString.contentEquals(other.adapterString)) return false
        if (!this.biosString.contentEquals(other.biosString)) return false
        if (!this.dacType.contentEquals(other.dacType)) return false
        if (!this.chipType.contentEquals(other.chipType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterString.contentHashCode()
        result = 31 * result + this.biosString.contentHashCode()
        result = 31 * result + this.dacType.contentHashCode()
        result = 31 * result + this.chipType.contentHashCode()
        return result
    }
}

public data class D3dkmtAdaptertype(public var anonymous: D3dkmtAdaptertype0 = D3dkmtAdaptertype0())

public data class D3dkmtAdaptertype0(public var anonymous: D3dkmtAdaptertype00 = D3dkmtAdaptertype00(), public var value: UInt = 0u)

public data class D3dkmtAdaptertype00(public var bitfield: UInt = 0u)

public data class D3dkmtAdapterPerfdata(
    public var physicalAdapterIndex: UInt = 0u,
    public var memoryFrequency: ULong = 0uL,
    public var maxMemoryFrequency: ULong = 0uL,
    public var maxMemoryFrequencyOC: ULong = 0uL,
    public var memoryBandwidth: ULong = 0uL,
    public var pCIEBandwidth: ULong = 0uL,
    public var fanRPM: UInt = 0u,
    public var power: UInt = 0u,
    public var temperature: UInt = 0u,
    public var powerStateOverride: UByte = 0u,
)

public data class D3dkmtAdapterPerfdatacaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var maxMemoryBandwidth: ULong = 0uL,
    public var maxPCIEBandwidth: ULong = 0uL,
    public var maxFanRPM: UInt = 0u,
    public var temperatureMax: UInt = 0u,
    public var temperatureWarning: UInt = 0u,
)
