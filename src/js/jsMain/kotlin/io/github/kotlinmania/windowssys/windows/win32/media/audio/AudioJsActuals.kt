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

private val _windowsWin32MediaAudioNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ActivateAudioInterfaceAsync(deviceinterfacepath: PCWSTR, riid: Long, activationparams: Long, completionhandler: Long, activationoperation: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_ActivateAudioInterfaceAsync(deviceinterfacepath.toString(), riid.toString(), activationparams.toString(), completionhandler.toString(), activationoperation.toString()) as Int) else 0

public actual fun CoRegisterMessageFilter(lpmessagefilter: Long, lplpmessagefilter: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CoRegisterMessageFilter(lpmessagefilter.toString(), lplpmessagefilter.toString()) as Int) else 0

public actual fun CreateCaptureAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitor(audiostatemonitor.toString()) as Int) else 0

public actual fun CreateCaptureAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor.toString()) as Int) else 0

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid.toString(), audiostatemonitor.toString()) as Int) else 0

public actual fun CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.toString()) as Int) else 0

public actual fun CreateRenderAudioStateMonitor(audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitor(audiostatemonitor.toString()) as Int) else 0

public actual fun CreateRenderAudioStateMonitorForCategory(category: AUDIO_STREAM_CATEGORY, audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategory(category, audiostatemonitor.toString()) as Int) else 0

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceId(category: AUDIO_STREAM_CATEGORY, deviceid: PCWSTR, audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid.toString(), audiostatemonitor.toString()) as Int) else 0

public actual fun CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category: AUDIO_STREAM_CATEGORY, role: ERole, audiostatemonitor: Long): HRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_CreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.toString()) as Int) else 0

public actual fun PlaySoundA(pszsound: PCSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_PlaySoundA(pszsound.toString(), hmod.toString(), fdwsound.toInt()) as Int) else 0

public actual fun PlaySoundW(pszsound: PCWSTR, hmod: HMODULE, fdwsound: SND_FLAGS): BOOL =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_PlaySoundW(pszsound.toString(), hmod.toString(), fdwsound.toInt()) as Int) else 0

