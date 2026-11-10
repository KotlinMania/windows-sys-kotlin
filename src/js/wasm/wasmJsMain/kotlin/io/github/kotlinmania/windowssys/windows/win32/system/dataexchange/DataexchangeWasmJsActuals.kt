@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemDataexchangeNapiAddon(): Boolean

private val _windowsWin32SystemDataexchangeNapiAvailable: Boolean = _initWindowsWin32SystemDataexchangeNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_addAtomA(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_addAtomA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_addAtomW(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_addAtomW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_changeClipboardChain(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_changeClipboardChain(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_closeClipboard()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_closeClipboard(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_countClipboardFormats()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_countClipboardFormats(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeAccessData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeAccessData(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeAddData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeAddData(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeClientTransaction(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeClientTransaction(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeConnect(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeConnect(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeConnectList(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeConnectList(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeDisconnect(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeDisconnect(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeDisconnectList(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeDisconnectList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeEnableCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeEnableCallback(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeGetData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeGetData(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeGetLastError(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeGetLastError(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeInitializeA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeInitializeA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeInitializeW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeInitializeW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeNameService(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeNameService(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddePostAdvise(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddePostAdvise(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeQueryStringA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryStringA(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeQueryStringW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryStringW(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeReconnect(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeReconnect(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeUnaccessData(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeUnaccessData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_ddeUninitialize(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_ddeUninitialize(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_deleteAtom(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_deleteAtom(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_emptyClipboard()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_emptyClipboard(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_enumClipboardFormats(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_enumClipboardFormats(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_findAtomA(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_findAtomA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_findAtomW(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_findAtomW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_freeDDElParam(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_freeDDElParam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getAtomNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getAtomNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getAtomNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getAtomNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getClipboardData(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getClipboardData(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getClipboardOwner()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getClipboardOwner(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getClipboardViewer()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getClipboardViewer(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow()")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalAddAtomA(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalAddAtomExA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomExA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalAddAtomExW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomExW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalAddAtomW(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalDeleteAtom(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalDeleteAtom(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalFindAtomA(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalFindAtomA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalFindAtomW(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalFindAtomW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_initAtomTable(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_initAtomTable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_openClipboard(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_openClipboard(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_packDDElParam(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_packDDElParam(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_reuseDDElParam(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_reuseDDElParam(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_setClipboardData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_setClipboardData(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_setClipboardViewer(p0)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_setClipboardViewer(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_dataexchange_unpackDDElParam(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_dataexchange_unpackDDElParam(p0: Int, p1: String, p2: String, p3: String): Int

public actual fun addAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_addAtomA((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_addAtomW((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_addClipboardFormatListener((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_changeClipboardChain((hwndremove?.value ?: 0L).toString(), (hwndnewnext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClipboard(): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_closeClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun countClipboardFormats(): Int =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_countClipboardFormats() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(idinst.toInt(), (hconv?.value ?: 0L).toString(), idtransaction.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeAccessData((hdata?.value ?: 0L).toString(), (pcbdatasize?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAddData(hdata: Hddedata, psrc: COpaquePointer?, cb: UInt, cboff: UInt): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeAddData((hdata?.value ?: 0L).toString(), (psrc?.value ?: 0L).toString(), cb.toInt(), cboff.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeClientTransaction(pdata: COpaquePointer?, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: COpaquePointer?): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeClientTransaction((pdata?.value ?: 0L).toString(), cbdata.toInt(), (hconv?.value ?: 0L).toString(), (hszitem?.value ?: 0L).toString(), wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), (pdwresult?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles((hsz1?.value ?: 0L).toString(), (hsz2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: COpaquePointer?): Hconv =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeConnect(idinst.toInt(), (hszservice?.value ?: 0L).toString(), (hsztopic?.value ?: 0L).toString(), (pcc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: COpaquePointer?): Hconvlist =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeConnectList(idinst.toInt(), (hszservice?.value ?: 0L).toString(), (hsztopic?.value ?: 0L).toString(), (hconvlist?.value ?: 0L).toString(), (pcc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: COpaquePointer?, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(idinst.toInt(), (psrc?.value ?: 0L).toString(), cb.toInt(), cboff.toInt(), (hszitem?.value ?: 0L).toString(), wfmt.toInt(), afcmd.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(idinst.toInt(), (psz?.value ?: 0L).toString(), icodepage).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(idinst.toInt(), (psz?.value ?: 0L).toString(), icodepage).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeDisconnect((hconv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeDisconnectList((hconvlist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeEnableCallback(idinst.toInt(), (hconv?.value ?: 0L).toString(), wcmd.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle((hdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(idinst.toInt(), (hsz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetData(hdata: Hddedata, pdst: COpaquePointer?, cbmax: UInt, cboff: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeGetData((hdata?.value ?: 0L).toString(), (pdst?.value ?: 0L).toString(), cbmax.toInt(), cboff.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetLastError(idinst: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeGetLastError(idinst.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeImpersonateClient((hconv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeA(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeInitializeA((pidinst?.value ?: 0L).toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeW(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeInitializeW((pidinst?.value ?: 0L).toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(idinst.toInt(), (hsz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeNameService(idinst.toInt(), (hsz1?.value ?: 0L).toString(), (hsz2?.value ?: 0L).toString(), afcmd.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddePostAdvise(idinst.toInt(), (hsztopic?.value ?: 0L).toString(), (hszitem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo((hconv?.value ?: 0L).toString(), idtransaction.toInt(), (pconvinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryNextServer((hconvlist?.value ?: 0L).toString(), (hconvprev?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryStringA(idinst.toInt(), (hsz?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), cchmax.toInt(), icodepage).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeQueryStringW(idinst.toInt(), (hsz?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), cchmax.toInt(), icodepage).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeReconnect((hconv?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: COpaquePointer?, pqosprev: COpaquePointer?): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService((hwndclient?.value ?: 0L).toString(), (pqosnew?.value ?: 0L).toString(), (pqosprev?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeSetUserHandle((hconv?.value ?: 0L).toString(), id.toInt(), huser.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeUnaccessData((hdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUninitialize(idinst: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_ddeUninitialize(idinst.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAtom(natom: UShort): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_deleteAtom(natom.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emptyClipboard(): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_emptyClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumClipboardFormats(format: UInt): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_enumClipboardFormats(format.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_findAtomA((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_findAtomW((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_freeDDElParam(msg.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getAtomNameA(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getAtomNameW(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardData(uformat: UInt): Handle =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getClipboardData(uformat.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(format.toInt(), (lpszformatname?.value ?: 0L).toString(), cchmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(format.toInt(), (lpszformatname?.value ?: 0L).toString(), cchmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardOwner(): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getClipboardOwner().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardSequenceNumber(): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardViewer(): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getClipboardViewer().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenClipboardWindow(): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClipboardFormat(paformatprioritylist: COpaquePointer?, cformats: Int): Int =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat((paformatprioritylist?.value ?: 0L).toString(), cformats) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdatedClipboardFormats(lpuiformats: COpaquePointer?, cformats: UInt, pcformatsout: COpaquePointer?): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats((lpuiformats?.value ?: 0L).toString(), cformats.toInt(), (pcformatsout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomA((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomExA((lpstring?.value ?: 0L).toString(), flags.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomExW((lpstring?.value ?: 0L).toString(), flags.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalAddAtomW((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalDeleteAtom(natom: UShort): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalDeleteAtom(natom.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalFindAtomA((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalFindAtomW((lpstring?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(natom.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow((hwndclient?.value ?: 0L).toString(), (hwndserver?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initAtomTable(nsize: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_initAtomTable(nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_openClipboard((hwndnewowner?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_packDDElParam(msg.toInt(), uilo.toString(), uihi.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_registerClipboardFormatA((lpszformat?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_registerClipboardFormatW((lpszformat?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_reuseDDElParam(lparam.toString(), msgin.toInt(), msgout.toInt(), uilo.toString(), uihi.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_setClipboardData(uformat.toInt(), (hmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_setClipboardViewer((hwndnewviewer?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: COpaquePointer?, hdcref: Hdc, lpmfp: COpaquePointer?): Henhmetafile =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(nsize.toInt(), (lpmeta16data?.value ?: 0L).toString(), (hdcref?.value ?: 0L).toString(), (lpmfp?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: COpaquePointer?, puihi: COpaquePointer?): Bool =
    if (_windowsWin32SystemDataexchangeNapiAvailable) _wasm_windowssys_windows_win32_system_dataexchange_unpackDDElParam(msg.toInt(), lparam.toString(), (puilo?.value ?: 0L).toString(), (puihi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
