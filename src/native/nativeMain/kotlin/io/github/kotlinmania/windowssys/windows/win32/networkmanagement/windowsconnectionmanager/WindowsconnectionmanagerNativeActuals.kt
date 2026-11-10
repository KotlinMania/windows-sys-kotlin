@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun freeInterfaceContextTable(interfacecontexttable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_freeInterfaceContextTable(interfacecontexttable?.value?.toCPointer<ByteVar>())
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: COpaquePointer?, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_getInterfaceContextTableForHostName(hostname?.value?.toCPointer<ByteVar>(), proxyname?.value?.toCPointer<ByteVar>(), flags, connectionprofilefilterrawdata?.value?.toCPointer<ByteVar>(), connectionprofilefilterrawdatasize, interfacecontexttable?.value?.toCPointer<ByteVar>())

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandGetRoutingHint(destinationhostname?.value?.toCPointer<ByteVar>(), interfaceindex?.value?.toCPointer<ByteVar>())

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandRegisterNotification(0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandUnRegisterNotification(registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun wcmFreeMemory(pmemory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmFreeMemory(pmemory?.value?.toCPointer<ByteVar>())
}

public actual fun wcmGetProfileList(preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmGetProfileList(preserved?.value?.toCPointer<ByteVar>(), ppprofilelist?.value?.toCPointer<ByteVar>())

public actual fun wcmQueryProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmQueryProperty(pinterface?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), property, preserved?.value?.toCPointer<ByteVar>(), pdwdatasize?.value?.toCPointer<ByteVar>(), ppdata?.value?.toCPointer<ByteVar>())

public actual fun wcmSetProfileList(pprofilelist: COpaquePointer?, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProfileList(pprofilelist?.value?.toCPointer<ByteVar>(), dwposition, fignoreunknownprofiles, preserved?.value?.toCPointer<ByteVar>())

public actual fun wcmSetProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, dwdatasize: UInt, pbdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProperty(pinterface?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), property, preserved?.value?.toCPointer<ByteVar>(), dwdatasize, pbdata?.value?.toCPointer<ByteVar>())
