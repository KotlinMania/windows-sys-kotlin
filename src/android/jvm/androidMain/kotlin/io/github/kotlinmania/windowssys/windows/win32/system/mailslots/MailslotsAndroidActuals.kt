@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

private object WindowsWin32SystemMailslotsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemMailslotsCreateMailslotA(lpname: Long, nmaxmessagesize: Int, lreadtimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMailslotsCreateMailslotW(lpname: Long, nmaxmessagesize: Int, lreadtimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMailslotsGetMailslotInfo(hmailslot: Long, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMailslotsSetMailslotInfo(hmailslot: Long, lreadtimeout: Int): Int
}

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(WindowsWin32SystemMailslotsJniBridge.windowssysWindowsWin32SystemMailslotsCreateMailslotA(lpname.rawAddress, nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.rawAddress))

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(WindowsWin32SystemMailslotsJniBridge.windowssysWindowsWin32SystemMailslotsCreateMailslotW(lpname.rawAddress, nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.rawAddress))

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: MutPtr<UInt>, lpnextsize: MutPtr<UInt>, lpmessagecount: MutPtr<UInt>, lpreadtimeout: MutPtr<UInt>): Bool =
    WindowsWin32SystemMailslotsJniBridge.windowssysWindowsWin32SystemMailslotsGetMailslotInfo(hmailslot.rawAddress, lpmaxmessagesize.rawAddress, lpnextsize.rawAddress, lpmessagecount.rawAddress, lpreadtimeout.rawAddress)

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    WindowsWin32SystemMailslotsJniBridge.windowssysWindowsWin32SystemMailslotsSetMailslotInfo(hmailslot.rawAddress, lreadtimeout.toInt())
