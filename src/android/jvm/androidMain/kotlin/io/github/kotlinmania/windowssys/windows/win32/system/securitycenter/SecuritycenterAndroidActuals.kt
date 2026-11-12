@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

private object WindowsWin32SystemSecuritycenterJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(ppszuri: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(providers: Int, phealth: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(hregistrationhandle: Long): Int
}

public actual fun wscGetAntiMalwareUri(ppszuri: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(ppszuri.rawAddress)

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr<WscSecurityProviderHealth>): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(providers.toInt(), phealth.rawAddress)

public actual fun wscQueryAntiMalwareUri(): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri()

public actual fun wscRegisterForChanges(reserved: MutPtr<CVoid>, phcallbackregistration: MutPtr<Handle>, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(reserved.rawAddress, phcallbackregistration.rawAddress, 0L, pcontext.rawAddress)

public actual fun wscRegisterForUserNotifications(): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications()

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    WindowsWin32SystemSecuritycenterJniBridge.windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(hregistrationhandle.rawAddress)
