@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.BITMAPINFOHEADER

public data class AM_WMT_EVENT_DATA(public var hrStatus: HRESULT = 0, public var pData: Long = 0L)

public data class DRM_COPY_OPL(
    public var wMinimumCopyLevel: UShort = 0u,
    public var oplIdIncludes: DRM_OPL_OUTPUT_IDS = DRM_OPL_OUTPUT_IDS(),
    public var oplIdExcludes: DRM_OPL_OUTPUT_IDS = DRM_OPL_OUTPUT_IDS(),
)

public data class DRM_MINIMUM_OUTPUT_PROTECTION_LEVELS(
    public var wCompressedDigitalVideo: UShort = 0u,
    public var wUncompressedDigitalVideo: UShort = 0u,
    public var wAnalogVideo: UShort = 0u,
    public var wCompressedDigitalAudio: UShort = 0u,
    public var wUncompressedDigitalAudio: UShort = 0u,
)

public data class DRM_OPL_OUTPUT_IDS(public var cIds: UShort = 0u, public var rgIds: Long = 0L)

public data class DRM_OUTPUT_PROTECTION(public var guidId: GUID = GUID(), public var bConfigData: UByte = 0u)

public data class DRM_PLAY_OPL(
    public var minOPL: DRM_MINIMUM_OUTPUT_PROTECTION_LEVELS = DRM_MINIMUM_OUTPUT_PROTECTION_LEVELS(),
    public var oplIdReserved: DRM_OPL_OUTPUT_IDS = DRM_OPL_OUTPUT_IDS(),
    public var vopi: DRM_VIDEO_OUTPUT_PROTECTION_IDS = DRM_VIDEO_OUTPUT_PROTECTION_IDS(),
)

public data class DRM_VAL16(public var value: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DRM_VAL16) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class DRM_VIDEO_OUTPUT_PROTECTION_IDS(public var cEntries: UShort = 0u, public var rgVop: Long = 0L)

public data class WMDRM_IMPORT_INIT_STRUCT(
    public var dwVersion: UInt = 0u,
    public var cbEncryptedSessionKeyMessage: UInt = 0u,
    public var pbEncryptedSessionKeyMessage: Long = 0L,
    public var cbEncryptedKeyMessage: UInt = 0u,
    public var pbEncryptedKeyMessage: Long = 0L,
)

