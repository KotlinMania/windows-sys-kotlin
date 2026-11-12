@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
private external fun initWindowsWin32SystemApplicationinstallationandservicingNapiAddon(): Boolean

private val windowsWin32SystemApplicationinstallationandservicingNapiAvailable: Boolean = initWindowsWin32SystemApplicationinstallationandservicingNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles()")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord()")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx(p0)")
private external fun wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx(p0: String): Int

public actual fun activateActCtx(hactctx: Handle, lpcookie: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx(hactctx.rawAddress.toString(), lpcookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRefActCtx(hactctx: Handle) {
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx(hactctx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA(applyflags.toString(), lpsourcename.rawAddress.toString(), lpdeltaname.rawAddress.toString(), lptargetname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: ConstPtr, lptarget: MutPtr, lptargetreverse: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr, utargetsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW(applyflags.toString(), lpsourcename.rawAddress.toString(), lpdeltaname.rawAddress.toString(), lptargetname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByBuffers(patchfilemapped: ConstPtr, patchfilesize: UInt, oldfilemapped: ConstPtr, oldfilesize: UInt, newfilebuffer: MutPtr, newfilebuffersize: UInt, newfileactualsize: MutPtr, newfiletime: MutPtr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers(patchfilemapped.rawAddress.toString(), patchfilesize.toInt(), oldfilemapped.rawAddress.toString(), oldfilesize.toInt(), newfilebuffer.rawAddress.toString(), newfilebuffersize.toInt(), newfileactualsize.rawAddress.toString(), newfiletime.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles(patchfilehandle.rawAddress.toString(), oldfilehandle.rawAddress.toString(), newfilehandle.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx(patchfilehandle.rawAddress.toString(), oldfilehandle.rawAddress.toString(), newfilehandle.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createActCtxA(pactctx: ConstPtr): Handle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA(pactctx.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createActCtxW(pactctx: ConstPtr): Handle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW(pactctx.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr, hashalgid: AlgId, lpdeltaname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: ConstPtr, hashalgid: AlgId, lpdelta: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA(oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles(oldfilehandle.rawAddress.toString(), newfilehandle.rawAddress.toString(), patchfilehandle.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: ConstPtr, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx(oldfilecount.toInt(), oldfileinfoarray.rawAddress.toString(), newfilehandle.rawAddress.toString(), patchfilehandle.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: ConstPtr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA(oldfilecount.toInt(), oldfileinfoarray.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: ConstPtr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW(oldfilecount.toInt(), oldfileinfoarray.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW(oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(dwflags.toInt(), ulcookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deltaFree(lpmemory: ConstPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree(lpmemory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: MutPtr, usourcesize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA(patchfilename.rawAddress.toString(), patchheaderfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles(patchfilehandle.rawAddress.toString(), patchheaderfilehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW(patchfilename.rawAddress.toString(), patchheaderfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: ConstPtr, ulsectionid: UInt, lpguidtofind: ConstPtr, returneddata: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid(dwflags.toInt(), lpextensionguid.rawAddress.toString(), ulsectionid.toInt(), lpguidtofind.rawAddress.toString(), returneddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: ConstPtr, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA(dwflags.toInt(), lpextensionguid.rawAddress.toString(), ulsectionid.toInt(), lpstringtofind.rawAddress.toString(), returneddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: ConstPtr, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW(dwflags.toInt(), lpextensionguid.rawAddress.toString(), ulsectionid.toInt(), lpstringtofind.rawAddress.toString(), returneddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentActCtx(lphactctx: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx(lphactctx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA(lpdeltaname.rawAddress.toString(), lpheaderinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW(lpdeltaname.rawAddress.toString(), lpheaderinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA(filetypeset.toString(), hashalgid.toInt(), lpsourcename.rawAddress.toString(), lphash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW(filetypeset.toString(), hashalgid.toInt(), lpsourcename.rawAddress.toString(), lphash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA(filename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureByBuffer(filebufferwritable: MutPtr, filesize: UInt, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer(filebufferwritable.rawAddress.toString(), filesize.toInt(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle(filehandle.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW(filename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: ConstPtr, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA(szscriptfile.rawAddress.toString(), dwflags.toInt(), phregdata.rawAddress.toString(), fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: ConstPtr, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW(szscriptfile.rawAddress.toString(), dwflags.toInt(), phregdata.rawAddress.toString(), fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA(szpatchpackages.rawAddress.toString(), szproductcode.rawAddress.toString(), szpropertieslist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW(szpatchpackages.rawAddress.toString(), szproductcode.rawAddress.toString(), szpropertieslist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA(szpatchpackage.rawAddress.toString(), szinstallpackage.rawAddress.toString(), einstalltype, szcommandline.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW(szpatchpackage.rawAddress.toString(), szinstallpackage.rawAddress.toString(), einstalltype, szcommandline.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr, phchangeofownerevent: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA(szname.rawAddress.toString(), dwtransactionattributes.toInt(), phtransactionhandle.rawAddress.toString(), phchangeofownerevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr, phchangeofownerevent: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW(szname.rawAddress.toString(), dwtransactionattributes.toInt(), phtransactionhandle.rawAddress.toString(), phchangeofownerevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCloseAllHandles(): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCloseHandle(hany: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(hany.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCollectUserInfoA(szproduct: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA(szproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCollectUserInfoW(szproduct: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW(szproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA(szproduct.rawAddress.toString(), iinstalllevel, einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA(szproduct.rawAddress.toString(), iinstalllevel, einstallstate, szcommandline.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW(szproduct.rawAddress.toString(), iinstalllevel, einstallstate, szcommandline.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW(szproduct.rawAddress.toString(), iinstalllevel, einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateRecord(cparams: UInt): Msihandle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(cparams.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions, ivalidation).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions, ivalidation).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA(hdatabase.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW(hdatabase.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseCommit(hdatabase: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(hdatabase.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA(hdatabase.toInt(), sztablename.rawAddress.toString(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW(hdatabase.toInt(), sztablename.rawAddress.toString(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ireserved1, ireserved2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ireserved1, ireserved2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA(hdatabase.toInt(), sztablename.rawAddress.toString(), phrecord.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW(hdatabase.toInt(), sztablename.rawAddress.toString(), phrecord.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA(hdatabase.toInt(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW(hdatabase.toInt(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA(hdatabase.toInt(), sztablename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW(hdatabase.toInt(), sztablename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA(hdatabase.toInt(), szquery.rawAddress.toString(), phview.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW(hdatabase.toInt(), szquery.rawAddress.toString(), phview.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA(szproductpackagepath.rawAddress.toString(), cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW(szproductpackagepath.rawAddress.toString(), cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA(hinstall.toInt(), szaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW(hinstall.toInt(), szaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA(dwlogmode.toInt(), szlogfile.rawAddress.toString(), dwlogattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW(dwlogmode.toInt(), szlogfile.rawAddress.toString(), dwlogattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview(hdatabase.toInt(), phpreview.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(dwtransactionstate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA(szcomponent.rawAddress.toString(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: MutPtr, szsid: Pstr, pcchsid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA(szcomponent.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: MutPtr, szsid: Pwstr, pcchsid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW(szcomponent.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW(szcomponent.rawAddress.toString(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: MutPtr, picost: MutPtr, pitempcost: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA(hinstall.toInt(), szcomponent.rawAddress.toString(), dwindex.toInt(), istate, szdrivebuf.rawAddress.toString(), pcchdrivebuf.rawAddress.toString(), picost.rawAddress.toString(), pitempcost.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: MutPtr, picost: MutPtr, pitempcost: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW(hinstall.toInt(), szcomponent.rawAddress.toString(), dwindex.toInt(), istate, szdrivebuf.rawAddress.toString(), pcchdrivebuf.rawAddress.toString(), picost.rawAddress.toString(), pitempcost.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: MutPtr, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA(szcomponent.rawAddress.toString(), iindex.toInt(), lpqualifierbuf.rawAddress.toString(), pcchqualifierbuf.rawAddress.toString(), lpapplicationdatabuf.rawAddress.toString(), pcchapplicationdatabuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: MutPtr, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW(szcomponent.rawAddress.toString(), iindex.toInt(), lpqualifierbuf.rawAddress.toString(), pcchqualifierbuf.rawAddress.toString(), lpapplicationdatabuf.rawAddress.toString(), pcchapplicationdatabuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA(icomponentindex.toInt(), lpcomponentbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: MutPtr, szsid: Pstr, pcchsid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA(szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: MutPtr, szsid: Pwstr, pcchsid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW(szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW(icomponentindex.toInt(), lpcomponentbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA(szproduct.rawAddress.toString(), ifeatureindex.toInt(), lpfeaturebuf.rawAddress.toString(), lpparentbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW(szproduct.rawAddress.toString(), ifeatureindex.toInt(), lpfeaturebuf.rawAddress.toString(), lpparentbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA(szproduct.rawAddress.toString(), ipatchindex.toInt(), lppatchbuf.rawAddress.toString(), lptransformsbuf.rawAddress.toString(), pcchtransformsbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: MutPtr, sztargetusersid: Pstr, pcchtargetusersid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.rawAddress.toString(), sztargetproductcode.rawAddress.toString(), pdwtargetproductcontext.rawAddress.toString(), sztargetusersid.rawAddress.toString(), pcchtargetusersid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: MutPtr, sztargetusersid: Pwstr, pcchtargetusersid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.rawAddress.toString(), sztargetproductcode.rawAddress.toString(), pdwtargetproductcontext.rawAddress.toString(), sztargetusersid.rawAddress.toString(), pcchtargetusersid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW(szproduct.rawAddress.toString(), ipatchindex.toInt(), lppatchbuf.rawAddress.toString(), lptransformsbuf.rawAddress.toString(), pcchtransformsbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA(iproductindex.toInt(), lpproductbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: MutPtr, szsid: Pstr, pcchsid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: MutPtr, szsid: Pwstr, pcchsid: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW(iproductindex.toInt(), lpproductbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA(lpupgradecode.rawAddress.toString(), dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW(lpupgradecode.rawAddress.toString(), dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA(hinstall.toInt(), szcondition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW(hinstall.toInt(), szcondition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA(szpatchpath.rawAddress.toString(), dwreserved.toInt(), szxmldata.rawAddress.toString(), pcchxmldata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW(szpatchpath.rawAddress.toString(), dwreserved.toInt(), szxmldata.rawAddress.toString(), pcchxmldata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA(hinstall.toInt(), hrecord.toInt(), szresultbuf.rawAddress.toString(), pcchresultbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW(hinstall.toInt(), hrecord.toInt(), szresultbuf.rawAddress.toString(), pcchresultbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(hinstall.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: MutPtr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA(szproductcode.rawAddress.toString(), szcomponentcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, lpoutpathbuffer.rawAddress.toString(), pcchoutpathbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: MutPtr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW(szproductcode.rawAddress.toString(), szcomponentcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, lpoutpathbuffer.rawAddress.toString(), pcchoutpathbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: MutPtr, piaction: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA(hinstall.toInt(), szcomponent.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: MutPtr, piaction: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW(hinstall.toInt(), szcomponent.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(hdatabase.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA(hinstall.toInt(), szfeature.rawAddress.toString(), icosttree, istate, picost.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW(hinstall.toInt(), szfeature.rawAddress.toString(), icosttree, istate, picost.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: MutPtr, lptitlebuf: Pstr, pcchtitlebuf: MutPtr, lphelpbuf: Pstr, pcchhelpbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA(hproduct.toInt(), szfeature.rawAddress.toString(), lpattributes.rawAddress.toString(), lptitlebuf.rawAddress.toString(), pcchtitlebuf.rawAddress.toString(), lphelpbuf.rawAddress.toString(), pcchhelpbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: MutPtr, lptitlebuf: Pwstr, pcchtitlebuf: MutPtr, lphelpbuf: Pwstr, pcchhelpbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW(hproduct.toInt(), szfeature.rawAddress.toString(), lpattributes.rawAddress.toString(), lptitlebuf.rawAddress.toString(), pcchtitlebuf.rawAddress.toString(), lphelpbuf.rawAddress.toString(), pcchhelpbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: MutPtr, piaction: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA(hinstall.toInt(), szfeature.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: MutPtr, piaction: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW(hinstall.toInt(), szfeature.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: MutPtr, pwdateused: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), pdwusecount.rawAddress.toString(), pwdateused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: MutPtr, pwdateused: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), pdwusecount.rawAddress.toString(), pwdateused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA(hinstall.toInt(), szfeature.rawAddress.toString(), lpinstallstates.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW(hinstall.toInt(), szfeature.rawAddress.toString(), lpinstallstates.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA(szfilepath.rawAddress.toString(), dwoptions.toInt(), phash.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW(szfilepath.rawAddress.toString(), dwoptions.toInt(), phash.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: MutPtr, pbhashdata: MutPtr, pcbhashdata: MutPtr): Hresult =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA(szsignedobjectpath.rawAddress.toString(), dwflags.toInt(), ppccertcontext.rawAddress.toString(), pbhashdata.rawAddress.toString(), pcbhashdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: MutPtr, pbhashdata: MutPtr, pcbhashdata: MutPtr): Hresult =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW(szsignedobjectpath.rawAddress.toString(), dwflags.toInt(), ppccertcontext.rawAddress.toString(), pbhashdata.rawAddress.toString(), pcbhashdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: MutPtr, lplangbuf: Pstr, pcchlangbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA(szfilepath.rawAddress.toString(), lpversionbuf.rawAddress.toString(), pcchversionbuf.rawAddress.toString(), lplangbuf.rawAddress.toString(), pcchlangbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: MutPtr, lplangbuf: Pwstr, pcchlangbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW(szfilepath.rawAddress.toString(), lpversionbuf.rawAddress.toString(), pcchversionbuf.rawAddress.toString(), lplangbuf.rawAddress.toString(), pcchlangbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetLanguage(hinstall: Msihandle): UShort =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(hinstall.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetLastErrorRecord(): Msihandle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(hinstall.toInt(), erunmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: MutPtr, pphfilerecords: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA(szproductcode.rawAddress.toString(), szpatchpackages.rawAddress.toString(), pcfiles.rawAddress.toString(), pphfilerecords.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: MutPtr, pphfilerecords: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW(szproductcode.rawAddress.toString(), szpatchpackages.rawAddress.toString(), pcfiles.rawAddress.toString(), pphfilerecords.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA(szpatch.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA(szpatchcode.rawAddress.toString(), szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), lpvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW(szpatchcode.rawAddress.toString(), szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), lpvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW(szpatch.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA(szcomponent.rawAddress.toString(), lpbuf39.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW(szcomponent.rawAddress.toString(), lpbuf39.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA(szproduct.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: MutPtr, pdwversion: MutPtr, lpnamebuf: Pstr, pcchnamebuf: MutPtr, lppackagebuf: Pstr, pcchpackagebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA(szscriptfile.rawAddress.toString(), lpproductbuf39.rawAddress.toString(), plgidlanguage.rawAddress.toString(), pdwversion.rawAddress.toString(), lpnamebuf.rawAddress.toString(), pcchnamebuf.rawAddress.toString(), lppackagebuf.rawAddress.toString(), pcchpackagebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: MutPtr, pdwversion: MutPtr, lpnamebuf: Pwstr, pcchnamebuf: MutPtr, lppackagebuf: Pwstr, pcchpackagebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW(szscriptfile.rawAddress.toString(), lpproductbuf39.rawAddress.toString(), plgidlanguage.rawAddress.toString(), pdwversion.rawAddress.toString(), lpnamebuf.rawAddress.toString(), pcchnamebuf.rawAddress.toString(), lppackagebuf.rawAddress.toString(), pcchpackagebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW(szproduct.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA(hproduct.toInt(), szproperty.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW(hproduct.toInt(), szproperty.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA(hinstall.toInt(), szname.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW(hinstall.toInt(), szname.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA(szshortcutpath.rawAddress.toString(), szproductcode.rawAddress.toString(), szfeatureid.rawAddress.toString(), szcomponentcode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW(szshortcutpath.rawAddress.toString(), szproductcode.rawAddress.toString(), szfeatureid.rawAddress.toString(), szcomponentcode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA(hdatabase.toInt(), szdatabasepath.rawAddress.toString(), uiupdatecount.toInt(), phsummaryinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW(hdatabase.toInt(), szdatabasepath.rawAddress.toString(), uiupdatecount.toInt(), phsummaryinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: MutPtr, lporgnamebuf: Pstr, pcchorgnamebuf: MutPtr, lpserialbuf: Pstr, pcchserialbuf: MutPtr): Userinfostate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA(szproduct.rawAddress.toString(), lpusernamebuf.rawAddress.toString(), pcchusernamebuf.rawAddress.toString(), lporgnamebuf.rawAddress.toString(), pcchorgnamebuf.rawAddress.toString(), lpserialbuf.rawAddress.toString(), pcchserialbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: MutPtr, lporgnamebuf: Pwstr, pcchorgnamebuf: MutPtr, lpserialbuf: Pwstr, pcchserialbuf: MutPtr): Userinfostate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW(szproduct.rawAddress.toString(), lpusernamebuf.rawAddress.toString(), pcchusernamebuf.rawAddress.toString(), lporgnamebuf.rawAddress.toString(), pcchorgnamebuf.rawAddress.toString(), lpserialbuf.rawAddress.toString(), pcchserialbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), einstallstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA(szproduct.rawAddress.toString(), szfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW(szproduct.rawAddress.toString(), szfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA(szpackagepath.rawAddress.toString(), szcommandline.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW(szpackagepath.rawAddress.toString(), szcommandline.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA(szproduct.rawAddress.toString(), pfelevated.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW(szproduct.rawAddress.toString(), pfelevated.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), phchangeofownerevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA(szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW(szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA(poldsid.rawAddress.toString(), pnewsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW(poldsid.rawAddress.toString(), pnewsid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA(szdatabasepath.rawAddress.toString(), szpersist.rawAddress.toString(), phdatabase.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW(szdatabasepath.rawAddress.toString(), szpersist.rawAddress.toString(), phdatabase.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA(szpackagepath.rawAddress.toString(), hproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA(szpackagepath.rawAddress.toString(), dwoptions.toInt(), hproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW(szpackagepath.rawAddress.toString(), dwoptions.toInt(), hproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW(szpackagepath.rawAddress.toString(), hproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenProductA(szproduct: Pcstr, hproduct: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA(szproduct.rawAddress.toString(), hproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenProductW(szproduct: Pcwstr, hproduct: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW(szproduct.rawAddress.toString(), hproduct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA(hpreview.toInt(), szcontrolname.rawAddress.toString(), szbillboard.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW(hpreview.toInt(), szcontrolname.rawAddress.toString(), szbillboard.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA(hpreview.toInt(), szdialogname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW(hpreview.toInt(), szdialogname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA(szscriptfile.rawAddress.toString(), sziconfolder.rawAddress.toString(), hregdata.rawAddress.toString(), fshortcuts, fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW(szscriptfile.rawAddress.toString(), sziconfolder.rawAddress.toString(), hregdata.rawAddress.toString(), fshortcuts, fremoveitems).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA(szassemblyname.rawAddress.toString(), szappcontext.rawAddress.toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW(szassemblyname.rawAddress.toString(), szappcontext.rawAddress.toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), szcomponent.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), szcomponent.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), szproduct.rawAddress.toString(), dwunused1.toInt(), dwunused2.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), szproduct.rawAddress.toString(), dwunused1.toInt(), dwunused2.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szcomponentcode.rawAddress.toString(), pdwstate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szcomponentcode.rawAddress.toString(), pdwstate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szfeature.rawAddress.toString(), pdwstate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szfeature.rawAddress.toString(), pdwstate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryProductStateA(szproduct: Pcstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA(szproduct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryProductStateW(szproduct: Pcwstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW(szproduct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordClearData(hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(hrecord.toInt(), ifield.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetFieldCount(hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(hrecord.toInt(), ifield.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA(hrecord.toInt(), ifield.toInt(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW(hrecord.toInt(), ifield.toInt(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(hrecord.toInt(), ifield.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream(hrecord.toInt(), ifield.toInt(), szdatabuf.rawAddress.toString(), pcbdatabuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), szfilepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), szfilepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA(hrecord.toInt(), ifield.toInt(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW(hrecord.toInt(), ifield.toInt(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA(szproduct.rawAddress.toString(), szreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW(szproduct.rawAddress.toString(), szreinstallmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA(szpatchlist.rawAddress.toString(), szproductcode.rawAddress.toString(), euninstalltype, szpropertylist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW(szpatchlist.rawAddress.toString(), szproductcode.rawAddress.toString(), euninstalltype, szpropertylist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA(hinstall.toInt(), sztable.rawAddress.toString(), isequencemode).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW(hinstall.toInt(), sztable.rawAddress.toString(), isequencemode).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA(hinstall.toInt(), szcomponent.rawAddress.toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW(hinstall.toInt(), szcomponent.rawAddress.toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: ConstPtr): InstalluiHandlera =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: ConstPtr, ppuiprevhandler: PinstalluiHandlerRecord): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord(0L.toString(), dwmessagefilter.toInt(), pvcontext.rawAddress.toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: ConstPtr): InstalluiHandlerw =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA(hinstall.toInt(), szfeature.rawAddress.toString(), dwattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW(hinstall.toInt(), szfeature.rawAddress.toString(), dwattributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA(hinstall.toInt(), szfeature.rawAddress.toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW(hinstall.toInt(), szfeature.rawAddress.toString(), istate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(hinstall.toInt(), iinstalllevel).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: MutPtr): Installuilevel =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI(dwuilevel, phwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(hinstall.toInt(), erunmode, fstate).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA(hinstall.toInt(), szname.rawAddress.toString(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW(hinstall.toInt(), szname.rawAddress.toString(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA(hinstall.toInt(), szfolder.rawAddress.toString(), szfolderpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW(hinstall.toInt(), szfolder.rawAddress.toString(), szfolderpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt(), szsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString(), dwindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString(), dwindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt(), szsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr, szvolumelabel: Pstr, pcchvolumelabel: MutPtr, szdiskprompt: Pstr, pcchdiskprompt: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.rawAddress.toString(), szvolumelabel.rawAddress.toString(), pcchvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString(), pcchdiskprompt.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr, szvolumelabel: Pwstr, pcchvolumelabel: MutPtr, szdiskprompt: Pwstr, pcchdiskprompt: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.rawAddress.toString(), szvolumelabel.rawAddress.toString(), pcchvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString(), pcchdiskprompt.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.rawAddress.toString(), pcchsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.rawAddress.toString(), pcchsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr, pivalue: MutPtr, pftvalue: MutPtr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.rawAddress.toString(), pivalue.rawAddress.toString(), pftvalue.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), puipropertycount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr, pivalue: MutPtr, pftvalue: MutPtr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.rawAddress.toString(), pivalue.rawAddress.toString(), pftvalue.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(hsummaryinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.rawAddress.toString(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.rawAddress.toString(), szvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwinstallmode.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwinstallmode.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyDiskSpace(hinstall: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(hinstall.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyPackageA(szpackagepath: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA(szpackagepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW(szpackagepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewClose(hview: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(hview.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(hview.toInt(), hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewFetch(hview: Msihandle, phrecord: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch(hview.toInt(), phrecord.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: MutPtr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo(hview.toInt(), ecolumninfo, phrecord.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: MutPtr): Msidberror =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA(hview.toInt(), szcolumnnamebuffer.rawAddress.toString(), pcchbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: MutPtr): Msidberror =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW(hview.toInt(), szcolumnnamebuffer.rawAddress.toString(), pcchbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(hview.toInt(), emodifymode, hrecord.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun normalizeFileForPatchSignature(filebuffer: MutPtr, filesize: UInt, optionflags: UInt, optiondata: ConstPtr, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr): Int =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature(filebuffer.rawAddress.toString(), filesize.toInt(), optionflags.toInt(), optiondata.rawAddress.toString(), newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW(dwflags.toInt(), hactctx.rawAddress.toString(), settingsnamespace.rawAddress.toString(), settingname.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbuffer.toString(), pdwwrittenorrequired.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: ConstPtr, ulinfoclass: UInt, pvbuffer: MutPtr, cbbuffer: ULong, pcbwrittenorrequired: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW(dwflags.toInt(), hactctx.rawAddress.toString(), pvsubinstance.rawAddress.toString(), ulinfoclass.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.toString(), pcbwrittenorrequired.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseActCtx(hactctx: Handle) {
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx(hactctx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: MutPtr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile(rpchandle.rawAddress.toString(), protfiledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected(rpchandle.rawAddress.toString(), protfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected(keyhandle.rawAddress.toString(), subkeyname.rawAddress.toString(), keysam.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile(pszfilename.rawAddress.toString(), pszerror.rawAddress.toString(), dwerrsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileByBuffers(patchfilebuffer: ConstPtr, patchfilesize: UInt, oldfilebuffer: ConstPtr, oldfilesize: UInt, newfilesize: MutPtr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers(patchfilebuffer.rawAddress.toString(), patchfilesize.toInt(), oldfilebuffer.rawAddress.toString(), oldfilesize.toInt(), newfilesize.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles(patchfilehandle.rawAddress.toString(), oldfilehandle.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), applyoptionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zombifyActCtx(hactctx: Handle): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAvailable) wasmWindowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx(hactctx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
