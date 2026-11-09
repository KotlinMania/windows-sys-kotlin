@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32DevicesSerialcommunicationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBClaimNextFreePort(hcomdb: Long, comnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBClaimPort(hcomdb: Long, comnumber: Int, forceclaim: Int, forced: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBClose(hcomdb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBGetCurrentPortUsage(hcomdb: Long, buffer: Long, buffersize: Int, reporttype: Int, maxportsreported: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBOpen(phcomdb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBReleasePort(hcomdb: Long, comnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_serialcommunication_ComDBResizeDatabase(hcomdb: Long, newsize: Int): Int
}

public actual fun ComDBClaimNextFreePort(hcomdb: HCOMDB, comnumber: Long): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBClaimNextFreePort(hcomdb, comnumber)

public actual fun ComDBClaimPort(hcomdb: HCOMDB, comnumber: UInt, forceclaim: BOOL, forced: Long): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBClaimPort(hcomdb, comnumber.toInt(), forceclaim, forced)

public actual fun ComDBClose(hcomdb: HCOMDB): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBClose(hcomdb)

public actual fun ComDBGetCurrentPortUsage(hcomdb: HCOMDB, buffer: Long, buffersize: UInt, reporttype: UInt, maxportsreported: Long): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBGetCurrentPortUsage(hcomdb, buffer, buffersize.toInt(), reporttype.toInt(), maxportsreported)

public actual fun ComDBOpen(phcomdb: Long): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBOpen(phcomdb)

public actual fun ComDBReleasePort(hcomdb: HCOMDB, comnumber: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBReleasePort(hcomdb, comnumber.toInt())

public actual fun ComDBResizeDatabase(hcomdb: HCOMDB, newsize: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssys_windows_win32_devices_serialcommunication_ComDBResizeDatabase(hcomdb, newsize.toInt())
