@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssysWindowsWin32SystemMailslotsCreateMailslotA
import io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssysWindowsWin32SystemMailslotsCreateMailslotW
import io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssysWindowsWin32SystemMailslotsGetMailslotInfo
import io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssysWindowsWin32SystemMailslotsSetMailslotInfo
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(windowssysWindowsWin32SystemMailslotsCreateMailslotA(lpname.rawAddress.toCPointer<ByteVar>(), nmaxmessagesize, lreadtimeout, lpsecurityattributes.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(windowssysWindowsWin32SystemMailslotsCreateMailslotW(lpname.rawAddress.toCPointer<ByteVar>(), nmaxmessagesize, lreadtimeout, lpsecurityattributes.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: MutPtr<UInt>, lpnextsize: MutPtr<UInt>, lpmessagecount: MutPtr<UInt>, lpreadtimeout: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemMailslotsGetMailslotInfo(hmailslot.rawAddress.toCPointer<ByteVar>(), lpmaxmessagesize.rawAddress.toCPointer<ByteVar>(), lpnextsize.rawAddress.toCPointer<ByteVar>(), lpmessagecount.rawAddress.toCPointer<ByteVar>(), lpreadtimeout.rawAddress.toCPointer<ByteVar>())

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    windowssysWindowsWin32SystemMailslotsSetMailslotInfo(hmailslot.rawAddress.toCPointer<ByteVar>(), lreadtimeout)
