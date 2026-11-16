@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

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
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery.rawAddress.toCPointer<ByteVar>())
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype, pszzobjectids.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phdevquery.rawAddress.toCPointer<ByteVar>())

public actual fun devFindProperty(pkey: ConstPtr, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey.rawAddress.toCPointer<ByteVar>(), store, pszlocalename.rawAddress.toCPointer<ByteVar>(), cproperties, pproperties.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr) {
    windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount, pproperties.rawAddress.toCPointer<ByteVar>())
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr) {
    windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount, pobjects.rawAddress.toCPointer<ByteVar>())
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), pcpropertycount.rawAddress.toCPointer<ByteVar>(), ppproperties.rawAddress.toCPointer<ByteVar>())

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype, pszobjectid.rawAddress.toCPointer<ByteVar>(), queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), pcpropertycount.rawAddress.toCPointer<ByteVar>(), ppproperties.rawAddress.toCPointer<ByteVar>())

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), pcobjectcount.rawAddress.toCPointer<ByteVar>(), ppobjects.rawAddress.toCPointer<ByteVar>())

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype, queryflags, crequestedproperties, prequestedproperties.rawAddress.toCPointer<ByteVar>(), cfilterexpressioncount, pfilter.rawAddress.toCPointer<ByteVar>(), cextendedparametercount, pextendedparameters.rawAddress.toCPointer<ByteVar>(), pcobjectcount.rawAddress.toCPointer<ByteVar>(), ppobjects.rawAddress.toCPointer<ByteVar>())
