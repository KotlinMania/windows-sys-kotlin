package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface FnCallback {
    public operator fun invoke(param0: Long)
}

public fun FreeInterfaceContextTable(interfacecontexttable: Long) {
    Win32DynamicFfi.invoke("ondemandconnroutehelper.dll", "FreeInterfaceContextTable", longArrayOf(interfacecontexttable))
}

public fun GetInterfaceContextTableForHostName(hostname: PCWSTR, proxyname: PCWSTR, flags: UInt, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: Long): HRESULT {
    return Win32DynamicFfi.invoke("ondemandconnroutehelper.dll", "GetInterfaceContextTableForHostName", longArrayOf(hostname, proxyname, flags.toLong(), connectionprofilefilterrawdata, connectionprofilefilterrawdatasize.toLong(), interfacecontexttable)).toInt()
}

public fun OnDemandGetRoutingHint(destinationhostname: PCWSTR, interfaceindex: Long): HRESULT {
    return Win32DynamicFfi.invoke("ondemandconnroutehelper.dll", "OnDemandGetRoutingHint", longArrayOf(destinationhostname, interfaceindex)).toInt()
}

public fun OnDemandRegisterNotification(callback: ONDEMAND_NOTIFICATION_CALLBACK, callbackcontext: Long, registrationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ondemandconnroutehelper.dll", "OnDemandRegisterNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback), callbackcontext, registrationhandle)).toInt()
}

public fun OnDemandUnRegisterNotification(registrationhandle: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ondemandconnroutehelper.dll", "OnDemandUnRegisterNotification", longArrayOf(registrationhandle)).toInt()
}

public fun WcmFreeMemory(pmemory: Long) {
    Win32DynamicFfi.invoke("wcmapi.dll", "WcmFreeMemory", longArrayOf(pmemory))
}

public fun WcmGetProfileList(preserved: Long, ppprofilelist: Long): UInt {
    return Win32DynamicFfi.invoke("wcmapi.dll", "WcmGetProfileList", longArrayOf(preserved, ppprofilelist)).toUInt()
}

public fun WcmQueryProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt {
    return Win32DynamicFfi.invoke("wcmapi.dll", "WcmQueryProperty", longArrayOf(pinterface, strprofilename, property.toLong(), preserved, pdwdatasize, ppdata)).toUInt()
}

public fun WcmSetProfileList(pprofilelist: Long, dwposition: UInt, fignoreunknownprofiles: BOOL, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wcmapi.dll", "WcmSetProfileList", longArrayOf(pprofilelist, dwposition.toLong(), fignoreunknownprofiles.toLong(), preserved)).toUInt()
}

public fun WcmSetProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, dwdatasize: UInt, pbdata: Long): UInt {
    return Win32DynamicFfi.invoke("wcmapi.dll", "WcmSetProperty", longArrayOf(pinterface, strprofilename, property.toLong(), preserved, dwdatasize.toLong(), pbdata)).toUInt()
}
