@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

private object WindowsWin32SystemSecuritycenterJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri(ppszuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(providers: Int, phealth: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_wscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges(hregistrationhandle: Long): Int
}

public actual fun wscGetAntiMalwareUri(ppszuri: COpaquePointer?): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri((ppszuri?.value ?: 0L))

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: COpaquePointer?): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(providers.toInt(), (phealth?.value ?: 0L))

public actual fun wscQueryAntiMalwareUri(): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri()

public actual fun wscRegisterForChanges(reserved: COpaquePointer?, phcallbackregistration: COpaquePointer?, lpcallbackaddress: LpthreadStartRoutine, pcontext: COpaquePointer?): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_wscRegisterForChanges((reserved?.value ?: 0L), (phcallbackregistration?.value ?: 0L), 0L, (pcontext?.value ?: 0L))

public actual fun wscRegisterForUserNotifications(): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications()

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges((hregistrationhandle?.value ?: 0L))
