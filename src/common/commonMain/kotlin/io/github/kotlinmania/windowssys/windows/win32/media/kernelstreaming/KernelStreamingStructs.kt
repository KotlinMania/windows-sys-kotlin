@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.media.TimecodeSample

public class AllocatorPropertiesEx(
    public var cBuffers: Int = 0,
    public var cbBuffer: Int = 0,
    public var cbAlign: Int = 0,
    public var cbPrefix: Int = 0,
    public var memoryType: Guid = Guid(),
    public var busType: Guid = Guid(),
    public var state: PipeState = 0,
    public var input: PipeTermination = PipeTermination(),
    public var output: PipeTermination = PipeTermination(),
    public var strategy: UInt = 0u,
    public var flags: UInt = 0u,
    public var weight: UInt = 0u,
    public var logicalMemoryType: KsLogicalMemoryType = 0,
    public var allocatorPlace: PipeAllocatorPlace = 0,
    public var dimensions: PipeDimensions = PipeDimensions(),
    public var physicalRange: KsFramingRange = KsFramingRange(),
    public var prevSegment: COpaquePointer? = null,
    public var countNextSegments: UInt = 0u,
    public var nextSegments: COpaquePointer? = null,
    public var insideFactors: UInt = 0u,
    public var numberPins: UInt = 0u,
)

public data class AudioresourcemanagementResourcegroup(
    public var resourceGroupAcquired: Bool = 0,
    public var resourceGroupName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AudioresourcemanagementResourcegroup) return false
        if (this.resourceGroupAcquired != other.resourceGroupAcquired) return false
        if (!this.resourceGroupName.contentEquals(other.resourceGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceGroupAcquired.hashCode()
        result = 31 * result + this.resourceGroupName.contentHashCode()
        return result
    }
}

public data class CcBytePair(
    public var decoded: UByteArray = UByteArray(2),
    public var reserved: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CcBytePair) return false
        if (!this.decoded.contentEquals(other.decoded)) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.decoded.contentHashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }
}

public data class CcHwField(
    public var scanlinesRequested: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
    public var fieldFlags: UInt = 0u,
    public var pictureNumber: Long = 0L,
    public var lines: List<CcBytePair> = List(12) { CcBytePair() },
)

public class Devcaps(
    public var canRecord: Int = 0,
    public var canRecordStrobe: Int = 0,
    public var hasAudio: Int = 0,
    public var hasVideo: Int = 0,
    public var usesFiles: Int = 0,
    public var canSave: Int = 0,
    public var deviceType: Int = 0,
    public var tCRead: Int = 0,
    public var tCWrite: Int = 0,
    public var cTLRead: Int = 0,
    public var indexRead: Int = 0,
    public var preroll: Int = 0,
    public var postroll: Int = 0,
    public var syncAcc: Int = 0,
    public var normRate: Int = 0,
    public var canPreview: Int = 0,
    public var canMonitorSrc: Int = 0,
    public var canTest: Int = 0,
    public var videoIn: Int = 0,
    public var audioIn: Int = 0,
    public var calibrate: Int = 0,
    public var seekType: Int = 0,
    public var simulatedHardware: Int = 0,
)

public data class Ds3dvector(
    public var anonymous1: Ds3dvector0 = Ds3dvector0(),
    public var anonymous2: Ds3dvector1 = Ds3dvector1(),
    public var anonymous3: Ds3dvector2 = Ds3dvector2(),
)

public data class Ds3dvector0(
    public var x: Float = 0.0f,
    public var dvX: Float = 0.0f,
)

public data class Ds3dvector1(
    public var y: Float = 0.0f,
    public var dvY: Float = 0.0f,
)

public data class Ds3dvector2(
    public var z: Float = 0.0f,
    public var dvZ: Float = 0.0f,
)

public data class InterleavedAudioFormatInformation(
    public var size: UInt = 0u,
    public var primaryChannelCount: UInt = 0u,
    public var primaryChannelStartPosition: UInt = 0u,
    public var primaryChannelMask: UInt = 0u,
    public var interleavedChannelCount: UInt = 0u,
    public var interleavedChannelStartPosition: UInt = 0u,
    public var interleavedChannelMask: UInt = 0u,
)

public data class Ksac3AlternateAudio(
    public var fStereo: Bool = 0,
    public var dualMode: UInt = 0u,
)

public data class Ksac3BitStreamMode(
    public var bitStreamMode: Int = 0,
)

public data class Ksac3DialogueLevel(
    public var dialogueLevel: UInt = 0u,
)

public data class Ksac3Downmix(
    public var fDownMix: Bool = 0,
    public var fDolbySurround: Bool = 0,
)

public data class Ksac3ErrorConcealment(
    public var fRepeatPreviousBlock: Bool = 0,
    public var fErrorInCurrentBlock: Bool = 0,
)

public data class Ksac3RoomType(
    public var fLargeRoom: Bool = 0,
)

public data class KsallocatorFraming(
    public var anonymous1: KsallocatorFraming0 = KsallocatorFraming0(),
    public var poolType: UInt = 0u,
    public var frames: UInt = 0u,
    public var frameSize: UInt = 0u,
    public var anonymous2: KsallocatorFraming1 = KsallocatorFraming1(),
    public var reserved: UInt = 0u,
)

public data class KsallocatorFraming0(
    public var optionsFlags: UInt = 0u,
    public var requirementsFlags: UInt = 0u,
)

public data class KsallocatorFraming1(
    public var fileAlignment: UInt = 0u,
    public var framePitch: Int = 0,
)

public data class KsallocatorFramingEx(
    public var countItems: UInt = 0u,
    public var pinFlags: UInt = 0u,
    public var outputCompression: KsCompression = KsCompression(),
    public var pinWeight: UInt = 0u,
    public var framingItem: List<KsFramingItem> = List(1) { KsFramingItem() },
)

public data class Ksattribute(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var attribute: Guid = Guid(),
)

public data class KsattributeAudiosignalprocessingMode(
    public var attributeHeader: Ksattribute = Ksattribute(),
    public var signalProcessingMode: Guid = Guid(),
)

public data class KsaudioengineBufferSizeRange(
    public var minBufferBytes: UInt = 0u,
    public var maxBufferBytes: UInt = 0u,
)

public data class KsaudioengineDescriptor(
    public var nHostPinId: UInt = 0u,
    public var nOffloadPinId: UInt = 0u,
    public var nLoopbackPinId: UInt = 0u,
)

