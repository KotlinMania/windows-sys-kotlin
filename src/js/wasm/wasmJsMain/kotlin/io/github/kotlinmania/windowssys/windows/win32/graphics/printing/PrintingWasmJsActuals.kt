@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GraphicsPrintingNapiAddon(): Boolean

private val windowsWin32GraphicsPrintingNapiAvailable: Boolean = initWindowsWin32GraphicsPrintingNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddMonitorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddMonitorA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddMonitorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddMonitorW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPortA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPortA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPortW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPortW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAddPrinterW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingConfigurePortA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingConfigurePortA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingConfigurePortW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingConfigurePortW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeleteMonitorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeleteMonitorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeleteMonitorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeleteMonitorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePortA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePortA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePortW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePortW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDeletePrinterIC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterIC(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumMonitorsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumMonitorsA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumMonitorsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumMonitorsW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPortsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPortsA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPortsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPortsW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrintersA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintersA(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingEnumPrintersW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintersW(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingExtDeviceMode(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingExtDeviceMode(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiGetDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiGetDC(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiGetPageCount(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiGetPageCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetJobAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetJobAttributes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingOpenPrinter2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinter2A(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingOpenPrinter2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinter2W(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingOpenPrinterA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinterA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingOpenPrinterW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinterW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf()")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSetPortA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSetPortA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSetPortW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSetPortW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingXcvDataW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingXcvDataW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

public actual fun abortPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFormA(hprinter: PrinterHandle, level: UInt, pform: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFormW(hprinter: PrinterHandle, level: UInt, pform: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddMonitorA(pname.rawAddress.toString(), level.toInt(), pmonitors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddMonitorW(pname.rawAddress.toString(), level.toInt(), pmonitors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPortA(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pmonitorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPortW(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pmonitorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), ppathname.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), ppathname.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(pname.rawAddress.toString(), level.toInt(), pprovidorinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(pname.rawAddress.toString(), level.toInt(), pprovidorinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr): Handle =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterA(pname.rawAddress.toString(), level.toInt(), pprinter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(hwnd.rawAddress.toString(), pszname.rawAddress.toString(), dwlevel.toInt(), pconnectioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(hwnd.rawAddress.toString(), pszname.rawAddress.toString(), dwlevel.toInt(), pconnectioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(pname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(pname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(pname.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr, dwfilecopyflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(pname.rawAddress.toString(), level.toInt(), lpbdriverinfo.rawAddress.toString(), dwfilecopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr, dwfilecopyflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(pname.rawAddress.toString(), level.toInt(), lpbdriverinfo.rawAddress.toString(), dwfilecopyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(pname.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr): Handle =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingAddPrinterW(pname.rawAddress.toString(), level.toInt(), pprinter.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendPrinterNotifyInfoData(pinfodest: ConstPtr, pdatasrc: ConstPtr, fdwflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(pinfodest.rawAddress.toString(), pdatasrc.rawAddress.toString(), fdwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr): UInt =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(hprinterrpc.rawAddress.toString(), fdwfilterflags.toInt(), fdwoptions.toInt(), hnotify.rawAddress.toString(), pprinternotifyoptions.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr): Int =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(hwndowner.rawAddress.toString(), 0L.toString(), lparam.toString(), presult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr): Int =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(hwndowner.rawAddress.toString(), 0L.toString(), lparam.toString(), presult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingConfigurePortA(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingConfigurePortW(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(hwnd.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr, ppiasynchnotification: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(pszname.rawAddress.toString(), pnotificationtype.rawAddress.toString(), euserfilter, econversationstyle, pcallback.rawAddress.toString(), ppiasynchnotification.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeleteMonitorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pmonitorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeleteMonitorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pmonitorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePortA(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePortW(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprovidorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprovidorname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(pname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(pname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDeletePrinterIC(hprinteric.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr, presid: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devQueryPrintEx(pdqpinfo: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(pdqpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr, fmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr, fmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDocPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: MutPtr, ppproperties: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumMonitorsA(pname.rawAddress.toString(), level.toInt(), pmonitor.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumMonitorsW(pname.rawAddress.toString(), level.toInt(), pmonitor.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPortsA(pname.rawAddress.toString(), level.toInt(), pport.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPortsW(pname.rawAddress.toString(), level.toInt(), pport.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(pname.rawAddress.toString(), pprintprocessorname.rawAddress.toString(), level.toInt(), pdatatypes.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(pname.rawAddress.toString(), pprintprocessorname.rawAddress.toString(), level.toInt(), pdatatypes.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr, ptype: MutPtr, pdata: MutPtr, cbdata: UInt, pcbdata: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr, cbenumvalues: UInt, pcbenumvalues: MutPtr, pnenumvalues: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr, cbenumvalues: UInt, pcbenumvalues: MutPtr, pnenumvalues: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr, ptype: MutPtr, pdata: MutPtr, cbdata: UInt, pcbdata: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintersA(flags.toInt(), name.rawAddress.toString(), level.toInt(), pprinterenum.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingEnumPrintersW(flags.toInt(), name.rawAddress.toString(), level.toInt(), pprinterenum.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr, pprofile: Pcstr, fmode: UInt): Int =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingExtDeviceMode(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), pdevmodeoutput.rawAddress.toString(), pdevicename.rawAddress.toString(), pport.rawAddress.toString(), pdevmodeinput.rawAddress.toString(), pprofile.rawAddress.toString(), fmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(hchange.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr, pvreserved: ConstPtr, ppprinternotifyinfo: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(hchange.rawAddress.toString(), pdwchange.rawAddress.toString(), pvreserved.rawAddress.toString(), ppprinternotifyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr, cbbuf: UInt, pcwritten: MutPtr, csleep: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr) {
    if (windowsWin32GraphicsPrintingNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(cproperties.toInt(), ppproperties.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freePrintPropertyValue(pvalue: MutPtr) {
    if (windowsWin32GraphicsPrintingNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(pvalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(pprinternotifyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(spoolfilehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(spoolfilehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(spoolfilehandle.rawAddress.toString(), dwoptimization.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingGdiGetDC(spoolfilehandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr, plastdm: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(spoolfilehandle.rawAddress.toString(), dwpagenumber.toInt(), pcurrdm.rawAddress.toString(), plastdm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiGetPageCount(spoolfilehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr): Handle =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(spoolfilehandle.rawAddress.toString(), page.toInt(), pdwpagetype.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr, pwszdocname: Pcwstr): Handle =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(pwszprintername.rawAddress.toString(), pdevmode.rawAddress.toString(), pwszdocname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr, prectborder: MutPtr, prectclip: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(spoolfilehandle.rawAddress.toString(), hemf.rawAddress.toString(), prectdocument.rawAddress.toString(), prectborder.rawAddress.toString(), prectclip.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(spoolfilehandle.rawAddress.toString(), pcurrdm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(spoolfilehandle.rawAddress.toString(), pdocinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(spoolfilehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr, dwflags: UInt): UInt =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(pszprintername.rawAddress.toString(), pszdirectory.rawAddress.toString(), psplclientinfo.rawAddress.toString(), dwlevel.toInt(), pszsourcedir.rawAddress.toString(), pcchsourcedirsize.rawAddress.toString(), psztargetdir.rawAddress.toString(), pcchtargetdirsize.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(hdlg.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszzcoredriverdependencies.rawAddress.toString(), ccoreprinterdrivers.toInt(), pcoreprinterdrivers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszzcoredriverdependencies.rawAddress.toString(), ccoreprinterdrivers.toInt(), pcoreprinterdrivers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(pszbuffer.rawAddress.toString(), pcchbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(pszbuffer.rawAddress.toString(), pcchbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr, pattributeinfo: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetJobAttributes(pprintername.rawAddress.toString(), pdevmode.rawAddress.toString(), pattributeinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr, dwlevel: UInt, pattributeinfo: MutPtr, nsize: UInt, dwflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(pprintername.rawAddress.toString(), pdevmode.rawAddress.toString(), dwlevel.toInt(), pattributeinfo.rawAddress.toString(), nsize.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintExecutionData(pdata: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(pdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr, ppszoutputfile: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(hwnd.rawAddress.toString(), pszprinter.rawAddress.toString(), phfile.rawAddress.toString(), ppszoutputfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverdirectory.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverdirectory.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszlanguage.rawAddress.toString(), pszpackageid.rawAddress.toString(), pszdriverpackagecab.rawAddress.toString(), cchdriverpackagecab.toInt(), pcchrequiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszlanguage.rawAddress.toString(), pszpackageid.rawAddress.toString(), pszdriverpackagecab.rawAddress.toString(), cchdriverpackagecab.toInt(), pcchrequiredsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(htoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszdrivername.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszdrivername.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDevmodeA(pdevmode: ConstPtr, devmodesize: ULong): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(pdevmode.rawAddress.toString(), devmodesize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDevmodeW(pdevmode: ConstPtr, devmodesize: ULong): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(pdevmode.rawAddress.toString(), devmodesize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr, pdefault: ConstPtr, poptions: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinter2A(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString(), poptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr, pdefault: ConstPtr, poptions: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinter2W(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString(), poptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr, pdefault: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinterA(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr, pdefault: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingOpenPrinterW(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr, cin: UInt, pout: MutPtr, cout: UInt, ul: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(hprinteric.rawAddress.toString(), pin.rawAddress.toString(), cin.toInt(), pout.rawAddress.toString(), cout.toInt(), ul.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr, pvreserved1: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPrinter(hprinter: PrinterHandle, pbuf: MutPtr, cbbuf: UInt, pnobytesread: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: ConstPtr, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr, phnotify: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(pszname.rawAddress.toString(), pnotificationtype.rawAddress.toString(), euserfilter, econversationstyle, pcallback.rawAddress.toString(), phnotify.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(hdeviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr, pprinternotifyinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr, pprinternotifyinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(hnotify.rawAddress.toString(), dwcolor.toInt(), fdwflags.toInt(), pdwresult.rawAddress.toString(), pprinternotifyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(printerhandle.rawAddress.toString(), jobid.toInt(), joboperation, jobprogress) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertToPrinterSelf(): Handle =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocBidiMem(numbytes: ULong): MutPtr =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(numbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocBidiResponseContainer(count: UInt): MutPtr =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(count.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr =
    if (windowsWin32GraphicsPrintingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerFreeBidiMem(pmempointer: ConstPtr) {
    if (windowsWin32GraphicsPrintingNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(pmempointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerFreeBidiResponseContainer(pdata: ConstPtr): UInt =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(pdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerFreePrinterNotifyInfo(pinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(pinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(hdlg.rawAddress.toString(), cpsuiuserdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(pszprinter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(pszprinter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: ConstPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingSetPortA(pname.rawAddress.toString(), pportname.rawAddress.toString(), dwlevel.toInt(), pportinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingSetPortW(pname.rawAddress.toString(), pportname.rawAddress.toString(), dwlevel.toInt(), pportinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: ConstPtr, presponse: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(pszprintername.rawAddress.toString(), pszkey.rawAddress.toString(), dwcopyfileevent.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr, pvreserved: ConstPtr, pnotificationconfig: ConstPtr, phnotify: MutPtr, phevent: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr, pprinternotifyoptions: ConstPtr, ppprinternotifyinfo: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr) {
    if (windowsWin32GraphicsPrintingNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: ConstPtr, ppinfo: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), pszdestinfpath.rawAddress.toString(), pcchdestinfpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), pszdestinfpath.rawAddress.toString(), pcchdestinfpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr, cbbuf: UInt, pcwritten: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr, cbinputdata: UInt, poutputdata: MutPtr, cboutputdata: UInt, pcboutputneeded: MutPtr, pdwstatus: MutPtr): Bool =
    if (windowsWin32GraphicsPrintingNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingXcvDataW(hxcv.rawAddress.toString(), pszdataname.rawAddress.toString(), pinputdata.rawAddress.toString(), cbinputdata.toInt(), poutputdata.rawAddress.toString(), cboutputdata.toInt(), pcboutputneeded.rawAddress.toString(), pdwstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
