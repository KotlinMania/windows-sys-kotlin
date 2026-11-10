@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public actual fun dMOEnum(guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dMOGetName(clsiddmo: COpaquePointer?, szname: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dMOGetTypes(clsiddmo: COpaquePointer?, ulinputtypesrequested: UInt, pulinputtypessupplied: COpaquePointer?, pinputtypes: COpaquePointer?, uloutputtypesrequested: UInt, puloutputtypessupplied: COpaquePointer?, poutputtypes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dMORegister(szname: Pcwstr, clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dMOUnregister(clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moCopyMediaType(pmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moCreateMediaType(ppmt: COpaquePointer?, cbformat: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moDeleteMediaType(pmt: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moDuplicateMediaType(ppmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moFreeMediaType(pmt: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moInitMediaType(pmt: COpaquePointer?, cbformat: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
