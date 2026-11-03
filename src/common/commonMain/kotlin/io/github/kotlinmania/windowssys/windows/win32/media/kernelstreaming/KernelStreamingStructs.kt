@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.media.TIMECODE_SAMPLE

public class ALLOCATOR_PROPERTIES_EX(
    public var cBuffers: Int = 0,
    public var cbBuffer: Int = 0,
    public var cbAlign: Int = 0,
    public var cbPrefix: Int = 0,
    public var MemoryType: GUID = GUID(),
    public var BusType: GUID = GUID(),
    public var State: PIPE_STATE = 0,
    public var Input: PIPE_TERMINATION = PIPE_TERMINATION(),
    public var Output: PIPE_TERMINATION = PIPE_TERMINATION(),
    public var Strategy: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Weight: UInt = 0u,
    public var LogicalMemoryType: KS_LogicalMemoryType = 0,
    public var AllocatorPlace: PIPE_ALLOCATOR_PLACE = 0,
    public var Dimensions: PIPE_DIMENSIONS = PIPE_DIMENSIONS(),
    public var PhysicalRange: KS_FRAMING_RANGE = KS_FRAMING_RANGE(),
    public var PrevSegment: Long = 0L,
    public var CountNextSegments: UInt = 0u,
    public var NextSegments: Long = 0L,
    public var InsideFactors: UInt = 0u,
    public var NumberPins: UInt = 0u,
)

public data class AUDIORESOURCEMANAGEMENT_RESOURCEGROUP(public var ResourceGroupAcquired: BOOL = 0, public var ResourceGroupName: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUDIORESOURCEMANAGEMENT_RESOURCEGROUP) return false
        if (this.ResourceGroupAcquired != other.ResourceGroupAcquired) return false
        if (!this.ResourceGroupName.contentEquals(other.ResourceGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ResourceGroupAcquired.hashCode()
        result = 31 * result + this.ResourceGroupName.contentHashCode()
        return result
    }
}

public data class CC_BYTE_PAIR(public var Decoded: UByteArray = UByteArray(2), public var Reserved: UShort = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CC_BYTE_PAIR) return false
        if (!this.Decoded.contentEquals(other.Decoded)) return false
        if (this.Reserved != other.Reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Decoded.contentHashCode()
        result = 31 * result + this.Reserved.hashCode()
        return result
    }
}

public data class CC_HW_FIELD(
    public var ScanlinesRequested: VBICODECFILTERING_SCANLINES = VBICODECFILTERING_SCANLINES(),
    public var fieldFlags: UInt = 0u,
    public var PictureNumber: Long = 0L,
    public var Lines: List<CC_BYTE_PAIR> = List(12) { CC_BYTE_PAIR() },
)

public class DEVCAPS(
    public var CanRecord: Int = 0,
    public var CanRecordStrobe: Int = 0,
    public var HasAudio: Int = 0,
    public var HasVideo: Int = 0,
    public var UsesFiles: Int = 0,
    public var CanSave: Int = 0,
    public var DeviceType: Int = 0,
    public var TCRead: Int = 0,
    public var TCWrite: Int = 0,
    public var CTLRead: Int = 0,
    public var IndexRead: Int = 0,
    public var Preroll: Int = 0,
    public var Postroll: Int = 0,
    public var SyncAcc: Int = 0,
    public var NormRate: Int = 0,
    public var CanPreview: Int = 0,
    public var CanMonitorSrc: Int = 0,
    public var CanTest: Int = 0,
    public var VideoIn: Int = 0,
    public var AudioIn: Int = 0,
    public var Calibrate: Int = 0,
    public var SeekType: Int = 0,
    public var SimulatedHardware: Int = 0,
)

public data class DS3DVECTOR(
    public var Anonymous1: DS3DVECTOR_0 = DS3DVECTOR_0(),
    public var Anonymous2: DS3DVECTOR_1 = DS3DVECTOR_1(),
    public var Anonymous3: DS3DVECTOR_2 = DS3DVECTOR_2(),
)

public data class DS3DVECTOR_0(public var x: Float = 0.0f, public var dvX: Float = 0.0f)

public data class DS3DVECTOR_1(public var y: Float = 0.0f, public var dvY: Float = 0.0f)

public data class DS3DVECTOR_2(public var z: Float = 0.0f, public var dvZ: Float = 0.0f)

public data class INTERLEAVED_AUDIO_FORMAT_INFORMATION(
    public var Size: UInt = 0u,
    public var PrimaryChannelCount: UInt = 0u,
    public var PrimaryChannelStartPosition: UInt = 0u,
    public var PrimaryChannelMask: UInt = 0u,
    public var InterleavedChannelCount: UInt = 0u,
    public var InterleavedChannelStartPosition: UInt = 0u,
    public var InterleavedChannelMask: UInt = 0u,
)

public data class KSAC3_ALTERNATE_AUDIO(public var fStereo: BOOL = 0, public var DualMode: UInt = 0u)

public data class KSAC3_BIT_STREAM_MODE(public var BitStreamMode: Int = 0)

public data class KSAC3_DIALOGUE_LEVEL(public var DialogueLevel: UInt = 0u)

public data class KSAC3_DOWNMIX(public var fDownMix: BOOL = 0, public var fDolbySurround: BOOL = 0)

public data class KSAC3_ERROR_CONCEALMENT(public var fRepeatPreviousBlock: BOOL = 0, public var fErrorInCurrentBlock: BOOL = 0)

public data class KSAC3_ROOM_TYPE(public var fLargeRoom: BOOL = 0)

public data class KSALLOCATOR_FRAMING(
    public var Anonymous1: KSALLOCATOR_FRAMING_0 = KSALLOCATOR_FRAMING_0(),
    public var PoolType: UInt = 0u,
    public var Frames: UInt = 0u,
    public var FrameSize: UInt = 0u,
    public var Anonymous2: KSALLOCATOR_FRAMING_1 = KSALLOCATOR_FRAMING_1(),
    public var Reserved: UInt = 0u,
)

public data class KSALLOCATOR_FRAMING_0(public var OptionsFlags: UInt = 0u, public var RequirementsFlags: UInt = 0u)

public data class KSALLOCATOR_FRAMING_1(public var FileAlignment: UInt = 0u, public var FramePitch: Int = 0)

public data class KSALLOCATOR_FRAMING_EX(
    public var CountItems: UInt = 0u,
    public var PinFlags: UInt = 0u,
    public var OutputCompression: KS_COMPRESSION = KS_COMPRESSION(),
    public var PinWeight: UInt = 0u,
    public var FramingItem: List<KS_FRAMING_ITEM> = List(1) { KS_FRAMING_ITEM() },
)

public data class KSATTRIBUTE(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Attribute: GUID = GUID(),
)

public data class KSATTRIBUTE_AUDIOSIGNALPROCESSING_MODE(public var AttributeHeader: KSATTRIBUTE = KSATTRIBUTE(), public var SignalProcessingMode: GUID = GUID())

public data class KSAUDIOENGINE_BUFFER_SIZE_RANGE(public var MinBufferBytes: UInt = 0u, public var MaxBufferBytes: UInt = 0u)

public data class KSAUDIOENGINE_DESCRIPTOR(
    public var nHostPinId: UInt = 0u,
    public var nOffloadPinId: UInt = 0u,
    public var nLoopbackPinId: UInt = 0u,
)

public data class KSAUDIOENGINE_DEVICECONTROLS(
    public var Volume: EDeviceControlUseType = 0,
    public var Mute: EDeviceControlUseType = 0,
    public var PeakMeter: EDeviceControlUseType = 0,
)

public data class KSAUDIOENGINE_VOLUMELEVEL(
    public var TargetVolume: Int = 0,
    public var CurveType: AUDIO_CURVE_TYPE = 0,
    public var CurveDuration: ULong = 0uL,
)

