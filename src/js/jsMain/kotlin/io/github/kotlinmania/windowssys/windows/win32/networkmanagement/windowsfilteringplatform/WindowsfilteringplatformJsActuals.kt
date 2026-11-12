@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle.rawAddress.toString(), callout.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle.rawAddress.toString(), id.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle.rawAddress.toString(), id.toInt(), callout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr, callout: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), callout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmCalloutChangeCallback0, context: ConstPtr, changehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle.rawAddress.toString(), id.toString(), connection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionSubscribe0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmConnectionCallback0, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(enginehandle.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmDynamicKeywordSubscribe0(flags: UInt, callback: FwpmDynamicKeywordCallback0, context: ConstPtr, subscriptionhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(flags.toInt(), 0L.toString(), context.rawAddress.toString(), subscriptionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(subscriptionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineClose0(enginehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle.rawAddress.toString(), option, value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr, session: ConstPtr, enginehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername.rawAddress.toString(), authnservice.toInt(), authidentity.rawAddress.toString(), session.rawAddress.toString(), enginehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle.rawAddress.toString(), option, newvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle.rawAddress.toString(), filter.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle.rawAddress.toString(), id.toString(), filter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr, filter: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), filter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmFilterChangeCallback0, context: ConstPtr, changehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFreeMemory0(p: MutPtr) {
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) {
        windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fwpmGetAppIdFromFileName0(filename: Pcwstr, appid: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(filename.rawAddress.toString(), appid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), sd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, keymodkey: ConstPtr, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, keymodkey: ConstPtr, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr, tunnelpolicy: ConstPtr, numfilterconditions: UInt, filterconditions: ConstPtr, keymodkey: ConstPtr, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle.rawAddress.toString(), id.toInt(), layer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr, layer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), layer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmNetEventCallback0, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe1(enginehandle: Handle, subscription: ConstPtr, callback: FwpmNetEventCallback1, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe2(enginehandle: Handle, subscription: ConstPtr, callback: FwpmNetEventCallback2, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe3(enginehandle: Handle, subscription: ConstPtr, callback: FwpmNetEventCallback3, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscribe4(enginehandle: Handle, subscription: ConstPtr, callback: FwpmNetEventCallback4, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(enginehandle.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle.rawAddress.toString(), provider.rawAddress.toString(), sd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr, sd: PsecurityDescriptor, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr, providercontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmProviderContextChangeCallback0, context: ConstPtr, changehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr, provider: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), provider.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmProviderChangeCallback0, context: ConstPtr, changehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr, sd: PsecurityDescriptor): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle.rawAddress.toString(), sublayer.rawAddress.toString(), sd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr, sublayer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), sublayer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmSublayerChangeCallback0, context: ConstPtr, changehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(enginehandle.rawAddress.toString(), changehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSystemPortsGet0(enginehandle: Handle, sysports: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(enginehandle.rawAddress.toString(), sysports.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSystemPortsSubscribe0(enginehandle: Handle, reserved: ConstPtr, callback: FwpmSystemPortsCallback0, context: ConstPtr, sysportshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(enginehandle.rawAddress.toString(), reserved.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), sysportshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSystemPortsUnsubscribe0(enginehandle: Handle, sysportshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(enginehandle.rawAddress.toString(), sysportshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionAbort0(enginehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionCommit0(enginehandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventSubscribe0(enginehandle: Handle, subscription: ConstPtr, callback: FwpmVswitchEventCallback0, context: ConstPtr, subscriptionhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), subscriptionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventUnsubscribe0(enginehandle: Handle, subscriptionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(enginehandle.rawAddress.toString(), subscriptionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle.rawAddress.toString(), idpstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerAddAndRegister0(enginehandle: Handle, keymanager: ConstPtr, keymanagercallbacks: ConstPtr, keymgmthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(enginehandle.rawAddress.toString(), keymanager.rawAddress.toString(), keymanagercallbacks.rawAddress.toString(), keymgmthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Handle, reserved: ConstPtr, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), reserved.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Handle, reserved: ConstPtr, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), reserved.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagerUnregisterAndDelete0(enginehandle: Handle, keymgmthandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(enginehandle.rawAddress.toString(), keymgmthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecKeyManagersGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr, inboundfilterid: MutPtr, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr, virtualiftunnelinfo: ConstPtr, inboundfilterid: MutPtr, id: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), virtualiftunnelinfo.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle.rawAddress.toString(), id.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr, inboundspi: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr, inboundspi: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr, inboundspi: UInt): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSubscribe0(enginehandle: Handle, subscription: ConstPtr, callback: IpsecSaContextCallback0, context: ConstPtr, eventshandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(enginehandle.rawAddress.toString(), subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSubscriptionsGet0(enginehandle: Handle, entries: MutPtr, numentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(enginehandle.rawAddress.toString(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(enginehandle.rawAddress.toString(), eventshandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle.rawAddress.toString(), flags.toString(), newvalues.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr, enumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr, sidgroup: MutPtr, dacl: MutPtr, sacl: MutPtr, securitydescriptor: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr, sidgroup: ConstPtr, dacl: ConstPtr, sacl: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr, numentriesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle.rawAddress.toString(), id.toString(), sa.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr, sa: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr, sa: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWin32NetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
