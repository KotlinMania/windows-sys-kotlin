package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun CreateMailslotA(lpname: PCSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateMailslotA", longArrayOf(lpname, nmaxmessagesize.toLong(), lreadtimeout.toLong(), lpsecurityattributes))
    return Foundation.HANDLE()
}

public fun CreateMailslotW(lpname: PCWSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateMailslotW", longArrayOf(lpname, nmaxmessagesize.toLong(), lreadtimeout.toLong(), lpsecurityattributes))
    return Foundation.HANDLE()
}

public fun GetMailslotInfo(hmailslot: Foundation.HANDLE, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetMailslotInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmailslot), lpmaxmessagesize, lpnextsize, lpmessagecount, lpreadtimeout)).toInt()
}

public fun SetMailslotInfo(hmailslot: Foundation.HANDLE, lreadtimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetMailslotInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmailslot), lreadtimeout.toLong())).toInt()
}
