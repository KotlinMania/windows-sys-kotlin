package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(hdevquery: HDEVQUERY, pcontext: Long, pactiondata: Long)
}

public fun DevCloseObjectQuery(hdevquery: HDEVQUERY) {
    Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevCloseObjectQuery", longArrayOf(hdevquery))
}

public fun DevCreateObjectQuery(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevCreateObjectQuery", longArrayOf(objecttype.toLong(), queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, Win32DynamicFfi.objectSlot(pcallback), pcontext, phdevquery)).toInt()
}

public fun DevCreateObjectQueryEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-1.dll", "DevCreateObjectQueryEx", longArrayOf(objecttype.toLong(), queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, cextendedparametercount.toLong(), pextendedparameters, Win32DynamicFfi.objectSlot(pcallback), pcontext, phdevquery)).toInt()
}

public fun DevCreateObjectQueryFromId(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevCreateObjectQueryFromId", longArrayOf(objecttype.toLong(), pszobjectid, queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, Win32DynamicFfi.objectSlot(pcallback), pcontext, phdevquery)).toInt()
}

public fun DevCreateObjectQueryFromIdEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-1.dll", "DevCreateObjectQueryFromIdEx", longArrayOf(objecttype.toLong(), pszobjectid, queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, cextendedparametercount.toLong(), pextendedparameters, Win32DynamicFfi.objectSlot(pcallback), pcontext, phdevquery)).toInt()
}

public fun DevCreateObjectQueryFromIds(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevCreateObjectQueryFromIds", longArrayOf(objecttype.toLong(), pszzobjectids, queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, Win32DynamicFfi.objectSlot(pcallback), pcontext, phdevquery)).toInt()
}

public fun DevCreateObjectQueryFromIdsEx(objecttype: DEV_OBJECT_TYPE, pszzobjectids: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcallback: PDEV_QUERY_RESULT_CALLBACK, pcontext: Long, phdevquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-1.dll", "DevCreateObjectQueryFromIdsEx", longArrayOf(objecttype.toLong(), pszzobjectids, queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, cextendedparametercount.toLong(), pextendedparameters, Win32DynamicFfi.objectSlot(pcallback), pcontext, phdevquery)).toInt()
}

public fun DevFindProperty(pkey: Long, store: Properties.DEVPROPSTORE, pszlocalename: PCWSTR, cproperties: UInt, pproperties: Long): Long {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevFindProperty", longArrayOf(pkey, Win32DynamicFfi.objectSlot(store), pszlocalename, cproperties.toLong(), pproperties))
}

public fun DevFreeObjectProperties(cpropertycount: UInt, pproperties: Long) {
    Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevFreeObjectProperties", longArrayOf(cpropertycount.toLong(), pproperties))
}

public fun DevFreeObjects(cobjectcount: UInt, pobjects: Long) {
    Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevFreeObjects", longArrayOf(cobjectcount.toLong(), pobjects))
}

public fun DevGetObjectProperties(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevGetObjectProperties", longArrayOf(objecttype.toLong(), pszobjectid, queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, pcpropertycount, ppproperties)).toInt()
}

public fun DevGetObjectPropertiesEx(objecttype: DEV_OBJECT_TYPE, pszobjectid: PCWSTR, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-1.dll", "DevGetObjectPropertiesEx", longArrayOf(objecttype.toLong(), pszobjectid, queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cextendedparametercount.toLong(), pextendedparameters, pcpropertycount, ppproperties)).toInt()
}

public fun DevGetObjects(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, pcobjectcount: Long, ppobjects: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-0.dll", "DevGetObjects", longArrayOf(objecttype.toLong(), queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, pcobjectcount, ppobjects)).toInt()
}

public fun DevGetObjectsEx(objecttype: DEV_OBJECT_TYPE, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: Long, cfilterexpressioncount: UInt, pfilter: Long, cextendedparametercount: UInt, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-devices-query-l1-1-1.dll", "DevGetObjectsEx", longArrayOf(objecttype.toLong(), queryflags.toLong(), crequestedproperties.toLong(), prequestedproperties, cfilterexpressioncount.toLong(), pfilter, cextendedparametercount.toLong(), pextendedparameters, pcobjectcount, ppobjects)).toInt()
}
