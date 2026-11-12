@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

private object WindowsWin32DevicesDevicequeryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey: Long, store: Int, pszlocalename: Long, cproperties: Int, pproperties: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount: Int, pproperties: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount: Int, pobjects: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cextendedparametercount: Int, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcobjectcount: Long, ppobjects: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): Int
}

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery.rawAddress)
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype, pszzobjectids.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devFindProperty(pkey: ConstPtr, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr): MutPtr =
    MutPtr(WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey.rawAddress, store, pszlocalename.rawAddress, cproperties.toInt(), pproperties.rawAddress))

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount.toInt(), pproperties.rawAddress)
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount.toInt(), pobjects.rawAddress)
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, pcpropertycount.rawAddress, ppproperties.rawAddress)

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, pcpropertycount.rawAddress, ppproperties.rawAddress)

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, pcobjectcount.rawAddress, ppobjects.rawAddress)

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, pcobjectcount.rawAddress, ppobjects.rawAddress)
