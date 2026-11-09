@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ComDBClaimNextFreePort(hcomdb: HCOMDB, comnumber: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBClaimNextFreePort(hcomdb.toCPointer<ByteVar>(), comnumber.toCPointer<ByteVar>())

public actual fun ComDBClaimPort(hcomdb: HCOMDB, comnumber: UInt, forceclaim: BOOL, forced: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBClaimPort(hcomdb.toCPointer<ByteVar>(), comnumber, forceclaim, forced.toCPointer<ByteVar>())

public actual fun ComDBClose(hcomdb: HCOMDB): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBClose(hcomdb.toCPointer<ByteVar>())

public actual fun ComDBGetCurrentPortUsage(hcomdb: HCOMDB, buffer: Long, buffersize: UInt, reporttype: UInt, maxportsreported: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBGetCurrentPortUsage(hcomdb.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, reporttype, maxportsreported.toCPointer<ByteVar>())

public actual fun ComDBOpen(phcomdb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBOpen(phcomdb.toCPointer<ByteVar>())

public actual fun ComDBReleasePort(hcomdb: HCOMDB, comnumber: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBReleasePort(hcomdb.toCPointer<ByteVar>(), comnumber)

public actual fun ComDBResizeDatabase(hcomdb: HCOMDB, newsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_ComDBResizeDatabase(hcomdb.toCPointer<ByteVar>(), newsize)