public data class KsaudioengineDevicecontrols(
    public var volume: EDeviceControlUseType = 0,
    public var mute: EDeviceControlUseType = 0,
    public var peakMeter: EDeviceControlUseType = 0,
)

public data class KsaudioengineVolumelevel(
    public var targetVolume: Int = 0,
    public var curveType: AudioCurveType = 0,
    public var curveDuration: ULong = 0uL,
)

public data class KsaudiomoduleDescriptor(
    public var classId: Guid = Guid(),
    public var instanceId: UInt = 0u,
    public var versionMajor: UInt = 0u,
    public var versionMinor: UInt = 0u,
    public var name: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsaudiomoduleDescriptor) return false
        if (this.classId != other.classId) return false
        if (this.instanceId != other.instanceId) return false
        if (this.versionMajor != other.versionMajor) return false
        if (this.versionMinor != other.versionMinor) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classId.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.versionMajor.hashCode()
        result = 31 * result + this.versionMinor.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KsaudiomoduleNotification(
    public var anonymous: KsaudiomoduleNotification0 = KsaudiomoduleNotification0(),
)

public data class KsaudiomoduleNotification0(
    public var providerId: KsaudiomoduleNotification00 = KsaudiomoduleNotification00(),
    public var alignment: Long = 0L,
)

public data class KsaudiomoduleNotification00(
    public var deviceId: Guid = Guid(),
    public var classId: Guid = Guid(),
    public var instanceId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsaudiomoduleProperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var classId: Guid = Guid(),
    public var instanceId: UInt = 0u,
)

public data class KsaudioChannelConfig(
    public var activeSpeakerPositions: Int = 0,
)

public data class KsaudioCopyProtection(
    public var fCopyrighted: Bool = 0,
    public var fOriginal: Bool = 0,
)

public data class KsaudioDynamicRange(
    public var quietCompression: UInt = 0u,
    public var loudCompression: UInt = 0u,
)

public data class KsaudioMicrophoneCoordinates(
    public var usType: UShort = 0u,
    public var wXCoord: Short = 0,
    public var wYCoord: Short = 0,
    public var wZCoord: Short = 0,
    public var wVerticalAngle: Short = 0,
    public var wHorizontalAngle: Short = 0,
)

public data class KsaudioMicArrayGeometry(
    public var usVersion: UShort = 0u,
    public var usMicArrayType: UShort = 0u,
    public var wVerticalAngleBegin: Short = 0,
    public var wVerticalAngleEnd: Short = 0,
    public var wHorizontalAngleBegin: Short = 0,
    public var wHorizontalAngleEnd: Short = 0,
    public var usFrequencyBandLo: UShort = 0u,
    public var usFrequencyBandHi: UShort = 0u,
    public var usNumberOfMicrophones: UShort = 0u,
    public var ksMicCoord: List<KsaudioMicrophoneCoordinates> = List(1) { KsaudioMicrophoneCoordinates() },
)

public data class KsaudioMixcapTable(
    public var inputChannels: UInt = 0u,
    public var outputChannels: UInt = 0u,
    public var capabilities: List<KsaudioMixCaps> = List(1) { KsaudioMixCaps() },
)

public data class KsaudioMixlevel(
    public var mute: Bool = 0,
    public var level: Int = 0,
)

public data class KsaudioMixCaps(
    public var mute: Bool = 0,
    public var minimum: Int = 0,
    public var maximum: Int = 0,
    public var anonymous: KsaudioMixCaps0 = KsaudioMixCaps0(),
)

public data class KsaudioMixCaps0(
    public var reset: Int = 0,
    public var resolution: Int = 0,
)

public data class KsaudioPacketsizeConstraints(
    public var minPacketPeriodInHns: UInt = 0u,
    public var packetSizeFileAlignment: UInt = 0u,
    public var reserved: UInt = 0u,
    public var numProcessingModeConstraints: UInt = 0u,
    public var processingModeConstraints: List<KsaudioPacketsizeProcessingmodeConstraint> = List(1) { KsaudioPacketsizeProcessingmodeConstraint() },
)

public data class KsaudioPacketsizeConstraints2(
    public var minPacketPeriodInHns: UInt = 0u,
    public var packetSizeFileAlignment: UInt = 0u,
    public var maxPacketSizeInBytes: UInt = 0u,
    public var numProcessingModeConstraints: UInt = 0u,
    public var processingModeConstraints: List<KsaudioPacketsizeProcessingmodeConstraint> = List(1) { KsaudioPacketsizeProcessingmodeConstraint() },
)

public data class KsaudioPacketsizeProcessingmodeConstraint(
    public var processingMode: Guid = Guid(),
    public var samplesPerProcessingPacket: UInt = 0u,
    public var processingPacketDurationInHns: UInt = 0u,
)

public data class KsaudioPosition(
    public var playOffset: ULong = 0uL,
    public var writeOffset: ULong = 0uL,
)

public data class KsaudioPositionex(
    public var timerFrequency: Long = 0L,
    public var timeStamp1: Long = 0L,
    public var position: KsaudioPosition = KsaudioPosition(),
    public var timeStamp2: Long = 0L,
)

public data class KsaudioPresentationPosition(
    public var u64PositionInBlocks: ULong = 0uL,
    public var u64QPCPosition: ULong = 0uL,
)

public data class KscameraExtendedpropBackgroundsegmentationConfigcaps(
    public var resolution: Size = Size(),
    public var maxFrameRate: KscameraExtendedpropBackgroundsegmentationConfigcaps0 = KscameraExtendedpropBackgroundsegmentationConfigcaps0(),
    public var maskResolution: Size = Size(),
    public var subType: Guid = Guid(),
)

public data class KscameraExtendedpropBackgroundsegmentationConfigcaps0(
    public var numerator: Int = 0,
    public var denominator: Int = 0,
)

