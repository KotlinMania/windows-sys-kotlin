@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader

public data class AmWmtEventData(public var hrStatus: Hresult = 0, public var pData: COpaquePointer? = null)

public data class DrmCopyOpl(
    public var wMinimumCopyLevel: UShort = 0u,
    public var oplIdIncludes: DrmOplOutputIds = DrmOplOutputIds(),
    public var oplIdExcludes: DrmOplOutputIds = DrmOplOutputIds(),
)

public data class DrmMinimumOutputProtectionLevels(
    public var wCompressedDigitalVideo: UShort = 0u,
    public var wUncompressedDigitalVideo: UShort = 0u,
    public var wAnalogVideo: UShort = 0u,
    public var wCompressedDigitalAudio: UShort = 0u,
    public var wUncompressedDigitalAudio: UShort = 0u,
)

public data class DrmOplOutputIds(public var cIds: UShort = 0u, public var rgIds: Guid? = null)

public data class DrmOutputProtection(public var guidId: Guid = Guid(), public var bConfigData: UByte = 0u)

public data class DrmPlayOpl(
    public var minOPL: DrmMinimumOutputProtectionLevels = DrmMinimumOutputProtectionLevels(),
    public var oplIdReserved: DrmOplOutputIds = DrmOplOutputIds(),
    public var vopi: DrmVideoOutputProtectionIds = DrmVideoOutputProtectionIds(),
)

public data class DrmVal16(public var value: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmVal16) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class DrmVideoOutputProtectionIds(public var cEntries: UShort = 0u, public var rgVop: DrmOutputProtection? = null)

public data class WmdrmImportInitStruct(
    public var dwVersion: UInt = 0u,
    public var cbEncryptedSessionKeyMessage: UInt = 0u,
    public var pbEncryptedSessionKeyMessage: COpaquePointer? = null,
    public var cbEncryptedKeyMessage: UInt = 0u,
    public var pbEncryptedKeyMessage: COpaquePointer? = null,
)

public data class Wmmpeg2videoinfo(
    public var hdr: Wmvideoinfoheader2 = Wmvideoinfoheader2(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var dwProfile: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSequenceHeader: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wmmpeg2videoinfo) return false
        if (this.hdr != other.hdr) return false
        if (this.dwStartTimeCode != other.dwStartTimeCode) return false
        if (this.cbSequenceHeader != other.cbSequenceHeader) return false
        if (this.dwProfile != other.dwProfile) return false
        if (this.dwLevel != other.dwLevel) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwSequenceHeader.contentEquals(other.dwSequenceHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwStartTimeCode.hashCode()
        result = 31 * result + this.cbSequenceHeader.hashCode()
        result = 31 * result + this.dwProfile.hashCode()
        result = 31 * result + this.dwLevel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwSequenceHeader.contentHashCode()
        return result
    }
}

public data class Wmscriptformat(public var scriptType: Guid = Guid())

public data class WmtBufferSegment(
    public var pBuffer: COpaquePointer? = null,
    public var cbOffset: UInt = 0u,
    public var cbLength: UInt = 0u,
)

public data class WmtColorspaceinfoExtensionData(
    public var ucColorPrimaries: UByte = 0u,
    public var ucColorTransferChar: UByte = 0u,
    public var ucColorMatrixCoef: UByte = 0u,
)

public data class WmtFilesinkDataUnit(
    public var packetHeaderBuffer: WmtBufferSegment = WmtBufferSegment(),
    public var cPayloads: UInt = 0u,
    public var pPayloadHeaderBuffers: WmtBufferSegment? = null,
    public var cPayloadDataFragments: UInt = 0u,
    public var pPayloadDataFragments: WmtPayloadFragment? = null,
)

public data class WmtPayloadFragment(public var dwPayloadIndex: UInt = 0u, public var segmentData: WmtBufferSegment = WmtBufferSegment())

public data class WmtTimecodeExtensionData(
    public var wRange: UShort = 0u,
    public var dwTimecode: UInt = 0u,
    public var dwUserbits: UInt = 0u,
    public var dwAmFlags: UInt = 0u,
)

