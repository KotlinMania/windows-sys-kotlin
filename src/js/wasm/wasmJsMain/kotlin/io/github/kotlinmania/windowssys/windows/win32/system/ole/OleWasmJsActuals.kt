@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Callconv
import io.github.kotlinmania.windowssys.windows.win32.system.com.Syskind
import io.github.kotlinmania.windowssys.windows.win32.system.memory.GlobalAllocFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hcursor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemOleNapiAddon(): Boolean

private val windowsWin32SystemOleNapiAvailable: Boolean = initWindowsWin32SystemOleNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleBstrFromVector(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleBstrFromVector(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleClearCustData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleClearCustData(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleCreateDispTypeInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleCreateDispTypeInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleCreateErrorInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleCreateErrorInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleCreateOleAdviseHolder(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleCreateOleAdviseHolder(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleCreateStdDispatch(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleCreateStdDispatch(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleCreateTypeLib(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleCreateTypeLib(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleCreateTypeLib2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleCreateTypeLib2(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleDispCallFunc(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemOleDispCallFunc(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleDispGetIDsOfNames(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleDispGetIDsOfNames(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleDispGetParam(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleDispGetParam(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleDispInvoke(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemOleDispInvoke(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleDoDragDrop(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleDoDragDrop(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleGetActiveObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleGetActiveObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleGetAltMonthNames(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleGetAltMonthNames(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleGetRecordInfoFromGuids(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemOleGetRecordInfoFromGuids(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleGetRecordInfoFromTypeInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleGetRecordInfoFromTypeInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleHrgnUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleHrgnUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleIsAccelerator(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleIsAccelerator(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleLHashValOfNameSys(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleLHashValOfNameSys(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleLHashValOfNameSysA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleLHashValOfNameSysA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleLoadRegTypeLib(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleLoadRegTypeLib(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleLoadTypeLib(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleLoadTypeLib(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleLoadTypeLibEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleLoadTypeLibEx(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOaBuildVersion()")
private external fun wasmWindowssysWindowsWin32SystemOleOaBuildVersion(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration()")
private external fun wasmWindowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleBuildVersion()")
private external fun wasmWindowssysWindowsWin32SystemOleOleBuildVersion(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorage2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorage2(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorageEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorageEx2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreate(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateDefaultHandler(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateDefaultHandler(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateEmbeddingHelper(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateEmbeddingHelper(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateFontIndirect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateFontIndirect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateFromData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateFromData(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateFromDataEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateFromDataEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateFromFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateFromFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateFromFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateFromFileEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateLink(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateLink(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateLinkEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateLinkEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateLinkFromData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateLinkFromData(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateLinkFromDataEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateLinkFromDataEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateLinkToFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateLinkToFile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateLinkToFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateLinkToFileEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateMenuDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateMenuDescriptor(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreatePictureIndirect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreatePictureIndirect(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreatePropertyFrame(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreatePropertyFrame(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreatePropertyFrameIndirect(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreatePropertyFrameIndirect(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleCreateStaticFromData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleCreateStaticFromData(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleDoAutoConvert(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleDoAutoConvert(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleDraw(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleDraw(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleDuplicateData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleDuplicateData(p0: String, p1: Int, p2: Int): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleFlushClipboard()")
private external fun wasmWindowssysWindowsWin32SystemOleOleFlushClipboard(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleGetAutoConvert(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleGetAutoConvert(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleGetClipboard(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleGetClipboard(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleGetClipboardWithEnterpriseInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleOleGetClipboardWithEnterpriseInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleGetIconOfClass(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleGetIconOfClass(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleGetIconOfFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleGetIconOfFile(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleIconToCursor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleIconToCursor(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleInitialize(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleInitialize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleIsCurrentClipboard(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleIsCurrentClipboard(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleIsRunning(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleIsRunning(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleLoad(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleLoad(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleLoadFromStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleLoadFromStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleLoadPicture(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleOleLoadPicture(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleLoadPictureEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemOleOleLoadPictureEx(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleLoadPicturePath(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemOleOleLoadPicturePath(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleLockRunning(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleLockRunning(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleMetafilePictFromIconAndLabel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleMetafilePictFromIconAndLabel(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleNoteObjectVisible(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleNoteObjectVisible(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleQueryCreateFromData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleQueryCreateFromData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleQueryLinkFromData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleQueryLinkFromData(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleRegEnumFormatEtc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleRegEnumFormatEtc(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleRegEnumVerbs(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleRegEnumVerbs(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleRegGetMiscStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleRegGetMiscStatus(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleRegGetUserType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleRegGetUserType(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleRun(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleRun(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSave(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSave(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSavePictureFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSavePictureFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSaveToStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSaveToStream(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSetAutoConvert(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSetAutoConvert(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSetClipboard(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSetClipboard(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSetContainedObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSetContainedObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleSetMenuDescriptor(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleOleSetMenuDescriptor(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleTranslateAccelerator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleTranslateAccelerator(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleTranslateColor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleTranslateColor(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIAddVerbMenuA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIAddVerbMenuA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIAddVerbMenuW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIAddVerbMenuW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIBusyA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIBusyA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIBusyW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIBusyW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUICanConvertOrActivateAs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUICanConvertOrActivateAs(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIChangeIconA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIChangeIconA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIChangeIconW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIChangeIconW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIChangeSourceA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIChangeSourceA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIChangeSourceW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIChangeSourceW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIConvertA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIConvertA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIConvertW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIConvertW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIEditLinksA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIEditLinksA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIEditLinksW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIEditLinksW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIInsertObjectA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIInsertObjectA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIInsertObjectW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIInsertObjectW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIObjectPropertiesA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIObjectPropertiesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIObjectPropertiesW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIObjectPropertiesW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIPasteSpecialA(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIPasteSpecialA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIPasteSpecialW(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIPasteSpecialW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIPromptUserA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIPromptUserA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIPromptUserW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIPromptUserW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIUpdateLinksA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIUpdateLinksA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUIUpdateLinksW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleOleUIUpdateLinksW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleOleUninitialize()")
private external fun wasmWindowssysWindowsWin32SystemOleOleUninitialize()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleQueryPathOfRegTypeLib(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleQueryPathOfRegTypeLib(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleRegisterActiveObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleRegisterActiveObject(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleRegisterDragDrop(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleRegisterDragDrop(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleRegisterTypeLib(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleRegisterTypeLib(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleRegisterTypeLibForUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleRegisterTypeLibForUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleReleaseStgMedium(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleReleaseStgMedium(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleRevokeActiveObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleRevokeActiveObject(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleRevokeDragDrop(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleRevokeDragDrop(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayAccessData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayAccessData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayAddRef(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayAddRef(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayAllocData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayAllocData(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayAllocDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayAllocDescriptor(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayAllocDescriptorEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayAllocDescriptorEx(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayCopy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayCopyData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayCopyData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayCreate(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayCreateEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayCreateEx(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayCreateVector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayCreateVector(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayCreateVectorEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayCreateVectorEx(p0: Int, p1: Int, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayDestroy(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayDestroyData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayDestroyData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayDestroyDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayDestroyDescriptor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetDim(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetDim(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetElement(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetElemsize(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetElemsize(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetIID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetIID(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetLBound(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetLBound(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetRecordInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetRecordInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetUBound(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetUBound(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayGetVartype(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayGetVartype(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayLock(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayLock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayPtrOfIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayPtrOfIndex(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayPutElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayPutElement(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayRedim(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayRedim(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayReleaseData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayReleaseData(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayReleaseDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayReleaseDescriptor(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArraySetIID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArraySetIID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArraySetRecordInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArraySetRecordInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayUnaccessData(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayUnaccessData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleSafeArrayUnlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemOleSafeArrayUnlock(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleUnRegisterTypeLib(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleUnRegisterTypeLib(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleUnRegisterTypeLibForUser(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleUnRegisterTypeLibForUser(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarAbs(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarAbs(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarAnd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarAnd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBoolFromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBoolFromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrCat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrCat(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrCmp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrCmp(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromBool(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromBool(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromDate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromDate(p0: Double, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromDec(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromDec(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromDisp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromDisp(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromI1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromI1(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromI2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromI2(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromI4(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromI4(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromI8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromI8(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromR4(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromR4(p0: Double, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromR8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromR8(p0: Double, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromUI1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromUI1(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromUI2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromUI2(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromUI4(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromUI4(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarBstrFromUI8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarBstrFromUI8(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCat(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCmp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCmp(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarCyFromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarCyFromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromUdate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromUdate(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDateFromUdateEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDateFromUdateEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecAbs(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecAbs(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecCmp(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecCmp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecCmpR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecCmpR8(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecDiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecDiv(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFix(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFix(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecFromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecFromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecInt(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecInt(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecMul(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecMul(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecNeg(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecNeg(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecRound(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecRound(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDecSub(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDecSub(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarDiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarDiv(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarEqv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarEqv(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFix(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFix(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFormat(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFormat(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFormatCurrency(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFormatCurrency(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFormatDateTime(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFormatDateTime(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFormatFromTokens(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFormatFromTokens(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFormatNumber(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFormatNumber(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarFormatPercent(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleVarFormatPercent(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI1FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI1FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI2FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI2FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI4FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI4FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarI8FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarI8FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarIdiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarIdiv(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarImp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarImp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarInt(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarInt(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarMod(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarMod(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarMonthName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarMonthName(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarMul(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarMul(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarNeg(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarNeg(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarNot(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarNot(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarNumFromParseNum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarNumFromParseNum(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarOr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarOr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarParseNumFromStr(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleVarParseNumFromStr(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarPow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarPow(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4CmpR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4CmpR8(p0: Double, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR4FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR4FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8Pow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8Pow(p0: Double, p1: Double, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarR8Round(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarR8Round(p0: Double, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarRound(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarRound(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarSub(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarSub(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarTokenizeFormatString(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemOleVarTokenizeFormatString(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI1FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI1FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI2FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI2FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromI4(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI4FromUI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI4FromUI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromBool(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromDate(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromDec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromDec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromDisp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromDisp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromI8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromI8(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromR4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromR4(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromR8(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromR8(p0: Double, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromStr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromUI1(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromUI1(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromUI2(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromUI2(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUI8FromUI4(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUI8FromUI4(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarUdateFromDate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarUdateFromDate(p0: Double, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarWeekdayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemOleVarWeekdayName(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVarXor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemOleVarXor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemOleVectorFromBstr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemOleVectorFromBstr(p0: String, p1: String): Int

public actual fun bstrFromVector(psa: ConstPtr, pbstr: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleBstrFromVector(psa.rawAddress.toString(), pbstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCustData(pcustdata: MutPtr) {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleClearCustData(pcustdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createDispTypeInfo(pidata: MutPtr, lcid: UInt, pptinfo: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleCreateDispTypeInfo(pidata.rawAddress.toString(), lcid.toInt(), pptinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createErrorInfo(pperrinfo: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleCreateErrorInfo(pperrinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createOleAdviseHolder(ppoaholder: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleCreateOleAdviseHolder(ppoaholder.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdDispatch(punkouter: MutPtr, pvthis: MutPtr, ptinfo: MutPtr, ppunkstddisp: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleCreateStdDispatch(punkouter.rawAddress.toString(), pvthis.rawAddress.toString(), ptinfo.rawAddress.toString(), ppunkstddisp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleCreateTypeLib(syskind, szfile.rawAddress.toString(), ppctlib.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleCreateTypeLib2(syskind, szfile.rawAddress.toString(), ppctlib.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispCallFunc(pvinstance: ConstPtr, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: ConstPtr, prgpvarg: ConstPtr, pvargresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleDispCallFunc(pvinstance.rawAddress.toString(), ovft.toString(), cc, vtreturn.toInt(), cactuals.toInt(), prgvt.rawAddress.toString(), prgpvarg.rawAddress.toString(), pvargresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispGetIDsOfNames(ptinfo: MutPtr, rgsznames: ConstPtr, cnames: UInt, rgdispid: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleDispGetIDsOfNames(ptinfo.rawAddress.toString(), rgsznames.rawAddress.toString(), cnames.toInt(), rgdispid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispGetParam(pdispparams: ConstPtr, position: UInt, vttarg: Varenum, pvarresult: MutPtr, puargerr: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleDispGetParam(pdispparams.rawAddress.toString(), position.toInt(), vttarg.toInt(), pvarresult.rawAddress.toString(), puargerr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispInvoke(thisRef: MutPtr, ptinfo: MutPtr, dispidmember: Int, wflags: UShort, pparams: MutPtr, pvarresult: MutPtr, pexcepinfo: MutPtr, puargerr: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleDispInvoke(thisRef.rawAddress.toString(), ptinfo.rawAddress.toString(), dispidmember, wflags.toInt(), pparams.rawAddress.toString(), pvarresult.rawAddress.toString(), pexcepinfo.rawAddress.toString(), puargerr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doDragDrop(pdataobj: MutPtr, pdropsource: MutPtr, dwokeffects: Dropeffect, pdweffect: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleDoDragDrop(pdataobj.rawAddress.toString(), pdropsource.rawAddress.toString(), dwokeffects.toInt(), pdweffect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveObject(rclsid: ConstPtr, pvreserved: MutPtr, ppunk: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleGetActiveObject(rclsid.rawAddress.toString(), pvreserved.rawAddress.toString(), ppunk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltMonthNames(lcid: UInt, prgp: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleGetAltMonthNames(lcid.toInt(), prgp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecordInfoFromGuids(rguidtypelib: ConstPtr, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: ConstPtr, pprecinfo: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleGetRecordInfoFromGuids(rguidtypelib.rawAddress.toString(), uvermajor.toInt(), uverminor.toInt(), lcid.toInt(), rguidtypeinfo.rawAddress.toString(), pprecinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecordInfoFromTypeInfo(ptypeinfo: MutPtr, pprecinfo: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleGetRecordInfoFromTypeInfo(ptypeinfo.rawAddress.toString(), pprecinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleHrgnUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hrgnUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleHrgnUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hrgnUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleHrgnUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleHrgnUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleHrgnUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleHrgnUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleHrgnUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleHrgnUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: ConstPtr, lpwcmd: MutPtr): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleIsAccelerator(haccel.rawAddress.toString(), caccelentries, lpmsg.rawAddress.toString(), lpwcmd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleLHashValOfNameSys(syskind, lcid.toInt(), szname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleLHashValOfNameSysA(syskind, lcid.toInt(), szname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadRegTypeLib(rguid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleLoadRegTypeLib(rguid.rawAddress.toString(), wvermajor.toInt(), wverminor.toInt(), lcid.toInt(), pptlib.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadTypeLib(szfile: Pcwstr, pptlib: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleLoadTypeLib(szfile.rawAddress.toString(), pptlib.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleLoadTypeLibEx(szfile.rawAddress.toString(), regkind, pptlib.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oaBuildVersion(): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOaBuildVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oaEnablePerUserTLibRegistration() {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun oleBuildVersion(): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleBuildVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage2(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorage2(lpolestream.rawAddress.toString(), pstg.rawAddress.toString(), ptd.rawAddress.toString(), opt.toInt(), pvcallbackcontext.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx2(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorageEx2(polestm.rawAddress.toString(), pstg.rawAddress.toString(), pcfformat.rawAddress.toString(), plwwidth.rawAddress.toString(), plheight.rawAddress.toString(), pdwsize.rawAddress.toString(), pmedium.rawAddress.toString(), opt.toInt(), pvcallbackcontext.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreate(rclsid: ConstPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreate(rclsid.rawAddress.toString(), riid.rawAddress.toString(), renderopt.toInt(), pformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateDefaultHandler(clsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateDefaultHandler(clsid.rawAddress.toString(), punkouter.rawAddress.toString(), riid.rawAddress.toString(), lplpobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateEmbeddingHelper(clsid: ConstPtr, punkouter: MutPtr, flags: EmbdhlpFlags, pcf: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateEmbeddingHelper(clsid.rawAddress.toString(), punkouter.rawAddress.toString(), flags.toInt(), pcf.rawAddress.toString(), riid.rawAddress.toString(), lplpobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateEx(rclsid: ConstPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateEx(rclsid.rawAddress.toString(), riid.rawAddress.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress.toString(), rgformatetc.rawAddress.toString(), lpadvisesink.rawAddress.toString(), rgdwconnection.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFontIndirect(lpfontdesc: ConstPtr, riid: ConstPtr, lplpvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateFontIndirect(lpfontdesc.rawAddress.toString(), riid.rawAddress.toString(), lplpvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateFromData(psrcdataobj.rawAddress.toString(), riid.rawAddress.toString(), renderopt.toInt(), pformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateFromDataEx(psrcdataobj.rawAddress.toString(), riid.rawAddress.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress.toString(), rgformatetc.rawAddress.toString(), lpadvisesink.rawAddress.toString(), rgdwconnection.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromFile(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateFromFile(rclsid.rawAddress.toString(), lpszfilename.rawAddress.toString(), riid.rawAddress.toString(), renderopt.toInt(), lpformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromFileEx(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateFromFileEx(rclsid.rawAddress.toString(), lpszfilename.rawAddress.toString(), riid.rawAddress.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress.toString(), rgformatetc.rawAddress.toString(), lpadvisesink.rawAddress.toString(), rgdwconnection.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLink(pmklinksrc: MutPtr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateLink(pmklinksrc.rawAddress.toString(), riid.rawAddress.toString(), renderopt.toInt(), lpformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkEx(pmklinksrc: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateLinkEx(pmklinksrc.rawAddress.toString(), riid.rawAddress.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress.toString(), rgformatetc.rawAddress.toString(), lpadvisesink.rawAddress.toString(), rgdwconnection.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateLinkFromData(psrcdataobj.rawAddress.toString(), riid.rawAddress.toString(), renderopt.toInt(), pformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateLinkFromDataEx(psrcdataobj.rawAddress.toString(), riid.rawAddress.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress.toString(), rgformatetc.rawAddress.toString(), lpadvisesink.rawAddress.toString(), rgdwconnection.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateLinkToFile(lpszfilename.rawAddress.toString(), riid.rawAddress.toString(), renderopt.toInt(), lpformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateLinkToFileEx(lpszfilename.rawAddress.toString(), riid.rawAddress.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress.toString(), rgformatetc.rawAddress.toString(), lpadvisesink.rawAddress.toString(), rgdwconnection.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: ConstPtr): Long =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateMenuDescriptor(hmenucombined.rawAddress.toString(), lpmenuwidths.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreatePictureIndirect(lppictdesc: ConstPtr, riid: ConstPtr, fown: Bool, lplpvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreatePictureIndirect(lppictdesc.rawAddress.toString(), riid.rawAddress.toString(), fown, lplpvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: ConstPtr, cpages: UInt, ppageclsid: ConstPtr, lcid: UInt, dwreserved: UInt, pvreserved: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreatePropertyFrame(hwndowner.rawAddress.toString(), x.toInt(), y.toInt(), lpszcaption.rawAddress.toString(), cobjects.toInt(), ppunk.rawAddress.toString(), cpages.toInt(), ppageclsid.rawAddress.toString(), lcid.toInt(), dwreserved.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreatePropertyFrameIndirect(lpparams: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreatePropertyFrameIndirect(lpparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateStaticFromData(psrcdataobj: MutPtr, iid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleCreateStaticFromData(psrcdataobj.rawAddress.toString(), iid.rawAddress.toString(), renderopt.toInt(), pformatetc.rawAddress.toString(), pclientsite.rawAddress.toString(), pstg.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDestroyMenuDescriptor(holemenu: Long): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(holemenu.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDoAutoConvert(pstg: MutPtr, pclsidnew: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleDoAutoConvert(pstg.rawAddress.toString(), pclsidnew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDraw(punknown: MutPtr, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleDraw(punknown.rawAddress.toString(), dwaspect.toInt(), hdcdraw.rawAddress.toString(), lprcbounds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleOleDuplicateData(hsrc.rawAddress.toString(), cfformat.toInt(), uiflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleFlushClipboard(): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleFlushClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetAutoConvert(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleGetAutoConvert(clsidold.rawAddress.toString(), pclsidnew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetClipboard(ppdataobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleGetClipboard(ppdataobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetClipboardWithEnterpriseInfo(dataobject: MutPtr, dataenterpriseid: MutPtr, sourcedescription: MutPtr, targetdescription: MutPtr, datadescription: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleGetClipboardWithEnterpriseInfo(dataobject.rawAddress.toString(), dataenterpriseid.rawAddress.toString(), sourcedescription.rawAddress.toString(), targetdescription.rawAddress.toString(), datadescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetIconOfClass(rclsid: ConstPtr, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleOleGetIconOfClass(rclsid.rawAddress.toString(), lpszlabel.rawAddress.toString(), fusetypeaslabel).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleOleGetIconOfFile(lpszpath.rawAddress.toString(), fusefileaslabel).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleOleIconToCursor(hinstexe.rawAddress.toString(), hicon.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleInitialize(pvreserved: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleInitialize(pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleIsCurrentClipboard(pdataobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleIsCurrentClipboard(pdataobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleIsRunning(pobject: MutPtr): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleIsRunning(pobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoad(pstg: MutPtr, riid: ConstPtr, pclientsite: MutPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleLoad(pstg.rawAddress.toString(), riid.rawAddress.toString(), pclientsite.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadFromStream(pstm: MutPtr, iidinterface: ConstPtr, ppvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleLoadFromStream(pstm.rawAddress.toString(), iidinterface.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPicture(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, lplpvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleLoadPicture(lpstream.rawAddress.toString(), lsize, frunmode, riid.rawAddress.toString(), lplpvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPictureEx(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleLoadPictureEx(lpstream.rawAddress.toString(), lsize, frunmode, riid.rawAddress.toString(), xsizedesired.toInt(), ysizedesired.toInt(), dwflags.toInt(), lplpvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: MutPtr, dwreserved: UInt, clrreserved: UInt, riid: ConstPtr, ppvret: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleLoadPicturePath(szurlorpath.rawAddress.toString(), punkcaller.rawAddress.toString(), dwreserved.toInt(), clrreserved.toInt(), riid.rawAddress.toString(), ppvret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLockRunning(punknown: MutPtr, flock: Bool, flastunlockcloses: Bool): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleLockRunning(punknown.rawAddress.toString(), flock, flastunlockcloses) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleOleMetafilePictFromIconAndLabel(hicon.rawAddress.toString(), lpszlabel.rawAddress.toString(), lpszsourcefile.rawAddress.toString(), iiconindex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleNoteObjectVisible(punknown: MutPtr, fvisible: Bool): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleNoteObjectVisible(punknown.rawAddress.toString(), fvisible) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleQueryCreateFromData(psrcdataobject: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleQueryCreateFromData(psrcdataobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleQueryLinkFromData(psrcdataobject: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleQueryLinkFromData(psrcdataobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegEnumFormatEtc(clsid: ConstPtr, dwdirection: UInt, ppenum: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleRegEnumFormatEtc(clsid.rawAddress.toString(), dwdirection.toInt(), ppenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegEnumVerbs(clsid: ConstPtr, ppenum: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleRegEnumVerbs(clsid.rawAddress.toString(), ppenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegGetMiscStatus(clsid: ConstPtr, dwaspect: UInt, pdwstatus: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleRegGetMiscStatus(clsid.rawAddress.toString(), dwaspect.toInt(), pdwstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegGetUserType(clsid: ConstPtr, dwformoftype: UInt, pszusertype: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleRegGetUserType(clsid.rawAddress.toString(), dwformoftype.toInt(), pszusertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRun(punknown: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleRun(punknown.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSave(pps: MutPtr, pstg: MutPtr, fsameasload: Bool): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSave(pps.rawAddress.toString(), pstg.rawAddress.toString(), fsameasload) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSavePictureFile(lpdisppicture: MutPtr, bstrfilename: Bstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSavePictureFile(lpdisppicture.rawAddress.toString(), bstrfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSaveToStream(ppstm: MutPtr, pstm: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSaveToStream(ppstm.rawAddress.toString(), pstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetAutoConvert(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSetAutoConvert(clsidold.rawAddress.toString(), clsidnew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetClipboard(pdataobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSetClipboard(pdataobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetContainedObject(punknown: MutPtr, fcontained: Bool): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSetContainedObject(punknown.rawAddress.toString(), fcontained) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: MutPtr, lpactiveobj: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleSetMenuDescriptor(holemenu.toString(), hwndframe.rawAddress.toString(), hwndactiveobject.rawAddress.toString(), lpframe.rawAddress.toString(), lpactiveobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleTranslateAccelerator(lpframe: MutPtr, lpframeinfo: ConstPtr, lpmsg: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleTranslateAccelerator(lpframe.rawAddress.toString(), lpframeinfo.rawAddress.toString(), lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleTranslateColor(clr.toInt(), hpal.rawAddress.toString(), lpcolorref.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIAddVerbMenuA(lpoleobj: MutPtr, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIAddVerbMenuA(lpoleobj.rawAddress.toString(), lpszshorttype.rawAddress.toString(), hmenu.rawAddress.toString(), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIAddVerbMenuW(lpoleobj: MutPtr, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIAddVerbMenuW(lpoleobj.rawAddress.toString(), lpszshorttype.rawAddress.toString(), hmenu.rawAddress.toString(), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIBusyA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIBusyA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIBusyW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIBusyW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUICanConvertOrActivateAs(rclsid: ConstPtr, fislinkedobject: Bool, wformat: UShort): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUICanConvertOrActivateAs(rclsid.rawAddress.toString(), fislinkedobject, wformat.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeIconA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIChangeIconA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeIconW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIChangeIconW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeSourceA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIChangeSourceA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeSourceW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIChangeSourceW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIConvertA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIConvertA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIConvertW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIConvertW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIEditLinksA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIEditLinksA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIEditLinksW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIEditLinksW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIInsertObjectA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIInsertObjectA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIInsertObjectW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIInsertObjectW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIObjectPropertiesA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIObjectPropertiesA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIObjectPropertiesW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIObjectPropertiesW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPasteSpecialA(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIPasteSpecialA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPasteSpecialW(param0: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIPasteSpecialW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIPromptUserA(ntemplate, hwndparent.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIPromptUserW(ntemplate, hwndparent.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIUpdateLinksA(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIUpdateLinksA(lpoleuilinkcntr.rawAddress.toString(), hwndparent.rawAddress.toString(), lpsztitle.rawAddress.toString(), clinks) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIUpdateLinksW(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleOleUIUpdateLinksW(lpoleuilinkcntr.rawAddress.toString(), hwndparent.rawAddress.toString(), lpsztitle.rawAddress.toString(), clinks) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUninitialize() {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleOleUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryPathOfRegTypeLib(guid: ConstPtr, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleQueryPathOfRegTypeLib(guid.rawAddress.toString(), wmaj.toInt(), wmin.toInt(), lcid.toInt(), lpbstrpathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerActiveObject(punk: MutPtr, rclsid: ConstPtr, dwflags: ActiveobjectFlags, pdwregister: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleRegisterActiveObject(punk.rawAddress.toString(), rclsid.rawAddress.toString(), dwflags.toInt(), pdwregister.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDragDrop(hwnd: Hwnd, pdroptarget: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleRegisterDragDrop(hwnd.rawAddress.toString(), pdroptarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTypeLib(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleRegisterTypeLib(ptlib.rawAddress.toString(), szfullpath.rawAddress.toString(), szhelpdir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTypeLibForUser(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleRegisterTypeLibForUser(ptlib.rawAddress.toString(), szfullpath.rawAddress.toString(), szhelpdir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseStgMedium(param0: MutPtr) {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleReleaseStgMedium(param0.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revokeActiveObject(dwregister: UInt, pvreserved: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleRevokeActiveObject(dwregister.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeDragDrop(hwnd: Hwnd): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleRevokeDragDrop(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAccessData(psa: ConstPtr, ppvdata: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayAccessData(psa.rawAddress.toString(), ppvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAddRef(psa: ConstPtr, ppdatatorelease: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayAddRef(psa.rawAddress.toString(), ppdatatorelease.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAllocData(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayAllocData(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayAllocDescriptor(cdims.toInt(), ppsaout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayAllocDescriptorEx(vt.toInt(), cdims.toInt(), ppsaout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCopy(psa: ConstPtr, ppsaout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayCopy(psa.rawAddress.toString(), ppsaout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCopyData(psasource: ConstPtr, psatarget: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayCopyData(psasource.rawAddress.toString(), psatarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: ConstPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleSafeArrayCreate(vt.toInt(), cdims.toInt(), rgsabound.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: ConstPtr, pvextra: ConstPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleSafeArrayCreateEx(vt.toInt(), cdims.toInt(), rgsabound.rawAddress.toString(), pvextra.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleSafeArrayCreateVector(vt.toInt(), llbound, celements.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: ConstPtr): MutPtr =
    if (windowsWin32SystemOleNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemOleSafeArrayCreateVectorEx(vt.toInt(), llbound, celements.toInt(), pvextra.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayDestroy(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayDestroy(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayDestroyData(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayDestroyData(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayDestroyDescriptor(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayDestroyDescriptor(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetDim(psa: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetDim(psa.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetElement(psa: ConstPtr, rgindices: ConstPtr, pv: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetElement(psa.rawAddress.toString(), rgindices.rawAddress.toString(), pv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetElemsize(psa: ConstPtr): UInt =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetElemsize(psa.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetIID(psa: ConstPtr, pguid: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetIID(psa.rawAddress.toString(), pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetLBound(psa: ConstPtr, ndim: UInt, pllbound: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetLBound(psa.rawAddress.toString(), ndim.toInt(), pllbound.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetRecordInfo(psa.rawAddress.toString(), prinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetUBound(psa: ConstPtr, ndim: UInt, plubound: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetUBound(psa.rawAddress.toString(), ndim.toInt(), plubound.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetVartype(psa: ConstPtr, pvt: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayGetVartype(psa.rawAddress.toString(), pvt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayLock(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayLock(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayPtrOfIndex(psa: ConstPtr, rgindices: ConstPtr, ppvdata: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayPtrOfIndex(psa.rawAddress.toString(), rgindices.rawAddress.toString(), ppvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayPutElement(psa: ConstPtr, rgindices: ConstPtr, pv: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayPutElement(psa.rawAddress.toString(), rgindices.rawAddress.toString(), pv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayRedim(psa: MutPtr, psaboundnew: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayRedim(psa.rawAddress.toString(), psaboundnew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayReleaseData(pdata: ConstPtr) {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleSafeArrayReleaseData(pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun safeArrayReleaseDescriptor(psa: ConstPtr) {
    if (windowsWin32SystemOleNapiAvailable) {
        wasmWindowssysWindowsWin32SystemOleSafeArrayReleaseDescriptor(psa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun safeArraySetIID(psa: ConstPtr, guid: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArraySetIID(psa.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArraySetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArraySetRecordInfo(psa.rawAddress.toString(), prinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayUnaccessData(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayUnaccessData(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayUnlock(psa: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleSafeArrayUnlock(psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterTypeLib(libid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleUnRegisterTypeLib(libid.rawAddress.toString(), wvermajor.toInt(), wverminor.toInt(), lcid.toInt(), syskind) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterTypeLibForUser(libid: ConstPtr, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleUnRegisterTypeLibForUser(libid.rawAddress.toString(), wmajorvernum.toInt(), wminorvernum.toInt(), lcid.toInt(), syskind) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varAbs(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarAbs(pvarin.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varAdd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarAdd(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varAnd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarAnd(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromCy(cyin: CY, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromDate(datein: Double, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromDate(datein, pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromDec(pdecin: ConstPtr, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromDec(pdecin.rawAddress.toString(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromDisp(pdispin: MutPtr, lcid: UInt, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI1(cin: Byte, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromI1(cin.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI2(sin: Short, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromI2(sin.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI4(lin: Int, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromI4(lin, pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI8(i64in: Long, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromI8(i64in.toString(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromR4(fltin: Float, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromR4(fltin.toDouble(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromR8(dblin: Double, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromR8(dblin, pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI1(bin: UByte, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromUI1(bin.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI2(uiin: UShort, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromUI2(uiin.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI4(ulin: UInt, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromUI4(ulin.toInt(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI8(i64in: ULong, pboolout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBoolFromUI8(i64in.toString(), pboolout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrCat(bstrleft.rawAddress.toString(), bstrright.rawAddress.toString(), pbstrresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrCmp(bstrleft.rawAddress.toString(), bstrright.rawAddress.toString(), lcid.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromBool(boolin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromDate(datein, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromDec(pdecin: ConstPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromDec(pdecin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromDisp(pdispin: MutPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromDisp(pdispin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromI1(cin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromI2(ival.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromI4(lin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromI8(i64in.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromR4(fltin.toDouble(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromR8(dblin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromUI1(bval.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromUI2(uiin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromUI4(ulin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarBstrFromUI8(ui64in.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCat(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCat(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCmp(pvarleft: ConstPtr, pvarright: ConstPtr, lcid: UInt, dwflags: UInt): Varcmp =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCmp(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), lcid.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyAbs(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyCmp(cyleft: CY, cyright: CY): Varcmp =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFix(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromBool(boolin: VariantBool, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromBool(boolin.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromDate(datein: Double, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromDate(datein, pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromDec(pdecin: ConstPtr, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromDec(pdecin.rawAddress.toString(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromDisp(pdispin: MutPtr, lcid: UInt, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI1(cin: Byte, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromI1(cin.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI2(sin: Short, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromI2(sin.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI4(lin: Int, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromI4(lin, pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI8(i64in: Long, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromI8(i64in.toString(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromR4(fltin: Float, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromR4(fltin.toDouble(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromR8(dblin: Double, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromR8(dblin, pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI1(bin: UByte, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromUI1(bin.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI2(uiin: UShort, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromUI2(uiin.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI4(ulin: UInt, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromUI4(ulin.toInt(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI8(ui64in: ULong, pcyout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarCyFromUI8(ui64in.toString(), pcyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyInt(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyMul(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyNeg(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCySub(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromBool(boolin: VariantBool, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromBool(boolin.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromCy(cyin: CY, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromDec(pdecin: ConstPtr, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromDec(pdecin.rawAddress.toString(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromDisp(pdispin: MutPtr, lcid: UInt, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI1(cin: Byte, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromI1(cin.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI2(sin: Short, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromI2(sin.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI4(lin: Int, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromI4(lin, pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI8(i64in: Long, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromI8(i64in.toString(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromR4(fltin: Float, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromR4(fltin.toDouble(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromR8(dblin: Double, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromR8(dblin, pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI1(bin: UByte, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromUI1(bin.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI2(uiin: UShort, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromUI2(uiin.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI4(ulin: UInt, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromUI4(ulin.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI8(ui64in: ULong, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromUI8(ui64in.toString(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUdate(pudatein: ConstPtr, dwflags: UInt, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromUdate(pudatein.rawAddress.toString(), dwflags.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUdateEx(pudatein: ConstPtr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDateFromUdateEx(pudatein.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pdateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecAbs(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecAbs(pdecin.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecAdd(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecAdd(pdecleft.rawAddress.toString(), pdecright.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecCmp(pdecleft: ConstPtr, pdecright: ConstPtr): Varcmp =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecCmp(pdecleft.rawAddress.toString(), pdecright.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecCmpR8(pdecleft: ConstPtr, dblright: Double): Varcmp =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecCmpR8(pdecleft.rawAddress.toString(), dblright).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecDiv(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecDiv(pdecleft.rawAddress.toString(), pdecright.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFix(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFix(pdecin.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromBool(boolin: VariantBool, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromBool(boolin.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromCy(cyin: CY, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromDate(datein: Double, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromDate(datein, pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromDisp(pdispin: MutPtr, lcid: UInt, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI1(cin: Byte, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromI1(cin.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI2(uiin: Short, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromI2(uiin.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI4(lin: Int, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromI4(lin, pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI8(i64in: Long, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromI8(i64in.toString(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromR4(fltin: Float, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromR4(fltin.toDouble(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromR8(dblin: Double, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromR8(dblin, pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI1(bin: UByte, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromUI1(bin.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI2(uiin: UShort, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromUI2(uiin.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI4(ulin: UInt, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromUI4(ulin.toInt(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI8(ui64in: ULong, pdecout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecFromUI8(ui64in.toString(), pdecout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecInt(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecInt(pdecin.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecMul(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecMul(pdecleft.rawAddress.toString(), pdecright.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecNeg(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecNeg(pdecin.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecRound(pdecin: ConstPtr, cdecimals: Int, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecRound(pdecin.rawAddress.toString(), cdecimals, pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecSub(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDecSub(pdecleft.rawAddress.toString(), pdecright.rawAddress.toString(), pdecresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarDiv(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varEqv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarEqv(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFix(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFix(pvarin.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormat(pvarin: ConstPtr, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFormat(pvarin.rawAddress.toString(), pstrformat.rawAddress.toString(), ifirstday, ifirstweek, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatCurrency(pvarin: ConstPtr, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFormatCurrency(pvarin.rawAddress.toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatDateTime(pvarin: ConstPtr, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFormatDateTime(pvarin.rawAddress.toString(), inamedformat, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatFromTokens(pvarin: ConstPtr, pstrformat: Pcwstr, pbtokcur: ConstPtr, dwflags: UInt, pbstrout: MutPtr, lcid: UInt): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFormatFromTokens(pvarin.rawAddress.toString(), pstrformat.rawAddress.toString(), pbtokcur.rawAddress.toString(), dwflags.toInt(), pbstrout.rawAddress.toString(), lcid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatNumber(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFormatNumber(pvarin.rawAddress.toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatPercent(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarFormatPercent(pvarin.rawAddress.toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromBool(boolin.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromDate(datein: Double, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromDate(datein, pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromDec(pdecin: ConstPtr, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromDec(pdecin.rawAddress.toString(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromDisp(pdispin: MutPtr, lcid: UInt, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromI2(uiin.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromI4(lin: Int, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromI4(lin, pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromI8(i64in.toString(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromR4(fltin.toDouble(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromR8(dblin, pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromUI1(bin.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromUI2(uiin.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromUI4(ulin.toInt(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI1FromUI8(i64in.toString(), pcout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromBool(boolin: VariantBool, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromBool(boolin.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromCy(cyin: CY, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromDate(datein: Double, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromDate(datein, psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromDec(pdecin: ConstPtr, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromDec(pdecin.rawAddress.toString(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromDisp(pdispin: MutPtr, lcid: UInt, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromI1(cin: Byte, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromI1(cin.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromI4(lin: Int, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromI4(lin, psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromI8(i64in: Long, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromI8(i64in.toString(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromR4(fltin: Float, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromR4(fltin.toDouble(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromR8(dblin: Double, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromR8(dblin, psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI1(bin: UByte, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromUI1(bin.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI2(uiin: UShort, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromUI2(uiin.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI4(ulin: UInt, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromUI4(ulin.toInt(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI8(ui64in: ULong, psout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI2FromUI8(ui64in.toString(), psout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromBool(boolin: VariantBool, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromBool(boolin.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromCy(cyin: CY, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromDate(datein: Double, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromDate(datein, plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromDec(pdecin: ConstPtr, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromDec(pdecin.rawAddress.toString(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromDisp(pdispin: MutPtr, lcid: UInt, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromI1(cin: Byte, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromI1(cin.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromI2(sin: Short, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromI2(sin.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromI8(i64in: Long, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromI8(i64in.toString(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromR4(fltin: Float, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromR4(fltin.toDouble(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromR8(dblin: Double, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromR8(dblin, plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI1(bin: UByte, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromUI1(bin.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI2(uiin: UShort, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromUI2(uiin.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI4(ulin: UInt, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromUI4(ulin.toInt(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI4FromUI8(ui64in.toString(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromBool(boolin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromCy(cyin: CY, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromDate(datein: Double, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromDate(datein, pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromDec(pdecin.rawAddress.toString(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromI1(cin: Byte, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromI1(cin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromI2(sin: Short, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromI2(sin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromR4(fltin: Float, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromR4(fltin.toDouble(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromR8(dblin: Double, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromR8(dblin, pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromUI1(bin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromUI2(uiin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromUI4(ulin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI8(ui64in: ULong, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarI8FromUI8(ui64in.toString(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varIdiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarIdiv(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varImp(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarImp(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varInt(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarInt(pvarin.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varMod(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarMod(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarMonthName(imonth, fabbrev, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varMul(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarMul(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varNeg(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarNeg(pvarin.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varNot(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarNot(pvarin.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varNumFromParseNum(pnumprs: ConstPtr, rgbdig: ConstPtr, dwvtbits: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarNumFromParseNum(pnumprs.rawAddress.toString(), rgbdig.rawAddress.toString(), dwvtbits.toInt(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varOr(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarOr(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: MutPtr, rgbdig: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarParseNumFromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pnumprs.rawAddress.toString(), rgbdig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varPow(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarPow(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4CmpR8(fltleft.toDouble(), dblright).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromBool(boolin: VariantBool, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromBool(boolin.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromCy(cyin: CY, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromDate(datein: Double, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromDate(datein, pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromDec(pdecin: ConstPtr, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromDec(pdecin.rawAddress.toString(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromDisp(pdispin: MutPtr, lcid: UInt, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI1(cin: Byte, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromI1(cin.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI2(sin: Short, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromI2(sin.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI4(lin: Int, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromI4(lin, pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI8(i64in: Long, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromI8(i64in.toString(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromR8(dblin: Double, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromR8(dblin, pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI1(bin: UByte, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromUI1(bin.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI2(uiin: UShort, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromUI2(uiin.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI4(ulin: UInt, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromUI4(ulin.toInt(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI8(ui64in: ULong, pfltout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR4FromUI8(ui64in.toString(), pfltout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromBool(boolin: VariantBool, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromBool(boolin.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromCy(cyin: CY, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromDate(datein: Double, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromDate(datein, pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromDec(pdecin: ConstPtr, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromDec(pdecin.rawAddress.toString(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromDisp(pdispin: MutPtr, lcid: UInt, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI1(cin: Byte, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromI1(cin.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI2(sin: Short, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromI2(sin.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI4(lin: Int, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromI4(lin, pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI8(i64in: Long, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromI8(i64in.toString(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromR4(fltin: Float, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromR4(fltin.toDouble(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI1(bin: UByte, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromUI1(bin.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI2(uiin: UShort, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromUI2(uiin.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI4(ulin: UInt, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromUI4(ulin.toInt(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI8(ui64in: ULong, pdblout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8FromUI8(ui64in.toString(), pdblout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8Pow(dblleft, dblright, pdblresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarR8Round(dblin, cdecimals, pdblresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varRound(pvarin: ConstPtr, cdecimals: Int, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarRound(pvarin.rawAddress.toString(), cdecimals, pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varSub(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarSub(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: MutPtr, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: ConstPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarTokenizeFormatString(pstrformat.rawAddress.toString(), rgbtok.rawAddress.toString(), cbtok, ifirstday, ifirstweek, lcid.toInt(), pcbactual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromBool(boolin: VariantBool, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromBool(boolin.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromCy(cyin: CY, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromDate(datein: Double, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromDate(datein, pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromDec(pdecin: ConstPtr, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromDec(pdecin.rawAddress.toString(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromDisp(pdispin: MutPtr, lcid: UInt, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI1(cin: Byte, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromI1(cin.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI2(sin: Short, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromI2(sin.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI4(lin: Int, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromI4(lin, pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI8(i64in: Long, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromI8(i64in.toString(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromR4(fltin: Float, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromR4(fltin.toDouble(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromR8(dblin: Double, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromR8(dblin, pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromUI2(uiin: UShort, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromUI2(uiin.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromUI4(ulin: UInt, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromUI4(ulin.toInt(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromUI8(ui64in: ULong, pbout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI1FromUI8(ui64in.toString(), pbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromBool(boolin: VariantBool, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromBool(boolin.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromCy(cyin: CY, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromDate(datein: Double, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromDate(datein, puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromDec(pdecin: ConstPtr, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromDec(pdecin.rawAddress.toString(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromDisp(pdispin: MutPtr, lcid: UInt, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI1(cin: Byte, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromI1(cin.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI2(uiin: Short, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromI2(uiin.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI4(lin: Int, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromI4(lin, puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI8(i64in: Long, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromI8(i64in.toString(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromR4(fltin: Float, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromR4(fltin.toDouble(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromR8(dblin: Double, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromR8(dblin, puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromUI1(bin: UByte, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromUI1(bin.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromUI4(ulin: UInt, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromUI4(ulin.toInt(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromUI8(i64in: ULong, puiout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI2FromUI8(i64in.toString(), puiout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromBool(boolin: VariantBool, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromBool(boolin.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromCy(cyin: CY, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromDate(datein: Double, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromDate(datein, pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromDec(pdecin: ConstPtr, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromDec(pdecin.rawAddress.toString(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromDisp(pdispin: MutPtr, lcid: UInt, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI1(cin: Byte, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromI1(cin.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI2(uiin: Short, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromI2(uiin.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI4(lin: Int, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromI4(lin, pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI8(i64in: Long, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromI8(i64in.toString(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromR4(fltin: Float, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromR4(fltin.toDouble(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromR8(dblin: Double, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromR8(dblin, pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromUI1(bin: UByte, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromUI1(bin.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromUI2(uiin: UShort, pulout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromUI2(uiin.toInt(), pulout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI4FromUI8(ui64in.toString(), plout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromBool(boolin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromCy(cyin: CY, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromDate(datein: Double, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromDate(datein, pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromDec(pdecin.rawAddress.toString(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromDisp(pdispin.rawAddress.toString(), lcid.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromI1(cin: Byte, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromI1(cin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromI2(sin: Short, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromI2(sin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromI8(ui64in: Long, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromI8(ui64in.toString(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromR4(fltin: Float, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromR4(fltin.toDouble(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromR8(dblin: Double, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromR8(dblin, pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromStr(strin.rawAddress.toString(), lcid.toInt(), dwflags.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromUI1(bin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromUI2(uiin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUI8FromUI4(ulin.toInt(), pi64out.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarUdateFromDate(datein, dwflags.toInt(), pudateout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarWeekdayName(iweekday, fabbrev, ifirstday, dwflags.toInt(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varXor(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVarXor(pvarleft.rawAddress.toString(), pvarright.rawAddress.toString(), pvarresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vectorFromBstr(bstr: Bstr, ppsa: MutPtr): Hresult =
    if (windowsWin32SystemOleNapiAvailable) wasmWindowssysWindowsWin32SystemOleVectorFromBstr(bstr.rawAddress.toString(), ppsa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
