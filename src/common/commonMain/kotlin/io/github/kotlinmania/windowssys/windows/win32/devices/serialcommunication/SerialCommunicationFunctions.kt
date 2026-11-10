package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int

public expect fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int

public expect fun comDBClose(hcomdb: Hcomdb): Int

public expect fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int

public expect fun comDBOpen(phcomdb: COpaquePointer?): Int

public expect fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int

public expect fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int
