@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.BITMAPINFOHEADER
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.media.HTASK
import io.github.kotlinmania.windowssys.windows.win32.media.LPTIMECALLBACK
import io.github.kotlinmania.windowssys.windows.win32.media.audio.HMIXER
import io.github.kotlinmania.windowssys.windows.win32.media.audio.HWAVE
import io.github.kotlinmania.windowssys.windows.win32.media.audio.WAVEFORMATEX

public data class ADPCMCOEFSET(public var iCoef1: Short = 0, public var iCoef2: Short = 0)

public data class ADPCMEWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class ADPCMWAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var wSamplesPerBlock: UShort = 0u,
    public var wNumCoef: UShort = 0u,
    public var aCoef: List<ADPCMCOEFSET> = List(1) { ADPCMCOEFSET() },
)

public data class APTXWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class AUDIOFILE_AF10WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class AUDIOFILE_AF36WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class AVICOMPRESSOPTIONS(
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwKeyFrameEvery: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var dwBytesPerSecond: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpFormat: Long = 0L,
    public var cbFormat: UInt = 0u,
    public var lpParms: Long = 0L,
    public var cbParms: UInt = 0u,
    public var dwInterleaveEvery: UInt = 0u,
)

public data class AVIFILEINFOA(
    public var dwMaxBytesPerSec: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var dwStreams: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwEditCount: UInt = 0u,
    public var szFileType: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AVIFILEINFOA) return false
        if (this.dwMaxBytesPerSec != other.dwMaxBytesPerSec) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCaps != other.dwCaps) return false
        if (this.dwStreams != other.dwStreams) return false
        if (this.dwSuggestedBufferSize != other.dwSuggestedBufferSize) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwScale != other.dwScale) return false
        if (this.dwRate != other.dwRate) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwEditCount != other.dwEditCount) return false
        if (!this.szFileType.contentEquals(other.szFileType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMaxBytesPerSec.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwCaps.hashCode()
        result = 31 * result + this.dwStreams.hashCode()
        result = 31 * result + this.dwSuggestedBufferSize.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwScale.hashCode()
        result = 31 * result + this.dwRate.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.dwEditCount.hashCode()
        result = 31 * result + this.szFileType.contentHashCode()
        return result
    }
}

public data class AVIFILEINFOW(
    public var dwMaxBytesPerSec: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var dwStreams: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwEditCount: UInt = 0u,
    public var szFileType: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AVIFILEINFOW) return false
        if (this.dwMaxBytesPerSec != other.dwMaxBytesPerSec) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCaps != other.dwCaps) return false
        if (this.dwStreams != other.dwStreams) return false
        if (this.dwSuggestedBufferSize != other.dwSuggestedBufferSize) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwScale != other.dwScale) return false
        if (this.dwRate != other.dwRate) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwEditCount != other.dwEditCount) return false
        if (!this.szFileType.contentEquals(other.szFileType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMaxBytesPerSec.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwCaps.hashCode()
        result = 31 * result + this.dwStreams.hashCode()
        result = 31 * result + this.dwSuggestedBufferSize.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwScale.hashCode()
        result = 31 * result + this.dwRate.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.dwEditCount.hashCode()
        result = 31 * result + this.szFileType.contentHashCode()
        return result
    }
}

public class AVISTREAMINFOA(
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var wPriority: UShort = 0u,
    public var wLanguage: UShort = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwStart: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwInitialFrames: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var dwSampleSize: UInt = 0u,
    public var rcFrame: RECT = RECT(),
    public var dwEditCount: UInt = 0u,
    public var dwFormatChangeCount: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
)

public class AVISTREAMINFOW(
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var wPriority: UShort = 0u,
    public var wLanguage: UShort = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwStart: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwInitialFrames: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var dwSampleSize: UInt = 0u,
    public var rcFrame: RECT = RECT(),
    public var dwEditCount: UInt = 0u,
    public var dwFormatChangeCount: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
)

public data class CAPDRIVERCAPS(
    public var wDeviceIndex: UInt = 0u,
    public var fHasOverlay: BOOL = 0,
    public var fHasDlgVideoSource: BOOL = 0,
    public var fHasDlgVideoFormat: BOOL = 0,
    public var fHasDlgVideoDisplay: BOOL = 0,
    public var fCaptureInitialized: BOOL = 0,
    public var fDriverSuppliesPalettes: BOOL = 0,
    public var hVideoIn: HANDLE = 0L,
    public var hVideoOut: HANDLE = 0L,
    public var hVideoExtIn: HANDLE = 0L,
    public var hVideoExtOut: HANDLE = 0L,
)

