package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun CreateMailslotA(lpname: PCSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMailslotA", longArrayOf(lpname, nmaxmessagesize.toLong(), lreadtimeout.toLong(), lpsecurityattributes))
}

public fun CreateMailslotW(lpname: PCWSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMailslotW", longArrayOf(lpname, nmaxmessagesize.toLong(), lreadtimeout.toLong(), lpsecurityattributes))
}

public fun GetMailslotInfo(hmailslot: HANDLE, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetMailslotInfo", longArrayOf(hmailslot, lpmaxmessagesize, lpnextsize, lpmessagecount, lpreadtimeout)).toInt()
}

public fun SetMailslotInfo(hmailslot: HANDLE, lreadtimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetMailslotInfo", longArrayOf(hmailslot, lreadtimeout.toLong())).toInt()
}
