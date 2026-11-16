@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBClose
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBOpen
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: MutPtr): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(hcomdb.rawAddress.toCPointer<ByteVar>(), comnumber.rawAddress.toCPointer<ByteVar>())

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: MutPtr): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(hcomdb.rawAddress.toCPointer<ByteVar>(), comnumber, forceclaim, forced.rawAddress.toCPointer<ByteVar>())

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBClose(hcomdb.rawAddress.toCPointer<ByteVar>())

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: MutPtr, buffersize: UInt, reporttype: UInt, maxportsreported: MutPtr): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(hcomdb.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize, reporttype, maxportsreported.rawAddress.toCPointer<ByteVar>())

public actual fun comDBOpen(phcomdb: MutPtr): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(phcomdb.rawAddress.toCPointer<ByteVar>())

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(hcomdb.rawAddress.toCPointer<ByteVar>(), comnumber)

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(hcomdb.rawAddress.toCPointer<ByteVar>(), newsize)
