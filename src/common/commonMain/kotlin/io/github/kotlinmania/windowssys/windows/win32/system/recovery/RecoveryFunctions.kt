package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.APPLICATION_RECOVERY_CALLBACK

public expect fun ApplicationRecoveryFinished(bsuccess: BOOL)

public expect fun ApplicationRecoveryInProgress(pbcancelled: Long): HRESULT

public expect fun GetApplicationRecoveryCallback(hprocess: HANDLE, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): HRESULT

public expect fun GetApplicationRestartSettings(hprocess: HANDLE, pwzcommandline: PWSTR, pcchsize: Long, pdwflags: Long): HRESULT

public expect fun RegisterApplicationRecoveryCallback(precoveycallback: APPLICATION_RECOVERY_CALLBACK, pvparameter: Long, dwpinginterval: UInt, dwflags: UInt): HRESULT

public expect fun RegisterApplicationRestart(pwzcommandline: PCWSTR, dwflags: REGISTER_APPLICATION_RESTART_FLAGS): HRESULT

public expect fun UnregisterApplicationRecoveryCallback(): HRESULT

public expect fun UnregisterApplicationRestart(): HRESULT
