@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ActivateAudioInterfaceAsync(deviceinterfacepath: PCWSTR, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_ActivateAudioInterfaceAsync(deviceinterfacepath.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), activationparams.toCPointer<ByteVar>(), completionhandler.toCPointer<ByteVar>(), activationoperation.toCPointer<ByteVar>())

public actual fun CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CoRegisterMessageFilter(lpmessagefilter.toCPointer<ByteVar>(), lplpmessagefilter.toCPointer<ByteVar>())

public actual fun CreateCaptureAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitor(audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateCaptureAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid.toCPointer<ByteVar>(), audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateRenderAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitor(audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateRenderAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategory(category, audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid.toCPointer<ByteVar>(), audiostatemonitor.toCPointer<ByteVar>())

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.toCPointer<ByteVar>())

public actual fun PlaySoundA(pszsound: PCSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_PlaySoundA(pszsound.toCPointer<ByteVar>(), hmod.toCPointer<ByteVar>(), fdwsound)

public actual fun PlaySoundW(pszsound: PCWSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_PlaySoundW(pszsound.toCPointer<ByteVar>(), hmod.toCPointer<ByteVar>(), fdwsound)

public actual fun acmDriverAddA(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverAddA(phadid.toCPointer<ByteVar>(), hinstmodule.toCPointer<ByteVar>(), lparam, dwpriority, fdwadd)

public actual fun acmDriverAddW(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverAddW(phadid.toCPointer<ByteVar>(), hinstmodule.toCPointer<ByteVar>(), lparam, dwpriority, fdwadd)

public actual fun acmDriverClose(had: HACMDRIVER, fdwclose: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverClose(had.toCPointer<ByteVar>(), fdwclose)

public actual fun acmDriverDetailsA(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverDetailsA(hadid.toCPointer<ByteVar>(), padd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmDriverDetailsW(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverDetailsW(hadid.toCPointer<ByteVar>(), padd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmDriverEnum(fncallback: ACMDRIVERENUMCB, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverEnum(fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmDriverID(hao: HACMOBJ, phadid: Long, fdwdriverid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverID(hao.toCPointer<ByteVar>(), phadid.toCPointer<ByteVar>(), fdwdriverid)

public actual fun acmDriverMessage(had: HACMDRIVER, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverMessage(had.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun acmDriverOpen(phad: Long, hadid: HACMDRIVERID, fdwopen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverOpen(phad.toCPointer<ByteVar>(), hadid.toCPointer<ByteVar>(), fdwopen)

public actual fun acmDriverPriority(hadid: HACMDRIVERID, dwpriority: UInt, fdwpriority: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverPriority(hadid.toCPointer<ByteVar>(), dwpriority, fdwpriority)

public actual fun acmDriverRemove(hadid: HACMDRIVERID, fdwremove: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverRemove(hadid.toCPointer<ByteVar>(), fdwremove)

public actual fun acmFilterChooseA(pafltrc: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterChooseA(pafltrc.toCPointer<ByteVar>())

public actual fun acmFilterChooseW(pafltrc: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterChooseW(pafltrc.toCPointer<ByteVar>())

public actual fun acmFilterDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterDetailsA(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterDetailsW(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterEnumA(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterEnumW(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagDetailsA(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagDetailsW(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagEnumA(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagEnumW(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatChooseA(pafmtc: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatChooseA(pafmtc.toCPointer<ByteVar>())

public actual fun acmFormatChooseW(pafmtc: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatChooseW(pafmtc.toCPointer<ByteVar>())

public actual fun acmFormatDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatDetailsA(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatDetailsW(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatEnumA(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatEnumW(had.toCPointer<ByteVar>(), pafd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatSuggest(had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatSuggest(had.toCPointer<ByteVar>(), pwfxsrc.toCPointer<ByteVar>(), pwfxdst.toCPointer<ByteVar>(), cbwfxdst, fdwsuggest)

public actual fun acmFormatTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagDetailsA(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagDetailsW(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagEnumA(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagEnumW(had.toCPointer<ByteVar>(), paftd.toCPointer<ByteVar>(), fncallback.toLong().toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmGetVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmGetVersion()

public actual fun acmMetrics(hao: HACMOBJ, umetric: UInt, pmetric: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmMetrics(hao.toCPointer<ByteVar>(), umetric, pmetric.toCPointer<ByteVar>())

public actual fun acmStreamClose(has: HACMSTREAM, fdwclose: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamClose(has.toCPointer<ByteVar>(), fdwclose)

public actual fun acmStreamConvert(has: HACMSTREAM, pash: Long, fdwconvert: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamConvert(has.toCPointer<ByteVar>(), pash.toCPointer<ByteVar>(), fdwconvert)

public actual fun acmStreamMessage(has: HACMSTREAM, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamMessage(has.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun acmStreamOpen(phas: Long, had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamOpen(phas.toCPointer<ByteVar>(), had.toCPointer<ByteVar>(), pwfxsrc.toCPointer<ByteVar>(), pwfxdst.toCPointer<ByteVar>(), pwfltr.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun acmStreamPrepareHeader(has: HACMSTREAM, pash: Long, fdwprepare: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamPrepareHeader(has.toCPointer<ByteVar>(), pash.toCPointer<ByteVar>(), fdwprepare)

public actual fun acmStreamReset(has: HACMSTREAM, fdwreset: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamReset(has.toCPointer<ByteVar>(), fdwreset)

public actual fun acmStreamSize(has: HACMSTREAM, cbinput: UInt, pdwoutputbytes: Long, fdwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamSize(has.toCPointer<ByteVar>(), cbinput, pdwoutputbytes.toCPointer<ByteVar>(), fdwsize)

public actual fun acmStreamUnprepareHeader(has: HACMSTREAM, pash: Long, fdwunprepare: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(has.toCPointer<ByteVar>(), pash.toCPointer<ByteVar>(), fdwunprepare)

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid, pac.toCPointer<ByteVar>(), cbac)

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid, pac.toCPointer<ByteVar>(), cbac)

public actual fun auxGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetNumDevs()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetVolume(udeviceid, pdwvolume.toCPointer<ByteVar>())

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxOutMessage(udeviceid, umsg, dw1, dw2)

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxSetVolume(udeviceid, dwvolume)

public actual fun midiConnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiConnect(hmi.toCPointer<ByteVar>(), hmo.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun midiDisconnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiDisconnect(hmi.toCPointer<ByteVar>(), hmo.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun midiInAddBuffer(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInAddBuffer(hmi.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiInClose(hmi: HMIDIIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInClose(hmi.toCPointer<ByteVar>())

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid, pmic.toCPointer<ByteVar>(), cbmic)

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid, pmic.toCPointer<ByteVar>(), cbmic)

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun midiInGetID(hmi: HMIDIIN, pudeviceid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetID(hmi.toCPointer<ByteVar>(), pudeviceid.toCPointer<ByteVar>())

public actual fun midiInGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetNumDevs()

public actual fun midiInMessage(hmi: HMIDIIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInMessage(hmi.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun midiInOpen(phmi: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInOpen(phmi.toCPointer<ByteVar>(), udeviceid, dwcallback, dwinstance, fdwopen)

public actual fun midiInPrepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInPrepareHeader(hmi.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiInReset(hmi: HMIDIIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInReset(hmi.toCPointer<ByteVar>())

public actual fun midiInStart(hmi: HMIDIIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInStart(hmi.toCPointer<ByteVar>())

public actual fun midiInStop(hmi: HMIDIIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInStop(hmi.toCPointer<ByteVar>())

public actual fun midiInUnprepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInUnprepareHeader(hmi.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutCacheDrumPatches(hmo: HMIDIOUT, upatch: UInt, pwkya: Long, fucache: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(hmo.toCPointer<ByteVar>(), upatch, pwkya.toCPointer<ByteVar>(), fucache)

public actual fun midiOutCachePatches(hmo: HMIDIOUT, ubank: UInt, pwpa: Long, fucache: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutCachePatches(hmo.toCPointer<ByteVar>(), ubank, pwpa.toCPointer<ByteVar>(), fucache)

public actual fun midiOutClose(hmo: HMIDIOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutClose(hmo.toCPointer<ByteVar>())

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid, pmoc.toCPointer<ByteVar>(), cbmoc)

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid, pmoc.toCPointer<ByteVar>(), cbmoc)

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun midiOutGetID(hmo: HMIDIOUT, pudeviceid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetID(hmo.toCPointer<ByteVar>(), pudeviceid.toCPointer<ByteVar>())

public actual fun midiOutGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetNumDevs()

public actual fun midiOutGetVolume(hmo: HMIDIOUT, pdwvolume: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetVolume(hmo.toCPointer<ByteVar>(), pdwvolume.toCPointer<ByteVar>())

public actual fun midiOutLongMsg(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutLongMsg(hmo.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutMessage(hmo: HMIDIOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutMessage(hmo.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun midiOutOpen(phmo: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutOpen(phmo.toCPointer<ByteVar>(), udeviceid, dwcallback, dwinstance, fdwopen)

public actual fun midiOutPrepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutPrepareHeader(hmo.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutReset(hmo: HMIDIOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutReset(hmo.toCPointer<ByteVar>())

public actual fun midiOutSetVolume(hmo: HMIDIOUT, dwvolume: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutSetVolume(hmo.toCPointer<ByteVar>(), dwvolume)

public actual fun midiOutShortMsg(hmo: HMIDIOUT, dwmsg: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutShortMsg(hmo.toCPointer<ByteVar>(), dwmsg)

public actual fun midiOutUnprepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutUnprepareHeader(hmo.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiStreamClose(hms: HMIDISTRM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamClose(hms.toCPointer<ByteVar>())

public actual fun midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamOpen(phms.toCPointer<ByteVar>(), pudeviceid.toCPointer<ByteVar>(), cmidi, dwcallback, dwinstance, fdwopen)

public actual fun midiStreamOut(hms: HMIDISTRM, pmh: Long, cbmh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamOut(hms.toCPointer<ByteVar>(), pmh.toCPointer<ByteVar>(), cbmh)

public actual fun midiStreamPause(hms: HMIDISTRM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamPause(hms.toCPointer<ByteVar>())

public actual fun midiStreamPosition(hms: HMIDISTRM, lpmmt: Long, cbmmt: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamPosition(hms.toCPointer<ByteVar>(), lpmmt.toCPointer<ByteVar>(), cbmmt)

public actual fun midiStreamProperty(hms: HMIDISTRM, lppropdata: Long, dwproperty: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamProperty(hms.toCPointer<ByteVar>(), lppropdata.toCPointer<ByteVar>(), dwproperty)

public actual fun midiStreamRestart(hms: HMIDISTRM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamRestart(hms.toCPointer<ByteVar>())

public actual fun midiStreamStop(hms: HMIDISTRM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamStop(hms.toCPointer<ByteVar>())

public actual fun mixerClose(hmx: HMIXER): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerClose(hmx.toCPointer<ByteVar>())

public actual fun mixerGetControlDetailsA(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetControlDetailsA(hmxobj.toCPointer<ByteVar>(), pmxcd.toCPointer<ByteVar>(), fdwdetails)

public actual fun mixerGetControlDetailsW(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetControlDetailsW(hmxobj.toCPointer<ByteVar>(), pmxcd.toCPointer<ByteVar>(), fdwdetails)

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid, pmxcaps.toCPointer<ByteVar>(), cbmxcaps)

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid, pmxcaps.toCPointer<ByteVar>(), cbmxcaps)

public actual fun mixerGetID(hmxobj: HMIXEROBJ, pumxid: Long, fdwid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetID(hmxobj.toCPointer<ByteVar>(), pumxid.toCPointer<ByteVar>(), fdwid)

public actual fun mixerGetLineControlsA(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineControlsA(hmxobj.toCPointer<ByteVar>(), pmxlc.toCPointer<ByteVar>(), fdwcontrols)

public actual fun mixerGetLineControlsW(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineControlsW(hmxobj.toCPointer<ByteVar>(), pmxlc.toCPointer<ByteVar>(), fdwcontrols)

public actual fun mixerGetLineInfoA(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineInfoA(hmxobj.toCPointer<ByteVar>(), pmxl.toCPointer<ByteVar>(), fdwinfo)

public actual fun mixerGetLineInfoW(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineInfoW(hmxobj.toCPointer<ByteVar>(), pmxl.toCPointer<ByteVar>(), fdwinfo)

public actual fun mixerGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetNumDevs()

public actual fun mixerMessage(hmx: HMIXER, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerMessage(hmx.toCPointer<ByteVar>(), umsg, dwparam1, dwparam2)

public actual fun mixerOpen(phmx: Long, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerOpen(phmx.toCPointer<ByteVar>(), umxid, dwcallback, dwinstance, fdwopen)

public actual fun mixerSetControlDetails(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerSetControlDetails(hmxobj.toCPointer<ByteVar>(), pmxcd.toCPointer<ByteVar>(), fdwdetails)

public actual fun sndPlaySoundA(pszsound: PCSTR, fusound: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_sndPlaySoundA(pszsound.toCPointer<ByteVar>(), fusound)

public actual fun sndPlaySoundW(pszsound: PCWSTR, fusound: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_sndPlaySoundW(pszsound.toCPointer<ByteVar>(), fusound)

public actual fun waveInAddBuffer(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInAddBuffer(hwi.toCPointer<ByteVar>(), pwh.toCPointer<ByteVar>(), cbwh)

public actual fun waveInClose(hwi: HWAVEIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInClose(hwi.toCPointer<ByteVar>())

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid, pwic.toCPointer<ByteVar>(), cbwic)

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid, pwic.toCPointer<ByteVar>(), cbwic)

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun waveInGetID(hwi: HWAVEIN, pudeviceid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetID(hwi.toCPointer<ByteVar>(), pudeviceid.toCPointer<ByteVar>())

public actual fun waveInGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetNumDevs()

public actual fun waveInGetPosition(hwi: HWAVEIN, pmmt: Long, cbmmt: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetPosition(hwi.toCPointer<ByteVar>(), pmmt.toCPointer<ByteVar>(), cbmmt)

public actual fun waveInMessage(hwi: HWAVEIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInMessage(hwi.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun waveInOpen(phwi: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInOpen(phwi.toCPointer<ByteVar>(), udeviceid, pwfx.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun waveInPrepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInPrepareHeader(hwi.toCPointer<ByteVar>(), pwh.toCPointer<ByteVar>(), cbwh)

public actual fun waveInReset(hwi: HWAVEIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInReset(hwi.toCPointer<ByteVar>())

public actual fun waveInStart(hwi: HWAVEIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInStart(hwi.toCPointer<ByteVar>())

public actual fun waveInStop(hwi: HWAVEIN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInStop(hwi.toCPointer<ByteVar>())

public actual fun waveInUnprepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInUnprepareHeader(hwi.toCPointer<ByteVar>(), pwh.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutBreakLoop(hwo: HWAVEOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutBreakLoop(hwo.toCPointer<ByteVar>())

public actual fun waveOutClose(hwo: HWAVEOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutClose(hwo.toCPointer<ByteVar>())

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid, pwoc.toCPointer<ByteVar>(), cbwoc)

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid, pwoc.toCPointer<ByteVar>(), cbwoc)

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun waveOutGetID(hwo: HWAVEOUT, pudeviceid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetID(hwo.toCPointer<ByteVar>(), pudeviceid.toCPointer<ByteVar>())

public actual fun waveOutGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetNumDevs()

public actual fun waveOutGetPitch(hwo: HWAVEOUT, pdwpitch: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetPitch(hwo.toCPointer<ByteVar>(), pdwpitch.toCPointer<ByteVar>())

public actual fun waveOutGetPlaybackRate(hwo: HWAVEOUT, pdwrate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(hwo.toCPointer<ByteVar>(), pdwrate.toCPointer<ByteVar>())

public actual fun waveOutGetPosition(hwo: HWAVEOUT, pmmt: Long, cbmmt: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetPosition(hwo.toCPointer<ByteVar>(), pmmt.toCPointer<ByteVar>(), cbmmt)

public actual fun waveOutGetVolume(hwo: HWAVEOUT, pdwvolume: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetVolume(hwo.toCPointer<ByteVar>(), pdwvolume.toCPointer<ByteVar>())

public actual fun waveOutMessage(hwo: HWAVEOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutMessage(hwo.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun waveOutOpen(phwo: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutOpen(phwo.toCPointer<ByteVar>(), udeviceid, pwfx.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun waveOutPause(hwo: HWAVEOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutPause(hwo.toCPointer<ByteVar>())

public actual fun waveOutPrepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutPrepareHeader(hwo.toCPointer<ByteVar>(), pwh.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutReset(hwo: HWAVEOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutReset(hwo.toCPointer<ByteVar>())

public actual fun waveOutRestart(hwo: HWAVEOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutRestart(hwo.toCPointer<ByteVar>())

public actual fun waveOutSetPitch(hwo: HWAVEOUT, dwpitch: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutSetPitch(hwo.toCPointer<ByteVar>(), dwpitch)

public actual fun waveOutSetPlaybackRate(hwo: HWAVEOUT, dwrate: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(hwo.toCPointer<ByteVar>(), dwrate)

public actual fun waveOutSetVolume(hwo: HWAVEOUT, dwvolume: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutSetVolume(hwo.toCPointer<ByteVar>(), dwvolume)

public actual fun waveOutUnprepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutUnprepareHeader(hwo.toCPointer<ByteVar>(), pwh.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutWrite(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutWrite(hwo.toCPointer<ByteVar>(), pwh.toCPointer<ByteVar>(), cbwh)
