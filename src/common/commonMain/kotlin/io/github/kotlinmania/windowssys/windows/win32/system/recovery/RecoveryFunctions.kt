package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

public expect fun applicationRecoveryFinished(bsuccess: Bool)

public expect fun applicationRecoveryInProgress(pbcancelled: MutPtr<Bool>): Hresult

public expect fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: MutPtr<ApplicationRecoveryCallback>, ppvparameter: MutPtr<MutPtr<CVoid>>, pdwpinginterval: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Hresult

public expect fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Hresult

public expect fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: ConstPtr<CVoid>, dwpinginterval: UInt, dwflags: UInt): Hresult

public expect fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult

public expect fun unregisterApplicationRecoveryCallback(): Hresult

public expect fun unregisterApplicationRestart(): Hresult
