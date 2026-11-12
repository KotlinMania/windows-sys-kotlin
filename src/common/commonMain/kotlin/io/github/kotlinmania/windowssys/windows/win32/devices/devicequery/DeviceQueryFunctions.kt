package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropcompkey
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public expect fun devCloseObjectQuery(hdevquery: Hdevquery)

public expect fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult

public expect fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult

public expect fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult

public expect fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult

public expect fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult

public expect fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult

public expect fun devFindProperty(pkey: ConstPtr<Devpropkey>, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr<Devproperty>): MutPtr<Devproperty>

public expect fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr<Devproperty>)

public expect fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr<DevObject>)

public expect fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult

public expect fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult

public expect fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult

public expect fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult
