package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun IsDestinationReachableA(lpszdestination: PCSTR, lpqocinfo: Long): BOOL

public expect fun IsDestinationReachableW(lpszdestination: PCWSTR, lpqocinfo: Long): BOOL

public expect fun IsNetworkAlive(lpdwflags: Long): BOOL