public data class CAPINFOCHUNK(
    public var fccInfoID: UInt = 0u,
    public var lpData: Long = 0L,
    public var cbData: Int = 0,
)

public class CAPSTATUS(
    public var uiImageWidth: UInt = 0u,
    public var uiImageHeight: UInt = 0u,
    public var fLiveWindow: BOOL = 0,
    public var fOverlayWindow: BOOL = 0,
    public var fScale: BOOL = 0,
    public var ptScroll: POINT = POINT(),
    public var fUsingDefaultPalette: BOOL = 0,
    public var fAudioHardware: BOOL = 0,
    public var fCapFileExists: BOOL = 0,
    public var dwCurrentVideoFrame: UInt = 0u,
    public var dwCurrentVideoFramesDropped: UInt = 0u,
    public var dwCurrentWaveSamples: UInt = 0u,
    public var dwCurrentTimeElapsedMS: UInt = 0u,
    public var hPalCurrent: HPALETTE = 0L,
    public var fCapturingNow: BOOL = 0,
    public var dwReturn: UInt = 0u,
    public var wNumVideoAllocated: UInt = 0u,
    public var wNumAudioAllocated: UInt = 0u,
)

public class CAPTUREPARMS(
    public var dwRequestMicroSecPerFrame: UInt = 0u,
    public var fMakeUserHitOKToCapture: BOOL = 0,
    public var wPercentDropForError: UInt = 0u,
    public var fYield: BOOL = 0,
    public var dwIndexSize: UInt = 0u,
    public var wChunkGranularity: UInt = 0u,
    public var fUsingDOSMemory: BOOL = 0,
    public var wNumVideoRequested: UInt = 0u,
    public var fCaptureAudio: BOOL = 0,
    public var wNumAudioRequested: UInt = 0u,
    public var vKeyAbort: UInt = 0u,
    public var fAbortLeftMouse: BOOL = 0,
    public var fAbortRightMouse: BOOL = 0,
    public var fLimitEnabled: BOOL = 0,
    public var wTimeLimit: UInt = 0u,
    public var fMCIControl: BOOL = 0,
    public var fStepMCIDevice: BOOL = 0,
    public var dwMCIStartTime: UInt = 0u,
    public var dwMCIStopTime: UInt = 0u,
    public var fStepCaptureAt2x: BOOL = 0,
    public var wStepCaptureAverageFrames: UInt = 0u,
    public var dwAudioBufferSize: UInt = 0u,
    public var fDisableWriteCache: BOOL = 0,
    public var AVStreamMaster: UInt = 0u,
)

public data class CHANNEL_CAPS(
    public var dwFlags: UInt = 0u,
    public var dwSrcRectXMod: UInt = 0u,
    public var dwSrcRectYMod: UInt = 0u,
    public var dwSrcRectWidthMod: UInt = 0u,
    public var dwSrcRectHeightMod: UInt = 0u,
    public var dwDstRectXMod: UInt = 0u,
    public var dwDstRectYMod: UInt = 0u,
    public var dwDstRectWidthMod: UInt = 0u,
    public var dwDstRectHeightMod: UInt = 0u,
)

public data class COMPVARS(
    public var cbSize: Int = 0,
    public var dwFlags: UInt = 0u,
    public var hic: HIC = 0L,
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var lpbiIn: Long = 0L,
    public var lpbiOut: Long = 0L,
    public var lpBitsOut: Long = 0L,
    public var lpBitsPrev: Long = 0L,
    public var lFrame: Int = 0,
    public var lKey: Int = 0,
    public var lDataRate: Int = 0,
    public var lQ: Int = 0,
    public var lKeyCount: Int = 0,
    public var lpState: Long = 0L,
    public var cbState: Int = 0,
)

public data class CONTRESCR10WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class CONTRESVQLPCWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class CREATIVEADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wRevision: UShort = 0u)

public data class CREATIVEFASTSPEECH10WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wRevision: UShort = 0u)

