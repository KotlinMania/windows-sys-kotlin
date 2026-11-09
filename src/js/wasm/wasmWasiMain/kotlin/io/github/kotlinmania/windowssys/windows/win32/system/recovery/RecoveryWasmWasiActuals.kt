@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.APPLICATION_RECOVERY_CALLBACK

public actual fun ApplicationRecoveryFinished(bsuccess: BOOL) {
}

public actual fun ApplicationRecoveryInProgress(pbcancelled: Long): HRESULT =
    0

public actual fun GetApplicationRecoveryCallback(hprocess: HANDLE, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): HRESULT =
    0

public actual fun GetApplicationRestartSettings(hprocess: HANDLE, pwzcommandline: PWSTR, pcchsize: Long, pdwflags: Long): HRESULT =
    0

public actual fun RegisterApplicationRecoveryCallback(precoveycallback: APPLICATION_RECOVERY_CALLBACK, pvparameter: Long, dwpinginterval: UInt, dwflags: UInt): HRESULT =
    0

public actual fun RegisterApplicationRestart(pwzcommandline: PCWSTR, dwflags: REGISTER_APPLICATION_RESTART_FLAGS): HRESULT =
    0

public actual fun UnregisterApplicationRecoveryCallback(): HRESULT =
    0

public actual fun UnregisterApplicationRestart(): HRESULT =
    0
