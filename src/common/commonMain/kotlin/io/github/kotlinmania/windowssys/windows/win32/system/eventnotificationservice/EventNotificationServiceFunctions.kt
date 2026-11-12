package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: MutPtr<Qocinfo>): Bool

public expect fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: MutPtr<Qocinfo>): Bool

public expect fun isNetworkAlive(lpdwflags: MutPtr<UInt>): Bool
