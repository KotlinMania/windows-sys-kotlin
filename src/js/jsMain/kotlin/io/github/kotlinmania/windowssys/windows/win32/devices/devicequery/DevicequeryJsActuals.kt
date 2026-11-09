@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.DEVPROPSTORE

private val _windowsWin32DevicesDevicequeryNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun DevCloseObjectQuery(hdevquery: HDEVQUERY) {
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) {
        _windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCloseObjectQuery(hdevquery.toString())
    }
}

public actual fun DevCreateObjectQuery(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), pcallback.toLong().toString(), pcontext.toString(), phdevquery.toString()) as Int) else 0

public actual fun DevCreateObjectQueryEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), cextendedparametercount.toInt(), pextendedparameters.toString(), pcallback.toLong().toString(), pcontext.toString(), phdevquery.toString()) as Int) else 0

public actual fun DevCreateObjectQueryFromId(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromId(objecttype, pszobjectid.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), pcallback.toLong().toString(), pcontext.toString(), phdevquery.toString()) as Int) else 0

public actual fun DevCreateObjectQueryFromIdEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdEx(objecttype, pszobjectid.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), cextendedparametercount.toInt(), pextendedparameters.toString(), pcallback.toLong().toString(), pcontext.toString(), phdevquery.toString()) as Int) else 0

public actual fun DevCreateObjectQueryFromIds(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIds(objecttype, pszzobjectids.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), pcallback.toLong().toString(), pcontext.toString(), phdevquery.toString()) as Int) else 0

public actual fun DevCreateObjectQueryFromIdsEx(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), cextendedparametercount.toInt(), pextendedparameters.toString(), pcallback.toLong().toString(), pcontext.toString(), phdevquery.toString()) as Int) else 0

public actual fun DevFindProperty(pkey: Long, store: DEVPROPSTORE, pszlocalename: PCWSTR, cproperties: UInt, pproperties: Long): Long =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevFindProperty(pkey.toString(), store, pszlocalename.toString(), cproperties.toInt(), pproperties.toString()) as String).toLong() else 0L

public actual fun DevFreeObjectProperties(cpropertycount: UInt, pproperties: Long) {
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) {
        _windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevFreeObjectProperties(cpropertycount.toInt(), pproperties.toString())
    }
}

public actual fun DevFreeObjects(cobjectcount: UInt, pobjects: Long) {
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) {
        _windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevFreeObjects(cobjectcount.toInt(), pobjects.toString())
    }
}

public actual fun DevGetObjectProperties(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevGetObjectProperties(objecttype, pszobjectid.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), pcpropertycount.toString(), ppproperties.toString()) as Int) else 0

public actual fun DevGetObjectPropertiesEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevGetObjectPropertiesEx(objecttype, pszobjectid.toString(), queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cextendedparametercount.toInt(), pextendedparameters.toString(), pcpropertycount.toString(), ppproperties.toString()) as Int) else 0

public actual fun DevGetObjects(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), pcobjectcount.toString(), ppobjects.toString()) as Int) else 0

public actual fun DevGetObjectsEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    if (_windowsWin32DevicesDevicequeryNapiAddon != null) (_windowsWin32DevicesDevicequeryNapiAddon.windowssys_windows_win32_devices_devicequery_DevGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.toString(), cfilterexpressioncount.toInt(), pfilter.toString(), cextendedparametercount.toInt(), pextendedparameters.toString(), pcobjectcount.toString(), ppobjects.toString()) as Int) else 0
