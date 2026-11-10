package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun freeInterfaceContextTable(interfacecontexttable: COpaquePointer?)

public expect fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: COpaquePointer?, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: COpaquePointer?): Hresult

public expect fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: COpaquePointer?): Hresult

public expect fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult

public expect fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult

public expect fun wcmFreeMemory(pmemory: COpaquePointer?)

public expect fun wcmGetProfileList(preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt

public expect fun wcmQueryProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt

public expect fun wcmSetProfileList(pprofilelist: COpaquePointer?, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: COpaquePointer?): UInt

public expect fun wcmSetProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, dwdatasize: UInt, pbdata: COpaquePointer?): UInt
