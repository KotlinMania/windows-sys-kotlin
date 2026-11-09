package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun ComDBClaimNextFreePort(hcomdb: HCOMDB, comnumber: Long): Int

public expect fun ComDBClaimPort(hcomdb: HCOMDB, comnumber: UInt, forceclaim: BOOL, forced: Long): Int

public expect fun ComDBClose(hcomdb: HCOMDB): Int

public expect fun ComDBGetCurrentPortUsage(hcomdb: HCOMDB, buffer: Long, buffersize: UInt, reporttype: UInt, maxportsreported: Long): Int

public expect fun ComDBOpen(phcomdb: Long): Int

public expect fun ComDBReleasePort(hcomdb: HCOMDB, comnumber: UInt): Int

public expect fun ComDBResizeDatabase(hcomdb: HCOMDB, newsize: UInt): Int
