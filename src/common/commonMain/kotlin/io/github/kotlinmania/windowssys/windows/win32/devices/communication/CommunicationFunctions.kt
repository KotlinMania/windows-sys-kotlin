package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr): Bool

public expect fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool

public expect fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool

public expect fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr): Bool

public expect fun clearCommBreak(hfile: Handle): Bool

public expect fun clearCommError(hfile: Handle, lperrors: MutPtr, lpstat: MutPtr): Bool

public expect fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr): Bool

public expect fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr): Bool

public expect fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool

public expect fun getCommConfig(hcommdev: Handle, lpcc: MutPtr, lpdwsize: MutPtr): Bool

public expect fun getCommMask(hfile: Handle, lpevtmask: MutPtr): Bool

public expect fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr): Bool

public expect fun getCommPorts(lpportnumbers: MutPtr, uportnumberscount: UInt, puportnumbersfound: MutPtr): UInt

public expect fun getCommProperties(hfile: Handle, lpcommprop: MutPtr): Bool

public expect fun getCommState(hfile: Handle, lpdcb: MutPtr): Bool

public expect fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr): Bool

public expect fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool

public expect fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool

public expect fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle

public expect fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool

public expect fun setCommBreak(hfile: Handle): Bool

public expect fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr, dwsize: UInt): Bool

public expect fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool

public expect fun setCommState(hfile: Handle, lpdcb: ConstPtr): Bool

public expect fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr): Bool

public expect fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr, dwsize: UInt): Bool

public expect fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr, dwsize: UInt): Bool

public expect fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool

public expect fun transmitCommChar(hfile: Handle, cchar: Byte): Bool

public expect fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr, lpoverlapped: MutPtr): Bool
