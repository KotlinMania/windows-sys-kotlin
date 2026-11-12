@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemEventcollectorNapiAddon(): Boolean

private val windowsWin32SystemEventcollectorNapiAvailable: Boolean = initWindowsWin32SystemEventcollectorNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcOpenSubscription(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcRetrySubscription(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcSaveSubscription(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(p0: String, p1: Int, p2: Int, p3: String): Int

public actual fun ecClose(obj: Long): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcClose(obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(subscriptionname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(subscriptionenum.toString(), subscriptionnamebuffersize.toInt(), subscriptionnamebuffer.rawAddress.toString(), subscriptionnamebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(objectarray.toString(), objectarraysize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: MutPtr, statusvaluebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(subscriptionname.rawAddress.toString(), statusinfoid, eventsourcename.rawAddress.toString(), flags.toInt(), statusvaluebuffersize.toInt(), statusvaluebuffer.rawAddress.toString(), statusvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray.toString(), arrayindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcOpenSubscription(subscriptionname.rawAddress.toString(), accessmask.toInt(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray.toString(), arrayindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcRetrySubscription(subscriptionname.rawAddress.toString(), eventsourcename.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAvailable) wasmWindowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
