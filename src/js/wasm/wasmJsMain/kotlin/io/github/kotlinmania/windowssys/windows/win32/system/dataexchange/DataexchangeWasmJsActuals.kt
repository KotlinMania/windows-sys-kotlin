@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDataexchangeNapiAddon(): Boolean

private val windowsWin32SystemDataexchangeNapiAvailable: Boolean = initWindowsWin32SystemDataexchangeNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeAddAtomA(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeAddAtomA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeAddAtomW(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeAddAtomW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeChangeClipboardChain(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeChangeClipboardChain(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeCloseClipboard()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeCloseClipboard(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeCountClipboardFormats()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeCountClipboardFormats(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeAccessData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeAccessData(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeAddData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeAddData(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeClientTransaction(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeClientTransaction(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeConnect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeConnect(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeConnectList(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeConnectList(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeDisconnect(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeDisconnect(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeDisconnectList(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeDisconnectList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeEnableCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeEnableCallback(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeGetData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeGetData(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeGetLastError(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeGetLastError(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeInitializeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeInitializeA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeInitializeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeInitializeW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeNameService(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeNameService(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdePostAdvise(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdePostAdvise(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeQueryStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryStringA(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeQueryStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryStringW(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeReconnect(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeReconnect(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeUnaccessData(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeUnaccessData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDdeUninitialize(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDdeUninitialize(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeDeleteAtom(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeDeleteAtom(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeEmptyClipboard()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeEmptyClipboard(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeFindAtomA(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeFindAtomA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeFindAtomW(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeFindAtomW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeFreeDDElParam(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeFreeDDElParam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetAtomNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetAtomNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetAtomNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetAtomNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetClipboardData(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardData(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetClipboardOwner()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardOwner(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetClipboardViewer()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardViewer(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow()")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeInitAtomTable(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeInitAtomTable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeOpenClipboard(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeOpenClipboard(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangePackDDElParam(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangePackDDElParam(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeReuseDDElParam(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeReuseDDElParam(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeSetClipboardData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeSetClipboardData(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeSetClipboardViewer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeSetClipboardViewer(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDataexchangeUnpackDDElParam(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDataexchangeUnpackDDElParam(p0: Int, p1: String, p2: String, p3: String): Int

public actual fun addAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeAddAtomA(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeAddAtomW(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeChangeClipboardChain(hwndremove.rawAddress.toString(), hwndnewnext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClipboard(): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeCloseClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun countClipboardFormats(): Int =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeCountClipboardFormats() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(idinst.toInt(), hconv.rawAddress.toString(), idtransaction.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: MutPtr<UInt>): MutPtr<UByte> =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeAccessData(hdata.rawAddress.toString(), pcbdatasize.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeAddData(hdata: Hddedata, psrc: ConstPtr<UByte>, cb: UInt, cboff: UInt): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeAddData(hdata.rawAddress.toString(), psrc.rawAddress.toString(), cb.toInt(), cboff.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeClientTransaction(pdata: ConstPtr<UByte>, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: MutPtr<UInt>): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeClientTransaction(pdata.rawAddress.toString(), cbdata.toInt(), hconv.rawAddress.toString(), hszitem.rawAddress.toString(), wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), pdwresult.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(hsz1.rawAddress.toString(), hsz2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: ConstPtr<Convcontext>): Hconv =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeConnect(idinst.toInt(), hszservice.rawAddress.toString(), hsztopic.rawAddress.toString(), pcc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: ConstPtr<Convcontext>): Hconvlist =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeConnectList(idinst.toInt(), hszservice.rawAddress.toString(), hsztopic.rawAddress.toString(), hconvlist.rawAddress.toString(), pcc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: ConstPtr<UByte>, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(idinst.toInt(), psrc.rawAddress.toString(), cb.toInt(), cboff.toInt(), hszitem.rawAddress.toString(), wfmt.toInt(), afcmd.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(idinst.toInt(), psz.rawAddress.toString(), icodepage).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(idinst.toInt(), psz.rawAddress.toString(), icodepage).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeDisconnect(hconv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeDisconnectList(hconvlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeEnableCallback(idinst.toInt(), hconv.rawAddress.toString(), wcmd.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(hdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(idinst.toInt(), hsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetData(hdata: Hddedata, pdst: MutPtr<UByte>, cbmax: UInt, cboff: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeGetData(hdata.rawAddress.toString(), pdst.rawAddress.toString(), cbmax.toInt(), cboff.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeGetLastError(idinst: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(hconv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeA(pidinst: MutPtr<UInt>, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeInitializeA(pidinst.rawAddress.toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeInitializeW(pidinst: MutPtr<UInt>, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeInitializeW(pidinst.rawAddress.toString(), 0L.toString(), afcmd.toInt(), ulres.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(idinst.toInt(), hsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeNameService(idinst.toInt(), hsz1.rawAddress.toString(), hsz2.rawAddress.toString(), afcmd.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdePostAdvise(idinst.toInt(), hsztopic.rawAddress.toString(), hszitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: MutPtr<Convinfo>): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(hconv.rawAddress.toString(), idtransaction.toInt(), pconvinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(hconvlist.rawAddress.toString(), hconvprev.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryStringA(idinst.toInt(), hsz.rawAddress.toString(), psz.rawAddress.toString(), cchmax.toInt(), icodepage).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeQueryStringW(idinst.toInt(), hsz.rawAddress.toString(), psz.rawAddress.toString(), cchmax.toInt(), icodepage).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeDdeReconnect(hconv.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: ConstPtr<SecurityQualityOfService>, pqosprev: MutPtr<SecurityQualityOfService>): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(hwndclient.rawAddress.toString(), pqosnew.rawAddress.toString(), pqosprev.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(hconv.rawAddress.toString(), id.toInt(), huser.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeUnaccessData(hdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddeUninitialize(idinst: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAtom(natom: UShort): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeDeleteAtom(natom.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emptyClipboard(): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeEmptyClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumClipboardFormats(format: UInt): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeFindAtomA(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeFindAtomW(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetAtomNameA(natom.toInt(), lpbuffer.rawAddress.toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetAtomNameW(natom.toInt(), lpbuffer.rawAddress.toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardData(uformat: UInt): Handle =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardData(uformat.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(format.toInt(), lpszformatname.rawAddress.toString(), cchmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(format.toInt(), lpszformatname.rawAddress.toString(), cchmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardOwner(): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardOwner().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardSequenceNumber(): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipboardViewer(): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeGetClipboardViewer().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenClipboardWindow(): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClipboardFormat(paformatprioritylist: ConstPtr<UInt>, cformats: Int): Int =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(paformatprioritylist.rawAddress.toString(), cformats) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdatedClipboardFormats(lpuiformats: MutPtr<UInt>, cformats: UInt, pcformatsout: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(lpuiformats.rawAddress.toString(), cformats.toInt(), pcformatsout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(lpstring.rawAddress.toString(), flags.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(lpstring.rawAddress.toString(), flags.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalDeleteAtom(natom: UShort): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(lpstring.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(natom.toInt(), lpbuffer.rawAddress.toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(natom.toInt(), lpbuffer.rawAddress.toString(), nsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(hwndclient.rawAddress.toString(), hwndserver.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initAtomTable(nsize: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeOpenClipboard(hwndnewowner.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangePackDDElParam(msg.toInt(), uilo.toString(), uihi.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(lpszformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(lpszformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam.toString(), msgin.toInt(), msgout.toInt(), uilo.toString(), uihi.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeSetClipboardData(uformat.toInt(), hmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeSetClipboardViewer(hwndnewviewer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: ConstPtr<UByte>, hdcref: Hdc, lpmfp: ConstPtr<Metafilepict>): Henhmetafile =
    if (windowsWin32SystemDataexchangeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(nsize.toInt(), lpmeta16data.rawAddress.toString(), hdcref.rawAddress.toString(), lpmfp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: MutPtr<ULong>, puihi: MutPtr<ULong>): Bool =
    if (windowsWin32SystemDataexchangeNapiAvailable) wasmWindowssysWindowsWin32SystemDataexchangeUnpackDDElParam(msg.toInt(), lparam.toString(), puilo.rawAddress.toString(), puihi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