public data class CREATIVEFASTSPEECH8WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wRevision: UShort = 0u)

public data class CSIMAADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class DIALOGICOKIADPCMWAVEFORMAT(public var ewf: WAVEFORMATEX = WAVEFORMATEX())

public data class DIGIADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class DIGIFIXWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class DIGIREALWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class DIGISTDWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class DOLBYAC2WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var nAuxBitsCode: UShort = 0u)

public data class DRAWDIBTIME(
    public var timeCount: Int = 0,
    public var timeDraw: Int = 0,
    public var timeDecompress: Int = 0,
    public var timeDither: Int = 0,
    public var timeStretch: Int = 0,
    public var timeBlt: Int = 0,
    public var timeSetDIBits: Int = 0,
)

public data class DRMWAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var wReserved: UShort = 0u,
    public var ulContentId: UInt = 0u,
    public var wfxSecure: WAVEFORMATEX = WAVEFORMATEX(),
)

public data class DRVCONFIGINFO(
    public var dwDCISize: UInt = 0u,
    public var lpszDCISectionName: PCWSTR = 0L,
    public var lpszDCIAliasName: PCWSTR = 0L,
)

public data class DRVCONFIGINFOEX(
    public var dwDCISize: UInt = 0u,
    public var lpszDCISectionName: PCWSTR = 0L,
    public var lpszDCIAliasName: PCWSTR = 0L,
    public var dnDevNode: UInt = 0u,
)

public data class DRVM_IOCTL_DATA(public var dwSize: UInt = 0u, public var dwCmd: UInt = 0u)

public data class DVIADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class ECHOSC1WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class EXBMINFOHEADER(public var bmi: BITMAPINFOHEADER = BITMAPINFOHEADER(), public var biExtDataOffset: UInt = 0u)

public data class FMTOWNS_SND_WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wRevision: UShort = 0u)

public data class G721_ADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var nAuxBlockSize: UShort = 0u)

public data class G723_ADPCMWAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var cbExtraSize: UShort = 0u,
    public var nAuxBlockSize: UShort = 0u,
)

public data class GSM610WAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class ICCOMPRESS(
    public var dwFlags: UInt = 0u,
    public var lpbiOutput: Long = 0L,
    public var lpOutput: Long = 0L,
    public var lpbiInput: Long = 0L,
    public var lpInput: Long = 0L,
    public var lpckid: Long = 0L,
    public var lpdwFlags: Long = 0L,
    public var lFrameNum: Int = 0,
    public var dwFrameSize: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var lpbiPrev: Long = 0L,
    public var lpPrev: Long = 0L,
)

public data class ICCOMPRESSFRAMES(
    public var dwFlags: UInt = 0u,
    public var lpbiOutput: Long = 0L,
    public var lOutput: LPARAM = 0L,
    public var lpbiInput: Long = 0L,
    public var lInput: LPARAM = 0L,
    public var lStartFrame: Int = 0,
    public var lFrameCount: Int = 0,
    public var lQuality: Int = 0,
    public var lDataRate: Int = 0,
    public var lKeyRate: Int = 0,
    public var dwRate: UInt = 0u,
    public var dwScale: UInt = 0u,
    public var dwOverheadPerFrame: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var GetData: Long = 0L,
    public var PutData: Long = 0L,
)

public data class ICDECOMPRESS(
    public var dwFlags: UInt = 0u,
    public var lpbiInput: Long = 0L,
    public var lpInput: Long = 0L,
    public var lpbiOutput: Long = 0L,
    public var lpOutput: Long = 0L,
    public var ckid: UInt = 0u,
)

public data class ICDECOMPRESSEX(
    public var dwFlags: UInt = 0u,
    public var lpbiSrc: Long = 0L,
    public var lpSrc: Long = 0L,
    public var lpbiDst: Long = 0L,
    public var lpDst: Long = 0L,
    public var xDst: Int = 0,
    public var yDst: Int = 0,
    public var dxDst: Int = 0,
    public var dyDst: Int = 0,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var dxSrc: Int = 0,
    public var dySrc: Int = 0,
)

public data class ICDRAW(
    public var dwFlags: UInt = 0u,
    public var lpFormat: Long = 0L,
    public var lpData: Long = 0L,
    public var cbData: UInt = 0u,
    public var lTime: Int = 0,
)

