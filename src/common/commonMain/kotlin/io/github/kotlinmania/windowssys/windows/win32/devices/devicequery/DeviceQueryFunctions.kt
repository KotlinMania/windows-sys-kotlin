package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

public expect fun devCloseObjectQuery(hdevquery: Hdevquery)

public expect fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult

public expect fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult

public expect fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult

public expect fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult

public expect fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult

public expect fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult

public expect fun devFindProperty(pkey: ConstPtr, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr): MutPtr

public expect fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr)

public expect fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr)

public expect fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult

public expect fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult

public expect fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult

public expect fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult
