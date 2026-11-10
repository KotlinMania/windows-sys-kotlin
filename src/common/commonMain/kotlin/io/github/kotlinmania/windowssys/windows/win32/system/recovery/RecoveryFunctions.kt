package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

public expect fun applicationRecoveryFinished(bsuccess: Bool)

public expect fun applicationRecoveryInProgress(pbcancelled: COpaquePointer?): Hresult

public expect fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: COpaquePointer?, ppvparameter: COpaquePointer?, pdwpinginterval: COpaquePointer?, pdwflags: COpaquePointer?): Hresult

public expect fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: COpaquePointer?, pdwflags: COpaquePointer?): Hresult

public expect fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: COpaquePointer?, dwpinginterval: UInt, dwflags: UInt): Hresult

public expect fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult

public expect fun unregisterApplicationRecoveryCallback(): Hresult

public expect fun unregisterApplicationRestart(): Hresult