public data class KSAUDIOMODULE_DESCRIPTOR(
    public var ClassId: GUID = GUID(),
    public var InstanceId: UInt = 0u,
    public var VersionMajor: UInt = 0u,
    public var VersionMinor: UInt = 0u,
    public var Name: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSAUDIOMODULE_DESCRIPTOR) return false
        if (this.ClassId != other.ClassId) return false
        if (this.InstanceId != other.InstanceId) return false
        if (this.VersionMajor != other.VersionMajor) return false
        if (this.VersionMinor != other.VersionMinor) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassId.hashCode()
        result = 31 * result + this.InstanceId.hashCode()
        result = 31 * result + this.VersionMajor.hashCode()
        result = 31 * result + this.VersionMinor.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class KSAUDIOMODULE_NOTIFICATION(public var Anonymous: KSAUDIOMODULE_NOTIFICATION_0 = KSAUDIOMODULE_NOTIFICATION_0())

public data class KSAUDIOMODULE_NOTIFICATION_0(public var ProviderId: KSAUDIOMODULE_NOTIFICATION_0_0 = KSAUDIOMODULE_NOTIFICATION_0_0(), public var Alignment: Long = 0L)

public data class KSAUDIOMODULE_NOTIFICATION_0_0(
    public var DeviceId: GUID = GUID(),
    public var ClassId: GUID = GUID(),
    public var InstanceId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSAUDIOMODULE_PROPERTY(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var ClassId: GUID = GUID(),
    public var InstanceId: UInt = 0u,
)

public data class KSAUDIO_CHANNEL_CONFIG(public var ActiveSpeakerPositions: Int = 0)

public data class KSAUDIO_COPY_PROTECTION(public var fCopyrighted: BOOL = 0, public var fOriginal: BOOL = 0)

public data class KSAUDIO_DYNAMIC_RANGE(public var QuietCompression: UInt = 0u, public var LoudCompression: UInt = 0u)

public data class KSAUDIO_MICROPHONE_COORDINATES(
    public var usType: UShort = 0u,
    public var wXCoord: Short = 0,
    public var wYCoord: Short = 0,
    public var wZCoord: Short = 0,
    public var wVerticalAngle: Short = 0,
    public var wHorizontalAngle: Short = 0,
)

public data class KSAUDIO_MIC_ARRAY_GEOMETRY(
    public var usVersion: UShort = 0u,
    public var usMicArrayType: UShort = 0u,
    public var wVerticalAngleBegin: Short = 0,
    public var wVerticalAngleEnd: Short = 0,
    public var wHorizontalAngleBegin: Short = 0,
    public var wHorizontalAngleEnd: Short = 0,
    public var usFrequencyBandLo: UShort = 0u,
    public var usFrequencyBandHi: UShort = 0u,
    public var usNumberOfMicrophones: UShort = 0u,
    public var KsMicCoord: List<KSAUDIO_MICROPHONE_COORDINATES> = List(1) { KSAUDIO_MICROPHONE_COORDINATES() },
)

public data class KSAUDIO_MIXCAP_TABLE(
    public var InputChannels: UInt = 0u,
    public var OutputChannels: UInt = 0u,
    public var Capabilities: List<KSAUDIO_MIX_CAPS> = List(1) { KSAUDIO_MIX_CAPS() },
)

public data class KSAUDIO_MIXLEVEL(public var Mute: BOOL = 0, public var Level: Int = 0)

public data class KSAUDIO_MIX_CAPS(
    public var Mute: BOOL = 0,
    public var Minimum: Int = 0,
    public var Maximum: Int = 0,
    public var Anonymous: KSAUDIO_MIX_CAPS_0 = KSAUDIO_MIX_CAPS_0(),
)

public data class KSAUDIO_MIX_CAPS_0(public var Reset: Int = 0, public var Resolution: Int = 0)

public data class KSAUDIO_PACKETSIZE_CONSTRAINTS(
    public var MinPacketPeriodInHns: UInt = 0u,
    public var PacketSizeFileAlignment: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var NumProcessingModeConstraints: UInt = 0u,
    public var ProcessingModeConstraints: List<KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT> = List(1) { KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT() },
)

public data class KSAUDIO_PACKETSIZE_CONSTRAINTS2(
    public var MinPacketPeriodInHns: UInt = 0u,
    public var PacketSizeFileAlignment: UInt = 0u,
    public var MaxPacketSizeInBytes: UInt = 0u,
    public var NumProcessingModeConstraints: UInt = 0u,
    public var ProcessingModeConstraints: List<KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT> = List(1) { KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT() },
)

public data class KSAUDIO_PACKETSIZE_PROCESSINGMODE_CONSTRAINT(
    public var ProcessingMode: GUID = GUID(),
    public var SamplesPerProcessingPacket: UInt = 0u,
    public var ProcessingPacketDurationInHns: UInt = 0u,
)

public data class KSAUDIO_POSITION(public var PlayOffset: ULong = 0uL, public var WriteOffset: ULong = 0uL)

public data class KSAUDIO_POSITIONEX(
    public var TimerFrequency: Long = 0L,
    public var TimeStamp1: Long = 0L,
    public var Position: KSAUDIO_POSITION = KSAUDIO_POSITION(),
    public var TimeStamp2: Long = 0L,
)

public data class KSAUDIO_PRESENTATION_POSITION(public var u64PositionInBlocks: ULong = 0uL, public var u64QPCPosition: ULong = 0uL)

public data class KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS(
    public var Resolution: Foundation.SIZE = Foundation.SIZE(),
    public var MaxFrameRate: KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS_0 = KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS_0(),
    public var MaskResolution: Foundation.SIZE = Foundation.SIZE(),
    public var SubType: GUID = GUID(),
)

public data class KSCAMERA_EXTENDEDPROP_BACKGROUNDSEGMENTATION_CONFIGCAPS_0(public var Numerator: Int = 0, public var Denominator: Int = 0)

public data class KSCAMERA_EXTENDEDPROP_CAMERAOFFSET(
    public var PitchAngle: Int = 0,
    public var YawAngle: Int = 0,
    public var Flag: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_CONFIGCAPS(
    public var ResolutionX: Int = 0,
    public var ResolutionY: Int = 0,
    public var PorchTop: Int = 0,
    public var PorchLeft: Int = 0,
    public var PorchBottom: Int = 0,
    public var PorchRight: Int = 0,
    public var NonUpscalingWindowSize: Int = 0,
    public var MinWindowSize: Int = 0,
    public var MaxWindowSize: Int = 0,
    public var Reserved: Int = 0,
)

public data class KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_CONFIGCAPSHEADER(public var Size: UInt = 0u, public var Count: UInt = 0u)

public data class KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_SETTING(
    public var OriginX: Int = 0,
    public var OriginY: Int = 0,
    public var WindowSize: Int = 0,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_EXTENDEDPROP_EVCOMPENSATION(
    public var Mode: UInt = 0u,
    public var Min: Int = 0,
    public var Max: Int = 0,
    public var Value: Int = 0,
    public var Reserved: ULong = 0uL,
)

public data class KSCAMERA_EXTENDEDPROP_FIELDOFVIEW(
    public var NormalizedFocalLengthX: UInt = 0u,
    public var NormalizedFocalLengthY: UInt = 0u,
    public var Flag: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_EXTENDEDPROP_HEADER(
    public var Version: UInt = 0u,
    public var PinId: UInt = 0u,
    public var Size: UInt = 0u,
    public var Result: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var Capability: ULong = 0uL,
)

public data class KSCAMERA_EXTENDEDPROP_METADATAINFO(public var BufferAlignment: Int = 0, public var MaxMetadataBufferSize: UInt = 0u)

public data class KSCAMERA_EXTENDEDPROP_PHOTOMODE(
    public var RequestedHistoryFrames: UInt = 0u,
    public var MaxHistoryFrames: UInt = 0u,
    public var SubMode: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_EXTENDEDPROP_PROFILE(
    public var ProfileId: GUID = GUID(),
    public var Index: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_EXTENDEDPROP_ROI_CONFIGCAPS(
    public var ControlId: UInt = 0u,
    public var MaxNumberOfROIs: UInt = 0u,
    public var Capability: ULong = 0uL,
)

public data class KSCAMERA_EXTENDEDPROP_ROI_CONFIGCAPSHEADER(
    public var Size: UInt = 0u,
    public var ConfigCapCount: UInt = 0u,
    public var Reserved: ULong = 0uL,
)

public data class KSCAMERA_EXTENDEDPROP_ROI_EXPOSURE(public var ROIInfo: KSCAMERA_EXTENDEDPROP_ROI_INFO = KSCAMERA_EXTENDEDPROP_ROI_INFO(), public var Reserved: ULong = 0uL)

public data class KSCAMERA_EXTENDEDPROP_ROI_FOCUS(public var ROIInfo: KSCAMERA_EXTENDEDPROP_ROI_INFO = KSCAMERA_EXTENDEDPROP_ROI_INFO(), public var Reserved: ULong = 0uL)

public data class KSCAMERA_EXTENDEDPROP_ROI_INFO(
    public var Region: Foundation.RECT = Foundation.RECT(),
    public var Flags: ULong = 0uL,
    public var Weight: Int = 0,
    public var RegionOfInterestType: Int = 0,
)

public data class KSCAMERA_EXTENDEDPROP_ROI_ISPCONTROL(
    public var ControlId: UInt = 0u,
    public var ROICount: UInt = 0u,
    public var Result: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_EXTENDEDPROP_ROI_ISPCONTROLHEADER(
    public var Size: UInt = 0u,
    public var ControlCount: UInt = 0u,
    public var Reserved: ULong = 0uL,
)

public data class KSCAMERA_EXTENDEDPROP_ROI_WHITEBALANCE(public var ROIInfo: KSCAMERA_EXTENDEDPROP_ROI_INFO = KSCAMERA_EXTENDEDPROP_ROI_INFO(), public var Reserved: ULong = 0uL)

public data class KSCAMERA_EXTENDEDPROP_VALUE(public var Value: KSCAMERA_EXTENDEDPROP_VALUE_0 = KSCAMERA_EXTENDEDPROP_VALUE_0())

public data class KSCAMERA_EXTENDEDPROP_VALUE_0(
    public var dbl: Double = 0.0,
    public var ull: ULong = 0uL,
    public var ul: UInt = 0u,
    public var ratio: ULong = 0uL,
    public var l: Int = 0,
    public var ll: Long = 0L,
)

public data class KSCAMERA_EXTENDEDPROP_VIDEOPROCSETTING(
    public var Mode: UInt = 0u,
    public var Min: Int = 0,
    public var Max: Int = 0,
    public var Step: Int = 0,
    public var VideoProc: KSCAMERA_EXTENDEDPROP_VALUE = KSCAMERA_EXTENDEDPROP_VALUE(),
    public var Reserved: ULong = 0uL,
)

public data class KSCAMERA_MAXVIDEOFPS_FORPHOTORES(
    public var PhotoResWidth: UInt = 0u,
    public var PhotoResHeight: UInt = 0u,
    public var PreviewFPSNum: UInt = 0u,
    public var PreviewFPSDenom: UInt = 0u,
    public var CaptureFPSNum: UInt = 0u,
    public var CaptureFPSDenom: UInt = 0u,
)

public data class KSCAMERA_METADATA_BACKGROUNDSEGMENTATIONMASK(
    public var Header: KSCAMERA_METADATA_ITEMHEADER = KSCAMERA_METADATA_ITEMHEADER(),
    public var MaskCoverageBoundingBox: Foundation.RECT = Foundation.RECT(),
    public var MaskResolution: Foundation.SIZE = Foundation.SIZE(),
    public var ForegroundBoundingBox: Foundation.RECT = Foundation.RECT(),
    public var MaskData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSCAMERA_METADATA_BACKGROUNDSEGMENTATIONMASK) return false
        if (this.Header != other.Header) return false
        if (this.MaskCoverageBoundingBox != other.MaskCoverageBoundingBox) return false
        if (this.MaskResolution != other.MaskResolution) return false
        if (this.ForegroundBoundingBox != other.ForegroundBoundingBox) return false
        if (!this.MaskData.contentEquals(other.MaskData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.MaskCoverageBoundingBox.hashCode()
        result = 31 * result + this.MaskResolution.hashCode()
        result = 31 * result + this.ForegroundBoundingBox.hashCode()
        result = 31 * result + this.MaskData.contentHashCode()
        return result
    }
}

public data class KSCAMERA_METADATA_CAPTURESTATS(
    public var Header: KSCAMERA_METADATA_ITEMHEADER = KSCAMERA_METADATA_ITEMHEADER(),
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var ExposureTime: ULong = 0uL,
    public var ExposureCompensationFlags: ULong = 0uL,
    public var ExposureCompensationValue: Int = 0,
    public var IsoSpeed: UInt = 0u,
    public var FocusState: UInt = 0u,
    public var LensPosition: UInt = 0u,
    public var WhiteBalance: UInt = 0u,
    public var Flash: UInt = 0u,
    public var FlashPower: UInt = 0u,
    public var ZoomFactor: UInt = 0u,
    public var SceneMode: ULong = 0uL,
    public var SensorFramerate: ULong = 0uL,
)

public data class KSCAMERA_METADATA_DIGITALWINDOW(public var Header: KSCAMERA_METADATA_ITEMHEADER = KSCAMERA_METADATA_ITEMHEADER(), public var Window: KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_SETTING = KSCAMERA_EXTENDEDPROP_DIGITALWINDOW_SETTING())

public data class KSCAMERA_METADATA_FRAMEILLUMINATION(
    public var Header: KSCAMERA_METADATA_ITEMHEADER = KSCAMERA_METADATA_ITEMHEADER(),
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_METADATA_ITEMHEADER(public var MetadataId: UInt = 0u, public var Size: UInt = 0u)

public data class KSCAMERA_METADATA_PHOTOCONFIRMATION(
    public var Header: KSCAMERA_METADATA_ITEMHEADER = KSCAMERA_METADATA_ITEMHEADER(),
    public var PhotoConfirmationIndex: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_PERFRAMESETTING_CAP_HEADER(
    public var Size: UInt = 0u,
    public var ItemCount: UInt = 0u,
    public var Flags: ULong = 0uL,
)

public data class KSCAMERA_PERFRAMESETTING_CAP_ITEM_HEADER(
    public var Size: UInt = 0u,
    public var Type: UInt = 0u,
    public var Flags: ULong = 0uL,
)

public data class KSCAMERA_PERFRAMESETTING_CUSTOM_ITEM(
    public var Size: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Id: GUID = GUID(),
)

public data class KSCAMERA_PERFRAMESETTING_FRAME_HEADER(
    public var Size: UInt = 0u,
    public var Id: UInt = 0u,
    public var ItemCount: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_PERFRAMESETTING_HEADER(
    public var Size: UInt = 0u,
    public var FrameCount: UInt = 0u,
    public var Id: GUID = GUID(),
    public var Flags: ULong = 0uL,
    public var LoopCount: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSCAMERA_PERFRAMESETTING_ITEM_HEADER(
    public var Size: UInt = 0u,
    public var Type: UInt = 0u,
    public var Flags: ULong = 0uL,
)

public data class KSCAMERA_PROFILE_CONCURRENCYINFO(
    public var ReferenceGuid: GUID = GUID(),
    public var Reserved: UInt = 0u,
    public var ProfileCount: UInt = 0u,
    public var Profiles: Long = 0L,
)

public data class KSCAMERA_PROFILE_INFO(
    public var ProfileId: GUID = GUID(),
    public var Index: UInt = 0u,
    public var PinCount: UInt = 0u,
    public var Pins: Long = 0L,
)

public data class KSCAMERA_PROFILE_MEDIAINFO(
    public var Resolution: KSCAMERA_PROFILE_MEDIAINFO_0 = KSCAMERA_PROFILE_MEDIAINFO_0(),
    public var MaxFrameRate: KSCAMERA_PROFILE_MEDIAINFO_1 = KSCAMERA_PROFILE_MEDIAINFO_1(),
    public var Flags: ULong = 0uL,
    public var Data0: UInt = 0u,
    public var Data1: UInt = 0u,
    public var Data2: UInt = 0u,
    public var Data3: UInt = 0u,
)

public data class KSCAMERA_PROFILE_MEDIAINFO_1(public var Numerator: UInt = 0u, public var Denominator: UInt = 0u)

public data class KSCAMERA_PROFILE_MEDIAINFO_0(public var X: UInt = 0u, public var Y: UInt = 0u)

public data class KSCAMERA_PROFILE_PININFO(
    public var PinCategory: GUID = GUID(),
    public var Anonymous: KSCAMERA_PROFILE_PININFO_0 = KSCAMERA_PROFILE_PININFO_0(),
    public var MediaInfoCount: UInt = 0u,
    public var MediaInfos: Long = 0L,
)

public data class KSCAMERA_PROFILE_PININFO_0(public var Anonymous: KSCAMERA_PROFILE_PININFO_0_0 = KSCAMERA_PROFILE_PININFO_0_0(), public var Reserved: UInt = 0u)

public data class KSCAMERA_PROFILE_PININFO_0_0(public var PinIndex: UShort = 0u, public var ProfileSensorType: UShort = 0u)

public data class KSCLOCK_CREATE(public var CreateFlags: UInt = 0u)

public data class KSCOMPONENTID(
    public var Manufacturer: GUID = GUID(),
    public var Product: GUID = GUID(),
    public var Component: GUID = GUID(),
    public var Name: GUID = GUID(),
    public var Version: UInt = 0u,
    public var Revision: UInt = 0u,
)

public data class KSCORRELATED_TIME(public var Time: Long = 0L, public var SystemTime: Long = 0L)

public data class KSDATAFORMAT(public var Anonymous: KSDATAFORMAT_0 = KSDATAFORMAT_0(), public var Alignment: Long = 0L)

public data class KSDATAFORMAT_0(
    public var FormatSize: UInt = 0u,
    public var Flags: UInt = 0u,
    public var SampleSize: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var MajorFormat: GUID = GUID(),
    public var SubFormat: GUID = GUID(),
    public var Specifier: GUID = GUID(),
)

public data class KSDATARANGE_AUDIO(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var MaximumChannels: UInt = 0u,
    public var MinimumBitsPerSample: UInt = 0u,
    public var MaximumBitsPerSample: UInt = 0u,
    public var MinimumSampleFrequency: UInt = 0u,
    public var MaximumSampleFrequency: UInt = 0u,
)

public data class KSDATARANGE_MUSIC(
    public var DataRange: KSDATAFORMAT = KSDATAFORMAT(),
    public var Technology: GUID = GUID(),
    public var Channels: UInt = 0u,
    public var Notes: UInt = 0u,
    public var ChannelMask: UInt = 0u,
)

public data class KSDEVICE_PROFILE_INFO(
    public var Type: UInt = 0u,
    public var Size: UInt = 0u,
    public var Anonymous: KSDEVICE_PROFILE_INFO_0 = KSDEVICE_PROFILE_INFO_0(),
)

public data class KSDEVICE_PROFILE_INFO_0(public var Camera: KSDEVICE_PROFILE_INFO_0_0 = KSDEVICE_PROFILE_INFO_0_0())

public data class KSDEVICE_PROFILE_INFO_0_0(
    public var Info: KSCAMERA_PROFILE_INFO = KSCAMERA_PROFILE_INFO(),
    public var Reserved: UInt = 0u,
    public var ConcurrencyCount: UInt = 0u,
    public var Concurrency: Long = 0L,
)

public data class KSDISPLAYCHANGE(
    public var PelsWidth: UInt = 0u,
    public var PelsHeight: UInt = 0u,
    public var BitsPerPel: UInt = 0u,
    public var DeviceID: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSDISPLAYCHANGE) return false
        if (this.PelsWidth != other.PelsWidth) return false
        if (this.PelsHeight != other.PelsHeight) return false
        if (this.BitsPerPel != other.BitsPerPel) return false
        if (!this.DeviceID.contentEquals(other.DeviceID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PelsWidth.hashCode()
        result = 31 * result + this.PelsHeight.hashCode()
        result = 31 * result + this.BitsPerPel.hashCode()
        result = 31 * result + this.DeviceID.contentHashCode()
        return result
    }
}

public data class KSDS3D_BUFFER_ALL(
    public var Position: DS3DVECTOR = DS3DVECTOR(),
    public var Velocity: DS3DVECTOR = DS3DVECTOR(),
    public var InsideConeAngle: UInt = 0u,
    public var OutsideConeAngle: UInt = 0u,
    public var ConeOrientation: DS3DVECTOR = DS3DVECTOR(),
    public var ConeOutsideVolume: Int = 0,
    public var MinDistance: Float = 0.0f,
    public var MaxDistance: Float = 0.0f,
    public var Mode: UInt = 0u,
)

public data class KSDS3D_BUFFER_CONE_ANGLES(public var InsideConeAngle: UInt = 0u, public var OutsideConeAngle: UInt = 0u)

public data class KSDS3D_HRTF_FILTER_FORMAT_MSG(
    public var FilterMethod: KSDS3D_HRTF_FILTER_METHOD = 0,
    public var CoeffFormat: KSDS3D_HRTF_COEFF_FORMAT = 0,
    public var Version: KSDS3D_HRTF_FILTER_VERSION = 0,
    public var Reserved: UInt = 0u,
)

public data class KSDS3D_HRTF_INIT_MSG(
    public var Size: UInt = 0u,
    public var Quality: KSDS3D_HRTF_FILTER_QUALITY = 0,
    public var SampleRate: Float = 0.0f,
    public var MaxFilterSize: UInt = 0u,
    public var FilterTransientMuteLength: UInt = 0u,
    public var FilterOverlapBufferLength: UInt = 0u,
    public var OutputOverlapBufferLength: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSDS3D_HRTF_PARAMS_MSG(
    public var Size: UInt = 0u,
    public var Enabled: UInt = 0u,
    public var SwapChannels: BOOL = 0,
    public var ZeroAzimuth: BOOL = 0,
    public var CrossFadeOutput: BOOL = 0,
    public var FilterSize: UInt = 0u,
)

public data class KSDS3D_ITD_PARAMS(
    public var Channel: Int = 0,
    public var VolSmoothScale: Float = 0.0f,
    public var TotalDryAttenuation: Float = 0.0f,
    public var TotalWetAttenuation: Float = 0.0f,
    public var SmoothFrequency: Int = 0,
    public var Delay: Int = 0,
)

public data class KSDS3D_ITD_PARAMS_MSG(
    public var Enabled: UInt = 0u,
    public var LeftParams: KSDS3D_ITD_PARAMS = KSDS3D_ITD_PARAMS(),
    public var RightParams: KSDS3D_ITD_PARAMS = KSDS3D_ITD_PARAMS(),
    public var Reserved: UInt = 0u,
)

public data class KSDS3D_LISTENER_ALL(
    public var Position: DS3DVECTOR = DS3DVECTOR(),
    public var Velocity: DS3DVECTOR = DS3DVECTOR(),
    public var OrientFront: DS3DVECTOR = DS3DVECTOR(),
    public var OrientTop: DS3DVECTOR = DS3DVECTOR(),
    public var DistanceFactor: Float = 0.0f,
    public var RolloffFactor: Float = 0.0f,
    public var DopplerFactor: Float = 0.0f,
)

public data class KSDS3D_LISTENER_ORIENTATION(public var Front: DS3DVECTOR = DS3DVECTOR(), public var Top: DS3DVECTOR = DS3DVECTOR())

public data class KSERROR(public var Context: Long = 0L, public var Status: UInt = 0u)

public data class KSEVENTDATA(public var NotificationType: UInt = 0u, public var Anonymous: KSEVENTDATA_0 = KSEVENTDATA_0())

public data class KSEVENTDATA_0(
    public var EventHandle: KSEVENTDATA_0_0 = KSEVENTDATA_0_0(),
    public var SemaphoreHandle: KSEVENTDATA_0_1 = KSEVENTDATA_0_1(),
    public var Alignment: KSEVENTDATA_0_2 = KSEVENTDATA_0_2(),
)

public data class KSEVENTDATA_0_2(public var Unused: Long = 0L, public var Alignment: LongArray = LongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSEVENTDATA_0_2) return false
        if (this.Unused != other.Unused) return false
        if (!this.Alignment.contentEquals(other.Alignment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Unused.hashCode()
        result = 31 * result + this.Alignment.contentHashCode()
        return result
    }
}

public data class KSEVENTDATA_0_0(public var Event: Foundation.HANDLE = Foundation.HANDLE(), public var Reserved: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSEVENTDATA_0_0) return false
        if (this.Event != other.Event) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Event.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class KSEVENTDATA_0_1(
    public var Semaphore: Foundation.HANDLE = Foundation.HANDLE(),
    public var Reserved: UInt = 0u,
    public var Adjustment: Int = 0,
)

public data class KSEVENT_TIME_INTERVAL(
    public var EventData: KSEVENTDATA = KSEVENTDATA(),
    public var TimeBase: Long = 0L,
    public var Interval: Long = 0L,
)

public data class KSEVENT_TIME_MARK(public var EventData: KSEVENTDATA = KSEVENTDATA(), public var MarkTime: Long = 0L)

public data class KSEVENT_TUNER_INITIATE_SCAN_S(
    public var EventData: KSEVENTDATA = KSEVENTDATA(),
    public var StartFrequency: UInt = 0u,
    public var EndFrequency: UInt = 0u,
)

public data class KSE_NODE(
    public var Event: KSIDENTIFIER = KSIDENTIFIER(),
    public var NodeId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSE_PIN(
    public var Event: KSIDENTIFIER = KSIDENTIFIER(),
    public var PinId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSFRAMETIME(
    public var Duration: Long = 0L,
    public var FrameFlags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSGOP_USERDATA(
    public var sc: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var cFields: UByte = 0u,
    public var l21Data: ByteArray = ByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSGOP_USERDATA) return false
        if (this.sc != other.sc) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.cFields != other.cFields) return false
        if (!this.l21Data.contentEquals(other.l21Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sc.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.cFields.hashCode()
        result = 31 * result + this.l21Data.contentHashCode()
        return result
    }
}

public data class KSIDENTIFIER(public var Anonymous: KSIDENTIFIER_0 = KSIDENTIFIER_0())

public data class KSIDENTIFIER_0(public var Anonymous: KSIDENTIFIER_0_0 = KSIDENTIFIER_0_0(), public var Alignment: Long = 0L)

public data class KSIDENTIFIER_0_0(
    public var Set: GUID = GUID(),
    public var Id: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class KSINTERVAL(public var TimeBase: Long = 0L, public var Interval: Long = 0L)

public data class KSJACK_DESCRIPTION(
    public var ChannelMapping: UInt = 0u,
    public var Color: UInt = 0u,
    public var ConnectionType: EPcxConnectionType = 0,
    public var GeoLocation: EPcxGeoLocation = 0,
    public var GenLocation: EPcxGenLocation = 0,
    public var PortConnection: EPxcPortConnection = 0,
    public var IsConnected: BOOL = 0,
)

public data class KSJACK_DESCRIPTION2(public var DeviceStateInfo: UInt = 0u, public var JackCapabilities: UInt = 0u)

public data class KSJACK_DESCRIPTION3(public var ConfigId: UInt = 0u)

public data class KSJACK_SINK_INFORMATION(
    public var ConnType: KSJACK_SINK_CONNECTIONTYPE = 0,
    public var ManufacturerId: UShort = 0u,
    public var ProductId: UShort = 0u,
    public var AudioLatency: UShort = 0u,
    public var HDCPCapable: BOOL = 0,
    public var AICapable: BOOL = 0,
    public var SinkDescriptionLength: UByte = 0u,
    public var SinkDescription: UShortArray = UShortArray(32),
    public var PortId: Foundation.LUID = Foundation.LUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSJACK_SINK_INFORMATION) return false
        if (this.ConnType != other.ConnType) return false
        if (this.ManufacturerId != other.ManufacturerId) return false
        if (this.ProductId != other.ProductId) return false
        if (this.AudioLatency != other.AudioLatency) return false
        if (this.HDCPCapable != other.HDCPCapable) return false
        if (this.AICapable != other.AICapable) return false
        if (this.SinkDescriptionLength != other.SinkDescriptionLength) return false
        if (!this.SinkDescription.contentEquals(other.SinkDescription)) return false
        if (this.PortId != other.PortId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnType.hashCode()
        result = 31 * result + this.ManufacturerId.hashCode()
        result = 31 * result + this.ProductId.hashCode()
        result = 31 * result + this.AudioLatency.hashCode()
        result = 31 * result + this.HDCPCapable.hashCode()
        result = 31 * result + this.AICapable.hashCode()
        result = 31 * result + this.SinkDescriptionLength.hashCode()
        result = 31 * result + this.SinkDescription.contentHashCode()
        result = 31 * result + this.PortId.hashCode()
        return result
    }
}

public data class KSMPEGVID_RECT(
    public var StartX: UInt = 0u,
    public var StartY: UInt = 0u,
    public var EndX: UInt = 0u,
    public var EndY: UInt = 0u,
)

public data class KSMULTIPLE_DATA_PROP(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var MultipleItem: KSMULTIPLE_ITEM = KSMULTIPLE_ITEM())

public data class KSMULTIPLE_ITEM(public var Size: UInt = 0u, public var Count: UInt = 0u)

public data class KSMUSICFORMAT(public var TimeDeltaMs: UInt = 0u, public var ByteCount: UInt = 0u)

public data class KSM_NODE(
    public var Method: KSIDENTIFIER = KSIDENTIFIER(),
    public var NodeId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSNODEPROPERTY(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var NodeId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSNODEPROPERTY_AUDIO_3D_LISTENER(public var NodeProperty: KSNODEPROPERTY = KSNODEPROPERTY(), public var ListenerId: Long = 0L)

public data class KSNODEPROPERTY_AUDIO_CHANNEL(
    public var NodeProperty: KSNODEPROPERTY = KSNODEPROPERTY(),
    public var Channel: Int = 0,
    public var Reserved: UInt = 0u,
)

public data class KSNODEPROPERTY_AUDIO_DEV_SPECIFIC(
    public var NodeProperty: KSNODEPROPERTY = KSNODEPROPERTY(),
    public var DevSpecificId: UInt = 0u,
    public var DeviceInfo: UInt = 0u,
    public var Length: UInt = 0u,
)

public data class KSNODEPROPERTY_AUDIO_PROPERTY(
    public var NodeProperty: KSNODEPROPERTY = KSNODEPROPERTY(),
    public var AppContext: Long = 0L,
    public var Length: UInt = 0u,
)

public data class KSNODE_CREATE(public var CreateFlags: UInt = 0u, public var Node: UInt = 0u)

public data class KSPIN_CINSTANCES(public var PossibleCount: UInt = 0u, public var CurrentCount: UInt = 0u)

public data class KSPIN_CONNECT(
    public var Interface: KSIDENTIFIER = KSIDENTIFIER(),
    public var Medium: KSIDENTIFIER = KSIDENTIFIER(),
    public var PinId: UInt = 0u,
    public var PinToHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var Priority: KSPRIORITY = KSPRIORITY(),
)

public data class KSPIN_MDL_CACHING_NOTIFICATION(public var Event: KSPIN_MDL_CACHING_EVENT = 0, public var Buffer: Long = 0L)

public data class KSPIN_MDL_CACHING_NOTIFICATION32(public var Event: KSPIN_MDL_CACHING_EVENT = 0, public var Buffer: UInt = 0u)

public data class KSPIN_PHYSICALCONNECTION(
    public var Size: UInt = 0u,
    public var Pin: UInt = 0u,
    public var SymbolicLinkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSPIN_PHYSICALCONNECTION) return false
        if (this.Size != other.Size) return false
        if (this.Pin != other.Pin) return false
        if (!this.SymbolicLinkName.contentEquals(other.SymbolicLinkName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Pin.hashCode()
        result = 31 * result + this.SymbolicLinkName.contentHashCode()
        return result
    }
}

public data class KSPRIORITY(public var PriorityClass: UInt = 0u, public var PrioritySubClass: UInt = 0u)

public data class KSPROPERTY_ALLOCATOR_CONTROL_CAPTURE_CAPS_S(public var InterleavedCapSupported: UInt = 0u)

public data class KSPROPERTY_ALLOCATOR_CONTROL_CAPTURE_INTERLEAVE_S(public var InterleavedCapPossible: UInt = 0u)

public data class KSPROPERTY_ALLOCATOR_CONTROL_SURFACE_SIZE_S(public var CX: UInt = 0u, public var CY: UInt = 0u)

public data class KSPROPERTY_BOUNDS_LONG(public var Anonymous1: KSPROPERTY_BOUNDS_LONG_0 = KSPROPERTY_BOUNDS_LONG_0(), public var Anonymous2: KSPROPERTY_BOUNDS_LONG_1 = KSPROPERTY_BOUNDS_LONG_1())

public data class KSPROPERTY_BOUNDS_LONG_0(public var SignedMinimum: Int = 0, public var SignedMaximum: Int = 0)

public data class KSPROPERTY_BOUNDS_LONG_1(public var UnsignedMinimum: UInt = 0u, public var UnsignedMaximum: UInt = 0u)

public data class KSPROPERTY_BOUNDS_LONGLONG(public var Anonymous1: KSPROPERTY_BOUNDS_LONGLONG_0 = KSPROPERTY_BOUNDS_LONGLONG_0(), public var Anonymous2: KSPROPERTY_BOUNDS_LONGLONG_1 = KSPROPERTY_BOUNDS_LONGLONG_1())

public data class KSPROPERTY_BOUNDS_LONGLONG_0(public var SignedMinimum: Long = 0L, public var SignedMaximum: Long = 0L)

public data class KSPROPERTY_BOUNDS_LONGLONG_1(public var UnsignedMinimum: ULong = 0uL, public var UnsignedMaximum: ULong = 0uL)

public data class KSPROPERTY_CAMERACONTROL_FLASH_S(public var Flash: UInt = 0u, public var Capabilities: UInt = 0u)

public data class KSPROPERTY_CAMERACONTROL_FOCAL_LENGTH_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var lOcularFocalLength: Int = 0,
    public var lObjectiveFocalLengthMin: Int = 0,
    public var lObjectiveFocalLengthMax: Int = 0,
)

public data class KSPROPERTY_CAMERACONTROL_IMAGE_PIN_CAPABILITY_S(public var Capabilities: UInt = 0u, public var Reserved0: UInt = 0u)

public data class KSPROPERTY_CAMERACONTROL_NODE_FOCAL_LENGTH_S(
    public var NodeProperty: KSNODEPROPERTY = KSNODEPROPERTY(),
    public var lOcularFocalLength: Int = 0,
    public var lObjectiveFocalLengthMin: Int = 0,
    public var lObjectiveFocalLengthMax: Int = 0,
)

public data class KSPROPERTY_CAMERACONTROL_NODE_S(
    public var NodeProperty: KSP_NODE = KSP_NODE(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_CAMERACONTROL_NODE_S2(
    public var NodeProperty: KSP_NODE = KSP_NODE(),
    public var Value1: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var Value2: Int = 0,
)

public data class KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S(
    public var FocusRect: Foundation.RECT = Foundation.RECT(),
    public var AutoFocusLock: BOOL = 0,
    public var AutoExposureLock: BOOL = 0,
    public var AutoWhitebalanceLock: BOOL = 0,
    public var Anonymous: KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S_0 = KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S_0(),
)

public data class KSPROPERTY_CAMERACONTROL_REGION_OF_INTEREST_S_0(public var Capabilities: UInt = 0u, public var Configuration: UInt = 0u)

public data class KSPROPERTY_CAMERACONTROL_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_CAMERACONTROL_S2(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value1: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var Value2: Int = 0,
)

public data class KSPROPERTY_CAMERACONTROL_S_EX(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var FocusRect: Foundation.RECT = Foundation.RECT(),
)

public data class KSPROPERTY_CAMERACONTROL_VIDEOSTABILIZATION_MODE_S(public var VideoStabilizationMode: UInt = 0u, public var Capabilities: UInt = 0u)

public data class KSPROPERTY_CROSSBAR_ACTIVE_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var IndexInputPin: UInt = 0u,
    public var Active: UInt = 0u,
)

public data class KSPROPERTY_CROSSBAR_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var NumberOfInputs: UInt = 0u,
    public var NumberOfOutputs: UInt = 0u,
)

public data class KSPROPERTY_CROSSBAR_PININFO_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Direction: KSPIN_DATAFLOW = 0,
    public var Index: UInt = 0u,
    public var PinType: UInt = 0u,
    public var RelatedPinIndex: UInt = 0u,
    public var Medium: KSIDENTIFIER = KSIDENTIFIER(),
)

public data class KSPROPERTY_CROSSBAR_ROUTE_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var IndexInputPin: UInt = 0u,
    public var IndexOutputPin: UInt = 0u,
    public var CanRoute: UInt = 0u,
)

public data class KSPROPERTY_DESCRIPTION(
    public var AccessFlags: UInt = 0u,
    public var DescriptionSize: UInt = 0u,
    public var PropTypeSet: KSIDENTIFIER = KSIDENTIFIER(),
    public var MembersListCount: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSPROPERTY_DROPPEDFRAMES_CURRENT_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var PictureNumber: Long = 0L,
    public var DropCount: Long = 0L,
    public var AverageFrameSize: UInt = 0u,
)

public data class KSPROPERTY_EXTDEVICE_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var u: KSPROPERTY_EXTDEVICE_S_0 = KSPROPERTY_EXTDEVICE_S_0())

public data class KSPROPERTY_EXTDEVICE_S_0(
    public var Capabilities: DEVCAPS = DEVCAPS(),
    public var DevPort: UInt = 0u,
    public var PowerState: UInt = 0u,
    public var pawchString: UShortArray = UShortArray(260),
    public var NodeUniqueID: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSPROPERTY_EXTDEVICE_S_0) return false
        if (this.Capabilities != other.Capabilities) return false
        if (this.DevPort != other.DevPort) return false
        if (this.PowerState != other.PowerState) return false
        if (!this.pawchString.contentEquals(other.pawchString)) return false
        if (!this.NodeUniqueID.contentEquals(other.NodeUniqueID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Capabilities.hashCode()
        result = 31 * result + this.DevPort.hashCode()
        result = 31 * result + this.PowerState.hashCode()
        result = 31 * result + this.pawchString.contentHashCode()
        result = 31 * result + this.NodeUniqueID.contentHashCode()
        return result
    }
}

public data class KSPROPERTY_EXTXPORT_NODE_S(public var NodeProperty: KSP_NODE = KSP_NODE(), public var u: KSPROPERTY_EXTXPORT_NODE_S_0 = KSPROPERTY_EXTXPORT_NODE_S_0())

public data class KSPROPERTY_EXTXPORT_NODE_S_0(
    public var Capabilities: UInt = 0u,
    public var SignalMode: UInt = 0u,
    public var LoadMedium: UInt = 0u,
    public var MediumInfo: MEDIUM_INFO = MEDIUM_INFO(),
    public var XPrtState: TRANSPORT_STATE = TRANSPORT_STATE(),
    public var Timecode: KSPROPERTY_EXTXPORT_NODE_S_0_0 = KSPROPERTY_EXTXPORT_NODE_S_0_0(),
    public var dwTimecode: UInt = 0u,
    public var dwAbsTrackNumber: UInt = 0u,
    public var RawAVC: KSPROPERTY_EXTXPORT_NODE_S_0_1 = KSPROPERTY_EXTXPORT_NODE_S_0_1(),
)

public data class KSPROPERTY_EXTXPORT_NODE_S_0_1(public var PayloadSize: UInt = 0u, public var Payload: UByteArray = UByteArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSPROPERTY_EXTXPORT_NODE_S_0_1) return false
        if (this.PayloadSize != other.PayloadSize) return false
        if (!this.Payload.contentEquals(other.Payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PayloadSize.hashCode()
        result = 31 * result + this.Payload.contentHashCode()
        return result
    }
}

public data class KSPROPERTY_EXTXPORT_NODE_S_0_0(
    public var frame: UByte = 0u,
    public var second: UByte = 0u,
    public var minute: UByte = 0u,
    public var hour: UByte = 0u,
)

public data class KSPROPERTY_EXTXPORT_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var u: KSPROPERTY_EXTXPORT_S_0 = KSPROPERTY_EXTXPORT_S_0())

public data class KSPROPERTY_EXTXPORT_S_0(
    public var Capabilities: UInt = 0u,
    public var SignalMode: UInt = 0u,
    public var LoadMedium: UInt = 0u,
    public var MediumInfo: MEDIUM_INFO = MEDIUM_INFO(),
    public var XPrtState: TRANSPORT_STATE = TRANSPORT_STATE(),
    public var Timecode: KSPROPERTY_EXTXPORT_S_0_0 = KSPROPERTY_EXTXPORT_S_0_0(),
    public var dwTimecode: UInt = 0u,
    public var dwAbsTrackNumber: UInt = 0u,
    public var RawAVC: KSPROPERTY_EXTXPORT_S_0_1 = KSPROPERTY_EXTXPORT_S_0_1(),
)

public data class KSPROPERTY_EXTXPORT_S_0_1(public var PayloadSize: UInt = 0u, public var Payload: UByteArray = UByteArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSPROPERTY_EXTXPORT_S_0_1) return false
        if (this.PayloadSize != other.PayloadSize) return false
        if (!this.Payload.contentEquals(other.Payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PayloadSize.hashCode()
        result = 31 * result + this.Payload.contentHashCode()
        return result
    }
}

public data class KSPROPERTY_EXTXPORT_S_0_0(
    public var frame: UByte = 0u,
    public var second: UByte = 0u,
    public var minute: UByte = 0u,
    public var hour: UByte = 0u,
)

public data class KSPROPERTY_MEDIAAVAILABLE(public var Earliest: Long = 0L, public var Latest: Long = 0L)

public data class KSPROPERTY_MEMBERSHEADER(
    public var MembersFlags: UInt = 0u,
    public var MembersSize: UInt = 0u,
    public var MembersCount: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class KSPROPERTY_NETWORKCAMERACONTROL_EVENT_INFO(public var Header: KSCAMERA_METADATA_ITEMHEADER = KSCAMERA_METADATA_ITEMHEADER(), public var EventFilter: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KSPROPERTY_NETWORKCAMERACONTROL_EVENT_INFO) return false
        if (this.Header != other.Header) return false
        if (!this.EventFilter.contentEquals(other.EventFilter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.EventFilter.contentHashCode()
        return result
    }
}

public data class KSPROPERTY_NETWORKCAMERACONTROL_METADATA_INFO(
    public var MetadataItems: UInt = 0u,
    public var Size: UInt = 0u,
    public var PTZStatus: BOOL = 0,
    public var Events: BOOL = 0,
    public var Analytics: BOOL = 0,
    public var Reserved: BOOL = 0,
)

public data class KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_HEADER(public var Size: UInt = 0u, public var Type: KSPROPERTY_NETWORKCAMERACONTROL_NTPINFO_TYPE = 0)

public data class KSPROPERTY_POSITIONS(
    public var Current: Long = 0L,
    public var Stop: Long = 0L,
    public var CurrentFlags: KS_SEEKING_FLAGS = 0,
    public var StopFlags: KS_SEEKING_FLAGS = 0,
)

public data class KSPROPERTY_SELECTOR_NODE_S(
    public var NodeProperty: KSP_NODE = KSP_NODE(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_SELECTOR_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_SERIAL(
    public var PropTypeSet: KSIDENTIFIER = KSIDENTIFIER(),
    public var Id: UInt = 0u,
    public var PropertyLength: UInt = 0u,
)

public data class KSPROPERTY_SERIALHDR(public var PropertySet: GUID = GUID(), public var Count: UInt = 0u)

public data class KSPROPERTY_SPHLI(
    public var HLISS: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var StartPTM: UInt = 0u,
    public var EndPTM: UInt = 0u,
    public var StartX: UShort = 0u,
    public var StartY: UShort = 0u,
    public var StopX: UShort = 0u,
    public var StopY: UShort = 0u,
    public var ColCon: KS_COLCON = KS_COLCON(),
)

public data class KSPROPERTY_SPPAL(public var sppal: List<KS_DVD_YUV> = List(16) { KS_DVD_YUV() })

public data class KSPROPERTY_STEPPING_LONG(
    public var SteppingDelta: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Bounds: KSPROPERTY_BOUNDS_LONG = KSPROPERTY_BOUNDS_LONG(),
)

public data class KSPROPERTY_STEPPING_LONGLONG(public var SteppingDelta: ULong = 0uL, public var Bounds: KSPROPERTY_BOUNDS_LONGLONG = KSPROPERTY_BOUNDS_LONGLONG())

public data class KSPROPERTY_TIMECODE_NODE_S(public var NodeProperty: KSP_NODE = KSP_NODE(), public var TimecodeSamp: TIMECODE_SAMPLE = TIMECODE_SAMPLE())

public data class KSPROPERTY_TIMECODE_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var TimecodeSamp: TIMECODE_SAMPLE = TIMECODE_SAMPLE())

public data class KSPROPERTY_TUNER_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var ModesSupported: UInt = 0u,
    public var VideoMedium: KSIDENTIFIER = KSIDENTIFIER(),
    public var TVAudioMedium: KSIDENTIFIER = KSIDENTIFIER(),
    public var RadioAudioMedium: KSIDENTIFIER = KSIDENTIFIER(),
)

public data class KSPROPERTY_TUNER_FREQUENCY_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Frequency: UInt = 0u,
    public var LastFrequency: UInt = 0u,
    public var TuningFlags: UInt = 0u,
    public var VideoSubChannel: UInt = 0u,
    public var AudioSubChannel: UInt = 0u,
    public var Channel: UInt = 0u,
    public var Country: UInt = 0u,
)

public data class KSPROPERTY_TUNER_IF_MEDIUM_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var IFMedium: KSIDENTIFIER = KSIDENTIFIER())

public data class KSPROPERTY_TUNER_INPUT_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var InputIndex: UInt = 0u)

public data class KSPROPERTY_TUNER_MODE_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Mode: UInt = 0u,
    public var StandardsSupported: UInt = 0u,
    public var MinFrequency: UInt = 0u,
    public var MaxFrequency: UInt = 0u,
    public var TuningGranularity: UInt = 0u,
    public var NumberOfInputs: UInt = 0u,
    public var SettlingTime: UInt = 0u,
    public var Strategy: UInt = 0u,
)

public data class KSPROPERTY_TUNER_MODE_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Mode: UInt = 0u)

public data class KSPROPERTY_TUNER_NETWORKTYPE_SCAN_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var NetworkType: GUID = GUID(),
    public var BufferSize: UInt = 0u,
    public var NetworkTunerCapabilities: Long = 0L,
)

public data class KSPROPERTY_TUNER_SCAN_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var fSupportsHardwareAssistedScanning: BOOL = 0,
    public var SupportedBroadcastStandards: UInt = 0u,
    public var GUIDBucket: Long = 0L,
    public var lengthofBucket: UInt = 0u,
)

public data class KSPROPERTY_TUNER_SCAN_STATUS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var LockStatus: TunerLockType = 0,
    public var CurrentFrequency: UInt = 0u,
)

public data class KSPROPERTY_TUNER_STANDARD_MODE_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var AutoDetect: BOOL = 0)

public data class KSPROPERTY_TUNER_STANDARD_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Standard: UInt = 0u)

public data class KSPROPERTY_TUNER_STATUS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var CurrentFrequency: UInt = 0u,
    public var PLLOffset: UInt = 0u,
    public var SignalStrength: UInt = 0u,
    public var Busy: UInt = 0u,
)

public data class KSPROPERTY_TVAUDIO_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Capabilities: UInt = 0u,
    public var InputMedium: KSIDENTIFIER = KSIDENTIFIER(),
    public var OutputMedium: KSIDENTIFIER = KSIDENTIFIER(),
)

