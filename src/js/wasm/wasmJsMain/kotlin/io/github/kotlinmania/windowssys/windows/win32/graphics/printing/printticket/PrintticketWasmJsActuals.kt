@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GraphicsPrintingPrintticketNapiAddon(): Boolean

private val windowsWin32GraphicsPrintingPrintticketNapiAvailable: Boolean = initWindowsWin32GraphicsPrintingPrintticketNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(p0: String): Int

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(hprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: ConstPtr, scope: EPrintTicketScope, pprintticket: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(hprovider.rawAddress.toString(), cbdevmode.toInt(), pdevmode.rawAddress.toString(), scope, pprintticket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: MutPtr, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: MutPtr, ppdevmode: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(hprovider.rawAddress.toString(), pprintticket.rawAddress.toString(), basedevmodetype, scope, pcbdevmode.rawAddress.toString(), ppdevmode.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: MutPtr, pcapabilities: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(hprovider.rawAddress.toString(), pprintticket.rawAddress.toString(), pcapabilities.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: MutPtr, pdevicecapabilities: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(hprovider.rawAddress.toString(), pprintticket.rawAddress.toString(), pdevicecapabilities.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: MutPtr, pdeviceresources: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(hprovider.rawAddress.toString(), pszlocalename.rawAddress.toString(), pprintticket.rawAddress.toString(), pdeviceresources.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: MutPtr, pdeltaticket: MutPtr, scope: EPrintTicketScope, presultticket: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(hprovider.rawAddress.toString(), pbaseticket.rawAddress.toString(), pdeltaticket.rawAddress.toString(), scope, presultticket.rawAddress.toString(), pbstrerrormessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(pszprintername.rawAddress.toString(), dwversion.toInt(), phprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: MutPtr, pusedversion: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(pszprintername.rawAddress.toString(), dwmaxversion.toInt(), dwprefversion.toInt(), phprovider.rawAddress.toString(), pusedversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: MutPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(pszprintername.rawAddress.toString(), pmaxversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pTReleaseMemory(pbuffer: ConstPtr): Hresult =
    if (windowsWin32GraphicsPrintingPrintticketNapiAvailable) wasmWindowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
