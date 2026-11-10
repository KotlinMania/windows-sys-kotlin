@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesFaxNapiAddon(): Boolean

private val _windowsWin32DevicesFaxNapiAvailable: Boolean = _initWindowsWin32DevicesFaxNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_canSendToFaxRecipient()")
private external fun _wasm_windowssys_windows_win32_devices_fax_canSendToFaxRecipient(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxAbort(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxAbort(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxAccessCheck(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxAccessCheck(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxClose(p0)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxCompleteJobParamsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxCompleteJobParamsA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxCompleteJobParamsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxCompleteJobParamsW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxConnectFaxServerA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxConnectFaxServerA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxConnectFaxServerW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxConnectFaxServerW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumJobsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumJobsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumJobsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumJobsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumPortsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumPortsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumPortsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumPortsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxFreeBuffer(p0)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxFreeBuffer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetConfigurationA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetConfigurationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetConfigurationW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetConfigurationW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetDeviceStatusA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetDeviceStatusA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetDeviceStatusW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetDeviceStatusW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetJobA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetJobA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetJobW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetJobW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetPageData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetPageData(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetPortA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetPortA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetPortW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetPortW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetRoutingInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetRoutingInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxGetRoutingInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxGetRoutingInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxInitializeEventQueue(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxInitializeEventQueue(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxOpenPort(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxOpenPort(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxPrintCoverPageA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxPrintCoverPageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxPrintCoverPageW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxPrintCoverPageW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSendDocumentA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSendDocumentW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetConfigurationA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetConfigurationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetConfigurationW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetConfigurationW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetJobA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetJobA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetJobW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetJobW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetPortA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetPortA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetPortW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetPortW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetRoutingInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetRoutingInfoA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxSetRoutingInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxSetRoutingInfoW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxStartPrintJobA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxStartPrintJobA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxStartPrintJobW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxStartPrintJobW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW(p0)")
private external fun _wasm_windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_sendToFaxRecipient(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_fax_sendToFaxRecipient(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_fax_stiCreateInstanceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_fax_stiCreateInstanceW(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun canSendToFaxRecipient(): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_canSendToFaxRecipient() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxAbort((faxhandle?.value ?: 0L).toString(), jobid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxAccessCheck((faxhandle?.value ?: 0L).toString(), accessmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxClose(faxhandle: Handle): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxClose((faxhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxCompleteJobParamsA(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxCompleteJobParamsA((jobparams?.value ?: 0L).toString(), (coverpageinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxCompleteJobParamsW(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxCompleteJobParamsW((jobparams?.value ?: 0L).toString(), (coverpageinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxConnectFaxServerA((machinename?.value ?: 0L).toString(), (faxhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxConnectFaxServerW((machinename?.value ?: 0L).toString(), (faxhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA((faxporthandle?.value ?: 0L).toString(), (routingguid?.value ?: 0L).toString(), enabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW((faxporthandle?.value ?: 0L).toString(), (routingguid?.value ?: 0L).toString(), enabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA((faxhandle?.value ?: 0L).toString(), (routinginfo?.value ?: 0L).toString(), (methodsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW((faxhandle?.value ?: 0L).toString(), (routinginfo?.value ?: 0L).toString(), (methodsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumJobsA((faxhandle?.value ?: 0L).toString(), (jobentry?.value ?: 0L).toString(), (jobsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumJobsW((faxhandle?.value ?: 0L).toString(), (jobentry?.value ?: 0L).toString(), (jobsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumPortsA((faxhandle?.value ?: 0L).toString(), (portinfo?.value ?: 0L).toString(), (portsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumPortsW((faxhandle?.value ?: 0L).toString(), (portinfo?.value ?: 0L).toString(), (portsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA((faxporthandle?.value ?: 0L).toString(), (routingmethod?.value ?: 0L).toString(), (methodsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW((faxporthandle?.value ?: 0L).toString(), (routingmethod?.value ?: 0L).toString(), (methodsreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxFreeBuffer(buffer: COpaquePointer?) {
    if (_windowsWin32DevicesFaxNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_fax_faxFreeBuffer((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetConfigurationA((faxhandle?.value ?: 0L).toString(), (faxconfig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetConfigurationW((faxhandle?.value ?: 0L).toString(), (faxconfig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetDeviceStatusA((faxporthandle?.value ?: 0L).toString(), (devicestatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetDeviceStatusW((faxporthandle?.value ?: 0L).toString(), (devicestatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetJobA((faxhandle?.value ?: 0L).toString(), jobid.toInt(), (jobentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetJobW((faxhandle?.value ?: 0L).toString(), jobid.toInt(), (jobentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA((faxhandle?.value ?: 0L).toString(), (categories?.value ?: 0L).toString(), (numbercategories?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW((faxhandle?.value ?: 0L).toString(), (categories?.value ?: 0L).toString(), (numbercategories?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?, imagewidth: COpaquePointer?, imageheight: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetPageData((faxhandle?.value ?: 0L).toString(), jobid.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (imagewidth?.value ?: 0L).toString(), (imageheight?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetPortA((faxporthandle?.value ?: 0L).toString(), (portinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetPortW((faxporthandle?.value ?: 0L).toString(), (portinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetRoutingInfoA((faxporthandle?.value ?: 0L).toString(), (routingguid?.value ?: 0L).toString(), (routinginfobuffer?.value ?: 0L).toString(), (routinginfobuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxGetRoutingInfoW((faxporthandle?.value ?: 0L).toString(), (routingguid?.value ?: 0L).toString(), (routinginfobuffer?.value ?: 0L).toString(), (routinginfobuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxInitializeEventQueue((faxhandle?.value ?: 0L).toString(), (completionport?.value ?: 0L).toString(), completionkey.toString(), (hwnd?.value ?: 0L).toString(), messagestart.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxOpenPort((faxhandle?.value ?: 0L).toString(), deviceid.toInt(), flags.toInt(), (faxporthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxPrintCoverPageA(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxPrintCoverPageA((faxcontextinfo?.value ?: 0L).toString(), (coverpageinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxPrintCoverPageW(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxPrintCoverPageW((faxcontextinfo?.value ?: 0L).toString(), (coverpageinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW((faxhandle?.value ?: 0L).toString(), (extensionname?.value ?: 0L).toString(), (friendlyname?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW((deviceprovider?.value ?: 0L).toString(), (friendlyname?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), (tspname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentA((faxhandle?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (jobparams?.value ?: 0L).toString(), (coverpageinfo?.value ?: 0L).toString(), (faxjobid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbacka, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA((faxhandle?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (faxjobid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbackw, context: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW((faxhandle?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (faxjobid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSendDocumentW((faxhandle?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (jobparams?.value ?: 0L).toString(), (coverpageinfo?.value ?: 0L).toString(), (faxjobid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetConfigurationA((faxhandle?.value ?: 0L).toString(), (faxconfig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetConfigurationW((faxhandle?.value ?: 0L).toString(), (faxconfig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA((faxhandle?.value ?: 0L).toString(), (routinginfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW((faxhandle?.value ?: 0L).toString(), (routinginfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetJobA((faxhandle?.value ?: 0L).toString(), jobid.toInt(), command.toInt(), (jobentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetJobW((faxhandle?.value ?: 0L).toString(), jobid.toInt(), command.toInt(), (jobentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA((faxhandle?.value ?: 0L).toString(), (categories?.value ?: 0L).toString(), numbercategories.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW((faxhandle?.value ?: 0L).toString(), (categories?.value ?: 0L).toString(), numbercategories.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetPortA((faxporthandle?.value ?: 0L).toString(), (portinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetPortW((faxporthandle?.value ?: 0L).toString(), (portinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetRoutingInfoA((faxporthandle?.value ?: 0L).toString(), (routingguid?.value ?: 0L).toString(), (routinginfobuffer?.value ?: 0L).toString(), routinginfobuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxSetRoutingInfoW((faxporthandle?.value ?: 0L).toString(), (routingguid?.value ?: 0L).toString(), (routinginfobuffer?.value ?: 0L).toString(), routinginfobuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxStartPrintJobA((printername?.value ?: 0L).toString(), (printinfo?.value ?: 0L).toString(), (faxjobid?.value ?: 0L).toString(), (faxcontextinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxStartPrintJobW((printername?.value ?: 0L).toString(), (printinfo?.value ?: 0L).toString(), (faxjobid?.value ?: 0L).toString(), (faxcontextinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW((deviceprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_sendToFaxRecipient(sndmode, (lpfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesFaxNapiAvailable) _wasm_windowssys_windows_win32_devices_fax_stiCreateInstanceW((hinst?.value ?: 0L).toString(), dwver.toInt(), (ppsti?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
