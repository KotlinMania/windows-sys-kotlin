package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun freeInterfaceContextTable(interfacecontexttable: ConstPtr<NetInterfaceContextTable>)

public expect fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr<UByte>, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr<MutPtr<NetInterfaceContextTable>>): Hresult

public expect fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr<UInt>): Hresult

public expect fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr<CVoid>, registrationhandle: MutPtr<Handle>): Hresult

public expect fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult

public expect fun wcmFreeMemory(pmemory: MutPtr<CVoid>)

public expect fun wcmGetProfileList(preserved: ConstPtr<CVoid>, ppprofilelist: MutPtr<MutPtr<WcmProfileInfoList>>): UInt

public expect fun wcmQueryProperty(pinterface: ConstPtr<Guid>, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<UByte>>): UInt

public expect fun wcmSetProfileList(pprofilelist: ConstPtr<WcmProfileInfoList>, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr<CVoid>): UInt

public expect fun wcmSetProperty(pinterface: ConstPtr<Guid>, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr<CVoid>, dwdatasize: UInt, pbdata: ConstPtr<UByte>): UInt
