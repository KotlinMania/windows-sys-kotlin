@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT

private object WindowsWin32MediaAudioJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_ActivateAudioInterfaceAsync(deviceinterfacepath: Long, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitor(audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategory(category: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: Int, deviceid: Long, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: Int, role: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitor(audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategory(category: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: Int, deviceid: Long, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: Int, role: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_PlaySoundA(pszsound: Long, hmod: Long, fdwsound: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_audio_PlaySoundW(pszsound: Long, hmod: Long, fdwsound: Int): Int

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

public actual fun ActivateAudioInterfaceAsync(deviceinterfacepath: PCWSTR, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_ActivateAudioInterfaceAsync(deviceinterfacepath, riid, activationparams, completionhandler, activationoperation)

public actual fun CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CoRegisterMessageFilter(lpmessagefilter, lplpmessagefilter)

public actual fun CreateCaptureAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitor(audiostatemonitor)

public actual fun CreateCaptureAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor)

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid, audiostatemonitor)

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor)

public actual fun CreateRenderAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitor(audiostatemonitor)

public actual fun CreateRenderAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategory(category, audiostatemonitor)

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid, audiostatemonitor)

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor)

public actual fun PlaySoundA(pszsound: PCSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_PlaySoundA(pszsound, hmod, fdwsound.toInt())

public actual fun PlaySoundW(pszsound: PCWSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_PlaySoundW(pszsound, hmod, fdwsound.toInt())

public actual fun acmDriverAddA(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverAddA(phadid, hinstmodule, lparam, dwpriority.toInt(), fdwadd.toInt()).toUInt()

public actual fun acmDriverAddW(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverAddW(phadid, hinstmodule, lparam, dwpriority.toInt(), fdwadd.toInt()).toUInt()

public actual fun acmDriverClose(had: HACMDRIVER, fdwclose: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverClose(had, fdwclose.toInt()).toUInt()

public actual fun acmDriverDetailsA(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverDetailsA(hadid, padd, fdwdetails.toInt()).toUInt()

public actual fun acmDriverDetailsW(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverDetailsW(hadid, padd, fdwdetails.toInt()).toUInt()

public actual fun acmDriverEnum(fncallback: ACMDRIVERENUMCB, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverEnum(fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmDriverID(hao: HACMOBJ, phadid: Long, fdwdriverid: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverID(hao, phadid, fdwdriverid.toInt()).toUInt()

public actual fun acmDriverMessage(had: HACMDRIVER, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverMessage(had, umsg.toInt(), lparam1, lparam2)

public actual fun acmDriverOpen(phad: Long, hadid: HACMDRIVERID, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverOpen(phad, hadid, fdwopen.toInt()).toUInt()

public actual fun acmDriverPriority(hadid: HACMDRIVERID, dwpriority: UInt, fdwpriority: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverPriority(hadid, dwpriority.toInt(), fdwpriority.toInt()).toUInt()

public actual fun acmDriverRemove(hadid: HACMDRIVERID, fdwremove: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmDriverRemove(hadid, fdwremove.toInt()).toUInt()

public actual fun acmFilterChooseA(pafltrc: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterChooseA(pafltrc).toUInt()

public actual fun acmFilterChooseW(pafltrc: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterChooseW(pafltrc).toUInt()

public actual fun acmFilterDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterDetailsA(had, pafd, fdwdetails.toInt()).toUInt()

public actual fun acmFilterDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterDetailsW(had, pafd, fdwdetails.toInt()).toUInt()

public actual fun acmFilterEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterEnumA(had, pafd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterEnumW(had, pafd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagDetailsA(had, paftd, fdwdetails.toInt()).toUInt()

public actual fun acmFilterTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagDetailsW(had, paftd, fdwdetails.toInt()).toUInt()

public actual fun acmFilterTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagEnumA(had, paftd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFilterTagEnumW(had, paftd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatChooseA(pafmtc: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatChooseA(pafmtc).toUInt()

public actual fun acmFormatChooseW(pafmtc: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatChooseW(pafmtc).toUInt()

public actual fun acmFormatDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatDetailsA(had, pafd, fdwdetails.toInt()).toUInt()

public actual fun acmFormatDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatDetailsW(had, pafd, fdwdetails.toInt()).toUInt()

public actual fun acmFormatEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatEnumA(had, pafd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatEnumW(had, pafd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatSuggest(had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatSuggest(had, pwfxsrc, pwfxdst, cbwfxdst.toInt(), fdwsuggest.toInt()).toUInt()

public actual fun acmFormatTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagDetailsA(had, paftd, fdwdetails.toInt()).toUInt()

public actual fun acmFormatTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagDetailsW(had, paftd, fdwdetails.toInt()).toUInt()

public actual fun acmFormatTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagEnumA(had, paftd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmFormatTagEnumW(had, paftd, fncallback.toLong(), dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmGetVersion(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmGetVersion().toUInt()

public actual fun acmMetrics(hao: HACMOBJ, umetric: UInt, pmetric: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmMetrics(hao, umetric.toInt(), pmetric).toUInt()

public actual fun acmStreamClose(has: HACMSTREAM, fdwclose: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamClose(has, fdwclose.toInt()).toUInt()

public actual fun acmStreamConvert(has: HACMSTREAM, pash: Long, fdwconvert: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamConvert(has, pash, fdwconvert.toInt()).toUInt()

public actual fun acmStreamMessage(has: HACMSTREAM, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamMessage(has, umsg.toInt(), lparam1, lparam2).toUInt()

public actual fun acmStreamOpen(phas: Long, had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamOpen(phas, had, pwfxsrc, pwfxdst, pwfltr, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun acmStreamPrepareHeader(has: HACMSTREAM, pash: Long, fdwprepare: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamPrepareHeader(has, pash, fdwprepare.toInt()).toUInt()

public actual fun acmStreamReset(has: HACMSTREAM, fdwreset: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamReset(has, fdwreset.toInt()).toUInt()

public actual fun acmStreamSize(has: HACMSTREAM, cbinput: UInt, pdwoutputbytes: Long, fdwsize: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamSize(has, cbinput.toInt(), pdwoutputbytes, fdwsize.toInt()).toUInt()

public actual fun acmStreamUnprepareHeader(has: HACMSTREAM, pash: Long, fdwunprepare: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(has, pash, fdwunprepare.toInt()).toUInt()

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid.toLong(), pac, cbac.toInt()).toUInt()

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid.toLong(), pac, cbac.toInt()).toUInt()

public actual fun auxGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetNumDevs().toUInt()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxGetVolume(udeviceid.toInt(), pdwvolume).toUInt()

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_auxSetVolume(udeviceid.toInt(), dwvolume.toInt()).toUInt()

public actual fun midiConnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiConnect(hmi, hmo, preserved).toUInt()

public actual fun midiDisconnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiDisconnect(hmi, hmo, preserved).toUInt()

public actual fun midiInAddBuffer(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInAddBuffer(hmi, pmh, cbmh.toInt()).toUInt()

public actual fun midiInClose(hmi: HMIDIIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInClose(hmi).toUInt()

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid.toLong(), pmic, cbmic.toInt()).toUInt()

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid.toLong(), pmic, cbmic.toInt()).toUInt()

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun midiInGetID(hmi: HMIDIIN, pudeviceid: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetID(hmi, pudeviceid).toUInt()

public actual fun midiInGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInGetNumDevs().toUInt()

public actual fun midiInMessage(hmi: HMIDIIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInMessage(hmi, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun midiInOpen(phmi: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInOpen(phmi, udeviceid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiInPrepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInPrepareHeader(hmi, pmh, cbmh.toInt()).toUInt()

public actual fun midiInReset(hmi: HMIDIIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInReset(hmi).toUInt()

public actual fun midiInStart(hmi: HMIDIIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInStart(hmi).toUInt()

public actual fun midiInStop(hmi: HMIDIIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInStop(hmi).toUInt()

public actual fun midiInUnprepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiInUnprepareHeader(hmi, pmh, cbmh.toInt()).toUInt()

public actual fun midiOutCacheDrumPatches(hmo: HMIDIOUT, upatch: UInt, pwkya: Long, fucache: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(hmo, upatch.toInt(), pwkya, fucache.toInt()).toUInt()

public actual fun midiOutCachePatches(hmo: HMIDIOUT, ubank: UInt, pwpa: Long, fucache: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutCachePatches(hmo, ubank.toInt(), pwpa, fucache.toInt()).toUInt()

public actual fun midiOutClose(hmo: HMIDIOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutClose(hmo).toUInt()

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid.toLong(), pmoc, cbmoc.toInt()).toUInt()

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid.toLong(), pmoc, cbmoc.toInt()).toUInt()

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun midiOutGetID(hmo: HMIDIOUT, pudeviceid: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetID(hmo, pudeviceid).toUInt()

public actual fun midiOutGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetNumDevs().toUInt()

public actual fun midiOutGetVolume(hmo: HMIDIOUT, pdwvolume: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutGetVolume(hmo, pdwvolume).toUInt()

public actual fun midiOutLongMsg(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutLongMsg(hmo, pmh, cbmh.toInt()).toUInt()

public actual fun midiOutMessage(hmo: HMIDIOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutMessage(hmo, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun midiOutOpen(phmo: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutOpen(phmo, udeviceid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiOutPrepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutPrepareHeader(hmo, pmh, cbmh.toInt()).toUInt()

public actual fun midiOutReset(hmo: HMIDIOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutReset(hmo).toUInt()

public actual fun midiOutSetVolume(hmo: HMIDIOUT, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutSetVolume(hmo, dwvolume.toInt()).toUInt()

public actual fun midiOutShortMsg(hmo: HMIDIOUT, dwmsg: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutShortMsg(hmo, dwmsg.toInt()).toUInt()

public actual fun midiOutUnprepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiOutUnprepareHeader(hmo, pmh, cbmh.toInt()).toUInt()

public actual fun midiStreamClose(hms: HMIDISTRM): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamClose(hms).toUInt()

public actual fun midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamOpen(phms, pudeviceid, cmidi.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiStreamOut(hms: HMIDISTRM, pmh: Long, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamOut(hms, pmh, cbmh.toInt()).toUInt()

public actual fun midiStreamPause(hms: HMIDISTRM): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamPause(hms).toUInt()

public actual fun midiStreamPosition(hms: HMIDISTRM, lpmmt: Long, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamPosition(hms, lpmmt, cbmmt.toInt()).toUInt()

public actual fun midiStreamProperty(hms: HMIDISTRM, lppropdata: Long, dwproperty: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamProperty(hms, lppropdata, dwproperty.toInt()).toUInt()

public actual fun midiStreamRestart(hms: HMIDISTRM): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamRestart(hms).toUInt()

public actual fun midiStreamStop(hms: HMIDISTRM): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_midiStreamStop(hms).toUInt()

public actual fun mixerClose(hmx: HMIXER): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerClose(hmx).toUInt()

public actual fun mixerGetControlDetailsA(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetControlDetailsA(hmxobj, pmxcd, fdwdetails.toInt()).toUInt()

public actual fun mixerGetControlDetailsW(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetControlDetailsW(hmxobj, pmxcd, fdwdetails.toInt()).toUInt()

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid.toLong(), pmxcaps, cbmxcaps.toInt()).toUInt()

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid.toLong(), pmxcaps, cbmxcaps.toInt()).toUInt()

public actual fun mixerGetID(hmxobj: HMIXEROBJ, pumxid: Long, fdwid: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetID(hmxobj, pumxid, fdwid.toInt()).toUInt()

public actual fun mixerGetLineControlsA(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineControlsA(hmxobj, pmxlc, fdwcontrols.toInt()).toUInt()

public actual fun mixerGetLineControlsW(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineControlsW(hmxobj, pmxlc, fdwcontrols.toInt()).toUInt()

public actual fun mixerGetLineInfoA(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineInfoA(hmxobj, pmxl, fdwinfo.toInt()).toUInt()

public actual fun mixerGetLineInfoW(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetLineInfoW(hmxobj, pmxl, fdwinfo.toInt()).toUInt()

public actual fun mixerGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerGetNumDevs().toUInt()

public actual fun mixerMessage(hmx: HMIXER, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerMessage(hmx, umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mixerOpen(phmx: Long, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerOpen(phmx, umxid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun mixerSetControlDetails(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_mixerSetControlDetails(hmxobj, pmxcd, fdwdetails.toInt()).toUInt()

public actual fun sndPlaySoundA(pszsound: PCSTR, fusound: UInt): BOOL =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_sndPlaySoundA(pszsound, fusound.toInt())

public actual fun sndPlaySoundW(pszsound: PCWSTR, fusound: UInt): BOOL =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_sndPlaySoundW(pszsound, fusound.toInt())

public actual fun waveInAddBuffer(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInAddBuffer(hwi, pwh, cbwh.toInt()).toUInt()

public actual fun waveInClose(hwi: HWAVEIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInClose(hwi).toUInt()

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid.toLong(), pwic, cbwic.toInt()).toUInt()

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid.toLong(), pwic, cbwic.toInt()).toUInt()

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun waveInGetID(hwi: HWAVEIN, pudeviceid: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetID(hwi, pudeviceid).toUInt()

public actual fun waveInGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetNumDevs().toUInt()

public actual fun waveInGetPosition(hwi: HWAVEIN, pmmt: Long, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInGetPosition(hwi, pmmt, cbmmt.toInt()).toUInt()

public actual fun waveInMessage(hwi: HWAVEIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInMessage(hwi, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun waveInOpen(phwi: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInOpen(phwi, udeviceid.toInt(), pwfx, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun waveInPrepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInPrepareHeader(hwi, pwh, cbwh.toInt()).toUInt()

public actual fun waveInReset(hwi: HWAVEIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInReset(hwi).toUInt()

public actual fun waveInStart(hwi: HWAVEIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInStart(hwi).toUInt()

public actual fun waveInStop(hwi: HWAVEIN): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInStop(hwi).toUInt()

public actual fun waveInUnprepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveInUnprepareHeader(hwi, pwh, cbwh.toInt()).toUInt()

public actual fun waveOutBreakLoop(hwo: HWAVEOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutBreakLoop(hwo).toUInt()

public actual fun waveOutClose(hwo: HWAVEOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutClose(hwo).toUInt()

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid.toLong(), pwoc, cbwoc.toInt()).toUInt()

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid.toLong(), pwoc, cbwoc.toInt()).toUInt()

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror.toInt(), psztext, cchtext.toInt()).toUInt()

public actual fun waveOutGetID(hwo: HWAVEOUT, pudeviceid: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetID(hwo, pudeviceid).toUInt()

public actual fun waveOutGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetNumDevs().toUInt()

public actual fun waveOutGetPitch(hwo: HWAVEOUT, pdwpitch: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetPitch(hwo, pdwpitch).toUInt()

public actual fun waveOutGetPlaybackRate(hwo: HWAVEOUT, pdwrate: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(hwo, pdwrate).toUInt()

public actual fun waveOutGetPosition(hwo: HWAVEOUT, pmmt: Long, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetPosition(hwo, pmmt, cbmmt.toInt()).toUInt()

public actual fun waveOutGetVolume(hwo: HWAVEOUT, pdwvolume: Long): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutGetVolume(hwo, pdwvolume).toUInt()

public actual fun waveOutMessage(hwo: HWAVEOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutMessage(hwo, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun waveOutOpen(phwo: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutOpen(phwo, udeviceid.toInt(), pwfx, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun waveOutPause(hwo: HWAVEOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutPause(hwo).toUInt()

public actual fun waveOutPrepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutPrepareHeader(hwo, pwh, cbwh.toInt()).toUInt()

public actual fun waveOutReset(hwo: HWAVEOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutReset(hwo).toUInt()

public actual fun waveOutRestart(hwo: HWAVEOUT): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutRestart(hwo).toUInt()

public actual fun waveOutSetPitch(hwo: HWAVEOUT, dwpitch: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutSetPitch(hwo, dwpitch.toInt()).toUInt()

public actual fun waveOutSetPlaybackRate(hwo: HWAVEOUT, dwrate: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(hwo, dwrate.toInt()).toUInt()

public actual fun waveOutSetVolume(hwo: HWAVEOUT, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutSetVolume(hwo, dwvolume.toInt()).toUInt()

public actual fun waveOutUnprepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutUnprepareHeader(hwo, pwh, cbwh.toInt()).toUInt()

public actual fun waveOutWrite(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssys_windows_win32_media_audio_waveOutWrite(hwo, pwh, cbwh.toInt()).toUInt()
