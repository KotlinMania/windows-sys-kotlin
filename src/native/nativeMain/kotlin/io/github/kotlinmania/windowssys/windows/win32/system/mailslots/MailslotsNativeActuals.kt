@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_createMailslotA(lpname?.value?.toCPointer<ByteVar>(), nmaxmessagesize, lreadtimeout, lpsecurityattributes?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_createMailslotW(lpname?.value?.toCPointer<ByteVar>(), nmaxmessagesize, lreadtimeout, lpsecurityattributes?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: COpaquePointer?, lpnextsize: COpaquePointer?, lpmessagecount: COpaquePointer?, lpreadtimeout: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_getMailslotInfo(hmailslot?.value?.toCPointer<ByteVar>(), lpmaxmessagesize?.value?.toCPointer<ByteVar>(), lpnextsize?.value?.toCPointer<ByteVar>(), lpmessagecount?.value?.toCPointer<ByteVar>(), lpreadtimeout?.value?.toCPointer<ByteVar>())

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.mailslots.cinterop.windowssys_windows_win32_system_mailslots_setMailslotInfo(hmailslot?.value?.toCPointer<ByteVar>(), lreadtimeout)