public data class KSPROPERTY_TVAUDIO_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Mode: UInt = 0u)

public data class KSPROPERTY_VBICODECFILTERING_CC_SUBSTREAMS_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Substreams: VBICODECFILTERING_CC_SUBSTREAMS = VBICODECFILTERING_CC_SUBSTREAMS())

public data class KSPROPERTY_VBICODECFILTERING_NABTS_SUBSTREAMS_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Substreams: VBICODECFILTERING_NABTS_SUBSTREAMS = VBICODECFILTERING_NABTS_SUBSTREAMS())

public data class KSPROPERTY_VBICODECFILTERING_SCANLINES_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Scanlines: VBICODECFILTERING_SCANLINES = VBICODECFILTERING_SCANLINES())

public data class KSPROPERTY_VBICODECFILTERING_STATISTICS_CC_PIN_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Statistics: VBICODECFILTERING_STATISTICS_CC_PIN = VBICODECFILTERING_STATISTICS_CC_PIN())

public data class KSPROPERTY_VBICODECFILTERING_STATISTICS_CC_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Statistics: VBICODECFILTERING_STATISTICS_CC = VBICODECFILTERING_STATISTICS_CC())

public data class KSPROPERTY_VBICODECFILTERING_STATISTICS_COMMON_PIN_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Statistics: VBICODECFILTERING_STATISTICS_COMMON_PIN = VBICODECFILTERING_STATISTICS_COMMON_PIN())

