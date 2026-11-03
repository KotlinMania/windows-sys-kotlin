package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun ComDBClaimNextFreePort(hcomdb: HCOMDB, comnumber: Long): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBClaimNextFreePort", longArrayOf(hcomdb, comnumber)).toInt()
}

public fun ComDBClaimPort(hcomdb: HCOMDB, comnumber: UInt, forceclaim: BOOL, forced: Long): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBClaimPort", longArrayOf(hcomdb, comnumber.toLong(), forceclaim.toLong(), forced)).toInt()
}

public fun ComDBClose(hcomdb: HCOMDB): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBClose", longArrayOf(hcomdb)).toInt()
}

public fun ComDBGetCurrentPortUsage(hcomdb: HCOMDB, buffer: Long, buffersize: UInt, reporttype: UInt, maxportsreported: Long): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBGetCurrentPortUsage", longArrayOf(hcomdb, buffer, buffersize.toLong(), reporttype.toLong(), maxportsreported)).toInt()
}

public fun ComDBOpen(phcomdb: Long): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBOpen", longArrayOf(phcomdb)).toInt()
}

public fun ComDBReleasePort(hcomdb: HCOMDB, comnumber: UInt): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBReleasePort", longArrayOf(hcomdb, comnumber.toLong())).toInt()
}

public fun ComDBResizeDatabase(hcomdb: HCOMDB, newsize: UInt): Int {
    return Win32DynamicFfi.invoke("msports.dll", "ComDBResizeDatabase", longArrayOf(hcomdb, newsize.toLong())).toInt()
}
