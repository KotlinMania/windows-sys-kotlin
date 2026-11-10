@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size

public data class Ksrelativeevent0(
    public var objectHandle: Handle = null,
    public var objectPointer: COpaquePointer? = null,
)

public data class Ksresolution(
    public var granularity: Long = 0L,
    public var error: Long = 0L,
)

public data class KsrtaudioBuffer(
    public var bufferAddress: COpaquePointer? = null,
    public var actualBufferSize: UInt = 0u,
    public var callMemoryBarrier: Bool = 0,
)

public data class KsrtaudioBuffer32(
    public var bufferAddress: UInt = 0u,
    public var actualBufferSize: UInt = 0u,
    public var callMemoryBarrier: Bool = 0,
)

public data class KsrtaudioBufferProperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: COpaquePointer? = null,
    public var requestedBufferSize: UInt = 0u,
)

public data class KsrtaudioBufferProperty32(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: UInt = 0u,
    public var requestedBufferSize: UInt = 0u,
)

public data class KsrtaudioBufferPropertyWithNotification(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: COpaquePointer? = null,
    public var requestedBufferSize: UInt = 0u,
    public var notificationCount: UInt = 0u,
)

public data class KsrtaudioBufferPropertyWithNotification32(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: UInt = 0u,
    public var requestedBufferSize: UInt = 0u,
    public var notificationCount: UInt = 0u,
)

public data class KsrtaudioGetreadpacketInfo(
    public var packetNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var performanceCounterValue: ULong = 0uL,
    public var moreData: Bool = 0,
)

public data class KsrtaudioHwlatency(
    public var fifoSize: UInt = 0u,
    public var chipsetDelay: UInt = 0u,
    public var codecDelay: UInt = 0u,
)

public data class KsrtaudioHwregister(
    public var register: COpaquePointer? = null,
    public var width: UInt = 0u,
    public var numerator: ULong = 0uL,
    public var denominator: ULong = 0uL,
    public var accuracy: UInt = 0u,
)

public data class KsrtaudioHwregister32(
    public var register: UInt = 0u,
    public var width: UInt = 0u,
    public var numerator: ULong = 0uL,
    public var denominator: ULong = 0uL,
    public var accuracy: UInt = 0u,
)

public data class KsrtaudioHwregisterProperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: COpaquePointer? = null,
)

public data class KsrtaudioHwregisterProperty32(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: UInt = 0u,
)

public data class KsrtaudioNotificationEventProperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var notificationEvent: Handle = null,
)

public data class KsrtaudioNotificationEventProperty32(
    public var property: Ksidentifier = Ksidentifier(),
    public var notificationEvent: UInt = 0u,
)

public data class KsrtaudioPacketvregister(
    public var completedPacketCount: ULong? = null,
    public var completedPacketQPC: ULong? = null,
    public var completedPacketHash: ULong? = null,
)

public data class KsrtaudioPacketvregisterProperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: COpaquePointer? = null,
)

public data class KsrtaudioSetwritepacketInfo(
    public var packetNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var eosPacketLength: UInt = 0u,
)

public data class Kssounddetectorproperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var eventId: Guid = Guid(),
)

