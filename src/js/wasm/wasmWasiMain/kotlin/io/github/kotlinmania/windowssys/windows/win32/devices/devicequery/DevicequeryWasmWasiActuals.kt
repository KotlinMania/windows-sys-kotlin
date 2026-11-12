@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun devCloseObjectQuery(hdevquery: Hdevquery): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery")

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery")

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx")

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId")

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx")

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds")

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx")

public actual fun devFindProperty(pkey: ConstPtr<Devpropkey>, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr<Devproperty>): MutPtr<Devproperty> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevFindProperty")

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties")

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr<DevObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevFreeObjects")

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties")

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx")

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjects")

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx")