public data class ICDRAWBEGIN(
    public var dwFlags: UInt = 0u,
    public var hpal: HPALETTE = 0L,
    public var hwnd: HWND = 0L,
    public var hdc: HDC = 0L,
    public var xDst: Int = 0,
    public var yDst: Int = 0,
    public var dxDst: Int = 0,
    public var dyDst: Int = 0,
    public var lpbi: Long = 0L,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var dxSrc: Int = 0,
    public var dySrc: Int = 0,
    public var dwRate: UInt = 0u,
    public var dwScale: UInt = 0u,
)

public data class ICDRAWSUGGEST(
    public var lpbiIn: Long = 0L,
    public var lpbiSuggest: Long = 0L,
    public var dxSrc: Int = 0,
    public var dySrc: Int = 0,
    public var dxDst: Int = 0,
    public var dyDst: Int = 0,
    public var hicDecompressor: HIC = 0L,
)

public data class ICINFO(
    public var dwSize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwVersionICM: UInt = 0u,
    public var szName: UShortArray = UShortArray(16),
    public var szDescription: UShortArray = UShortArray(128),
    public var szDriver: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ICINFO) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fccType != other.fccType) return false
        if (this.fccHandler != other.fccHandler) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwVersionICM != other.dwVersionICM) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szDriver.contentEquals(other.szDriver)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccHandler.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwVersionICM.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szDriver.contentHashCode()
        return result
    }
}

public data class ICOPEN(
    public var dwSize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwError: LRESULT = 0L,
    public var pV1Reserved: Long = 0L,
    public var pV2Reserved: Long = 0L,
    public var dnDevNode: UInt = 0u,
)

public data class ICPALETTE(
    public var dwFlags: UInt = 0u,
    public var iStart: Int = 0,
    public var iLen: Int = 0,
    public var lppe: Long = 0L,
)

public data class ICSETSTATUSPROC(
    public var dwFlags: UInt = 0u,
    public var lParam: LPARAM = 0L,
    public var Status: Long = 0L,
)

public data class IMAADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public class JOYCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: ByteArray = ByteArray(32),
    public var szOEMVxD: ByteArray = ByteArray(260),
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
)

public class JOYCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: UShortArray = UShortArray(32),
    public var szOEMVxD: UShortArray = UShortArray(260),
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
)

public class JOYCAPSA(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: ByteArray = ByteArray(32),
    public var szOEMVxD: ByteArray = ByteArray(260),
)

public class JOYCAPSW(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: UShortArray = UShortArray(32),
    public var szOEMVxD: UShortArray = UShortArray(260),
)

public data class JOYINFO(
    public var wXpos: UInt = 0u,
    public var wYpos: UInt = 0u,
    public var wZpos: UInt = 0u,
    public var wButtons: UInt = 0u,
)

public data class JOYINFOEX(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwXpos: UInt = 0u,
    public var dwYpos: UInt = 0u,
    public var dwZpos: UInt = 0u,
    public var dwRpos: UInt = 0u,
    public var dwUpos: UInt = 0u,
    public var dwVpos: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwButtonNumber: UInt = 0u,
    public var dwPOV: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class JPEGINFOHEADER(
    public var JPEGSize: UInt = 0u,
    public var JPEGProcess: UInt = 0u,
    public var JPEGColorSpaceID: UInt = 0u,
    public var JPEGBitsPerSample: UInt = 0u,
    public var JPEGHSubSampling: UInt = 0u,
    public var JPEGVSubSampling: UInt = 0u,
)

public data class MCI_ANIM_OPEN_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCSTR = 0L,
    public var lpstrElementName: PCSTR = 0L,
    public var lpstrAlias: PCSTR = 0L,
    public var dwStyle: UInt = 0u,
    public var hWndParent: HWND = 0L,
)

public data class MCI_ANIM_OPEN_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCWSTR = 0L,
    public var lpstrElementName: PCWSTR = 0L,
    public var lpstrAlias: PCWSTR = 0L,
    public var dwStyle: UInt = 0u,
    public var hWndParent: HWND = 0L,
)

public data class MCI_ANIM_PLAY_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var dwSpeed: UInt = 0u,
)

