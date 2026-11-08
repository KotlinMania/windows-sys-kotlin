package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(hadid: HACMDRIVERID, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(hadid: HACMDRIVERID, pafd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public fun ActivateAudioInterfaceAsync(deviceinterfacepath: PCWSTR, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): HRESULT {
    return Win32DynamicFfi.invoke("mmdevapi.dll", "ActivateAudioInterfaceAsync", longArrayOf(deviceinterfacepath, riid, activationparams, completionhandler, activationoperation)).toInt()
}

public fun CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterMessageFilter", longArrayOf(lpmessagefilter, lplpmessagefilter)).toInt()
}

public fun CreateCaptureAudioStateMonitor(audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateCaptureAudioStateMonitor", longArrayOf(audiostatemonitor)).toInt()
}

public fun CreateCaptureAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateCaptureAudioStateMonitorForCategory", longArrayOf(category.toLong(), audiostatemonitor)).toInt()
}

public fun CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateCaptureAudioStateMonitorForCategoryAndDeviceId", longArrayOf(category.toLong(), deviceid, audiostatemonitor)).toInt()
}

public fun CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateCaptureAudioStateMonitorForCategoryAndDeviceRole", longArrayOf(category.toLong(), role.toLong(), audiostatemonitor)).toInt()
}

public fun CreateRenderAudioStateMonitor(audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateRenderAudioStateMonitor", longArrayOf(audiostatemonitor)).toInt()
}

public fun CreateRenderAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateRenderAudioStateMonitorForCategory", longArrayOf(category.toLong(), audiostatemonitor)).toInt()
}

public fun CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateRenderAudioStateMonitorForCategoryAndDeviceId", longArrayOf(category.toLong(), deviceid, audiostatemonitor)).toInt()
}

public fun CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT {
    return Win32DynamicFfi.invoke("windows.media.mediacontrol.dll", "CreateRenderAudioStateMonitorForCategoryAndDeviceRole", longArrayOf(category.toLong(), role.toLong(), audiostatemonitor)).toInt()
}

public fun PlaySoundA(pszsound: PCSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "PlaySoundA", longArrayOf(pszsound, hmod, fdwsound.toLong())).toInt()
}

public fun PlaySoundW(pszsound: PCWSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "PlaySoundW", longArrayOf(pszsound, hmod, fdwsound.toLong())).toInt()
}

public fun acmDriverAddA(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverAddA", longArrayOf(phadid, hinstmodule, lparam, dwpriority.toLong(), fdwadd.toLong())).toUInt()
}

public fun acmDriverAddW(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverAddW", longArrayOf(phadid, hinstmodule, lparam, dwpriority.toLong(), fdwadd.toLong())).toUInt()
}

public fun acmDriverClose(had: HACMDRIVER, fdwclose: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverClose", longArrayOf(had, fdwclose.toLong())).toUInt()
}

public fun acmDriverDetailsA(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverDetailsA", longArrayOf(hadid, padd, fdwdetails.toLong())).toUInt()
}

public fun acmDriverDetailsW(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverDetailsW", longArrayOf(hadid, padd, fdwdetails.toLong())).toUInt()
}

public fun acmDriverEnum(fncallback: ACMDRIVERENUMCB, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverEnum", longArrayOf(Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmDriverID(hao: HACMOBJ, phadid: Long, fdwdriverid: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverID", longArrayOf(hao, phadid, fdwdriverid.toLong())).toUInt()
}

public fun acmDriverMessage(had: HACMDRIVER, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverMessage", longArrayOf(had, umsg.toLong(), lparam1, lparam2))
}

public fun acmDriverOpen(phad: Long, hadid: HACMDRIVERID, fdwopen: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverOpen", longArrayOf(phad, hadid, fdwopen.toLong())).toUInt()
}

public fun acmDriverPriority(hadid: HACMDRIVERID, dwpriority: UInt, fdwpriority: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverPriority", longArrayOf(hadid, dwpriority.toLong(), fdwpriority.toLong())).toUInt()
}

public fun acmDriverRemove(hadid: HACMDRIVERID, fdwremove: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmDriverRemove", longArrayOf(hadid, fdwremove.toLong())).toUInt()
}

public fun acmFilterChooseA(pafltrc: Long): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterChooseA", longArrayOf(pafltrc)).toUInt()
}

public fun acmFilterChooseW(pafltrc: Long): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterChooseW", longArrayOf(pafltrc)).toUInt()
}

public fun acmFilterDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterDetailsA", longArrayOf(had, pafd, fdwdetails.toLong())).toUInt()
}

