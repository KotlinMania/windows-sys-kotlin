package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun IsDestinationReachableA(lpszdestination: PCSTR, lpqocinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("sensapi.dll", "IsDestinationReachableA", longArrayOf(lpszdestination, lpqocinfo)).toInt()
}

public fun IsDestinationReachableW(lpszdestination: PCWSTR, lpqocinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("sensapi.dll", "IsDestinationReachableW", longArrayOf(lpszdestination, lpqocinfo)).toInt()
}

public fun IsNetworkAlive(lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("sensapi.dll", "IsNetworkAlive", longArrayOf(lpdwflags)).toInt()
}
