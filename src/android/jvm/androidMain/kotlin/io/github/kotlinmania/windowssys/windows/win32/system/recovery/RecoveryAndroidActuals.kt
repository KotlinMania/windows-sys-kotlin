@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

private object WindowsWin32SystemRecoveryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_applicationRecoveryFinished(bsuccess: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_applicationRecoveryInProgress(pbcancelled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_getApplicationRecoveryCallback(hprocess: Long, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_getApplicationRestartSettings(hprocess: Long, pwzcommandline: Long, pcchsize: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_registerApplicationRecoveryCallback(precoveycallback: Long, pvparameter: Long, dwpinginterval: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_registerApplicationRestart(pwzcommandline: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_unregisterApplicationRecoveryCallback(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_unregisterApplicationRestart(): Int
}

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_applicationRecoveryFinished(bsuccess)
}

public actual fun applicationRecoveryInProgress(pbcancelled: COpaquePointer?): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_applicationRecoveryInProgress((pbcancelled?.value ?: 0L))

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: COpaquePointer?, ppvparameter: COpaquePointer?, pdwpinginterval: COpaquePointer?, pdwflags: COpaquePointer?): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_getApplicationRecoveryCallback((hprocess?.value ?: 0L), (precoverycallback?.value ?: 0L), (ppvparameter?.value ?: 0L), (pdwpinginterval?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: COpaquePointer?, pdwflags: COpaquePointer?): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_getApplicationRestartSettings((hprocess?.value ?: 0L), (pwzcommandline?.value ?: 0L), (pcchsize?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: COpaquePointer?, dwpinginterval: UInt, dwflags: UInt): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_registerApplicationRecoveryCallback(0L, (pvparameter?.value ?: 0L), dwpinginterval.toInt(), dwflags.toInt())

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_registerApplicationRestart((pwzcommandline?.value ?: 0L), dwflags.toInt())

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_unregisterApplicationRecoveryCallback()

public actual fun unregisterApplicationRestart(): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_unregisterApplicationRestart()
