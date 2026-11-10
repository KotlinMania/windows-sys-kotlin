package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

public expect fun devCloseObjectQuery(hdevquery: Hdevquery)

public expect fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult

public expect fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult

public expect fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult

public expect fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult

public expect fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult

public expect fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcallback: PdevQueryResultCallback, pcontext: COpaquePointer?, phdevquery: COpaquePointer?): Hresult

public expect fun devFindProperty(pkey: COpaquePointer?, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: COpaquePointer?): COpaquePointer?

public expect fun devFreeObjectProperties(cpropertycount: UInt, pproperties: COpaquePointer?)

public expect fun devFreeObjects(cobjectcount: UInt, pobjects: COpaquePointer?)

public expect fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult

public expect fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcpropertycount: COpaquePointer?, ppproperties: COpaquePointer?): Hresult

public expect fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult

public expect fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: COpaquePointer?, cfilterexpressioncount: UInt, pfilter: COpaquePointer?, cextendedparametercount: UInt, pextendedparameters: COpaquePointer?, pcobjectcount: COpaquePointer?, ppobjects: COpaquePointer?): Hresult
