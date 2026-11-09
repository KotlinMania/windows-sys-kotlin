package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun BuildCommDCBA(lpdef: PCSTR, lpdcb: Long): BOOL

public expect fun BuildCommDCBAndTimeoutsA(lpdef: PCSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL

public expect fun BuildCommDCBAndTimeoutsW(lpdef: PCWSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL

public expect fun BuildCommDCBW(lpdef: PCWSTR, lpdcb: Long): BOOL

public expect fun ClearCommBreak(hfile: HANDLE): BOOL

public expect fun ClearCommError(hfile: HANDLE, lperrors: Long, lpstat: Long): BOOL

public expect fun CommConfigDialogA(lpszname: PCSTR, hwnd: HWND, lpcc: Long): BOOL

public expect fun CommConfigDialogW(lpszname: PCWSTR, hwnd: HWND, lpcc: Long): BOOL

public expect fun EscapeCommFunction(hfile: HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL

public expect fun GetCommConfig(hcommdev: HANDLE, lpcc: Long, lpdwsize: Long): BOOL

public expect fun GetCommMask(hfile: HANDLE, lpevtmask: Long): BOOL

public expect fun GetCommModemStatus(hfile: HANDLE, lpmodemstat: Long): BOOL

public expect fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt

public expect fun GetCommProperties(hfile: HANDLE, lpcommprop: Long): BOOL

public expect fun GetCommState(hfile: HANDLE, lpdcb: Long): BOOL

public expect fun GetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL

public expect fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL

public expect fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL

public expect fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): HANDLE

public expect fun PurgeComm(hfile: HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL

public expect fun SetCommBreak(hfile: HANDLE): BOOL

public expect fun SetCommConfig(hcommdev: HANDLE, lpcc: Long, dwsize: UInt): BOOL

public expect fun SetCommMask(hfile: HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL

public expect fun SetCommState(hfile: HANDLE, lpdcb: Long): BOOL

public expect fun SetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL

public expect fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL

public expect fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL

public expect fun SetupComm(hfile: HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL

public expect fun TransmitCommChar(hfile: HANDLE, cchar: Byte): BOOL

public expect fun WaitCommEvent(hfile: HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL
