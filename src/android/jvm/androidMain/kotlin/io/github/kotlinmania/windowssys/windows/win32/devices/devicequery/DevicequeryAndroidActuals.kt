@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

private object WindowsWin32DevicesDevicequeryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCloseObjectQuery(hdevquery: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCreateObjectQuery(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCreateObjectQueryEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromId(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIds(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdsEx(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devFindProperty(pkey: Long, store: Int, pszlocalename: Long, cproperties: Int, pproperties: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devFreeObjectProperties(cpropertycount: Int, pproperties: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devFreeObjects(cobjectcount: Int, pobjects: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devGetObjectProperties(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devGetObjectPropertiesEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cextendedparametercount: Int, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devGetObjects(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcobjectcount: Long, ppobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_devicequery_devGetObjectsEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): Int
}

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCloseObjectQuery((hdevquery?.value ?: 0L))
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phdevquery?.value ?: 0L))

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phdevquery?.value ?: 0L))

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromId(objecttype, (pszobjectid?.value ?: 0L), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phdevquery?.value ?: 0L))

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdEx(objecttype, (pszobjectid?.value ?: 0L), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phdevquery?.value ?: 0L))

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIds(objecttype, (pszzobjectids?.value ?: 0L), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phdevquery?.value ?: 0L))

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdsEx(objecttype, (pszzobjectids?.value ?: 0L), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phdevquery?.value ?: 0L))

public actual fun devFindProperty(pkey: COpaquePointer?, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devFindProperty((pkey?.value ?: 0L), store, (pszlocalename?.value ?: 0L), cproperties.toInt(), (pproperties?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: COpaquePointer?) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devFreeObjectProperties(cpropertycount.toInt(), (pproperties?.value ?: 0L))
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: COpaquePointer?) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devFreeObjects(cobjectcount.toInt(), (pobjects?.value ?: 0L))
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devGetObjectProperties(objecttype, (pszobjectid?.value ?: 0L), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), (pcpropertycount?.value ?: 0L), (ppproperties?.value ?: 0L))

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devGetObjectPropertiesEx(objecttype, (pszobjectid?.value ?: 0L), queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L), (pcpropertycount?.value ?: 0L), (ppproperties?.value ?: 0L))

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), (pcobjectcount?.value ?: 0L), (ppobjects?.value ?: 0L))

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssys_windows_win32_devices_devicequery_devGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), (prequestedproperties?.value ?: 0L), cfilterexpressioncount.toInt(), (pfilter?.value ?: 0L), cextendedparametercount.toInt(), (pextendedparameters?.value ?: 0L), (pcobjectcount?.value ?: 0L), (ppobjects?.value ?: 0L))
