@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.APPLICATION_RECOVERY_CALLBACK
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ApplicationRecoveryFinished(bsuccess: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_ApplicationRecoveryFinished(bsuccess)
}

public actual fun ApplicationRecoveryInProgress(pbcancelled: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_ApplicationRecoveryInProgress(pbcancelled.toCPointer<ByteVar>())

public actual fun GetApplicationRecoveryCallback(hprocess: HANDLE, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_GetApplicationRecoveryCallback(hprocess.toCPointer<ByteVar>(), precoverycallback.toCPointer<ByteVar>(), ppvparameter.toCPointer<ByteVar>(), pdwpinginterval.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun GetApplicationRestartSettings(hprocess: HANDLE, pwzcommandline: PWSTR, pcchsize: Long, pdwflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_GetApplicationRestartSettings(hprocess.toCPointer<ByteVar>(), pwzcommandline.toCPointer<ByteVar>(), pcchsize.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun RegisterApplicationRecoveryCallback(precoveycallback: APPLICATION_RECOVERY_CALLBACK, pvparameter: Long, dwpinginterval: UInt, dwflags: UInt): HRESULT =
    0

public actual fun RegisterApplicationRestart(pwzcommandline: PCWSTR, dwflags: REGISTER_APPLICATION_RESTART_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_RegisterApplicationRestart(pwzcommandline.toCPointer<ByteVar>(), dwflags)

public actual fun UnregisterApplicationRecoveryCallback(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_UnregisterApplicationRecoveryCallback()

public actual fun UnregisterApplicationRestart(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssys_windows_win32_system_recovery_UnregisterApplicationRestart()
