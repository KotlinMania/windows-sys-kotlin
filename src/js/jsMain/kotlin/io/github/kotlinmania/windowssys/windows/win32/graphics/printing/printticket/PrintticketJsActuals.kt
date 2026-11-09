@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32GraphicsPrintingPrintticketNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun PTCloseProvider(hprovider: HPTPROVIDER): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTCloseProvider(hprovider.toString()) as Int) else 0

public actual fun PTConvertDevModeToPrintTicket(hprovider: HPTPROVIDER, cbdevmode: UInt, pdevmode: Long, scope: EPrintTicketScope, pprintticket: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTConvertDevModeToPrintTicket(hprovider.toString(), cbdevmode.toInt(), pdevmode.toString(), scope, pprintticket.toString()) as Int) else 0

public actual fun PTConvertPrintTicketToDevMode(hprovider: HPTPROVIDER, pprintticket: Long, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTConvertPrintTicketToDevMode(hprovider.toString(), pprintticket.toString(), basedevmodetype, scope, pcbdevmode.toString(), ppdevmode.toString(), pbstrerrormessage.toString()) as Int) else 0

public actual fun PTGetPrintCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintCapabilities(hprovider.toString(), pprintticket.toString(), pcapabilities.toString(), pbstrerrormessage.toString()) as Int) else 0

public actual fun PTGetPrintDeviceCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceCapabilities(hprovider.toString(), pprintticket.toString(), pdevicecapabilities.toString(), pbstrerrormessage.toString()) as Int) else 0

public actual fun PTGetPrintDeviceResources(hprovider: HPTPROVIDER, pszlocalename: PCWSTR, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceResources(hprovider.toString(), pszlocalename.toString(), pprintticket.toString(), pdeviceresources.toString(), pbstrerrormessage.toString()) as Int) else 0

public actual fun PTMergeAndValidatePrintTicket(hprovider: HPTPROVIDER, pbaseticket: Long, pdeltaticket: Long, scope: EPrintTicketScope, presultticket: Long, pbstrerrormessage: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTMergeAndValidatePrintTicket(hprovider.toString(), pbaseticket.toString(), pdeltaticket.toString(), scope, presultticket.toString(), pbstrerrormessage.toString()) as Int) else 0

public actual fun PTOpenProvider(pszprintername: PCWSTR, dwversion: UInt, phprovider: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTOpenProvider(pszprintername.toString(), dwversion.toInt(), phprovider.toString()) as Int) else 0

public actual fun PTOpenProviderEx(pszprintername: PCWSTR, dwmaxversion: UInt, dwprefversion: UInt, phprovider: Long, pusedversion: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTOpenProviderEx(pszprintername.toString(), dwmaxversion.toInt(), dwprefversion.toInt(), phprovider.toString(), pusedversion.toString()) as Int) else 0

public actual fun PTQuerySchemaVersionSupport(pszprintername: PCWSTR, pmaxversion: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTQuerySchemaVersionSupport(pszprintername.toString(), pmaxversion.toString()) as Int) else 0

public actual fun PTReleaseMemory(pbuffer: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (_windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssys_windows_win32_graphics_printing_printticket_PTReleaseMemory(pbuffer.toString()) as Int) else 0
