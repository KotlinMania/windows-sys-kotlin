@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.securitycenter.cinterop.windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wscGetAntiMalwareUri(ppszuri: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(ppszuri.rawAddress.toCPointer<ByteVar>())

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr<WscSecurityProviderHealth>): Hresult =
    windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(providers, phealth.rawAddress.toCPointer<ByteVar>())

public actual fun wscQueryAntiMalwareUri(): Hresult =
    windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri()

public actual fun wscRegisterForChanges(reserved: MutPtr<CVoid>, phcallbackregistration: MutPtr<Handle>, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(reserved.rawAddress.toCPointer<ByteVar>(), phcallbackregistration.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun wscRegisterForUserNotifications(): Hresult =
    windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications()

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(hregistrationhandle.rawAddress.toCPointer<ByteVar>())
