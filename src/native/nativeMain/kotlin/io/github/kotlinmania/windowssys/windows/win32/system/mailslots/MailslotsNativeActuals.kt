@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CreateMailslotA(lpname: PCSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_CreateMailslotA(lpname.toCPointer<ByteVar>(), nmaxmessagesize, lreadtimeout, lpsecurityattributes.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMailslotW(lpname: PCWSTR, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_CreateMailslotW(lpname.toCPointer<ByteVar>(), nmaxmessagesize, lreadtimeout, lpsecurityattributes.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetMailslotInfo(hmailslot: HANDLE, lpmaxmessagesize: Long, lpnextsize: Long, lpmessagecount: Long, lpreadtimeout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_GetMailslotInfo(hmailslot.toCPointer<ByteVar>(), lpmaxmessagesize.toCPointer<ByteVar>(), lpnextsize.toCPointer<ByteVar>(), lpmessagecount.toCPointer<ByteVar>(), lpreadtimeout.toCPointer<ByteVar>())

public actual fun SetMailslotInfo(hmailslot: HANDLE, lreadtimeout: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_SetMailslotInfo(hmailslot.toCPointer<ByteVar>(), lreadtimeout)
