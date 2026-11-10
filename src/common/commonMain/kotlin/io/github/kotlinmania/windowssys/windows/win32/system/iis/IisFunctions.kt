package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun getExtensionVersion(pver: COpaquePointer?): Bool

public expect fun getFilterVersion(pver: COpaquePointer?): Bool

public expect fun httpExtensionProc(pecb: COpaquePointer?): UInt

public expect fun httpFilterProc(pfc: COpaquePointer?, notificationtype: UInt, pvnotification: COpaquePointer?): UInt