public class WmtVideoimageSample(
    public var dwMagic: UInt = 0u,
    public var cbStruct: UInt = 0u,
    public var dwControlFlags: UInt = 0u,
    public var dwInputFlagsCur: UInt = 0u,
    public var lCurMotionXtoX: Int = 0,
    public var lCurMotionYtoX: Int = 0,
    public var lCurMotionXoffset: Int = 0,
    public var lCurMotionXtoY: Int = 0,
    public var lCurMotionYtoY: Int = 0,
    public var lCurMotionYoffset: Int = 0,
    public var lCurBlendCoef1: Int = 0,
    public var lCurBlendCoef2: Int = 0,
    public var dwInputFlagsPrev: UInt = 0u,
    public var lPrevMotionXtoX: Int = 0,
    public var lPrevMotionYtoX: Int = 0,
    public var lPrevMotionXoffset: Int = 0,
    public var lPrevMotionXtoY: Int = 0,
    public var lPrevMotionYtoY: Int = 0,
    public var lPrevMotionYoffset: Int = 0,
    public var lPrevBlendCoef1: Int = 0,
    public var lPrevBlendCoef2: Int = 0,
)

public class WmtVideoimageSample2(
    public var dwMagic: UInt = 0u,
    public var dwStructSize: UInt = 0u,
    public var dwControlFlags: UInt = 0u,
    public var dwViewportWidth: UInt = 0u,
    public var dwViewportHeight: UInt = 0u,
    public var dwCurrImageWidth: UInt = 0u,
    public var dwCurrImageHeight: UInt = 0u,
    public var fCurrRegionX0: Float = 0.0f,
    public var fCurrRegionY0: Float = 0.0f,
    public var fCurrRegionWidth: Float = 0.0f,
    public var fCurrRegionHeight: Float = 0.0f,
    public var fCurrBlendCoef: Float = 0.0f,
    public var dwPrevImageWidth: UInt = 0u,
    public var dwPrevImageHeight: UInt = 0u,
    public var fPrevRegionX0: Float = 0.0f,
    public var fPrevRegionY0: Float = 0.0f,
    public var fPrevRegionWidth: Float = 0.0f,
    public var fPrevRegionHeight: Float = 0.0f,
    public var fPrevBlendCoef: Float = 0.0f,
    public var dwEffectType: UInt = 0u,
    public var dwNumEffectParas: UInt = 0u,
    public var fEffectPara0: Float = 0.0f,
    public var fEffectPara1: Float = 0.0f,
    public var fEffectPara2: Float = 0.0f,
    public var fEffectPara3: Float = 0.0f,
    public var fEffectPara4: Float = 0.0f,
    public var bKeepPrevImage: Bool = 0,
)

public data class WmtWatermarkEntry(
    public var wmetType: WmtWatermarkEntryType = 0,
    public var clsid: Guid = Guid(),
    public var cbDisplayName: UInt = 0u,
    public var pwszDisplayName: Pwstr = null,
)

public data class WmtWebstreamFormat(
    public var cbSize: UShort = 0u,
    public var cbSampleHeaderFixedData: UShort = 0u,
    public var wVersion: UShort = 0u,
    public var wReserved: UShort = 0u,
)

public data class WmtWebstreamSampleHeader(
    public var cbLength: UShort = 0u,
    public var wPart: UShort = 0u,
    public var cTotalParts: UShort = 0u,
    public var wSampleType: UShort = 0u,
    public var wszURL: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmtWebstreamSampleHeader) return false
        if (this.cbLength != other.cbLength) return false
        if (this.wPart != other.wPart) return false
        if (this.cTotalParts != other.cTotalParts) return false
        if (this.wSampleType != other.wSampleType) return false
        if (!this.wszURL.contentEquals(other.wszURL)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.wPart.hashCode()
        result = 31 * result + this.cTotalParts.hashCode()
        result = 31 * result + this.wSampleType.hashCode()
        result = 31 * result + this.wszURL.contentHashCode()
        return result
    }
}

public data class Wmvideoinfoheader(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var bmiHeader: Bitmapinfoheader = Bitmapinfoheader(),
)

public data class Wmvideoinfoheader2(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var dwInterlaceFlags: UInt = 0u,
    public var dwCopyProtectFlags: UInt = 0u,
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var bmiHeader: Bitmapinfoheader = Bitmapinfoheader(),
)

