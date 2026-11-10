@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemEventnotificationserviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_eventnotificationservice_isDestinationReachableA(lpszdestination: Long, lpqocinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventnotificationservice_isDestinationReachableW(lpszdestination: Long, lpqocinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventnotificationservice_isNetworkAlive(lpdwflags: Long): Int
}

public actual fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: COpaquePointer?): Bool =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssys_windows_win32_system_eventnotificationservice_isDestinationReachableA((lpszdestination?.value ?: 0L), (lpqocinfo?.value ?: 0L))

public actual fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: COpaquePointer?): Bool =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssys_windows_win32_system_eventnotificationservice_isDestinationReachableW((lpszdestination?.value ?: 0L), (lpqocinfo?.value ?: 0L))

public actual fun isNetworkAlive(lpdwflags: COpaquePointer?): Bool =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssys_windows_win32_system_eventnotificationservice_isNetworkAlive((lpdwflags?.value ?: 0L))