public fun acmFilterDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterDetailsW", longArrayOf(had, pafd, fdwdetails.toLong())).toUInt()
}

public fun acmFilterEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterEnumA", longArrayOf(had, pafd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFilterEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterEnumW", longArrayOf(had, pafd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFilterTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterTagDetailsA", longArrayOf(had, paftd, fdwdetails.toLong())).toUInt()
}

public fun acmFilterTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterTagDetailsW", longArrayOf(had, paftd, fdwdetails.toLong())).toUInt()
}

public fun acmFilterTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterTagEnumA", longArrayOf(had, paftd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFilterTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFilterTagEnumW", longArrayOf(had, paftd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFormatChooseA(pafmtc: Long): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatChooseA", longArrayOf(pafmtc)).toUInt()
}

public fun acmFormatChooseW(pafmtc: Long): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatChooseW", longArrayOf(pafmtc)).toUInt()
}

public fun acmFormatDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatDetailsA", longArrayOf(had, pafd, fdwdetails.toLong())).toUInt()
}

public fun acmFormatDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatDetailsW", longArrayOf(had, pafd, fdwdetails.toLong())).toUInt()
}

public fun acmFormatEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatEnumA", longArrayOf(had, pafd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFormatEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatEnumW", longArrayOf(had, pafd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFormatSuggest(had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: UInt, fdwsuggest: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatSuggest", longArrayOf(had, pwfxsrc, pwfxdst, cbwfxdst.toLong(), fdwsuggest.toLong())).toUInt()
}

public fun acmFormatTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatTagDetailsA", longArrayOf(had, paftd, fdwdetails.toLong())).toUInt()
}

public fun acmFormatTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatTagDetailsW", longArrayOf(had, paftd, fdwdetails.toLong())).toUInt()
}

public fun acmFormatTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatTagEnumA", longArrayOf(had, paftd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmFormatTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmFormatTagEnumW", longArrayOf(had, paftd, Win32DynamicFfi.objectSlot(fncallback), dwinstance.toLong(), fdwenum.toLong())).toUInt()
}

public fun acmGetVersion(): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmGetVersion", longArrayOf()).toUInt()
}

public fun acmMetrics(hao: HACMOBJ, umetric: UInt, pmetric: Long): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmMetrics", longArrayOf(hao, umetric.toLong(), pmetric)).toUInt()
}

public fun acmStreamClose(has: HACMSTREAM, fdwclose: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamClose", longArrayOf(has, fdwclose.toLong())).toUInt()
}

public fun acmStreamConvert(has: HACMSTREAM, pash: Long, fdwconvert: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamConvert", longArrayOf(has, pash, fdwconvert.toLong())).toUInt()
}

public fun acmStreamMessage(has: HACMSTREAM, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamMessage", longArrayOf(has, umsg.toLong(), lparam1, lparam2)).toUInt()
}

public fun acmStreamOpen(phas: Long, had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamOpen", longArrayOf(phas, had, pwfxsrc, pwfxdst, pwfltr, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun acmStreamPrepareHeader(has: HACMSTREAM, pash: Long, fdwprepare: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamPrepareHeader", longArrayOf(has, pash, fdwprepare.toLong())).toUInt()
}

public fun acmStreamReset(has: HACMSTREAM, fdwreset: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamReset", longArrayOf(has, fdwreset.toLong())).toUInt()
}

public fun acmStreamSize(has: HACMSTREAM, cbinput: UInt, pdwoutputbytes: Long, fdwsize: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamSize", longArrayOf(has, cbinput.toLong(), pdwoutputbytes, fdwsize.toLong())).toUInt()
}

public fun acmStreamUnprepareHeader(has: HACMSTREAM, pash: Long, fdwunprepare: UInt): UInt {
    return Win32DynamicFfi.invoke("msacm32.dll", "acmStreamUnprepareHeader", longArrayOf(has, pash, fdwunprepare.toLong())).toUInt()
}

public fun auxGetDevCapsA(udeviceid: ULong, pac: Long, cbac: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "auxGetDevCapsA", longArrayOf(udeviceid.toLong(), pac, cbac.toLong())).toUInt()
}

public fun auxGetDevCapsW(udeviceid: ULong, pac: Long, cbac: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "auxGetDevCapsW", longArrayOf(udeviceid.toLong(), pac, cbac.toLong())).toUInt()
}

public fun auxGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "auxGetNumDevs", longArrayOf()).toUInt()
}

public fun auxGetVolume(udeviceid: UInt, pdwvolume: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "auxGetVolume", longArrayOf(udeviceid.toLong(), pdwvolume)).toUInt()
}

public fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "auxOutMessage", longArrayOf(udeviceid.toLong(), umsg.toLong(), dw1.toLong(), dw2.toLong())).toUInt()
}

public fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "auxSetVolume", longArrayOf(udeviceid.toLong(), dwvolume.toLong())).toUInt()
}

public fun midiConnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiConnect", longArrayOf(hmi, hmo, preserved)).toUInt()
}

public fun midiDisconnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiDisconnect", longArrayOf(hmi, hmo, preserved)).toUInt()
}

public fun midiInAddBuffer(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInAddBuffer", longArrayOf(hmi, pmh, cbmh.toLong())).toUInt()
}

public fun midiInClose(hmi: HMIDIIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInClose", longArrayOf(hmi)).toUInt()
}

public fun midiInGetDevCapsA(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInGetDevCapsA", longArrayOf(udeviceid.toLong(), pmic, cbmic.toLong())).toUInt()
}

public fun midiInGetDevCapsW(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInGetDevCapsW", longArrayOf(udeviceid.toLong(), pmic, cbmic.toLong())).toUInt()
}

public fun midiInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInGetErrorTextA", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun midiInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInGetErrorTextW", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun midiInGetID(hmi: HMIDIIN, pudeviceid: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInGetID", longArrayOf(hmi, pudeviceid)).toUInt()
}

public fun midiInGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInGetNumDevs", longArrayOf()).toUInt()
}

public fun midiInMessage(hmi: HMIDIIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInMessage", longArrayOf(hmi, umsg.toLong(), dw1.toLong(), dw2.toLong())).toUInt()
}

public fun midiInOpen(phmi: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInOpen", longArrayOf(phmi, udeviceid.toLong(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun midiInPrepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInPrepareHeader", longArrayOf(hmi, pmh, cbmh.toLong())).toUInt()
}

public fun midiInReset(hmi: HMIDIIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInReset", longArrayOf(hmi)).toUInt()
}

public fun midiInStart(hmi: HMIDIIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInStart", longArrayOf(hmi)).toUInt()
}

public fun midiInStop(hmi: HMIDIIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInStop", longArrayOf(hmi)).toUInt()
}

public fun midiInUnprepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiInUnprepareHeader", longArrayOf(hmi, pmh, cbmh.toLong())).toUInt()
}

public fun midiOutCacheDrumPatches(hmo: HMIDIOUT, upatch: UInt, pwkya: Long, fucache: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutCacheDrumPatches", longArrayOf(hmo, upatch.toLong(), pwkya, fucache.toLong())).toUInt()
}

public fun midiOutCachePatches(hmo: HMIDIOUT, ubank: UInt, pwpa: Long, fucache: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutCachePatches", longArrayOf(hmo, ubank.toLong(), pwpa, fucache.toLong())).toUInt()
}

public fun midiOutClose(hmo: HMIDIOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutClose", longArrayOf(hmo)).toUInt()
}

public fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetDevCapsA", longArrayOf(udeviceid.toLong(), pmoc, cbmoc.toLong())).toUInt()
}

public fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetDevCapsW", longArrayOf(udeviceid.toLong(), pmoc, cbmoc.toLong())).toUInt()
}

public fun midiOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetErrorTextA", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun midiOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetErrorTextW", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun midiOutGetID(hmo: HMIDIOUT, pudeviceid: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetID", longArrayOf(hmo, pudeviceid)).toUInt()
}

public fun midiOutGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetNumDevs", longArrayOf()).toUInt()
}

public fun midiOutGetVolume(hmo: HMIDIOUT, pdwvolume: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutGetVolume", longArrayOf(hmo, pdwvolume)).toUInt()
}

public fun midiOutLongMsg(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutLongMsg", longArrayOf(hmo, pmh, cbmh.toLong())).toUInt()
}

public fun midiOutMessage(hmo: HMIDIOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutMessage", longArrayOf(hmo, umsg.toLong(), dw1.toLong(), dw2.toLong())).toUInt()
}

public fun midiOutOpen(phmo: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutOpen", longArrayOf(phmo, udeviceid.toLong(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun midiOutPrepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutPrepareHeader", longArrayOf(hmo, pmh, cbmh.toLong())).toUInt()
}

public fun midiOutReset(hmo: HMIDIOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutReset", longArrayOf(hmo)).toUInt()
}

public fun midiOutSetVolume(hmo: HMIDIOUT, dwvolume: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutSetVolume", longArrayOf(hmo, dwvolume.toLong())).toUInt()
}

