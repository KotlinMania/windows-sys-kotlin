@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Paletteentry
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.media.Lptimecallback
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Hmixer
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Hwave
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Waveformat
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Waveformatex

public data class Adpcmcoefset(public var iCoef1: Short = 0, public var iCoef2: Short = 0)

public data class Adpcmewaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Adpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
    public var wNumCoef: UShort = 0u,
    public var aCoef: List<Adpcmcoefset> = List(1) { Adpcmcoefset() },
)

public data class Aptxwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class AudiofileAf10waveformat(public var wfx: Waveformatex = Waveformatex())

public data class AudiofileAf36waveformat(public var wfx: Waveformatex = Waveformatex())

public data class Avicompressoptions(
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwKeyFrameEvery: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var dwBytesPerSecond: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpFormat: COpaquePointer? = null,
    public var cbFormat: UInt = 0u,
    public var lpParms: COpaquePointer? = null,
    public var cbParms: UInt = 0u,
    public var dwInterleaveEvery: UInt = 0u,
)

public data class Avifileinfoa(
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
        if (other !is Avifileinfoa) return false
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

public data class Avifileinfow(
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
        if (other !is Avifileinfow) return false
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

public class Avistreaminfoa(
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
    public var rcFrame: Rect = Rect(),
    public var dwEditCount: UInt = 0u,
    public var dwFormatChangeCount: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
)

public class Avistreaminfow(
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
    public var rcFrame: Rect = Rect(),
    public var dwEditCount: UInt = 0u,
    public var dwFormatChangeCount: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
)

public data class Capdrivercaps(
    public var wDeviceIndex: UInt = 0u,
    public var fHasOverlay: Bool = 0,
    public var fHasDlgVideoSource: Bool = 0,
    public var fHasDlgVideoFormat: Bool = 0,
    public var fHasDlgVideoDisplay: Bool = 0,
    public var fCaptureInitialized: Bool = 0,
    public var fDriverSuppliesPalettes: Bool = 0,
    public var hVideoIn: Handle = null,
    public var hVideoOut: Handle = null,
    public var hVideoExtIn: Handle = null,
    public var hVideoExtOut: Handle = null,
)

public data class Capinfochunk(
    public var fccInfoID: UInt = 0u,
    public var lpData: COpaquePointer? = null,
    public var cbData: Int = 0,
)

public class Capstatus(
    public var uiImageWidth: UInt = 0u,
    public var uiImageHeight: UInt = 0u,
    public var fLiveWindow: Bool = 0,
    public var fOverlayWindow: Bool = 0,
    public var fScale: Bool = 0,
    public var ptScroll: Point = Point(),
    public var fUsingDefaultPalette: Bool = 0,
    public var fAudioHardware: Bool = 0,
    public var fCapFileExists: Bool = 0,
    public var dwCurrentVideoFrame: UInt = 0u,
    public var dwCurrentVideoFramesDropped: UInt = 0u,
    public var dwCurrentWaveSamples: UInt = 0u,
    public var dwCurrentTimeElapsedMS: UInt = 0u,
    public var hPalCurrent: Hpalette = null,
    public var fCapturingNow: Bool = 0,
    public var dwReturn: UInt = 0u,
    public var wNumVideoAllocated: UInt = 0u,
    public var wNumAudioAllocated: UInt = 0u,
)

public class Captureparms(
    public var dwRequestMicroSecPerFrame: UInt = 0u,
    public var fMakeUserHitOKToCapture: Bool = 0,
    public var wPercentDropForError: UInt = 0u,
    public var fYield: Bool = 0,
    public var dwIndexSize: UInt = 0u,
    public var wChunkGranularity: UInt = 0u,
    public var fUsingDOSMemory: Bool = 0,
    public var wNumVideoRequested: UInt = 0u,
    public var fCaptureAudio: Bool = 0,
    public var wNumAudioRequested: UInt = 0u,
    public var vKeyAbort: UInt = 0u,
    public var fAbortLeftMouse: Bool = 0,
    public var fAbortRightMouse: Bool = 0,
    public var fLimitEnabled: Bool = 0,
    public var wTimeLimit: UInt = 0u,
    public var fMCIControl: Bool = 0,
    public var fStepMCIDevice: Bool = 0,
    public var dwMCIStartTime: UInt = 0u,
    public var dwMCIStopTime: UInt = 0u,
    public var fStepCaptureAt2x: Bool = 0,
    public var wStepCaptureAverageFrames: UInt = 0u,
    public var dwAudioBufferSize: UInt = 0u,
    public var fDisableWriteCache: Bool = 0,
    public var aVStreamMaster: UInt = 0u,
)

public data class ChannelCaps(
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

public data class Compvars(
    public var cbSize: Int = 0,
    public var dwFlags: UInt = 0u,
    public var hic: Hic = null,
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var lpbiIn: Bitmapinfo? = null,
    public var lpbiOut: Bitmapinfo? = null,
    public var lpBitsOut: COpaquePointer? = null,
    public var lpBitsPrev: COpaquePointer? = null,
    public var lFrame: Int = 0,
    public var lKey: Int = 0,
    public var lDataRate: Int = 0,
    public var lQ: Int = 0,
    public var lKeyCount: Int = 0,
    public var lpState: COpaquePointer? = null,
    public var cbState: Int = 0,
)

public data class Contrescr10waveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Contresvqlpcwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Creativeadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wRevision: UShort = 0u)

public data class Creativefastspeech10waveformat(public var wfx: Waveformatex = Waveformatex(), public var wRevision: UShort = 0u)

public data class Creativefastspeech8waveformat(public var wfx: Waveformatex = Waveformatex(), public var wRevision: UShort = 0u)

public data class Csimaadpcmwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Dialogicokiadpcmwaveformat(public var ewf: Waveformatex = Waveformatex())

public data class Digiadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Digifixwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Digirealwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Digistdwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Dolbyac2waveformat(public var wfx: Waveformatex = Waveformatex(), public var nAuxBitsCode: UShort = 0u)

public data class Drawdibtime(
    public var timeCount: Int = 0,
    public var timeDraw: Int = 0,
    public var timeDecompress: Int = 0,
    public var timeDither: Int = 0,
    public var timeStretch: Int = 0,
    public var timeBlt: Int = 0,
    public var timeSetDIBits: Int = 0,
)

public data class Drmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wReserved: UShort = 0u,
    public var ulContentId: UInt = 0u,
    public var wfxSecure: Waveformatex = Waveformatex(),
)

public data class Drvconfiginfo(
    public var dwDCISize: UInt = 0u,
    public var lpszDCISectionName: Pcwstr = null,
    public var lpszDCIAliasName: Pcwstr = null,
)

public data class Drvconfiginfoex(
    public var dwDCISize: UInt = 0u,
    public var lpszDCISectionName: Pcwstr = null,
    public var lpszDCIAliasName: Pcwstr = null,
    public var dnDevNode: UInt = 0u,
)

public data class DrvmIoctlData(public var dwSize: UInt = 0u, public var dwCmd: UInt = 0u)

public data class Dviadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Echosc1waveformat(public var wfx: Waveformatex = Waveformatex())

public data class Exbminfoheader(public var bmi: Bitmapinfoheader = Bitmapinfoheader(), public var biExtDataOffset: UInt = 0u)

public data class FmtownsSndWaveformat(public var wfx: Waveformatex = Waveformatex(), public var wRevision: UShort = 0u)

public data class G721Adpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var nAuxBlockSize: UShort = 0u)

