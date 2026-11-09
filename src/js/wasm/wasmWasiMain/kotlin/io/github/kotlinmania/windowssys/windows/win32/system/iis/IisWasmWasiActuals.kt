@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun GetExtensionVersion(pver: Long): BOOL =
    0

public actual fun GetFilterVersion(pver: Long): BOOL =
    0

public actual fun HttpExtensionProc(pecb: Long): UInt =
    0u

public actual fun HttpFilterProc(pfc: Long, notificationtype: UInt, pvnotification: Long): UInt =
    0u
