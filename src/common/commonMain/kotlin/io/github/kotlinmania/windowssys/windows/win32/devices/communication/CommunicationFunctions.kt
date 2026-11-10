package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun buildCommDCBA(lpdef: Pcstr, lpdcb: COpaquePointer?): Bool

public expect fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool

public expect fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool

public expect fun buildCommDCBW(lpdef: Pcwstr, lpdcb: COpaquePointer?): Bool

public expect fun clearCommBreak(hfile: Handle): Bool

public expect fun clearCommError(hfile: Handle, lperrors: COpaquePointer?, lpstat: COpaquePointer?): Bool

public expect fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool

public expect fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool

public expect fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool

public expect fun getCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool

public expect fun getCommMask(hfile: Handle, lpevtmask: COpaquePointer?): Bool

public expect fun getCommModemStatus(hfile: Handle, lpmodemstat: COpaquePointer?): Bool

public expect fun getCommPorts(lpportnumbers: COpaquePointer?, uportnumberscount: UInt, puportnumbersfound: COpaquePointer?): UInt

public expect fun getCommProperties(hfile: Handle, lpcommprop: COpaquePointer?): Bool

public expect fun getCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool

public expect fun getCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool

public expect fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool

public expect fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool

public expect fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle

public expect fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool

public expect fun setCommBreak(hfile: Handle): Bool

public expect fun setCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, dwsize: UInt): Bool

public expect fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool

public expect fun setCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool

public expect fun setCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool

public expect fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, dwsize: UInt): Bool

public expect fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, dwsize: UInt): Bool

public expect fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool

public expect fun transmitCommChar(hfile: Handle, cchar: Byte): Bool

public expect fun waitCommEvent(hfile: Handle, lpevtmask: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool
