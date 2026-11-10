@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32GraphicsPrintingNapiAddon(): Boolean

private val _windowsWin32GraphicsPrintingNapiAvailable: Boolean = _initWindowsWin32GraphicsPrintingNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addMonitorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addMonitorA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addMonitorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addMonitorW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPortA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPortA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPortW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPortW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrintProcessorA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrintProcessorA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrintProcessorW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrintProcessorW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrintProvidorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrintProvidorA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrintProvidorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrintProvidorW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterConnection2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnection2A(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterConnection2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnection2W(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterConnectionA(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnectionA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterConnectionW(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnectionW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterDriverA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterDriverExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverExA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterDriverExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverExW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterDriverW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_addPrinterW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_addPrinterW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_commonPropertySheetUIA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_commonPropertySheetUIA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_commonPropertySheetUIW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_commonPropertySheetUIW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_configurePortA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_configurePortA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_configurePortW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_configurePortW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_connectToPrinterDlg(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_connectToPrinterDlg(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deleteMonitorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deleteMonitorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deleteMonitorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deleteMonitorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePortA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePortA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePortW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePortW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrintProcessorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrintProcessorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrintProcessorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrintProcessorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrintProvidorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrintProvidorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrintProvidorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrintProvidorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterConnectionA(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterConnectionA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterConnectionW(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterConnectionW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterDriverA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterDriverExA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverExA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterDriverExW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverExW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterDriverW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_deletePrinterIC(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_deletePrinterIC(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_devQueryPrintEx(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_devQueryPrintEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumMonitorsA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumMonitorsA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumMonitorsW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumMonitorsW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPortsA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPortsA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPortsW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPortsW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrintProcessorsA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorsA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrintProcessorsW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorsW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrinterDriversA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrinterDriversA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrinterDriversW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrinterDriversW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrintersA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrintersA(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_enumPrintersW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_enumPrintersW(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_extDeviceMode(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_extDeviceMode(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_freePrintPropertyValue(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_freePrintPropertyValue(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiEndDocEMF(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiEndDocEMF(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiEndPageEMF(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiEndPageEMF(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiGetDC(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiGetDC(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiGetPageCount(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiGetPageCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiGetPageHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiGetPageHandle(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiPlayPageEMF(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiPlayPageEMF(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiResetDCEMF(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiResetDCEMF(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiStartDocEMF(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiStartDocEMF(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_gdiStartPageEMF(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_gdiStartPageEMF(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_generateCopyFilePaths(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_generateCopyFilePaths(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getCPSUIUserData(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getCPSUIUserData(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getCorePrinterDriversA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getCorePrinterDriversA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getCorePrinterDriversW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getCorePrinterDriversW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getDefaultPrinterA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getDefaultPrinterA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getDefaultPrinterW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getDefaultPrinterW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getJobAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getJobAttributes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getJobAttributesEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getJobAttributesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrintExecutionData(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrintExecutionData(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrintOutputInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrintOutputInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_impersonatePrinterClient(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_impersonatePrinterClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_isValidDevmodeA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_isValidDevmodeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_isValidDevmodeW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_isValidDevmodeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_openPrinter2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_openPrinter2A(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_openPrinter2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_openPrinter2W(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_openPrinterA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_openPrinterA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_openPrinterW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_openPrinterW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_removePrintDeviceObject(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_removePrintDeviceObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_reportJobProcessingProgress(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_reportJobProcessingProgress(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_revertToPrinterSelf()")
private external fun _wasm_windowssys_windows_win32_graphics_printing_revertToPrinterSelf(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_routerAllocBidiMem(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_routerAllocBidiMem(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_routerFreeBidiMem(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_routerFreeBidiMem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_setCPSUIUserData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_setCPSUIUserData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_setDefaultPrinterA(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_setDefaultPrinterA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_setDefaultPrinterW(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_setDefaultPrinterW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_setPortA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_setPortA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_setPortW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_setPortW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_xcvDataW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_xcvDataW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

public actual fun abortPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFormA(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFormW(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addMonitorA((pname?.value ?: 0L).toString(), level.toInt(), (pmonitors?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addMonitorW((pname?.value ?: 0L).toString(), level.toInt(), (pmonitors?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPortA((pname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pmonitorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPortW((pname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pmonitorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrintProcessorA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (ppathname?.value ?: 0L).toString(), (pprintprocessorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrintProcessorW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (ppathname?.value ?: 0L).toString(), (pprintprocessorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrintProvidorA((pname?.value ?: 0L).toString(), level.toInt(), (pprovidorinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrintProvidorW((pname?.value ?: 0L).toString(), level.toInt(), (pprovidorinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: COpaquePointer?): Handle =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterA((pname?.value ?: 0L).toString(), level.toInt(), (pprinter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnection2A((hwnd?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), dwlevel.toInt(), (pconnectioninfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnection2W((hwnd?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), dwlevel.toInt(), (pconnectioninfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnectionA((pname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterConnectionW((pname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverA((pname?.value ?: 0L).toString(), level.toInt(), (pdriverinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: COpaquePointer?, dwfilecopyflags: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverExA((pname?.value ?: 0L).toString(), level.toInt(), (lpbdriverinfo?.value ?: 0L).toString(), dwfilecopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: COpaquePointer?, dwfilecopyflags: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverExW((pname?.value ?: 0L).toString(), level.toInt(), (lpbdriverinfo?.value ?: 0L).toString(), dwfilecopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterDriverW((pname?.value ?: 0L).toString(), level.toInt(), (pdriverinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: COpaquePointer?): Handle =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_addPrinterW((pname?.value ?: 0L).toString(), level.toInt(), (pprinter?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendPrinterNotifyInfoData(pinfodest: COpaquePointer?, pdatasrc: COpaquePointer?, fdwflags: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData((pinfodest?.value ?: 0L).toString(), (pdatasrc?.value ?: 0L).toString(), fdwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification((hprinterrpc?.value ?: 0L).toString(), fdwfilterflags.toInt(), fdwoptions.toInt(), (hnotify?.value ?: 0L).toString(), (pprinternotifyoptions?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: COpaquePointer?): Int =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_commonPropertySheetUIA((hwndowner?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), (presult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: COpaquePointer?): Int =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_commonPropertySheetUIW((hwndowner?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), (presult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_configurePortA((pname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pportname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_configurePortW((pname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pportname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_connectToPrinterDlg((hwnd?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: COpaquePointer?, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: COpaquePointer?, ppiasynchnotification: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel((pszname?.value ?: 0L).toString(), (pnotificationtype?.value ?: 0L).toString(), euserfilter, econversationstyle, (pcallback?.value ?: 0L).toString(), (ppiasynchnotification?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deleteMonitorA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pmonitorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deleteMonitorW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pmonitorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePortA((pname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pportname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePortW((pname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pportname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrintProcessorA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pprintprocessorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrintProcessorW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pprintprocessorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrintProvidorA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pprintprovidorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrintProvidorW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pprintprovidorname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterConnectionA((pname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterConnectionW((pname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pdrivername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverExA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pdrivername?.value ?: 0L).toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverExW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pdrivername?.value ?: 0L).toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA((pszserver?.value ?: 0L).toString(), (pszinfpath?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW((pszserver?.value ?: 0L).toString(), (pszinfpath?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterDriverW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), (pdrivername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_deletePrinterIC((hprinteric?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: COpaquePointer?, presid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devQueryPrintEx(pdqpinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_devQueryPrintEx((pdqpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?, fmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?, fmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDocPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: COpaquePointer?, ppproperties: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumMonitorsA((pname?.value ?: 0L).toString(), level.toInt(), (pmonitor?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumMonitorsW((pname?.value ?: 0L).toString(), level.toInt(), (pmonitor?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPortsA((pname?.value ?: 0L).toString(), level.toInt(), (pport?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPortsW((pname?.value ?: 0L).toString(), level.toInt(), (pport?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA((pname?.value ?: 0L).toString(), (pprintprocessorname?.value ?: 0L).toString(), level.toInt(), (pdatatypes?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW((pname?.value ?: 0L).toString(), (pprintprocessorname?.value ?: 0L).toString(), level.toInt(), (pdatatypes?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorsA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pprintprocessorinfo?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrintProcessorsW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pprintprocessorinfo?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: COpaquePointer?, ptype: COpaquePointer?, pdata: COpaquePointer?, cbdata: UInt, pcbdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: COpaquePointer?, cbenumvalues: UInt, pcbenumvalues: COpaquePointer?, pnenumvalues: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: COpaquePointer?, cbenumvalues: UInt, pcbenumvalues: COpaquePointer?, pnenumvalues: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: COpaquePointer?, ptype: COpaquePointer?, pdata: COpaquePointer?, cbdata: UInt, pcbdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrinterDriversA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pdriverinfo?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrinterDriversW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pdriverinfo?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrintersA(flags.toInt(), (name?.value ?: 0L).toString(), level.toInt(), (pprinterenum?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_enumPrintersW(flags.toInt(), (name?.value ?: 0L).toString(), level.toInt(), (pprinterenum?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString(), (pcreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: COpaquePointer?, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: COpaquePointer?, pprofile: Pcstr, fmode: UInt): Int =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_extDeviceMode((hwnd?.value ?: 0L).toString(), (hinst?.value ?: 0L).toString(), (pdevmodeoutput?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString(), (pport?.value ?: 0L).toString(), (pdevmodeinput?.value ?: 0L).toString(), (pprofile?.value ?: 0L).toString(), fmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification((hchange?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: COpaquePointer?, pvreserved: COpaquePointer?, ppprinternotifyinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification((hchange?.value ?: 0L).toString(), (pdwchange?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (ppprinternotifyinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pcwritten: COpaquePointer?, csleep: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: COpaquePointer?) {
    if (_windowsWin32GraphicsPrintingNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(cproperties.toInt(), (ppproperties?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freePrintPropertyValue(pvalue: COpaquePointer?) {
    if (_windowsWin32GraphicsPrintingNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_printing_freePrintPropertyValue((pvalue?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo((pprinternotifyinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle((spoolfilehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiEndDocEMF((spoolfilehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiEndPageEMF((spoolfilehandle?.value ?: 0L).toString(), dwoptimization.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiGetDC((spoolfilehandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: COpaquePointer?, plastdm: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage((spoolfilehandle?.value ?: 0L).toString(), dwpagenumber.toInt(), (pcurrdm?.value ?: 0L).toString(), (plastdm?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiGetPageCount((spoolfilehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: COpaquePointer?): Handle =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiGetPageHandle((spoolfilehandle?.value ?: 0L).toString(), page.toInt(), (pdwpagetype?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: COpaquePointer?, pwszdocname: Pcwstr): Handle =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle((pwszprintername?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), (pwszdocname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: COpaquePointer?, prectborder: COpaquePointer?, prectclip: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiPlayPageEMF((spoolfilehandle?.value ?: 0L).toString(), (hemf?.value ?: 0L).toString(), (prectdocument?.value ?: 0L).toString(), (prectborder?.value ?: 0L).toString(), (prectclip?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiResetDCEMF((spoolfilehandle?.value ?: 0L).toString(), (pcurrdm?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiStartDocEMF((spoolfilehandle?.value ?: 0L).toString(), (pdocinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_gdiStartPageEMF((spoolfilehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: COpaquePointer?, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: COpaquePointer?, psztargetdir: Pwstr, pcchtargetdirsize: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_generateCopyFilePaths((pszprintername?.value ?: 0L).toString(), (pszdirectory?.value ?: 0L).toString(), (psplclientinfo?.value ?: 0L).toString(), dwlevel.toInt(), (pszsourcedir?.value ?: 0L).toString(), (pcchsourcedirsize?.value ?: 0L).toString(), (psztargetdir?.value ?: 0L).toString(), (pcchtargetdirsize?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getCPSUIUserData((hdlg?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getCorePrinterDriversA((pszserver?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), (pszzcoredriverdependencies?.value ?: 0L).toString(), ccoreprinterdrivers.toInt(), (pcoreprinterdrivers?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getCorePrinterDriversW((pszserver?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), (pszzcoredriverdependencies?.value ?: 0L).toString(), ccoreprinterdrivers.toInt(), (pcoreprinterdrivers?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getDefaultPrinterA((pszbuffer?.value ?: 0L).toString(), (pcchbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getDefaultPrinterW((pszbuffer?.value ?: 0L).toString(), (pcchbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: COpaquePointer?, pattributeinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getJobAttributes((pprintername?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), (pattributeinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: COpaquePointer?, dwlevel: UInt, pattributeinfo: COpaquePointer?, nsize: UInt, dwflags: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getJobAttributesEx((pprintername?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwlevel.toInt(), (pattributeinfo?.value ?: 0L).toString(), nsize.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintExecutionData(pdata: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrintExecutionData((pdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: COpaquePointer?, ppszoutputfile: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrintOutputInfo((hwnd?.value ?: 0L).toString(), (pszprinter?.value ?: 0L).toString(), (phfile?.value ?: 0L).toString(), (ppszoutputfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pprintprocessorinfo?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pprintprocessorinfo?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pdriverdirectory?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW((pname?.value ?: 0L).toString(), (penvironment?.value ?: 0L).toString(), level.toInt(), (pdriverdirectory?.value ?: 0L).toString(), cbbuf.toInt(), (pcbneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA((pszserver?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), (pszlanguage?.value ?: 0L).toString(), (pszpackageid?.value ?: 0L).toString(), (pszdriverpackagecab?.value ?: 0L).toString(), cchdriverpackagecab.toInt(), (pcchrequiredsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW((pszserver?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), (pszlanguage?.value ?: 0L).toString(), (pszpackageid?.value ?: 0L).toString(), (pszdriverpackagecab?.value ?: 0L).toString(), cchdriverpackagecab.toInt(), (pcchrequiredsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_impersonatePrinterClient((htoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA((pszserver?.value ?: 0L).toString(), (pszinfpath?.value ?: 0L).toString(), (pszdrivername?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW((pszserver?.value ?: 0L).toString(), (pszinfpath?.value ?: 0L).toString(), (pszdrivername?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDevmodeA(pdevmode: COpaquePointer?, devmodesize: ULong): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_isValidDevmodeA((pdevmode?.value ?: 0L).toString(), devmodesize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDevmodeW(pdevmode: COpaquePointer?, devmodesize: ULong): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_isValidDevmodeW((pdevmode?.value ?: 0L).toString(), devmodesize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?, poptions: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_openPrinter2A((pprintername?.value ?: 0L).toString(), (phprinter?.value ?: 0L).toString(), (pdefault?.value ?: 0L).toString(), (poptions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?, poptions: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_openPrinter2W((pprintername?.value ?: 0L).toString(), (phprinter?.value ?: 0L).toString(), (pdefault?.value ?: 0L).toString(), (poptions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinterA(pprintername: Pcstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_openPrinterA((pprintername?.value ?: 0L).toString(), (phprinter?.value ?: 0L).toString(), (pdefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_openPrinterW((pprintername?.value ?: 0L).toString(), (phprinter?.value ?: 0L).toString(), (pdefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: COpaquePointer?, cin: UInt, pout: COpaquePointer?, cout: UInt, ul: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC((hprinteric?.value ?: 0L).toString(), (pin?.value ?: 0L).toString(), cin.toInt(), (pout?.value ?: 0L).toString(), cout.toInt(), ul.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: COpaquePointer?, pvreserved1: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pnobytesread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: COpaquePointer?, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: COpaquePointer?, phnotify: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications((pszname?.value ?: 0L).toString(), (pnotificationtype?.value ?: 0L).toString(), euserfilter, econversationstyle, (pcallback?.value ?: 0L).toString(), (phnotify?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_removePrintDeviceObject((hdeviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: COpaquePointer?, pprinternotifyinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: COpaquePointer?, pprinternotifyinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx((hnotify?.value ?: 0L).toString(), dwcolor.toInt(), fdwflags.toInt(), (pdwresult?.value ?: 0L).toString(), (pprinternotifyinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_reportJobProcessingProgress((printerhandle?.value ?: 0L).toString(), jobid.toInt(), joboperation, jobprogress) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertToPrinterSelf(): Handle =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_revertToPrinterSelf().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocBidiMem(numbytes: ULong): COpaquePointer? =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_routerAllocBidiMem(numbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocBidiResponseContainer(count: UInt): COpaquePointer? =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(count.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): COpaquePointer? =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerFreeBidiMem(pmempointer: COpaquePointer?) {
    if (_windowsWin32GraphicsPrintingNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_printing_routerFreeBidiMem((pmempointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerFreeBidiResponseContainer(pdata: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer((pdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerFreePrinterNotifyInfo(pinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo((pinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_setCPSUIUserData((hdlg?.value ?: 0L).toString(), cpsuiuserdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_setDefaultPrinterA((pszprinter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_setDefaultPrinterW((pszprinter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_setPortA((pname?.value ?: 0L).toString(), (pportname?.value ?: 0L).toString(), dwlevel.toInt(), (pportinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_setPortW((pname?.value ?: 0L).toString(), (pportname?.value ?: 0L).toString(), dwlevel.toInt(), (pportinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: COpaquePointer?, presponse: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent((pszprintername?.value ?: 0L).toString(), (pszkey?.value ?: 0L).toString(), dwcopyfileevent.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: COpaquePointer?, pvreserved: COpaquePointer?, pnotificationconfig: COpaquePointer?, phnotify: COpaquePointer?, phevent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: COpaquePointer?, pprinternotifyoptions: COpaquePointer?, ppprinternotifyinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFreePrinterNotifyInfo(pinfo: COpaquePointer?) {
    if (_windowsWin32GraphicsPrintingNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo((pinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: COpaquePointer?, ppinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA((pszserver?.value ?: 0L).toString(), (pszinfpath?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (pszdestinfpath?.value ?: 0L).toString(), (pcchdestinfpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW((pszserver?.value ?: 0L).toString(), (pszinfpath?.value ?: 0L).toString(), (pszenvironment?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (pszdestinfpath?.value ?: 0L).toString(), (pcchdestinfpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pcwritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: COpaquePointer?, cbinputdata: UInt, poutputdata: COpaquePointer?, cboutputdata: UInt, pcboutputneeded: COpaquePointer?, pdwstatus: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsPrintingNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_xcvDataW((hxcv?.value ?: 0L).toString(), (pszdataname?.value ?: 0L).toString(), (pinputdata?.value ?: 0L).toString(), cbinputdata.toInt(), (poutputdata?.value ?: 0L).toString(), cboutputdata.toInt(), (pcboutputneeded?.value ?: 0L).toString(), (pdwstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
