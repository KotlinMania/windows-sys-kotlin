package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: MutPtr<UInt>): Int

public expect fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: MutPtr<Bool>): Int

public expect fun comDBClose(hcomdb: Hcomdb): Int

public expect fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: MutPtr<UByte>, buffersize: UInt, reporttype: UInt, maxportsreported: MutPtr<UInt>): Int

public expect fun comDBOpen(phcomdb: MutPtr<Hcomdb>): Int

public expect fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int

public expect fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int
