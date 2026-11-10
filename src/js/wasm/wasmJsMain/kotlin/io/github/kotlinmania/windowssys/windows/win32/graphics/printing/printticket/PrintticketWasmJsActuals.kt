@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32GraphicsPrintingPrintticketNapiAddon(): Boolean

private val _windowsWin32GraphicsPrintingPrintticketNapiAvailable: Boolean = _initWindowsWin32GraphicsPrintingPrintticketNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory(p0: String): Int

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider((hprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: COpaquePointer?, scope: EPrintTicketScope, pprintticket: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket((hprovider?.value ?: 0L).toString(), cbdevmode.toInt(), (pdevmode?.value ?: 0L).toString(), scope, (pprintticket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: COpaquePointer?, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: COpaquePointer?, ppdevmode: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode((hprovider?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), basedevmodetype, scope, (pcbdevmode?.value ?: 0L).toString(), (ppdevmode?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pcapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities((hprovider?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), (pcapabilities?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pdevicecapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities((hprovider?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), (pdevicecapabilities?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: COpaquePointer?, pdeviceresources: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources((hprovider?.value ?: 0L).toString(), (pszlocalename?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), (pdeviceresources?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: COpaquePointer?, pdeltaticket: COpaquePointer?, scope: EPrintTicketScope, presultticket: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket((hprovider?.value ?: 0L).toString(), (pbaseticket?.value ?: 0L).toString(), (pdeltaticket?.value ?: 0L).toString(), scope, (presultticket?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider((pszprintername?.value ?: 0L).toString(), dwversion.toInt(), (phprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: COpaquePointer?, pusedversion: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx((pszprintername?.value ?: 0L).toString(), dwmaxversion.toInt(), dwprefversion.toInt(), (phprovider?.value ?: 0L).toString(), (pusedversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport((pszprintername?.value ?: 0L).toString(), (pmaxversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTReleaseMemory(pbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAvailable) _wasm_windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory((pbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
