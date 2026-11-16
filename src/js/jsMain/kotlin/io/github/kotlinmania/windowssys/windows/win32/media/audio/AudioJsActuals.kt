@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32MediaAudioNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: ConstPtr, activationparams: ConstPtr, completionhandler: MutPtr, activationoperation: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(deviceinterfacepath.rawAddress.toString(), riid.rawAddress.toString(), activationparams.rawAddress.toString(), completionhandler.rawAddress.toString(), activationoperation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterMessageFilter(lpmessagefilter: MutPtr, lplpmessagefilter: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(lpmessagefilter.rawAddress.toString(), lplpmessagefilter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress.toString(), audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitor(audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress.toString(), audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioPlaySoundA(pszsound.rawAddress.toString(), hmod.rawAddress.toString(), fdwsound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioPlaySoundW(pszsound.rawAddress.toString(), hmod.rawAddress.toString(), fdwsound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverAddA(phadid: MutPtr, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverAddA(phadid.rawAddress.toString(), hinstmodule.rawAddress.toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverAddW(phadid: MutPtr, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverAddW(phadid.rawAddress.toString(), hinstmodule.rawAddress.toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverClose(had.rawAddress.toString(), fdwclose.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverDetailsA(hadid.rawAddress.toString(), padd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverDetailsW(hadid.rawAddress.toString(), padd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverEnum(0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverID(hao: Hacmobj, phadid: MutPtr, fdwdriverid: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverID(hao.rawAddress.toString(), phadid.rawAddress.toString(), fdwdriverid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverMessage(had.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverOpen(phad: MutPtr, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverOpen(phad.rawAddress.toString(), hadid.rawAddress.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverPriority(hadid.rawAddress.toString(), dwpriority.toInt(), fdwpriority.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmDriverRemove(hadid.rawAddress.toString(), fdwremove.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterChooseA(pafltrc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterChooseA(pafltrc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterChooseW(pafltrc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterChooseW(pafltrc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterDetailsA(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterDetailsW(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: MutPtr, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterEnumA(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: MutPtr, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterEnumW(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: MutPtr, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: MutPtr, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatChooseA(pafmtc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatChooseA(pafmtc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatChooseW(pafmtc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatChooseW(pafmtc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatDetailsA(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatDetailsW(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: MutPtr, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatEnumA(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: MutPtr, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatEnumW(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: MutPtr, pwfxdst: MutPtr, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatSuggest(had.rawAddress.toString(), pwfxsrc.rawAddress.toString(), pwfxdst.rawAddress.toString(), cbwfxdst.toInt(), fdwsuggest.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: MutPtr, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: MutPtr, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmGetVersion(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmGetVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmMetrics(hao.rawAddress.toString(), umetric.toInt(), pmetric.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamClose(has.rawAddress.toString(), fdwclose.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamConvert(has: Hacmstream, pash: MutPtr, fdwconvert: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamConvert(has.rawAddress.toString(), pash.rawAddress.toString(), fdwconvert.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamMessage(has.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamOpen(phas: MutPtr, had: Hacmdriver, pwfxsrc: MutPtr, pwfxdst: MutPtr, pwfltr: MutPtr, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamOpen(phas.rawAddress.toString(), had.rawAddress.toString(), pwfxsrc.rawAddress.toString(), pwfxdst.rawAddress.toString(), pwfltr.rawAddress.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: MutPtr, fdwprepare: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(has.rawAddress.toString(), pash.rawAddress.toString(), fdwprepare.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamReset(has.rawAddress.toString(), fdwreset.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: MutPtr, fdwsize: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamSize(has.rawAddress.toString(), cbinput.toInt(), pdwoutputbytes.rawAddress.toString(), fdwsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: MutPtr, fdwunprepare: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(has.rawAddress.toString(), pash.rawAddress.toString(), fdwunprepare.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: MutPtr, cbac: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAuxGetDevCapsA(udeviceid.toString(), pac.rawAddress.toString(), cbac.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: MutPtr, cbac: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAuxGetDevCapsW(udeviceid.toString(), pac.rawAddress.toString(), cbac.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAuxGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAuxGetVolume(udeviceid.toInt(), pdwvolume.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid.toInt(), dwvolume.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiConnect(hmi.rawAddress.toString(), hmo.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiDisconnect(hmi.rawAddress.toString(), hmo.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInAddBuffer(hmi.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInClose(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInClose(hmi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: MutPtr, cbmic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(udeviceid.toString(), pmic.rawAddress.toString(), cbmic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: MutPtr, cbmic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(udeviceid.toString(), pmic.rawAddress.toString(), cbmic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInGetID(hmi.rawAddress.toString(), pudeviceid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInMessage(hmi.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInOpen(phmi: MutPtr, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInOpen(phmi.rawAddress.toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInPrepareHeader(hmi.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInReset(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInReset(hmi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInStart(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInStart(hmi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInStop(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInStop(hmi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(hmi.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: ConstPtr, fucache: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(hmo.rawAddress.toString(), upatch.toInt(), pwkya.rawAddress.toString(), fucache.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: ConstPtr, fucache: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutCachePatches(hmo.rawAddress.toString(), ubank.toInt(), pwpa.rawAddress.toString(), fucache.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutClose(hmo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: MutPtr, cbmoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(udeviceid.toString(), pmoc.rawAddress.toString(), cbmoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: MutPtr, cbmoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(udeviceid.toString(), pmoc.rawAddress.toString(), cbmoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetID(hmo.rawAddress.toString(), pudeviceid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutGetVolume(hmo.rawAddress.toString(), pdwvolume.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: ConstPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutLongMsg(hmo.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutMessage(hmo.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutOpen(phmo: MutPtr, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutOpen(phmo.rawAddress.toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(hmo.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutReset(hmo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutSetVolume(hmo.rawAddress.toString(), dwvolume.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutShortMsg(hmo.rawAddress.toString(), dwmsg.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(hmo.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamClose(hms.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamOpen(phms: MutPtr, pudeviceid: MutPtr, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamOpen(phms.rawAddress.toString(), pudeviceid.rawAddress.toString(), cmidi.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamOut(hms: Hmidistrm, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamOut(hms.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamPause(hms.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamPosition(hms.rawAddress.toString(), lpmmt.rawAddress.toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: MutPtr, dwproperty: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamProperty(hms.rawAddress.toString(), lppropdata.rawAddress.toString(), dwproperty.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamRestart(hms.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMidiStreamStop(hms.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerClose(hmx: Hmixer): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerClose(hmx.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(hmxobj.rawAddress.toString(), pmxcd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(hmxobj.rawAddress.toString(), pmxcd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: MutPtr, cbmxcaps: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetDevCapsA(umxid.toString(), pmxcaps.rawAddress.toString(), cbmxcaps.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: MutPtr, cbmxcaps: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetDevCapsW(umxid.toString(), pmxcaps.rawAddress.toString(), cbmxcaps.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: MutPtr, fdwid: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetID(hmxobj.rawAddress.toString(), pumxid.rawAddress.toString(), fdwid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: MutPtr, fdwcontrols: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetLineControlsA(hmxobj.rawAddress.toString(), pmxlc.rawAddress.toString(), fdwcontrols.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: MutPtr, fdwcontrols: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetLineControlsW(hmxobj.rawAddress.toString(), pmxlc.rawAddress.toString(), fdwcontrols.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: MutPtr, fdwinfo: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetLineInfoA(hmxobj.rawAddress.toString(), pmxl.rawAddress.toString(), fdwinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: MutPtr, fdwinfo: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetLineInfoW(hmxobj.rawAddress.toString(), pmxl.rawAddress.toString(), fdwinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerMessage(hmx.rawAddress.toString(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerOpen(phmx: MutPtr, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerOpen(phmx.rawAddress.toString(), umxid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: ConstPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioMixerSetControlDetails(hmxobj.rawAddress.toString(), pmxcd.rawAddress.toString(), fdwdetails.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioSndPlaySoundA(pszsound.rawAddress.toString(), fusound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioSndPlaySoundW(pszsound.rawAddress.toString(), fusound.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInAddBuffer(hwi.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInClose(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInClose(hwi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: MutPtr, cbwic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(udeviceid.toString(), pwic.rawAddress.toString(), cbwic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: MutPtr, cbwic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(udeviceid.toString(), pwic.rawAddress.toString(), cbwic.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: ConstPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetID(hwi.rawAddress.toString(), pudeviceid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInGetPosition(hwi.rawAddress.toString(), pmmt.rawAddress.toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInMessage(hwi.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInOpen(phwi: MutPtr, udeviceid: UInt, pwfx: ConstPtr, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInOpen(phwi.rawAddress.toString(), udeviceid.toInt(), pwfx.rawAddress.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInPrepareHeader(hwi.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInReset(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInReset(hwi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInStart(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInStart(hwi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInStop(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInStop(hwi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(hwi.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutBreakLoop(hwo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutClose(hwo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: MutPtr, cbwoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(udeviceid.toString(), pwoc.rawAddress.toString(), cbwoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: MutPtr, cbwoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(udeviceid.toString(), pwoc.rawAddress.toString(), cbwoc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetID(hwo.rawAddress.toString(), pudeviceid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetPitch(hwo.rawAddress.toString(), pdwpitch.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(hwo.rawAddress.toString(), pdwrate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetPosition(hwo.rawAddress.toString(), pmmt.rawAddress.toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutGetVolume(hwo.rawAddress.toString(), pdwvolume.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutMessage(hwo.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutOpen(phwo: MutPtr, udeviceid: UInt, pwfx: ConstPtr, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutOpen(phwo.rawAddress.toString(), udeviceid.toInt(), pwfx.rawAddress.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutPause(hwo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(hwo.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutReset(hwo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutRestart(hwo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutSetPitch(hwo.rawAddress.toString(), dwpitch.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(hwo.rawAddress.toString(), dwrate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutSetVolume(hwo.rawAddress.toString(), dwvolume.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(hwo.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutWrite(hwo: Hwaveout, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAddon != null) (windowsWin32MediaAudioNapiAddon.windowssysWindowsWin32MediaAudioWaveOutWrite(hwo.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
