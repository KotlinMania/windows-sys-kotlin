package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: COpaquePointer?): Bool

public expect fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: COpaquePointer?): Bool

public expect fun isNetworkAlive(lpdwflags: COpaquePointer?): Bool
