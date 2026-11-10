@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemApplicationinstallationandservicingNapiAddon(): Boolean

private val _windowsWin32SystemApplicationinstallationandservicingNapiAvailable: Boolean = _initWindowsWin32SystemApplicationinstallationandservicingNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_activateActCtx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_activateActCtx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_addRefActCtx(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_addRefActCtx(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByBuffers(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByBuffers(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandles(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandles(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandlesEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandlesEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxA(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxW(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandles(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandles(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandlesEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandlesEx(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExA(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExW(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_deactivateActCtx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_deactivateActCtx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_deltaFree(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_deltaFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileByHandles(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileByHandles(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionGuid(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionGuid(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringA(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringW(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getCurrentActCtx(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getCurrentActCtx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByBuffer(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByBuffer(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByHandle(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseAllHandles()")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseAllHandles(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseHandle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoA(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoW(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateRecord(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateRecord(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseCommit(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseCommit(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableUIPreview(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableUIPreview(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEndTransaction(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEndTransaction(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsA(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsW(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsA(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsA(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetActiveDatabase(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetActiveDatabase(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetDatabaseState(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetDatabaseState(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostA(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostW(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLanguage(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLanguage(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLastErrorRecord()")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLastErrorRecord(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetMode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiJoinTransaction(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiJoinTransaction(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessMessage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessMessage(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateA(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateW(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordClearData(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordClearData(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordDataSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordDataSize(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetFieldCount(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetFieldCount(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetInteger(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetInteger(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordIsNull(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordIsNull(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordReadStream(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordReadStream(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetInteger(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetInteger(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIRecord(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIRecord(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInstallLevel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInstallLevel(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInternalUI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInternalUI(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetMode(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetMode(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyCount(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoPersist(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoPersist(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyW(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyDiskSpace(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyDiskSpace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageA(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageW(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewClose(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewClose(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewExecute(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewExecute(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewFetch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewFetch(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetColumnInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetColumnInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewModify(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewModify(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_normalizeFileForPatchSignature(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_normalizeFileForPatchSignature(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxSettingsW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxSettingsW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxW(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_releaseActCtx(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_releaseActCtx(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_sfcGetNextProtectedFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfcGetNextProtectedFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsFileProtected(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsFileProtected(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsKeyProtected(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsKeyProtected(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_sfpVerifyFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfpVerifyFile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByBuffers(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByBuffers(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByHandles(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByHandles(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_applicationinstallationandservicing_zombifyActCtx(p0)")
private external fun _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_zombifyActCtx(p0: String): Int

public actual fun activateActCtx(hactctx: Handle, lpcookie: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_activateActCtx((hactctx?.value ?: 0L).toString(), (lpcookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRefActCtx(hactctx: Handle) {
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_addRefActCtx((hactctx?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaA(applyflags.toString(), (lpsourcename?.value ?: 0L).toString(), (lpdeltaname?.value ?: 0L).toString(), (lptargetname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: COpaquePointer?, lptarget: COpaquePointer?, lptargetreverse: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: COpaquePointer?, utargetsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaW(applyflags.toString(), (lpsourcename?.value ?: 0L).toString(), (lpdeltaname?.value ?: 0L).toString(), (lptargetname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileA((patchfilename?.value ?: 0L).toString(), (oldfilename?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByBuffers(patchfilemapped: COpaquePointer?, patchfilesize: UInt, oldfilemapped: COpaquePointer?, oldfilesize: UInt, newfilebuffer: COpaquePointer?, newfilebuffersize: UInt, newfileactualsize: COpaquePointer?, newfiletime: COpaquePointer?, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByBuffers((patchfilemapped?.value ?: 0L).toString(), patchfilesize.toInt(), (oldfilemapped?.value ?: 0L).toString(), oldfilesize.toInt(), (newfilebuffer?.value ?: 0L).toString(), newfilebuffersize.toInt(), (newfileactualsize?.value ?: 0L).toString(), (newfiletime?.value ?: 0L).toString(), applyoptionflags.toInt(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandles((patchfilehandle?.value ?: 0L).toString(), (oldfilehandle?.value ?: 0L).toString(), (newfilehandle?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandlesEx((patchfilehandle?.value ?: 0L).toString(), (oldfilehandle?.value ?: 0L).toString(), (newfilehandle?.value ?: 0L).toString(), applyoptionflags.toInt(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExA((patchfilename?.value ?: 0L).toString(), (oldfilename?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), applyoptionflags.toInt(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExW((patchfilename?.value ?: 0L).toString(), (oldfilename?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), applyoptionflags.toInt(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileW((patchfilename?.value ?: 0L).toString(), (oldfilename?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createActCtxA(pactctx: COpaquePointer?): Handle =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxA((pactctx?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createActCtxW(pactctx: COpaquePointer?): Handle =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxW((pactctx?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: COpaquePointer?, hashalgid: AlgId, lpdeltaname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: COpaquePointer?, hashalgid: AlgId, lpdelta: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: COpaquePointer?, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileA((oldfilename?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), (patchfilename?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandles((oldfilehandle?.value ?: 0L).toString(), (newfilehandle?.value ?: 0L).toString(), (patchfilehandle?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: COpaquePointer?, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: COpaquePointer?, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandlesEx(oldfilecount.toInt(), (oldfileinfoarray?.value ?: 0L).toString(), (newfilehandle?.value ?: 0L).toString(), (patchfilehandle?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: COpaquePointer?, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: COpaquePointer?, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExA(oldfilecount.toInt(), (oldfileinfoarray?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), (patchfilename?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: COpaquePointer?, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: COpaquePointer?, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExW(oldfilecount.toInt(), (oldfileinfoarray?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), (patchfilename?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileW((oldfilename?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), (patchfilename?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_deactivateActCtx(dwflags.toInt(), ulcookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deltaFree(lpmemory: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_deltaFree((lpmemory?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: COpaquePointer?, usourcesize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileA((patchfilename?.value ?: 0L).toString(), (patchheaderfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileByHandles((patchfilehandle?.value ?: 0L).toString(), (patchheaderfilehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileW((patchfilename?.value ?: 0L).toString(), (patchheaderfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: COpaquePointer?, ulsectionid: UInt, lpguidtofind: COpaquePointer?, returneddata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionGuid(dwflags.toInt(), (lpextensionguid?.value ?: 0L).toString(), ulsectionid.toInt(), (lpguidtofind?.value ?: 0L).toString(), (returneddata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: COpaquePointer?, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringA(dwflags.toInt(), (lpextensionguid?.value ?: 0L).toString(), ulsectionid.toInt(), (lpstringtofind?.value ?: 0L).toString(), (returneddata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: COpaquePointer?, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringW(dwflags.toInt(), (lpextensionguid?.value ?: 0L).toString(), ulsectionid.toInt(), (lpstringtofind?.value ?: 0L).toString(), (returneddata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentActCtx(lphactctx: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getCurrentActCtx((lphactctx?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoA((lpdeltaname?.value ?: 0L).toString(), (lpheaderinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoW((lpdeltaname?.value ?: 0L).toString(), (lpheaderinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureA(filetypeset.toString(), hashalgid.toInt(), (lpsourcename?.value ?: 0L).toString(), (lphash?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureW(filetypeset.toString(), hashalgid.toInt(), (lpsourcename?.value ?: 0L).toString(), (lphash?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureA((filename?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L).toString(), retainrangecount.toInt(), (retainrangearray?.value ?: 0L).toString(), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureByBuffer(filebufferwritable: COpaquePointer?, filesize: UInt, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByBuffer((filebufferwritable?.value ?: 0L).toString(), filesize.toInt(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L).toString(), retainrangecount.toInt(), (retainrangearray?.value ?: 0L).toString(), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByHandle((filehandle?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L).toString(), retainrangecount.toInt(), (retainrangearray?.value ?: 0L).toString(), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureW((filename?.value ?: 0L).toString(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L).toString(), retainrangecount.toInt(), (retainrangearray?.value ?: 0L).toString(), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductA((szpackagepath?.value ?: 0L).toString(), (szscriptfilepath?.value ?: 0L).toString(), (sztransforms?.value ?: 0L).toString(), lgidlanguage.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExA((szpackagepath?.value ?: 0L).toString(), (szscriptfilepath?.value ?: 0L).toString(), (sztransforms?.value ?: 0L).toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExW((szpackagepath?.value ?: 0L).toString(), (szscriptfilepath?.value ?: 0L).toString(), (sztransforms?.value ?: 0L).toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductW((szpackagepath?.value ?: 0L).toString(), (szscriptfilepath?.value ?: 0L).toString(), (sztransforms?.value ?: 0L).toString(), lgidlanguage.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: COpaquePointer?, fremoveitems: Bool): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptA((szscriptfile?.value ?: 0L).toString(), dwflags.toInt(), (phregdata?.value ?: 0L).toString(), fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: COpaquePointer?, fremoveitems: Bool): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptW((szscriptfile?.value ?: 0L).toString(), dwflags.toInt(), (phregdata?.value ?: 0L).toString(), fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesA((szpatchpackages?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), (szpropertieslist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesW((szpatchpackages?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), (szpropertieslist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchA((szpatchpackage?.value ?: 0L).toString(), (szinstallpackage?.value ?: 0L).toString(), einstalltype, (szcommandline?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchW((szpatchpackage?.value ?: 0L).toString(), (szinstallpackage?.value ?: 0L).toString(), einstalltype, (szcommandline?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: COpaquePointer?, phchangeofownerevent: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionA((szname?.value ?: 0L).toString(), dwtransactionattributes.toInt(), (phtransactionhandle?.value ?: 0L).toString(), (phchangeofownerevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: COpaquePointer?, phchangeofownerevent: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionW((szname?.value ?: 0L).toString(), dwtransactionattributes.toInt(), (phtransactionhandle?.value ?: 0L).toString(), (phchangeofownerevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCloseAllHandles(): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseAllHandles().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCloseHandle(hany: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseHandle(hany.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCollectUserInfoA(szproduct: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoA((szproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCollectUserInfoW(szproduct: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoW((szproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductA((szproduct?.value ?: 0L).toString(), iinstalllevel, einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExA((szproduct?.value ?: 0L).toString(), iinstalllevel, einstallstate, (szcommandline?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExW((szproduct?.value ?: 0L).toString(), iinstalllevel, einstallstate, (szcommandline?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductW((szproduct?.value ?: 0L).toString(), iinstalllevel, einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateRecord(cparams: UInt): Msihandle =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateRecord(cparams.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L).toString(), ierrorconditions, ivalidation).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L).toString(), ierrorconditions, ivalidation).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformA(hdatabase.toInt(), (sztransformfile?.value ?: 0L).toString(), ierrorconditions).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformW(hdatabase.toInt(), (sztransformfile?.value ?: 0L).toString(), ierrorconditions).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseCommit(hdatabase: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseCommit(hdatabase.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportA(hdatabase.toInt(), (sztablename?.value ?: 0L).toString(), (szfolderpath?.value ?: 0L).toString(), (szfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportW(hdatabase.toInt(), (sztablename?.value ?: 0L).toString(), (szfolderpath?.value ?: 0L).toString(), (szfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L).toString(), ireserved1, ireserved2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L).toString(), ireserved1, ireserved2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysA(hdatabase.toInt(), (sztablename?.value ?: 0L).toString(), (phrecord?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysW(hdatabase.toInt(), (sztablename?.value ?: 0L).toString(), (phrecord?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportA(hdatabase.toInt(), (szfolderpath?.value ?: 0L).toString(), (szfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportW(hdatabase.toInt(), (szfolderpath?.value ?: 0L).toString(), (szfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentA(hdatabase.toInt(), (sztablename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentW(hdatabase.toInt(), (sztablename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), (sztablename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), (sztablename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewA(hdatabase.toInt(), (szquery?.value ?: 0L).toString(), (phview?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewW(hdatabase.toInt(), (szquery?.value ?: 0L).toString(), (phview?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesA((szproductpackagepath?.value ?: 0L).toString(), cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesW((szproductpackagepath?.value ?: 0L).toString(), cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceA((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceW((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionA(hinstall.toInt(), (szaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionW(hinstall.toInt(), (szaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogA(dwlogmode.toInt(), (szlogfile?.value ?: 0L).toString(), dwlogattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogW(dwlogmode.toInt(), (szlogfile?.value ?: 0L).toString(), dwlogattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableUIPreview(hdatabase.toInt(), (phpreview?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEndTransaction(dwtransactionstate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsA((szcomponent?.value ?: 0L).toString(), iproductindex.toInt(), (lpproductbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: COpaquePointer?, szsid: Pstr, pcchsid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExA((szcomponent?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwproductindex.toInt(), (szproductbuf?.value ?: 0L).toString(), (pdwinstalledcontext?.value ?: 0L).toString(), (szsid?.value ?: 0L).toString(), (pcchsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: COpaquePointer?, szsid: Pwstr, pcchsid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExW((szcomponent?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwproductindex.toInt(), (szproductbuf?.value ?: 0L).toString(), (pdwinstalledcontext?.value ?: 0L).toString(), (szsid?.value ?: 0L).toString(), (pcchsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsW((szcomponent?.value ?: 0L).toString(), iproductindex.toInt(), (lpproductbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: COpaquePointer?, picost: COpaquePointer?, pitempcost: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsA(hinstall.toInt(), (szcomponent?.value ?: 0L).toString(), dwindex.toInt(), istate, (szdrivebuf?.value ?: 0L).toString(), (pcchdrivebuf?.value ?: 0L).toString(), (picost?.value ?: 0L).toString(), (pitempcost?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: COpaquePointer?, picost: COpaquePointer?, pitempcost: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsW(hinstall.toInt(), (szcomponent?.value ?: 0L).toString(), dwindex.toInt(), istate, (szdrivebuf?.value ?: 0L).toString(), (pcchdrivebuf?.value ?: 0L).toString(), (picost?.value ?: 0L).toString(), (pitempcost?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: COpaquePointer?, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersA((szcomponent?.value ?: 0L).toString(), iindex.toInt(), (lpqualifierbuf?.value ?: 0L).toString(), (pcchqualifierbuf?.value ?: 0L).toString(), (lpapplicationdatabuf?.value ?: 0L).toString(), (pcchapplicationdatabuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: COpaquePointer?, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersW((szcomponent?.value ?: 0L).toString(), iindex.toInt(), (lpqualifierbuf?.value ?: 0L).toString(), (pcchqualifierbuf?.value ?: 0L).toString(), (lpapplicationdatabuf?.value ?: 0L).toString(), (pcchapplicationdatabuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsA(icomponentindex.toInt(), (lpcomponentbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: COpaquePointer?, szsid: Pstr, pcchsid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExA((szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwindex.toInt(), (szinstalledcomponentcode?.value ?: 0L).toString(), (pdwinstalledcontext?.value ?: 0L).toString(), (szsid?.value ?: 0L).toString(), (pcchsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: COpaquePointer?, szsid: Pwstr, pcchsid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExW((szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwindex.toInt(), (szinstalledcomponentcode?.value ?: 0L).toString(), (pdwinstalledcontext?.value ?: 0L).toString(), (szsid?.value ?: 0L).toString(), (pcchsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsW(icomponentindex.toInt(), (lpcomponentbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesA((szproduct?.value ?: 0L).toString(), ifeatureindex.toInt(), (lpfeaturebuf?.value ?: 0L).toString(), (lpparentbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesW((szproduct?.value ?: 0L).toString(), ifeatureindex.toInt(), (lpfeaturebuf?.value ?: 0L).toString(), (lpparentbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesA((szproduct?.value ?: 0L).toString(), ipatchindex.toInt(), (lppatchbuf?.value ?: 0L).toString(), (lptransformsbuf?.value ?: 0L).toString(), (pcchtransformsbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: COpaquePointer?, sztargetusersid: Pstr, pcchtargetusersid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExA((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), (szpatchcode?.value ?: 0L).toString(), (sztargetproductcode?.value ?: 0L).toString(), (pdwtargetproductcontext?.value ?: 0L).toString(), (sztargetusersid?.value ?: 0L).toString(), (pcchtargetusersid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: COpaquePointer?, sztargetusersid: Pwstr, pcchtargetusersid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExW((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), (szpatchcode?.value ?: 0L).toString(), (sztargetproductcode?.value ?: 0L).toString(), (pdwtargetproductcontext?.value ?: 0L).toString(), (sztargetusersid?.value ?: 0L).toString(), (pcchtargetusersid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesW((szproduct?.value ?: 0L).toString(), ipatchindex.toInt(), (lppatchbuf?.value ?: 0L).toString(), (lptransformsbuf?.value ?: 0L).toString(), (pcchtransformsbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsA(iproductindex.toInt(), (lpproductbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: COpaquePointer?, szsid: Pstr, pcchsid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExA((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwindex.toInt(), (szinstalledproductcode?.value ?: 0L).toString(), (pdwinstalledcontext?.value ?: 0L).toString(), (szsid?.value ?: 0L).toString(), (pcchsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: COpaquePointer?, szsid: Pwstr, pcchsid: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExW((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext.toInt(), dwindex.toInt(), (szinstalledproductcode?.value ?: 0L).toString(), (pdwinstalledcontext?.value ?: 0L).toString(), (szsid?.value ?: 0L).toString(), (pcchsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsW(iproductindex.toInt(), (lpproductbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsA((lpupgradecode?.value ?: 0L).toString(), dwreserved.toInt(), iproductindex.toInt(), (lpproductbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsW((lpupgradecode?.value ?: 0L).toString(), dwreserved.toInt(), iproductindex.toInt(), (lpproductbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionA(hinstall.toInt(), (szcondition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionW(hinstall.toInt(), (szcondition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataA((szpatchpath?.value ?: 0L).toString(), dwreserved.toInt(), (szxmldata?.value ?: 0L).toString(), (pcchxmldata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataW((szpatchpath?.value ?: 0L).toString(), dwreserved.toInt(), (szxmldata?.value ?: 0L).toString(), (pcchxmldata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordA(hinstall.toInt(), hrecord.toInt(), (szresultbuf?.value ?: 0L).toString(), (pcchresultbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordW(hinstall.toInt(), hrecord.toInt(), (szresultbuf?.value ?: 0L).toString(), (pcchresultbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetActiveDatabase(hinstall.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: COpaquePointer?): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathA((szproduct?.value ?: 0L).toString(), (szcomponent?.value ?: 0L).toString(), (lppathbuf?.value ?: 0L).toString(), (pcchbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: COpaquePointer?): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExA((szproductcode?.value ?: 0L).toString(), (szcomponentcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (lpoutpathbuffer?.value ?: 0L).toString(), (pcchoutpathbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: COpaquePointer?): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExW((szproductcode?.value ?: 0L).toString(), (szcomponentcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (lpoutpathbuffer?.value ?: 0L).toString(), (pcchoutpathbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: COpaquePointer?): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathW((szproduct?.value ?: 0L).toString(), (szcomponent?.value ?: 0L).toString(), (lppathbuf?.value ?: 0L).toString(), (pcchbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateA(hinstall.toInt(), (szcomponent?.value ?: 0L).toString(), (piinstalled?.value ?: 0L).toString(), (piaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateW(hinstall.toInt(), (szcomponent?.value ?: 0L).toString(), (piinstalled?.value ?: 0L).toString(), (piaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetDatabaseState(hdatabase.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostA(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), icosttree, istate, (picost?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostW(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), icosttree, istate, (picost?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: COpaquePointer?, lptitlebuf: Pstr, pcchtitlebuf: COpaquePointer?, lphelpbuf: Pstr, pcchhelpbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoA(hproduct.toInt(), (szfeature?.value ?: 0L).toString(), (lpattributes?.value ?: 0L).toString(), (lptitlebuf?.value ?: 0L).toString(), (pcchtitlebuf?.value ?: 0L).toString(), (lphelpbuf?.value ?: 0L).toString(), (pcchhelpbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: COpaquePointer?, lptitlebuf: Pwstr, pcchtitlebuf: COpaquePointer?, lphelpbuf: Pwstr, pcchhelpbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoW(hproduct.toInt(), (szfeature?.value ?: 0L).toString(), (lpattributes?.value ?: 0L).toString(), (lptitlebuf?.value ?: 0L).toString(), (pcchtitlebuf?.value ?: 0L).toString(), (lphelpbuf?.value ?: 0L).toString(), (pcchhelpbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateA(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), (piinstalled?.value ?: 0L).toString(), (piaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateW(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), (piinstalled?.value ?: 0L).toString(), (piaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: COpaquePointer?, pwdateused: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), (pdwusecount?.value ?: 0L).toString(), (pwdateused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: COpaquePointer?, pwdateused: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), (pdwusecount?.value ?: 0L).toString(), (pwdateused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesA(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), (lpinstallstates?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesW(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), (lpinstallstates?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashA((szfilepath?.value ?: 0L).toString(), dwoptions.toInt(), (phash?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashW((szfilepath?.value ?: 0L).toString(), dwoptions.toInt(), (phash?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: COpaquePointer?, pbhashdata: COpaquePointer?, pcbhashdata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationA((szsignedobjectpath?.value ?: 0L).toString(), dwflags.toInt(), (ppccertcontext?.value ?: 0L).toString(), (pbhashdata?.value ?: 0L).toString(), (pcbhashdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: COpaquePointer?, pbhashdata: COpaquePointer?, pcbhashdata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationW((szsignedobjectpath?.value ?: 0L).toString(), dwflags.toInt(), (ppccertcontext?.value ?: 0L).toString(), (pbhashdata?.value ?: 0L).toString(), (pcbhashdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: COpaquePointer?, lplangbuf: Pstr, pcchlangbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionA((szfilepath?.value ?: 0L).toString(), (lpversionbuf?.value ?: 0L).toString(), (pcchversionbuf?.value ?: 0L).toString(), (lplangbuf?.value ?: 0L).toString(), (pcchlangbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: COpaquePointer?, lplangbuf: Pwstr, pcchlangbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionW((szfilepath?.value ?: 0L).toString(), (lpversionbuf?.value ?: 0L).toString(), (pcchversionbuf?.value ?: 0L).toString(), (lplangbuf?.value ?: 0L).toString(), (pcchlangbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetLanguage(hinstall: Msihandle): UShort =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLanguage(hinstall.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetLastErrorRecord(): Msihandle =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLastErrorRecord().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetMode(hinstall.toInt(), erunmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: COpaquePointer?, pphfilerecords: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListA((szproductcode?.value ?: 0L).toString(), (szpatchpackages?.value ?: 0L).toString(), (pcfiles?.value ?: 0L).toString(), (pphfilerecords?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: COpaquePointer?, pphfilerecords: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListW((szproductcode?.value ?: 0L).toString(), (szpatchpackages?.value ?: 0L).toString(), (pcfiles?.value ?: 0L).toString(), (pphfilerecords?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoA((szpatch?.value ?: 0L).toString(), (szattribute?.value ?: 0L).toString(), (lpvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExA((szpatchcode?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szproperty?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString(), (pcchvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExW((szpatchcode?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szproperty?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString(), (pcchvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoW((szpatch?.value ?: 0L).toString(), (szattribute?.value ?: 0L).toString(), (lpvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeA((szcomponent?.value ?: 0L).toString(), (lpbuf39?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeW((szcomponent?.value ?: 0L).toString(), (lpbuf39?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoA((szproduct?.value ?: 0L).toString(), (szattribute?.value ?: 0L).toString(), (lpvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExA((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szproperty?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString(), (pcchvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExW((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szproperty?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString(), (pcchvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: COpaquePointer?, pdwversion: COpaquePointer?, lpnamebuf: Pstr, pcchnamebuf: COpaquePointer?, lppackagebuf: Pstr, pcchpackagebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptA((szscriptfile?.value ?: 0L).toString(), (lpproductbuf39?.value ?: 0L).toString(), (plgidlanguage?.value ?: 0L).toString(), (pdwversion?.value ?: 0L).toString(), (lpnamebuf?.value ?: 0L).toString(), (pcchnamebuf?.value ?: 0L).toString(), (lppackagebuf?.value ?: 0L).toString(), (pcchpackagebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: COpaquePointer?, pdwversion: COpaquePointer?, lpnamebuf: Pwstr, pcchnamebuf: COpaquePointer?, lppackagebuf: Pwstr, pcchpackagebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptW((szscriptfile?.value ?: 0L).toString(), (lpproductbuf39?.value ?: 0L).toString(), (plgidlanguage?.value ?: 0L).toString(), (pdwversion?.value ?: 0L).toString(), (lpnamebuf?.value ?: 0L).toString(), (pcchnamebuf?.value ?: 0L).toString(), (lppackagebuf?.value ?: 0L).toString(), (pcchpackagebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoW((szproduct?.value ?: 0L).toString(), (szattribute?.value ?: 0L).toString(), (lpvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyA(hproduct.toInt(), (szproperty?.value ?: 0L).toString(), (lpvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyW(hproduct.toInt(), (szproperty?.value ?: 0L).toString(), (lpvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyA(hinstall.toInt(), (szname?.value ?: 0L).toString(), (szvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyW(hinstall.toInt(), (szname?.value ?: 0L).toString(), (szvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetA((szshortcutpath?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), (szfeatureid?.value ?: 0L).toString(), (szcomponentcode?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetW((szshortcutpath?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), (szfeatureid?.value ?: 0L).toString(), (szcomponentcode?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathA(hinstall.toInt(), (szfolder?.value ?: 0L).toString(), (szpathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathW(hinstall.toInt(), (szfolder?.value ?: 0L).toString(), (szpathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationA(hdatabase.toInt(), (szdatabasepath?.value ?: 0L).toString(), uiupdatecount.toInt(), (phsummaryinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationW(hdatabase.toInt(), (szdatabasepath?.value ?: 0L).toString(), uiupdatecount.toInt(), (phsummaryinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathA(hinstall.toInt(), (szfolder?.value ?: 0L).toString(), (szpathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathW(hinstall.toInt(), (szfolder?.value ?: 0L).toString(), (szpathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: COpaquePointer?, lporgnamebuf: Pstr, pcchorgnamebuf: COpaquePointer?, lpserialbuf: Pstr, pcchserialbuf: COpaquePointer?): Userinfostate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoA((szproduct?.value ?: 0L).toString(), (lpusernamebuf?.value ?: 0L).toString(), (pcchusernamebuf?.value ?: 0L).toString(), (lporgnamebuf?.value ?: 0L).toString(), (pcchorgnamebuf?.value ?: 0L).toString(), (lpserialbuf?.value ?: 0L).toString(), (pcchserialbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: COpaquePointer?, lporgnamebuf: Pwstr, pcchorgnamebuf: COpaquePointer?, lpserialbuf: Pwstr, pcchserialbuf: COpaquePointer?): Userinfostate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoW((szproduct?.value ?: 0L).toString(), (lpusernamebuf?.value ?: 0L).toString(), (pcchusernamebuf?.value ?: 0L).toString(), (lporgnamebuf?.value ?: 0L).toString(), (pcchorgnamebuf?.value ?: 0L).toString(), (lpserialbuf?.value ?: 0L).toString(), (pcchserialbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentA((szproduct?.value ?: 0L).toString(), (szcomponent?.value ?: 0L).toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentW((szproduct?.value ?: 0L).toString(), (szcomponent?.value ?: 0L).toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileA((szproduct?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileW((szproduct?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductA((szpackagepath?.value ?: 0L).toString(), (szcommandline?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductW((szpackagepath?.value ?: 0L).toString(), (szcommandline?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedA((szproduct?.value ?: 0L).toString(), (pfelevated?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedW((szproduct?.value ?: 0L).toString(), (pfelevated?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), (phchangeofownerevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: COpaquePointer?): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentA((szcomponent?.value ?: 0L).toString(), (lppathbuf?.value ?: 0L).toString(), (pcchbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: COpaquePointer?): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentW((szcomponent?.value ?: 0L).toString(), (lppathbuf?.value ?: 0L).toString(), (pcchbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeA((poldsid?.value ?: 0L).toString(), (pnewsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeW((poldsid?.value ?: 0L).toString(), (pnewsid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseA((szdatabasepath?.value ?: 0L).toString(), (szpersist?.value ?: 0L).toString(), (phdatabase?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseW((szdatabasepath?.value ?: 0L).toString(), (szpersist?.value ?: 0L).toString(), (phdatabase?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageA((szpackagepath?.value ?: 0L).toString(), (hproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExA((szpackagepath?.value ?: 0L).toString(), dwoptions.toInt(), (hproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExW((szpackagepath?.value ?: 0L).toString(), dwoptions.toInt(), (hproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageW((szpackagepath?.value ?: 0L).toString(), (hproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenProductA(szproduct: Pcstr, hproduct: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductA((szproduct?.value ?: 0L).toString(), (hproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenProductW(szproduct: Pcwstr, hproduct: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductW((szproduct?.value ?: 0L).toString(), (hproduct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardA(hpreview.toInt(), (szcontrolname?.value ?: 0L).toString(), (szbillboard?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardW(hpreview.toInt(), (szcontrolname?.value ?: 0L).toString(), (szbillboard?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogA(hpreview.toInt(), (szdialogname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogW(hpreview.toInt(), (szdialogname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptA((szscriptfile?.value ?: 0L).toString(), (sziconfolder?.value ?: 0L).toString(), (hregdata?.value ?: 0L).toString(), fshortcuts, fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptW((szscriptfile?.value ?: 0L).toString(), (sziconfolder?.value ?: 0L).toString(), (hregdata?.value ?: 0L).toString(), fshortcuts, fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyA((szassemblyname?.value ?: 0L).toString(), (szappcontext?.value ?: 0L).toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyW((szassemblyname?.value ?: 0L).toString(), (szappcontext?.value ?: 0L).toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), (szcomponent?.value ?: 0L).toString(), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), (szcomponent?.value ?: 0L).toString(), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentA((szcategory?.value ?: 0L).toString(), (szqualifier?.value ?: 0L).toString(), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExA((szcategory?.value ?: 0L).toString(), (szqualifier?.value ?: 0L).toString(), dwinstallmode.toInt(), (szproduct?.value ?: 0L).toString(), dwunused1.toInt(), dwunused2.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExW((szcategory?.value ?: 0L).toString(), (szqualifier?.value ?: 0L).toString(), dwinstallmode.toInt(), (szproduct?.value ?: 0L).toString(), dwunused1.toInt(), dwunused2.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentW((szcategory?.value ?: 0L).toString(), (szqualifier?.value ?: 0L).toString(), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L).toString(), (pcchpathbuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateA((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szcomponentcode?.value ?: 0L).toString(), (pdwstate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateW((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szcomponentcode?.value ?: 0L).toString(), (pdwstate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExA((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szfeature?.value ?: 0L).toString(), (pdwstate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExW((szproductcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, (szfeature?.value ?: 0L).toString(), (pdwstate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryProductStateA(szproduct: Pcstr): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateA((szproduct?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryProductStateW(szproduct: Pcwstr): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateW((szproduct?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordClearData(hrecord: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordClearData(hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordDataSize(hrecord.toInt(), ifield.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetFieldCount(hrecord: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetFieldCount(hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetInteger(hrecord.toInt(), ifield.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringA(hrecord.toInt(), ifield.toInt(), (szvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringW(hrecord.toInt(), ifield.toInt(), (szvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordIsNull(hrecord.toInt(), ifield.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordReadStream(hrecord.toInt(), ifield.toInt(), (szdatabuf?.value ?: 0L).toString(), (pcbdatabuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), (szfilepath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), (szfilepath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringA(hrecord.toInt(), ifield.toInt(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringW(hrecord.toInt(), ifield.toInt(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), dwreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), dwreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductA((szproduct?.value ?: 0L).toString(), szreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductW((szproduct?.value ?: 0L).toString(), szreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesA((szpatchlist?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), euninstalltype, (szpropertylist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesW((szpatchlist?.value ?: 0L).toString(), (szproductcode?.value ?: 0L).toString(), euninstalltype, (szpropertylist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceA(hinstall.toInt(), (sztable?.value ?: 0L).toString(), isequencemode).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceW(hinstall.toInt(), (sztable?.value ?: 0L).toString(), isequencemode).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateA(hinstall.toInt(), (szcomponent?.value ?: 0L).toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateW(hinstall.toInt(), (szcomponent?.value ?: 0L).toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: COpaquePointer?): InstalluiHandlera =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: COpaquePointer?, ppuiprevhandler: PinstalluiHandlerRecord): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIRecord(0L.toString(), dwmessagefilter.toInt(), (pvcontext?.value ?: 0L).toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: COpaquePointer?): InstalluiHandlerw =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesA(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), dwattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesW(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), dwattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateA(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateW(hinstall.toInt(), (szfeature?.value ?: 0L).toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInstallLevel(hinstall.toInt(), iinstalllevel).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: COpaquePointer?): Installuilevel =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInternalUI(dwuilevel, (phwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetMode(hinstall.toInt(), erunmode, fstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyA(hinstall.toInt(), (szname?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyW(hinstall.toInt(), (szname?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathA(hinstall.toInt(), (szfolder?.value ?: 0L).toString(), (szfolderpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathW(hinstall.toInt(), (szfolder?.value ?: 0L).toString(), (szfolderpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), (szvolumelabel?.value ?: 0L).toString(), (szdiskprompt?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), (szvolumelabel?.value ?: 0L).toString(), (szdiskprompt?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceA((szproduct?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), dwreserved.toInt(), (szsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L).toString(), dwindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L).toString(), dwindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceW((szproduct?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), dwreserved.toInt(), (szsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllA((szproduct?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllW((szproduct?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: COpaquePointer?, szvolumelabel: Pstr, pcchvolumelabel: COpaquePointer?, szdiskprompt: Pstr, pcchdiskprompt: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), (pdwdiskid?.value ?: 0L).toString(), (szvolumelabel?.value ?: 0L).toString(), (pcchvolumelabel?.value ?: 0L).toString(), (szdiskprompt?.value ?: 0L).toString(), (pcchdiskprompt?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: COpaquePointer?, szvolumelabel: Pwstr, pcchvolumelabel: COpaquePointer?, szdiskprompt: Pwstr, pcchdiskprompt: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), (pdwdiskid?.value ?: 0L).toString(), (szvolumelabel?.value ?: 0L).toString(), (pcchvolumelabel?.value ?: 0L).toString(), (szdiskprompt?.value ?: 0L).toString(), (pcchdiskprompt?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), (szsource?.value ?: 0L).toString(), (pcchsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), (szsource?.value ?: 0L).toString(), (pcchsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionA((szproduct?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionW((szproduct?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString(), (pcchvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString(), (pcchvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoA((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoW((szproductcodeorpatchcode?.value ?: 0L).toString(), (szusersid?.value ?: 0L).toString(), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: COpaquePointer?, pivalue: COpaquePointer?, pftvalue: COpaquePointer?, szvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), (puidatatype?.value ?: 0L).toString(), (pivalue?.value ?: 0L).toString(), (pftvalue?.value ?: 0L).toString(), (szvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), (puipropertycount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: COpaquePointer?, pivalue: COpaquePointer?, pftvalue: COpaquePointer?, szvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), (puidatatype?.value ?: 0L).toString(), (pivalue?.value ?: 0L).toString(), (pftvalue?.value ?: 0L).toString(), (szvaluebuf?.value ?: 0L).toString(), (pcchvaluebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoPersist(hsummaryinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: COpaquePointer?, szvalue: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, (pftvalue?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: COpaquePointer?, szvalue: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, (pftvalue?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExA((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), dwinstallmode.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString(), dwinstallmode.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureW((szproduct?.value ?: 0L).toString(), (szfeature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyDiskSpace(hinstall: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyDiskSpace(hinstall.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyPackageA(szpackagepath: Pcstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageA((szpackagepath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageW((szpackagepath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewClose(hview: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewClose(hview.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewExecute(hview.toInt(), hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewFetch(hview: Msihandle, phrecord: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewFetch(hview.toInt(), (phrecord?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: COpaquePointer?): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetColumnInfo(hview.toInt(), ecolumninfo, (phrecord?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: COpaquePointer?): Msidberror =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorA(hview.toInt(), (szcolumnnamebuffer?.value ?: 0L).toString(), (pcchbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: COpaquePointer?): Msidberror =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorW(hview.toInt(), (szcolumnnamebuffer?.value ?: 0L).toString(), (pcchbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_msiViewModify(hview.toInt(), emodifymode, hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun normalizeFileForPatchSignature(filebuffer: COpaquePointer?, filesize: UInt, optionflags: UInt, optiondata: COpaquePointer?, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?): Int =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_normalizeFileForPatchSignature((filebuffer?.value ?: 0L).toString(), filesize.toInt(), optionflags.toInt(), (optiondata?.value ?: 0L).toString(), newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L).toString(), retainrangecount.toInt(), (retainrangearray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxSettingsW(dwflags.toInt(), (hactctx?.value ?: 0L).toString(), (settingsnamespace?.value ?: 0L).toString(), (settingname?.value ?: 0L).toString(), (pvbuffer?.value ?: 0L).toString(), dwbuffer.toString(), (pdwwrittenorrequired?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: COpaquePointer?, ulinfoclass: UInt, pvbuffer: COpaquePointer?, cbbuffer: ULong, pcbwrittenorrequired: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxW(dwflags.toInt(), (hactctx?.value ?: 0L).toString(), (pvsubinstance?.value ?: 0L).toString(), ulinfoclass.toInt(), (pvbuffer?.value ?: 0L).toString(), cbbuffer.toString(), (pcbwrittenorrequired?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseActCtx(hactctx: Handle) {
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_releaseActCtx((hactctx?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: COpaquePointer?): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfcGetNextProtectedFile((rpchandle?.value ?: 0L).toString(), (protfiledata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsFileProtected((rpchandle?.value ?: 0L).toString(), (protfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsKeyProtected((keyhandle?.value ?: 0L).toString(), (subkeyname?.value ?: 0L).toString(), keysam.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_sfpVerifyFile((pszfilename?.value ?: 0L).toString(), (pszerror?.value ?: 0L).toString(), dwerrsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileA((patchfilename?.value ?: 0L).toString(), (oldfilename?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileByBuffers(patchfilebuffer: COpaquePointer?, patchfilesize: UInt, oldfilebuffer: COpaquePointer?, oldfilesize: UInt, newfilesize: COpaquePointer?, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByBuffers((patchfilebuffer?.value ?: 0L).toString(), patchfilesize.toInt(), (oldfilebuffer?.value ?: 0L).toString(), oldfilesize.toInt(), (newfilesize?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByHandles((patchfilehandle?.value ?: 0L).toString(), (oldfilehandle?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileW((patchfilename?.value ?: 0L).toString(), (oldfilename?.value ?: 0L).toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zombifyActCtx(hactctx: Handle): Bool =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAvailable) _wasm_windowssys_windows_win32_system_applicationinstallationandservicing_zombifyActCtx((hactctx?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
