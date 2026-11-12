@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun freeInterfaceContextTable(interfacecontexttable: ConstPtr<NetInterfaceContextTable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable")

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr<UByte>, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr<MutPtr<NetInterfaceContextTable>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName")

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint")

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr<CVoid>, registrationhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification")

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification")

public actual fun wcmFreeMemory(pmemory: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory")

public actual fun wcmGetProfileList(preserved: ConstPtr<CVoid>, ppprofilelist: MutPtr<MutPtr<WcmProfileInfoList>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList")

public actual fun wcmQueryProperty(pinterface: ConstPtr<Guid>, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty")

public actual fun wcmSetProfileList(pprofilelist: ConstPtr<WcmProfileInfoList>, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList")

public actual fun wcmSetProperty(pinterface: ConstPtr<Guid>, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr<CVoid>, dwdatasize: UInt, pbdata: ConstPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty")
