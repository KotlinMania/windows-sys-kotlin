@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun devCloseObjectQuery(hdevquery: Hdevquery): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery")

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery")

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx")

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId")

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx")

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds")

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcallback: PdevQueryResultCallback, pcontext: ConstPtr, phdevquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx")

public actual fun devFindProperty(pkey: ConstPtr, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevFindProperty")

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties")

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevFreeObjects")

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties")

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcpropertycount: MutPtr, ppproperties: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx")

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjects")

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr, cfilterexpressioncount: UInt, pfilter: ConstPtr, cextendedparametercount: UInt, pextendedparameters: ConstPtr, pcobjectcount: MutPtr, ppobjects: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx")
