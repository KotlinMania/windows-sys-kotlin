@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropcompkey
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesDevicequeryNapiAddon(): Boolean

private val windowsWin32DevicesDevicequeryNapiAvailable: Boolean = initWindowsWin32DevicesDevicequeryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevFindProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevFindProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevFreeObjects(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevGetObjects(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjects(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    if (windowsWin32DevicesDevicequeryNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype, pszzobjectids.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devFindProperty(pkey: ConstPtr<Devpropkey>, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr<Devproperty>): MutPtr<Devproperty> =
    if (windowsWin32DevicesDevicequeryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey.rawAddress.toString(), store, pszlocalename.rawAddress.toString(), cproperties.toInt(), pproperties.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr<Devproperty>) {
    if (windowsWin32DevicesDevicequeryNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount.toInt(), pproperties.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr<DevObject>) {
    if (windowsWin32DevicesDevicequeryNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount.toInt(), pobjects.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), pcpropertycount.rawAddress.toString(), ppproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), pcpropertycount.rawAddress.toString(), ppproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), pcobjectcount.rawAddress.toString(), ppobjects.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAvailable) wasmWindowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), pcobjectcount.rawAddress.toString(), ppobjects.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
