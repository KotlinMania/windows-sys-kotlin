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

public actual fun ActivateAudioInterfaceAsync(deviceinterfacepath: PCWSTR, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): HRESULT =
    0

public actual fun CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): HRESULT =
    0

public actual fun CreateCaptureAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateCaptureAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateRenderAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateRenderAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    0

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    0

public actual fun PlaySoundA(pszsound: PCSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    0

public actual fun PlaySoundW(pszsound: PCWSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    0

public actual fun acmDriverAddA(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    0u

public actual fun acmDriverAddW(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    0u

public actual fun acmDriverClose(had: HACMDRIVER, fdwclose: UInt): UInt =
    0u

public actual fun acmDriverDetailsA(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmDriverDetailsW(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmDriverEnum(fncallback: ACMDRIVERENUMCB, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmDriverID(hao: HACMOBJ, phadid: Long, fdwdriverid: UInt): UInt =
    0u

public actual fun acmDriverMessage(had: HACMDRIVER, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    0L

public actual fun acmDriverOpen(phad: Long, hadid: HACMDRIVERID, fdwopen: UInt): UInt =
    0u

public actual fun acmDriverPriority(hadid: HACMDRIVERID, dwpriority: UInt, fdwpriority: UInt): UInt =
    0u

public actual fun acmDriverRemove(hadid: HACMDRIVERID, fdwremove: UInt): UInt =
    0u

public actual fun acmFilterChooseA(pafltrc: Long): UInt =
    0u

public actual fun acmFilterChooseW(pafltrc: Long): UInt =
    0u

public actual fun acmFilterDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFilterDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFilterEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFilterEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFilterTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFilterTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFilterTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFilterTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFormatChooseA(pafmtc: Long): UInt =
    0u

public actual fun acmFormatChooseW(pafmtc: Long): UInt =
    0u

public actual fun acmFormatDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFormatDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFormatEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFormatEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFormatSuggest(had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    0u

public actual fun acmFormatTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFormatTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun acmFormatTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmFormatTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    0u

public actual fun acmGetVersion(): UInt =
    0u

public actual fun acmMetrics(hao: HACMOBJ, umetric: UInt, pmetric: Long): UInt =
    0u

public actual fun acmStreamClose(has: HACMSTREAM, fdwclose: UInt): UInt =
    0u

public actual fun acmStreamConvert(has: HACMSTREAM, pash: Long, fdwconvert: UInt): UInt =
    0u

public actual fun acmStreamMessage(has: HACMSTREAM, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): UInt =
    0u

public actual fun acmStreamOpen(phas: Long, had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    0u

public actual fun acmStreamPrepareHeader(has: HACMSTREAM, pash: Long, fdwprepare: UInt): UInt =
    0u

public actual fun acmStreamReset(has: HACMSTREAM, fdwreset: UInt): UInt =
    0u

public actual fun acmStreamSize(has: HACMSTREAM, cbinput: UInt, pdwoutputbytes: Long, fdwsize: UInt): UInt =
    0u

public actual fun acmStreamUnprepareHeader(has: HACMSTREAM, pash: Long, fdwunprepare: UInt): UInt =
    0u

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    0u

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    0u

public actual fun auxGetNumDevs(): UInt =
    0u

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: Long): UInt =
    0u

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    0u

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    0u

public actual fun midiConnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    0u

public actual fun midiDisconnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    0u

public actual fun midiInAddBuffer(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiInClose(hmi: HMIDIIN): UInt =
    0u

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    0u

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    0u

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    0u

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    0u

public actual fun midiInGetID(hmi: HMIDIIN, pudeviceid: Long): UInt =
    0u

public actual fun midiInGetNumDevs(): UInt =
    0u

public actual fun midiInMessage(hmi: HMIDIIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    0u

public actual fun midiInOpen(phmi: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    0u

public actual fun midiInPrepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiInReset(hmi: HMIDIIN): UInt =
    0u

public actual fun midiInStart(hmi: HMIDIIN): UInt =
    0u

public actual fun midiInStop(hmi: HMIDIIN): UInt =
    0u

public actual fun midiInUnprepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiOutCacheDrumPatches(hmo: HMIDIOUT, upatch: UInt, pwkya: Long, fucache: UInt): UInt =
    0u

public actual fun midiOutCachePatches(hmo: HMIDIOUT, ubank: UInt, pwpa: Long, fucache: UInt): UInt =
    0u

public actual fun midiOutClose(hmo: HMIDIOUT): UInt =
    0u

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    0u

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    0u

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    0u

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    0u

public actual fun midiOutGetID(hmo: HMIDIOUT, pudeviceid: Long): UInt =
    0u

public actual fun midiOutGetNumDevs(): UInt =
    0u

public actual fun midiOutGetVolume(hmo: HMIDIOUT, pdwvolume: Long): UInt =
    0u

public actual fun midiOutLongMsg(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiOutMessage(hmo: HMIDIOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    0u

public actual fun midiOutOpen(phmo: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    0u

public actual fun midiOutPrepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiOutReset(hmo: HMIDIOUT): UInt =
    0u

public actual fun midiOutSetVolume(hmo: HMIDIOUT, dwvolume: UInt): UInt =
    0u

public actual fun midiOutShortMsg(hmo: HMIDIOUT, dwmsg: UInt): UInt =
    0u

public actual fun midiOutUnprepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiStreamClose(hms: HMIDISTRM): UInt =
    0u

public actual fun midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    0u

public actual fun midiStreamOut(hms: HMIDISTRM, pmh: Long, cbmh: UInt): UInt =
    0u

public actual fun midiStreamPause(hms: HMIDISTRM): UInt =
    0u

public actual fun midiStreamPosition(hms: HMIDISTRM, lpmmt: Long, cbmmt: UInt): UInt =
    0u

public actual fun midiStreamProperty(hms: HMIDISTRM, lppropdata: Long, dwproperty: UInt): UInt =
    0u

public actual fun midiStreamRestart(hms: HMIDISTRM): UInt =
    0u

public actual fun midiStreamStop(hms: HMIDISTRM): UInt =
    0u

public actual fun mixerClose(hmx: HMIXER): UInt =
    0u

public actual fun mixerGetControlDetailsA(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun mixerGetControlDetailsW(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    0u

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    0u

public actual fun mixerGetID(hmxobj: HMIXEROBJ, pumxid: Long, fdwid: UInt): UInt =
    0u

public actual fun mixerGetLineControlsA(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    0u

public actual fun mixerGetLineControlsW(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    0u

public actual fun mixerGetLineInfoA(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    0u

public actual fun mixerGetLineInfoW(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    0u

public actual fun mixerGetNumDevs(): UInt =
    0u

public actual fun mixerMessage(hmx: HMIXER, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    0u

public actual fun mixerOpen(phmx: Long, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    0u

public actual fun mixerSetControlDetails(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    0u

public actual fun sndPlaySoundA(pszsound: PCSTR, fusound: UInt): BOOL =
    0

public actual fun sndPlaySoundW(pszsound: PCWSTR, fusound: UInt): BOOL =
    0

public actual fun waveInAddBuffer(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    0u

public actual fun waveInClose(hwi: HWAVEIN): UInt =
    0u

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    0u

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    0u

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    0u

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    0u

public actual fun waveInGetID(hwi: HWAVEIN, pudeviceid: Long): UInt =
    0u

public actual fun waveInGetNumDevs(): UInt =
    0u

public actual fun waveInGetPosition(hwi: HWAVEIN, pmmt: Long, cbmmt: UInt): UInt =
    0u

public actual fun waveInMessage(hwi: HWAVEIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    0u

public actual fun waveInOpen(phwi: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    0u

public actual fun waveInPrepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    0u

public actual fun waveInReset(hwi: HWAVEIN): UInt =
    0u

public actual fun waveInStart(hwi: HWAVEIN): UInt =
    0u

public actual fun waveInStop(hwi: HWAVEIN): UInt =
    0u

public actual fun waveInUnprepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    0u

public actual fun waveOutBreakLoop(hwo: HWAVEOUT): UInt =
    0u

public actual fun waveOutClose(hwo: HWAVEOUT): UInt =
    0u

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    0u

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    0u

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    0u

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    0u

public actual fun waveOutGetID(hwo: HWAVEOUT, pudeviceid: Long): UInt =
    0u

public actual fun waveOutGetNumDevs(): UInt =
    0u

public actual fun waveOutGetPitch(hwo: HWAVEOUT, pdwpitch: Long): UInt =
    0u

public actual fun waveOutGetPlaybackRate(hwo: HWAVEOUT, pdwrate: Long): UInt =
    0u

public actual fun waveOutGetPosition(hwo: HWAVEOUT, pmmt: Long, cbmmt: UInt): UInt =
    0u

public actual fun waveOutGetVolume(hwo: HWAVEOUT, pdwvolume: Long): UInt =
    0u

public actual fun waveOutMessage(hwo: HWAVEOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    0u

public actual fun waveOutOpen(phwo: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    0u

public actual fun waveOutPause(hwo: HWAVEOUT): UInt =
    0u

public actual fun waveOutPrepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    0u

public actual fun waveOutReset(hwo: HWAVEOUT): UInt =
    0u

public actual fun waveOutRestart(hwo: HWAVEOUT): UInt =
    0u

public actual fun waveOutSetPitch(hwo: HWAVEOUT, dwpitch: UInt): UInt =
    0u

public actual fun waveOutSetPlaybackRate(hwo: HWAVEOUT, dwrate: UInt): UInt =
    0u

public actual fun waveOutSetVolume(hwo: HWAVEOUT, dwvolume: UInt): UInt =
    0u

public actual fun waveOutUnprepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    0u

public actual fun waveOutWrite(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    0u
