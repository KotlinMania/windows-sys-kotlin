@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgndata
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemWindowsprogrammingNapiAddon(): Boolean

private val windowsWin32SystemWindowsprogrammingNapiAvailable: Boolean = initWindowsWin32SystemWindowsprogrammingNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCIDestroy(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIDestroy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCIDraw(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIDraw(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCIEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIEnum(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider()")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCISetClipList(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCISetClipList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCISetDestination(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCISetDestination(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDelNodeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDelNodeA(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDelNodeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDelNodeW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingExecuteCabA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingExecuteCabA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingExecuteCabW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingExecuteCabW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingExtractFilesA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingExtractFilesA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingExtractFilesW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingExtractFilesW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGdiEntry13()")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGdiEntry13(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures()")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetUserNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetUserNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetUserNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetUserNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGlobalFix(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalFix(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingGlobalWire(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalWire(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLocalCompact(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLocalCompact(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLocalShrink(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLocalShrink(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingMulDiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingMulDiv(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingNeedReboot(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingNeedReboot(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit()")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingOpenMutexA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenMutexA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegInstallA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegInstallA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegInstallW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegInstallW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget()")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlInitString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitString(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRtlUniform(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUniform(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWinWatchClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingHread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingHread(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingHwrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingHwrite(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLclose(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLclose(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLcreat(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLcreat(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLlseek(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLlseek(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLopen(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLopen(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLread(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingLwrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingLwrite(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawWcschr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcschr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawWcscpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcscpy(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawWcslen(p0)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcslen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr(p0: String, p1: Int): String

public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA(lpcszfilelist.rawAddress.toString(), lpcszbackupdir.rawAddress.toString(), lpcszbasename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW(lpcszfilelist.rawAddress.toString(), lpcszbackupdir.rawAddress.toString(), lpcszbasename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA(hwnd.rawAddress.toString(), lpszsourcedir.rawAddress.toString(), lpszsourcefile.rawAddress.toString(), lpszdestdir.rawAddress.toString(), lpszdestfile.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW(hwnd.rawAddress.toString(), lpszsourcedir.rawAddress.toString(), lpszsourcefile.rawAddress.toString(), lpszdestdir.rawAddress.toString(), lpszdestfile.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun apphelpCheckShellObject(objectclsid: ConstPtr<Guid>, bshimifnecessary: Bool, pullflags: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject(objectclsid.rawAddress.toString(), bshimifnecessary, pullflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest(hdevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeINFEngine(hinf: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine(hinf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: MutPtr<ULong>, lpconversionerror: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toString(), lpperformancecountervalue.rawAddress.toString(), lpconversionerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: MutPtr<ULong>, lpconversionerror: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toString(), lpauxiliarycountervalue.rawAddress.toString(), lpconversionerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIBeginAccess(pdci: MutPtr<Dcisurfaceinfo>, x: Int, y: Int, dx: Int, dy: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess(pdci.rawAddress.toString(), x, y, dx, dy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICloseProvider(hdc: Hdc) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider(hdc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: MutPtr<MutPtr<Dcioffscreen>>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen(hdc.rawAddress.toString(), dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), lplpsurface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: MutPtr<CVoid>, lplpsurface: MutPtr<MutPtr<Dcioverlay>>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay(hdc.rawAddress.toString(), lpoffscreensurf.rawAddress.toString(), lplpsurface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: MutPtr<MutPtr<Dcisurfaceinfo>>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary(hdc.rawAddress.toString(), lplpsurface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIDestroy(pdci: MutPtr<Dcisurfaceinfo>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIDestroy(pdci.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCIDraw(pdci: MutPtr<Dcioffscreen>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIDraw(pdci.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIEndAccess(pdci: MutPtr<Dcisurfaceinfo>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess(pdci.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCIEnum(hdc: Hdc, lprdst: MutPtr<Rect>, lprsrc: MutPtr<Rect>, lpfncallback: MutPtr<CVoid>, lpcontext: MutPtr<CVoid>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIEnum(hdc.rawAddress.toString(), lprdst.rawAddress.toString(), lprsrc.rawAddress.toString(), lpfncallback.rawAddress.toString(), lpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIOpenProvider(): Hdc =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetClipList(pdci: MutPtr<Dcioffscreen>, prd: MutPtr<Rgndata>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCISetClipList(pdci.rawAddress.toString(), prd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetDestination(pdci: MutPtr<Dcioffscreen>, dst: MutPtr<Rect>, src: MutPtr<Rect>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCISetDestination(pdci.rawAddress.toString(), dst.rawAddress.toString(), src.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetSrcDestClip(pdci: MutPtr<Dcioffscreen>, srcrc: MutPtr<Rect>, destrc: MutPtr<Rect>, prd: MutPtr<Rgndata>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip(pdci.rawAddress.toString(), srcrc.rawAddress.toString(), destrc.rawAddress.toString(), prd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDelNodeA(pszfileordirname.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDelNodeW(pszfileordirname.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA(hostname.rawAddress.toString(), computername.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW(hostname.rawAddress.toString(), computername.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: MutPtr<Filetime>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime(wfatdate.toInt(), wfattime.toInt(), lpfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(features.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeCabA(hwnd: Hwnd, pcab: MutPtr<Cabinfoa>, preserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingExecuteCabA(hwnd.rawAddress.toString(), pcab.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeCabW(hwnd: Hwnd, pcab: MutPtr<Cabinfow>, preserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingExecuteCabW(hwnd.rawAddress.toString(), pcab.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingExtractFilesA(pszcabname.rawAddress.toString(), pszexpanddir.rawAddress.toString(), dwflags.toInt(), pszfilelist.rawAddress.toString(), lpreserved.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingExtractFilesW(pszcabname.rawAddress.toString(), pszexpanddir.rawAddress.toString(), dwflags.toInt(), pszfilelist.rawAddress.toString(), lpreserved.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA(lpfilelist.rawAddress.toString(), lpdir.rawAddress.toString(), lpbasename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW(lpfilelist.rawAddress.toString(), lpdir.rawAddress.toString(), lpbasename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), pszbackupdir.rawAddress.toString(), pszbasebackupfile.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), pszbackupdir.rawAddress.toString(), pszbasebackupfile.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW(hdlg.rawAddress.toString(), lpfilelist.rawAddress.toString(), lpdir.rawAddress.toString(), lpbasename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToDosDateTime(lpfiletime: ConstPtr<Filetime>, lpfatdate: MutPtr<UShort>, lpfattime: MutPtr<UShort>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime(lpfiletime.rawAddress.toString(), lpfatdate.rawAddress.toString(), lpfattime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEntry13(): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGdiEntry13().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA(lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW(lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentHwProfileA(lphwprofileinfo: MutPtr<HwProfileInfoa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA(lphwprofileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentHwProfileW(lphwprofileinfo: MutPtr<HwProfileInfow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW(lphwprofileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: MutPtr<Rgndata>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData(hdc.rawAddress.toString(), size.toInt(), prd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(featureid.toInt(), changetime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: MutPtr<UInt>, hasnotification: MutPtr<Bool>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant(featureid.toInt(), changetime, payloadid.rawAddress.toString(), hasnotification.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr<CVoid>, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr<CVoid>, nsize: UInt, pdwattribubutes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt(), pdwattribubutes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr<CVoid>, nsize: UInt, pdwattribubutes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt(), pdwattribubutes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr<CVoid>, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault, lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault, lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA(lpszreturnbuffer.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW(lpszreturnbuffer.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: MutPtr<CVoid>, usizestruct: UInt, szfile: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: MutPtr<CVoid>, usizestruct: UInt, szfile: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemRegistryQuota(pdwquotaallowed: MutPtr<UInt>, pdwquotaused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota(pdwquotaallowed.rawAddress.toString(), pdwquotaused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadEnabledXStateFeatures(): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetUserNameA(lpbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetUserNameW(lpbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: MutPtr<Rgndata>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData(hwnd.rawAddress.toString(), size.toInt(), prd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalCompact(dwminfree: UInt): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(dwminfree.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFix(hmem: Hglobal) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalFix(hmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalUnWire(hmem: Hglobal): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire(hmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalUnfix(hmem: Hglobal) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix(hmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalWire(hmem: Hglobal): MutPtr<CVoid> =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingGlobalWire(hmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPGetIMEA(param0: Hwnd, param1: MutPtr<Imeproa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPGetIMEW(param0: Hwnd, param1: MutPtr<Imeprow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPQueryIMEA(param0: MutPtr<Imeproa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPQueryIMEW(param0: MutPtr<Imeprow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPSetIMEA(param0: Hwnd, param1: MutPtr<Imeproa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPSetIMEW(param0: Hwnd, param1: MutPtr<Imeprow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented(contract.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadHugeReadPtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr(lp.rawAddress.toString(), ucb.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadHugeWritePtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr(lp.rawAddress.toString(), ucb.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin(dwreserved.toInt(), lpdwreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNativeVhdBoot(nativevhdboot: MutPtr<Bool>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot(nativevhdboot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted(tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW(hwndowner.rawAddress.toString(), hinstance.rawAddress.toString(), pszparams.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localCompact(uminfree: UInt): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLocalCompact(uminfree.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLocalShrink(hmem.rawAddress.toString(), cbnewsize.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingMulDiv(nnumber, nnumerator, ndenominator) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingNeedReboot(dwrebootcheck.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needRebootInit(): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: MutPtr<MutPtr<CVoid>>, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), dwflags.toInt(), phinf.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: MutPtr<MutPtr<CVoid>>, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), dwflags.toInt(), phinf.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenMutexA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIdleProcessorCycleTime(bufferlength: MutPtr<UInt>, processoridlecycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime(bufferlength.rawAddress.toString(), processoridlecycletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: MutPtr<UInt>, processoridlecycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx(group.toInt(), bufferlength.rawAddress.toString(), processoridlecycletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryInterruptTime(lpinterrupttime: MutPtr<ULong>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime(lpinterrupttime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: MutPtr<ULong>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise(lpinterrupttimeprecise.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime(processhandle.rawAddress.toString(), cycletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime(threadhandle.rawAddress.toString(), cycletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUnbiasedInterruptTime(unbiasedtime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime(unbiasedtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: MutPtr<ULong>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: ConstPtr<CustomSystemEventTriggerConfig>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger(customsystemeventtriggerconfig.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA(hwnd.rawAddress.toString(), pszinf.rawAddress.toString(), pszsec.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW(hwnd.rawAddress.toString(), pszinf.rawAddress.toString(), pszsec.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recordFeatureError(featureid: UInt, error: ConstPtr<FeatureError>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError(featureid.toInt(), error.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), originname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: ConstPtr<Strtablea>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegInstallA(hmod.rawAddress.toString(), pszsection.rawAddress.toString(), psttable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: ConstPtr<Strtablew>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegInstallW(hmod.rawAddress.toString(), pszsection.rawAddress.toString(), psttable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString(), pcszrootkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvaluename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), hhklmbackkey.rawAddress.toString(), hhkcubackkey.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), hhklmbackkey.rawAddress.toString(), hhkcubackkey.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString(), pcszrootkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvaluename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit(targetpartition.rawAddress.toString(), sparepartition.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup(hdevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAnsiStringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCharToInteger(string: MutPtr<Byte>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger(string.rawAddress.toString(), base.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeAnsiString(ansistring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString(ansistring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFreeOemString(oemstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString(oemstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFreeUnicodeString(unicodestring: MutPtr<UnicodeString>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString(unicodestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitAnsiString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitAnsiStringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitStringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlIsNameLegalDOS8Dot3(name: MutPtr<UnicodeString>, oemname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, namecontainsspaces: MutPtr<Boolean>): Boolean =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3(name.rawAddress.toString(), oemname.rawAddress.toString(), namecontainsspaces.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLocalTimeToSystemTime(localtime: MutPtr<Long>, systemtime: MutPtr<Long>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime(localtime.rawAddress.toString(), systemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: ConstPtr<CustomSystemEventTriggerConfig>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger(triggerconfig.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToSecondsSince1970(time: MutPtr<Long>, elapsedseconds: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970(time.rawAddress.toString(), elapsedseconds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToAnsiString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize(bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUniform(seed: MutPtr<UInt>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRtlUniform(seed.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: MutPtr<Handle>, dwflags: UInt, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA(hwnd.rawAddress.toString(), szcmdname.rawAddress.toString(), szinfsection.rawAddress.toString(), szdir.rawAddress.toString(), lpsztitle.rawAddress.toString(), phexe.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: MutPtr<Handle>, dwflags: UInt, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW(hwnd.rawAddress.toString(), szcmdname.rawAddress.toString(), szinfsection.rawAddress.toString(), szdir.rawAddress.toString(), lpsztitle.rawAddress.toString(), phexe.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA(param0.rawAddress.toString(), param1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW(param0.rawAddress.toString(), param1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA(newenvironment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr<CVoid>, nsize: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr<CVoid>, nsize: UInt, dwattributes: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt(), dwattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr<CVoid>, nsize: UInt, dwattributes: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt(), dwattributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr<CVoid>, nsize: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleCount(unumber: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(unumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator(hmsgindicator.rawAddress.toString(), ulmsgcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerUserSecValuesA(pperuser: MutPtr<Perusersectiona>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA(pperuser.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerUserSecValuesW(pperuser: MutPtr<Perusersectionw>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW(pperuser.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeFeatureStateChangeNotification(subscription: MutPtr<FeatureStateChangeSubscription>, callback: PfeatureStateChangeCallback, context: ConstPtr<CVoid>) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification(subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), cchbuffer.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringExA(hinf: MutPtr<CVoid>, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA(hinf.rawAddress.toString(), pszinffilename.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringExW(hinf: MutPtr<CVoid>, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW(hinf.rawAddress.toString(), pszinffilename.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), cchbuffer.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification(subscription.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME(param0.rawAddress.toString(), param1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchClose(hww: Hwinwatch) {
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchClose(hww.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange(hww.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: MutPtr<Rect>, size: UInt, prd: MutPtr<Rgndata>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList(hww.rawAddress.toString(), prc.rawAddress.toString(), size.toInt(), prd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify(hww.rawAddress.toString(), 0L.toString(), notifyparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteBuffer(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, buffer: ConstPtr<UByte>, buffersize: UInt, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer(host.rawAddress.toString(), options, buffer.rawAddress.toString(), buffersize.toInt(), auditinfo.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteFile(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile(host.rawAddress.toString(), options, filehandle.rawAddress.toString(), auditinfo.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteStream(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, stream: MutPtr<CVoid>, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream(host.rawAddress.toString(), options, stream.rawAddress.toString(), auditinfo.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpGetLockdownPolicy(hostinformation: ConstPtr<WldpHostInformation>, lockdownstate: MutPtr<UInt>, lockdownflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy(hostinformation.rawAddress.toString(), lockdownstate.rawAddress.toString(), lockdownflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpIsClassInApprovedList(classid: ConstPtr<Guid>, hostinformation: ConstPtr<WldpHostInformation>, isapproved: MutPtr<Bool>, optionalflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList(classid.rawAddress.toString(), hostinformation.rawAddress.toString(), isapproved.rawAddress.toString(), optionalflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled(isenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpQueryDeviceSecurityInformation(information: MutPtr<WldpDeviceSecurityInformation>, informationlength: UInt, returnlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation(information.rawAddress.toString(), informationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: ConstPtr<CVoid>, imagesize: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust(filehandle.rawAddress.toString(), baseimage.rawAddress.toString(), imagesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust(filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA(lpappname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW(lpappname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: ConstPtr<CVoid>, usizestruct: UInt, szfile: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: ConstPtr<CVoid>, usizestruct: UInt, szfile: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA(lpappname.rawAddress.toString(), lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW(lpappname.rawAddress.toString(), lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hread(hfile: Int, lpbuffer: MutPtr<CVoid>, lbytes: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingHread(hfile, lpbuffer.rawAddress.toString(), lbytes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingHwrite(hfile, lpbuffer.rawAddress.toString(), lbytes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lclose(hfile: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLclose(hfile) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLcreat(lppathname.rawAddress.toString(), iattribute) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLlseek(hfile, loffset, iorigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLopen(lppathname.rawAddress.toString(), ireadwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lread(hfile: Int, lpbuffer: MutPtr<CVoid>, ubytes: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLread(hfile, lpbuffer.rawAddress.toString(), ubytes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingLwrite(hfile, lpbuffer.rawAddress.toString(), ubytes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrcmpW(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW(string1.rawAddress.toString(), string2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrcmpiW(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW(string1.rawAddress.toString(), string2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrlenW(string: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcschr(string: ConstPtr<UShort>, character: UShort): MutPtr<UShort> =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcschr(string.rawAddress.toString(), character.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcscpy(destination: MutPtr<UShort>, source: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcscpy(destination.rawAddress.toString(), source.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcsicmp(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp(string1.rawAddress.toString(), string2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcslen(string: ConstPtr<UShort>): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcslen(string.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcsrchr(string: ConstPtr<UShort>, character: UShort): MutPtr<UShort> =
    if (windowsWin32SystemWindowsprogrammingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr(string.rawAddress.toString(), character.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