public fun midiOutShortMsg(hmo: HMIDIOUT, dwmsg: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutShortMsg", longArrayOf(hmo, dwmsg.toLong())).toUInt()
}

public fun midiOutUnprepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiOutUnprepareHeader", longArrayOf(hmo, pmh, cbmh.toLong())).toUInt()
}

public fun midiStreamClose(hms: HMIDISTRM): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamClose", longArrayOf(hms)).toUInt()
}

public fun midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamOpen", longArrayOf(phms, pudeviceid, cmidi.toLong(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun midiStreamOut(hms: HMIDISTRM, pmh: Long, cbmh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamOut", longArrayOf(hms, pmh, cbmh.toLong())).toUInt()
}

public fun midiStreamPause(hms: HMIDISTRM): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamPause", longArrayOf(hms)).toUInt()
}

public fun midiStreamPosition(hms: HMIDISTRM, lpmmt: Long, cbmmt: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamPosition", longArrayOf(hms, lpmmt, cbmmt.toLong())).toUInt()
}

public fun midiStreamProperty(hms: HMIDISTRM, lppropdata: Long, dwproperty: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamProperty", longArrayOf(hms, lppropdata, dwproperty.toLong())).toUInt()
}

public fun midiStreamRestart(hms: HMIDISTRM): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamRestart", longArrayOf(hms)).toUInt()
}

public fun midiStreamStop(hms: HMIDISTRM): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "midiStreamStop", longArrayOf(hms)).toUInt()
}

public fun mixerClose(hmx: HMIXER): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerClose", longArrayOf(hmx)).toUInt()
}

public fun mixerGetControlDetailsA(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetControlDetailsA", longArrayOf(hmxobj, pmxcd, fdwdetails.toLong())).toUInt()
}

public fun mixerGetControlDetailsW(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetControlDetailsW", longArrayOf(hmxobj, pmxcd, fdwdetails.toLong())).toUInt()
}

public fun mixerGetDevCapsA(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetDevCapsA", longArrayOf(umxid.toLong(), pmxcaps, cbmxcaps.toLong())).toUInt()
}

public fun mixerGetDevCapsW(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetDevCapsW", longArrayOf(umxid.toLong(), pmxcaps, cbmxcaps.toLong())).toUInt()
}

public fun mixerGetID(hmxobj: HMIXEROBJ, pumxid: Long, fdwid: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetID", longArrayOf(hmxobj, pumxid, fdwid.toLong())).toUInt()
}

public fun mixerGetLineControlsA(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetLineControlsA", longArrayOf(hmxobj, pmxlc, fdwcontrols.toLong())).toUInt()
}

public fun mixerGetLineControlsW(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetLineControlsW", longArrayOf(hmxobj, pmxlc, fdwcontrols.toLong())).toUInt()
}

public fun mixerGetLineInfoA(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetLineInfoA", longArrayOf(hmxobj, pmxl, fdwinfo.toLong())).toUInt()
}

public fun mixerGetLineInfoW(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetLineInfoW", longArrayOf(hmxobj, pmxl, fdwinfo.toLong())).toUInt()
}

public fun mixerGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerGetNumDevs", longArrayOf()).toUInt()
}

public fun mixerMessage(hmx: HMIXER, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerMessage", longArrayOf(hmx, umsg.toLong(), dwparam1.toLong(), dwparam2.toLong())).toUInt()
}

public fun mixerOpen(phmx: Long, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerOpen", longArrayOf(phmx, umxid.toLong(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun mixerSetControlDetails(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mixerSetControlDetails", longArrayOf(hmxobj, pmxcd, fdwdetails.toLong())).toUInt()
}

public fun sndPlaySoundA(pszsound: PCSTR, fusound: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "sndPlaySoundA", longArrayOf(pszsound, fusound.toLong())).toInt()
}

public fun sndPlaySoundW(pszsound: PCWSTR, fusound: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "sndPlaySoundW", longArrayOf(pszsound, fusound.toLong())).toInt()
}

public fun waveInAddBuffer(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInAddBuffer", longArrayOf(hwi, pwh, cbwh.toLong())).toUInt()
}

public fun waveInClose(hwi: HWAVEIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInClose", longArrayOf(hwi)).toUInt()
}

public fun waveInGetDevCapsA(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetDevCapsA", longArrayOf(udeviceid.toLong(), pwic, cbwic.toLong())).toUInt()
}

public fun waveInGetDevCapsW(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetDevCapsW", longArrayOf(udeviceid.toLong(), pwic, cbwic.toLong())).toUInt()
}

public fun waveInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetErrorTextA", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun waveInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetErrorTextW", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun waveInGetID(hwi: HWAVEIN, pudeviceid: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetID", longArrayOf(hwi, pudeviceid)).toUInt()
}

