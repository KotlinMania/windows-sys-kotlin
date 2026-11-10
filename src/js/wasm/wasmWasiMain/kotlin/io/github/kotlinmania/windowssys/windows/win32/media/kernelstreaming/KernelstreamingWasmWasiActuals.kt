@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreatePin(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreatePin2(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksOpenDefaultDevice(category: COpaquePointer?, access: UInt, devicehandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksResolveRequiredAttributes(datarange: COpaquePointer?, attributes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: COpaquePointer?, inlength: UInt, outbuffer: COpaquePointer?, outlength: UInt, bytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
