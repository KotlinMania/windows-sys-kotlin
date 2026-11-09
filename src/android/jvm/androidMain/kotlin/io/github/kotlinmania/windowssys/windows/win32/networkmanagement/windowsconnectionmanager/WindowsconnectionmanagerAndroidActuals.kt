@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_FreeInterfaceContextTable(interfacecontexttable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_GetInterfaceContextTableForHostName(hostname: Long, proxyname: Long, flags: Int, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: Int, interfacecontexttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandGetRoutingHint(destinationhostname: Long, interfaceindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandRegisterNotification(callback: Long, callbackcontext: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandUnRegisterNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmGetProfileList(preserved: Long, ppprofilelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmQueryProperty(pinterface: Long, strprofilename: Long, property: Int, preserved: Long, pdwdatasize: Long, ppdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProfileList(pprofilelist: Long, dwposition: Int, fignoreunknownprofiles: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProperty(pinterface: Long, strprofilename: Long, property: Int, preserved: Long, dwdatasize: Int, pbdata: Long): Int
}

public actual fun FreeInterfaceContextTable(interfacecontexttable: Long) {
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_FreeInterfaceContextTable(interfacecontexttable)
}

public actual fun GetInterfaceContextTableForHostName(hostname: PCWSTR, proxyname: PCWSTR, flags: UInt, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: Long): HRESULT =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_GetInterfaceContextTableForHostName(hostname, proxyname, flags.toInt(), connectionprofilefilterrawdata, connectionprofilefilterrawdatasize.toInt(), interfacecontexttable)

public actual fun OnDemandGetRoutingHint(destinationhostname: PCWSTR, interfaceindex: Long): HRESULT =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandGetRoutingHint(destinationhostname, interfaceindex)

public actual fun OnDemandRegisterNotification(callback: ONDEMAND_NOTIFICATION_CALLBACK, callbackcontext: Long, registrationhandle: Long): HRESULT =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandRegisterNotification(callback.toLong(), callbackcontext, registrationhandle)

public actual fun OnDemandUnRegisterNotification(registrationhandle: HANDLE): HRESULT =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandUnRegisterNotification(registrationhandle)

public actual fun WcmFreeMemory(pmemory: Long) {
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmFreeMemory(pmemory)
}

public actual fun WcmGetProfileList(preserved: Long, ppprofilelist: Long): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmGetProfileList(preserved, ppprofilelist).toUInt()

public actual fun WcmQueryProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmQueryProperty(pinterface, strprofilename, property, preserved, pdwdatasize, ppdata).toUInt()

public actual fun WcmSetProfileList(pprofilelist: Long, dwposition: UInt, fignoreunknownprofiles: BOOL, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProfileList(pprofilelist, dwposition.toInt(), fignoreunknownprofiles, preserved).toUInt()

public actual fun WcmSetProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, dwdatasize: UInt, pbdata: Long): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProperty(pinterface, strprofilename, property, preserved, dwdatasize.toInt(), pbdata).toUInt()
