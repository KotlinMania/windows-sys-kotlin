@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun FreeInterfaceContextTable(interfacecontexttable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_FreeInterfaceContextTable(interfacecontexttable.toCPointer<ByteVar>())
}

public actual fun GetInterfaceContextTableForHostName(hostname: PCWSTR, proxyname: PCWSTR, flags: UInt, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_GetInterfaceContextTableForHostName(hostname.toCPointer<ByteVar>(), proxyname.toCPointer<ByteVar>(), flags, connectionprofilefilterrawdata.toCPointer<ByteVar>(), connectionprofilefilterrawdatasize, interfacecontexttable.toCPointer<ByteVar>())

public actual fun OnDemandGetRoutingHint(destinationhostname: PCWSTR, interfaceindex: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandGetRoutingHint(destinationhostname.toCPointer<ByteVar>(), interfaceindex.toCPointer<ByteVar>())

public actual fun OnDemandRegisterNotification(callback: ONDEMAND_NOTIFICATION_CALLBACK, callbackcontext: Long, registrationhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandRegisterNotification(callback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun OnDemandUnRegisterNotification(registrationhandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandUnRegisterNotification(registrationhandle.toCPointer<ByteVar>())

public actual fun WcmFreeMemory(pmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmFreeMemory(pmemory.toCPointer<ByteVar>())
}

public actual fun WcmGetProfileList(preserved: Long, ppprofilelist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmGetProfileList(preserved.toCPointer<ByteVar>(), ppprofilelist.toCPointer<ByteVar>())

public actual fun WcmQueryProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmQueryProperty(pinterface.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), property, preserved.toCPointer<ByteVar>(), pdwdatasize.toCPointer<ByteVar>(), ppdata.toCPointer<ByteVar>())

public actual fun WcmSetProfileList(pprofilelist: Long, dwposition: UInt, fignoreunknownprofiles: BOOL, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProfileList(pprofilelist.toCPointer<ByteVar>(), dwposition, fignoreunknownprofiles, preserved.toCPointer<ByteVar>())

public actual fun WcmSetProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, dwdatasize: UInt, pbdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProperty(pinterface.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), property, preserved.toCPointer<ByteVar>(), dwdatasize, pbdata.toCPointer<ByteVar>())
