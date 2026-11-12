@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: ConstPtr<Guid>, activationparams: ConstPtr<Propvariant>, completionhandler: MutPtr<CVoid>, activationoperation: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync")

public actual fun coRegisterMessageFilter(lpmessagefilter: MutPtr<CVoid>, lplpmessagefilter: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCoRegisterMessageFilter")

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor")

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole")

public actual fun createRenderAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor")

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole")

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioPlaySoundA")

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioPlaySoundW")

public actual fun acmDriverAddA(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverAddA")

public actual fun acmDriverAddW(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverAddW")

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverClose")

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsa>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverDetailsA")

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsw>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverDetailsW")

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverEnum")

public actual fun acmDriverID(hao: Hacmobj, phadid: MutPtr<Hacmdriverid>, fdwdriverid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverID")

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverMessage")

public actual fun acmDriverOpen(phad: MutPtr<Hacmdriver>, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverOpen")

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverPriority")

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmDriverRemove")

public actual fun acmFilterChooseA(pafltrc: MutPtr<Acmfilterchoosea>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterChooseA")

public actual fun acmFilterChooseW(pafltrc: MutPtr<Acmfilterchoosew>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterChooseW")

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterDetailsA")

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterDetailsW")

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterEnumA")

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterEnumW")

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA")

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW")

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterTagEnumA")

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFilterTagEnumW")

public actual fun acmFormatChooseA(pafmtc: MutPtr<Acmformatchoosea>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatChooseA")

public actual fun acmFormatChooseW(pafmtc: MutPtr<Acmformatchoosew>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatChooseW")

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatDetailsA")

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatDetailsW")

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatEnumA")

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatEnumW")

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatSuggest")

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA")

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW")

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatTagEnumA")

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmFormatTagEnumW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioAcmGetVersion")
private external fun wasiWindowssysWindowsWin32MediaAudioAcmGetVersion(): Int

public actual fun acmGetVersion(): UInt =
    wasiWindowssysWindowsWin32MediaAudioAcmGetVersion().toUInt()

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmMetrics")

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamClose")

public actual fun acmStreamConvert(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwconvert: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamConvert")

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamMessage")

public actual fun acmStreamOpen(phas: MutPtr<Hacmstream>, had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, pwfltr: MutPtr<Wavefilter>, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamOpen")

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwprepare: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader")

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamReset")

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: MutPtr<UInt>, fdwsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamSize")

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwunprepare: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader")

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: MutPtr<Auxcapsa>, cbac: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAuxGetDevCapsA")

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: MutPtr<Auxcapsw>, cbac: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAuxGetDevCapsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioAuxGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaAudioAuxGetNumDevs(): Int

public actual fun auxGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaAudioAuxGetNumDevs().toUInt()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioAuxGetVolume")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioAuxOutMessage")
private external fun wasiWindowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid: Int, umsg: Int, dw1: Long, dw2: Long): Int

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    wasiWindowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioAuxSetVolume")
private external fun wasiWindowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid: Int, dwvolume: Int): Int

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    wasiWindowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid.toInt(), dwvolume.toInt()).toUInt()

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiConnect")

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiDisconnect")

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInAddBuffer")

public actual fun midiInClose(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInClose")

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: MutPtr<Midiincapsa>, cbmic: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInGetDevCapsA")

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: MutPtr<Midiincapsw>, cbmic: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInGetDevCapsW")

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInGetErrorTextA")

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInGetErrorTextW")

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInGetID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioMidiInGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaAudioMidiInGetNumDevs(): Int

public actual fun midiInGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaAudioMidiInGetNumDevs().toUInt()

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInMessage")

public actual fun midiInOpen(phmi: MutPtr<Hmidiin>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInOpen")

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInPrepareHeader")

public actual fun midiInReset(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInReset")

public actual fun midiInStart(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInStart")

public actual fun midiInStop(hmi: Hmidiin): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInStop")

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiInUnprepareHeader")

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: ConstPtr<UShort>, fucache: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches")

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: ConstPtr<UShort>, fucache: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutCachePatches")

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutClose")

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: MutPtr<Midioutcapsa>, cbmoc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA")

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: MutPtr<Midioutcapsw>, cbmoc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW")

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA")

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW")

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutGetID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioMidiOutGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaAudioMidiOutGetNumDevs(): Int

public actual fun midiOutGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaAudioMidiOutGetNumDevs().toUInt()

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutGetVolume")

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: ConstPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutLongMsg")

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutMessage")

public actual fun midiOutOpen(phmo: MutPtr<Hmidiout>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutOpen")

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutPrepareHeader")

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutReset")

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutSetVolume")

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutShortMsg")

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader")

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamClose")

public actual fun midiStreamOpen(phms: MutPtr<Hmidistrm>, pudeviceid: MutPtr<UInt>, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamOpen")

public actual fun midiStreamOut(hms: Hmidistrm, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamOut")

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamPause")

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamPosition")

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: MutPtr<UByte>, dwproperty: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamProperty")

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamRestart")

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMidiStreamStop")

public actual fun mixerClose(hmx: Hmixer): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerClose")

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetControlDetailsA")

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetControlDetailsW")

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: MutPtr<Mixercapsa>, cbmxcaps: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetDevCapsA")

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: MutPtr<Mixercapsw>, cbmxcaps: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetDevCapsW")

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: MutPtr<UInt>, fdwid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetID")

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsa>, fdwcontrols: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetLineControlsA")

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsw>, fdwcontrols: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetLineControlsW")

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinea>, fdwinfo: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetLineInfoA")

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinew>, fdwinfo: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerGetLineInfoW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioMixerGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaAudioMixerGetNumDevs(): Int

public actual fun mixerGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaAudioMixerGetNumDevs().toUInt()

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerMessage")

public actual fun mixerOpen(phmx: MutPtr<Hmixer>, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerOpen")

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: ConstPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioMixerSetControlDetails")

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioSndPlaySoundA")

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioSndPlaySoundW")

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInAddBuffer")

public actual fun waveInClose(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInClose")

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: MutPtr<Waveincapsa>, cbwic: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInGetDevCapsA")

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: MutPtr<Waveincapsw>, cbwic: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInGetDevCapsW")

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInGetErrorTextA")

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInGetErrorTextW")

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: ConstPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInGetID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioWaveInGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaAudioWaveInGetNumDevs(): Int

public actual fun waveInGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaAudioWaveInGetNumDevs().toUInt()

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInGetPosition")

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInMessage")

public actual fun waveInOpen(phwi: MutPtr<Hwavein>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInOpen")

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInPrepareHeader")

public actual fun waveInReset(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInReset")

public actual fun waveInStart(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInStart")

public actual fun waveInStop(hwi: Hwavein): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInStop")

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveInUnprepareHeader")

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutBreakLoop")

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutClose")

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsa>, cbwoc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA")

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsw>, cbwoc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW")

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA")

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW")

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaAudioWaveOutGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaAudioWaveOutGetNumDevs(): Int

public actual fun waveOutGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaAudioWaveOutGetNumDevs().toUInt()

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetPitch")

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate")

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetPosition")

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutGetVolume")

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutMessage")

public actual fun waveOutOpen(phwo: MutPtr<Hwaveout>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutOpen")

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutPause")

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutPrepareHeader")

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutReset")

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutRestart")

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutSetPitch")

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate")

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutSetVolume")

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader")

public actual fun waveOutWrite(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaAudioWaveOutWrite")
