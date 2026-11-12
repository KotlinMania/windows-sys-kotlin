@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(pbcancelled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(hprocess: Long, precoverycallback: Long, ppvparameter: Long, pdwpinginterval: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(hprocess: Long, pwzcommandline: Long, pcchsize: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(precoveycallback: Long, pvparameter: Long, dwpinginterval: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(pwzcommandline: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart(): Int
}

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess)
}

public actual fun applicationRecoveryInProgress(pbcancelled: MutPtr): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(pbcancelled.rawAddress)

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: MutPtr, ppvparameter: MutPtr, pdwpinginterval: MutPtr, pdwflags: MutPtr): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(hprocess.rawAddress, precoverycallback.rawAddress, ppvparameter.rawAddress, pdwpinginterval.rawAddress, pdwflags.rawAddress)

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: MutPtr, pdwflags: MutPtr): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(hprocess.rawAddress, pwzcommandline.rawAddress, pcchsize.rawAddress, pdwflags.rawAddress)

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: ConstPtr, dwpinginterval: UInt, dwflags: UInt): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(0L, pvparameter.rawAddress, dwpinginterval.toInt(), dwflags.toInt())

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(pwzcommandline.rawAddress, dwflags.toInt())

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback()

public actual fun unregisterApplicationRestart(): Hresult =
    WindowsWin32SystemRecoveryJniBridge.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart()
