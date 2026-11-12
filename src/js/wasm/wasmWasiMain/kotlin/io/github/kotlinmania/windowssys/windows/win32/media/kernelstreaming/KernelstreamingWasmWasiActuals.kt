@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator")

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2")

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreateClock")

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreateClock2")

public actual fun ksCreatePin(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreatePin")

public actual fun ksCreatePin2(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreatePin2")

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode")

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2")

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount")

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems")

public actual fun ksOpenDefaultDevice(category: ConstPtr, access: UInt, devicehandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice")

public actual fun ksResolveRequiredAttributes(datarange: ConstPtr, attributes: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes")

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: ConstPtr, inlength: UInt, outbuffer: MutPtr, outlength: UInt, bytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl")
