package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ApplicationRecoveryFinished(bsuccess: BOOL) {
    Win32DynamicFfi.invoke("kernel32.dll", "ApplicationRecoveryFinished", longArrayOf(bsuccess.toLong()))
}

public fun ApplicationRecoveryInProgress(pbcancelled: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "ApplicationRecoveryInProgress", longArrayOf(pbcancelled)).toInt()
}

public fun GetApplicationRecoveryCallback(hprocess: Foundation.HANDLE, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetApplicationRecoveryCallback", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), precoverycallback, ppvparameter, pdwpinginterval, pdwflags)).toInt()
}

public fun GetApplicationRestartSettings(hprocess: Foundation.HANDLE, pwzcommandline: PWSTR, pcchsize: Long, pdwflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetApplicationRestartSettings", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pwzcommandline, pcchsize, pdwflags)).toInt()
}

public fun RegisterApplicationRecoveryCallback(precoveycallback: WindowsProgramming.APPLICATION_RECOVERY_CALLBACK, pvparameter: Long, dwpinginterval: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "RegisterApplicationRecoveryCallback", longArrayOf(Win32DynamicFfi.objectSlot(precoveycallback), pvparameter, dwpinginterval.toLong(), dwflags.toLong())).toInt()
}

public fun RegisterApplicationRestart(pwzcommandline: PCWSTR, dwflags: REGISTER_APPLICATION_RESTART_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "RegisterApplicationRestart", longArrayOf(pwzcommandline, dwflags.toLong())).toInt()
}

public fun UnregisterApplicationRecoveryCallback(): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterApplicationRecoveryCallback", longArrayOf()).toInt()
}

public fun UnregisterApplicationRestart(): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterApplicationRestart", longArrayOf()).toInt()
}
