@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableA
import io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableW
import io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice.cinterop.windowssysWindowsWin32SystemEventnotificationserviceIsNetworkAlive
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: MutPtr<Qocinfo>): Bool =
    windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableA(lpszdestination.rawAddress.toCPointer<ByteVar>(), lpqocinfo.rawAddress.toCPointer<ByteVar>())

public actual fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: MutPtr<Qocinfo>): Bool =
    windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableW(lpszdestination.rawAddress.toCPointer<ByteVar>(), lpqocinfo.rawAddress.toCPointer<ByteVar>())

public actual fun isNetworkAlive(lpdwflags: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventnotificationserviceIsNetworkAlive(lpdwflags.rawAddress.toCPointer<ByteVar>())
