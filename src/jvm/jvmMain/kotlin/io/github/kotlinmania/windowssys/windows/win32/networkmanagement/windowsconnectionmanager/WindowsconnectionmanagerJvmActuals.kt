@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_freeInterfaceContextTable(interfacecontexttable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_getInterfaceContextTableForHostName(hostname: Long, proxyname: Long, flags: Int, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: Int, interfacecontexttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandGetRoutingHint(destinationhostname: Long, interfaceindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandRegisterNotification(callback: Long, callbackcontext: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandUnRegisterNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmGetProfileList(preserved: Long, ppprofilelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmQueryProperty(pinterface: Long, strprofilename: Long, property: Int, preserved: Long, pdwdatasize: Long, ppdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProfileList(pprofilelist: Long, dwposition: Int, fignoreunknownprofiles: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProperty(pinterface: Long, strprofilename: Long, property: Int, preserved: Long, dwdatasize: Int, pbdata: Long): Int
}

public actual fun freeInterfaceContextTable(interfacecontexttable: COpaquePointer?) {
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_freeInterfaceContextTable((interfacecontexttable?.value ?: 0L))
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: COpaquePointer?, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_getInterfaceContextTableForHostName((hostname?.value ?: 0L), (proxyname?.value ?: 0L), flags.toInt(), (connectionprofilefilterrawdata?.value ?: 0L), connectionprofilefilterrawdatasize.toInt(), (interfacecontexttable?.value ?: 0L))

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandGetRoutingHint((destinationhostname?.value ?: 0L), (interfaceindex?.value ?: 0L))

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandRegisterNotification(0L, (callbackcontext?.value ?: 0L), (registrationhandle?.value ?: 0L))

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandUnRegisterNotification((registrationhandle?.value ?: 0L))

public actual fun wcmFreeMemory(pmemory: COpaquePointer?) {
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmFreeMemory((pmemory?.value ?: 0L))
}

public actual fun wcmGetProfileList(preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmGetProfileList((preserved?.value ?: 0L), (ppprofilelist?.value ?: 0L)).toUInt()

public actual fun wcmQueryProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmQueryProperty((pinterface?.value ?: 0L), (strprofilename?.value ?: 0L), property, (preserved?.value ?: 0L), (pdwdatasize?.value ?: 0L), (ppdata?.value ?: 0L)).toUInt()

public actual fun wcmSetProfileList(pprofilelist: COpaquePointer?, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProfileList((pprofilelist?.value ?: 0L), dwposition.toInt(), fignoreunknownprofiles, (preserved?.value ?: 0L)).toUInt()

public actual fun wcmSetProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, dwdatasize: UInt, pbdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProperty((pinterface?.value ?: 0L), (strprofilename?.value ?: 0L), property, (preserved?.value ?: 0L), dwdatasize.toInt(), (pbdata?.value ?: 0L)).toUInt()