public data class WMMPEG2VIDEOINFO(
    public var hdr: WMVIDEOINFOHEADER2 = WMVIDEOINFOHEADER2(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var dwProfile: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSequenceHeader: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WMMPEG2VIDEOINFO) return false
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

public data class WMSCRIPTFORMAT(public var scriptType: GUID = GUID())

public data class WMT_BUFFER_SEGMENT(
    public var pBuffer: Long = 0L,
    public var cbOffset: UInt = 0u,
    public var cbLength: UInt = 0u,
)

public data class WMT_COLORSPACEINFO_EXTENSION_DATA(
    public var ucColorPrimaries: UByte = 0u,
    public var ucColorTransferChar: UByte = 0u,
    public var ucColorMatrixCoef: UByte = 0u,
)

public data class WMT_FILESINK_DATA_UNIT(
    public var packetHeaderBuffer: WMT_BUFFER_SEGMENT = WMT_BUFFER_SEGMENT(),
    public var cPayloads: UInt = 0u,
    public var pPayloadHeaderBuffers: Long = 0L,
    public var cPayloadDataFragments: UInt = 0u,
    public var pPayloadDataFragments: Long = 0L,
)

public data class WMT_PAYLOAD_FRAGMENT(public var dwPayloadIndex: UInt = 0u, public var segmentData: WMT_BUFFER_SEGMENT = WMT_BUFFER_SEGMENT())

public data class WMT_TIMECODE_EXTENSION_DATA(
    public var wRange: UShort = 0u,
    public var dwTimecode: UInt = 0u,
    public var dwUserbits: UInt = 0u,
    public var dwAmFlags: UInt = 0u,
)

public class WMT_VIDEOIMAGE_SAMPLE(
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

public class WMT_VIDEOIMAGE_SAMPLE2(
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
    public var bKeepPrevImage: BOOL = 0,
)

public data class WMT_WATERMARK_ENTRY(
    public var wmetType: WMT_WATERMARK_ENTRY_TYPE = 0,
    public var clsid: GUID = GUID(),
    public var cbDisplayName: UInt = 0u,
    public var pwszDisplayName: PWSTR = 0L,
)

public data class WMT_WEBSTREAM_FORMAT(
    public var cbSize: UShort = 0u,
    public var cbSampleHeaderFixedData: UShort = 0u,
    public var wVersion: UShort = 0u,
    public var wReserved: UShort = 0u,
)

public data class WMT_WEBSTREAM_SAMPLE_HEADER(
    public var cbLength: UShort = 0u,
    public var wPart: UShort = 0u,
    public var cTotalParts: UShort = 0u,
    public var wSampleType: UShort = 0u,
    public var wszURL: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WMT_WEBSTREAM_SAMPLE_HEADER) return false
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

public data class WMVIDEOINFOHEADER(
    public var rcSource: RECT = RECT(),
    public var rcTarget: RECT = RECT(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var AvgTimePerFrame: Long = 0L,
    public var bmiHeader: BITMAPINFOHEADER = BITMAPINFOHEADER(),
)

public data class WMVIDEOINFOHEADER2(
    public var rcSource: RECT = RECT(),
    public var rcTarget: RECT = RECT(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var AvgTimePerFrame: Long = 0L,
    public var dwInterlaceFlags: UInt = 0u,
    public var dwCopyProtectFlags: UInt = 0u,
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var bmiHeader: BITMAPINFOHEADER = BITMAPINFOHEADER(),
)

public data class WM_ADDRESS_ACCESSENTRY(public var dwIPAddress: UInt = 0u, public var dwMask: UInt = 0u)

public data class WM_CLIENT_PROPERTIES(public var dwIPAddress: UInt = 0u, public var dwPort: UInt = 0u)

public data class WM_CLIENT_PROPERTIES_EX(
    public var cbSize: UInt = 0u,
    public var pwszIPAddress: PCWSTR = 0L,
    public var pwszPort: PCWSTR = 0L,
    public var pwszDNSName: PCWSTR = 0L,
)

public data class WM_LEAKY_BUCKET_PAIR(public var dwBitrate: UInt = 0u, public var msBufferWindow: UInt = 0u)

public data class WM_MEDIA_TYPE(
    public var majortype: GUID = GUID(),
    public var subtype: GUID = GUID(),
    public var bFixedSizeSamples: BOOL = 0,
    public var bTemporalCompression: BOOL = 0,
    public var lSampleSize: UInt = 0u,
    public var formattype: GUID = GUID(),
    public var pUnk: Long = 0L,
    public var cbFormat: UInt = 0u,
    public var pbFormat: Long = 0L,
)

public data class WM_PICTURE(
    public var pwszMIMEType: PWSTR = 0L,
    public var bPictureType: UByte = 0u,
    public var pwszDescription: PWSTR = 0L,
    public var dwDataLen: UInt = 0u,
    public var pbData: Long = 0L,
)

public data class WM_PORT_NUMBER_RANGE(public var wPortBegin: UShort = 0u, public var wPortEnd: UShort = 0u)

public data class WM_READER_CLIENTINFO(
    public var cbSize: UInt = 0u,
    public var wszLang: PWSTR = 0L,
    public var wszBrowserUserAgent: PWSTR = 0L,
    public var wszBrowserWebPage: PWSTR = 0L,
    public var qwReserved: ULong = 0uL,
    public var pReserved: Long = 0L,
    public var wszHostExe: PWSTR = 0L,
    public var qwHostVersion: ULong = 0uL,
    public var wszPlayerUserAgent: PWSTR = 0L,
)

public data class WM_READER_STATISTICS(
    public var cbSize: UInt = 0u,
    public var dwBandwidth: UInt = 0u,
    public var cPacketsReceived: UInt = 0u,
    public var cPacketsRecovered: UInt = 0u,
    public var cPacketsLost: UInt = 0u,
    public var wQuality: UShort = 0u,
)

public data class WM_STREAM_PRIORITY_RECORD(public var wStreamNumber: UShort = 0u, public var fMandatory: BOOL = 0)

public data class WM_STREAM_TYPE_INFO(public var guidMajorType: GUID = GUID(), public var cbFormat: UInt = 0u)

public data class WM_SYNCHRONISED_LYRICS(
    public var bTimeStampFormat: UByte = 0u,
    public var bContentType: UByte = 0u,
    public var pwszContentDescriptor: PWSTR = 0L,
    public var dwLyricsLen: UInt = 0u,
    public var pbLyrics: Long = 0L,
)

public data class WM_USER_TEXT(public var pwszDescription: PWSTR = 0L, public var pwszText: PWSTR = 0L)

public data class WM_USER_WEB_URL(public var pwszDescription: PWSTR = 0L, public var pwszURL: PWSTR = 0L)

public data class WM_WRITER_STATISTICS(
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

public data class WM_WRITER_STATISTICS_EX(
    public var dwBitratePlusOverhead: UInt = 0u,
    public var dwCurrentSampleDropRateInQueue: UInt = 0u,
    public var dwCurrentSampleDropRateInCodec: UInt = 0u,
    public var dwCurrentSampleDropRateInMultiplexer: UInt = 0u,
    public var dwTotalSampleDropsInQueue: UInt = 0u,
    public var dwTotalSampleDropsInCodec: UInt = 0u,
    public var dwTotalSampleDropsInMultiplexer: UInt = 0u,
)
