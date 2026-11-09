package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun GetExtensionVersion(pver: Long): BOOL

public expect fun GetFilterVersion(pver: Long): BOOL

public expect fun HttpExtensionProc(pecb: Long): UInt

public expect fun HttpFilterProc(pfc: Long, notificationtype: UInt, pvnotification: Long): UInt
