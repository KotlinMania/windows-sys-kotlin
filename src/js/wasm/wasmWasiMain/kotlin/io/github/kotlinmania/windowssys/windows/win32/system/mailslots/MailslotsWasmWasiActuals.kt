@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun CreateMailslotA(lpname: PCSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    0L

public actual fun CreateMailslotW(lpname: PCWSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    0L

public actual fun GetMailslotInfo(hmailslot: HANDLE, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): BOOL =
    0

public actual fun SetMailslotInfo(hmailslot: HANDLE, lreadtimeout: UInt): BOOL =
    0
