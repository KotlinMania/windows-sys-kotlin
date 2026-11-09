@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun FreeInterfaceContextTable(interfacecontexttable: Long) {
}

public actual fun GetInterfaceContextTableForHostName(hostname: PCWSTR, proxyname: PCWSTR, flags: UInt, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: Long): HRESULT =
    0

public actual fun OnDemandGetRoutingHint(destinationhostname: PCWSTR, interfaceindex: Long): HRESULT =
    0

public actual fun OnDemandRegisterNotification(callback: ONDEMAND_NOTIFICATION_CALLBACK, callbackcontext: Long, registrationhandle: Long): HRESULT =
    0

public actual fun OnDemandUnRegisterNotification(registrationhandle: HANDLE): HRESULT =
    0

public actual fun WcmFreeMemory(pmemory: Long) {
}

public actual fun WcmGetProfileList(preserved: Long, ppprofilelist: Long): UInt =
    0u

public actual fun WcmQueryProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    0u

public actual fun WcmSetProfileList(pprofilelist: Long, dwposition: UInt, fignoreunknownprofiles: BOOL, preserved: Long): UInt =
    0u

public actual fun WcmSetProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, dwdatasize: UInt, pbdata: Long): UInt =
    0u
