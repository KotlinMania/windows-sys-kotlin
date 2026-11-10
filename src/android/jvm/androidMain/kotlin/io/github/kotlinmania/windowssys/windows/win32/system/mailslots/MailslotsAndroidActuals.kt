@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemMailslotsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_createMailslotA(lpname: Long, nmaxmessagesize: Int, lreadtimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_createMailslotW(lpname: Long, nmaxmessagesize: Int, lreadtimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_getMailslotInfo(hmailslot: Long, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_mailslots_setMailslotInfo(hmailslot: Long, lreadtimeout: Int): Int
}

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_createMailslotA((lpname?.value ?: 0L), nmaxmessagesize.toInt(), lreadtimeout.toInt(), (lpsecurityattributes?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_createMailslotW((lpname?.value ?: 0L), nmaxmessagesize.toInt(), lreadtimeout.toInt(), (lpsecurityattributes?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: COpaquePointer?, lpnextsize: COpaquePointer?, lpmessagecount: COpaquePointer?, lpreadtimeout: COpaquePointer?): Bool =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_getMailslotInfo((hmailslot?.value ?: 0L), (lpmaxmessagesize?.value ?: 0L), (lpnextsize?.value ?: 0L), (lpmessagecount?.value ?: 0L), (lpreadtimeout?.value ?: 0L))

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    WindowsWin32SystemMailslotsJniBridge.windowssys_windows_win32_system_mailslots_setMailslotInfo((hmailslot?.value ?: 0L), lreadtimeout.toInt())
