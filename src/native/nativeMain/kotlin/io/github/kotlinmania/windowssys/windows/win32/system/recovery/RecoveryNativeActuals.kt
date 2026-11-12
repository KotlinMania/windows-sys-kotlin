@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback
import io.github.kotlinmania.windowssys.windows.win32.system.recovery.cinterop.windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun applicationRecoveryFinished(bsuccess: Bool) {
    windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess)
}

public actual fun applicationRecoveryInProgress(pbcancelled: MutPtr): Hresult =
    windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(pbcancelled.rawAddress.toCPointer<ByteVar>())

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: MutPtr, ppvparameter: MutPtr, pdwpinginterval: MutPtr, pdwflags: MutPtr): Hresult =
    windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(hprocess.rawAddress.toCPointer<ByteVar>(), precoverycallback.rawAddress.toCPointer<ByteVar>(), ppvparameter.rawAddress.toCPointer<ByteVar>(), pdwpinginterval.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: MutPtr, pdwflags: MutPtr): Hresult =
    windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(hprocess.rawAddress.toCPointer<ByteVar>(), pwzcommandline.rawAddress.toCPointer<ByteVar>(), pcchsize.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: ConstPtr, dwpinginterval: UInt, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(0L.toCPointer<ByteVar>(), pvparameter.rawAddress.toCPointer<ByteVar>(), dwpinginterval, dwflags)

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(pwzcommandline.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback()

public actual fun unregisterApplicationRestart(): Hresult =
    windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart()
