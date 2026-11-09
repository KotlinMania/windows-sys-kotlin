@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.APPLICATION_RECOVERY_CALLBACK

private object WindowsWin32SystemRecoveryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_ApplicationRecoveryFinished(bsuccess: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_ApplicationRecoveryInProgress(pbcancelled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_GetApplicationRecoveryCallback(hprocess: Long, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_GetApplicationRestartSettings(hprocess: Long, pwzcommandline: Long, pcchsize: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_RegisterApplicationRestart(pwzcommandline: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_UnregisterApplicationRecoveryCallback(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_recovery_UnregisterApplicationRestart(): Int
}

public actual fun ApplicationRecoveryFinished(bsuccess: BOOL) {
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_ApplicationRecoveryFinished(bsuccess)
}

public actual fun ApplicationRecoveryInProgress(pbcancelled: Long): HRESULT =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_ApplicationRecoveryInProgress(pbcancelled)

public actual fun GetApplicationRecoveryCallback(hprocess: HANDLE, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): HRESULT =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_GetApplicationRecoveryCallback(hprocess, precoverycallback, ppvparameter, pdwpinginterval, pdwflags)

public actual fun GetApplicationRestartSettings(hprocess: HANDLE, pwzcommandline: PWSTR, pcchsize: Long, pdwflags: Long): HRESULT =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_GetApplicationRestartSettings(hprocess, pwzcommandline, pcchsize, pdwflags)

public actual fun RegisterApplicationRecoveryCallback(precoveycallback: APPLICATION_RECOVERY_CALLBACK, pvparameter: Long, dwpinginterval: UInt, dwflags: UInt): HRESULT =
    0

public actual fun RegisterApplicationRestart(pwzcommandline: PCWSTR, dwflags: REGISTER_APPLICATION_RESTART_FLAGS): HRESULT =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_RegisterApplicationRestart(pwzcommandline, dwflags.toInt())

public actual fun UnregisterApplicationRecoveryCallback(): HRESULT =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_UnregisterApplicationRecoveryCallback()

public actual fun UnregisterApplicationRestart(): HRESULT =
    WindowsWin32SystemRecoveryJniBridge.windowssys_windows_win32_system_recovery_UnregisterApplicationRestart()
