@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.DEVPROPSTORE

private object WindowsWin32DevicesDevicequeryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCloseObjectQuery(hdevquery: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCreateObjectQuery(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromId(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIds(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdsEx(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevFindProperty(pkey: Long, store: Int, pszlocalename: Long, cproperties: Int, pproperties: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevFreeObjectProperties(cpropertycount: Int, pproperties: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevFreeObjects(cobjectcount: Int, pobjects: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevGetObjectProperties(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevGetObjectPropertiesEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cextendedparametercount: Int, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevGetObjects(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcobjectcount: Long, ppobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_DevGetObjectsEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): Int
}

public actual fun DevCloseObjectQuery(hdevquery: HDEVQUERY) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCloseObjectQuery(hdevquery)
}

public actual fun DevCreateObjectQuery(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, pcallback.toLong(), pcontext, phdevquery)

public actual fun DevCreateObjectQueryEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, cextendedparametercount.toInt(), pextendedparameters, pcallback.toLong(), pcontext, phdevquery)

public actual fun DevCreateObjectQueryFromId(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromId(objecttype, pszobjectid, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, pcallback.toLong(), pcontext, phdevquery)

public actual fun DevCreateObjectQueryFromIdEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdEx(objecttype, pszobjectid, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, cextendedparametercount.toInt(), pextendedparameters, pcallback.toLong(), pcontext, phdevquery)

public actual fun DevCreateObjectQueryFromIds(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIds(objecttype, pszzobjectids, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, pcallback.toLong(), pcontext, phdevquery)

public actual fun DevCreateObjectQueryFromIdsEx(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, cextendedparametercount.toInt(), pextendedparameters, pcallback.toLong(), pcontext, phdevquery)

public actual fun DevFindProperty(pkey: Long, store: DEVPROPSTORE, pszlocalename: PCWSTR, cproperties: UInt, pproperties: Long): Long =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevFindProperty(pkey, store, pszlocalename, cproperties.toInt(), pproperties)

public actual fun DevFreeObjectProperties(cpropertycount: UInt, pproperties: Long) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevFreeObjectProperties(cpropertycount.toInt(), pproperties)
}

public actual fun DevFreeObjects(cobjectcount: UInt, pobjects: Long) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevFreeObjects(cobjectcount.toInt(), pobjects)
}

public actual fun DevGetObjectProperties(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevGetObjectProperties(objecttype, pszobjectid, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, pcpropertycount, ppproperties)

public actual fun DevGetObjectPropertiesEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevGetObjectPropertiesEx(objecttype, pszobjectid, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cextendedparametercount.toInt(), pextendedparameters, pcpropertycount, ppproperties)

public actual fun DevGetObjects(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, pcobjectcount, ppobjects)

public actual fun DevGetObjectsEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_DevGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties, cfilterexpressioncount.toInt(), pfilter, cextendedparametercount.toInt(), pextendedparameters, pcobjectcount, ppobjects)
