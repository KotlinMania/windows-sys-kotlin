@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32GraphicsPrintingPrintticketNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(hprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: ConstPtr, scope: EPrintTicketScope, pprintticket: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(hprovider.rawAddress.toString(), cbdevmode.toInt(), pdevmode.rawAddress.toString(), scope, pprintticket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: MutPtr, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: MutPtr, ppdevmode: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(hprovider.rawAddress.toString(), pprintticket.rawAddress.toString(), basedevmodetype, scope, pcbdevmode.rawAddress.toString(), ppdevmode.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: MutPtr, pcapabilities: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(hprovider.rawAddress.toString(), pprintticket.rawAddress.toString(), pcapabilities.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: MutPtr, pdevicecapabilities: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(hprovider.rawAddress.toString(), pprintticket.rawAddress.toString(), pdevicecapabilities.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: MutPtr, pdeviceresources: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(hprovider.rawAddress.toString(), pszlocalename.rawAddress.toString(), pprintticket.rawAddress.toString(), pdeviceresources.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: MutPtr, pdeltaticket: MutPtr, scope: EPrintTicketScope, presultticket: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(hprovider.rawAddress.toString(), pbaseticket.rawAddress.toString(), pdeltaticket.rawAddress.toString(), scope, presultticket.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(pszprintername.rawAddress.toString(), dwversion.toInt(), phprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: MutPtr, pusedversion: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(pszprintername.rawAddress.toString(), dwmaxversion.toInt(), dwprefversion.toInt(), phprovider.rawAddress.toString(), pusedversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(pszprintername.rawAddress.toString(), pmaxversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTReleaseMemory(pbuffer: ConstPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAddon != null) (windowsWin32GraphicsPrintingPrintticketNapiAddon.windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
