@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup(): Unit

public actual fun mcastApiCleanup(): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()

public actual fun mcastApiStartup(version: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup")

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr, pscopelen: MutPtr, pscopecount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes")

public actual fun mcastGenUID(prequestid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID")

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr, preleaserequest: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress")

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr, prenewrequest: MutPtr, prenewresponse: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress")

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr, pscopectx: MutPtr, paddrrequest: MutPtr, paddrresponse: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress")