public data class G723Adpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var cbExtraSize: UShort = 0u,
    public var nAuxBlockSize: UShort = 0u,
)

public data class Gsm610waveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Iccompress(
    public var dwFlags: UInt = 0u,
    public var lpbiOutput: Bitmapinfoheader? = null,
    public var lpOutput: COpaquePointer? = null,
    public var lpbiInput: Bitmapinfoheader? = null,
    public var lpInput: COpaquePointer? = null,
    public var lpckid: UInt? = null,
    public var lpdwFlags: UInt? = null,
    public var lFrameNum: Int = 0,
    public var dwFrameSize: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var lpbiPrev: Bitmapinfoheader? = null,
    public var lpPrev: COpaquePointer? = null,
)

public data class Iccompressframes(
    public var dwFlags: UInt = 0u,
    public var lpbiOutput: Bitmapinfoheader? = null,
    public var lOutput: Lparam = 0L,
    public var lpbiInput: Bitmapinfoheader? = null,
    public var lInput: Lparam = 0L,
    public var lStartFrame: Int = 0,
    public var lFrameCount: Int = 0,
    public var lQuality: Int = 0,
    public var lDataRate: Int = 0,
    public var lKeyRate: Int = 0,
    public var dwRate: UInt = 0u,
    public var dwScale: UInt = 0u,
    public var dwOverheadPerFrame: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var getData: Int = 0,
    public var putData: Int = 0,
)