public data class WmAddressAccessentry(public var dwIPAddress: UInt = 0u, public var dwMask: UInt = 0u)

public data class WmClientProperties(public var dwIPAddress: UInt = 0u, public var dwPort: UInt = 0u)

public data class WmClientPropertiesEx(
    public var cbSize: UInt = 0u,
    public var pwszIPAddress: Pcwstr = null,
    public var pwszPort: Pcwstr = null,
    public var pwszDNSName: Pcwstr = null,
)

public data class WmLeakyBucketPair(public var dwBitrate: UInt = 0u, public var msBufferWindow: UInt = 0u)

public data class WmMediaType(
    public var majortype: Guid = Guid(),
    public var subtype: Guid = Guid(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var lSampleSize: UInt = 0u,
    public var formattype: Guid = Guid(),
    public var pUnk: COpaquePointer? = null,
    public var cbFormat: UInt = 0u,
    public var pbFormat: COpaquePointer? = null,
)

public data class WmPicture(
    public var pwszMIMEType: Pwstr = null,
    public var bPictureType: UByte = 0u,
    public var pwszDescription: Pwstr = null,
    public var dwDataLen: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class WmPortNumberRange(public var wPortBegin: UShort = 0u, public var wPortEnd: UShort = 0u)

public data class WmReaderClientinfo(
    public var cbSize: UInt = 0u,
    public var wszLang: Pwstr = null,
    public var wszBrowserUserAgent: Pwstr = null,
    public var wszBrowserWebPage: Pwstr = null,
    public var qwReserved: ULong = 0uL,
    public var pReserved: Lparam? = null,
    public var wszHostExe: Pwstr = null,
    public var qwHostVersion: ULong = 0uL,
    public var wszPlayerUserAgent: Pwstr = null,
)

public data class WmReaderStatistics(
    public var cbSize: UInt = 0u,
    public var dwBandwidth: UInt = 0u,
    public var cPacketsReceived: UInt = 0u,
    public var cPacketsRecovered: UInt = 0u,
    public var cPacketsLost: UInt = 0u,
    public var wQuality: UShort = 0u,
)

public data class WmStreamPriorityRecord(public var wStreamNumber: UShort = 0u, public var fMandatory: Bool = 0)

public data class WmStreamTypeInfo(public var guidMajorType: Guid = Guid(), public var cbFormat: UInt = 0u)

public data class WmSynchronisedLyrics(
    public var bTimeStampFormat: UByte = 0u,
    public var bContentType: UByte = 0u,
    public var pwszContentDescriptor: Pwstr = null,
    public var dwLyricsLen: UInt = 0u,
    public var pbLyrics: COpaquePointer? = null,
)

public data class WmUserText(public var pwszDescription: Pwstr = null, public var pwszText: Pwstr = null)

public data class WmUserWebUrl(public var pwszDescription: Pwstr = null, public var pwszURL: Pwstr = null)

public data class WmWriterStatistics(
    public var qwSampleCount: ULong = 0uL,
    public var qwByteCount: ULong = 0uL,
    public var qwDroppedSampleCount: ULong = 0uL,
    public var qwDroppedByteCount: ULong = 0uL,
    public var dwCurrentBitrate: UInt = 0u,
    public var dwAverageBitrate: UInt = 0u,
    public var dwExpectedBitrate: UInt = 0u,
    public var dwCurrentSampleRate: UInt = 0u,
    public var dwAverageSampleRate: UInt = 0u,
    public var dwExpectedSampleRate: UInt = 0u,
)

public data class WmWriterStatisticsEx(
    public var dwBitratePlusOverhead: UInt = 0u,
    public var dwCurrentSampleDropRateInQueue: UInt = 0u,
    public var dwCurrentSampleDropRateInCodec: UInt = 0u,
    public var dwCurrentSampleDropRateInMultiplexer: UInt = 0u,
    public var dwTotalSampleDropsInQueue: UInt = 0u,
    public var dwTotalSampleDropsInCodec: UInt = 0u,
    public var dwTotalSampleDropsInMultiplexer: UInt = 0u,
)
