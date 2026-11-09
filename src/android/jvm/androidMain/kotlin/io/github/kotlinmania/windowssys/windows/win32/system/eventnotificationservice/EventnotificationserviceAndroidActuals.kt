@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SystemEventnotificationserviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableA(lpszdestination: Long, lpqocinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableW(lpszdestination: Long, lpqocinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventnotificationservice_IsNetworkAlive(lpdwflags: Long): Int
}

public actual fun IsDestinationReachableA(lpszdestination: PCSTR, lpqocinfo: Long): BOOL =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableA(lpszdestination, lpqocinfo)

public actual fun IsDestinationReachableW(lpszdestination: PCWSTR, lpqocinfo: Long): BOOL =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableW(lpszdestination, lpqocinfo)

public actual fun IsNetworkAlive(lpdwflags: Long): BOOL =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssys_windows_win32_system_eventnotificationservice_IsNetworkAlive(lpdwflags)
