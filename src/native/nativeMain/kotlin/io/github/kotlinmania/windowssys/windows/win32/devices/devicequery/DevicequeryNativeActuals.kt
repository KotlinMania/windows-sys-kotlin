@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.DEVPROPSTORE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun DevCloseObjectQuery(hdevquery: HDEVQUERY) {
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCloseObjectQuery(hdevquery.toCPointer<ByteVar>())
}

public actual fun DevCreateObjectQuery(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCreateObjectQuery(objecttype, queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phdevquery.toCPointer<ByteVar>())

public actual fun DevCreateObjectQueryEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryEx(objecttype, queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phdevquery.toCPointer<ByteVar>())

public actual fun DevCreateObjectQueryFromId(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromId(objecttype, pszobjectid.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phdevquery.toCPointer<ByteVar>())

public actual fun DevCreateObjectQueryFromIdEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdEx(objecttype, pszobjectid.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phdevquery.toCPointer<ByteVar>())

public actual fun DevCreateObjectQueryFromIds(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIds(objecttype, pszzobjectids.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phdevquery.toCPointer<ByteVar>())

public actual fun DevCreateObjectQueryFromIdsEx(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phdevquery.toCPointer<ByteVar>())

public actual fun DevFindProperty(pkey: Long, store: DEVPROPSTORE, pszlocalename: PCWSTR, cproperties: UInt, pproperties: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevFindProperty(pkey.toCPointer<ByteVar>(), store, pszlocalename.toCPointer<ByteVar>(), cproperties, pproperties.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DevFreeObjectProperties(cpropertycount: UInt, pproperties: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevFreeObjectProperties(cpropertycount, pproperties.toCPointer<ByteVar>())
}

public actual fun DevFreeObjects(cobjectcount: UInt, pobjects: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevFreeObjects(cobjectcount, pobjects.toCPointer<ByteVar>())
}

public actual fun DevGetObjectProperties(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevGetObjectProperties(objecttype, pszobjectid.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), pcpropertycount.toCPointer<ByteVar>(), ppproperties.toCPointer<ByteVar>())

public actual fun DevGetObjectPropertiesEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevGetObjectPropertiesEx(objecttype, pszobjectid.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.toCPointer<ByteVar>(), pcpropertycount.toCPointer<ByteVar>(), ppproperties.toCPointer<ByteVar>())

public actual fun DevGetObjects(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevGetObjects(objecttype, queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), pcobjectcount.toCPointer<ByteVar>(), ppobjects.toCPointer<ByteVar>())

public actual fun DevGetObjectsEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_DevGetObjectsEx(objecttype, queryflags, crequestedproperties, prequestedproperties.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.toCPointer<ByteVar>(), pcobjectcount.toCPointer<ByteVar>(), ppobjects.toCPointer<ByteVar>())
