@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort(hcomdb?.value?.toCPointer<ByteVar>(), comnumber?.value?.toCPointer<ByteVar>())

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBClaimPort(hcomdb?.value?.toCPointer<ByteVar>(), comnumber, forceclaim, forced?.value?.toCPointer<ByteVar>())

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBClose(hcomdb?.value?.toCPointer<ByteVar>())

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage(hcomdb?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, reporttype, maxportsreported?.value?.toCPointer<ByteVar>())

public actual fun comDBOpen(phcomdb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBOpen(phcomdb?.value?.toCPointer<ByteVar>())

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBReleasePort(hcomdb?.value?.toCPointer<ByteVar>(), comnumber)

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase(hcomdb?.value?.toCPointer<ByteVar>(), newsize)
