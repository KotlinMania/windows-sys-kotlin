@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemUseraccessloggingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_ualInstrument(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_ualRegisterProduct(wszproductname: Long, wszrolename: Long, wszguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_ualStart(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_ualStop(data: Long): Int
}

public actual fun ualInstrument(data: COpaquePointer?): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_ualInstrument((data?.value ?: 0L))

public actual fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_ualRegisterProduct((wszproductname?.value ?: 0L), (wszrolename?.value ?: 0L), (wszguid?.value ?: 0L))

public actual fun ualStart(data: COpaquePointer?): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_ualStart((data?.value ?: 0L))

public actual fun ualStop(data: COpaquePointer?): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_ualStop((data?.value ?: 0L))
