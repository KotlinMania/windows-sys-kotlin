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

public expect fun ActivateAudioInterfaceAsync(deviceinterfacepath: PCWSTR, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): HRESULT

public expect fun CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): HRESULT

public expect fun CreateCaptureAudioStateMonitor(audiostatemonitor: Long): HRESULT

public expect fun CreateCaptureAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT

public expect fun CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT

public expect fun CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT

public expect fun CreateRenderAudioStateMonitor(audiostatemonitor: Long): HRESULT

public expect fun CreateRenderAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT

public expect fun CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT

public expect fun CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT

public expect fun PlaySoundA(pszsound: PCSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL

public expect fun PlaySoundW(pszsound: PCWSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL

public expect fun acmDriverAddA(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt

public expect fun acmDriverAddW(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt

public expect fun acmDriverClose(had: HACMDRIVER, fdwclose: UInt): UInt

public expect fun acmDriverDetailsA(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt

public expect fun acmDriverDetailsW(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt

public expect fun acmDriverEnum(fncallback: ACMDRIVERENUMCB, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmDriverID(hao: HACMOBJ, phadid: Long, fdwdriverid: UInt): UInt

public expect fun acmDriverMessage(had: HACMDRIVER, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT

public expect fun acmDriverOpen(phad: Long, hadid: HACMDRIVERID, fdwopen: UInt): UInt

public expect fun acmDriverPriority(hadid: HACMDRIVERID, dwpriority: UInt, fdwpriority: UInt): UInt

public expect fun acmDriverRemove(hadid: HACMDRIVERID, fdwremove: UInt): UInt

public expect fun acmFilterChooseA(pafltrc: Long): UInt

public expect fun acmFilterChooseW(pafltrc: Long): UInt

public expect fun acmFilterDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt

public expect fun acmFilterDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt

public expect fun acmFilterEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFilterEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFilterTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt

public expect fun acmFilterTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt

public expect fun acmFilterTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFilterTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatChooseA(pafmtc: Long): UInt

public expect fun acmFormatChooseW(pafmtc: Long): UInt

public expect fun acmFormatDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt

public expect fun acmFormatDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt

public expect fun acmFormatEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatSuggest(had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: UInt, fdwsuggest: UInt): UInt

public expect fun acmFormatTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt

public expect fun acmFormatTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt

public expect fun acmFormatTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmGetVersion(): UInt

public expect fun acmMetrics(hao: HACMOBJ, umetric: UInt, pmetric: Long): UInt

public expect fun acmStreamClose(has: HACMSTREAM, fdwclose: UInt): UInt

public expect fun acmStreamConvert(has: HACMSTREAM, pash: Long, fdwconvert: UInt): UInt

public expect fun acmStreamMessage(has: HACMSTREAM, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): UInt

public expect fun acmStreamOpen(phas: Long, had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt

public expect fun acmStreamPrepareHeader(has: HACMSTREAM, pash: Long, fdwprepare: UInt): UInt

public expect fun acmStreamReset(has: HACMSTREAM, fdwreset: UInt): UInt

public expect fun acmStreamSize(has: HACMSTREAM, cbinput: UInt, pdwoutputbytes: Long, fdwsize: UInt): UInt

public expect fun acmStreamUnprepareHeader(has: HACMSTREAM, pash: Long, fdwunprepare: UInt): UInt

public expect fun auxGetDevCapsA(udeviceid: ULong, pac: Long, cbac: UInt): UInt

public expect fun auxGetDevCapsW(udeviceid: ULong, pac: Long, cbac: UInt): UInt

public expect fun auxGetNumDevs(): UInt

public expect fun auxGetVolume(udeviceid: UInt, pdwvolume: Long): UInt

public expect fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt

public expect fun midiConnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt

public expect fun midiDisconnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt

public expect fun midiInAddBuffer(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt

public expect fun midiInClose(hmi: HMIDIIN): UInt

public expect fun midiInGetDevCapsA(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt

public expect fun midiInGetDevCapsW(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt

public expect fun midiInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt

public expect fun midiInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt

public expect fun midiInGetID(hmi: HMIDIIN, pudeviceid: Long): UInt

public expect fun midiInGetNumDevs(): UInt

public expect fun midiInMessage(hmi: HMIDIIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun midiInOpen(phmi: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt

public expect fun midiInPrepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt

public expect fun midiInReset(hmi: HMIDIIN): UInt

public expect fun midiInStart(hmi: HMIDIIN): UInt

public expect fun midiInStop(hmi: HMIDIIN): UInt

public expect fun midiInUnprepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt

public expect fun midiOutCacheDrumPatches(hmo: HMIDIOUT, upatch: UInt, pwkya: Long, fucache: UInt): UInt

public expect fun midiOutCachePatches(hmo: HMIDIOUT, ubank: UInt, pwpa: Long, fucache: UInt): UInt

public expect fun midiOutClose(hmo: HMIDIOUT): UInt

public expect fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt

public expect fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt

public expect fun midiOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt

public expect fun midiOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt

public expect fun midiOutGetID(hmo: HMIDIOUT, pudeviceid: Long): UInt

public expect fun midiOutGetNumDevs(): UInt

public expect fun midiOutGetVolume(hmo: HMIDIOUT, pdwvolume: Long): UInt

public expect fun midiOutLongMsg(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt

public expect fun midiOutMessage(hmo: HMIDIOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun midiOutOpen(phmo: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt

public expect fun midiOutPrepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt

public expect fun midiOutReset(hmo: HMIDIOUT): UInt

public expect fun midiOutSetVolume(hmo: HMIDIOUT, dwvolume: UInt): UInt

public expect fun midiOutShortMsg(hmo: HMIDIOUT, dwmsg: UInt): UInt

public expect fun midiOutUnprepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt

public expect fun midiStreamClose(hms: HMIDISTRM): UInt

public expect fun midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt

public expect fun midiStreamOut(hms: HMIDISTRM, pmh: Long, cbmh: UInt): UInt

public expect fun midiStreamPause(hms: HMIDISTRM): UInt

public expect fun midiStreamPosition(hms: HMIDISTRM, lpmmt: Long, cbmmt: UInt): UInt

public expect fun midiStreamProperty(hms: HMIDISTRM, lppropdata: Long, dwproperty: UInt): UInt

public expect fun midiStreamRestart(hms: HMIDISTRM): UInt

public expect fun midiStreamStop(hms: HMIDISTRM): UInt

public expect fun mixerClose(hmx: HMIXER): UInt

public expect fun mixerGetControlDetailsA(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt

public expect fun mixerGetControlDetailsW(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt

public expect fun mixerGetDevCapsA(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt

public expect fun mixerGetDevCapsW(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt

public expect fun mixerGetID(hmxobj: HMIXEROBJ, pumxid: Long, fdwid: UInt): UInt

public expect fun mixerGetLineControlsA(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt

public expect fun mixerGetLineControlsW(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt

public expect fun mixerGetLineInfoA(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt

public expect fun mixerGetLineInfoW(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt

public expect fun mixerGetNumDevs(): UInt

public expect fun mixerMessage(hmx: HMIXER, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt

public expect fun mixerOpen(phmx: Long, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt

public expect fun mixerSetControlDetails(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt

public expect fun sndPlaySoundA(pszsound: PCSTR, fusound: UInt): BOOL

public expect fun sndPlaySoundW(pszsound: PCWSTR, fusound: UInt): BOOL

public expect fun waveInAddBuffer(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt

public expect fun waveInClose(hwi: HWAVEIN): UInt

public expect fun waveInGetDevCapsA(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt

public expect fun waveInGetDevCapsW(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt

public expect fun waveInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt

public expect fun waveInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt

public expect fun waveInGetID(hwi: HWAVEIN, pudeviceid: Long): UInt

public expect fun waveInGetNumDevs(): UInt

public expect fun waveInGetPosition(hwi: HWAVEIN, pmmt: Long, cbmmt: UInt): UInt

public expect fun waveInMessage(hwi: HWAVEIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun waveInOpen(phwi: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt

public expect fun waveInPrepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt

public expect fun waveInReset(hwi: HWAVEIN): UInt

public expect fun waveInStart(hwi: HWAVEIN): UInt

public expect fun waveInStop(hwi: HWAVEIN): UInt

public expect fun waveInUnprepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt

public expect fun waveOutBreakLoop(hwo: HWAVEOUT): UInt

public expect fun waveOutClose(hwo: HWAVEOUT): UInt

public expect fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt

public expect fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt

public expect fun waveOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt

public expect fun waveOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt

public expect fun waveOutGetID(hwo: HWAVEOUT, pudeviceid: Long): UInt

public expect fun waveOutGetNumDevs(): UInt

public expect fun waveOutGetPitch(hwo: HWAVEOUT, pdwpitch: Long): UInt

public expect fun waveOutGetPlaybackRate(hwo: HWAVEOUT, pdwrate: Long): UInt

public expect fun waveOutGetPosition(hwo: HWAVEOUT, pmmt: Long, cbmmt: UInt): UInt

public expect fun waveOutGetVolume(hwo: HWAVEOUT, pdwvolume: Long): UInt

public expect fun waveOutMessage(hwo: HWAVEOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun waveOutOpen(phwo: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt

public expect fun waveOutPause(hwo: HWAVEOUT): UInt

public expect fun waveOutPrepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt

public expect fun waveOutReset(hwo: HWAVEOUT): UInt

public expect fun waveOutRestart(hwo: HWAVEOUT): UInt

public expect fun waveOutSetPitch(hwo: HWAVEOUT, dwpitch: UInt): UInt

public expect fun waveOutSetPlaybackRate(hwo: HWAVEOUT, dwrate: UInt): UInt

public expect fun waveOutSetVolume(hwo: HWAVEOUT, dwvolume: UInt): UInt

public expect fun waveOutUnprepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt

public expect fun waveOutWrite(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt
