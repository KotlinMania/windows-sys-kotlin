@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32GraphicsPrintingPrintticketNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider((hprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: COpaquePointer?, scope: EPrintTicketScope, pprintticket: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket((hprovider?.value ?: 0L).toString(), cbdevmode.toInt(), (pdevmode?.value ?: 0L).toString(), scope, (pprintticket?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: COpaquePointer?, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: COpaquePointer?, ppdevmode: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode((hprovider?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), basedevmodetype, scope, (pcbdevmode?.value ?: 0L).toString(), (ppdevmode?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pcapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities((hprovider?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), (pcapabilities?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pdevicecapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities((hprovider?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), (pdevicecapabilities?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: COpaquePointer?, pdeviceresources: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources((hprovider?.value ?: 0L).toString(), (pszlocalename?.value ?: 0L).toString(), (pprintticket?.value ?: 0L).toString(), (pdeviceresources?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: COpaquePointer?, pdeltaticket: COpaquePointer?, scope: EPrintTicketScope, presultticket: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket((hprovider?.value ?: 0L).toString(), (pbaseticket?.value ?: 0L).toString(), (pdeltaticket?.value ?: 0L).toString(), scope, (presultticket?.value ?: 0L).toString(), (pbstrerrormessage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider((pszprintername?.value ?: 0L).toString(), dwversion.toInt(), (phprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: COpaquePointer?, pusedversion: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx((pszprintername?.value ?: 0L).toString(), dwmaxversion.toInt(), dwprefversion.toInt(), (phprovider?.value ?: 0L).toString(), (pusedversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport((pszprintername?.value ?: 0L).toString(), (pmaxversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTReleaseMemory(pbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory((pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
