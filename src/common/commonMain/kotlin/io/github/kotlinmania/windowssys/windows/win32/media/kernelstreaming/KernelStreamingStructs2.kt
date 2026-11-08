@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE

public data class KSRELATIVEEVENT_0(public var ObjectHandle: HANDLE = 0L, public var ObjectPointer: Long = 0L)

public data class KSRESOLUTION(public var Granularity: Long = 0L, public var Error: Long = 0L)

public data class KSRTAUDIO_BUFFER(
    public var BufferAddress: Long = 0L,
    public var ActualBufferSize: UInt = 0u,
    public var CallMemoryBarrier: BOOL = 0,
)

public data class KSRTAUDIO_BUFFER32(
    public var BufferAddress: UInt = 0u,
    public var ActualBufferSize: UInt = 0u,
    public var CallMemoryBarrier: BOOL = 0,
)

public data class KSRTAUDIO_BUFFER_PROPERTY(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var BaseAddress: Long = 0L,
    public var RequestedBufferSize: UInt = 0u,
)

public data class KSRTAUDIO_BUFFER_PROPERTY32(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var BaseAddress: UInt = 0u,
    public var RequestedBufferSize: UInt = 0u,
)

public data class KSRTAUDIO_BUFFER_PROPERTY_WITH_NOTIFICATION(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var BaseAddress: Long = 0L,
    public var RequestedBufferSize: UInt = 0u,
    public var NotificationCount: UInt = 0u,
)

public data class KSRTAUDIO_BUFFER_PROPERTY_WITH_NOTIFICATION32(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var BaseAddress: UInt = 0u,
    public var RequestedBufferSize: UInt = 0u,
    public var NotificationCount: UInt = 0u,
)

public data class KSRTAUDIO_GETREADPACKET_INFO(
    public var PacketNumber: UInt = 0u,
    public var Flags: UInt = 0u,
    public var PerformanceCounterValue: ULong = 0uL,
    public var MoreData: BOOL = 0,
)

public data class KSRTAUDIO_HWLATENCY(
    public var FifoSize: UInt = 0u,
    public var ChipsetDelay: UInt = 0u,
    public var CodecDelay: UInt = 0u,
)

public data class KSRTAUDIO_HWREGISTER(
    public var Register: Long = 0L,
    public var Width: UInt = 0u,
    public var Numerator: ULong = 0uL,
    public var Denominator: ULong = 0uL,
    public var Accuracy: UInt = 0u,
)

public data class KSRTAUDIO_HWREGISTER32(
    public var Register: UInt = 0u,
    public var Width: UInt = 0u,
    public var Numerator: ULong = 0uL,
    public var Denominator: ULong = 0uL,
    public var Accuracy: UInt = 0u,
)

public data class KSRTAUDIO_HWREGISTER_PROPERTY(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var BaseAddress: Long = 0L)

public data class KSRTAUDIO_HWREGISTER_PROPERTY32(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var BaseAddress: UInt = 0u)

public data class KSRTAUDIO_NOTIFICATION_EVENT_PROPERTY(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var NotificationEvent: HANDLE = 0L)

public data class KSRTAUDIO_NOTIFICATION_EVENT_PROPERTY32(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var NotificationEvent: UInt = 0u)

public data class KSRTAUDIO_PACKETVREGISTER(
    public var CompletedPacketCount: Long = 0L,
    public var CompletedPacketQPC: Long = 0L,
    public var CompletedPacketHash: Long = 0L,
)

public data class KSRTAUDIO_PACKETVREGISTER_PROPERTY(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var BaseAddress: Long = 0L)

public data class KSRTAUDIO_SETWRITEPACKET_INFO(
    public var PacketNumber: UInt = 0u,
    public var Flags: UInt = 0u,
    public var EosPacketLength: UInt = 0u,
)

public data class KSSOUNDDETECTORPROPERTY(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var EventId: GUID = GUID())

