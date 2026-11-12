package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.media.Mmtime
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

public expect fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: ConstPtr<Guid>, activationparams: ConstPtr<Propvariant>, completionhandler: MutPtr<CVoid>, activationoperation: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coRegisterMessageFilter(lpmessagefilter: MutPtr<CVoid>, lplpmessagefilter: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createCaptureAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createRenderAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool

public expect fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool

public expect fun acmDriverAddA(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt

public expect fun acmDriverAddW(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt

public expect fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt

public expect fun acmDriverDetailsA(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsa>, fdwdetails: UInt): UInt

public expect fun acmDriverDetailsW(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsw>, fdwdetails: UInt): UInt

public expect fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmDriverID(hao: Hacmobj, phadid: MutPtr<Hacmdriverid>, fdwdriverid: UInt): UInt

public expect fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun acmDriverOpen(phad: MutPtr<Hacmdriver>, hadid: Hacmdriverid, fdwopen: UInt): UInt

public expect fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt

public expect fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt

public expect fun acmFilterChooseA(pafltrc: MutPtr<Acmfilterchoosea>): UInt

public expect fun acmFilterChooseW(pafltrc: MutPtr<Acmfilterchoosew>): UInt

public expect fun acmFilterDetailsA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fdwdetails: UInt): UInt

public expect fun acmFilterDetailsW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fdwdetails: UInt): UInt

public expect fun acmFilterEnumA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFilterEnumW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFilterTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fdwdetails: UInt): UInt

public expect fun acmFilterTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fdwdetails: UInt): UInt

public expect fun acmFilterTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFilterTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatChooseA(pafmtc: MutPtr<Acmformatchoosea>): UInt

public expect fun acmFormatChooseW(pafmtc: MutPtr<Acmformatchoosew>): UInt

public expect fun acmFormatDetailsA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fdwdetails: UInt): UInt

public expect fun acmFormatDetailsW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fdwdetails: UInt): UInt

public expect fun acmFormatEnumA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatEnumW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, cbwfxdst: UInt, fdwsuggest: UInt): UInt

public expect fun acmFormatTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fdwdetails: UInt): UInt

public expect fun acmFormatTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fdwdetails: UInt): UInt

public expect fun acmFormatTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmFormatTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt

public expect fun acmGetVersion(): UInt

public expect fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: MutPtr<CVoid>): UInt

public expect fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt

public expect fun acmStreamConvert(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwconvert: UInt): UInt

public expect fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt

public expect fun acmStreamOpen(phas: MutPtr<Hacmstream>, had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, pwfltr: MutPtr<Wavefilter>, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt

public expect fun acmStreamPrepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwprepare: UInt): UInt

public expect fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt

public expect fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: MutPtr<UInt>, fdwsize: UInt): UInt

public expect fun acmStreamUnprepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwunprepare: UInt): UInt

public expect fun auxGetDevCapsA(udeviceid: ULong, pac: MutPtr<Auxcapsa>, cbac: UInt): UInt

public expect fun auxGetDevCapsW(udeviceid: ULong, pac: MutPtr<Auxcapsw>, cbac: UInt): UInt

public expect fun auxGetNumDevs(): UInt

public expect fun auxGetVolume(udeviceid: UInt, pdwvolume: MutPtr<UInt>): UInt

public expect fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt

public expect fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt

public expect fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt

public expect fun midiInAddBuffer(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiInClose(hmi: Hmidiin): UInt

public expect fun midiInGetDevCapsA(udeviceid: ULong, pmic: MutPtr<Midiincapsa>, cbmic: UInt): UInt

public expect fun midiInGetDevCapsW(udeviceid: ULong, pmic: MutPtr<Midiincapsw>, cbmic: UInt): UInt

public expect fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt

public expect fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt

public expect fun midiInGetID(hmi: Hmidiin, pudeviceid: MutPtr<UInt>): UInt

public expect fun midiInGetNumDevs(): UInt

public expect fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun midiInOpen(phmi: MutPtr<Hmidiin>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt

public expect fun midiInPrepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiInReset(hmi: Hmidiin): UInt

public expect fun midiInStart(hmi: Hmidiin): UInt

public expect fun midiInStop(hmi: Hmidiin): UInt

public expect fun midiInUnprepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: ConstPtr<UShort>, fucache: UInt): UInt

public expect fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: ConstPtr<UShort>, fucache: UInt): UInt

public expect fun midiOutClose(hmo: Hmidiout): UInt

public expect fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: MutPtr<Midioutcapsa>, cbmoc: UInt): UInt

