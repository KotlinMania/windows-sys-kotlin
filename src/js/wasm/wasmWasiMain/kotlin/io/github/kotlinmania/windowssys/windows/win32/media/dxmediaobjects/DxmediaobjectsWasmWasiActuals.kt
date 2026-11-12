@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dMOEnum(guidcategory: ConstPtr, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr, couttypes: UInt, pouttypes: ConstPtr, ppenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsDMOEnum")

public actual fun dMOGetName(clsiddmo: ConstPtr, szname: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsDMOGetName")

public actual fun dMOGetTypes(clsiddmo: ConstPtr, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr, pinputtypes: MutPtr, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr, poutputtypes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes")

public actual fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr, guidcategory: ConstPtr, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr, couttypes: UInt, pouttypes: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsDMORegister")

public actual fun dMOUnregister(clsiddmo: ConstPtr, guidcategory: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister")

public actual fun moCopyMediaType(pmtdest: MutPtr, pmtsrc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType")

public actual fun moCreateMediaType(ppmt: MutPtr, cbformat: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType")

public actual fun moDeleteMediaType(pmt: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType")

public actual fun moDuplicateMediaType(ppmtdest: MutPtr, pmtsrc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType")

public actual fun moFreeMediaType(pmt: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType")

public actual fun moInitMediaType(pmt: MutPtr, cbformat: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType")
