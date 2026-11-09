@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun IsDestinationReachableA(lpszdestination: PCSTR, lpqocinfo: Long): BOOL =
    0

public actual fun IsDestinationReachableW(lpszdestination: PCWSTR, lpqocinfo: Long): BOOL =
    0

public actual fun IsNetworkAlive(lpdwflags: Long): BOOL =
    0
