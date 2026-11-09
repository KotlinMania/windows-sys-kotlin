@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SystemUseraccessloggingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_UalInstrument(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_UalRegisterProduct(wszproductname: Long, wszrolename: Long, wszguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_UalStart(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_useraccesslogging_UalStop(data: Long): Int
}

public actual fun UalInstrument(data: Long): HRESULT =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_UalInstrument(data)

public actual fun UalRegisterProduct(wszproductname: PCWSTR, wszrolename: PCWSTR, wszguid: PCWSTR): HRESULT =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_UalRegisterProduct(wszproductname, wszrolename, wszguid)

public actual fun UalStart(data: Long): HRESULT =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_UalStart(data)

public actual fun UalStop(data: Long): HRESULT =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssys_windows_win32_system_useraccesslogging_UalStop(data)