public data class KSPROPERTY_VBICODECFILTERING_STATISTICS_COMMON_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Statistics: VBICODECFILTERING_STATISTICS_COMMON = VBICODECFILTERING_STATISTICS_COMMON())

public data class KSPROPERTY_VBICODECFILTERING_STATISTICS_NABTS_PIN_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Statistics: VBICODECFILTERING_STATISTICS_NABTS_PIN = VBICODECFILTERING_STATISTICS_NABTS_PIN())

public data class KSPROPERTY_VBICODECFILTERING_STATISTICS_NABTS_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Statistics: VBICODECFILTERING_STATISTICS_NABTS = VBICODECFILTERING_STATISTICS_NABTS())

public data class KSPROPERTY_VIDEOCOMPRESSION_GETINFO_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var DefaultKeyFrameRate: Int = 0,
    public var DefaultPFrameRate: Int = 0,
    public var DefaultQuality: Int = 0,
    public var NumberOfQualitySettings: Int = 0,
    public var Capabilities: Int = 0,
)

public data class KSPROPERTY_VIDEOCOMPRESSION_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var Value: Int = 0,
)

public data class KSPROPERTY_VIDEOCOMPRESSION_S1(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
)

public data class KSPROPERTY_VIDEOCONTROL_ACTUAL_FRAME_RATE_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var RangeIndex: UInt = 0u,
    public var Dimensions: Foundation.SIZE = Foundation.SIZE(),
    public var CurrentActualFrameRate: Long = 0L,
    public var CurrentMaxAvailableFrameRate: Long = 0L,
)

