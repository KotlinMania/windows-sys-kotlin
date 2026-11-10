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

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: COpaquePointer?, activationparams: COpaquePointer?, completionhandler: COpaquePointer?, activationoperation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun coRegisterMessageFilter(lpmessagefilter: COpaquePointer?, lplpmessagefilter: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRenderAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverAddA(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverAddW(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverID(hao: Hacmobj, phadid: COpaquePointer?, fdwdriverid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverOpen(phad: COpaquePointer?, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterChooseA(pafltrc: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterChooseW(pafltrc: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatChooseA(pafmtc: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatChooseW(pafmtc: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmGetVersion(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamConvert(has: Hacmstream, pash: COpaquePointer?, fdwconvert: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamOpen(phas: COpaquePointer?, had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, pwfltr: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwprepare: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: COpaquePointer?, fdwsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwunprepare: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auxGetNumDevs(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInClose(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInGetNumDevs(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInOpen(phmi: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInReset(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInStart(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInStop(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: COpaquePointer?, fucache: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: COpaquePointer?, fucache: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetNumDevs(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutOpen(phmo: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamOpen(phms: COpaquePointer?, pudeviceid: COpaquePointer?, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamOut(hms: Hmidistrm, pmh: COpaquePointer?, cbmh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: COpaquePointer?, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: COpaquePointer?, dwproperty: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerClose(hmx: Hmixer): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: COpaquePointer?, fdwid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerGetNumDevs(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerOpen(phmx: COpaquePointer?, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInClose(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetNumDevs(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInOpen(phwi: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInReset(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInStart(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInStop(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetNumDevs(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutOpen(phwo: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waveOutWrite(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
