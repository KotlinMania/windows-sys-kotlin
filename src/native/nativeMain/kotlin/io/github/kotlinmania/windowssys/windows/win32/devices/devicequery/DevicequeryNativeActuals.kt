@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevFindProperty
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevFreeObjects
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevGetObjects
import io.github.kotlinmania.windowssys.windows.win32.devices.devicequery.cinterop.windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropcompkey
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery.rawAddress.toCPointer<ByteVar>())
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype, pszzobjectids.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devFindProperty(pkey: ConstPtr<Devpropkey>, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr<Devproperty>): MutPtr<Devproperty> =
    MutPtr(windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey.rawAddress.toCPointer<ByteVar>(), store, pszlocalename.rawAddress.toCPointer<ByteVar>(), cproperties, pproperties.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr<Devproperty>) {
    windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount, pproperties.rawAddress.toCPointer<ByteVar>())
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr<DevObject>) {
    windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount, pobjects.rawAddress.toCPointer<ByteVar>())
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), pcpropertycount.rawAddress.toCPointer<ByteVar>(), ppproperties.rawAddress.toCPointer<ByteVar>())

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), pcpropertycount.rawAddress.toCPointer<ByteVar>(), ppproperties.rawAddress.toCPointer<ByteVar>())

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), pcobjectcount.rawAddress.toCPointer<ByteVar>(), ppobjects.rawAddress.toCPointer<ByteVar>())

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), pcobjectcount.rawAddress.toCPointer<ByteVar>(), ppobjects.rawAddress.toCPointer<ByteVar>())
