@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.DEVPROPSTORE

public actual fun DevCloseObjectQuery(hdevquery: HDEVQUERY) {
}

public actual fun DevCreateObjectQuery(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    0

public actual fun DevCreateObjectQueryEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    0

public actual fun DevCreateObjectQueryFromId(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    0

public actual fun DevCreateObjectQueryFromIdEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    0

public actual fun DevCreateObjectQueryFromIds(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    0

public actual fun DevCreateObjectQueryFromIdsEx(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT =
    0

public actual fun DevFindProperty(pkey: Long, store: DEVPROPSTORE, pszlocalename: PCWSTR, cproperties: UInt, pproperties: Long): Long =
    0L

public actual fun DevFreeObjectProperties(cpropertycount: UInt, pproperties: Long) {
}

public actual fun DevFreeObjects(cobjectcount: UInt, pobjects: Long) {
}

public actual fun DevGetObjectProperties(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    0

public actual fun DevGetObjectPropertiesEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): HRESULT =
    0

public actual fun DevGetObjects(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    0

public actual fun DevGetObjectsEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): HRESULT =
    0
