@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssys_windows_win32_system_eventnotificationservice_isDestinationReachableA(lpszdestination?.value?.toCPointer<ByteVar>(), lpqocinfo?.value?.toCPointer<ByteVar>())

public actual fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssys_windows_win32_system_eventnotificationservice_isDestinationReachableW(lpszdestination?.value?.toCPointer<ByteVar>(), lpqocinfo?.value?.toCPointer<ByteVar>())

public actual fun isNetworkAlive(lpdwflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssys_windows_win32_system_eventnotificationservice_isNetworkAlive(lpdwflags?.value?.toCPointer<ByteVar>())
