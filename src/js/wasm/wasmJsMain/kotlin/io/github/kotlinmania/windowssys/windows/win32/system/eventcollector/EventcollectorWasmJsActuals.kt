@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemEventcollectorNapiAddon(): Boolean

private val _windowsWin32SystemEventcollectorNapiAvailable: Boolean = _initWindowsWin32SystemEventcollectorNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecClose(p0)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecDeleteSubscription(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecDeleteSubscription(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecOpenSubscription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecOpenSubscription(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum(p0)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecRetrySubscription(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecRetrySubscription(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecSaveSubscription(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecSaveSubscription(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty(p0: String, p1: Int, p2: Int, p3: String): Int

public actual fun ecClose(obj: Long): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecClose(obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecDeleteSubscription((subscriptionname?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription(subscriptionenum.toString(), subscriptionnamebuffersize.toInt(), (subscriptionnamebuffer?.value ?: 0L).toString(), (subscriptionnamebufferused?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize(objectarray.toString(), (objectarraysize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: COpaquePointer?, statusvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus((subscriptionname?.value ?: 0L).toString(), statusinfoid, (eventsourcename?.value ?: 0L).toString(), flags.toInt(), statusvaluebuffersize.toInt(), (statusvaluebuffer?.value ?: 0L).toString(), (statusvaluebufferused?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement(objectarray.toString(), arrayindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecOpenSubscription((subscriptionname?.value ?: 0L).toString(), accessmask.toInt(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum(flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement(objectarray.toString(), arrayindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecRetrySubscription((subscriptionname?.value ?: 0L).toString(), (eventsourcename?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecSaveSubscription(subscription.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), (propertyvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventcollectorNapiAvailable) _wasm_windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), (propertyvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
