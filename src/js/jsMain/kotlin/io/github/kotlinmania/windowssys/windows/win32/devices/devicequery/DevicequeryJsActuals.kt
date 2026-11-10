@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

private val _windowsWin32DevicesDevicequeryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) {
        _windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCloseObjectQuery((hdevquery?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phdevquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phdevquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromId(objecttype, (pszobjectid?.value ?: 0L).toString(), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phdevquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdEx(objecttype, (pszobjectid?.value ?: 0L).toString(), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phdevquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIds(objecttype, (pszzobjectids?.value ?: 0L).toString(), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phdevquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdsEx(objecttype, (pszzobjectids?.value ?: 0L).toString(), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phdevquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devFindProperty(pkey: COpaquePointer?, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devFindProperty((pkey?.value ?: 0L).toString(), store, (pszlocalename?.value ?: 0L).toString(), cproperties.toInt(), (pproperties?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: COpaquePointer?) {
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) {
        _windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devFreeObjectProperties(cpropertycount.toInt(), (pproperties?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: COpaquePointer?) {
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) {
        _windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devFreeObjects(cobjectcount.toInt(), (pobjects?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devGetObjectProperties(objecttype, (pszobjectid?.value ?: 0L).toString(), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), (pcpropertycount?.value ?: 0L).toString(), (ppproperties?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devGetObjectPropertiesEx(objecttype, (pszobjectid?.value ?: 0L).toString(), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L).toString(), (pcpropertycount?.value ?: 0L).toString(), (ppproperties?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), (pcobjectcount?.value ?: 0L).toString(), (ppobjects?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_devGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L).toString(), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L).toString(), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L).toString(), (pcobjectcount?.value ?: 0L).toString(), (ppobjects?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