public expect fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: MutPtr<Midioutcapsw>, cbmoc: UInt): UInt

public expect fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt

public expect fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt

public expect fun midiOutGetID(hmo: Hmidiout, pudeviceid: MutPtr<UInt>): UInt

public expect fun midiOutGetNumDevs(): UInt

public expect fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: MutPtr<UInt>): UInt

public expect fun midiOutLongMsg(hmo: Hmidiout, pmh: ConstPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun midiOutOpen(phmo: MutPtr<Hmidiout>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt

public expect fun midiOutPrepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiOutReset(hmo: Hmidiout): UInt

public expect fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt

public expect fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt

public expect fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiStreamClose(hms: Hmidistrm): UInt

public expect fun midiStreamOpen(phms: MutPtr<Hmidistrm>, pudeviceid: MutPtr<UInt>, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt

public expect fun midiStreamOut(hms: Hmidistrm, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt

public expect fun midiStreamPause(hms: Hmidistrm): UInt

public expect fun midiStreamPosition(hms: Hmidistrm, lpmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt

public expect fun midiStreamProperty(hms: Hmidistrm, lppropdata: MutPtr<UByte>, dwproperty: UInt): UInt

public expect fun midiStreamRestart(hms: Hmidistrm): UInt

public expect fun midiStreamStop(hms: Hmidistrm): UInt

public expect fun mixerClose(hmx: Hmixer): UInt

public expect fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt

public expect fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt

public expect fun mixerGetDevCapsA(umxid: ULong, pmxcaps: MutPtr<Mixercapsa>, cbmxcaps: UInt): UInt

public expect fun mixerGetDevCapsW(umxid: ULong, pmxcaps: MutPtr<Mixercapsw>, cbmxcaps: UInt): UInt

public expect fun mixerGetID(hmxobj: Hmixerobj, pumxid: MutPtr<UInt>, fdwid: UInt): UInt

public expect fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsa>, fdwcontrols: UInt): UInt

public expect fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsw>, fdwcontrols: UInt): UInt

public expect fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinea>, fdwinfo: UInt): UInt

public expect fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinew>, fdwinfo: UInt): UInt

public expect fun mixerGetNumDevs(): UInt

public expect fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt

public expect fun mixerOpen(phmx: MutPtr<Hmixer>, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt

public expect fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: ConstPtr<Mixercontroldetails>, fdwdetails: UInt): UInt

public expect fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool

public expect fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool

public expect fun waveInAddBuffer(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt

public expect fun waveInClose(hwi: Hwavein): UInt

public expect fun waveInGetDevCapsA(udeviceid: ULong, pwic: MutPtr<Waveincapsa>, cbwic: UInt): UInt

public expect fun waveInGetDevCapsW(udeviceid: ULong, pwic: MutPtr<Waveincapsw>, cbwic: UInt): UInt

public expect fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt

public expect fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt

public expect fun waveInGetID(hwi: Hwavein, pudeviceid: ConstPtr<UInt>): UInt

public expect fun waveInGetNumDevs(): UInt

public expect fun waveInGetPosition(hwi: Hwavein, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt

public expect fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun waveInOpen(phwi: MutPtr<Hwavein>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt

public expect fun waveInPrepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt

public expect fun waveInReset(hwi: Hwavein): UInt

public expect fun waveInStart(hwi: Hwavein): UInt

public expect fun waveInStop(hwi: Hwavein): UInt

public expect fun waveInUnprepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt

public expect fun waveOutBreakLoop(hwo: Hwaveout): UInt

public expect fun waveOutClose(hwo: Hwaveout): UInt

public expect fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsa>, cbwoc: UInt): UInt

public expect fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsw>, cbwoc: UInt): UInt

public expect fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt

public expect fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt

public expect fun waveOutGetID(hwo: Hwaveout, pudeviceid: MutPtr<UInt>): UInt

public expect fun waveOutGetNumDevs(): UInt

public expect fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: MutPtr<UInt>): UInt

public expect fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: MutPtr<UInt>): UInt

public expect fun waveOutGetPosition(hwo: Hwaveout, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt

public expect fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: MutPtr<UInt>): UInt

public expect fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt

public expect fun waveOutOpen(phwo: MutPtr<Hwaveout>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt

public expect fun waveOutPause(hwo: Hwaveout): UInt

public expect fun waveOutPrepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt

public expect fun waveOutReset(hwo: Hwaveout): UInt

public expect fun waveOutRestart(hwo: Hwaveout): UInt

public expect fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt

public expect fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt

public expect fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt

public expect fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt

public expect fun waveOutWrite(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt
