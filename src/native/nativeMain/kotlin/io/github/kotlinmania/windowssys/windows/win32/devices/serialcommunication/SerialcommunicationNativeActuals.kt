@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBClaimPort
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBClose
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBOpen
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBReleasePort
import io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication.cinterop.windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort(hcomdb?.value?.toCPointer<ByteVar>(), comnumber?.value?.toCPointer<ByteVar>())

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBClaimPort(hcomdb?.value?.toCPointer<ByteVar>(), comnumber, forceclaim, forced?.value?.toCPointer<ByteVar>())

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBClose(hcomdb?.value?.toCPointer<ByteVar>())

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage(hcomdb?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, reporttype, maxportsreported?.value?.toCPointer<ByteVar>())

public actual fun comDBOpen(phcomdb: COpaquePointer?): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBOpen(phcomdb?.value?.toCPointer<ByteVar>())

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBReleasePort(hcomdb?.value?.toCPointer<ByteVar>(), comnumber)

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase(hcomdb?.value?.toCPointer<ByteVar>(), newsize)
