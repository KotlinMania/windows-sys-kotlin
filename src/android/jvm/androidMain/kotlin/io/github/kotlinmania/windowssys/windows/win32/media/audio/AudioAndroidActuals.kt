@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32MediaAudioJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(deviceinterfacepath: Long, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(category: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: Int, deviceid: Long, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: Int, role: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(category: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(category: Int, deviceid: Long, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: Int, role: Int, audiostatemonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioPlaySoundA(pszsound: Long, hmod: Long, fdwsound: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioPlaySoundW(pszsound: Long, hmod: Long, fdwsound: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverAddA(phadid: Long, hinstmodule: Long, lparam: Long, dwpriority: Int, fdwadd: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverAddW(phadid: Long, hinstmodule: Long, lparam: Long, dwpriority: Int, fdwadd: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverClose(had: Long, fdwclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverDetailsA(hadid: Long, padd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverDetailsW(hadid: Long, padd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverEnum(fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverID(hao: Long, phadid: Long, fdwdriverid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverMessage(had: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverOpen(phad: Long, hadid: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverPriority(hadid: Long, dwpriority: Int, fdwpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmDriverRemove(hadid: Long, fdwremove: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterChooseA(pafltrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterChooseW(pafltrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterDetailsA(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterDetailsW(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterEnumA(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterEnumW(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatChooseA(pafmtc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatChooseW(pafmtc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatDetailsA(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatDetailsW(had: Long, pafd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatEnumA(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatEnumW(had: Long, pafd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatSuggest(had: Long, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: Int, fdwsuggest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(had: Long, paftd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(had: Long, paftd: Long, fncallback: Long, dwinstance: Long, fdwenum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmGetVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmMetrics(hao: Long, umetric: Int, pmetric: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamClose(has: Long, fdwclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamConvert(has: Long, pash: Long, fdwconvert: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamMessage(has: Long, umsg: Int, lparam1: Long, lparam2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamOpen(phas: Long, had: Long, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(has: Long, pash: Long, fdwprepare: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamReset(has: Long, fdwreset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamSize(has: Long, cbinput: Int, pdwoutputbytes: Long, fdwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(has: Long, pash: Long, fdwunprepare: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAuxGetDevCapsA(udeviceid: Long, pac: Long, cbac: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAuxGetDevCapsW(udeviceid: Long, pac: Long, cbac: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAuxGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAuxGetVolume(udeviceid: Int, pdwvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid: Int, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid: Int, dwvolume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiConnect(hmi: Long, hmo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiDisconnect(hmi: Long, hmo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInAddBuffer(hmi: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInClose(hmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(udeviceid: Long, pmic: Long, cbmic: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(udeviceid: Long, pmic: Long, cbmic: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInGetID(hmi: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInMessage(hmi: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInOpen(phmi: Long, udeviceid: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInPrepareHeader(hmi: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInReset(hmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInStart(hmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInStop(hmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(hmi: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(hmo: Long, upatch: Int, pwkya: Long, fucache: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutCachePatches(hmo: Long, ubank: Int, pwpa: Long, fucache: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutClose(hmo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(udeviceid: Long, pmoc: Long, cbmoc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(udeviceid: Long, pmoc: Long, cbmoc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetID(hmo: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutGetVolume(hmo: Long, pdwvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutLongMsg(hmo: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutMessage(hmo: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutOpen(phmo: Long, udeviceid: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(hmo: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutReset(hmo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutSetVolume(hmo: Long, dwvolume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutShortMsg(hmo: Long, dwmsg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(hmo: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamClose(hms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamOpen(phms: Long, pudeviceid: Long, cmidi: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamOut(hms: Long, pmh: Long, cbmh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamPause(hms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamPosition(hms: Long, lpmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamProperty(hms: Long, lppropdata: Long, dwproperty: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamRestart(hms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMidiStreamStop(hms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerClose(hmx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(hmxobj: Long, pmxcd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(hmxobj: Long, pmxcd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetDevCapsA(umxid: Long, pmxcaps: Long, cbmxcaps: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetDevCapsW(umxid: Long, pmxcaps: Long, cbmxcaps: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetID(hmxobj: Long, pumxid: Long, fdwid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetLineControlsA(hmxobj: Long, pmxlc: Long, fdwcontrols: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetLineControlsW(hmxobj: Long, pmxlc: Long, fdwcontrols: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetLineInfoA(hmxobj: Long, pmxl: Long, fdwinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetLineInfoW(hmxobj: Long, pmxl: Long, fdwinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerMessage(hmx: Long, umsg: Int, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerOpen(phmx: Long, umxid: Int, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioMixerSetControlDetails(hmxobj: Long, pmxcd: Long, fdwdetails: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioSndPlaySoundA(pszsound: Long, fusound: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioSndPlaySoundW(pszsound: Long, fusound: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInAddBuffer(hwi: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInClose(hwi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(udeviceid: Long, pwic: Long, cbwic: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(udeviceid: Long, pwic: Long, cbwic: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetID(hwi: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInGetPosition(hwi: Long, pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInMessage(hwi: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInOpen(phwi: Long, udeviceid: Int, pwfx: Long, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInPrepareHeader(hwi: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInReset(hwi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInStart(hwi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInStop(hwi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(hwi: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutBreakLoop(hwo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutClose(hwo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(udeviceid: Long, pwoc: Long, cbwoc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(udeviceid: Long, pwoc: Long, cbwoc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(mmrerror: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetID(hwo: Long, pudeviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetPitch(hwo: Long, pdwpitch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(hwo: Long, pdwrate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetPosition(hwo: Long, pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutGetVolume(hwo: Long, pdwvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutMessage(hwo: Long, umsg: Int, dw1: Long, dw2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutOpen(phwo: Long, udeviceid: Int, pwfx: Long, dwcallback: Long, dwinstance: Long, fdwopen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutPause(hwo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(hwo: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutReset(hwo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutRestart(hwo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutSetPitch(hwo: Long, dwpitch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(hwo: Long, dwrate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutSetVolume(hwo: Long, dwvolume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(hwo: Long, pwh: Long, cbwh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaAudioWaveOutWrite(hwo: Long, pwh: Long, cbwh: Int): Int
}

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: ConstPtr<Guid>, activationparams: ConstPtr<Propvariant>, completionhandler: MutPtr<CVoid>, activationoperation: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(deviceinterfacepath.rawAddress, riid.rawAddress, activationparams.rawAddress, completionhandler.rawAddress, activationoperation.rawAddress)

public actual fun coRegisterMessageFilter(lpmessagefilter: MutPtr<CVoid>, lplpmessagefilter: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(lpmessagefilter.rawAddress, lplpmessagefilter.rawAddress)

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(audiostatemonitor.rawAddress)

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress)

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress, audiostatemonitor.rawAddress)

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress)

public actual fun createRenderAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(audiostatemonitor.rawAddress)

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress)

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress, audiostatemonitor.rawAddress)

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress)

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioPlaySoundA(pszsound.rawAddress, hmod.rawAddress, fdwsound.toInt())

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioPlaySoundW(pszsound.rawAddress, hmod.rawAddress, fdwsound.toInt())

public actual fun acmDriverAddA(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverAddA(phadid.rawAddress, hinstmodule.rawAddress, lparam, dwpriority.toInt(), fdwadd.toInt()).toUInt()

public actual fun acmDriverAddW(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverAddW(phadid.rawAddress, hinstmodule.rawAddress, lparam, dwpriority.toInt(), fdwadd.toInt()).toUInt()

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverClose(had.rawAddress, fdwclose.toInt()).toUInt()

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsa>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverDetailsA(hadid.rawAddress, padd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsw>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverDetailsW(hadid.rawAddress, padd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverEnum(0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmDriverID(hao: Hacmobj, phadid: MutPtr<Hacmdriverid>, fdwdriverid: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverID(hao.rawAddress, phadid.rawAddress, fdwdriverid.toInt()).toUInt()

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverMessage(had.rawAddress, umsg.toInt(), lparam1, lparam2)

public actual fun acmDriverOpen(phad: MutPtr<Hacmdriver>, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverOpen(phad.rawAddress, hadid.rawAddress, fdwopen.toInt()).toUInt()

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverPriority(hadid.rawAddress, dwpriority.toInt(), fdwpriority.toInt()).toUInt()

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmDriverRemove(hadid.rawAddress, fdwremove.toInt()).toUInt()

public actual fun acmFilterChooseA(pafltrc: MutPtr<Acmfilterchoosea>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterChooseA(pafltrc.rawAddress).toUInt()

public actual fun acmFilterChooseW(pafltrc: MutPtr<Acmfilterchoosew>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterChooseW(pafltrc.rawAddress).toUInt()

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterDetailsA(had.rawAddress, pafd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterDetailsW(had.rawAddress, pafd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterEnumA(had.rawAddress, pafd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterEnumW(had.rawAddress, pafd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(had.rawAddress, paftd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(had.rawAddress, paftd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(had.rawAddress, paftd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(had.rawAddress, paftd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatChooseA(pafmtc: MutPtr<Acmformatchoosea>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatChooseA(pafmtc.rawAddress).toUInt()

public actual fun acmFormatChooseW(pafmtc: MutPtr<Acmformatchoosew>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatChooseW(pafmtc.rawAddress).toUInt()

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatDetailsA(had.rawAddress, pafd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatDetailsW(had.rawAddress, pafd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatEnumA(had.rawAddress, pafd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatEnumW(had.rawAddress, pafd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatSuggest(had.rawAddress, pwfxsrc.rawAddress, pwfxdst.rawAddress, cbwfxdst.toInt(), fdwsuggest.toInt()).toUInt()

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(had.rawAddress, paftd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(had.rawAddress, paftd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(had.rawAddress, paftd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(had.rawAddress, paftd.rawAddress, 0L, dwinstance.toLong(), fdwenum.toInt()).toUInt()

public actual fun acmGetVersion(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmGetVersion().toUInt()

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: MutPtr<CVoid>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmMetrics(hao.rawAddress, umetric.toInt(), pmetric.rawAddress).toUInt()

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamClose(has.rawAddress, fdwclose.toInt()).toUInt()

public actual fun acmStreamConvert(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwconvert: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamConvert(has.rawAddress, pash.rawAddress, fdwconvert.toInt()).toUInt()

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamMessage(has.rawAddress, umsg.toInt(), lparam1, lparam2).toUInt()

public actual fun acmStreamOpen(phas: MutPtr<Hacmstream>, had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, pwfltr: MutPtr<Wavefilter>, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamOpen(phas.rawAddress, had.rawAddress, pwfxsrc.rawAddress, pwfxdst.rawAddress, pwfltr.rawAddress, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwprepare: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(has.rawAddress, pash.rawAddress, fdwprepare.toInt()).toUInt()

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamReset(has.rawAddress, fdwreset.toInt()).toUInt()

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: MutPtr<UInt>, fdwsize: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamSize(has.rawAddress, cbinput.toInt(), pdwoutputbytes.rawAddress, fdwsize.toInt()).toUInt()

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwunprepare: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(has.rawAddress, pash.rawAddress, fdwunprepare.toInt()).toUInt()

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: MutPtr<Auxcapsa>, cbac: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAuxGetDevCapsA(udeviceid.toLong(), pac.rawAddress, cbac.toInt()).toUInt()

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: MutPtr<Auxcapsw>, cbac: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAuxGetDevCapsW(udeviceid.toLong(), pac.rawAddress, cbac.toInt()).toUInt()

public actual fun auxGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAuxGetNumDevs().toUInt()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAuxGetVolume(udeviceid.toInt(), pdwvolume.rawAddress).toUInt()

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid.toInt(), dwvolume.toInt()).toUInt()

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiConnect(hmi.rawAddress, hmo.rawAddress, preserved.rawAddress).toUInt()

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiDisconnect(hmi.rawAddress, hmo.rawAddress, preserved.rawAddress).toUInt()

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInAddBuffer(hmi.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiInClose(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInClose(hmi.rawAddress).toUInt()

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: MutPtr<Midiincapsa>, cbmic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(udeviceid.toLong(), pmic.rawAddress, cbmic.toInt()).toUInt()

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: MutPtr<Midiincapsw>, cbmic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(udeviceid.toLong(), pmic.rawAddress, cbmic.toInt()).toUInt()

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInGetID(hmi.rawAddress, pudeviceid.rawAddress).toUInt()

public actual fun midiInGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInGetNumDevs().toUInt()

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInMessage(hmi.rawAddress, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun midiInOpen(phmi: MutPtr<Hmidiin>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInOpen(phmi.rawAddress, udeviceid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInPrepareHeader(hmi.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiInReset(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInReset(hmi.rawAddress).toUInt()

public actual fun midiInStart(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInStart(hmi.rawAddress).toUInt()

public actual fun midiInStop(hmi: Hmidiin): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInStop(hmi.rawAddress).toUInt()

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(hmi.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: ConstPtr<UShort>, fucache: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(hmo.rawAddress, upatch.toInt(), pwkya.rawAddress, fucache.toInt()).toUInt()

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: ConstPtr<UShort>, fucache: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutCachePatches(hmo.rawAddress, ubank.toInt(), pwpa.rawAddress, fucache.toInt()).toUInt()

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutClose(hmo.rawAddress).toUInt()

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: MutPtr<Midioutcapsa>, cbmoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(udeviceid.toLong(), pmoc.rawAddress, cbmoc.toInt()).toUInt()

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: MutPtr<Midioutcapsw>, cbmoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(udeviceid.toLong(), pmoc.rawAddress, cbmoc.toInt()).toUInt()

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetID(hmo.rawAddress, pudeviceid.rawAddress).toUInt()

public actual fun midiOutGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetNumDevs().toUInt()

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutGetVolume(hmo.rawAddress, pdwvolume.rawAddress).toUInt()

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: ConstPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutLongMsg(hmo.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutMessage(hmo.rawAddress, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun midiOutOpen(phmo: MutPtr<Hmidiout>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutOpen(phmo.rawAddress, udeviceid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(hmo.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutReset(hmo.rawAddress).toUInt()

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutSetVolume(hmo.rawAddress, dwvolume.toInt()).toUInt()

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutShortMsg(hmo.rawAddress, dwmsg.toInt()).toUInt()

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(hmo.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamClose(hms.rawAddress).toUInt()

public actual fun midiStreamOpen(phms: MutPtr<Hmidistrm>, pudeviceid: MutPtr<UInt>, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamOpen(phms.rawAddress, pudeviceid.rawAddress, cmidi.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun midiStreamOut(hms: Hmidistrm, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamOut(hms.rawAddress, pmh.rawAddress, cbmh.toInt()).toUInt()

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamPause(hms.rawAddress).toUInt()

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamPosition(hms.rawAddress, lpmmt.rawAddress, cbmmt.toInt()).toUInt()

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: MutPtr<UByte>, dwproperty: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamProperty(hms.rawAddress, lppropdata.rawAddress, dwproperty.toInt()).toUInt()

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamRestart(hms.rawAddress).toUInt()

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMidiStreamStop(hms.rawAddress).toUInt()

public actual fun mixerClose(hmx: Hmixer): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerClose(hmx.rawAddress).toUInt()

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(hmxobj.rawAddress, pmxcd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(hmxobj.rawAddress, pmxcd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: MutPtr<Mixercapsa>, cbmxcaps: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetDevCapsA(umxid.toLong(), pmxcaps.rawAddress, cbmxcaps.toInt()).toUInt()

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: MutPtr<Mixercapsw>, cbmxcaps: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetDevCapsW(umxid.toLong(), pmxcaps.rawAddress, cbmxcaps.toInt()).toUInt()

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: MutPtr<UInt>, fdwid: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetID(hmxobj.rawAddress, pumxid.rawAddress, fdwid.toInt()).toUInt()

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsa>, fdwcontrols: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetLineControlsA(hmxobj.rawAddress, pmxlc.rawAddress, fdwcontrols.toInt()).toUInt()

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsw>, fdwcontrols: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetLineControlsW(hmxobj.rawAddress, pmxlc.rawAddress, fdwcontrols.toInt()).toUInt()

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinea>, fdwinfo: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetLineInfoA(hmxobj.rawAddress, pmxl.rawAddress, fdwinfo.toInt()).toUInt()

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinew>, fdwinfo: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetLineInfoW(hmxobj.rawAddress, pmxl.rawAddress, fdwinfo.toInt()).toUInt()

public actual fun mixerGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerGetNumDevs().toUInt()

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerMessage(hmx.rawAddress, umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mixerOpen(phmx: MutPtr<Hmixer>, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerOpen(phmx.rawAddress, umxid.toInt(), dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: ConstPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioMixerSetControlDetails(hmxobj.rawAddress, pmxcd.rawAddress, fdwdetails.toInt()).toUInt()

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioSndPlaySoundA(pszsound.rawAddress, fusound.toInt())

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioSndPlaySoundW(pszsound.rawAddress, fusound.toInt())

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInAddBuffer(hwi.rawAddress, pwh.rawAddress, cbwh.toInt()).toUInt()

public actual fun waveInClose(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInClose(hwi.rawAddress).toUInt()

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: MutPtr<Waveincapsa>, cbwic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(udeviceid.toLong(), pwic.rawAddress, cbwic.toInt()).toUInt()

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: MutPtr<Waveincapsw>, cbwic: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(udeviceid.toLong(), pwic.rawAddress, cbwic.toInt()).toUInt()

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: ConstPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetID(hwi.rawAddress, pudeviceid.rawAddress).toUInt()

public actual fun waveInGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetNumDevs().toUInt()

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInGetPosition(hwi.rawAddress, pmmt.rawAddress, cbmmt.toInt()).toUInt()

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInMessage(hwi.rawAddress, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun waveInOpen(phwi: MutPtr<Hwavein>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInOpen(phwi.rawAddress, udeviceid.toInt(), pwfx.rawAddress, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInPrepareHeader(hwi.rawAddress, pwh.rawAddress, cbwh.toInt()).toUInt()

public actual fun waveInReset(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInReset(hwi.rawAddress).toUInt()

public actual fun waveInStart(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInStart(hwi.rawAddress).toUInt()

public actual fun waveInStop(hwi: Hwavein): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInStop(hwi.rawAddress).toUInt()

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(hwi.rawAddress, pwh.rawAddress, cbwh.toInt()).toUInt()

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutBreakLoop(hwo.rawAddress).toUInt()

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutClose(hwo.rawAddress).toUInt()

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsa>, cbwoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(udeviceid.toLong(), pwoc.rawAddress, cbwoc.toInt()).toUInt()

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsw>, cbwoc: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(udeviceid.toLong(), pwoc.rawAddress, cbwoc.toInt()).toUInt()

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(mmrerror.toInt(), psztext.rawAddress, cchtext.toInt()).toUInt()

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetID(hwo.rawAddress, pudeviceid.rawAddress).toUInt()

public actual fun waveOutGetNumDevs(): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetNumDevs().toUInt()

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetPitch(hwo.rawAddress, pdwpitch.rawAddress).toUInt()

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(hwo.rawAddress, pdwrate.rawAddress).toUInt()

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetPosition(hwo.rawAddress, pmmt.rawAddress, cbmmt.toInt()).toUInt()

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: MutPtr<UInt>): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutGetVolume(hwo.rawAddress, pdwvolume.rawAddress).toUInt()

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutMessage(hwo.rawAddress, umsg.toInt(), dw1.toLong(), dw2.toLong()).toUInt()

public actual fun waveOutOpen(phwo: MutPtr<Hwaveout>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutOpen(phwo.rawAddress, udeviceid.toInt(), pwfx.rawAddress, dwcallback.toLong(), dwinstance.toLong(), fdwopen.toInt()).toUInt()

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutPause(hwo.rawAddress).toUInt()

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(hwo.rawAddress, pwh.rawAddress, cbwh.toInt()).toUInt()

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutReset(hwo.rawAddress).toUInt()

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutRestart(hwo.rawAddress).toUInt()

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutSetPitch(hwo.rawAddress, dwpitch.toInt()).toUInt()

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(hwo.rawAddress, dwrate.toInt()).toUInt()

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutSetVolume(hwo.rawAddress, dwvolume.toInt()).toUInt()

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(hwo.rawAddress, pwh.rawAddress, cbwh.toInt()).toUInt()

public actual fun waveOutWrite(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    WindowsWin32MediaAudioJniBridge.windowssysWindowsWin32MediaAudioWaveOutWrite(hwo.rawAddress, pwh.rawAddress, cbwh.toInt()).toUInt()