public data class Icdecompress(
    public var dwFlags: UInt = 0u,
    public var lpbiInput: Bitmapinfoheader? = null,
    public var lpInput: COpaquePointer? = null,
    public var lpbiOutput: Bitmapinfoheader? = null,
    public var lpOutput: COpaquePointer? = null,
    public var ckid: UInt = 0u,
)

public data class Icdecompressex(
    public var dwFlags: UInt = 0u,
    public var lpbiSrc: Bitmapinfoheader? = null,
    public var lpSrc: COpaquePointer? = null,
    public var lpbiDst: Bitmapinfoheader? = null,
    public var lpDst: COpaquePointer? = null,
    public var xDst: Int = 0,
    public var yDst: Int = 0,
    public var dxDst: Int = 0,
    public var dyDst: Int = 0,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var dxSrc: Int = 0,
    public var dySrc: Int = 0,
)

public data class Icdraw(
    public var dwFlags: UInt = 0u,
    public var lpFormat: COpaquePointer? = null,
    public var lpData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var lTime: Int = 0,
)

public data class Icdrawbegin(
    public var dwFlags: UInt = 0u,
    public var hpal: Hpalette = null,
    public var hwnd: Hwnd = null,
    public var hdc: Hdc = null,
    public var xDst: Int = 0,
    public var yDst: Int = 0,
    public var dxDst: Int = 0,
    public var dyDst: Int = 0,
    public var lpbi: Bitmapinfoheader? = null,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var dxSrc: Int = 0,
    public var dySrc: Int = 0,
    public var dwRate: UInt = 0u,
    public var dwScale: UInt = 0u,
)

public data class Icdrawsuggest(
    public var lpbiIn: Bitmapinfoheader? = null,
    public var lpbiSuggest: Bitmapinfoheader? = null,
    public var dxSrc: Int = 0,
    public var dySrc: Int = 0,
    public var dxDst: Int = 0,
    public var dyDst: Int = 0,
    public var hicDecompressor: Hic = null,
)

