@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun IsDestinationReachableA(lpszdestination: PCSTR, lpqocinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableA(lpszdestination.toCPointer<ByteVar>(), lpqocinfo.toCPointer<ByteVar>())

public actual fun IsDestinationReachableW(lpszdestination: PCWSTR, lpqocinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableW(lpszdestination.toCPointer<ByteVar>(), lpqocinfo.toCPointer<ByteVar>())

public actual fun IsNetworkAlive(lpdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssys_windows_win32_system_eventnotificationservice_IsNetworkAlive(lpdwflags.toCPointer<ByteVar>())