public data class KscameraExtendedpropCameraoffset(
    public var pitchAngle: Int = 0,
    public var yawAngle: Int = 0,
    public var flag: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropDigitalwindowConfigcaps(
    public var resolutionX: Int = 0,
    public var resolutionY: Int = 0,
    public var porchTop: Int = 0,
    public var porchLeft: Int = 0,
    public var porchBottom: Int = 0,
    public var porchRight: Int = 0,
    public var nonUpscalingWindowSize: Int = 0,
    public var minWindowSize: Int = 0,
    public var maxWindowSize: Int = 0,
    public var reserved: Int = 0,
)

public data class KscameraExtendedpropDigitalwindowConfigcapsheader(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
)

public data class KscameraExtendedpropDigitalwindowSetting(
    public var originX: Int = 0,
    public var originY: Int = 0,
    public var windowSize: Int = 0,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropEvcompensation(
    public var mode: UInt = 0u,
    public var min: Int = 0,
    public var max: Int = 0,
    public var value: Int = 0,
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropFieldofview(
    public var normalizedFocalLengthX: UInt = 0u,
    public var normalizedFocalLengthY: UInt = 0u,
    public var flag: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropHeader(
    public var version: UInt = 0u,
    public var pinId: UInt = 0u,
    public var size: UInt = 0u,
    public var result: UInt = 0u,
    public var flags: ULong = 0uL,
    public var capability: ULong = 0uL,
)

public data class KscameraExtendedpropMetadatainfo(
    public var bufferAlignment: Int = 0,
    public var maxMetadataBufferSize: UInt = 0u,
)

public data class KscameraExtendedpropPhotomode(
    public var requestedHistoryFrames: UInt = 0u,
    public var maxHistoryFrames: UInt = 0u,
    public var subMode: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropProfile(
    public var profileId: Guid = Guid(),
    public var index: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropRoiConfigcaps(
    public var controlId: UInt = 0u,
    public var maxNumberOfROIs: UInt = 0u,
    public var capability: ULong = 0uL,
)

public data class KscameraExtendedpropRoiConfigcapsheader(
    public var size: UInt = 0u,
    public var configCapCount: UInt = 0u,
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropRoiExposure(
    public var rOIInfo: KscameraExtendedpropRoiInfo = KscameraExtendedpropRoiInfo(),
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropRoiFocus(
    public var rOIInfo: KscameraExtendedpropRoiInfo = KscameraExtendedpropRoiInfo(),
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropRoiInfo(
    public var region: Rect = Rect(),
    public var flags: ULong = 0uL,
    public var weight: Int = 0,
    public var regionOfInterestType: Int = 0,
)

public data class KscameraExtendedpropRoiIspcontrol(
    public var controlId: UInt = 0u,
    public var rOICount: UInt = 0u,
    public var result: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropRoiIspcontrolheader(
    public var size: UInt = 0u,
    public var controlCount: UInt = 0u,
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropRoiWhitebalance(
    public var rOIInfo: KscameraExtendedpropRoiInfo = KscameraExtendedpropRoiInfo(),
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropValue(
    public var value: KscameraExtendedpropValue0 = KscameraExtendedpropValue0(),
)

public data class KscameraExtendedpropValue0(
    public var dbl: Double = 0.0,
    public var ull: ULong = 0uL,
    public var ul: UInt = 0u,
    public var ratio: ULong = 0uL,
    public var l: Int = 0,
    public var ll: Long = 0L,
)

public data class KscameraExtendedpropVideoprocsetting(
    public var mode: UInt = 0u,
    public var min: Int = 0,
    public var max: Int = 0,
    public var step: Int = 0,
    public var videoProc: KscameraExtendedpropValue = KscameraExtendedpropValue(),
    public var reserved: ULong = 0uL,
)

public data class KscameraMaxvideofpsForphotores(
    public var photoResWidth: UInt = 0u,
    public var photoResHeight: UInt = 0u,
    public var previewFPSNum: UInt = 0u,
    public var previewFPSDenom: UInt = 0u,
    public var captureFPSNum: UInt = 0u,
    public var captureFPSDenom: UInt = 0u,
)

public data class KscameraMetadataBackgroundsegmentationmask(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var maskCoverageBoundingBox: Rect = Rect(),
    public var maskResolution: Size = Size(),
    public var foregroundBoundingBox: Rect = Rect(),
    public var maskData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KscameraMetadataBackgroundsegmentationmask) return false
        if (this.header != other.header) return false
        if (this.maskCoverageBoundingBox != other.maskCoverageBoundingBox) return false
        if (this.maskResolution != other.maskResolution) return false
        if (this.foregroundBoundingBox != other.foregroundBoundingBox) return false
        if (!this.maskData.contentEquals(other.maskData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.maskCoverageBoundingBox.hashCode()
        result = 31 * result + this.maskResolution.hashCode()
        result = 31 * result + this.foregroundBoundingBox.hashCode()
        result = 31 * result + this.maskData.contentHashCode()
        return result
    }
}

public data class KscameraMetadataCapturestats(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var exposureTime: ULong = 0uL,
    public var exposureCompensationFlags: ULong = 0uL,
    public var exposureCompensationValue: Int = 0,
    public var isoSpeed: UInt = 0u,
    public var focusState: UInt = 0u,
    public var lensPosition: UInt = 0u,
    public var whiteBalance: UInt = 0u,
    public var flash: UInt = 0u,
    public var flashPower: UInt = 0u,
    public var zoomFactor: UInt = 0u,
    public var sceneMode: ULong = 0uL,
    public var sensorFramerate: ULong = 0uL,
)

public data class KscameraMetadataDigitalwindow(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var window: KscameraExtendedpropDigitalwindowSetting = KscameraExtendedpropDigitalwindowSetting(),
)

public data class KscameraMetadataFrameillumination(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraMetadataItemheader(
    public var metadataId: UInt = 0u,
    public var size: UInt = 0u,
)

public data class KscameraMetadataPhotoconfirmation(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var photoConfirmationIndex: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraPerframesettingCapHeader(
    public var size: UInt = 0u,
    public var itemCount: UInt = 0u,
    public var flags: ULong = 0uL,
)

public data class KscameraPerframesettingCapItemHeader(
    public var size: UInt = 0u,
    public var type: UInt = 0u,
    public var flags: ULong = 0uL,
)

public data class KscameraPerframesettingCustomItem(
    public var size: UInt = 0u,
    public var reserved: UInt = 0u,
    public var id: Guid = Guid(),
)

public data class KscameraPerframesettingFrameHeader(
    public var size: UInt = 0u,
    public var id: UInt = 0u,
    public var itemCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraPerframesettingHeader(
    public var size: UInt = 0u,
    public var frameCount: UInt = 0u,
    public var id: Guid = Guid(),
    public var flags: ULong = 0uL,
    public var loopCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraPerframesettingItemHeader(
    public var size: UInt = 0u,
    public var type: UInt = 0u,
    public var flags: ULong = 0uL,
)

public data class KscameraProfileConcurrencyinfo(
    public var referenceGuid: Guid = Guid(),
    public var reserved: UInt = 0u,
    public var profileCount: UInt = 0u,
    public var profiles: KscameraProfileInfo? = null,
)

public data class KscameraProfileInfo(
    public var profileId: Guid = Guid(),
    public var index: UInt = 0u,
    public var pinCount: UInt = 0u,
    public var pins: KscameraProfilePininfo? = null,
)

public data class KscameraProfileMediainfo(
    public var resolution: KscameraProfileMediainfo0 = KscameraProfileMediainfo0(),
    public var maxFrameRate: KscameraProfileMediainfo1 = KscameraProfileMediainfo1(),
    public var flags: ULong = 0uL,
    public var data0: UInt = 0u,
    public var data1: UInt = 0u,
    public var data2: UInt = 0u,
    public var data3: UInt = 0u,
)

public data class KscameraProfileMediainfo1(
    public var numerator: UInt = 0u,
    public var denominator: UInt = 0u,
)

public data class KscameraProfileMediainfo0(
    public var x: UInt = 0u,
    public var y: UInt = 0u,
)

public data class KscameraProfilePininfo(
    public var pinCategory: Guid = Guid(),
    public var anonymous: KscameraProfilePininfo0 = KscameraProfilePininfo0(),
    public var mediaInfoCount: UInt = 0u,
    public var mediaInfos: KscameraProfileMediainfo? = null,
)

public data class KscameraProfilePininfo0(
    public var anonymous: KscameraProfilePininfo00 = KscameraProfilePininfo00(),
    public var reserved: UInt = 0u,
)

public data class KscameraProfilePininfo00(
    public var pinIndex: UShort = 0u,
    public var profileSensorType: UShort = 0u,
)

public data class KsclockCreate(
    public var createFlags: UInt = 0u,
)

public data class Kscomponentid(
    public var manufacturer: Guid = Guid(),
    public var product: Guid = Guid(),
    public var component: Guid = Guid(),
    public var name: Guid = Guid(),
    public var version: UInt = 0u,
    public var revision: UInt = 0u,
)

public data class KscorrelatedTime(
    public var time: Long = 0L,
    public var systemTime: Long = 0L,
)

public data class Ksdataformat(
    public var anonymous: Ksdataformat0 = Ksdataformat0(),
    public var alignment: Long = 0L,
)

public data class Ksdataformat0(
    public var formatSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var sampleSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var majorFormat: Guid = Guid(),
    public var subFormat: Guid = Guid(),
    public var specifier: Guid = Guid(),
)

public data class KsdatarangeAudio(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var maximumChannels: UInt = 0u,
    public var minimumBitsPerSample: UInt = 0u,
    public var maximumBitsPerSample: UInt = 0u,
    public var minimumSampleFrequency: UInt = 0u,
    public var maximumSampleFrequency: UInt = 0u,
)

public data class KsdatarangeMusic(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var technology: Guid = Guid(),
    public var channels: UInt = 0u,
    public var notes: UInt = 0u,
    public var channelMask: UInt = 0u,
)

public data class KsdeviceProfileInfo(
    public var type: UInt = 0u,
    public var size: UInt = 0u,
    public var anonymous: KsdeviceProfileInfo0 = KsdeviceProfileInfo0(),
)

public data class KsdeviceProfileInfo0(
    public var camera: KsdeviceProfileInfo00 = KsdeviceProfileInfo00(),
)

public data class KsdeviceProfileInfo00(
    public var info: KscameraProfileInfo = KscameraProfileInfo(),
    public var reserved: UInt = 0u,
    public var concurrencyCount: UInt = 0u,
    public var concurrency: KscameraProfileConcurrencyinfo? = null,
)

public data class Ksdisplaychange(
    public var pelsWidth: UInt = 0u,
    public var pelsHeight: UInt = 0u,
    public var bitsPerPel: UInt = 0u,
    public var deviceID: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ksdisplaychange) return false
        if (this.pelsWidth != other.pelsWidth) return false
        if (this.pelsHeight != other.pelsHeight) return false
        if (this.bitsPerPel != other.bitsPerPel) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pelsWidth.hashCode()
        result = 31 * result + this.pelsHeight.hashCode()
        result = 31 * result + this.bitsPerPel.hashCode()
        result = 31 * result + this.deviceID.contentHashCode()
        return result
    }
}

public data class Ksds3dBufferAll(
    public var position: Ds3dvector = Ds3dvector(),
    public var velocity: Ds3dvector = Ds3dvector(),
    public var insideConeAngle: UInt = 0u,
    public var outsideConeAngle: UInt = 0u,
    public var coneOrientation: Ds3dvector = Ds3dvector(),
    public var coneOutsideVolume: Int = 0,
    public var minDistance: Float = 0.0f,
    public var maxDistance: Float = 0.0f,
    public var mode: UInt = 0u,
)

public data class Ksds3dBufferConeAngles(
    public var insideConeAngle: UInt = 0u,
    public var outsideConeAngle: UInt = 0u,
)

public data class Ksds3dHrtfFilterFormatMsg(
    public var filterMethod: Ksds3dHrtfFilterMethod = 0,
    public var coeffFormat: Ksds3dHrtfCoeffFormat = 0,
    public var version: Ksds3dHrtfFilterVersion = 0,
    public var reserved: UInt = 0u,
)

public data class Ksds3dHrtfInitMsg(
    public var size: UInt = 0u,
    public var quality: Ksds3dHrtfFilterQuality = 0,
    public var sampleRate: Float = 0.0f,
    public var maxFilterSize: UInt = 0u,
    public var filterTransientMuteLength: UInt = 0u,
    public var filterOverlapBufferLength: UInt = 0u,
    public var outputOverlapBufferLength: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ksds3dHrtfParamsMsg(
    public var size: UInt = 0u,
    public var enabled: UInt = 0u,
    public var swapChannels: Bool = 0,
    public var zeroAzimuth: Bool = 0,
    public var crossFadeOutput: Bool = 0,
    public var filterSize: UInt = 0u,
)

public data class Ksds3dItdParams(
    public var channel: Int = 0,
    public var volSmoothScale: Float = 0.0f,
    public var totalDryAttenuation: Float = 0.0f,
    public var totalWetAttenuation: Float = 0.0f,
    public var smoothFrequency: Int = 0,
    public var delay: Int = 0,
)

public data class Ksds3dItdParamsMsg(
    public var enabled: UInt = 0u,
    public var leftParams: Ksds3dItdParams = Ksds3dItdParams(),
    public var rightParams: Ksds3dItdParams = Ksds3dItdParams(),
    public var reserved: UInt = 0u,
)

public data class Ksds3dListenerAll(
    public var position: Ds3dvector = Ds3dvector(),
    public var velocity: Ds3dvector = Ds3dvector(),
    public var orientFront: Ds3dvector = Ds3dvector(),
    public var orientTop: Ds3dvector = Ds3dvector(),
    public var distanceFactor: Float = 0.0f,
    public var rolloffFactor: Float = 0.0f,
    public var dopplerFactor: Float = 0.0f,
)

public data class Ksds3dListenerOrientation(
    public var front: Ds3dvector = Ds3dvector(),
    public var top: Ds3dvector = Ds3dvector(),
)

public data class Kserror(
    public var context: COpaquePointer? = null,
    public var status: UInt = 0u,
)

public data class Kseventdata(
    public var notificationType: UInt = 0u,
    public var anonymous: Kseventdata0 = Kseventdata0(),
)

public data class Kseventdata0(
    public var eventHandle: Kseventdata00 = Kseventdata00(),
    public var semaphoreHandle: Kseventdata01 = Kseventdata01(),
    public var alignment: Kseventdata02 = Kseventdata02(),
)

public data class Kseventdata02(
    public var unused: COpaquePointer? = null,
    public var alignment: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kseventdata02) return false
        if (this.unused != other.unused) return false
        if (!this.alignment.contentEquals(other.alignment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unused.hashCode()
        result = 31 * result + this.alignment.contentHashCode()
        return result
    }
}

public data class Kseventdata00(
    public var event: Handle = null,
    public var reserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kseventdata00) return false
        if (this.event != other.event) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Kseventdata01(
    public var semaphore: Handle = null,
    public var reserved: UInt = 0u,
    public var adjustment: Int = 0,
)

public data class KseventTimeInterval(
    public var eventData: Kseventdata = Kseventdata(),
    public var timeBase: Long = 0L,
    public var interval: Long = 0L,
)

public data class KseventTimeMark(
    public var eventData: Kseventdata = Kseventdata(),
    public var markTime: Long = 0L,
)

public data class KseventTunerInitiateScanS(
    public var eventData: Kseventdata = Kseventdata(),
    public var startFrequency: UInt = 0u,
    public var endFrequency: UInt = 0u,
)

public data class KseNode(
    public var event: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsePin(
    public var event: Ksidentifier = Ksidentifier(),
    public var pinId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ksframetime(
    public var duration: Long = 0L,
    public var frameFlags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsgopUserdata(
    public var sc: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var cFields: UByte = 0u,
    public var l21Data: ByteArray = ByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsgopUserdata) return false
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

public data class Ksidentifier(
    public var anonymous: Ksidentifier0 = Ksidentifier0(),
)

public data class Ksidentifier0(
    public var anonymous: Ksidentifier00 = Ksidentifier00(),
    public var alignment: Long = 0L,
)

public data class Ksidentifier00(
    public var set: Guid = Guid(),
    public var id: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class Ksinterval(
    public var timeBase: Long = 0L,
    public var interval: Long = 0L,
)

public data class KsjackDescription(
    public var channelMapping: UInt = 0u,
    public var color: UInt = 0u,
    public var connectionType: EPcxConnectionType = 0,
    public var geoLocation: EPcxGeoLocation = 0,
    public var genLocation: EPcxGenLocation = 0,
    public var portConnection: EPxcPortConnection = 0,
    public var isConnected: Bool = 0,
)

public data class KsjackDescription2(
    public var deviceStateInfo: UInt = 0u,
    public var jackCapabilities: UInt = 0u,
)

public data class KsjackDescription3(
    public var configId: UInt = 0u,
)

public data class KsjackSinkInformation(
    public var connType: KsjackSinkConnectiontype = 0,
    public var manufacturerId: UShort = 0u,
    public var productId: UShort = 0u,
    public var audioLatency: UShort = 0u,
    public var hDCPCapable: Bool = 0,
    public var aICapable: Bool = 0,
    public var sinkDescriptionLength: UByte = 0u,
    public var sinkDescription: UShortArray = UShortArray(32),
    public var portId: Luid = Luid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsjackSinkInformation) return false
        if (this.connType != other.connType) return false
        if (this.manufacturerId != other.manufacturerId) return false
        if (this.productId != other.productId) return false
        if (this.audioLatency != other.audioLatency) return false
        if (this.hDCPCapable != other.hDCPCapable) return false
        if (this.aICapable != other.aICapable) return false
        if (this.sinkDescriptionLength != other.sinkDescriptionLength) return false
        if (!this.sinkDescription.contentEquals(other.sinkDescription)) return false
        if (this.portId != other.portId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connType.hashCode()
        result = 31 * result + this.manufacturerId.hashCode()
        result = 31 * result + this.productId.hashCode()
        result = 31 * result + this.audioLatency.hashCode()
        result = 31 * result + this.hDCPCapable.hashCode()
        result = 31 * result + this.aICapable.hashCode()
        result = 31 * result + this.sinkDescriptionLength.hashCode()
        result = 31 * result + this.sinkDescription.contentHashCode()
        result = 31 * result + this.portId.hashCode()
        return result
    }
}

public data class KsmpegvidRect(
    public var startX: UInt = 0u,
    public var startY: UInt = 0u,
    public var endX: UInt = 0u,
    public var endY: UInt = 0u,
)

public data class KsmultipleDataProp(
    public var property: Ksidentifier = Ksidentifier(),
    public var multipleItem: KsmultipleItem = KsmultipleItem(),
)

public data class KsmultipleItem(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
)

public data class Ksmusicformat(
    public var timeDeltaMs: UInt = 0u,
    public var byteCount: UInt = 0u,
)

public data class KsmNode(
    public var method: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ksnodeproperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsnodepropertyAudio3dListener(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var listenerId: COpaquePointer? = null,
)

public data class KsnodepropertyAudioChannel(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var channel: Int = 0,
    public var reserved: UInt = 0u,
)

public data class KsnodepropertyAudioDevSpecific(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var devSpecificId: UInt = 0u,
    public var deviceInfo: UInt = 0u,
    public var length: UInt = 0u,
)

public data class KsnodepropertyAudioProperty(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var appContext: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class KsnodeCreate(
    public var createFlags: UInt = 0u,
    public var node: UInt = 0u,
)

public data class KspinCinstances(
    public var possibleCount: UInt = 0u,
    public var currentCount: UInt = 0u,
)

public data class KspinConnect(
    public var iface: Ksidentifier = Ksidentifier(),
    public var medium: Ksidentifier = Ksidentifier(),
    public var pinId: UInt = 0u,
    public var pinToHandle: Handle = null,
    public var priority: Kspriority = Kspriority(),
)

public data class KspinMdlCachingNotification(
    public var event: KspinMdlCachingEvent = 0,
    public var buffer: COpaquePointer? = null,
)

public data class KspinMdlCachingNotification32(
    public var event: KspinMdlCachingEvent = 0,
    public var buffer: UInt = 0u,
)

public data class KspinPhysicalconnection(
    public var size: UInt = 0u,
    public var pin: UInt = 0u,
    public var symbolicLinkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspinPhysicalconnection) return false
        if (this.size != other.size) return false
        if (this.pin != other.pin) return false
        if (!this.symbolicLinkName.contentEquals(other.symbolicLinkName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.pin.hashCode()
        result = 31 * result + this.symbolicLinkName.contentHashCode()
        return result
    }
}

public data class Kspriority(
    public var priorityClass: UInt = 0u,
    public var prioritySubClass: UInt = 0u,
)

public data class KspropertyAllocatorControlCaptureCapsS(
    public var interleavedCapSupported: UInt = 0u,
)

public data class KspropertyAllocatorControlCaptureInterleaveS(
    public var interleavedCapPossible: UInt = 0u,
)

public data class KspropertyAllocatorControlSurfaceSizeS(
    public var cx: UInt = 0u,
    public var cy: UInt = 0u,
)

public data class KspropertyBoundsLong(
    public var anonymous1: KspropertyBoundsLong0 = KspropertyBoundsLong0(),
    public var anonymous2: KspropertyBoundsLong1 = KspropertyBoundsLong1(),
)

public data class KspropertyBoundsLong0(
    public var signedMinimum: Int = 0,
    public var signedMaximum: Int = 0,
)

public data class KspropertyBoundsLong1(
    public var unsignedMinimum: UInt = 0u,
    public var unsignedMaximum: UInt = 0u,
)

public data class KspropertyBoundsLonglong(
    public var anonymous1: KspropertyBoundsLonglong0 = KspropertyBoundsLonglong0(),
    public var anonymous2: KspropertyBoundsLonglong1 = KspropertyBoundsLonglong1(),
)

public data class KspropertyBoundsLonglong0(
    public var signedMinimum: Long = 0L,
    public var signedMaximum: Long = 0L,
)

public data class KspropertyBoundsLonglong1(
    public var unsignedMinimum: ULong = 0uL,
    public var unsignedMaximum: ULong = 0uL,
)

public data class KspropertyCameracontrolFlashS(
    public var flash: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyCameracontrolFocalLengthS(
    public var property: Ksidentifier = Ksidentifier(),
    public var lOcularFocalLength: Int = 0,
    public var lObjectiveFocalLengthMin: Int = 0,
    public var lObjectiveFocalLengthMax: Int = 0,
)

public data class KspropertyCameracontrolImagePinCapabilityS(
    public var capabilities: UInt = 0u,
    public var reserved0: UInt = 0u,
)

public data class KspropertyCameracontrolNodeFocalLengthS(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var lOcularFocalLength: Int = 0,
    public var lObjectiveFocalLengthMin: Int = 0,
    public var lObjectiveFocalLengthMax: Int = 0,
)

public data class KspropertyCameracontrolNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyCameracontrolNodeS2(
    public var nodeProperty: KspNode = KspNode(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspropertyCameracontrolRegionOfInterestS(
    public var focusRect: Rect = Rect(),
    public var autoFocusLock: Bool = 0,
    public var autoExposureLock: Bool = 0,
    public var autoWhitebalanceLock: Bool = 0,
    public var anonymous: KspropertyCameracontrolRegionOfInterestS0 = KspropertyCameracontrolRegionOfInterestS0(),
)

public data class KspropertyCameracontrolRegionOfInterestS0(
    public var capabilities: UInt = 0u,
    public var configuration: UInt = 0u,
)

public data class KspropertyCameracontrolS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyCameracontrolS2(
    public var property: Ksidentifier = Ksidentifier(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspropertyCameracontrolSEx(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var focusRect: Rect = Rect(),
)

public data class KspropertyCameracontrolVideostabilizationModeS(
    public var videoStabilizationMode: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyCrossbarActiveS(
    public var property: Ksidentifier = Ksidentifier(),
    public var indexInputPin: UInt = 0u,
    public var active: UInt = 0u,
)

public data class KspropertyCrossbarCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var numberOfInputs: UInt = 0u,
    public var numberOfOutputs: UInt = 0u,
)

public data class KspropertyCrossbarPininfoS(
    public var property: Ksidentifier = Ksidentifier(),
    public var direction: KspinDataflow = 0,
    public var index: UInt = 0u,
    public var pinType: UInt = 0u,
    public var relatedPinIndex: UInt = 0u,
    public var medium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyCrossbarRouteS(
    public var property: Ksidentifier = Ksidentifier(),
    public var indexInputPin: UInt = 0u,
    public var indexOutputPin: UInt = 0u,
    public var canRoute: UInt = 0u,
)

public data class KspropertyDescription(
    public var accessFlags: UInt = 0u,
    public var descriptionSize: UInt = 0u,
    public var propTypeSet: Ksidentifier = Ksidentifier(),
    public var membersListCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KspropertyDroppedframesCurrentS(
    public var property: Ksidentifier = Ksidentifier(),
    public var pictureNumber: Long = 0L,
    public var dropCount: Long = 0L,
    public var averageFrameSize: UInt = 0u,
)

public data class KspropertyExtdeviceS(
    public var property: Ksidentifier = Ksidentifier(),
    public var u: KspropertyExtdeviceS0 = KspropertyExtdeviceS0(),
)

public data class KspropertyExtdeviceS0(
    public var capabilities: Devcaps = Devcaps(),
    public var devPort: UInt = 0u,
    public var powerState: UInt = 0u,
    public var pawchString: UShortArray = UShortArray(260),
    public var nodeUniqueID: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyExtdeviceS0) return false
        if (this.capabilities != other.capabilities) return false
        if (this.devPort != other.devPort) return false
        if (this.powerState != other.powerState) return false
        if (!this.pawchString.contentEquals(other.pawchString)) return false
        if (!this.nodeUniqueID.contentEquals(other.nodeUniqueID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.devPort.hashCode()
        result = 31 * result + this.powerState.hashCode()
        result = 31 * result + this.pawchString.contentHashCode()
        result = 31 * result + this.nodeUniqueID.contentHashCode()
        return result
    }
}

public data class KspropertyExtxportNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var u: KspropertyExtxportNodeS0 = KspropertyExtxportNodeS0(),
)

public data class KspropertyExtxportNodeS0(
    public var capabilities: UInt = 0u,
    public var signalMode: UInt = 0u,
    public var loadMedium: UInt = 0u,
    public var mediumInfo: MediumInfo = MediumInfo(),
    public var xPrtState: TransportState = TransportState(),
    public var timecode: KspropertyExtxportNodeS00 = KspropertyExtxportNodeS00(),
    public var dwTimecode: UInt = 0u,
    public var dwAbsTrackNumber: UInt = 0u,
    public var rawAVC: KspropertyExtxportNodeS01 = KspropertyExtxportNodeS01(),
)

public data class KspropertyExtxportNodeS01(
    public var payloadSize: UInt = 0u,
    public var payload: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyExtxportNodeS01) return false
        if (this.payloadSize != other.payloadSize) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadSize.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }
}

public data class KspropertyExtxportNodeS00(
    public var frame: UByte = 0u,
    public var second: UByte = 0u,
    public var minute: UByte = 0u,
    public var hour: UByte = 0u,
)

public data class KspropertyExtxportS(
    public var property: Ksidentifier = Ksidentifier(),
    public var u: KspropertyExtxportS0 = KspropertyExtxportS0(),
)

public data class KspropertyExtxportS0(
    public var capabilities: UInt = 0u,
    public var signalMode: UInt = 0u,
    public var loadMedium: UInt = 0u,
    public var mediumInfo: MediumInfo = MediumInfo(),
    public var xPrtState: TransportState = TransportState(),
    public var timecode: KspropertyExtxportS00 = KspropertyExtxportS00(),
    public var dwTimecode: UInt = 0u,
    public var dwAbsTrackNumber: UInt = 0u,
    public var rawAVC: KspropertyExtxportS01 = KspropertyExtxportS01(),
)

public data class KspropertyExtxportS01(
    public var payloadSize: UInt = 0u,
    public var payload: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyExtxportS01) return false
        if (this.payloadSize != other.payloadSize) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadSize.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }
}

public data class KspropertyExtxportS00(
    public var frame: UByte = 0u,
    public var second: UByte = 0u,
    public var minute: UByte = 0u,
    public var hour: UByte = 0u,
)

public data class KspropertyMediaavailable(
    public var earliest: Long = 0L,
    public var latest: Long = 0L,
)

public data class KspropertyMembersheader(
    public var membersFlags: UInt = 0u,
    public var membersSize: UInt = 0u,
    public var membersCount: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class KspropertyNetworkcameracontrolEventInfo(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var eventFilter: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyNetworkcameracontrolEventInfo) return false
        if (this.header != other.header) return false
        if (!this.eventFilter.contentEquals(other.eventFilter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.eventFilter.contentHashCode()
        return result
    }
}

public data class KspropertyNetworkcameracontrolMetadataInfo(
    public var metadataItems: UInt = 0u,
    public var size: UInt = 0u,
    public var pTZStatus: Bool = 0,
    public var events: Bool = 0,
    public var analytics: Bool = 0,
    public var reserved: Bool = 0,
)

public data class KspropertyNetworkcameracontrolNtpinfoHeader(
    public var size: UInt = 0u,
    public var type: KspropertyNetworkcameracontrolNtpinfoType = 0,
)

public data class KspropertyPositions(
    public var current: Long = 0L,
    public var stop: Long = 0L,
    public var currentFlags: KsSeekingFlags = 0,
    public var stopFlags: KsSeekingFlags = 0,
)

public data class KspropertySelectorNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertySelectorS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertySerial(
    public var propTypeSet: Ksidentifier = Ksidentifier(),
    public var id: UInt = 0u,
    public var propertyLength: UInt = 0u,
)

public data class KspropertySerialhdr(
    public var propertySet: Guid = Guid(),
    public var count: UInt = 0u,
)

public data class KspropertySphli(
    public var hliss: UShort = 0u,
    public var reserved: UShort = 0u,
    public var startPTM: UInt = 0u,
    public var endPTM: UInt = 0u,
    public var startX: UShort = 0u,
    public var startY: UShort = 0u,
    public var stopX: UShort = 0u,
    public var stopY: UShort = 0u,
    public var colCon: KsColcon = KsColcon(),
)

public data class KspropertySppal(
    public var sppal: List<KsDvdYuv> = List(16) { KsDvdYuv() },
)

public data class KspropertySteppingLong(
    public var steppingDelta: UInt = 0u,
    public var reserved: UInt = 0u,
    public var bounds: KspropertyBoundsLong = KspropertyBoundsLong(),
)

public data class KspropertySteppingLonglong(
    public var steppingDelta: ULong = 0uL,
    public var bounds: KspropertyBoundsLonglong = KspropertyBoundsLonglong(),
)

public data class KspropertyTimecodeNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var timecodeSamp: TimecodeSample = TimecodeSample(),
)

public data class KspropertyTimecodeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var timecodeSamp: TimecodeSample = TimecodeSample(),
)

public data class KspropertyTunerCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var modesSupported: UInt = 0u,
    public var videoMedium: Ksidentifier = Ksidentifier(),
    public var tVAudioMedium: Ksidentifier = Ksidentifier(),
    public var radioAudioMedium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyTunerFrequencyS(
    public var property: Ksidentifier = Ksidentifier(),
    public var frequency: UInt = 0u,
    public var lastFrequency: UInt = 0u,
    public var tuningFlags: UInt = 0u,
    public var videoSubChannel: UInt = 0u,
    public var audioSubChannel: UInt = 0u,
    public var channel: UInt = 0u,
    public var country: UInt = 0u,
)

public data class KspropertyTunerIfMediumS(
    public var property: Ksidentifier = Ksidentifier(),
    public var iFMedium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyTunerInputS(
    public var property: Ksidentifier = Ksidentifier(),
    public var inputIndex: UInt = 0u,
)

public data class KspropertyTunerModeCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var mode: UInt = 0u,
    public var standardsSupported: UInt = 0u,
    public var minFrequency: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var tuningGranularity: UInt = 0u,
    public var numberOfInputs: UInt = 0u,
    public var settlingTime: UInt = 0u,
    public var strategy: UInt = 0u,
)

public data class KspropertyTunerModeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var mode: UInt = 0u,
)

public data class KspropertyTunerNetworktypeScanCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var networkType: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var networkTunerCapabilities: COpaquePointer? = null,
)

public data class KspropertyTunerScanCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var fSupportsHardwareAssistedScanning: Bool = 0,
    public var supportedBroadcastStandards: UInt = 0u,
    public var gUIDBucket: COpaquePointer? = null,
    public var lengthofBucket: UInt = 0u,
)

public data class KspropertyTunerScanStatusS(
    public var property: Ksidentifier = Ksidentifier(),
    public var lockStatus: TunerLockType = 0,
    public var currentFrequency: UInt = 0u,
)

public data class KspropertyTunerStandardModeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var autoDetect: Bool = 0,
)

public data class KspropertyTunerStandardS(
    public var property: Ksidentifier = Ksidentifier(),
    public var standard: UInt = 0u,
)

public data class KspropertyTunerStatusS(
    public var property: Ksidentifier = Ksidentifier(),
    public var currentFrequency: UInt = 0u,
    public var pLLOffset: UInt = 0u,
    public var signalStrength: UInt = 0u,
    public var busy: UInt = 0u,
)

public data class KspropertyTvaudioCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var capabilities: UInt = 0u,
    public var inputMedium: Ksidentifier = Ksidentifier(),
    public var outputMedium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyTvaudioS(
    public var property: Ksidentifier = Ksidentifier(),
    public var mode: UInt = 0u,
)

public data class KspropertyVbicodecfilteringCcSubstreamsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var substreams: VbicodecfilteringCcSubstreams = VbicodecfilteringCcSubstreams(),
)

public data class KspropertyVbicodecfilteringNabtsSubstreamsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var substreams: VbicodecfilteringNabtsSubstreams = VbicodecfilteringNabtsSubstreams(),
)

public data class KspropertyVbicodecfilteringScanlinesS(
    public var property: Ksidentifier = Ksidentifier(),
    public var scanlines: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
)

public data class KspropertyVbicodecfilteringStatisticsCcPinS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCcPin = VbicodecfilteringStatisticsCcPin(),
)

public data class KspropertyVbicodecfilteringStatisticsCcS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCc = VbicodecfilteringStatisticsCc(),
)

public data class KspropertyVbicodecfilteringStatisticsCommonPinS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
)

public data class KspropertyVbicodecfilteringStatisticsCommonS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
)

public data class KspropertyVbicodecfilteringStatisticsNabtsPinS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsNabtsPin = VbicodecfilteringStatisticsNabtsPin(),
)

public data class KspropertyVbicodecfilteringStatisticsNabtsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsNabts = VbicodecfilteringStatisticsNabts(),
)

public data class KspropertyVideocompressionGetinfoS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var defaultKeyFrameRate: Int = 0,
    public var defaultPFrameRate: Int = 0,
    public var defaultQuality: Int = 0,
    public var numberOfQualitySettings: Int = 0,
    public var capabilities: Int = 0,
)

public data class KspropertyVideocompressionS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var value: Int = 0,
)

public data class KspropertyVideocompressionS1(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var value: Int = 0,
    public var flags: UInt = 0u,
)

public data class KspropertyVideocontrolActualFrameRateS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var rangeIndex: UInt = 0u,
    public var dimensions: Size = Size(),
    public var currentActualFrameRate: Long = 0L,
    public var currentMaxAvailableFrameRate: Long = 0L,
)

public data class KspropertyVideocontrolCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var videoControlCaps: UInt = 0u,
)

public data class KspropertyVideocontrolFrameRatesS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var rangeIndex: UInt = 0u,
    public var dimensions: Size = Size(),
)

public data class KspropertyVideocontrolModeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var mode: Int = 0,
)

public data class KspropertyVideodecoderCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var standardsSupported: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var settlingTime: UInt = 0u,
    public var hSyncPerVSync: UInt = 0u,
)

public data class KspropertyVideodecoderS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: UInt = 0u,
)

public data class KspropertyVideodecoderStatus2S(
    public var property: Ksidentifier = Ksidentifier(),
    public var numberOfLines: UInt = 0u,
    public var signalLocked: UInt = 0u,
    public var chromaLock: UInt = 0u,
)

public data class KspropertyVideodecoderStatusS(
    public var property: Ksidentifier = Ksidentifier(),
    public var numberOfLines: UInt = 0u,
    public var signalLocked: UInt = 0u,
)

public data class KspropertyVideoencoderS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyVideoprocampNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyVideoprocampNodeS2(
    public var nodeProperty: KspNode = KspNode(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspropertyVideoprocampS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyVideoprocampS2(
    public var property: Ksidentifier = Ksidentifier(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspNode(
    public var property: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KspPin(
    public var property: Ksidentifier = Ksidentifier(),
    public var pinId: UInt = 0u,
    public var anonymous: KspPin0 = KspPin0(),
)

public data class KspPin0(
    public var reserved: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class KspTimeformat(
    public var property: Ksidentifier = Ksidentifier(),
    public var sourceFormat: Guid = Guid(),
    public var targetFormat: Guid = Guid(),
    public var time: Long = 0L,
)

public data class Ksquality(
    public var context: COpaquePointer? = null,
    public var proportion: UInt = 0u,
    public var deltaTime: Long = 0L,
)

public data class KsqualityManager(
    public var qualityManager: Handle = null,
    public var context: COpaquePointer? = null,
)

public data class Ksquerybuffer(
    public var event: Ksidentifier = Ksidentifier(),
    public var eventData: Kseventdata? = null,
    public var reserved: COpaquePointer? = null,
)

public data class Ksrate(
    public var presentationStart: Long = 0L,
    public var duration: Long = 0L,
    public var iface: Ksidentifier = Ksidentifier(),
    public var rate: Int = 0,
    public var flags: UInt = 0u,
)

public data class KsrateCapability(
    public var property: Ksidentifier = Ksidentifier(),
    public var rate: Ksrate = Ksrate(),
)

public data class Ksrelativeevent(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var anonymous: Ksrelativeevent0 = Ksrelativeevent0(),
    public var reserved: COpaquePointer? = null,
    public var event: Ksidentifier = Ksidentifier(),
    public var eventData: Kseventdata = Kseventdata(),
)
