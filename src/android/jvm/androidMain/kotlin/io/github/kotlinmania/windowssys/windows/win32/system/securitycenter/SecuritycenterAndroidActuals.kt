@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE

private object WindowsWin32SystemSecuritycenterJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_WscGetAntiMalwareUri(ppszuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_WscGetSecurityProviderHealth(providers: Int, phealth: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_WscQueryAntiMalwareUri(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_WscRegisterForUserNotifications(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_WscUnRegisterChanges(hregistrationhandle: Long): Int
}

public actual fun WscGetAntiMalwareUri(ppszuri: Long): HRESULT =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_WscGetAntiMalwareUri(ppszuri)

public actual fun WscGetSecurityProviderHealth(providers: UInt, phealth: Long): HRESULT =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_WscGetSecurityProviderHealth(providers.toInt(), phealth)

public actual fun WscQueryAntiMalwareUri(): HRESULT =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_WscQueryAntiMalwareUri()

public actual fun WscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: LPTHREAD_START_ROUTINE, pcontext: Long): HRESULT =
    0

public actual fun WscRegisterForUserNotifications(): HRESULT =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_WscRegisterForUserNotifications()

public actual fun WscUnRegisterChanges(hregistrationhandle: HANDLE): HRESULT =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_WscUnRegisterChanges(hregistrationhandle)