public data class KSSTREAMALLOCATOR_STATUS(
    public var Framing: KSALLOCATOR_FRAMING = KSALLOCATOR_FRAMING(),
    public var AllocatedFrames: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSSTREAMALLOCATOR_STATUS_EX(
    public var Framing: KSALLOCATOR_FRAMING_EX = KSALLOCATOR_FRAMING_EX(),
    public var AllocatedFrames: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSSTREAM_HEADER(
    public var Size: UInt = 0u,
    public var TypeSpecificFlags: UInt = 0u,
    public var PresentationTime: KSTIME = KSTIME(),
    public var Duration: Long = 0L,
    public var FrameExtent: UInt = 0u,
    public var DataUsed: UInt = 0u,
    public var Data: Long = 0L,
    public var OptionsFlags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSSTREAM_METADATA_INFO(
    public var BufferSize: UInt = 0u,
    public var UsedSize: UInt = 0u,
    public var Data: Long = 0L,
    public var SystemVa: Long = 0L,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSSTREAM_SEGMENT(
    public var KsInterfaceHandler: Long = 0L,
    public var KsDataTypeHandler: Long = 0L,
    public var IoOperation: KSIOOPERATION = 0,
    public var CompletionEvent: HANDLE = 0L,
)

public data class KSSTREAM_UVC_METADATA(public var StartOfFrameTimestamp: KSSTREAM_UVC_METADATATYPE_TIMESTAMP = KSSTREAM_UVC_METADATATYPE_TIMESTAMP(), public var EndOfFrameTimestamp: KSSTREAM_UVC_METADATATYPE_TIMESTAMP = KSSTREAM_UVC_METADATATYPE_TIMESTAMP())

public data class KSSTREAM_UVC_METADATATYPE_TIMESTAMP(
    public var PresentationTimeStamp: UInt = 0u,
    public var SourceClockReference: UInt = 0u,
    public var Anonymous: KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0 = KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0(),
    public var Reserved0: UShort = 0u,
    public var Reserved1: UInt = 0u,
)

public data class KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0(public var Anonymous: KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0_0 = KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0_0(), public var SCRToken: UShort = 0u)

public data class KSSTREAM_UVC_METADATATYPE_TIMESTAMP_0_0(public var _bitfield: UShort = 0u)

public data class KSTELEPHONY_CALLCONTROL(public var CallType: TELEPHONY_CALLTYPE = 0, public var CallControlOp: TELEPHONY_CALLCONTROLOP = 0)

public data class KSTELEPHONY_CALLINFO(public var CallType: TELEPHONY_CALLTYPE = 0, public var CallState: TELEPHONY_CALLSTATE = 0)

public data class KSTELEPHONY_PROVIDERCHANGE(public var CallType: TELEPHONY_CALLTYPE = 0, public var ProviderChangeOp: TELEPHONY_PROVIDERCHANGEOP = 0)

public data class KSTIME(
    public var Time: Long = 0L,
    public var Numerator: UInt = 0u,
    public var Denominator: UInt = 0u,
)

public data class KSTOPOLOGY(
    public var CategoriesCount: UInt = 0u,
    public var Categories: Long = 0L,
    public var TopologyNodesCount: UInt = 0u,
    public var TopologyNodes: Long = 0L,
    public var TopologyConnectionsCount: UInt = 0u,
    public var TopologyConnections: Long = 0L,
    public var TopologyNodesNames: Long = 0L,
    public var Reserved: UInt = 0u,
)

public data class KSTOPOLOGY_CONNECTION(
    public var FromNode: UInt = 0u,
    public var FromNodePin: UInt = 0u,
    public var ToNode: UInt = 0u,
    public var ToNodePin: UInt = 0u,
)

public data class KSTOPOLOGY_ENDPOINTID(public var TopologyName: UShortArray = UShortArray(260), public var PinId: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSTOPOLOGY_ENDPOINTID) return false
        if (!this.TopologyName.contentEquals(other.TopologyName)) return false
        if (this.PinId != other.PinId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TopologyName.contentHashCode()
        result = 31 * result + this.PinId.hashCode()
        return result
    }
}

public data class KSTOPOLOGY_ENDPOINTIDPAIR(public var RenderEndpoint: KSTOPOLOGY_ENDPOINTID = KSTOPOLOGY_ENDPOINTID(), public var CaptureEndpoint: KSTOPOLOGY_ENDPOINTID = KSTOPOLOGY_ENDPOINTID())

public data class KSVPMAXPIXELRATE(
    public var Size: KS_AMVPSIZE = KS_AMVPSIZE(),
    public var MaxPixelsPerSecond: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSVPSIZE_PROP(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Size: KS_AMVPSIZE = KS_AMVPSIZE())

public data class KSVPSURFACEPARAMS(
    public var dwPitch: UInt = 0u,
    public var dwXOrigin: UInt = 0u,
    public var dwYOrigin: UInt = 0u,
)

public data class KSWAVETABLE_WAVE_DESC(
    public var Identifier: KSIDENTIFIER = KSIDENTIFIER(),
    public var Size: UInt = 0u,
    public var Looped: BOOL = 0,
    public var LoopPoint: UInt = 0u,
    public var InROM: BOOL = 0,
    public var Format: KSDATAFORMAT = KSDATAFORMAT(),
)

public data class KSWAVE_BUFFER(
    public var Attributes: UInt = 0u,
    public var BufferSize: UInt = 0u,
    public var BufferAddress: Long = 0L,
)

public data class KSWAVE_COMPATCAPS(public var ulDeviceType: UInt = 0u)

public data class KSWAVE_INPUT_CAPABILITIES(
    public var MaximumChannelsPerConnection: UInt = 0u,
    public var MinimumBitsPerSample: UInt = 0u,
    public var MaximumBitsPerSample: UInt = 0u,
    public var MinimumSampleFrequency: UInt = 0u,
    public var MaximumSampleFrequency: UInt = 0u,
    public var TotalConnections: UInt = 0u,
    public var ActiveConnections: UInt = 0u,
)

public class KSWAVE_OUTPUT_CAPABILITIES(
    public var MaximumChannelsPerConnection: UInt = 0u,
    public var MinimumBitsPerSample: UInt = 0u,
    public var MaximumBitsPerSample: UInt = 0u,
    public var MinimumSampleFrequency: UInt = 0u,
    public var MaximumSampleFrequency: UInt = 0u,
    public var TotalConnections: UInt = 0u,
    public var StaticConnections: UInt = 0u,
    public var StreamingConnections: UInt = 0u,
    public var ActiveConnections: UInt = 0u,
    public var ActiveStaticConnections: UInt = 0u,
    public var ActiveStreamingConnections: UInt = 0u,
    public var Total3DConnections: UInt = 0u,
    public var Static3DConnections: UInt = 0u,
    public var Streaming3DConnections: UInt = 0u,
    public var Active3DConnections: UInt = 0u,
    public var ActiveStatic3DConnections: UInt = 0u,
    public var ActiveStreaming3DConnections: UInt = 0u,
    public var TotalSampleMemory: UInt = 0u,
    public var FreeSampleMemory: UInt = 0u,
    public var LargestFreeContiguousSampleMemory: UInt = 0u,
)

public data class KSWAVE_VOLUME(public var LeftAttenuation: Int = 0, public var RightAttenuation: Int = 0)

public data class KS_AMVPDATAINFO(
    public var dwSize: UInt = 0u,
    public var dwMicrosecondsPerField: UInt = 0u,
    public var amvpDimInfo: KS_AMVPDIMINFO = KS_AMVPDIMINFO(),
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var bEnableDoubleClock: BOOL = 0,
    public var bEnableVACT: BOOL = 0,
    public var bDataIsInterlaced: BOOL = 0,
    public var lHalfLinesOdd: Int = 0,
    public var bFieldPolarityInverted: BOOL = 0,
    public var dwNumLinesInVREF: UInt = 0u,
    public var lHalfLinesEven: Int = 0,
    public var dwReserved1: UInt = 0u,
)

public data class KS_AMVPDIMINFO(
    public var dwFieldWidth: UInt = 0u,
    public var dwFieldHeight: UInt = 0u,
    public var dwVBIWidth: UInt = 0u,
    public var dwVBIHeight: UInt = 0u,
    public var rcValidRegion: RECT = RECT(),
)

public data class KS_AMVPSIZE(public var dwWidth: UInt = 0u, public var dwHeight: UInt = 0u)

public data class KS_AM_ExactRateChange(public var OutputZeroTime: Long = 0L, public var Rate: Int = 0)

public data class KS_AM_SimpleRateChange(public var StartTime: Long = 0L, public var Rate: Int = 0)

public data class KS_ANALOGVIDEOINFO(
    public var rcSource: RECT = RECT(),
    public var rcTarget: RECT = RECT(),
    public var dwActiveWidth: UInt = 0u,
    public var dwActiveHeight: UInt = 0u,
    public var AvgTimePerFrame: Long = 0L,
)

public data class KS_BITMAPINFOHEADER(
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

public data class KS_COLCON(
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: UByte = 0u,
    public var _bitfield4: UByte = 0u,
)

public data class KS_COMPRESSION(
    public var RatioNumerator: UInt = 0u,
    public var RatioDenominator: UInt = 0u,
    public var RatioConstantMargin: UInt = 0u,
)

public data class KS_COPY_MACROVISION(public var MACROVISIONLevel: UInt = 0u)

public data class KS_DATAFORMAT_H264VIDEOINFO(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var H264VideoInfoHeader: KS_H264VIDEOINFO = KS_H264VIDEOINFO())

public data class KS_DATAFORMAT_IMAGEINFO(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var ImageInfoHeader: KS_BITMAPINFOHEADER = KS_BITMAPINFOHEADER())

public data class KS_DATAFORMAT_MPEGVIDEOINFO2(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var MpegVideoInfoHeader2: KS_MPEGVIDEOINFO2 = KS_MPEGVIDEOINFO2())

public data class KS_DATAFORMAT_VBIINFOHEADER(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var VBIInfoHeader: KS_VBIINFOHEADER = KS_VBIINFOHEADER())

public data class KS_DATAFORMAT_VIDEOINFOHEADER(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var VideoInfoHeader: KS_VIDEOINFOHEADER = KS_VIDEOINFOHEADER())

public data class KS_DATAFORMAT_VIDEOINFOHEADER2(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var VideoInfoHeader2: KS_VIDEOINFOHEADER2 = KS_VIDEOINFOHEADER2())

public data class KS_DATAFORMAT_VIDEOINFO_PALETTE(public var DataFormat: KSDATAFORMAT = KSDATAFORMAT(), public var VideoInfo: KS_VIDEOINFO = KS_VIDEOINFO())

public data class KS_DATARANGE_ANALOGVIDEO(public var DataRange: KSDATAFORMAT = KSDATAFORMAT(), public var AnalogVideoInfo: KS_ANALOGVIDEOINFO = KS_ANALOGVIDEOINFO())

public data class KS_DATARANGE_H264_VIDEO(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VideoInfoHeader: KS_H264VIDEOINFO = KS_H264VIDEOINFO(),
)

public data class KS_DATARANGE_IMAGE(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var ImageInfoHeader: KS_BITMAPINFOHEADER = KS_BITMAPINFOHEADER(),
)

public data class KS_DATARANGE_MPEG1_VIDEO(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VideoInfoHeader: KS_MPEG1VIDEOINFO = KS_MPEG1VIDEOINFO(),
)

public data class KS_DATARANGE_MPEG2_VIDEO(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VideoInfoHeader: KS_MPEGVIDEOINFO2 = KS_MPEGVIDEOINFO2(),
)

public data class KS_DATARANGE_VIDEO(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VideoInfoHeader: KS_VIDEOINFOHEADER = KS_VIDEOINFOHEADER(),
)

public data class KS_DATARANGE_VIDEO2(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VideoInfoHeader: KS_VIDEOINFOHEADER2 = KS_VIDEOINFOHEADER2(),
)

public data class KS_DATARANGE_VIDEO_PALETTE(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VideoInfo: KS_VIDEOINFO = KS_VIDEOINFO(),
)

public data class KS_DATARANGE_VIDEO_VBI(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var StreamDescriptionFlags: UInt = 0u,
    public var MemoryAllocationFlags: UInt = 0u,
    public var ConfigCaps: KS_VIDEO_STREAM_CONFIG_CAPS = KS_VIDEO_STREAM_CONFIG_CAPS(),
    public var VBIInfoHeader: KS_VBIINFOHEADER = KS_VBIINFOHEADER(),
)

public data class KS_DVDCOPY_BUSKEY(public var BusKey: UByteArray = UByteArray(5), public var Reserved: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_DVDCOPY_BUSKEY) return false
        if (!this.BusKey.contentEquals(other.BusKey)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BusKey.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class KS_DVDCOPY_CHLGKEY(public var ChlgKey: UByteArray = UByteArray(10), public var Reserved: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_DVDCOPY_CHLGKEY) return false
        if (!this.ChlgKey.contentEquals(other.ChlgKey)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ChlgKey.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class KS_DVDCOPY_DISCKEY(public var DiscKey: UByteArray = UByteArray(2048)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_DVDCOPY_DISCKEY) return false
        if (!this.DiscKey.contentEquals(other.DiscKey)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DiscKey.contentHashCode()
    }
}

public data class KS_DVDCOPY_REGION(
    public var Reserved: UByte = 0u,
    public var RegionData: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_DVDCOPY_REGION) return false
        if (this.Reserved != other.Reserved) return false
        if (this.RegionData != other.RegionData) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.hashCode()
        result = 31 * result + this.RegionData.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class KS_DVDCOPY_SET_COPY_STATE(public var DVDCopyState: UInt = 0u)

public data class KS_DVDCOPY_TITLEKEY(
    public var KeyFlags: UInt = 0u,
    public var ReservedNT: UIntArray = UIntArray(2),
    public var TitleKey: UByteArray = UByteArray(6),
    public var Reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_DVDCOPY_TITLEKEY) return false
        if (this.KeyFlags != other.KeyFlags) return false
        if (!this.ReservedNT.contentEquals(other.ReservedNT)) return false
        if (!this.TitleKey.contentEquals(other.TitleKey)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeyFlags.hashCode()
        result = 31 * result + this.ReservedNT.contentHashCode()
        result = 31 * result + this.TitleKey.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class KS_DVD_YCrCb(
    public var Reserved: UByte = 0u,
    public var Y: UByte = 0u,
    public var Cr: UByte = 0u,
    public var Cb: UByte = 0u,
)

public data class KS_DVD_YUV(
    public var Reserved: UByte = 0u,
    public var Y: UByte = 0u,
    public var V: UByte = 0u,
    public var U: UByte = 0u,
)

public data class KS_FRAME_INFO(
    public var ExtendedHeaderSize: UInt = 0u,
    public var dwFrameFlags: UInt = 0u,
    public var PictureNumber: Long = 0L,
    public var DropCount: Long = 0L,
    public var hDirectDraw: HANDLE = 0L,
    public var hSurfaceHandle: HANDLE = 0L,
    public var DirectDrawRect: RECT = RECT(),
    public var Anonymous1: KS_FRAME_INFO_0 = KS_FRAME_INFO_0(),
    public var Reserved2: UInt = 0u,
    public var Anonymous2: KS_FRAME_INFO_1 = KS_FRAME_INFO_1(),
)

public data class KS_FRAME_INFO_0(public var lSurfacePitch: Int = 0, public var Reserved1: UInt = 0u)

public data class KS_FRAME_INFO_1(public var Anonymous: KS_FRAME_INFO_1_0 = KS_FRAME_INFO_1_0(), public var FrameCompletionNumber: ULong = 0uL)

public data class KS_FRAME_INFO_1_0(public var Reserved3: UInt = 0u, public var Reserved4: UInt = 0u)

public data class KS_FRAMING_ITEM(
    public var MemoryType: GUID = GUID(),
    public var BusType: GUID = GUID(),
    public var MemoryFlags: UInt = 0u,
    public var BusFlags: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Frames: UInt = 0u,
    public var Anonymous: KS_FRAMING_ITEM_0 = KS_FRAMING_ITEM_0(),
    public var MemoryTypeWeight: UInt = 0u,
    public var PhysicalRange: KS_FRAMING_RANGE = KS_FRAMING_RANGE(),
    public var FramingRange: KS_FRAMING_RANGE_WEIGHTED = KS_FRAMING_RANGE_WEIGHTED(),
)

public data class KS_FRAMING_ITEM_0(public var FileAlignment: UInt = 0u, public var FramePitch: Int = 0)

public data class KS_FRAMING_RANGE(
    public var MinFrameSize: UInt = 0u,
    public var MaxFrameSize: UInt = 0u,
    public var Stepping: UInt = 0u,
)

public data class KS_FRAMING_RANGE_WEIGHTED(
    public var Range: KS_FRAMING_RANGE = KS_FRAMING_RANGE(),
    public var InPlaceWeight: UInt = 0u,
    public var NotInPlaceWeight: UInt = 0u,
)

public class KS_H264VIDEOINFO(
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

public data class KS_MPEG1VIDEOINFO(
    public var hdr: KS_VIDEOINFOHEADER = KS_VIDEOINFOHEADER(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var bSequenceHeader: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_MPEG1VIDEOINFO) return false
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

public data class KS_MPEGAUDIOINFO(
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
)

public data class KS_MPEGVIDEOINFO2(
    public var hdr: KS_VIDEOINFOHEADER2 = KS_VIDEOINFOHEADER2(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var dwProfile: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bSequenceHeader: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_MPEGVIDEOINFO2) return false
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

public data class KS_RGBQUAD(
    public var rgbBlue: UByte = 0u,
    public var rgbGreen: UByte = 0u,
    public var rgbRed: UByte = 0u,
    public var rgbReserved: UByte = 0u,
)

public data class KS_TRUECOLORINFO(public var dwBitMasks: UIntArray = UIntArray(3), public var bmiColors: List<KS_RGBQUAD> = List(256) { KS_RGBQUAD() }) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_TRUECOLORINFO) return false
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

public data class KS_TVTUNER_CHANGE_INFO(
    public var dwFlags: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwAnalogVideoStandard: UInt = 0u,
    public var dwChannel: UInt = 0u,
)

public data class KS_VBIINFOHEADER(
    public var StartLine: UInt = 0u,
    public var EndLine: UInt = 0u,
    public var SamplingFrequency: UInt = 0u,
    public var MinLineStartTime: UInt = 0u,
    public var MaxLineStartTime: UInt = 0u,
    public var ActualLineStartTime: UInt = 0u,
    public var ActualLineEndTime: UInt = 0u,
    public var VideoStandard: UInt = 0u,
    public var SamplesPerLine: UInt = 0u,
    public var StrideInBytes: UInt = 0u,
    public var BufferSize: UInt = 0u,
)

public data class KS_VBI_FRAME_INFO(
    public var ExtendedHeaderSize: UInt = 0u,
    public var dwFrameFlags: UInt = 0u,
    public var PictureNumber: Long = 0L,
    public var DropCount: Long = 0L,
    public var dwSamplingFrequency: UInt = 0u,
    public var TvTunerChangeInfo: KS_TVTUNER_CHANGE_INFO = KS_TVTUNER_CHANGE_INFO(),
    public var VBIInfoHeader: KS_VBIINFOHEADER = KS_VBIINFOHEADER(),
)

public data class KS_VIDEOINFO(
    public var rcSource: RECT = RECT(),
    public var rcTarget: RECT = RECT(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var AvgTimePerFrame: Long = 0L,
    public var bmiHeader: KS_BITMAPINFOHEADER = KS_BITMAPINFOHEADER(),
    public var Anonymous: KS_VIDEOINFO_0 = KS_VIDEOINFO_0(),
)

public data class KS_VIDEOINFO_0(
    public var bmiColors: List<KS_RGBQUAD> = List(256) { KS_RGBQUAD() },
    public var dwBitMasks: UIntArray = UIntArray(3),
    public var TrueColorInfo: KS_TRUECOLORINFO = KS_TRUECOLORINFO(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KS_VIDEOINFO_0) return false
        if (this.bmiColors != other.bmiColors) return false
        if (!this.dwBitMasks.contentEquals(other.dwBitMasks)) return false
        if (this.TrueColorInfo != other.TrueColorInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bmiColors.hashCode()
        result = 31 * result + this.dwBitMasks.contentHashCode()
        result = 31 * result + this.TrueColorInfo.hashCode()
        return result
    }
}

public data class KS_VIDEOINFOHEADER(
    public var rcSource: RECT = RECT(),
    public var rcTarget: RECT = RECT(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var AvgTimePerFrame: Long = 0L,
    public var bmiHeader: KS_BITMAPINFOHEADER = KS_BITMAPINFOHEADER(),
)

public data class KS_VIDEOINFOHEADER2(
    public var rcSource: RECT = RECT(),
    public var rcTarget: RECT = RECT(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var AvgTimePerFrame: Long = 0L,
    public var dwInterlaceFlags: UInt = 0u,
    public var dwCopyProtectFlags: UInt = 0u,
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var Anonymous: KS_VIDEOINFOHEADER2_0 = KS_VIDEOINFOHEADER2_0(),
    public var dwReserved2: UInt = 0u,
    public var bmiHeader: KS_BITMAPINFOHEADER = KS_BITMAPINFOHEADER(),
)

public data class KS_VIDEOINFOHEADER2_0(public var dwControlFlags: UInt = 0u, public var dwReserved1: UInt = 0u)

public class KS_VIDEO_STREAM_CONFIG_CAPS(
    public var guid: GUID = GUID(),
    public var VideoStandard: UInt = 0u,
    public var InputSize: SIZE = SIZE(),
    public var MinCroppingSize: SIZE = SIZE(),
    public var MaxCroppingSize: SIZE = SIZE(),
    public var CropGranularityX: Int = 0,
    public var CropGranularityY: Int = 0,
    public var CropAlignX: Int = 0,
    public var CropAlignY: Int = 0,
    public var MinOutputSize: SIZE = SIZE(),
    public var MaxOutputSize: SIZE = SIZE(),
    public var OutputGranularityX: Int = 0,
    public var OutputGranularityY: Int = 0,
    public var StretchTapsX: Int = 0,
    public var StretchTapsY: Int = 0,
    public var ShrinkTapsX: Int = 0,
    public var ShrinkTapsY: Int = 0,
    public var MinFrameInterval: Long = 0L,
    public var MaxFrameInterval: Long = 0L,
    public var MinBitsPerSecond: Int = 0,
    public var MaxBitsPerSecond: Int = 0,
)

public data class LOOPEDSTREAMING_POSITION_EVENT_DATA(public var KsEventData: KSEVENTDATA = KSEVENTDATA(), public var Position: ULong = 0uL)

public data class MEDIUM_INFO(
    public var MediaPresent: BOOL = 0,
    public var MediaType: UInt = 0u,
    public var RecordInhibit: BOOL = 0,
)

public data class MF_MDL_SHARED_PAYLOAD_KEY(public var combined: MF_MDL_SHARED_PAYLOAD_KEY_0 = MF_MDL_SHARED_PAYLOAD_KEY_0(), public var GMDLHandle: GUID = GUID())

public data class MF_MDL_SHARED_PAYLOAD_KEY_0(
    public var pHandle: UInt = 0u,
    public var fHandle: UInt = 0u,
    public var uPayload: ULong = 0uL,
)

public data class NABTSFEC_BUFFER(
    public var dataSize: UInt = 0u,
    public var groupID: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var data: UByteArray = UByteArray(448),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NABTSFEC_BUFFER) return false
        if (this.dataSize != other.dataSize) return false
        if (this.groupID != other.groupID) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSize.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class NABTS_BUFFER(
    public var ScanlinesRequested: VBICODECFILTERING_SCANLINES = VBICODECFILTERING_SCANLINES(),
    public var PictureNumber: Long = 0L,
    public var NabtsLines: List<NABTS_BUFFER_LINE> = List(11) { NABTS_BUFFER_LINE() },
)

public data class NABTS_BUFFER_LINE(public var Confidence: UByte = 0u, public var Bytes: UByteArray = UByteArray(36)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NABTS_BUFFER_LINE) return false
        if (this.Confidence != other.Confidence) return false
        if (!this.Bytes.contentEquals(other.Bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Confidence.hashCode()
        result = 31 * result + this.Bytes.contentHashCode()
        return result
    }
}

public data class OPTIMAL_WEIGHT_TOTALS(
    public var MinTotalNominator: Long = 0L,
    public var MaxTotalNominator: Long = 0L,
    public var TotalDenominator: Long = 0L,
)

public data class PIPE_DIMENSIONS(
    public var AllocatorPin: KS_COMPRESSION = KS_COMPRESSION(),
    public var MaxExpansionPin: KS_COMPRESSION = KS_COMPRESSION(),
    public var EndPin: KS_COMPRESSION = KS_COMPRESSION(),
)

public data class PIPE_TERMINATION(
    public var Flags: UInt = 0u,
    public var OutsideFactors: UInt = 0u,
    public var Weigth: UInt = 0u,
    public var PhysicalRange: KS_FRAMING_RANGE = KS_FRAMING_RANGE(),
    public var OptimalRange: KS_FRAMING_RANGE_WEIGHTED = KS_FRAMING_RANGE_WEIGHTED(),
    public var Compression: KS_COMPRESSION = KS_COMPRESSION(),
)

public data class SECURE_BUFFER_INFO(
    public var guidBufferIdentifier: GUID = GUID(),
    public var cbBufferSize: UInt = 0u,
    public var cbCaptured: UInt = 0u,
    public var ullReserved: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECURE_BUFFER_INFO) return false
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

public data class SOUNDDETECTOR_PATTERNHEADER(public var Size: UInt = 0u, public var PatternType: GUID = GUID())

public data class TRANSPORTAUDIOPARMS(
    public var EnableOutput: Int = 0,
    public var EnableRecord: Int = 0,
    public var EnableSelsync: Int = 0,
    public var Input: Int = 0,
    public var MonitorSource: Int = 0,
)

public class TRANSPORTBASICPARMS(
    public var TimeFormat: Int = 0,
    public var TimeReference: Int = 0,
    public var Superimpose: Int = 0,
    public var EndStopAction: Int = 0,
    public var RecordFormat: Int = 0,
    public var StepFrames: Int = 0,
    public var SetpField: Int = 0,
    public var Preroll: Int = 0,
    public var RecPreroll: Int = 0,
    public var Postroll: Int = 0,
    public var EditDelay: Int = 0,
    public var PlayTCDelay: Int = 0,
    public var RecTCDelay: Int = 0,
    public var EditField: Int = 0,
    public var FrameServo: Int = 0,
    public var ColorFrameServo: Int = 0,
    public var ServoRef: Int = 0,
    public var WarnGenlock: Int = 0,
    public var SetTracking: Int = 0,
    public var VolumeName: ByteArray = ByteArray(40),
    public var Ballistic: IntArray = IntArray(20),
    public var Speed: Int = 0,
    public var CounterFormat: Int = 0,
    public var TunerChannel: Int = 0,
    public var TunerNumber: Int = 0,
    public var TimerEvent: Int = 0,
    public var TimerStartDay: Int = 0,
    public var TimerStartTime: Int = 0,
    public var TimerStopDay: Int = 0,
    public var TimerStopTime: Int = 0,
)

public data class TRANSPORTSTATUS(
    public var Mode: Int = 0,
    public var LastError: Int = 0,
    public var RecordInhibit: Int = 0,
    public var ServoLock: Int = 0,
    public var MediaPresent: Int = 0,
    public var MediaLength: Int = 0,
    public var MediaSize: Int = 0,
    public var MediaTrackCount: Int = 0,
    public var MediaTrackLength: Int = 0,
    public var MediaTrackSide: Int = 0,
    public var MediaType: Int = 0,
    public var LinkMode: Int = 0,
    public var NotifyOn: Int = 0,
)

public data class TRANSPORTVIDEOPARMS(public var OutputMode: Int = 0, public var Input: Int = 0)

public data class TRANSPORT_STATE(public var Mode: UInt = 0u, public var State: UInt = 0u)

public data class TUNER_ANALOG_CAPS_S(
    public var Mode: UInt = 0u,
    public var StandardsSupported: UInt = 0u,
    public var MinFrequency: UInt = 0u,
    public var MaxFrequency: UInt = 0u,
    public var TuningGranularity: UInt = 0u,
    public var SettlingTime: UInt = 0u,
    public var ScanSensingRange: UInt = 0u,
    public var FineTuneSensingRange: UInt = 0u,
)

public data class VBICAP_PROPERTIES_PROTECTION_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var Status: UInt = 0u,
)

public data class VBICODECFILTERING_CC_SUBSTREAMS(public var SubstreamMask: UInt = 0u)

public data class VBICODECFILTERING_NABTS_SUBSTREAMS(public var SubstreamMask: UIntArray = UIntArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBICODECFILTERING_NABTS_SUBSTREAMS) return false
        if (!this.SubstreamMask.contentEquals(other.SubstreamMask)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.SubstreamMask.contentHashCode()
    }
}

public data class VBICODECFILTERING_SCANLINES(public var DwordBitArray: UIntArray = UIntArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBICODECFILTERING_SCANLINES) return false
        if (!this.DwordBitArray.contentEquals(other.DwordBitArray)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DwordBitArray.contentHashCode()
    }
}

public data class VBICODECFILTERING_STATISTICS_CC(public var Common: VBICODECFILTERING_STATISTICS_COMMON = VBICODECFILTERING_STATISTICS_COMMON())

public data class VBICODECFILTERING_STATISTICS_CC_PIN(public var Common: VBICODECFILTERING_STATISTICS_COMMON_PIN = VBICODECFILTERING_STATISTICS_COMMON_PIN())

public data class VBICODECFILTERING_STATISTICS_COMMON(
    public var InputSRBsProcessed: UInt = 0u,
    public var OutputSRBsProcessed: UInt = 0u,
    public var SRBsIgnored: UInt = 0u,
    public var InputSRBsMissing: UInt = 0u,
    public var OutputSRBsMissing: UInt = 0u,
    public var OutputFailures: UInt = 0u,
    public var InternalErrors: UInt = 0u,
    public var ExternalErrors: UInt = 0u,
    public var InputDiscontinuities: UInt = 0u,
    public var DSPFailures: UInt = 0u,
    public var TvTunerChanges: UInt = 0u,
    public var VBIHeaderChanges: UInt = 0u,
    public var LineConfidenceAvg: UInt = 0u,
    public var BytesOutput: UInt = 0u,
)

public data class VBICODECFILTERING_STATISTICS_COMMON_PIN(
    public var SRBsProcessed: UInt = 0u,
    public var SRBsIgnored: UInt = 0u,
    public var SRBsMissing: UInt = 0u,
    public var InternalErrors: UInt = 0u,
    public var ExternalErrors: UInt = 0u,
    public var Discontinuities: UInt = 0u,
    public var LineConfidenceAvg: UInt = 0u,
    public var BytesOutput: UInt = 0u,
)

public data class VBICODECFILTERING_STATISTICS_NABTS(
    public var Common: VBICODECFILTERING_STATISTICS_COMMON = VBICODECFILTERING_STATISTICS_COMMON(),
    public var FECBundleBadLines: UInt = 0u,
    public var FECQueueOverflows: UInt = 0u,
    public var FECCorrectedLines: UInt = 0u,
    public var FECUncorrectableLines: UInt = 0u,
    public var BundlesProcessed: UInt = 0u,
    public var BundlesSent2IP: UInt = 0u,
    public var FilteredLines: UInt = 0u,
)

public data class VBICODECFILTERING_STATISTICS_NABTS_PIN(public var Common: VBICODECFILTERING_STATISTICS_COMMON_PIN = VBICODECFILTERING_STATISTICS_COMMON_PIN())

public data class VBICODECFILTERING_STATISTICS_TELETEXT(public var Common: VBICODECFILTERING_STATISTICS_COMMON = VBICODECFILTERING_STATISTICS_COMMON())

public data class VBICODECFILTERING_STATISTICS_TELETEXT_PIN(public var Common: VBICODECFILTERING_STATISTICS_COMMON_PIN = VBICODECFILTERING_STATISTICS_COMMON_PIN())

public data class VRAM_SURFACE_INFO(
    public var hSurface: ULong = 0uL,
    public var VramPhysicalAddress: Long = 0L,
    public var cbCaptured: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwLinearSize: UInt = 0u,
    public var lPitch: Int = 0,
    public var ullReserved: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VRAM_SURFACE_INFO) return false
        if (this.hSurface != other.hSurface) return false
        if (this.VramPhysicalAddress != other.VramPhysicalAddress) return false
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
        result = 31 * result + this.VramPhysicalAddress.hashCode()
        result = 31 * result + this.cbCaptured.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwLinearSize.hashCode()
        result = 31 * result + this.lPitch.hashCode()
        result = 31 * result + this.ullReserved.contentHashCode()
        return result
    }
}

public data class VRAM_SURFACE_INFO_PROPERTY_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var pVramSurfaceInfo: Long = 0L)

public data class WNF_KSCAMERA_STREAMSTATE_INFO(
    public var ProcessId: UInt = 0u,
    public var SessionId: UInt = 0u,
    public var StreamState: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class WST_BUFFER(public var ScanlinesRequested: VBICODECFILTERING_SCANLINES = VBICODECFILTERING_SCANLINES(), public var WstLines: List<WST_BUFFER_LINE> = List(17) { WST_BUFFER_LINE() })

public data class WST_BUFFER_LINE(public var Confidence: UByte = 0u, public var Bytes: UByteArray = UByteArray(42)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WST_BUFFER_LINE) return false
        if (this.Confidence != other.Confidence) return false
        if (!this.Bytes.contentEquals(other.Bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Confidence.hashCode()
        result = 31 * result + this.Bytes.contentHashCode()
        return result
    }
}
