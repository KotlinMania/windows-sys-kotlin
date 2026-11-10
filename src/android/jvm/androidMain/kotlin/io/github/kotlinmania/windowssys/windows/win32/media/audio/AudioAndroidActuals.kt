@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

private object WindowsWin32MediaAudioJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_activateAudioInterfaceAsync(deviceinterfacepath: Long, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_coRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor(audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory(category: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId(category: Int, deviceid: Long, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: Int, role: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createRenderAudioStateMonitor(audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory(category: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId(category: Int, deviceid: Long, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole(category: Int, role: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_playSoundA(pszsound: Long, hmod: Long, fdwsound: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_playSoundW(pszsound: Long, hmod: Long, fdwsound: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverAddA(phadid: Long, hinstmodule: Long, lparam: Long, dwpriority: Int, fdwadd: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverAddW(phadid: Long, hinstmodule: Long, lparam: Long, dwpriority: Int, fdwadd: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverClose(had: Long, fdwclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverDetailsA(hadid: Long, padd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverDetailsW(hadid: Long, padd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverEnum(fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverID(hao: Long, phadid: Long, fdwdriverid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverMessage(had: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverOpen(phad: Long, hadid: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverPriority(hadid: Long, dwpriority: Int, fdwpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmDriverRemove(hadid: Long, fdwremove: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterChooseA(pafltrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterChooseW(pafltrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterDetailsA(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterDetailsW(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterEnumA(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterEnumW(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterTagDetailsA(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterTagDetailsW(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterTagEnumA(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFilterTagEnumW(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatChooseA(pafmtc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatChooseW(pafmtc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatDetailsA(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatDetailsW(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatEnumA(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatEnumW(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatSuggest(had: Long, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: Int, fdwsuggest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatTagDetailsA(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatTagDetailsW(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatTagEnumA(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmFormatTagEnumW(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmGetVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmMetrics(hao: Long, umetric: Int, pmetric: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamClose(has: Long, fdwclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamConvert(has: Long, pash: Long, fdwconvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamMessage(has: Long, umsg: Int, lparam1: Long, lparam2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamOpen(phas: Long, had: Long, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamPrepareHeader(has: Long, pash: Long, fdwprepare: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamReset(has: Long, fdwreset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamSize(has: Long, cbinput: Int, pdwoutputbytes: Long, fdwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(has: Long, pash: Long, fdwunprepare: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid: Long, pac: Long, cbac: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid: Long, pac: Long, cbac: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_auxGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_auxGetVolume(udeviceid: Int, pdwvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_auxOutMessage(udeviceid: Int, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_auxSetVolume(udeviceid: Int, dwvolume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiConnect(hmi: Long, hmo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiDisconnect(hmi: Long, hmo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInAddBuffer(hmi: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInClose(hmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid: Long, pmic: Long, cbmic: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid: Long, pmic: Long, cbmic: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInGetID(hmi: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInMessage(hmi: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInOpen(phmi: Long, udeviceid: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInPrepareHeader(hmi: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInReset(hmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInStart(hmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInStop(hmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiInUnprepareHeader(hmi: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(hmo: Long, upatch: Int, pwkya: Long, fucache: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutCachePatches(hmo: Long, ubank: Int, pwpa: Long, fucache: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutClose(hmo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid: Long, pmoc: Long, cbmoc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid: Long, pmoc: Long, cbmoc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetID(hmo: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutGetVolume(hmo: Long, pdwvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutLongMsg(hmo: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutMessage(hmo: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutOpen(phmo: Long, udeviceid: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutPrepareHeader(hmo: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutReset(hmo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutSetVolume(hmo: Long, dwvolume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutShortMsg(hmo: Long, dwmsg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiOutUnprepareHeader(hmo: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamClose(hms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamOut(hms: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamPause(hms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamPosition(hms: Long, lpmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamProperty(hms: Long, lppropdata: Long, dwproperty: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamRestart(hms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_midiStreamStop(hms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerClose(hmx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetControlDetailsA(hmxobj: Long, pmxcd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetControlDetailsW(hmxobj: Long, pmxcd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid: Long, pmxcaps: Long, cbmxcaps: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid: Long, pmxcaps: Long, cbmxcaps: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetID(hmxobj: Long, pumxid: Long, fdwid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetLineControlsA(hmxobj: Long, pmxlc: Long, fdwcontrols: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetLineControlsW(hmxobj: Long, pmxlc: Long, fdwcontrols: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetLineInfoA(hmxobj: Long, pmxl: Long, fdwinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetLineInfoW(hmxobj: Long, pmxl: Long, fdwinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerMessage(hmx: Long, umsg: Int, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerOpen(phmx: Long, umxid: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_mixerSetControlDetails(hmxobj: Long, pmxcd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_sndPlaySoundA(pszsound: Long, fusound: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_sndPlaySoundW(pszsound: Long, fusound: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInAddBuffer(hwi: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInClose(hwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid: Long, pwic: Long, cbwic: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid: Long, pwic: Long, cbwic: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetID(hwi: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInGetPosition(hwi: Long, pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInMessage(hwi: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInOpen(phwi: Long, udeviceid: Int, pwfx: Long, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInPrepareHeader(hwi: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInReset(hwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInStart(hwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInStop(hwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveInUnprepareHeader(hwi: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutBreakLoop(hwo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutClose(hwo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid: Long, pwoc: Long, cbwoc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid: Long, pwoc: Long, cbwoc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetID(hwo: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetPitch(hwo: Long, pdwpitch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(hwo: Long, pdwrate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetPosition(hwo: Long, pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutGetVolume(hwo: Long, pdwvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutMessage(hwo: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutOpen(phwo: Long, udeviceid: Int, pwfx: Long, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutPause(hwo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutPrepareHeader(hwo: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutReset(hwo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutRestart(hwo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutSetPitch(hwo: Long, dwpitch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(hwo: Long, dwrate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutSetVolume(hwo: Long, dwvolume: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutUnprepareHeader(hwo: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_waveOutWrite(hwo: Long, pwh: Long, cbwh: Int): Int
}

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: COpaquePointer?, activationparams: COpaquePointer?, completionhandler: COpaquePointer?, activationoperation: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_activateAudioInterfaceAsync((deviceinterfacepath?.value ?: 0L), (riid?.value ?: 0L), (activationparams?.value ?: 0L), (completionhandler?.value ?: 0L), (activationoperation?.value ?: 0L))

public actual fun coRegisterMessageFilter(lpmessagefilter: COpaquePointer?, lplpmessagefilter: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_coRegisterMessageFilter((lpmessagefilter?.value ?: 0L), (lplpmessagefilter?.value ?: 0L))

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor((audiostatemonitor?.value ?: 0L))

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory(category, (audiostatemonitor?.value ?: 0L))

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId(category, (deviceid?.value ?: 0L), (audiostatemonitor?.value ?: 0L))

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, (audiostatemonitor?.value ?: 0L))

public actual fun createRenderAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createRenderAudioStateMonitor((audiostatemonitor?.value ?: 0L))

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory(category, (audiostatemonitor?.value ?: 0L))

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId(category, (deviceid?.value ?: 0L), (audiostatemonitor?.value ?: 0L))

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, (audiostatemonitor?.value ?: 0L))

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_playSoundA((pszsound?.value ?: 0L), (hmod?.value ?: 0L), fdwsound.toInt())

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_playSoundW((pszsound?.value ?: 0L), (hmod?.value ?: 0L), fdwsound.toInt())

public actual fun acmDriverAddA(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverAddA((phadid?.value ?: 0L), (hinstmodule?.value ?: 0L), lparam, dwpriority.toInt(), fdwadd.toInt()).toUInt()

public actual fun acmDriverAddW(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverAddW((phadid?.value ?: 0L), (hinstmodule?.value ?: 0L), lparam, dwpriority.toInt(), fdwadd.toInt()).toUInt()

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverClose((had?.value ?: 0L), fdwclose.toInt()).toUInt()

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverDetailsA((hadid?.value ?: 0L), (padd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverDetailsW((hadid?.value ?: 0L), (padd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverEnum(0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmDriverID(hao: Hacmobj, phadid: COpaquePointer?, fdwdriverid: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverID((hao?.value ?: 0L), (phadid?.value ?: 0L), fdwdriverid.toInt()).toUInt()

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverMessage((had?.value ?: 0L), umsg.toInt(), lparam1, lparam2)

public actual fun acmDriverOpen(phad: COpaquePointer?, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverOpen((phad?.value ?: 0L), (hadid?.value ?: 0L), fdwopen.toInt()).toUInt()

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverPriority((hadid?.value ?: 0L), dwpriority.toInt(), fdwpriority.toInt()).toUInt()

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverRemove((hadid?.value ?: 0L), fdwremove.toInt()).toUInt()

public actual fun acmFilterChooseA(pafltrc: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterChooseA((pafltrc?.value ?: 0L)).toUInt()

public actual fun acmFilterChooseW(pafltrc: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterChooseW((pafltrc?.value ?: 0L)).toUInt()

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterDetailsA((had?.value ?: 0L), (pafd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterDetailsW((had?.value ?: 0L), (pafd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterEnumA((had?.value ?: 0L), (pafd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterEnumW((had?.value ?: 0L), (pafd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagDetailsA((had?.value ?: 0L), (paftd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagDetailsW((had?.value ?: 0L), (paftd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagEnumA((had?.value ?: 0L), (paftd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagEnumW((had?.value ?: 0L), (paftd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatChooseA(pafmtc: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatChooseA((pafmtc?.value ?: 0L)).toUInt()

public actual fun acmFormatChooseW(pafmtc: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatChooseW((pafmtc?.value ?: 0L)).toUInt()

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatDetailsA((had?.value ?: 0L), (pafd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatDetailsW((had?.value ?: 0L), (pafd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatEnumA((had?.value ?: 0L), (pafd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatEnumW((had?.value ?: 0L), (pafd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatSuggest((had?.value ?: 0L), (pwfxsrc?.value ?: 0L), (pwfxdst?.value ?: 0L), cbwfxdst.toInt(), fdwsuggest.toInt()).toUInt()

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagDetailsA((had?.value ?: 0L), (paftd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagDetailsW((had?.value ?: 0L), (paftd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagEnumA((had?.value ?: 0L), (paftd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagEnumW((had?.value ?: 0L), (paftd?.value ?: 0L), 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmGetVersion(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmGetVersion().toUInt()

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmMetrics((hao?.value ?: 0L), umetric.toInt(), (pmetric?.value ?: 0L)).toUInt()

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamClose((has?.value ?: 0L), fdwclose.toInt()).toUInt()

public actual fun acmStreamConvert(has: Hacmstream, pash: COpaquePointer?, fdwconvert: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamConvert((has?.value ?: 0L), (pash?.value ?: 0L), fdwconvert.toInt()).toUInt()

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamMessage((has?.value ?: 0L), umsg.toInt(), lparam1, lparam2).toUInt()

public actual fun acmStreamOpen(phas: COpaquePointer?, had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, pwfltr: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamOpen((phas?.value ?: 0L), (had?.value ?: 0L), (pwfxsrc?.value ?: 0L), (pwfxdst?.value ?: 0L), (pwfltr?.value ?: 0L), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwprepare: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamPrepareHeader((has?.value ?: 0L), (pash?.value ?: 0L), fdwprepare.toInt()).toUInt()

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamReset((has?.value ?: 0L), fdwreset.toInt()).toUInt()

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: COpaquePointer?, fdwsize: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamSize((has?.value ?: 0L), cbinput.toInt(), (pdwoutputbytes?.value ?: 0L), fdwsize.toInt()).toUInt()

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwunprepare: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamUnprepareHeader((has?.value ?: 0L), (pash?.value ?: 0L), fdwunprepare.toInt()).toUInt()

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid.toLong(), (pac?.value ?: 0L), cbac.toInt()).toUInt()

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid.toLong(), (pac?.value ?: 0L), cbac.toInt()).toUInt()

public actual fun auxGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetNumDevs().toUInt()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetVolume(udeviceid.toInt(), (pdwvolume?.value ?: 0L)).toUInt()

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxSetVolume(udeviceid.toInt(), dwvolume.toInt()).toUInt()

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiConnect((hmi?.value ?: 0L), (hmo?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiDisconnect((hmi?.value ?: 0L), (hmo?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInAddBuffer((hmi?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiInClose(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInClose((hmi?.value ?: 0L)).toUInt()

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid.toLong(), (pmic?.value ?: 0L), cbmic.toInt()).toUInt()

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid.toLong(), (pmic?.value ?: 0L), cbmic.toInt()).toUInt()

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetID((hmi?.value ?: 0L), (pudeviceid?.value ?: 0L)).toUInt()

public actual fun midiInGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetNumDevs().toUInt()

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInMessage((hmi?.value ?: 0L), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun midiInOpen(phmi: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInOpen((phmi?.value ?: 0L), udeviceid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInPrepareHeader((hmi?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiInReset(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInReset((hmi?.value ?: 0L)).toUInt()

public actual fun midiInStart(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInStart((hmi?.value ?: 0L)).toUInt()

public actual fun midiInStop(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInStop((hmi?.value ?: 0L)).toUInt()

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInUnprepareHeader((hmi?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: COpaquePointer?, fucache: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutCacheDrumPatches((hmo?.value ?: 0L), upatch.toInt(), (pwkya?.value ?: 0L), fucache.toInt()).toUInt()

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: COpaquePointer?, fucache: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutCachePatches((hmo?.value ?: 0L), ubank.toInt(), (pwpa?.value ?: 0L), fucache.toInt()).toUInt()

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutClose((hmo?.value ?: 0L)).toUInt()

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid.toLong(), (pmoc?.value ?: 0L), cbmoc.toInt()).toUInt()

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid.toLong(), (pmoc?.value ?: 0L), cbmoc.toInt()).toUInt()

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetID((hmo?.value ?: 0L), (pudeviceid?.value ?: 0L)).toUInt()

public actual fun midiOutGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetNumDevs().toUInt()

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetVolume((hmo?.value ?: 0L), (pdwvolume?.value ?: 0L)).toUInt()

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutLongMsg((hmo?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutMessage((hmo?.value ?: 0L), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun midiOutOpen(phmo: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutOpen((phmo?.value ?: 0L), udeviceid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutPrepareHeader((hmo?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutReset((hmo?.value ?: 0L)).toUInt()

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutSetVolume((hmo?.value ?: 0L), dwvolume.toInt()).toUInt()

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutShortMsg((hmo?.value ?: 0L), dwmsg.toInt()).toUInt()

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutUnprepareHeader((hmo?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamClose((hms?.value ?: 0L)).toUInt()

public actual fun midiStreamOpen(phms: COpaquePointer?, pudeviceid: COpaquePointer?, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamOpen((phms?.value ?: 0L), (pudeviceid?.value ?: 0L), cmidi.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiStreamOut(hms: Hmidistrm, pmh: COpaquePointer?, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamOut((hms?.value ?: 0L), (pmh?.value ?: 0L), cbmh.toInt()).toUInt()

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamPause((hms?.value ?: 0L)).toUInt()

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: COpaquePointer?, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamPosition((hms?.value ?: 0L), (lpmmt?.value ?: 0L), cbmmt.toInt()).toUInt()

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: COpaquePointer?, dwproperty: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamProperty((hms?.value ?: 0L), (lppropdata?.value ?: 0L), dwproperty.toInt()).toUInt()

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamRestart((hms?.value ?: 0L)).toUInt()

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamStop((hms?.value ?: 0L)).toUInt()

public actual fun mixerClose(hmx: Hmixer): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerClose((hmx?.value ?: 0L)).toUInt()

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetControlDetailsA((hmxobj?.value ?: 0L), (pmxcd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetControlDetailsW((hmxobj?.value ?: 0L), (pmxcd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid.toLong(), (pmxcaps?.value ?: 0L), cbmxcaps.toInt()).toUInt()

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid.toLong(), (pmxcaps?.value ?: 0L), cbmxcaps.toInt()).toUInt()

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: COpaquePointer?, fdwid: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetID((hmxobj?.value ?: 0L), (pumxid?.value ?: 0L), fdwid.toInt()).toUInt()

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineControlsA((hmxobj?.value ?: 0L), (pmxlc?.value ?: 0L), fdwcontrols.toInt()).toUInt()

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineControlsW((hmxobj?.value ?: 0L), (pmxlc?.value ?: 0L), fdwcontrols.toInt()).toUInt()

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineInfoA((hmxobj?.value ?: 0L), (pmxl?.value ?: 0L), fdwinfo.toInt()).toUInt()

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineInfoW((hmxobj?.value ?: 0L), (pmxl?.value ?: 0L), fdwinfo.toInt()).toUInt()

public actual fun mixerGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetNumDevs().toUInt()

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerMessage((hmx?.value ?: 0L), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mixerOpen(phmx: COpaquePointer?, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerOpen((phmx?.value ?: 0L), umxid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerSetControlDetails((hmxobj?.value ?: 0L), (pmxcd?.value ?: 0L), fdwdetails.toInt()).toUInt()

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_sndPlaySoundA((pszsound?.value ?: 0L), fusound.toInt())

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_sndPlaySoundW((pszsound?.value ?: 0L), fusound.toInt())

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInAddBuffer((hwi?.value ?: 0L), (pwh?.value ?: 0L), cbwh.toInt()).toUInt()

public actual fun waveInClose(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInClose((hwi?.value ?: 0L)).toUInt()

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid.toLong(), (pwic?.value ?: 0L), cbwic.toInt()).toUInt()

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid.toLong(), (pwic?.value ?: 0L), cbwic.toInt()).toUInt()

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetID((hwi?.value ?: 0L), (pudeviceid?.value ?: 0L)).toUInt()

public actual fun waveInGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetNumDevs().toUInt()

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetPosition((hwi?.value ?: 0L), (pmmt?.value ?: 0L), cbmmt.toInt()).toUInt()

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInMessage((hwi?.value ?: 0L), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun waveInOpen(phwi: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInOpen((phwi?.value ?: 0L), udeviceid.toInt(), (pwfx?.value ?: 0L), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInPrepareHeader((hwi?.value ?: 0L), (pwh?.value ?: 0L), cbwh.toInt()).toUInt()

public actual fun waveInReset(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInReset((hwi?.value ?: 0L)).toUInt()

public actual fun waveInStart(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInStart((hwi?.value ?: 0L)).toUInt()

public actual fun waveInStop(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInStop((hwi?.value ?: 0L)).toUInt()

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInUnprepareHeader((hwi?.value ?: 0L), (pwh?.value ?: 0L), cbwh.toInt()).toUInt()

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutBreakLoop((hwo?.value ?: 0L)).toUInt()

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutClose((hwo?.value ?: 0L)).toUInt()

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid.toLong(), (pwoc?.value ?: 0L), cbwoc.toInt()).toUInt()

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid.toLong(), (pwoc?.value ?: 0L), cbwoc.toInt()).toUInt()

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L), cchtext.toInt()).toUInt()

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetID((hwo?.value ?: 0L), (pudeviceid?.value ?: 0L)).toUInt()

public actual fun waveOutGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetNumDevs().toUInt()

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetPitch((hwo?.value ?: 0L), (pdwpitch?.value ?: 0L)).toUInt()

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetPlaybackRate((hwo?.value ?: 0L), (pdwrate?.value ?: 0L)).toUInt()

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetPosition((hwo?.value ?: 0L), (pmmt?.value ?: 0L), cbmmt.toInt()).toUInt()

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: COpaquePointer?): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetVolume((hwo?.value ?: 0L), (pdwvolume?.value ?: 0L)).toUInt()

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutMessage((hwo?.value ?: 0L), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun waveOutOpen(phwo: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutOpen((phwo?.value ?: 0L), udeviceid.toInt(), (pwfx?.value ?: 0L), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutPause((hwo?.value ?: 0L)).toUInt()

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutPrepareHeader((hwo?.value ?: 0L), (pwh?.value ?: 0L), cbwh.toInt()).toUInt()

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutReset((hwo?.value ?: 0L)).toUInt()

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutRestart((hwo?.value ?: 0L)).toUInt()

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutSetPitch((hwo?.value ?: 0L), dwpitch.toInt()).toUInt()

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutSetPlaybackRate((hwo?.value ?: 0L), dwrate.toInt()).toUInt()

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutSetVolume((hwo?.value ?: 0L), dwvolume.toInt()).toUInt()

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutUnprepareHeader((hwo?.value ?: 0L), (pwh?.value ?: 0L), cbwh.toInt()).toUInt()

public actual fun waveOutWrite(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutWrite((hwo?.value ?: 0L), (pwh?.value ?: 0L), cbwh.toInt()).toUInt()
