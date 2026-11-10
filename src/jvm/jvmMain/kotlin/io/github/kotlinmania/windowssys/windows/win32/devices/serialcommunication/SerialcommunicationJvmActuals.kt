@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32DevicesSerialcommunicationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort(hcomdb: Long, comnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBClaimPort(hcomdb: Long, comnumber: Int, forceclaim: Int, forced: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBClose(hcomdb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage(hcomdb: Long, buffer: Long, buffersize: Int, reporttype: Int, maxportsreported: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBOpen(phcomdb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBReleasePort(hcomdb: Long, comnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase(hcomdb: Long, newsize: Int): Int
}

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort((hcomdb?.value ?: 0L), (comnumber?.value ?: 0L))

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBClaimPort((hcomdb?.value ?: 0L), comnumber.toInt(), forceclaim, (forced?.value ?: 0L))

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBClose((hcomdb?.value ?: 0L))

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage((hcomdb?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), reporttype.toInt(), (maxportsreported?.value ?: 0L))

public actual fun comDBOpen(phcomdb: COpaquePointer?): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBOpen((phcomdb?.value ?: 0L))

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBReleasePort((hcomdb?.value ?: 0L), comnumber.toInt())

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase((hcomdb?.value ?: 0L), newsize.toInt())