public data class Icinfo(
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
        if (other !is Icinfo) return false
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

public data class Icopen(
    public var dwSize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwError: Lresult = 0L,
    public var pV1Reserved: COpaquePointer? = null,
    public var pV2Reserved: COpaquePointer? = null,
    public var dnDevNode: UInt = 0u,
)

public data class Icpalette(
    public var dwFlags: UInt = 0u,
    public var iStart: Int = 0,
    public var iLen: Int = 0,
    public var lppe: Paletteentry? = null,
)

public data class Icsetstatusproc(
    public var dwFlags: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var status: Int = 0,
)

public data class Imaadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public class Joycaps2a(
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
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
)

public class Joycaps2w(
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
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
)

public class Joycapsa(
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

public class Joycapsw(
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

public data class Joyinfo(
    public var wXpos: UInt = 0u,
    public var wYpos: UInt = 0u,
    public var wZpos: UInt = 0u,
    public var wButtons: UInt = 0u,
)

public data class Joyinfoex(
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

public data class Jpeginfoheader(
    public var jPEGSize: UInt = 0u,
    public var jPEGProcess: UInt = 0u,
    public var jPEGColorSpaceID: UInt = 0u,
    public var jPEGBitsPerSample: UInt = 0u,
    public var jPEGHSubSampling: UInt = 0u,
    public var jPEGVSubSampling: UInt = 0u,
)

public data class MciAnimOpenParmsa(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcstr = null,
    public var lpstrElementName: Pcstr = null,
    public var lpstrAlias: Pcstr = null,
    public var dwStyle: UInt = 0u,
    public var hWndParent: Hwnd = null,
)

public data class MciAnimOpenParmsw(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcwstr = null,
    public var lpstrElementName: Pcwstr = null,
    public var lpstrAlias: Pcwstr = null,
    public var dwStyle: UInt = 0u,
    public var hWndParent: Hwnd = null,
)

public data class MciAnimPlayParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var dwSpeed: UInt = 0u,
)

public data class MciAnimRectParms(public var dwCallback: Int = 0, public var rc: Rect = Rect())

public data class MciAnimStepParms(public var dwCallback: Int = 0, public var dwFrames: UInt = 0u)

public data class MciAnimUpdateParms(
    public var dwCallback: Int = 0,
    public var rc: Rect = Rect(),
    public var hDC: Hdc = null,
)

public data class MciAnimWindowParmsa(
    public var dwCallback: Int = 0,
    public var hWnd: Hwnd = null,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: Pcstr = null,
)

public data class MciAnimWindowParmsw(
    public var dwCallback: Int = 0,
    public var hWnd: Hwnd = null,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: Pcwstr = null,
)

public data class MciBreakParms(
    public var dwCallback: Int = 0,
    public var nVirtKey: Int = 0,
    public var hwndBreak: Hwnd = null,
)

public data class MciDgvCaptureParmsa(
    public var dwCallback: Int = 0,
    public var lpstrFileName: Pstr = null,
    public var rc: Rect = Rect(),
)

public data class MciDgvCaptureParmsw(
    public var dwCallback: Int = 0,
    public var lpstrFileName: Pwstr = null,
    public var rc: Rect = Rect(),
)

public data class MciDgvCopyParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvCueParms(public var dwCallback: Int = 0, public var dwTo: UInt = 0u)

public data class MciDgvCutParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvDeleteParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvInfoParmsa(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pstr = null,
    public var dwRetSize: UInt = 0u,
    public var dwItem: UInt = 0u,
)

public data class MciDgvInfoParmsw(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pwstr = null,
    public var dwRetSize: UInt = 0u,
    public var dwItem: UInt = 0u,
)

public data class MciDgvListParmsa(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pstr = null,
    public var dwLength: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var dwItem: UInt = 0u,
    public var lpstrAlgorithm: Pstr = null,
)

public data class MciDgvListParmsw(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pwstr = null,
    public var dwLength: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var dwItem: UInt = 0u,
    public var lpstrAlgorithm: Pwstr = null,
)

public data class MciDgvMonitorParms(
    public var dwCallback: Int = 0,
    public var dwSource: UInt = 0u,
    public var dwMethod: UInt = 0u,
)

public data class MciDgvOpenParmsa(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pstr = null,
    public var lpstrElementName: Pstr = null,
    public var lpstrAlias: Pstr = null,
    public var dwStyle: UInt = 0u,
    public var hWndParent: Hwnd = null,
)

public data class MciDgvOpenParmsw(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pwstr = null,
    public var lpstrElementName: Pwstr = null,
    public var lpstrAlias: Pwstr = null,
    public var dwStyle: UInt = 0u,
    public var hWndParent: Hwnd = null,
)

public data class MciDgvPasteParms(
    public var dwCallback: Int = 0,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvQualityParmsa(
    public var dwCallback: Int = 0,
    public var dwItem: UInt = 0u,
    public var lpstrName: Pstr = null,
    public var lpstrAlgorithm: UInt = 0u,
    public var dwHandle: UInt = 0u,
)

public data class MciDgvQualityParmsw(
    public var dwCallback: Int = 0,
    public var dwItem: UInt = 0u,
    public var lpstrName: Pwstr = null,
    public var lpstrAlgorithm: UInt = 0u,
    public var dwHandle: UInt = 0u,
)

public data class MciDgvRecordParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvRectParms(public var dwCallback: Int = 0, public var rc: Rect = Rect())

public data class MciDgvReserveParmsa(
    public var dwCallback: Int = 0,
    public var lpstrPath: Pstr = null,
    public var dwSize: UInt = 0u,
)

public data class MciDgvReserveParmsw(
    public var dwCallback: Int = 0,
    public var lpstrPath: Pwstr = null,
    public var dwSize: UInt = 0u,
)

public data class MciDgvRestoreParmsa(
    public var dwCallback: Int = 0,
    public var lpstrFileName: Pstr = null,
    public var rc: Rect = Rect(),
)

public data class MciDgvRestoreParmsw(
    public var dwCallback: Int = 0,
    public var lpstrFileName: Pwstr = null,
    public var rc: Rect = Rect(),
)

public data class MciDgvSaveParmsa(
    public var dwCallback: Int = 0,
    public var lpstrFileName: Pstr = null,
    public var rc: Rect = Rect(),
)

public data class MciDgvSaveParmsw(
    public var dwCallback: Int = 0,
    public var lpstrFileName: Pwstr = null,
    public var rc: Rect = Rect(),
)

public data class MciDgvSetaudioParmsa(
    public var dwCallback: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: Pstr = null,
    public var lpstrQuality: Pstr = null,
)

public data class MciDgvSetaudioParmsw(
    public var dwCallback: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: Pwstr = null,
    public var lpstrQuality: Pwstr = null,
)

public data class MciDgvSetvideoParmsa(
    public var dwCallback: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: Pstr = null,
    public var lpstrQuality: Pstr = null,
    public var dwSourceNumber: UInt = 0u,
)

public data class MciDgvSetvideoParmsw(
    public var dwCallback: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwValue: UInt = 0u,
    public var dwOver: UInt = 0u,
    public var lpstrAlgorithm: Pwstr = null,
    public var lpstrQuality: Pwstr = null,
    public var dwSourceNumber: UInt = 0u,
)

public data class MciDgvSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var dwFileFormat: UInt = 0u,
    public var dwSpeed: UInt = 0u,
)

public data class MciDgvSignalParms(
    public var dwCallback: Int = 0,
    public var dwPosition: UInt = 0u,
    public var dwPeriod: UInt = 0u,
    public var dwUserParm: UInt = 0u,
)

public data class MciDgvStatusParmsa(
    public var dwCallback: Int = 0,
    public var dwReturn: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
    public var lpstrDrive: Pstr = null,
    public var dwReference: UInt = 0u,
)

public data class MciDgvStatusParmsw(
    public var dwCallback: Int = 0,
    public var dwReturn: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
    public var lpstrDrive: Pwstr = null,
    public var dwReference: UInt = 0u,
)

public data class MciDgvStepParms(public var dwCallback: Int = 0, public var dwFrames: UInt = 0u)

public data class MciDgvUpdateParms(
    public var dwCallback: Int = 0,
    public var rc: Rect = Rect(),
    public var hDC: Hdc = null,
)

public data class MciDgvWindowParmsa(
    public var dwCallback: Int = 0,
    public var hWnd: Hwnd = null,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: Pstr = null,
)

public data class MciDgvWindowParmsw(
    public var dwCallback: Int = 0,
    public var hWnd: Hwnd = null,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: Pwstr = null,
)

public data class MciGenericParms(public var dwCallback: Int = 0)

public data class MciGetdevcapsParms(
    public var dwCallback: Int = 0,
    public var dwReturn: UInt = 0u,
    public var dwItem: UInt = 0u,
)

public data class MciInfoParmsa(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pstr = null,
    public var dwRetSize: UInt = 0u,
)

public data class MciInfoParmsw(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pwstr = null,
    public var dwRetSize: UInt = 0u,
)

public data class MciLoadParmsa(public var dwCallback: Int = 0, public var lpfilename: Pcstr = null)

public data class MciLoadParmsw(public var dwCallback: Int = 0, public var lpfilename: Pcwstr = null)

public data class MciOpenDriverParms(
    public var wDeviceID: UInt = 0u,
    public var lpstrParams: Pcwstr = null,
    public var wCustomCommandTable: UInt = 0u,
    public var wType: UInt = 0u,
)

public data class MciOpenParmsa(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcstr = null,
    public var lpstrElementName: Pcstr = null,
    public var lpstrAlias: Pcstr = null,
)

public data class MciOpenParmsw(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcwstr = null,
    public var lpstrElementName: Pcwstr = null,
    public var lpstrAlias: Pcwstr = null,
)

public data class MciOvlyLoadParmsa(
    public var dwCallback: Int = 0,
    public var lpfilename: Pcstr = null,
    public var rc: Rect = Rect(),
)

public data class MciOvlyLoadParmsw(
    public var dwCallback: Int = 0,
    public var lpfilename: Pcwstr = null,
    public var rc: Rect = Rect(),
)

public data class MciOvlyOpenParmsa(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcstr = null,
    public var lpstrElementName: Pcstr = null,
    public var lpstrAlias: Pcstr = null,
    public var dwStyle: UInt = 0u,
    public var hWndParent: Hwnd = null,
)

public data class MciOvlyOpenParmsw(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcwstr = null,
    public var lpstrElementName: Pcwstr = null,
    public var lpstrAlias: Pcwstr = null,
    public var dwStyle: UInt = 0u,
    public var hWndParent: Hwnd = null,
)

public data class MciOvlyRectParms(public var dwCallback: Int = 0, public var rc: Rect = Rect())

public data class MciOvlySaveParmsa(
    public var dwCallback: Int = 0,
    public var lpfilename: Pcstr = null,
    public var rc: Rect = Rect(),
)

public data class MciOvlySaveParmsw(
    public var dwCallback: Int = 0,
    public var lpfilename: Pcwstr = null,
    public var rc: Rect = Rect(),
)

public data class MciOvlyWindowParmsa(
    public var dwCallback: Int = 0,
    public var hWnd: Hwnd = null,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: Pcstr = null,
)

public data class MciOvlyWindowParmsw(
    public var dwCallback: Int = 0,
    public var hWnd: Hwnd = null,
    public var nCmdShow: UInt = 0u,
    public var lpstrText: Pcwstr = null,
)

public data class MciPlayParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
)

public data class MciRecordParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
)

public data class MciSaveParmsa(public var dwCallback: Int = 0, public var lpfilename: Pcstr = null)

public data class MciSaveParmsw(public var dwCallback: Int = 0, public var lpfilename: Pcwstr = null)

public data class MciSeekParms(public var dwCallback: Int = 0, public var dwTo: UInt = 0u)

public data class MciSeqSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var dwTempo: UInt = 0u,
    public var dwPort: UInt = 0u,
    public var dwSlave: UInt = 0u,
    public var dwMaster: UInt = 0u,
    public var dwOffset: UInt = 0u,
)

public data class MciSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
)

public data class MciStatusParms(
    public var dwCallback: Int = 0,
    public var dwReturn: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
)

public data class MciSysinfoParmsa(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pstr = null,
    public var dwRetSize: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var wDeviceType: UInt = 0u,
)

public data class MciSysinfoParmsw(
    public var dwCallback: Int = 0,
    public var lpstrReturn: Pwstr = null,
    public var dwRetSize: UInt = 0u,
    public var dwNumber: UInt = 0u,
    public var wDeviceType: UInt = 0u,
)

public data class MciVdEscapeParmsa(public var dwCallback: Int = 0, public var lpstrCommand: Pcstr = null)

public data class MciVdEscapeParmsw(public var dwCallback: Int = 0, public var lpstrCommand: Pcwstr = null)

public data class MciVdPlayParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var dwSpeed: UInt = 0u,
)

public data class MciVdStepParms(public var dwCallback: Int = 0, public var dwFrames: UInt = 0u)

public data class MciWaveDeleteParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
)

public data class MciWaveOpenParmsa(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcstr = null,
    public var lpstrElementName: Pcstr = null,
    public var lpstrAlias: Pcstr = null,
    public var dwBufferSeconds: UInt = 0u,
)

public data class MciWaveOpenParmsw(
    public var dwCallback: Int = 0,
    public var wDeviceID: UInt = 0u,
    public var lpstrDeviceType: Pcwstr = null,
    public var lpstrElementName: Pcwstr = null,
    public var lpstrAlias: Pcwstr = null,
    public var dwBufferSeconds: UInt = 0u,
)

public data class MciWaveSetParms(
    public var dwCallback: Int = 0,
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

public data class Mediaspaceadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wRevision: UShort = 0u)

public data class Midiopenstrmid(public var dwStreamID: UInt = 0u, public var uDeviceID: UInt = 0u)

public data class Mixeropendesc(
    public var hmx: Hmixer = null,
    public var pReserved0: COpaquePointer? = null,
    public var dwCallback: Int = 0,
    public var dwInstance: Int = 0,
    public var dnDevNode: Int = 0,
)

public data class Mmckinfo(
    public var ckid: UInt = 0u,
    public var cksize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var dwDataOffset: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class Mmioinfo(
    public var dwFlags: UInt = 0u,
    public var fccIOProc: UInt = 0u,
    public var pIOProc: Lpmmioproc = null,
    public var wErrorRet: UInt = 0u,
    public var htask: Htask = null,
    public var cchBuffer: Int = 0,
    public var pchBuffer: COpaquePointer? = null,
    public var pchNext: COpaquePointer? = null,
    public var pchEndRead: COpaquePointer? = null,
    public var pchEndWrite: COpaquePointer? = null,
    public var lBufOffset: Int = 0,
    public var lDiskOffset: Int = 0,
    public var adwInfo: UIntArray = UIntArray(3),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var hmmio: Hmmio = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mmioinfo) return false
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

public data class Msaudio1waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
    public var wEncodeOptions: UShort = 0u,
)

public data class NmsVbxadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wSamplesPerBlock: UShort = 0u)

public data class Oliadpcmwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Olicelpwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Oligsmwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Olioprwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Olisbcwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class Sierraadpcmwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wRevision: UShort = 0u)

public data class Sonarcwaveformat(public var wfx: Waveformatex = Waveformatex(), public var wCompType: UShort = 0u)

public data class Timerevent(
    public var wDelay: UShort = 0u,
    public var wResolution: UShort = 0u,
    public var lpFunction: Lptimecallback = null,
    public var dwUser: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var wReserved1: UShort = 0u,
)

public data class Truespeechwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
    public var nSamplesPerBlock: UShort = 0u,
    public var abReserved: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Truespeechwaveformat) return false
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

public data class Videohdr(
    public var lpData: COpaquePointer? = null,
    public var dwBufferLength: UInt = 0u,
    public var dwBytesUsed: UInt = 0u,
    public var dwTimeCaptured: UInt = 0u,
    public var dwUser: Int = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Videohdr) return false
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

public data class Waveopendesc(
    public var hWave: Hwave = null,
    public var lpFormat: Waveformat? = null,
    public var dwCallback: Int = 0,
    public var dwInstance: Int = 0,
    public var uMappedDeviceID: UInt = 0u,
    public var dnDevNode: Int = 0,
)

public data class Wmaudio2waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var dwSamplesPerBlock: UInt = 0u,
    public var wEncodeOptions: UShort = 0u,
    public var dwSuperBlockAlign: UInt = 0u,
)

public data class Wmaudio3waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wValidBitsPerSample: UShort = 0u,
    public var dwChannelMask: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var wEncodeOptions: UShort = 0u,
    public var wReserved3: UShort = 0u,
)

public data class YamahaAdpcmwaveformat(public var wfx: Waveformatex = Waveformatex())

public data class SRiffwaveInst(
    public var bUnshiftedNote: UByte = 0u,
    public var chFineTune: Byte = 0,
    public var chGain: Byte = 0,
    public var bLowNote: UByte = 0u,
    public var bHighNote: UByte = 0u,
    public var bLowVelocity: UByte = 0u,
    public var bHighVelocity: UByte = 0u,
)
