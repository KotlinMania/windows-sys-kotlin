package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

public expect fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle

public expect fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle

public expect fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: MutPtr<UInt>, lpnextsize: MutPtr<UInt>, lpmessagecount: MutPtr<UInt>, lpreadtimeout: MutPtr<UInt>): Bool

public expect fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool
