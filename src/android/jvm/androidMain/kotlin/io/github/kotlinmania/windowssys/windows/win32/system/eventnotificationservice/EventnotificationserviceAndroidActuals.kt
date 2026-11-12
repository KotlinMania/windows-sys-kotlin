@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemEventnotificationserviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableA(lpszdestination: Long, lpqocinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableW(lpszdestination: Long, lpqocinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventnotificationserviceIsNetworkAlive(lpdwflags: Long): Int
}

public actual fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: MutPtr): Bool =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableA(lpszdestination.rawAddress, lpqocinfo.rawAddress)

public actual fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: MutPtr): Bool =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableW(lpszdestination.rawAddress, lpqocinfo.rawAddress)

public actual fun isNetworkAlive(lpdwflags: MutPtr): Bool =
    WindowsWin32SystemEventnotificationserviceJniBridge.windowssysWindowsWin32SystemEventnotificationserviceIsNetworkAlive(lpdwflags.rawAddress)
