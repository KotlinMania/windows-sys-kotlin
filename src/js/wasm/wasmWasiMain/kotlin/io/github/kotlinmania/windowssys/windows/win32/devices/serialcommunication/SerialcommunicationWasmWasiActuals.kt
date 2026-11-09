@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun ComDBClaimNextFreePort(hcomdb: HCOMDB, comnumber: Long): Int =
    0

public actual fun ComDBClaimPort(hcomdb: HCOMDB, comnumber: UInt, forceclaim: BOOL, forced: Long): Int =
    0

public actual fun ComDBClose(hcomdb: HCOMDB): Int =
    0

public actual fun ComDBGetCurrentPortUsage(hcomdb: HCOMDB, buffer: Long, buffersize: UInt, reporttype: UInt, maxportsreported: Long): Int =
    0

public actual fun ComDBOpen(phcomdb: Long): Int =
    0

public actual fun ComDBReleasePort(hcomdb: HCOMDB, comnumber: UInt): Int =
    0

public actual fun ComDBResizeDatabase(hcomdb: HCOMDB, newsize: UInt): Int =
    0
