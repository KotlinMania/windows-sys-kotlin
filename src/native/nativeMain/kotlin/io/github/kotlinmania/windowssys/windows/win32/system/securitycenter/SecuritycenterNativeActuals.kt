@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun WscGetAntiMalwareUri(ppszuri: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_WscGetAntiMalwareUri(ppszuri.toCPointer<ByteVar>())

public actual fun WscGetSecurityProviderHealth(providers: UInt, phealth: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_WscGetSecurityProviderHealth(providers, phealth.toCPointer<ByteVar>())

public actual fun WscQueryAntiMalwareUri(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_WscQueryAntiMalwareUri()

public actual fun WscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: LPTHREAD_START_ROUTINE, pcontext: Long): HRESULT =
    0

public actual fun WscRegisterForUserNotifications(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_WscRegisterForUserNotifications()

public actual fun WscUnRegisterChanges(hregistrationhandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_WscUnRegisterChanges(hregistrationhandle.toCPointer<ByteVar>())
