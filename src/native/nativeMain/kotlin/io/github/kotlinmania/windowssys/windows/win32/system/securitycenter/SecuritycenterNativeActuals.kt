@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_wscRegisterForChanges
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wscGetAntiMalwareUri(ppszuri: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri(ppszuri?.value?.toCPointer<ByteVar>())

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(providers, phealth?.value?.toCPointer<ByteVar>())

public actual fun wscQueryAntiMalwareUri(): Hresult =
    windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri()

public actual fun wscRegisterForChanges(reserved: COpaquePointer?, phcallbackregistration: COpaquePointer?, lpcallbackaddress: LpthreadStartRoutine, pcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_securitycenter_wscRegisterForChanges(reserved?.value?.toCPointer<ByteVar>(), phcallbackregistration?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun wscRegisterForUserNotifications(): Hresult =
    windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications()

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges(hregistrationhandle?.value?.toCPointer<ByteVar>())