public data class MCI_ANIM_RECT_PARMS(public var dwCallback: ULong = 0uL, public var rc: RECT = RECT())

public data class MCI_ANIM_STEP_PARMS(public var dwCallback: ULong = 0uL, public var dwFrames: UInt = 0u)

public data class MCI_ANIM_UPDATE_PARMS(
    public var dwCallback: ULong = 0uL,
    public var rc: RECT = RECT(),
    public var hDC: HDC = 0L,
)

public data class MCI_ANIM_WINDOW_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var hWnd: HWND = 0L,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: PCSTR = 0L,
)

public data class MCI_ANIM_WINDOW_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var hWnd: HWND = 0L,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: PCWSTR = 0L,
)

public data class MCI_BREAK_PARMS(
    public var dwCallback: ULong = 0uL,
    public var nVirtKey: Int = 0,
    public var hwndBreak: HWND = 0L,
)

public data class MCI_DGV_CAPTURE_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrFileName: PSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_DGV_CAPTURE_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrFileName: PWSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_DGV_COPY_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: RECT = RECT(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MCI_DGV_CUE_PARMS(public var dwCallback: ULong = 0uL, public var dwTo: UInt = 0u)

public data class MCI_DGV_CUT_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: RECT = RECT(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MCI_DGV_DELETE_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: RECT = RECT(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MCI_DGV_INFO_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PSTR = 0L,
    public var dwRetSize: UInt = 0u,
    public var dwItem: UInt = 0u,
)

public data class MCI_DGV_INFO_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PWSTR = 0L,
    public var dwRetSize: UInt = 0u,
    public var dwItem: UInt = 0u,
)

public data class MCI_DGV_LIST_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PSTR = 0L,
    public var dwLength: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var dwItem: UInt = 0u,
    public var lpstrAlgorithm: PSTR = 0L,
)

public data class MCI_DGV_LIST_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PWSTR = 0L,
    public var dwLength: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var dwItem: UInt = 0u,
    public var lpstrAlgorithm: PWSTR = 0L,
)

public data class MCI_DGV_MONITOR_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwSource: UInt = 0u,
    public var dwMethod: UInt = 0u,
)

public data class MCI_DGV_OPEN_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PSTR = 0L,
    public var lpstrElementName: PSTR = 0L,
    public var lpstrAlias: PSTR = 0L,
    public var dwStyle: UInt = 0u,
    public var hWndParent: HWND = 0L,
)

public data class MCI_DGV_OPEN_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PWSTR = 0L,
    public var lpstrElementName: PWSTR = 0L,
    public var lpstrAlias: PWSTR = 0L,
    public var dwStyle: UInt = 0u,
    public var hWndParent: HWND = 0L,
)

public data class MCI_DGV_PASTE_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwTo: UInt = 0u,
    public var rc: RECT = RECT(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MCI_DGV_QUALITY_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var lpstrName: PSTR = 0L,
    public var lpstrAlgorithm: UInt = 0u,
    public var dwHandle: UInt = 0u,
)

public data class MCI_DGV_QUALITY_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var lpstrName: PWSTR = 0L,
    public var lpstrAlgorithm: UInt = 0u,
    public var dwHandle: UInt = 0u,
)

public data class MCI_DGV_RECORD_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: RECT = RECT(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MCI_DGV_RECT_PARMS(public var dwCallback: ULong = 0uL, public var rc: RECT = RECT())

public data class MCI_DGV_RESERVE_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrPath: PSTR = 0L,
    public var dwSize: UInt = 0u,
)

public data class MCI_DGV_RESERVE_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrPath: PWSTR = 0L,
    public var dwSize: UInt = 0u,
)

public data class MCI_DGV_RESTORE_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrFileName: PSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_DGV_RESTORE_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrFileName: PWSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_DGV_SAVE_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrFileName: PSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_DGV_SAVE_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrFileName: PWSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_DGV_SETAUDIO_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: PSTR = 0L,
    public var lpstrQuality: PSTR = 0L,
)

public data class MCI_DGV_SETAUDIO_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: PWSTR = 0L,
    public var lpstrQuality: PWSTR = 0L,
)

public data class MCI_DGV_SETVIDEO_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: PSTR = 0L,
    public var lpstrQuality: PSTR = 0L,
    public var dwSourceNumber: UInt = 0u,
)

