@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_applicationRecoveryFinished(bsuccess)
}

public actual fun applicationRecoveryInProgress(pbcancelled: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_applicationRecoveryInProgress(pbcancelled?.value?.toCPointer<ByteVar>())

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: COpaquePointer?, ppvparameter: COpaquePointer?, pdwpinginterval: COpaquePointer?, pdwflags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_getApplicationRecoveryCallback(hprocess?.value?.toCPointer<ByteVar>(), precoverycallback?.value?.toCPointer<ByteVar>(), ppvparameter?.value?.toCPointer<ByteVar>(), pdwpinginterval?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: COpaquePointer?, pdwflags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_getApplicationRestartSettings(hprocess?.value?.toCPointer<ByteVar>(), pwzcommandline?.value?.toCPointer<ByteVar>(), pcchsize?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: COpaquePointer?, dwpinginterval: UInt, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_registerApplicationRecoveryCallback(0L.toCPointer<ByteVar>(), pvparameter?.value?.toCPointer<ByteVar>(), dwpinginterval, dwflags)

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_registerApplicationRestart(pwzcommandline?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_unregisterApplicationRecoveryCallback()

public actual fun unregisterApplicationRestart(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_unregisterApplicationRestart()
