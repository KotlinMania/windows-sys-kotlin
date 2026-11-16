package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun freeInterfaceContextTable(interfacecontexttable: ConstPtr)

public expect fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr): Hresult

public expect fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr): Hresult

public expect fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr, registrationhandle: MutPtr): Hresult

public expect fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult

public expect fun wcmFreeMemory(pmemory: MutPtr)

public expect fun wcmGetProfileList(preserved: ConstPtr, ppprofilelist: MutPtr): UInt

public expect fun wcmQueryProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt

public expect fun wcmSetProfileList(pprofilelist: ConstPtr, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr): UInt

public expect fun wcmSetProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, dwdatasize: UInt, pbdata: ConstPtr): UInt
