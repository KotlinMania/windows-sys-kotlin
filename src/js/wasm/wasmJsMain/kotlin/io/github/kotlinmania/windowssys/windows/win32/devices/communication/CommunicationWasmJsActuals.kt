@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun BuildCommDCBA(lpdef: PCSTR, lpdcb: Long): BOOL =
    0

public actual fun BuildCommDCBAndTimeoutsA(lpdef: PCSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    0

public actual fun BuildCommDCBAndTimeoutsW(lpdef: PCWSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    0

public actual fun BuildCommDCBW(lpdef: PCWSTR, lpdcb: Long): BOOL =
    0

public actual fun ClearCommBreak(hfile: HANDLE): BOOL =
    0

public actual fun ClearCommError(hfile: HANDLE, lperrors: Long, lpstat: Long): BOOL =
    0

public actual fun CommConfigDialogA(lpszname: PCSTR, hwnd: HWND, lpcc: Long): BOOL =
    0

public actual fun CommConfigDialogW(lpszname: PCWSTR, hwnd: HWND, lpcc: Long): BOOL =
    0

public actual fun EscapeCommFunction(hfile: HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL =
    0

public actual fun GetCommConfig(hcommdev: HANDLE, lpcc: Long, lpdwsize: Long): BOOL =
    0

public actual fun GetCommMask(hfile: HANDLE, lpevtmask: Long): BOOL =
    0

public actual fun GetCommModemStatus(hfile: HANDLE, lpmodemstat: Long): BOOL =
    0

public actual fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt =
    0u

public actual fun GetCommProperties(hfile: HANDLE, lpcommprop: Long): BOOL =
    0

public actual fun GetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    0

public actual fun GetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    0

public actual fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL =
    0

public actual fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL =
    0

public actual fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): HANDLE =
    0L

public actual fun PurgeComm(hfile: HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL =
    0

public actual fun SetCommBreak(hfile: HANDLE): BOOL =
    0

public actual fun SetCommConfig(hcommdev: HANDLE, lpcc: Long, dwsize: UInt): BOOL =
    0

public actual fun SetCommMask(hfile: HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL =
    0

public actual fun SetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    0

public actual fun SetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    0

public actual fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL =
    0

public actual fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL =
    0

public actual fun SetupComm(hfile: HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL =
    0

public actual fun TransmitCommChar(hfile: HANDLE, cchar: Byte): BOOL =
    0

public actual fun WaitCommEvent(hfile: HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL =
    0
