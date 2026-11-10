@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun freeInterfaceContextTable(interfacecontexttable: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: COpaquePointer?, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcmFreeMemory(pmemory: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcmGetProfileList(preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcmQueryProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcmSetProfileList(pprofilelist: COpaquePointer?, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcmSetProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, dwdatasize: UInt, pbdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
