@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCloseObjectQuery(hdevquery?.value?.toCPointer<ByteVar>())
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCreateObjectQuery(objecttype, queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phdevquery?.value?.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryEx(objecttype, queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phdevquery?.value?.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromId(objecttype, pszobjectid?.value?.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phdevquery?.value?.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdEx(objecttype, pszobjectid?.value?.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phdevquery?.value?.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIds(objecttype, pszzobjectids?.value?.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phdevquery?.value?.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdsEx(objecttype, pszzobjectids?.value?.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phdevquery?.value?.toCPointer<ByteVar>())

public actual fun devFindProperty(pkey: COpaquePointer?, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devFindProperty(pkey?.value?.toCPointer<ByteVar>(), store, pszlocalename?.value?.toCPointer<ByteVar>(), cproperties, pproperties?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devFreeObjectProperties(cpropertycount, pproperties?.value?.toCPointer<ByteVar>())
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devFreeObjects(cobjectcount, pobjects?.value?.toCPointer<ByteVar>())
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devGetObjectProperties(objecttype, pszobjectid?.value?.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), pcpropertycount?.value?.toCPointer<ByteVar>(), ppproperties?.value?.toCPointer<ByteVar>())

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devGetObjectPropertiesEx(objecttype, pszobjectid?.value?.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters?.value?.toCPointer<ByteVar>(), pcpropertycount?.value?.toCPointer<ByteVar>(), ppproperties?.value?.toCPointer<ByteVar>())

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devGetObjects(objecttype, queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), pcobjectcount?.value?.toCPointer<ByteVar>(), ppobjects?.value?.toCPointer<ByteVar>())

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssys_windows_win32_devices_devicequery_devGetObjectsEx(objecttype, queryflags, crequestedproperties, prequestedproperties?.value?.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter?.value?.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters?.value?.toCPointer<ByteVar>(), pcobjectcount?.value?.toCPointer<ByteVar>(), ppobjects?.value?.toCPointer<ByteVar>())
