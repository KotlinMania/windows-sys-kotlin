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

private val _windowsWin32MediaAudioNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: COpaquePointer?, activationparams: COpaquePointer?, completionhandler: COpaquePointer?, activationoperation: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_activateAudioInterfaceAsync((deviceinterfacepath?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (activationparams?.value ?: 0L).toString(), (completionhandler?.value ?: 0L).toString(), (activationoperation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterMessageFilter(lpmessagefilter: COpaquePointer?, lplpmessagefilter: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_coRegisterMessageFilter((lpmessagefilter?.value ?: 0L).toString(), (lplpmessagefilter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor((audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory(category, (audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId(category, (deviceid?.value ?: 0L).toString(), (audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, (audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createRenderAudioStateMonitor((audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory(category, (audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId(category, (deviceid?.value ?: 0L).toString(), (audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, (audiostatemonitor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_playSoundA((pszsound?.value ?: 0L).toString(), (hmod?.value ?: 0L).toString(), fdwsound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_playSoundW((pszsound?.value ?: 0L).toString(), (hmod?.value ?: 0L).toString(), fdwsound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverAddA(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverAddA((phadid?.value ?: 0L).toString(), (hinstmodule?.value ?: 0L).toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverAddW(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverAddW((phadid?.value ?: 0L).toString(), (hinstmodule?.value ?: 0L).toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverClose((had?.value ?: 0L).toString(), fdwclose.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverDetailsA((hadid?.value ?: 0L).toString(), (padd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverDetailsW((hadid?.value ?: 0L).toString(), (padd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverEnum(0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverID(hao: Hacmobj, phadid: COpaquePointer?, fdwdriverid: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverID((hao?.value ?: 0L).toString(), (phadid?.value ?: 0L).toString(), fdwdriverid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverMessage((had?.value ?: 0L).toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverOpen(phad: COpaquePointer?, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverOpen((phad?.value ?: 0L).toString(), (hadid?.value ?: 0L).toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverPriority((hadid?.value ?: 0L).toString(), dwpriority.toInt(), fdwpriority.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmDriverRemove((hadid?.value ?: 0L).toString(), fdwremove.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterChooseA(pafltrc: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterChooseA((pafltrc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterChooseW(pafltrc: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterChooseW((pafltrc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterDetailsA((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterDetailsW((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterEnumA((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterEnumW((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagDetailsA((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagDetailsW((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagEnumA((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFilterTagEnumW((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatChooseA(pafmtc: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatChooseA((pafmtc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatChooseW(pafmtc: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatChooseW((pafmtc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatDetailsA((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatDetailsW((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatEnumA((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatEnumW((had?.value ?: 0L).toString(), (pafd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatSuggest((had?.value ?: 0L).toString(), (pwfxsrc?.value ?: 0L).toString(), (pwfxdst?.value ?: 0L).toString(), cbwfxdst.toInt(), fdwsuggest.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagDetailsA((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagDetailsW((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagEnumA((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmFormatTagEnumW((had?.value ?: 0L).toString(), (paftd?.value ?: 0L).toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmGetVersion(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmGetVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmMetrics((hao?.value ?: 0L).toString(), umetric.toInt(), (pmetric?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamClose((has?.value ?: 0L).toString(), fdwclose.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamConvert(has: Hacmstream, pash: COpaquePointer?, fdwconvert: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamConvert((has?.value ?: 0L).toString(), (pash?.value ?: 0L).toString(), fdwconvert.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamMessage((has?.value ?: 0L).toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamOpen(phas: COpaquePointer?, had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, pwfltr: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamOpen((phas?.value ?: 0L).toString(), (had?.value ?: 0L).toString(), (pwfxsrc?.value ?: 0L).toString(), (pwfxdst?.value ?: 0L).toString(), (pwfltr?.value ?: 0L).toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwprepare: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamPrepareHeader((has?.value ?: 0L).toString(), (pash?.value ?: 0L).toString(), fdwprepare.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamReset((has?.value ?: 0L).toString(), fdwreset.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: COpaquePointer?, fdwsize: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamSize((has?.value ?: 0L).toString(), cbinput.toInt(), (pdwoutputbytes?.value ?: 0L).toString(), fdwsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwunprepare: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_acmStreamUnprepareHeader((has?.value ?: 0L).toString(), (pash?.value ?: 0L).toString(), fdwunprepare.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid.toString(), (pac?.value ?: 0L).toString(), cbac.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid.toString(), (pac?.value ?: 0L).toString(), cbac.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxGetVolume(udeviceid.toInt(), (pdwvolume?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_auxSetVolume(udeviceid.toInt(), dwvolume.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiConnect((hmi?.value ?: 0L).toString(), (hmo?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiDisconnect((hmi?.value ?: 0L).toString(), (hmo?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInAddBuffer((hmi?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInClose(hmi: Hmidiin): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInClose((hmi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid.toString(), (pmic?.value ?: 0L).toString(), cbmic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid.toString(), (pmic?.value ?: 0L).toString(), cbmic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetID((hmi?.value ?: 0L).toString(), (pudeviceid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInMessage((hmi?.value ?: 0L).toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInOpen(phmi: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInOpen((phmi?.value ?: 0L).toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInPrepareHeader((hmi?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInReset(hmi: Hmidiin): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInReset((hmi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInStart(hmi: Hmidiin): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInStart((hmi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInStop(hmi: Hmidiin): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInStop((hmi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiInUnprepareHeader((hmi?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: COpaquePointer?, fucache: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutCacheDrumPatches((hmo?.value ?: 0L).toString(), upatch.toInt(), (pwkya?.value ?: 0L).toString(), fucache.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: COpaquePointer?, fucache: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutCachePatches((hmo?.value ?: 0L).toString(), ubank.toInt(), (pwpa?.value ?: 0L).toString(), fucache.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutClose((hmo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid.toString(), (pmoc?.value ?: 0L).toString(), cbmoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid.toString(), (pmoc?.value ?: 0L).toString(), cbmoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetID((hmo?.value ?: 0L).toString(), (pudeviceid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutGetVolume((hmo?.value ?: 0L).toString(), (pdwvolume?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutLongMsg((hmo?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutMessage((hmo?.value ?: 0L).toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutOpen(phmo: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutOpen((phmo?.value ?: 0L).toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutPrepareHeader((hmo?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutReset((hmo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutSetVolume((hmo?.value ?: 0L).toString(), dwvolume.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutShortMsg((hmo?.value ?: 0L).toString(), dwmsg.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiOutUnprepareHeader((hmo?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamClose((hms?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamOpen(phms: COpaquePointer?, pudeviceid: COpaquePointer?, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamOpen((phms?.value ?: 0L).toString(), (pudeviceid?.value ?: 0L).toString(), cmidi.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamOut(hms: Hmidistrm, pmh: COpaquePointer?, cbmh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamOut((hms?.value ?: 0L).toString(), (pmh?.value ?: 0L).toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamPause((hms?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: COpaquePointer?, cbmmt: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamPosition((hms?.value ?: 0L).toString(), (lpmmt?.value ?: 0L).toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: COpaquePointer?, dwproperty: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamProperty((hms?.value ?: 0L).toString(), (lppropdata?.value ?: 0L).toString(), dwproperty.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamRestart((hms?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_midiStreamStop((hms?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerClose(hmx: Hmixer): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerClose((hmx?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetControlDetailsA((hmxobj?.value ?: 0L).toString(), (pmxcd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetControlDetailsW((hmxobj?.value ?: 0L).toString(), (pmxcd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid.toString(), (pmxcaps?.value ?: 0L).toString(), cbmxcaps.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid.toString(), (pmxcaps?.value ?: 0L).toString(), cbmxcaps.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: COpaquePointer?, fdwid: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetID((hmxobj?.value ?: 0L).toString(), (pumxid?.value ?: 0L).toString(), fdwid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineControlsA((hmxobj?.value ?: 0L).toString(), (pmxlc?.value ?: 0L).toString(), fdwcontrols.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineControlsW((hmxobj?.value ?: 0L).toString(), (pmxlc?.value ?: 0L).toString(), fdwcontrols.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineInfoA((hmxobj?.value ?: 0L).toString(), (pmxl?.value ?: 0L).toString(), fdwinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetLineInfoW((hmxobj?.value ?: 0L).toString(), (pmxl?.value ?: 0L).toString(), fdwinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerMessage((hmx?.value ?: 0L).toString(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerOpen(phmx: COpaquePointer?, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerOpen((phmx?.value ?: 0L).toString(), umxid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_mixerSetControlDetails((hmxobj?.value ?: 0L).toString(), (pmxcd?.value ?: 0L).toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_sndPlaySoundA((pszsound?.value ?: 0L).toString(), fusound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_sndPlaySoundW((pszsound?.value ?: 0L).toString(), fusound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInAddBuffer((hwi?.value ?: 0L).toString(), (pwh?.value ?: 0L).toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInClose(hwi: Hwavein): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInClose((hwi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid.toString(), (pwic?.value ?: 0L).toString(), cbwic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid.toString(), (pwic?.value ?: 0L).toString(), cbwic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetID((hwi?.value ?: 0L).toString(), (pudeviceid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInGetPosition((hwi?.value ?: 0L).toString(), (pmmt?.value ?: 0L).toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInMessage((hwi?.value ?: 0L).toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInOpen(phwi: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInOpen((phwi?.value ?: 0L).toString(), udeviceid.toInt(), (pwfx?.value ?: 0L).toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInPrepareHeader((hwi?.value ?: 0L).toString(), (pwh?.value ?: 0L).toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInReset(hwi: Hwavein): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInReset((hwi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInStart(hwi: Hwavein): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInStart((hwi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInStop(hwi: Hwavein): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInStop((hwi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveInUnprepareHeader((hwi?.value ?: 0L).toString(), (pwh?.value ?: 0L).toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutBreakLoop((hwo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutClose((hwo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid.toString(), (pwoc?.value ?: 0L).toString(), cbwoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid.toString(), (pwoc?.value ?: 0L).toString(), cbwoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetID((hwo?.value ?: 0L).toString(), (pudeviceid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetNumDevs(): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetPitch((hwo?.value ?: 0L).toString(), (pdwpitch?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetPlaybackRate((hwo?.value ?: 0L).toString(), (pdwrate?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetPosition((hwo?.value ?: 0L).toString(), (pmmt?.value ?: 0L).toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: COpaquePointer?): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutGetVolume((hwo?.value ?: 0L).toString(), (pdwvolume?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutMessage((hwo?.value ?: 0L).toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutOpen(phwo: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutOpen((phwo?.value ?: 0L).toString(), udeviceid.toInt(), (pwfx?.value ?: 0L).toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutPause((hwo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutPrepareHeader((hwo?.value ?: 0L).toString(), (pwh?.value ?: 0L).toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutReset((hwo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutRestart((hwo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutSetPitch((hwo?.value ?: 0L).toString(), dwpitch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutSetPlaybackRate((hwo?.value ?: 0L).toString(), dwrate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutSetVolume((hwo?.value ?: 0L).toString(), dwvolume.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutUnprepareHeader((hwo?.value ?: 0L).toString(), (pwh?.value ?: 0L).toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutWrite(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    if (_windowsWin32MediaAudioNapiAddon != null) (_windowsWin32MediaAudioNapiAddon.windowssys_windows_win32_media_audio_waveOutWrite((hwo?.value ?: 0L).toString(), (pwh?.value ?: 0L).toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