public actual fun acmDriverAddA(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverAddA(phadid.toString(), hinstmodule.toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverAddW(phadid: Long, hinstmodule: HINSTANCE, lparam: LPARAM, dwpriority: UInt, fdwadd: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverAddW(phadid.toString(), hinstmodule.toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverClose(had: HACMDRIVER, fdwclose: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverClose(had.toString(), fdwclose.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverDetailsA(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverDetailsA(hadid.toString(), padd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverDetailsW(hadid: HACMDRIVERID, padd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverDetailsW(hadid.toString(), padd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverEnum(fncallback: ACMDRIVERENUMCB, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverEnum(fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverID(hao: HACMOBJ, phadid: Long, fdwdriverid: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverID(hao.toString(), phadid.toString(), fdwdriverid.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverMessage(had: HACMDRIVER, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverMessage(had.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else 0L

public actual fun acmDriverOpen(phad: Long, hadid: HACMDRIVERID, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverOpen(phad.toString(), hadid.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverPriority(hadid: HACMDRIVERID, dwpriority: UInt, fdwpriority: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverPriority(hadid.toString(), dwpriority.toInt(), fdwpriority.toInt()) as Int).toUInt() else 0u

public actual fun acmDriverRemove(hadid: HACMDRIVERID, fdwremove: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverRemove(hadid.toString(), fdwremove.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterChooseA(pafltrc: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterChooseA(pafltrc.toString()) as Int).toUInt() else 0u

public actual fun acmFilterChooseW(pafltrc: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterChooseW(pafltrc.toString()) as Int).toUInt() else 0u

public actual fun acmFilterDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterDetailsA(had.toString(), pafd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterDetailsW(had.toString(), pafd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterEnumA(had.toString(), pafd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFILTERENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterEnumW(had.toString(), pafd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagDetailsA(had.toString(), paftd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagDetailsW(had.toString(), paftd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagEnumA(had.toString(), paftd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFilterTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFILTERTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagEnumW(had.toString(), paftd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatChooseA(pafmtc: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatChooseA(pafmtc.toString()) as Int).toUInt() else 0u

public actual fun acmFormatChooseW(pafmtc: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatChooseW(pafmtc.toString()) as Int).toUInt() else 0u

public actual fun acmFormatDetailsA(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatDetailsA(had.toString(), pafd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatDetailsW(had: HACMDRIVER, pafd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatDetailsW(had.toString(), pafd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatEnumA(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatEnumA(had.toString(), pafd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatEnumW(had: HACMDRIVER, pafd: Long, fncallback: ACMFORMATENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatEnumW(had.toString(), pafd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatSuggest(had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatSuggest(had.toString(), pwfxsrc.toString(), pwfxdst.toString(), cbwfxdst.toInt(), fdwsuggest.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatTagDetailsA(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagDetailsA(had.toString(), paftd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatTagDetailsW(had: HACMDRIVER, paftd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagDetailsW(had.toString(), paftd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatTagEnumA(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBA, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagEnumA(had.toString(), paftd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmFormatTagEnumW(had: HACMDRIVER, paftd: Long, fncallback: ACMFORMATTAGENUMCBW, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagEnumW(had.toString(), paftd.toString(), fncallback.toLong().toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else 0u

public actual fun acmGetVersion(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmGetVersion() as Int).toUInt() else 0u

public actual fun acmMetrics(hao: HACMOBJ, umetric: UInt, pmetric: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmMetrics(hao.toString(), umetric.toInt(), pmetric.toString()) as Int).toUInt() else 0u

public actual fun acmStreamClose(has: HACMSTREAM, fdwclose: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamClose(has.toString(), fdwclose.toInt()) as Int).toUInt() else 0u

public actual fun acmStreamConvert(has: HACMSTREAM, pash: Long, fdwconvert: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamConvert(has.toString(), pash.toString(), fdwconvert.toInt()) as Int).toUInt() else 0u

public actual fun acmStreamMessage(has: HACMSTREAM, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamMessage(has.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as Int).toUInt() else 0u

public actual fun acmStreamOpen(phas: Long, had: HACMDRIVER, pwfxsrc: Long, pwfxdst: Long, pwfltr: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamOpen(phas.toString(), had.toString(), pwfxsrc.toString(), pwfxdst.toString(), pwfltr.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun acmStreamPrepareHeader(has: HACMSTREAM, pash: Long, fdwprepare: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamPrepareHeader(has.toString(), pash.toString(), fdwprepare.toInt()) as Int).toUInt() else 0u

public actual fun acmStreamReset(has: HACMSTREAM, fdwreset: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamReset(has.toString(), fdwreset.toInt()) as Int).toUInt() else 0u

public actual fun acmStreamSize(has: HACMSTREAM, cbinput: UInt, pdwoutputbytes: Long, fdwsize: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamSize(has.toString(), cbinput.toInt(), pdwoutputbytes.toString(), fdwsize.toInt()) as Int).toUInt() else 0u

public actual fun acmStreamUnprepareHeader(has: HACMSTREAM, pash: Long, fdwunprepare: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(has.toString(), pash.toString(), fdwunprepare.toInt()) as Int).toUInt() else 0u

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid.toString(), pac.toString(), cbac.toInt()) as Int).toUInt() else 0u

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: Long, cbac: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid.toString(), pac.toString(), cbac.toInt()) as Int).toUInt() else 0u

public actual fun auxGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetNumDevs() as Int).toUInt() else 0u

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetVolume(udeviceid.toInt(), pdwvolume.toString()) as Int).toUInt() else 0u

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else 0u

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxSetVolume(udeviceid.toInt(), dwvolume.toInt()) as Int).toUInt() else 0u

public actual fun midiConnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiConnect(hmi.toString(), hmo.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun midiDisconnect(hmi: HMIDI, hmo: HMIDIOUT, preserved: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiDisconnect(hmi.toString(), hmo.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun midiInAddBuffer(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInAddBuffer(hmi.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiInClose(hmi: HMIDIIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInClose(hmi.toString()) as Int).toUInt() else 0u

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid.toString(), pmic.toString(), cbmic.toInt()) as Int).toUInt() else 0u

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: Long, cbmic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid.toString(), pmic.toString(), cbmic.toInt()) as Int).toUInt() else 0u

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun midiInGetID(hmi: HMIDIIN, pudeviceid: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetID(hmi.toString(), pudeviceid.toString()) as Int).toUInt() else 0u

public actual fun midiInGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetNumDevs() as Int).toUInt() else 0u

public actual fun midiInMessage(hmi: HMIDIIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInMessage(hmi.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else 0u

public actual fun midiInOpen(phmi: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInOpen(phmi.toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun midiInPrepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInPrepareHeader(hmi.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiInReset(hmi: HMIDIIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInReset(hmi.toString()) as Int).toUInt() else 0u

public actual fun midiInStart(hmi: HMIDIIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInStart(hmi.toString()) as Int).toUInt() else 0u

public actual fun midiInStop(hmi: HMIDIIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInStop(hmi.toString()) as Int).toUInt() else 0u

public actual fun midiInUnprepareHeader(hmi: HMIDIIN, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInUnprepareHeader(hmi.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiOutCacheDrumPatches(hmo: HMIDIOUT, upatch: UInt, pwkya: Long, fucache: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(hmo.toString(), upatch.toInt(), pwkya.toString(), fucache.toInt()) as Int).toUInt() else 0u

public actual fun midiOutCachePatches(hmo: HMIDIOUT, ubank: UInt, pwpa: Long, fucache: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutCachePatches(hmo.toString(), ubank.toInt(), pwpa.toString(), fucache.toInt()) as Int).toUInt() else 0u

public actual fun midiOutClose(hmo: HMIDIOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutClose(hmo.toString()) as Int).toUInt() else 0u

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid.toString(), pmoc.toString(), cbmoc.toInt()) as Int).toUInt() else 0u

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: Long, cbmoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid.toString(), pmoc.toString(), cbmoc.toInt()) as Int).toUInt() else 0u

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun midiOutGetID(hmo: HMIDIOUT, pudeviceid: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetID(hmo.toString(), pudeviceid.toString()) as Int).toUInt() else 0u

public actual fun midiOutGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetNumDevs() as Int).toUInt() else 0u

public actual fun midiOutGetVolume(hmo: HMIDIOUT, pdwvolume: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetVolume(hmo.toString(), pdwvolume.toString()) as Int).toUInt() else 0u

public actual fun midiOutLongMsg(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutLongMsg(hmo.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiOutMessage(hmo: HMIDIOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutMessage(hmo.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else 0u

public actual fun midiOutOpen(phmo: Long, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutOpen(phmo.toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun midiOutPrepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutPrepareHeader(hmo.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiOutReset(hmo: HMIDIOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutReset(hmo.toString()) as Int).toUInt() else 0u

public actual fun midiOutSetVolume(hmo: HMIDIOUT, dwvolume: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutSetVolume(hmo.toString(), dwvolume.toInt()) as Int).toUInt() else 0u

public actual fun midiOutShortMsg(hmo: HMIDIOUT, dwmsg: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutShortMsg(hmo.toString(), dwmsg.toInt()) as Int).toUInt() else 0u

public actual fun midiOutUnprepareHeader(hmo: HMIDIOUT, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutUnprepareHeader(hmo.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiStreamClose(hms: HMIDISTRM): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamClose(hms.toString()) as Int).toUInt() else 0u

public actual fun midiStreamOpen(phms: Long, pudeviceid: Long, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamOpen(phms.toString(), pudeviceid.toString(), cmidi.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun midiStreamOut(hms: HMIDISTRM, pmh: Long, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamOut(hms.toString(), pmh.toString(), cbmh.toInt()) as Int).toUInt() else 0u

public actual fun midiStreamPause(hms: HMIDISTRM): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamPause(hms.toString()) as Int).toUInt() else 0u

public actual fun midiStreamPosition(hms: HMIDISTRM, lpmmt: Long, cbmmt: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamPosition(hms.toString(), lpmmt.toString(), cbmmt.toInt()) as Int).toUInt() else 0u

public actual fun midiStreamProperty(hms: HMIDISTRM, lppropdata: Long, dwproperty: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamProperty(hms.toString(), lppropdata.toString(), dwproperty.toInt()) as Int).toUInt() else 0u

public actual fun midiStreamRestart(hms: HMIDISTRM): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamRestart(hms.toString()) as Int).toUInt() else 0u

public actual fun midiStreamStop(hms: HMIDISTRM): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamStop(hms.toString()) as Int).toUInt() else 0u

public actual fun mixerClose(hmx: HMIXER): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerClose(hmx.toString()) as Int).toUInt() else 0u

public actual fun mixerGetControlDetailsA(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetControlDetailsA(hmxobj.toString(), pmxcd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetControlDetailsW(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetControlDetailsW(hmxobj.toString(), pmxcd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid.toString(), pmxcaps.toString(), cbmxcaps.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: Long, cbmxcaps: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid.toString(), pmxcaps.toString(), cbmxcaps.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetID(hmxobj: HMIXEROBJ, pumxid: Long, fdwid: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetID(hmxobj.toString(), pumxid.toString(), fdwid.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetLineControlsA(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineControlsA(hmxobj.toString(), pmxlc.toString(), fdwcontrols.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetLineControlsW(hmxobj: HMIXEROBJ, pmxlc: Long, fdwcontrols: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineControlsW(hmxobj.toString(), pmxlc.toString(), fdwcontrols.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetLineInfoA(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineInfoA(hmxobj.toString(), pmxl.toString(), fdwinfo.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetLineInfoW(hmxobj: HMIXEROBJ, pmxl: Long, fdwinfo: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineInfoW(hmxobj.toString(), pmxl.toString(), fdwinfo.toInt()) as Int).toUInt() else 0u

public actual fun mixerGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetNumDevs() as Int).toUInt() else 0u

public actual fun mixerMessage(hmx: HMIXER, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerMessage(hmx.toString(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else 0u

public actual fun mixerOpen(phmx: Long, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerOpen(phmx.toString(), umxid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun mixerSetControlDetails(hmxobj: HMIXEROBJ, pmxcd: Long, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerSetControlDetails(hmxobj.toString(), pmxcd.toString(), fdwdetails.toInt()) as Int).toUInt() else 0u

public actual fun sndPlaySoundA(pszsound: PCSTR, fusound: UInt): BOOL =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_sndPlaySoundA(pszsound.toString(), fusound.toInt()) as Int) else 0

public actual fun sndPlaySoundW(pszsound: PCWSTR, fusound: UInt): BOOL =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_sndPlaySoundW(pszsound.toString(), fusound.toInt()) as Int) else 0

public actual fun waveInAddBuffer(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInAddBuffer(hwi.toString(), pwh.toString(), cbwh.toInt()) as Int).toUInt() else 0u

public actual fun waveInClose(hwi: HWAVEIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInClose(hwi.toString()) as Int).toUInt() else 0u

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid.toString(), pwic.toString(), cbwic.toInt()) as Int).toUInt() else 0u

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: Long, cbwic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid.toString(), pwic.toString(), cbwic.toInt()) as Int).toUInt() else 0u

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun waveInGetID(hwi: HWAVEIN, pudeviceid: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetID(hwi.toString(), pudeviceid.toString()) as Int).toUInt() else 0u

public actual fun waveInGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetNumDevs() as Int).toUInt() else 0u

public actual fun waveInGetPosition(hwi: HWAVEIN, pmmt: Long, cbmmt: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetPosition(hwi.toString(), pmmt.toString(), cbmmt.toInt()) as Int).toUInt() else 0u

public actual fun waveInMessage(hwi: HWAVEIN, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInMessage(hwi.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else 0u

public actual fun waveInOpen(phwi: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInOpen(phwi.toString(), udeviceid.toInt(), pwfx.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun waveInPrepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInPrepareHeader(hwi.toString(), pwh.toString(), cbwh.toInt()) as Int).toUInt() else 0u

public actual fun waveInReset(hwi: HWAVEIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInReset(hwi.toString()) as Int).toUInt() else 0u

public actual fun waveInStart(hwi: HWAVEIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInStart(hwi.toString()) as Int).toUInt() else 0u

public actual fun waveInStop(hwi: HWAVEIN): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInStop(hwi.toString()) as Int).toUInt() else 0u

public actual fun waveInUnprepareHeader(hwi: HWAVEIN, pwh: Long, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInUnprepareHeader(hwi.toString(), pwh.toString(), cbwh.toInt()) as Int).toUInt() else 0u

public actual fun waveOutBreakLoop(hwo: HWAVEOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutBreakLoop(hwo.toString()) as Int).toUInt() else 0u

public actual fun waveOutClose(hwo: HWAVEOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutClose(hwo.toString()) as Int).toUInt() else 0u

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid.toString(), pwoc.toString(), cbwoc.toInt()) as Int).toUInt() else 0u

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: Long, cbwoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid.toString(), pwoc.toString(), cbwoc.toInt()) as Int).toUInt() else 0u

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: PSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: PWSTR, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror.toInt(), psztext.toString(), cchtext.toInt()) as Int).toUInt() else 0u

public actual fun waveOutGetID(hwo: HWAVEOUT, pudeviceid: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetID(hwo.toString(), pudeviceid.toString()) as Int).toUInt() else 0u

public actual fun waveOutGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetNumDevs() as Int).toUInt() else 0u

public actual fun waveOutGetPitch(hwo: HWAVEOUT, pdwpitch: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetPitch(hwo.toString(), pdwpitch.toString()) as Int).toUInt() else 0u

public actual fun waveOutGetPlaybackRate(hwo: HWAVEOUT, pdwrate: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(hwo.toString(), pdwrate.toString()) as Int).toUInt() else 0u

public actual fun waveOutGetPosition(hwo: HWAVEOUT, pmmt: Long, cbmmt: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetPosition(hwo.toString(), pmmt.toString(), cbmmt.toInt()) as Int).toUInt() else 0u

public actual fun waveOutGetVolume(hwo: HWAVEOUT, pdwvolume: Long): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetVolume(hwo.toString(), pdwvolume.toString()) as Int).toUInt() else 0u

public actual fun waveOutMessage(hwo: HWAVEOUT, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutMessage(hwo.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else 0u

public actual fun waveOutOpen(phwo: Long, udeviceid: UInt, pwfx: Long, dwcallback: ULong, dwinstance: ULong, fdwopen: MIDI_WAVE_OPEN_TYPE): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutOpen(phwo.toString(), udeviceid.toInt(), pwfx.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else 0u

public actual fun waveOutPause(hwo: HWAVEOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutPause(hwo.toString()) as Int).toUInt() else 0u

public actual fun waveOutPrepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutPrepareHeader(hwo.toString(), pwh.toString(), cbwh.toInt()) as Int).toUInt() else 0u

public actual fun waveOutReset(hwo: HWAVEOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutReset(hwo.toString()) as Int).toUInt() else 0u

public actual fun waveOutRestart(hwo: HWAVEOUT): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutRestart(hwo.toString()) as Int).toUInt() else 0u

public actual fun waveOutSetPitch(hwo: HWAVEOUT, dwpitch: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutSetPitch(hwo.toString(), dwpitch.toInt()) as Int).toUInt() else 0u

public actual fun waveOutSetPlaybackRate(hwo: HWAVEOUT, dwrate: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(hwo.toString(), dwrate.toInt()) as Int).toUInt() else 0u

public actual fun waveOutSetVolume(hwo: HWAVEOUT, dwvolume: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutSetVolume(hwo.toString(), dwvolume.toInt()) as Int).toUInt() else 0u

public actual fun waveOutUnprepareHeader(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutUnprepareHeader(hwo.toString(), pwh.toString(), cbwh.toInt()) as Int).toUInt() else 0u

public actual fun waveOutWrite(hwo: HWAVEOUT, pwh: Long, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutWrite(hwo.toString(), pwh.toString(), cbwh.toInt()) as Int).toUInt() else 0u