public data class KSPROPERTY_VIDEOCONTROL_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var VideoControlCaps: UInt = 0u,
)

public data class KSPROPERTY_VIDEOCONTROL_FRAME_RATES_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var RangeIndex: UInt = 0u,
    public var Dimensions: Foundation.SIZE = Foundation.SIZE(),
)

public data class KSPROPERTY_VIDEOCONTROL_MODE_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StreamIndex: UInt = 0u,
    public var Mode: Int = 0,
)

public data class KSPROPERTY_VIDEODECODER_CAPS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var StandardsSupported: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var SettlingTime: UInt = 0u,
    public var HSyncPerVSync: UInt = 0u,
)

public data class KSPROPERTY_VIDEODECODER_S(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Value: UInt = 0u)

public data class KSPROPERTY_VIDEODECODER_STATUS2_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var NumberOfLines: UInt = 0u,
    public var SignalLocked: UInt = 0u,
    public var ChromaLock: UInt = 0u,
)

public data class KSPROPERTY_VIDEODECODER_STATUS_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var NumberOfLines: UInt = 0u,
    public var SignalLocked: UInt = 0u,
)

public data class KSPROPERTY_VIDEOENCODER_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_VIDEOPROCAMP_NODE_S(
    public var NodeProperty: KSP_NODE = KSP_NODE(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_VIDEOPROCAMP_NODE_S2(
    public var NodeProperty: KSP_NODE = KSP_NODE(),
    public var Value1: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var Value2: Int = 0,
)

public data class KSPROPERTY_VIDEOPROCAMP_S(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
)

public data class KSPROPERTY_VIDEOPROCAMP_S2(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var Value1: Int = 0,
    public var Flags: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var Value2: Int = 0,
)

public data class KSP_NODE(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var NodeId: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KSP_PIN(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var PinId: UInt = 0u,
    public var Anonymous: KSP_PIN_0 = KSP_PIN_0(),
)

public data class KSP_PIN_0(public var Reserved: UInt = 0u, public var Flags: UInt = 0u)

public data class KSP_TIMEFORMAT(
    public var Property: KSIDENTIFIER = KSIDENTIFIER(),
    public var SourceFormat: GUID = GUID(),
    public var TargetFormat: GUID = GUID(),
    public var Time: Long = 0L,
)

public data class KSQUALITY(
    public var Context: Long = 0L,
    public var Proportion: UInt = 0u,
    public var DeltaTime: Long = 0L,
)

public data class KSQUALITY_MANAGER(public var QualityManager: Foundation.HANDLE = Foundation.HANDLE(), public var Context: Long = 0L)

public data class KSQUERYBUFFER(
    public var Event: KSIDENTIFIER = KSIDENTIFIER(),
    public var EventData: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class KSRATE(
    public var PresentationStart: Long = 0L,
    public var Duration: Long = 0L,
    public var Interface: KSIDENTIFIER = KSIDENTIFIER(),
    public var Rate: Int = 0,
    public var Flags: UInt = 0u,
)

public data class KSRATE_CAPABILITY(public var Property: KSIDENTIFIER = KSIDENTIFIER(), public var Rate: KSRATE = KSRATE())

public data class KSRELATIVEEVENT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Anonymous: KSRELATIVEEVENT_0 = KSRELATIVEEVENT_0(),
    public var Reserved: Long = 0L,
    public var Event: KSIDENTIFIER = KSIDENTIFIER(),
    public var EventData: KSEVENTDATA = KSEVENTDATA(),
)
