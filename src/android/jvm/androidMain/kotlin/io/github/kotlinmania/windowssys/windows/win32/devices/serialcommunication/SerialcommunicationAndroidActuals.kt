@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32DevicesSerialcommunicationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(hcomdb: Long, comnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(hcomdb: Long, comnumber: Int, forceclaim: Int, forced: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBClose(hcomdb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(hcomdb: Long, buffer: Long, buffersize: Int, reporttype: Int, maxportsreported: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(phcomdb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(hcomdb: Long, comnumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(hcomdb: Long, newsize: Int): Int
}

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: MutPtr<UInt>): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(hcomdb.rawAddress, comnumber.rawAddress)

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: MutPtr<Bool>): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(hcomdb.rawAddress, comnumber.toInt(), forceclaim, forced.rawAddress)

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBClose(hcomdb.rawAddress)

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: MutPtr<UByte>, buffersize: UInt, reporttype: UInt, maxportsreported: MutPtr<UInt>): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(hcomdb.rawAddress, buffer.rawAddress, buffersize.toInt(), reporttype.toInt(), maxportsreported.rawAddress)

public actual fun comDBOpen(phcomdb: MutPtr<Hcomdb>): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(phcomdb.rawAddress)

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(hcomdb.rawAddress, comnumber.toInt())

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(hcomdb.rawAddress, newsize.toInt())
