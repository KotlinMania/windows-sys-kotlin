@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesFaxNapiAddon(): Boolean

private val windowsWin32DevicesFaxNapiAvailable: Boolean = initWindowsWin32DevicesFaxNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient()")
private external fun wasmWindowssysWindowsWin32DevicesFaxCanSendToFaxRecipient(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxAbort(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxAbort(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxAccessCheck(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxAccessCheck(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumJobsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumJobsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumJobsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumJobsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumPortsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumPortsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumPortsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumPortsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxFreeBuffer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetConfigurationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetConfigurationW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetJobA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetJobA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetJobW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetJobW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetPageData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetPageData(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetPortA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetPortA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetPortW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetPortW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxOpenPort(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxOpenPort(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSendDocumentA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSendDocumentW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetConfigurationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetConfigurationW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetJobA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetJobA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetJobW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetJobW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetPortA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetPortA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetPortW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetPortW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxStartPrintJobA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxStartPrintJobW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(p0)")
private external fun wasmWindowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxSendToFaxRecipient(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesFaxSendToFaxRecipient(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesFaxStiCreateInstanceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesFaxStiCreateInstanceW(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun canSendToFaxRecipient(): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxCanSendToFaxRecipient() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxAbort(faxhandle.rawAddress.toString(), jobid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxAccessCheck(faxhandle.rawAddress.toString(), accessmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxClose(faxhandle: Handle): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxClose(faxhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxCompleteJobParamsA(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxCompleteJobParamsW(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(machinename.rawAddress.toString(), faxhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(machinename.rawAddress.toString(), faxhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), enabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), enabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString(), methodsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString(), methodsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumJobsA(faxhandle.rawAddress.toString(), jobentry.rawAddress.toString(), jobsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumJobsW(faxhandle.rawAddress.toString(), jobentry.rawAddress.toString(), jobsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumPortsA(faxhandle.rawAddress.toString(), portinfo.rawAddress.toString(), portsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumPortsW(faxhandle.rawAddress.toString(), portinfo.rawAddress.toString(), portsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(faxporthandle.rawAddress.toString(), routingmethod.rawAddress.toString(), methodsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(faxporthandle.rawAddress.toString(), routingmethod.rawAddress.toString(), methodsreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxFreeBuffer(buffer: MutPtr<CVoid>) {
    if (windowsWin32DevicesFaxNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesFaxFaxFreeBuffer(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetConfigurationA(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetConfigurationW(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(faxporthandle.rawAddress.toString(), devicestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(faxporthandle.rawAddress.toString(), devicestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetJobA(faxhandle.rawAddress.toString(), jobid.toInt(), jobentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetJobW(faxhandle.rawAddress.toString(), jobid.toInt(), jobentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetPageData(faxhandle.rawAddress.toString(), jobid.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString(), imagewidth.rawAddress.toString(), imageheight.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetPortA(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetPortW(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(faxhandle.rawAddress.toString(), completionport.rawAddress.toString(), completionkey.toString(), hwnd.rawAddress.toString(), messagestart.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxOpenPort(faxhandle.rawAddress.toString(), deviceid.toInt(), flags.toInt(), faxporthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxPrintCoverPageA(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(faxcontextinfo.rawAddress.toString(), coverpageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxPrintCoverPageW(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(faxcontextinfo.rawAddress.toString(), coverpageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(faxhandle.rawAddress.toString(), extensionname.rawAddress.toString(), friendlyname.rawAddress.toString(), imagename.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(deviceprovider.rawAddress.toString(), friendlyname.rawAddress.toString(), imagename.rawAddress.toString(), tspname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentA(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString(), faxjobid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), faxjobid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), faxjobid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSendDocumentW(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString(), faxjobid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetConfigurationA(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetConfigurationW(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetJobA(faxhandle.rawAddress.toString(), jobid.toInt(), command.toInt(), jobentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetJobW(faxhandle.rawAddress.toString(), jobid.toInt(), command.toInt(), jobentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetPortA(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetPortW(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxStartPrintJobA(printername.rawAddress.toString(), printinfo.rawAddress.toString(), faxjobid.rawAddress.toString(), faxcontextinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxStartPrintJobW(printername.rawAddress.toString(), printinfo.rawAddress.toString(), faxjobid.rawAddress.toString(), faxcontextinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(deviceprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxSendToFaxRecipient(sndmode, lpfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult =
    if (windowsWin32DevicesFaxNapiAvailable) wasmWindowssysWindowsWin32DevicesFaxStiCreateInstanceW(hinst.rawAddress.toString(), dwver.toInt(), ppsti.rawAddress.toString(), punkouter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