public fun waveInGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetNumDevs", longArrayOf()).toUInt()
}

public fun waveInGetPosition(hwi: HWAVEIN, pmmt: Long, cbmmt: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInGetPosition", longArrayOf(hwi, pmmt, cbmmt.toLong())).toUInt()
}

public fun waveInMessage(hwi: HWAVEIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInMessage", longArrayOf(hwi, umsg.toLong(), dw1.toLong(), dw2.toLong())).toUInt()
}

public fun waveInOpen(phwi: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInOpen", longArrayOf(phwi, udeviceid.toLong(), pwfx, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun waveInPrepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInPrepareHeader", longArrayOf(hwi, pwh, cbwh.toLong())).toUInt()
}

public fun waveInReset(hwi: HWAVEIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInReset", longArrayOf(hwi)).toUInt()
}

public fun waveInStart(hwi: HWAVEIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInStart", longArrayOf(hwi)).toUInt()
}

public fun waveInStop(hwi: HWAVEIN): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInStop", longArrayOf(hwi)).toUInt()
}

public fun waveInUnprepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveInUnprepareHeader", longArrayOf(hwi, pwh, cbwh.toLong())).toUInt()
}

public fun waveOutBreakLoop(hwo: HWAVEOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutBreakLoop", longArrayOf(hwo)).toUInt()
}

public fun waveOutClose(hwo: HWAVEOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutClose", longArrayOf(hwo)).toUInt()
}

public fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetDevCapsA", longArrayOf(udeviceid.toLong(), pwoc, cbwoc.toLong())).toUInt()
}

public fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetDevCapsW", longArrayOf(udeviceid.toLong(), pwoc, cbwoc.toLong())).toUInt()
}

public fun waveOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetErrorTextA", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun waveOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetErrorTextW", longArrayOf(mmrerror.toLong(), psztext, cchtext.toLong())).toUInt()
}

public fun waveOutGetID(hwo: HWAVEOUT, pudeviceid: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetID", longArrayOf(hwo, pudeviceid)).toUInt()
}

public fun waveOutGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetNumDevs", longArrayOf()).toUInt()
}

public fun waveOutGetPitch(hwo: HWAVEOUT, pdwpitch: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetPitch", longArrayOf(hwo, pdwpitch)).toUInt()
}

public fun waveOutGetPlaybackRate(hwo: HWAVEOUT, pdwrate: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetPlaybackRate", longArrayOf(hwo, pdwrate)).toUInt()
}

public fun waveOutGetPosition(hwo: HWAVEOUT, pmmt: Long, cbmmt: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetPosition", longArrayOf(hwo, pmmt, cbmmt.toLong())).toUInt()
}

public fun waveOutGetVolume(hwo: HWAVEOUT, pdwvolume: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutGetVolume", longArrayOf(hwo, pdwvolume)).toUInt()
}

public fun waveOutMessage(hwo: HWAVEOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutMessage", longArrayOf(hwo, umsg.toLong(), dw1.toLong(), dw2.toLong())).toUInt()
}

public fun waveOutOpen(phwo: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutOpen", longArrayOf(phwo, udeviceid.toLong(), pwfx, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toLong())).toUInt()
}

public fun waveOutPause(hwo: HWAVEOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutPause", longArrayOf(hwo)).toUInt()
}

public fun waveOutPrepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutPrepareHeader", longArrayOf(hwo, pwh, cbwh.toLong())).toUInt()
}

public fun waveOutReset(hwo: HWAVEOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutReset", longArrayOf(hwo)).toUInt()
}

public fun waveOutRestart(hwo: HWAVEOUT): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutRestart", longArrayOf(hwo)).toUInt()
}

public fun waveOutSetPitch(hwo: HWAVEOUT, dwpitch: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutSetPitch", longArrayOf(hwo, dwpitch.toLong())).toUInt()
}

public fun waveOutSetPlaybackRate(hwo: HWAVEOUT, dwrate: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutSetPlaybackRate", longArrayOf(hwo, dwrate.toLong())).toUInt()
}

public fun waveOutSetVolume(hwo: HWAVEOUT, dwvolume: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutSetVolume", longArrayOf(hwo, dwvolume.toLong())).toUInt()
}

public fun waveOutUnprepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutUnprepareHeader", longArrayOf(hwo, pwh, cbwh.toLong())).toUInt()
}

public fun waveOutWrite(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "waveOutWrite", longArrayOf(hwo, pwh, cbwh.toLong())).toUInt()
}