public data class MCI_DGV_SETVIDEO_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: PWSTR = 0L,
    public var lpstrQuality: PWSTR = 0L,
    public var dwSourceNumber: UInt = 0u,
)

public data class MCI_DGV_SET_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var dwFileFormat: UInt = 0u,
    public var dwSpeed: UInt = 0u,
)

public data class MCI_DGV_SIGNAL_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwPosition: UInt = 0u,
    public var dwPeriod: UInt = 0u,
    public var dwUserParm: UInt = 0u,
)

public data class MCI_DGV_STATUS_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var dwReturn: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
    public var lpstrDrive: PSTR = 0L,
    public var dwReference: UInt = 0u,
)

public data class MCI_DGV_STATUS_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var dwReturn: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
    public var lpstrDrive: PWSTR = 0L,
    public var dwReference: UInt = 0u,
)

public data class MCI_DGV_STEP_PARMS(public var dwCallback: ULong = 0uL, public var dwFrames: UInt = 0u)

public data class MCI_DGV_UPDATE_PARMS(
    public var dwCallback: ULong = 0uL,
    public var rc: RECT = RECT(),
    public var hDC: HDC = 0L,
)

public data class MCI_DGV_WINDOW_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var hWnd: HWND = 0L,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: PSTR = 0L,
)

public data class MCI_DGV_WINDOW_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var hWnd: HWND = 0L,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: PWSTR = 0L,
)

public data class MCI_GENERIC_PARMS(public var dwCallback: ULong = 0uL)

public data class MCI_GETDEVCAPS_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwReturn: UInt = 0u,
    public var dwItem: UInt = 0u,
)

public data class MCI_INFO_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PSTR = 0L,
    public var dwRetSize: UInt = 0u,
)

public data class MCI_INFO_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PWSTR = 0L,
    public var dwRetSize: UInt = 0u,
)

public data class MCI_LOAD_PARMSA(public var dwCallback: ULong = 0uL, public var lpfilename: PCSTR = 0L)

public data class MCI_LOAD_PARMSW(public var dwCallback: ULong = 0uL, public var lpfilename: PCWSTR = 0L)

public data class MCI_OPEN_DRIVER_PARMS(
    public var wDeviceID: UInt = 0u,
    public var lpstrParams: PCWSTR = 0L,
    public var wCustomCommandTable: UInt = 0u,
    public var wType: UInt = 0u,
)

public data class MCI_OPEN_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCSTR = 0L,
    public var lpstrElementName: PCSTR = 0L,
    public var lpstrAlias: PCSTR = 0L,
)

public data class MCI_OPEN_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCWSTR = 0L,
    public var lpstrElementName: PCWSTR = 0L,
    public var lpstrAlias: PCWSTR = 0L,
)

public data class MCI_OVLY_LOAD_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpfilename: PCSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_OVLY_LOAD_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpfilename: PCWSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_OVLY_OPEN_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCSTR = 0L,
    public var lpstrElementName: PCSTR = 0L,
    public var lpstrAlias: PCSTR = 0L,
    public var dwStyle: UInt = 0u,
    public var hWndParent: HWND = 0L,
)

public data class MCI_OVLY_OPEN_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCWSTR = 0L,
    public var lpstrElementName: PCWSTR = 0L,
    public var lpstrAlias: PCWSTR = 0L,
    public var dwStyle: UInt = 0u,
    public var hWndParent: HWND = 0L,
)

public data class MCI_OVLY_RECT_PARMS(public var dwCallback: ULong = 0uL, public var rc: RECT = RECT())

public data class MCI_OVLY_SAVE_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpfilename: PCSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_OVLY_SAVE_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpfilename: PCWSTR = 0L,
    public var rc: RECT = RECT(),
)

public data class MCI_OVLY_WINDOW_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var hWnd: HWND = 0L,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: PCSTR = 0L,
)

public data class MCI_OVLY_WINDOW_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var hWnd: HWND = 0L,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: PCWSTR = 0L,
)

public data class MCI_PLAY_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
)

public data class MCI_RECORD_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
)

public data class MCI_SAVE_PARMSA(public var dwCallback: ULong = 0uL, public var lpfilename: PCSTR = 0L)

public data class MCI_SAVE_PARMSW(public var dwCallback: ULong = 0uL, public var lpfilename: PCWSTR = 0L)

public data class MCI_SEEK_PARMS(public var dwCallback: ULong = 0uL, public var dwTo: UInt = 0u)

public data class MCI_SEQ_SET_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var dwTempo: UInt = 0u,
    public var dwPort: UInt = 0u,
    public var dwSlave: UInt = 0u,
    public var dwMaster: UInt = 0u,
    public var dwOffset: UInt = 0u,
)

public data class MCI_SET_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
)

public data class MCI_STATUS_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwReturn: ULong = 0uL,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
)

public data class MCI_SYSINFO_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PSTR = 0L,
    public var dwRetSize: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var wDeviceType: UInt = 0u,
)

public data class MCI_SYSINFO_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var lpstrReturn: PWSTR = 0L,
    public var dwRetSize: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var wDeviceType: UInt = 0u,
)

public data class MCI_VD_ESCAPE_PARMSA(public var dwCallback: ULong = 0uL, public var lpstrCommand: PCSTR = 0L)

public data class MCI_VD_ESCAPE_PARMSW(public var dwCallback: ULong = 0uL, public var lpstrCommand: PCWSTR = 0L)

public data class MCI_VD_PLAY_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var dwSpeed: UInt = 0u,
)

public data class MCI_VD_STEP_PARMS(public var dwCallback: ULong = 0uL, public var dwFrames: UInt = 0u)

public data class MCI_WAVE_DELETE_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
)

public data class MCI_WAVE_OPEN_PARMSA(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCSTR = 0L,
    public var lpstrElementName: PCSTR = 0L,
    public var lpstrAlias: PCSTR = 0L,
    public var dwBufferSeconds: UInt = 0u,
)

public data class MCI_WAVE_OPEN_PARMSW(
    public var dwCallback: ULong = 0uL,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: PCWSTR = 0L,
    public var lpstrElementName: PCWSTR = 0L,
    public var lpstrAlias: PCWSTR = 0L,
    public var dwBufferSeconds: UInt = 0u,
)

public data class MCI_WAVE_SET_PARMS(
    public var dwCallback: ULong = 0uL,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var wInput: UInt = 0u,
    public var wOutput: UInt = 0u,
    public var wFormatTag: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
    public var wReserved4: UShort = 0u,
    public var wBitsPerSample: UShort = 0u,
    public var wReserved5: UShort = 0u,
)

public data class MEDIASPACEADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wRevision: UShort = 0u)

public data class MIDIOPENSTRMID(public var dwStreamID: UInt = 0u, public var uDeviceID: UInt = 0u)

public data class MIXEROPENDESC(
    public var hmx: HMIXER = 0L,
    public var pReserved0: Long = 0L,
    public var dwCallback: ULong = 0uL,
    public var dwInstance: ULong = 0uL,
    public var dnDevNode: ULong = 0uL,
)

public data class MMCKINFO(
    public var ckid: UInt = 0u,
    public var cksize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var dwDataOffset: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class MMIOINFO(
    public var dwFlags: UInt = 0u,
    public var fccIOProc: UInt = 0u,
    public var pIOProc: LPMMIOPROC = null,
    public var wErrorRet: UInt = 0u,
    public var htask: HTASK = 0L,
    public var cchBuffer: Int = 0,
    public var pchBuffer: Long = 0L,
    public var pchNext: Long = 0L,
    public var pchEndRead: Long = 0L,
    public var pchEndWrite: Long = 0L,
    public var lBufOffset: Int = 0,
    public var lDiskOffset: Int = 0,
    public var adwInfo: UIntArray = UIntArray(3),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var hmmio: HMMIO = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MMIOINFO) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.fccIOProc != other.fccIOProc) return false
        if (this.pIOProc != other.pIOProc) return false
        if (this.wErrorRet != other.wErrorRet) return false
        if (this.htask != other.htask) return false
        if (this.cchBuffer != other.cchBuffer) return false
        if (this.pchBuffer != other.pchBuffer) return false
        if (this.pchNext != other.pchNext) return false
        if (this.pchEndRead != other.pchEndRead) return false
        if (this.pchEndWrite != other.pchEndWrite) return false
        if (this.lBufOffset != other.lBufOffset) return false
        if (this.lDiskOffset != other.lDiskOffset) return false
        if (!this.adwInfo.contentEquals(other.adwInfo)) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        if (this.hmmio != other.hmmio) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.fccIOProc.hashCode()
        result = 31 * result + this.pIOProc.hashCode()
        result = 31 * result + this.wErrorRet.hashCode()
        result = 31 * result + this.htask.hashCode()
        result = 31 * result + this.cchBuffer.hashCode()
        result = 31 * result + this.pchBuffer.hashCode()
        result = 31 * result + this.pchNext.hashCode()
        result = 31 * result + this.pchEndRead.hashCode()
        result = 31 * result + this.pchEndWrite.hashCode()
        result = 31 * result + this.lBufOffset.hashCode()
        result = 31 * result + this.lDiskOffset.hashCode()
        result = 31 * result + this.adwInfo.contentHashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        result = 31 * result + this.hmmio.hashCode()
        return result
    }
}

public data class MSAUDIO1WAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var wSamplesPerBlock: UShort = 0u,
    public var wEncodeOptions: UShort = 0u,
)

public data class NMS_VBXADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wSamplesPerBlock: UShort = 0u)

public data class OLIADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class OLICELPWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class OLIGSMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class OLIOPRWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class OLISBCWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class SIERRAADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wRevision: UShort = 0u)

public data class SONARCWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX(), public var wCompType: UShort = 0u)

public data class TIMEREVENT(
    public var wDelay: UShort = 0u,
    public var wResolution: UShort = 0u,
    public var lpFunction: LPTIMECALLBACK = null,
    public var dwUser: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var wReserved1: UShort = 0u,
)

public data class TRUESPEECHWAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var wRevision: UShort = 0u,
    public var nSamplesPerBlock: UShort = 0u,
    public var abReserved: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TRUESPEECHWAVEFORMAT) return false
        if (this.wfx != other.wfx) return false
        if (this.wRevision != other.wRevision) return false
        if (this.nSamplesPerBlock != other.nSamplesPerBlock) return false
        if (!this.abReserved.contentEquals(other.abReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wfx.hashCode()
        result = 31 * result + this.wRevision.hashCode()
        result = 31 * result + this.nSamplesPerBlock.hashCode()
        result = 31 * result + this.abReserved.contentHashCode()
        return result
    }
}

public data class VIDEOHDR(
    public var lpData: Long = 0L,
    public var dwBufferLength: UInt = 0u,
    public var dwBytesUsed: UInt = 0u,
    public var dwTimeCaptured: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var dwReserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEOHDR) return false
        if (this.lpData != other.lpData) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        if (this.dwBytesUsed != other.dwBytesUsed) return false
        if (this.dwTimeCaptured != other.dwTimeCaptured) return false
        if (this.dwUser != other.dwUser) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpData.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        result = 31 * result + this.dwBytesUsed.hashCode()
        result = 31 * result + this.dwTimeCaptured.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class WAVEOPENDESC(
    public var hWave: HWAVE = 0L,
    public var lpFormat: Long = 0L,
    public var dwCallback: ULong = 0uL,
    public var dwInstance: ULong = 0uL,
    public var uMappedDeviceID: UInt = 0u,
    public var dnDevNode: ULong = 0uL,
)

public data class WMAUDIO2WAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var dwSamplesPerBlock: UInt = 0u,
    public var wEncodeOptions: UShort = 0u,
    public var dwSuperBlockAlign: UInt = 0u,
)

public data class WMAUDIO3WAVEFORMAT(
    public var wfx: WAVEFORMATEX = WAVEFORMATEX(),
    public var wValidBitsPerSample: UShort = 0u,
    public var dwChannelMask: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var wEncodeOptions: UShort = 0u,
    public var wReserved3: UShort = 0u,
)

public data class YAMAHA_ADPCMWAVEFORMAT(public var wfx: WAVEFORMATEX = WAVEFORMATEX())

public data class s_RIFFWAVE_inst(
    public var bUnshiftedNote: UByte = 0u,
    public var chFineTune: Byte = 0,
    public var chGain: Byte = 0,
    public var bLowNote: UByte = 0u,
    public var bHighNote: UByte = 0u,
    public var bLowVelocity: UByte = 0u,
    public var bHighVelocity: UByte = 0u,
)
