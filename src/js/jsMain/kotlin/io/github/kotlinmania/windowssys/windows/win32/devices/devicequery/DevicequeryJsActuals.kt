@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

private val windowsWin32DevicesDevicequeryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    if (windowsWin32DevicesDevicequeryNapiAddon != null) {
        windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype, pszzobjectids.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phdevquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devFindProperty(pkey: ConstPtr, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr): MutPtr =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) MutPtr((windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey.rawAddress.toString(), store, pszlocalename.rawAddress.toString(), cproperties.toInt(), pproperties.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr) {
    if (windowsWin32DevicesDevicequeryNapiAddon != null) {
        windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount.toInt(), pproperties.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr) {
    if (windowsWin32DevicesDevicequeryNapiAddon != null) {
        windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount.toInt(), pobjects.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), pcpropertycount.rawAddress.toString(), ppproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype, pszobjectid.rawAddress.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), pcpropertycount.rawAddress.toString(), ppproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), pcobjectcount.rawAddress.toString(), ppobjects.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    if (windowsWin32DevicesDevicequeryNapiAddon != null) (windowsWin32DevicesDevicequeryNapiAddon.windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress.toString(), cfilterexpressioncount.toInt(), pfilter.rawAddress.toString(), cextendedparametercount.toInt(), pextendedparameters.rawAddress.toString(), pcobjectcount.rawAddress.toString(), ppobjects.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
