@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32SystemEventcollectorNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ecClose(obj: Long): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcClose(obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(subscriptionname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(subscriptionenum.toString(), subscriptionnamebuffersize.toInt(), subscriptionnamebuffer.rawAddress.toString(), subscriptionnamebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(objectarray.toString(), objectarraysize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: MutPtr, statusvaluebufferused: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(subscriptionname.rawAddress.toString(), statusinfoid, eventsourcename.rawAddress.toString(), flags.toInt(), statusvaluebuffersize.toInt(), statusvaluebuffer.rawAddress.toString(), statusvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray.toString(), arrayindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(subscriptionname.rawAddress.toString(), accessmask.toInt(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray.toString(), arrayindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(subscriptionname.rawAddress.toString(), eventsourcename.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: MutPtr): Bool =
    if (windowsWin32SystemEventcollectorNapiAddon != null) (windowsWin32SystemEventcollectorNapiAddon.windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
