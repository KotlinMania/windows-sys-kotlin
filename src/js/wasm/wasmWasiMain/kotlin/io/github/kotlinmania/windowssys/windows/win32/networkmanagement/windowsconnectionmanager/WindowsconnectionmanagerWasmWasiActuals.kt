@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun freeInterfaceContextTable(interfacecontexttable: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable")

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName")

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint")

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr, registrationhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification")

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification")

public actual fun wcmFreeMemory(pmemory: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory")

public actual fun wcmGetProfileList(preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList")

public actual fun wcmQueryProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty")

public actual fun wcmSetProfileList(pprofilelist: ConstPtr, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList")

public actual fun wcmSetProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, dwdatasize: UInt, pbdata: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty")