public data class KsstreamallocatorStatus(
    public var framing: KsallocatorFraming = KsallocatorFraming(),
    public var allocatedFrames: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsstreamallocatorStatusEx(
    public var framing: KsallocatorFramingEx = KsallocatorFramingEx(),
    public var allocatedFrames: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsstreamHeader(
    public var size: UInt = 0u,
    public var typeSpecificFlags: UInt = 0u,
    public var presentationTime: Kstime = Kstime(),
    public var duration: Long = 0L,
    public var frameExtent: UInt = 0u,
    public var dataUsed: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var optionsFlags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsstreamMetadataInfo(
    public var bufferSize: UInt = 0u,
    public var usedSize: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var systemVa: COpaquePointer? = null,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsstreamSegment(
    public var ksInterfaceHandler: COpaquePointer? = null,
    public var ksDataTypeHandler: COpaquePointer? = null,
    public var ioOperation: Ksiooperation = 0,
    public var completionEvent: Handle = null,
)

public data class KsstreamUvcMetadata(
    public var startOfFrameTimestamp: KsstreamUvcMetadatatypeTimestamp = KsstreamUvcMetadatatypeTimestamp(),
    public var endOfFrameTimestamp: KsstreamUvcMetadatatypeTimestamp = KsstreamUvcMetadatatypeTimestamp(),
)

public data class KsstreamUvcMetadatatypeTimestamp(
    public var presentationTimeStamp: UInt = 0u,
    public var sourceClockReference: UInt = 0u,
    public var anonymous: KsstreamUvcMetadatatypeTimestamp0 = KsstreamUvcMetadatatypeTimestamp0(),
    public var reserved0: UShort = 0u,
    public var reserved1: UInt = 0u,
)

public data class KsstreamUvcMetadatatypeTimestamp0(
    public var anonymous: KsstreamUvcMetadatatypeTimestamp00 = KsstreamUvcMetadatatypeTimestamp00(),
    public var sCRToken: UShort = 0u,
)

public data class KsstreamUvcMetadatatypeTimestamp00(
    public var bitfield: UShort = 0u,
)

public data class KstelephonyCallcontrol(
    public var callType: TelephonyCalltype = 0,
    public var callControlOp: TelephonyCallcontrolop = 0,
)

public data class KstelephonyCallinfo(
    public var callType: TelephonyCalltype = 0,
    public var callState: TelephonyCallstate = 0,
)

public data class KstelephonyProviderchange(
    public var callType: TelephonyCalltype = 0,
    public var providerChangeOp: TelephonyProviderchangeop = 0,
)

public data class Kstime(
    public var time: Long = 0L,
    public var numerator: UInt = 0u,
    public var denominator: UInt = 0u,
)

public data class Kstopology(
    public var categoriesCount: UInt = 0u,
    public var categories: Guid? = null,
    public var topologyNodesCount: UInt = 0u,
    public var topologyNodes: Guid? = null,
    public var topologyConnectionsCount: UInt = 0u,
    public var topologyConnections: KstopologyConnection? = null,
    public var topologyNodesNames: Guid? = null,
    public var reserved: UInt = 0u,
)

public data class KstopologyConnection(
    public var fromNode: UInt = 0u,
    public var fromNodePin: UInt = 0u,
    public var toNode: UInt = 0u,
    public var toNodePin: UInt = 0u,
)

public data class KstopologyEndpointid(
    public var topologyName: UShortArray = UShortArray(260),
    public var pinId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KstopologyEndpointid) return false
        if (!this.topologyName.contentEquals(other.topologyName)) return false
        if (this.pinId != other.pinId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.topologyName.contentHashCode()
        result = 31 * result + this.pinId.hashCode()
        return result
    }
}

public data class KstopologyEndpointidpair(
    public var renderEndpoint: KstopologyEndpointid = KstopologyEndpointid(),
    public var captureEndpoint: KstopologyEndpointid = KstopologyEndpointid(),
)

public data class Ksvpmaxpixelrate(
    public var size: KsAmvpsize = KsAmvpsize(),
    public var maxPixelsPerSecond: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsvpsizeProp(
    public var property: Ksidentifier = Ksidentifier(),
    public var size: KsAmvpsize = KsAmvpsize(),
)

public data class Ksvpsurfaceparams(
    public var dwPitch: UInt = 0u,
    public var dwXOrigin: UInt = 0u,
    public var dwYOrigin: UInt = 0u,
)

public data class KswavetableWaveDesc(
    public var identifier: Ksidentifier = Ksidentifier(),
    public var size: UInt = 0u,
    public var looped: Bool = 0,
    public var loopPoint: UInt = 0u,
    public var inROM: Bool = 0,
    public var format: Ksdataformat = Ksdataformat(),
)

public data class KswaveBuffer(
    public var attributes: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var bufferAddress: COpaquePointer? = null,
)

public data class KswaveCompatcaps(
    public var ulDeviceType: UInt = 0u,
)

public data class KswaveInputCapabilities(
    public var maximumChannelsPerConnection: UInt = 0u,
    public var minimumBitsPerSample: UInt = 0u,
    public var maximumBitsPerSample: UInt = 0u,
    public var minimumSampleFrequency: UInt = 0u,
    public var maximumSampleFrequency: UInt = 0u,
    public var totalConnections: UInt = 0u,
    public var activeConnections: UInt = 0u,
)

public class KswaveOutputCapabilities(
    public var maximumChannelsPerConnection: UInt = 0u,
    public var minimumBitsPerSample: UInt = 0u,
    public var maximumBitsPerSample: UInt = 0u,
    public var minimumSampleFrequency: UInt = 0u,
    public var maximumSampleFrequency: UInt = 0u,
    public var totalConnections: UInt = 0u,
    public var staticConnections: UInt = 0u,
    public var streamingConnections: UInt = 0u,
    public var activeConnections: UInt = 0u,
    public var activeStaticConnections: UInt = 0u,
    public var activeStreamingConnections: UInt = 0u,
    public var total3DConnections: UInt = 0u,
    public var static3DConnections: UInt = 0u,
    public var streaming3DConnections: UInt = 0u,
    public var active3DConnections: UInt = 0u,
    public var activeStatic3DConnections: UInt = 0u,
    public var activeStreaming3DConnections: UInt = 0u,
    public var totalSampleMemory: UInt = 0u,
    public var freeSampleMemory: UInt = 0u,
    public var largestFreeContiguousSampleMemory: UInt = 0u,
)

public data class KswaveVolume(
    public var leftAttenuation: Int = 0,
    public var rightAttenuation: Int = 0,
)

public data class KsAmvpdatainfo(
    public var dwSize: UInt = 0u,
    public var dwMicrosecondsPerField: UInt = 0u,
    public var amvpDimInfo: KsAmvpdiminfo = KsAmvpdiminfo(),
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var bEnableDoubleClock: Bool = 0,
    public var bEnableVACT: Bool = 0,
    public var bDataIsInterlaced: Bool = 0,
    public var lHalfLinesOdd: Int = 0,
    public var bFieldPolarityInverted: Bool = 0,
    public var dwNumLinesInVREF: UInt = 0u,
    public var lHalfLinesEven: Int = 0,
    public var dwReserved1: UInt = 0u,
)

public data class KsAmvpdiminfo(
    public var dwFieldWidth: UInt = 0u,
    public var dwFieldHeight: UInt = 0u,
    public var dwVBIWidth: UInt = 0u,
    public var dwVBIHeight: UInt = 0u,
    public var rcValidRegion: Rect = Rect(),
)

public data class KsAmvpsize(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
)

public data class KsAmExactRateChange(
    public var outputZeroTime: Long = 0L,
    public var rate: Int = 0,
)

public data class KsAmSimpleRateChange(
    public var startTime: Long = 0L,
    public var rate: Int = 0,
)

public data class KsAnalogvideoinfo(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwActiveWidth: UInt = 0u,
    public var dwActiveHeight: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
)

public data class KsBitmapinfoheader(
    public var biSize: UInt = 0u,
    public var biWidth: Int = 0,
    public var biHeight: Int = 0,
    public var biPlanes: UShort = 0u,
    public var biBitCount: UShort = 0u,
    public var biCompression: UInt = 0u,
    public var biSizeImage: UInt = 0u,
    public var biXPelsPerMeter: Int = 0,
    public var biYPelsPerMeter: Int = 0,
    public var biClrUsed: UInt = 0u,
    public var biClrImportant: UInt = 0u,
)

public data class KsColcon(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UByte = 0u,
)

public data class KsCompression(
    public var ratioNumerator: UInt = 0u,
    public var ratioDenominator: UInt = 0u,
    public var ratioConstantMargin: UInt = 0u,
)

public data class KsCopyMacrovision(
    public var mACROVISIONLevel: UInt = 0u,
)

public data class KsDataformatH264videoinfo(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var h264VideoInfoHeader: KsH264videoinfo = KsH264videoinfo(),
)

public data class KsDataformatImageinfo(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var imageInfoHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsDataformatMpegvideoinfo2(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var mpegVideoInfoHeader2: KsMpegvideoinfo2 = KsMpegvideoinfo2(),
)

public data class KsDataformatVbiinfoheader(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var vBIInfoHeader: KsVbiinfoheader = KsVbiinfoheader(),
)

public data class KsDataformatVideoinfoheader(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var videoInfoHeader: KsVideoinfoheader = KsVideoinfoheader(),
)

public data class KsDataformatVideoinfoheader2(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var videoInfoHeader2: KsVideoinfoheader2 = KsVideoinfoheader2(),
)

public data class KsDataformatVideoinfoPalette(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var videoInfo: KsVideoinfo = KsVideoinfo(),
)

public data class KsDatarangeAnalogvideo(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var analogVideoInfo: KsAnalogvideoinfo = KsAnalogvideoinfo(),
)

public data class KsDatarangeH264Video(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsH264videoinfo = KsH264videoinfo(),
)

public data class KsDatarangeImage(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var imageInfoHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsDatarangeMpeg1Video(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsMpeg1videoinfo = KsMpeg1videoinfo(),
)

public data class KsDatarangeMpeg2Video(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsMpegvideoinfo2 = KsMpegvideoinfo2(),
)

public data class KsDatarangeVideo(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsVideoinfoheader = KsVideoinfoheader(),
)

public data class KsDatarangeVideo2(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsVideoinfoheader2 = KsVideoinfoheader2(),
)

public data class KsDatarangeVideoPalette(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfo: KsVideoinfo = KsVideoinfo(),
)

public data class KsDatarangeVideoVbi(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var vBIInfoHeader: KsVbiinfoheader = KsVbiinfoheader(),
)

public data class KsDvdcopyBuskey(
    public var busKey: UByteArray = UByteArray(5),
    public var reserved: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyBuskey) return false
        if (!this.busKey.contentEquals(other.busKey)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.busKey.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class KsDvdcopyChlgkey(
    public var chlgKey: UByteArray = UByteArray(10),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyChlgkey) return false
        if (!this.chlgKey.contentEquals(other.chlgKey)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chlgKey.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class KsDvdcopyDisckey(
    public var discKey: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyDisckey) return false
        if (!this.discKey.contentEquals(other.discKey)) return false
        return true
    }

    override fun hashCode(): Int = this.discKey.contentHashCode()
}

public data class KsDvdcopyRegion(
    public var reserved: UByte = 0u,
    public var regionData: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyRegion) return false
        if (this.reserved != other.reserved) return false
        if (this.regionData != other.regionData) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.regionData.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class KsDvdcopySetCopyState(
    public var dVDCopyState: UInt = 0u,
)

public data class KsDvdcopyTitlekey(
    public var keyFlags: UInt = 0u,
    public var reservedNT: UIntArray = UIntArray(2),
    public var titleKey: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyTitlekey) return false
        if (this.keyFlags != other.keyFlags) return false
        if (!this.reservedNT.contentEquals(other.reservedNT)) return false
        if (!this.titleKey.contentEquals(other.titleKey)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyFlags.hashCode()
        result = 31 * result + this.reservedNT.contentHashCode()
        result = 31 * result + this.titleKey.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class KsDvdYcrCb(
    public var reserved: UByte = 0u,
    public var y: UByte = 0u,
    public var cr: UByte = 0u,
    public var cb: UByte = 0u,
)

public data class KsDvdYuv(
    public var reserved: UByte = 0u,
    public var y: UByte = 0u,
    public var v: UByte = 0u,
    public var u: UByte = 0u,
)

public data class KsFrameInfo(
    public var extendedHeaderSize: UInt = 0u,
    public var dwFrameFlags: UInt = 0u,
    public var pictureNumber: Long = 0L,
    public var dropCount: Long = 0L,
    public var hDirectDraw: Handle = null,
    public var hSurfaceHandle: Handle = null,
    public var directDrawRect: Rect = Rect(),
    public var anonymous1: KsFrameInfo0 = KsFrameInfo0(),
    public var reserved2: UInt = 0u,
    public var anonymous2: KsFrameInfo1 = KsFrameInfo1(),
)

public data class KsFrameInfo0(
    public var lSurfacePitch: Int = 0,
    public var reserved1: UInt = 0u,
)

public data class KsFrameInfo1(
    public var anonymous: KsFrameInfo10 = KsFrameInfo10(),
    public var frameCompletionNumber: ULong = 0uL,
)

public data class KsFrameInfo10(
    public var reserved3: UInt = 0u,
    public var reserved4: UInt = 0u,
)

public data class KsFramingItem(
    public var memoryType: Guid = Guid(),
    public var busType: Guid = Guid(),
    public var memoryFlags: UInt = 0u,
    public var busFlags: UInt = 0u,
    public var flags: UInt = 0u,
    public var frames: UInt = 0u,
    public var anonymous: KsFramingItem0 = KsFramingItem0(),
    public var memoryTypeWeight: UInt = 0u,
    public var physicalRange: KsFramingRange = KsFramingRange(),
    public var framingRange: KsFramingRangeWeighted = KsFramingRangeWeighted(),
)

public data class KsFramingItem0(
    public var fileAlignment: UInt = 0u,
    public var framePitch: Int = 0,
)

public data class KsFramingRange(
    public var minFrameSize: UInt = 0u,
    public var maxFrameSize: UInt = 0u,
    public var stepping: UInt = 0u,
)

public data class KsFramingRangeWeighted(
    public var range: KsFramingRange = KsFramingRange(),
    public var inPlaceWeight: UInt = 0u,
    public var notInPlaceWeight: UInt = 0u,
)

public class KsH264videoinfo(
    public var wWidth: UShort = 0u,
    public var wHeight: UShort = 0u,
    public var wSARwidth: UShort = 0u,
    public var wSARheight: UShort = 0u,
    public var wProfile: UShort = 0u,
    public var bLevelIDC: UByte = 0u,
    public var wConstrainedToolset: UShort = 0u,
    public var bmSupportedUsages: UInt = 0u,
    public var bmCapabilities: UShort = 0u,
    public var bmSVCCapabilities: UInt = 0u,
    public var bmMVCCapabilities: UInt = 0u,
    public var dwFrameInterval: UInt = 0u,
    public var bMaxCodecConfigDelay: UByte = 0u,
    public var bmSupportedSliceModes: UByte = 0u,
    public var bmSupportedSyncFrameTypes: UByte = 0u,
    public var bResolutionScaling: UByte = 0u,
    public var bSimulcastSupport: UByte = 0u,
    public var bmSupportedRateControlModes: UByte = 0u,
    public var wMaxMBperSecOneResolutionNoScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsNoScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsNoScalability: UShort = 0u,
    public var wMaxMBperSecFourResolutionsNoScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionTemporalScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsTemporalScalablility: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsTemporalScalability: UShort = 0u,
    public var wMaxMBperSecFourResolutionsTemporalScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionTemporalQualityScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsTemporalQualityScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsTemporalQualityScalablity: UShort = 0u,
    public var wMaxMBperSecFourResolutionsTemporalQualityScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionTemporalSpatialScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsTemporalSpatialScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsTemporalSpatialScalablity: UShort = 0u,
    public var wMaxMBperSecFourResolutionsTemporalSpatialScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionFullScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsFullScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsFullScalability: UShort = 0u,
    public var wMaxMBperSecFourResolutionsFullScalability: UShort = 0u,
)

public data class KsMpeg1videoinfo(
    public var hdr: KsVideoinfoheader = KsVideoinfoheader(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var bSequenceHeader: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsMpeg1videoinfo) return false
        if (this.hdr != other.hdr) return false
        if (this.dwStartTimeCode != other.dwStartTimeCode) return false
        if (this.cbSequenceHeader != other.cbSequenceHeader) return false
        if (!this.bSequenceHeader.contentEquals(other.bSequenceHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwStartTimeCode.hashCode()
        result = 31 * result + this.cbSequenceHeader.hashCode()
        result = 31 * result + this.bSequenceHeader.contentHashCode()
        return result
    }
}

public data class KsMpegaudioinfo(
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
)

public data class KsMpegvideoinfo2(
    public var hdr: KsVideoinfoheader2 = KsVideoinfoheader2(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var dwProfile: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bSequenceHeader: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsMpegvideoinfo2) return false
        if (this.hdr != other.hdr) return false
        if (this.dwStartTimeCode != other.dwStartTimeCode) return false
        if (this.cbSequenceHeader != other.cbSequenceHeader) return false
        if (this.dwProfile != other.dwProfile) return false
        if (this.dwLevel != other.dwLevel) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.bSequenceHeader.contentEquals(other.bSequenceHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwStartTimeCode.hashCode()
        result = 31 * result + this.cbSequenceHeader.hashCode()
        result = 31 * result + this.dwProfile.hashCode()
        result = 31 * result + this.dwLevel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bSequenceHeader.contentHashCode()
        return result
    }
}

public data class KsRgbquad(
    public var rgbBlue: UByte = 0u,
    public var rgbGreen: UByte = 0u,
    public var rgbRed: UByte = 0u,
    public var rgbReserved: UByte = 0u,
)

public data class KsTruecolorinfo(
    public var dwBitMasks: UIntArray = UIntArray(3),
    public var bmiColors: List<KsRgbquad> = List(256) { KsRgbquad() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsTruecolorinfo) return false
        if (!this.dwBitMasks.contentEquals(other.dwBitMasks)) return false
        if (this.bmiColors != other.bmiColors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwBitMasks.contentHashCode()
        result = 31 * result + this.bmiColors.hashCode()
        return result
    }
}

public data class KsTvtunerChangeInfo(
    public var dwFlags: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwAnalogVideoStandard: UInt = 0u,
    public var dwChannel: UInt = 0u,
)

public data class KsVbiinfoheader(
    public var startLine: UInt = 0u,
    public var endLine: UInt = 0u,
    public var samplingFrequency: UInt = 0u,
    public var minLineStartTime: UInt = 0u,
    public var maxLineStartTime: UInt = 0u,
    public var actualLineStartTime: UInt = 0u,
    public var actualLineEndTime: UInt = 0u,
    public var videoStandard: UInt = 0u,
    public var samplesPerLine: UInt = 0u,
    public var strideInBytes: UInt = 0u,
    public var bufferSize: UInt = 0u,
)

public data class KsVbiFrameInfo(
    public var extendedHeaderSize: UInt = 0u,
    public var dwFrameFlags: UInt = 0u,
    public var pictureNumber: Long = 0L,
    public var dropCount: Long = 0L,
    public var dwSamplingFrequency: UInt = 0u,
    public var tvTunerChangeInfo: KsTvtunerChangeInfo = KsTvtunerChangeInfo(),
    public var vBIInfoHeader: KsVbiinfoheader = KsVbiinfoheader(),
)

public data class KsVideoinfo(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var bmiHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
    public var anonymous: KsVideoinfo0 = KsVideoinfo0(),
)

public data class KsVideoinfo0(
    public var bmiColors: List<KsRgbquad> = List(256) { KsRgbquad() },
    public var dwBitMasks: UIntArray = UIntArray(3),
    public var trueColorInfo: KsTruecolorinfo = KsTruecolorinfo(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsVideoinfo0) return false
        if (this.bmiColors != other.bmiColors) return false
        if (!this.dwBitMasks.contentEquals(other.dwBitMasks)) return false
        if (this.trueColorInfo != other.trueColorInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bmiColors.hashCode()
        result = 31 * result + this.dwBitMasks.contentHashCode()
        result = 31 * result + this.trueColorInfo.hashCode()
        return result
    }
}

public data class KsVideoinfoheader(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var bmiHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsVideoinfoheader2(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var dwInterlaceFlags: UInt = 0u,
    public var dwCopyProtectFlags: UInt = 0u,
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var anonymous: KsVideoinfoheader20 = KsVideoinfoheader20(),
    public var dwReserved2: UInt = 0u,
    public var bmiHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsVideoinfoheader20(
    public var dwControlFlags: UInt = 0u,
    public var dwReserved1: UInt = 0u,
)

public class KsVideoStreamConfigCaps(
    public var guid: Guid = Guid(),
    public var videoStandard: UInt = 0u,
    public var inputSize: Size = Size(),
    public var minCroppingSize: Size = Size(),
    public var maxCroppingSize: Size = Size(),
    public var cropGranularityX: Int = 0,
    public var cropGranularityY: Int = 0,
    public var cropAlignX: Int = 0,
    public var cropAlignY: Int = 0,
    public var minOutputSize: Size = Size(),
    public var maxOutputSize: Size = Size(),
    public var outputGranularityX: Int = 0,
    public var outputGranularityY: Int = 0,
    public var stretchTapsX: Int = 0,
    public var stretchTapsY: Int = 0,
    public var shrinkTapsX: Int = 0,
    public var shrinkTapsY: Int = 0,
    public var minFrameInterval: Long = 0L,
    public var maxFrameInterval: Long = 0L,
    public var minBitsPerSecond: Int = 0,
    public var maxBitsPerSecond: Int = 0,
)

public data class LoopedstreamingPositionEventData(
    public var ksEventData: Kseventdata = Kseventdata(),
    public var position: ULong = 0uL,
)

public data class MediumInfo(
    public var mediaPresent: Bool = 0,
    public var mediaType: UInt = 0u,
    public var recordInhibit: Bool = 0,
)

public data class MfMdlSharedPayloadKey(
    public var combined: MfMdlSharedPayloadKey0 = MfMdlSharedPayloadKey0(),
    public var gMDLHandle: Guid = Guid(),
)

public data class MfMdlSharedPayloadKey0(
    public var pHandle: UInt = 0u,
    public var fHandle: UInt = 0u,
    public var uPayload: ULong = 0uL,
)

public data class NabtsfecBuffer(
    public var dataSize: UInt = 0u,
    public var groupID: UShort = 0u,
    public var reserved: UShort = 0u,
    public var data: UByteArray = UByteArray(448),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NabtsfecBuffer) return false
        if (this.dataSize != other.dataSize) return false
        if (this.groupID != other.groupID) return false
        if (this.reserved != other.reserved) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSize.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class NabtsBuffer(
    public var scanlinesRequested: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
    public var pictureNumber: Long = 0L,
    public var nabtsLines: List<NabtsBufferLine> = List(11) { NabtsBufferLine() },
)

public data class NabtsBufferLine(
    public var confidence: UByte = 0u,
    public var bytes: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NabtsBufferLine) return false
        if (this.confidence != other.confidence) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.confidence.hashCode()
        result = 31 * result + this.bytes.contentHashCode()
        return result
    }
}

public data class OptimalWeightTotals(
    public var minTotalNominator: Long = 0L,
    public var maxTotalNominator: Long = 0L,
    public var totalDenominator: Long = 0L,
)

public data class PipeDimensions(
    public var allocatorPin: KsCompression = KsCompression(),
    public var maxExpansionPin: KsCompression = KsCompression(),
    public var endPin: KsCompression = KsCompression(),
)

public data class PipeTermination(
    public var flags: UInt = 0u,
    public var outsideFactors: UInt = 0u,
    public var weigth: UInt = 0u,
    public var physicalRange: KsFramingRange = KsFramingRange(),
    public var optimalRange: KsFramingRangeWeighted = KsFramingRangeWeighted(),
    public var compression: KsCompression = KsCompression(),
)

public data class SecureBufferInfo(
    public var guidBufferIdentifier: Guid = Guid(),
    public var cbBufferSize: UInt = 0u,
    public var cbCaptured: UInt = 0u,
    public var ullReserved: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureBufferInfo) return false
        if (this.guidBufferIdentifier != other.guidBufferIdentifier) return false
        if (this.cbBufferSize != other.cbBufferSize) return false
        if (this.cbCaptured != other.cbCaptured) return false
        if (!this.ullReserved.contentEquals(other.ullReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidBufferIdentifier.hashCode()
        result = 31 * result + this.cbBufferSize.hashCode()
        result = 31 * result + this.cbCaptured.hashCode()
        result = 31 * result + this.ullReserved.contentHashCode()
        return result
    }
}

public data class SounddetectorPatternheader(
    public var size: UInt = 0u,
    public var patternType: Guid = Guid(),
)

public data class Transportaudioparms(
    public var enableOutput: Int = 0,
    public var enableRecord: Int = 0,
    public var enableSelsync: Int = 0,
    public var input: Int = 0,
    public var monitorSource: Int = 0,
)

public class Transportbasicparms(
    public var timeFormat: Int = 0,
    public var timeReference: Int = 0,
    public var superimpose: Int = 0,
    public var endStopAction: Int = 0,
    public var recordFormat: Int = 0,
    public var stepFrames: Int = 0,
    public var setpField: Int = 0,
    public var preroll: Int = 0,
    public var recPreroll: Int = 0,
    public var postroll: Int = 0,
    public var editDelay: Int = 0,
    public var playTCDelay: Int = 0,
    public var recTCDelay: Int = 0,
    public var editField: Int = 0,
    public var frameServo: Int = 0,
    public var colorFrameServo: Int = 0,
    public var servoRef: Int = 0,
    public var warnGenlock: Int = 0,
    public var setTracking: Int = 0,
    public var volumeName: ByteArray = ByteArray(40),
    public var ballistic: IntArray = IntArray(20),
    public var speed: Int = 0,
    public var counterFormat: Int = 0,
    public var tunerChannel: Int = 0,
    public var tunerNumber: Int = 0,
    public var timerEvent: Int = 0,
    public var timerStartDay: Int = 0,
    public var timerStartTime: Int = 0,
    public var timerStopDay: Int = 0,
    public var timerStopTime: Int = 0,
)

public data class Transportstatus(
    public var mode: Int = 0,
    public var lastError: Int = 0,
    public var recordInhibit: Int = 0,
    public var servoLock: Int = 0,
    public var mediaPresent: Int = 0,
    public var mediaLength: Int = 0,
    public var mediaSize: Int = 0,
    public var mediaTrackCount: Int = 0,
    public var mediaTrackLength: Int = 0,
    public var mediaTrackSide: Int = 0,
    public var mediaType: Int = 0,
    public var linkMode: Int = 0,
    public var notifyOn: Int = 0,
)

public data class Transportvideoparms(
    public var outputMode: Int = 0,
    public var input: Int = 0,
)

public data class TransportState(
    public var mode: UInt = 0u,
    public var state: UInt = 0u,
)

public data class TunerAnalogCapsS(
    public var mode: UInt = 0u,
    public var standardsSupported: UInt = 0u,
    public var minFrequency: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var tuningGranularity: UInt = 0u,
    public var settlingTime: UInt = 0u,
    public var scanSensingRange: UInt = 0u,
    public var fineTuneSensingRange: UInt = 0u,
)

public data class VbicapPropertiesProtectionS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var status: UInt = 0u,
)

public data class VbicodecfilteringCcSubstreams(
    public var substreamMask: UInt = 0u,
)

public data class VbicodecfilteringNabtsSubstreams(
    public var substreamMask: UIntArray = UIntArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbicodecfilteringNabtsSubstreams) return false
        if (!this.substreamMask.contentEquals(other.substreamMask)) return false
        return true
    }

    override fun hashCode(): Int = this.substreamMask.contentHashCode()
}

public data class VbicodecfilteringScanlines(
    public var dwordBitArray: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbicodecfilteringScanlines) return false
        if (!this.dwordBitArray.contentEquals(other.dwordBitArray)) return false
        return true
    }

    override fun hashCode(): Int = this.dwordBitArray.contentHashCode()
}

public data class VbicodecfilteringStatisticsCc(
    public var common: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
)

public data class VbicodecfilteringStatisticsCcPin(
    public var common: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
)

public data class VbicodecfilteringStatisticsCommon(
    public var inputSRBsProcessed: UInt = 0u,
    public var outputSRBsProcessed: UInt = 0u,
    public var sRBsIgnored: UInt = 0u,
    public var inputSRBsMissing: UInt = 0u,
    public var outputSRBsMissing: UInt = 0u,
    public var outputFailures: UInt = 0u,
    public var internalErrors: UInt = 0u,
    public var externalErrors: UInt = 0u,
    public var inputDiscontinuities: UInt = 0u,
    public var dSPFailures: UInt = 0u,
    public var tvTunerChanges: UInt = 0u,
    public var vBIHeaderChanges: UInt = 0u,
    public var lineConfidenceAvg: UInt = 0u,
    public var bytesOutput: UInt = 0u,
)

public data class VbicodecfilteringStatisticsCommonPin(
    public var sRBsProcessed: UInt = 0u,
    public var sRBsIgnored: UInt = 0u,
    public var sRBsMissing: UInt = 0u,
    public var internalErrors: UInt = 0u,
    public var externalErrors: UInt = 0u,
    public var discontinuities: UInt = 0u,
    public var lineConfidenceAvg: UInt = 0u,
    public var bytesOutput: UInt = 0u,
)

public data class VbicodecfilteringStatisticsNabts(
    public var common: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
    public var fECBundleBadLines: UInt = 0u,
    public var fECQueueOverflows: UInt = 0u,
    public var fECCorrectedLines: UInt = 0u,
    public var fECUncorrectableLines: UInt = 0u,
    public var bundlesProcessed: UInt = 0u,
    public var bundlesSent2IP: UInt = 0u,
    public var filteredLines: UInt = 0u,
)

public data class VbicodecfilteringStatisticsNabtsPin(
    public var common: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
)

public data class VbicodecfilteringStatisticsTeletext(
    public var common: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
)

public data class VbicodecfilteringStatisticsTeletextPin(
    public var common: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
)

public data class VramSurfaceInfo(
    public var hSurface: Int = 0,
    public var vramPhysicalAddress: Long = 0L,
    public var cbCaptured: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwLinearSize: UInt = 0u,
    public var lPitch: Int = 0,
    public var ullReserved: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VramSurfaceInfo) return false
        if (this.hSurface != other.hSurface) return false
        if (this.vramPhysicalAddress != other.vramPhysicalAddress) return false
        if (this.cbCaptured != other.cbCaptured) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwLinearSize != other.dwLinearSize) return false
        if (this.lPitch != other.lPitch) return false
        if (!this.ullReserved.contentEquals(other.ullReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSurface.hashCode()
        result = 31 * result + this.vramPhysicalAddress.hashCode()
        result = 31 * result + this.cbCaptured.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwLinearSize.hashCode()
        result = 31 * result + this.lPitch.hashCode()
        result = 31 * result + this.ullReserved.contentHashCode()
        return result
    }
}

public data class VramSurfaceInfoPropertyS(
    public var property: Ksidentifier = Ksidentifier(),
    public var pVramSurfaceInfo: VramSurfaceInfo? = null,
)

public data class WnfKscameraStreamstateInfo(
    public var processId: UInt = 0u,
    public var sessionId: UInt = 0u,
    public var streamState: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class WstBuffer(
    public var scanlinesRequested: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
    public var wstLines: List<WstBufferLine> = List(17) { WstBufferLine() },
)

public data class WstBufferLine(
    public var confidence: UByte = 0u,
    public var bytes: UByteArray = UByteArray(42),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WstBufferLine) return false
        if (this.confidence != other.confidence) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.confidence.hashCode()
        result = 31 * result + this.bytes.contentHashCode()
        return result
    }
}
