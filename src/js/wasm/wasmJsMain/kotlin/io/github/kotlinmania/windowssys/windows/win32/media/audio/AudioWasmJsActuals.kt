@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32MediaAudioNapiAddon(): Boolean

private val windowsWin32MediaAudioNapiAvailable: Boolean = initWindowsWin32MediaAudioNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioCoRegisterMessageFilter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioPlaySoundA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioPlaySoundA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioPlaySoundW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioPlaySoundW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverAddA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverAddA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverAddW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverAddW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverClose(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverDetailsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverDetailsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverEnum(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverID(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverOpen(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverPriority(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverPriority(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmDriverRemove(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmDriverRemove(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterChooseA(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterChooseA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterChooseW(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterChooseW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterDetailsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterDetailsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterEnumA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterEnumA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterEnumW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterEnumW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterTagEnumA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFilterTagEnumW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatChooseA(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatChooseA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatChooseW(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatChooseW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatDetailsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatDetailsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatEnumA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatEnumA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatEnumW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatEnumW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatSuggest(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatSuggest(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatTagEnumA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmFormatTagEnumW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmGetVersion()")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmGetVersion(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmMetrics(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmMetrics(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamClose(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamConvert(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamConvert(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamOpen(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamOpen(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamReset(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamReset(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamSize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamSize(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAuxGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAuxGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAuxGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioAuxGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAuxGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaAudioAuxGetNumDevs(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAuxGetVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioAuxGetVolume(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAuxOutMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioAuxOutMessage(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioAuxSetVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioAuxSetVolume(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiConnect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiConnect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiDisconnect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiDisconnect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInAddBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInAddBuffer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInGetErrorTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInGetErrorTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInGetID(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInGetID(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInGetNumDevs(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInOpen(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInPrepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInPrepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInReset(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInStart(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInStart(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInStop(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInStop(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiInUnprepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutCachePatches(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutCachePatches(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetID(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetID(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetNumDevs(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutGetVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutGetVolume(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutLongMsg(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutLongMsg(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutOpen(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutPrepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutReset(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutReset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutSetVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutSetVolume(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutShortMsg(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutShortMsg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamOpen(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamOpen(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamOut(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamOut(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamPause(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamPause(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamPosition(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamProperty(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamRestart(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamRestart(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMidiStreamStop(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMidiStreamStop(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetControlDetailsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetControlDetailsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetID(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetLineControlsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetLineControlsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetLineControlsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetLineControlsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetLineInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetLineInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetLineInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetLineInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerGetNumDevs(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerOpen(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioMixerSetControlDetails(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioMixerSetControlDetails(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioSndPlaySoundA(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioSndPlaySoundA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioSndPlaySoundW(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioSndPlaySoundW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInAddBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInAddBuffer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetErrorTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetErrorTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetID(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetID(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetNumDevs(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInGetPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInGetPosition(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInOpen(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInOpen(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInPrepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInPrepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInReset(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInStart(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInStart(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInStop(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInStop(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveInUnprepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutBreakLoop(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutBreakLoop(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetID(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetID(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetNumDevs(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetPitch(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetPitch(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetPosition(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutGetVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutGetVolume(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutOpen(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutOpen(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutPause(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutPause(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutPrepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutReset(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutReset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutRestart(p0)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutRestart(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutSetPitch(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutSetPitch(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutSetVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutSetVolume(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaAudioWaveOutWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaAudioWaveOutWrite(p0: String, p1: String, p2: Int): Int

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: ConstPtr, activationparams: ConstPtr, completionhandler: MutPtr, activationoperation: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(deviceinterfacepath.rawAddress.toString(), riid.rawAddress.toString(), activationparams.rawAddress.toString(), completionhandler.rawAddress.toString(), activationoperation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterMessageFilter(lpmessagefilter: MutPtr, lplpmessagefilter: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCoRegisterMessageFilter(lpmessagefilter.rawAddress.toString(), lplpmessagefilter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress.toString(), audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitor(audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress.toString(), audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr): Hresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioPlaySoundA(pszsound.rawAddress.toString(), hmod.rawAddress.toString(), fdwsound.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioPlaySoundW(pszsound.rawAddress.toString(), hmod.rawAddress.toString(), fdwsound.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverAddA(phadid: MutPtr, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverAddA(phadid.rawAddress.toString(), hinstmodule.rawAddress.toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverAddW(phadid: MutPtr, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverAddW(phadid.rawAddress.toString(), hinstmodule.rawAddress.toString(), lparam.toString(), dwpriority.toInt(), fdwadd.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverClose(had.rawAddress.toString(), fdwclose.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverDetailsA(hadid.rawAddress.toString(), padd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverDetailsW(hadid.rawAddress.toString(), padd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverEnum(0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverID(hao: Hacmobj, phadid: MutPtr, fdwdriverid: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverID(hao.rawAddress.toString(), phadid.rawAddress.toString(), fdwdriverid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverMessage(had.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverOpen(phad: MutPtr, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverOpen(phad.rawAddress.toString(), hadid.rawAddress.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverPriority(hadid.rawAddress.toString(), dwpriority.toInt(), fdwpriority.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmDriverRemove(hadid.rawAddress.toString(), fdwremove.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterChooseA(pafltrc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterChooseA(pafltrc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterChooseW(pafltrc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterChooseW(pafltrc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterDetailsA(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterDetailsW(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: MutPtr, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterEnumA(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: MutPtr, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterEnumW(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: MutPtr, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterTagEnumA(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: MutPtr, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFilterTagEnumW(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatChooseA(pafmtc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatChooseA(pafmtc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatChooseW(pafmtc: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatChooseW(pafmtc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatDetailsA(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatDetailsW(had.rawAddress.toString(), pafd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: MutPtr, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatEnumA(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: MutPtr, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatEnumW(had.rawAddress.toString(), pafd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: MutPtr, pwfxdst: MutPtr, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatSuggest(had.rawAddress.toString(), pwfxsrc.rawAddress.toString(), pwfxdst.rawAddress.toString(), cbwfxdst.toInt(), fdwsuggest.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(had.rawAddress.toString(), paftd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: MutPtr, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatTagEnumA(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: MutPtr, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmFormatTagEnumW(had.rawAddress.toString(), paftd.rawAddress.toString(), 0L.toString(), dwinstance.toString(), fdwenum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmGetVersion(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmGetVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmMetrics(hao.rawAddress.toString(), umetric.toInt(), pmetric.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamClose(has.rawAddress.toString(), fdwclose.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamConvert(has: Hacmstream, pash: MutPtr, fdwconvert: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamConvert(has.rawAddress.toString(), pash.rawAddress.toString(), fdwconvert.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamMessage(has.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamOpen(phas: MutPtr, had: Hacmdriver, pwfxsrc: MutPtr, pwfxdst: MutPtr, pwfltr: MutPtr, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamOpen(phas.rawAddress.toString(), had.rawAddress.toString(), pwfxsrc.rawAddress.toString(), pwfxdst.rawAddress.toString(), pwfltr.rawAddress.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: MutPtr, fdwprepare: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(has.rawAddress.toString(), pash.rawAddress.toString(), fdwprepare.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamReset(has.rawAddress.toString(), fdwreset.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: MutPtr, fdwsize: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamSize(has.rawAddress.toString(), cbinput.toInt(), pdwoutputbytes.rawAddress.toString(), fdwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: MutPtr, fdwunprepare: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(has.rawAddress.toString(), pash.rawAddress.toString(), fdwunprepare.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: MutPtr, cbac: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAuxGetDevCapsA(udeviceid.toString(), pac.rawAddress.toString(), cbac.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: MutPtr, cbac: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAuxGetDevCapsW(udeviceid.toString(), pac.rawAddress.toString(), cbac.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAuxGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAuxGetVolume(udeviceid.toInt(), pdwvolume.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid.toInt(), umsg.toInt(), dw1.toString(), dw2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid.toInt(), dwvolume.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiConnect(hmi.rawAddress.toString(), hmo.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiDisconnect(hmi.rawAddress.toString(), hmo.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInAddBuffer(hmi.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInClose(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInClose(hmi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: MutPtr, cbmic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInGetDevCapsA(udeviceid.toString(), pmic.rawAddress.toString(), cbmic.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: MutPtr, cbmic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInGetDevCapsW(udeviceid.toString(), pmic.rawAddress.toString(), cbmic.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInGetID(hmi.rawAddress.toString(), pudeviceid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInMessage(hmi.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInOpen(phmi: MutPtr, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInOpen(phmi.rawAddress.toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInPrepareHeader(hmi.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInReset(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInReset(hmi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInStart(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInStart(hmi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInStop(hmi: Hmidiin): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInStop(hmi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiInUnprepareHeader(hmi.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: ConstPtr, fucache: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(hmo.rawAddress.toString(), upatch.toInt(), pwkya.rawAddress.toString(), fucache.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: ConstPtr, fucache: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutCachePatches(hmo.rawAddress.toString(), ubank.toInt(), pwpa.rawAddress.toString(), fucache.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutClose(hmo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: MutPtr, cbmoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(udeviceid.toString(), pmoc.rawAddress.toString(), cbmoc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: MutPtr, cbmoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(udeviceid.toString(), pmoc.rawAddress.toString(), cbmoc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetID(hmo.rawAddress.toString(), pudeviceid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutGetVolume(hmo.rawAddress.toString(), pdwvolume.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: ConstPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutLongMsg(hmo.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutMessage(hmo.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutOpen(phmo: MutPtr, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutOpen(phmo.rawAddress.toString(), udeviceid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutPrepareHeader(hmo.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutReset(hmo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutSetVolume(hmo.rawAddress.toString(), dwvolume.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutShortMsg(hmo.rawAddress.toString(), dwmsg.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(hmo.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamClose(hms.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamOpen(phms: MutPtr, pudeviceid: MutPtr, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamOpen(phms.rawAddress.toString(), pudeviceid.rawAddress.toString(), cmidi.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamOut(hms: Hmidistrm, pmh: MutPtr, cbmh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamOut(hms.rawAddress.toString(), pmh.rawAddress.toString(), cbmh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamPause(hms.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamPosition(hms.rawAddress.toString(), lpmmt.rawAddress.toString(), cbmmt.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: MutPtr, dwproperty: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamProperty(hms.rawAddress.toString(), lppropdata.rawAddress.toString(), dwproperty.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamRestart(hms.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMidiStreamStop(hms.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerClose(hmx: Hmixer): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerClose(hmx.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetControlDetailsA(hmxobj.rawAddress.toString(), pmxcd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: MutPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetControlDetailsW(hmxobj.rawAddress.toString(), pmxcd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: MutPtr, cbmxcaps: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetDevCapsA(umxid.toString(), pmxcaps.rawAddress.toString(), cbmxcaps.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: MutPtr, cbmxcaps: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetDevCapsW(umxid.toString(), pmxcaps.rawAddress.toString(), cbmxcaps.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: MutPtr, fdwid: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetID(hmxobj.rawAddress.toString(), pumxid.rawAddress.toString(), fdwid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: MutPtr, fdwcontrols: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetLineControlsA(hmxobj.rawAddress.toString(), pmxlc.rawAddress.toString(), fdwcontrols.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: MutPtr, fdwcontrols: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetLineControlsW(hmxobj.rawAddress.toString(), pmxlc.rawAddress.toString(), fdwcontrols.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: MutPtr, fdwinfo: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetLineInfoA(hmxobj.rawAddress.toString(), pmxl.rawAddress.toString(), fdwinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: MutPtr, fdwinfo: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetLineInfoW(hmxobj.rawAddress.toString(), pmxl.rawAddress.toString(), fdwinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerMessage(hmx.rawAddress.toString(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerOpen(phmx: MutPtr, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerOpen(phmx.rawAddress.toString(), umxid.toInt(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: ConstPtr, fdwdetails: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioMixerSetControlDetails(hmxobj.rawAddress.toString(), pmxcd.rawAddress.toString(), fdwdetails.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioSndPlaySoundA(pszsound.rawAddress.toString(), fusound.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioSndPlaySoundW(pszsound.rawAddress.toString(), fusound.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInAddBuffer(hwi.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInClose(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInClose(hwi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: MutPtr, cbwic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetDevCapsA(udeviceid.toString(), pwic.rawAddress.toString(), cbwic.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: MutPtr, cbwic: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetDevCapsW(udeviceid.toString(), pwic.rawAddress.toString(), cbwic.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: ConstPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetID(hwi.rawAddress.toString(), pudeviceid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInGetPosition(hwi.rawAddress.toString(), pmmt.rawAddress.toString(), cbmmt.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInMessage(hwi.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInOpen(phwi: MutPtr, udeviceid: UInt, pwfx: ConstPtr, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInOpen(phwi.rawAddress.toString(), udeviceid.toInt(), pwfx.rawAddress.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInPrepareHeader(hwi.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInReset(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInReset(hwi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInStart(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInStart(hwi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInStop(hwi: Hwavein): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInStop(hwi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveInUnprepareHeader(hwi.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutBreakLoop(hwo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutClose(hwo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: MutPtr, cbwoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(udeviceid.toString(), pwoc.rawAddress.toString(), cbwoc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: MutPtr, cbwoc: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(udeviceid.toString(), pwoc.rawAddress.toString(), cbwoc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(mmrerror.toInt(), psztext.rawAddress.toString(), cchtext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetID(hwo.rawAddress.toString(), pudeviceid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetNumDevs(): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetPitch(hwo.rawAddress.toString(), pdwpitch.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(hwo.rawAddress.toString(), pdwrate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetPosition(hwo.rawAddress.toString(), pmmt.rawAddress.toString(), cbmmt.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: MutPtr): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutGetVolume(hwo.rawAddress.toString(), pdwvolume.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutMessage(hwo.rawAddress.toString(), umsg.toInt(), dw1.toString(), dw2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutOpen(phwo: MutPtr, udeviceid: UInt, pwfx: ConstPtr, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutOpen(phwo.rawAddress.toString(), udeviceid.toInt(), pwfx.rawAddress.toString(), dwcallback.toString(), dwinstance.toString(), fdwopen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutPause(hwo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutPrepareHeader(hwo.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutReset(hwo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutRestart(hwo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutSetPitch(hwo.rawAddress.toString(), dwpitch.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(hwo.rawAddress.toString(), dwrate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutSetVolume(hwo.rawAddress.toString(), dwvolume.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(hwo.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waveOutWrite(hwo: Hwaveout, pwh: MutPtr, cbwh: UInt): UInt =
    if (windowsWin32MediaAudioNapiAvailable) wasmWindowssysWindowsWin32MediaAudioWaveOutWrite(hwo.rawAddress.toString(), pwh.rawAddress.toString(), cbwh.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
