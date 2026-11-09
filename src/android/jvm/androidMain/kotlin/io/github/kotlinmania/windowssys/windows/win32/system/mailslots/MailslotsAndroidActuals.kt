@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemMailslotsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_CreateMailslotA(lpname: Long, nmaxmessagesize: Int, lreadtimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_CreateMailslotW(lpname: Long, nmaxmessagesize: Int, lreadtimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_GetMailslotInfo(hmailslot: Long, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_SetMailslotInfo(hmailslot: Long, lreadtimeout: Int): Int
}

public actual fun CreateMailslotA(lpname: PCSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_CreateMailslotA(lpname, nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes)

public actual fun CreateMailslotW(lpname: PCWSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_CreateMailslotW(lpname, nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes)

public actual fun GetMailslotInfo(hmailslot: HANDLE, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): BOOL =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_GetMailslotInfo(hmailslot, lpmaxmessagesize, lpnextsize, lpmessagecount, lpreadtimeout)

public actual fun SetMailslotInfo(hmailslot: HANDLE, lreadtimeout: UInt): BOOL =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_SetMailslotInfo(hmailslot, lreadtimeout.toInt())
