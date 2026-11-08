package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun BuildCommDCBA(lpdef: PCSTR, lpdcb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BuildCommDCBA", longArrayOf(lpdef, lpdcb)).toInt()
}

public fun BuildCommDCBAndTimeoutsA(lpdef: PCSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BuildCommDCBAndTimeoutsA", longArrayOf(lpdef, lpdcb, lpcommtimeouts)).toInt()
}

public fun BuildCommDCBAndTimeoutsW(lpdef: PCWSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BuildCommDCBAndTimeoutsW", longArrayOf(lpdef, lpdcb, lpcommtimeouts)).toInt()
}

public fun BuildCommDCBW(lpdef: PCWSTR, lpdcb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BuildCommDCBW", longArrayOf(lpdef, lpdcb)).toInt()
}

public fun ClearCommBreak(hfile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ClearCommBreak", longArrayOf(hfile)).toInt()
}

public fun ClearCommError(hfile: HANDLE, lperrors: Long, lpstat: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ClearCommError", longArrayOf(hfile, lperrors, lpstat)).toInt()
}

public fun CommConfigDialogA(lpszname: PCSTR, hwnd: HWND, lpcc: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CommConfigDialogA", longArrayOf(lpszname, hwnd, lpcc)).toInt()
}

public fun CommConfigDialogW(lpszname: PCWSTR, hwnd: HWND, lpcc: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CommConfigDialogW", longArrayOf(lpszname, hwnd, lpcc)).toInt()
}

public fun EscapeCommFunction(hfile: HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EscapeCommFunction", longArrayOf(hfile, dwfunc.toLong())).toInt()
}

public fun GetCommConfig(hcommdev: HANDLE, lpcc: Long, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommConfig", longArrayOf(hcommdev, lpcc, lpdwsize)).toInt()
}

public fun GetCommMask(hfile: HANDLE, lpevtmask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommMask", longArrayOf(hfile, lpevtmask)).toInt()
}

public fun GetCommModemStatus(hfile: HANDLE, lpmodemstat: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommModemStatus", longArrayOf(hfile, lpmodemstat)).toInt()
}

public fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-comm-l1-1-2.dll", "GetCommPorts", longArrayOf(lpportnumbers, uportnumberscount.toLong(), puportnumbersfound)).toUInt()
}

public fun GetCommProperties(hfile: HANDLE, lpcommprop: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommProperties", longArrayOf(hfile, lpcommprop)).toInt()
}

public fun GetCommState(hfile: HANDLE, lpdcb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommState", longArrayOf(hfile, lpdcb)).toInt()
}

public fun GetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommTimeouts", longArrayOf(hfile, lpcommtimeouts)).toInt()
}

public fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDefaultCommConfigA", longArrayOf(lpszname, lpcc, lpdwsize)).toInt()
}

public fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDefaultCommConfigW", longArrayOf(lpszname, lpcc, lpdwsize)).toInt()
}

public fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-comm-l1-1-1.dll", "OpenCommPort", longArrayOf(uportnumber.toLong(), dwdesiredaccess.toLong(), dwflagsandattributes.toLong()))
}

public fun PurgeComm(hfile: HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PurgeComm", longArrayOf(hfile, dwflags.toLong())).toInt()
}

public fun SetCommBreak(hfile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommBreak", longArrayOf(hfile)).toInt()
}

public fun SetCommConfig(hcommdev: HANDLE, lpcc: Long, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommConfig", longArrayOf(hcommdev, lpcc, dwsize.toLong())).toInt()
}

public fun SetCommMask(hfile: HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommMask", longArrayOf(hfile, dwevtmask.toLong())).toInt()
}

public fun SetCommState(hfile: HANDLE, lpdcb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommState", longArrayOf(hfile, lpdcb)).toInt()
}

public fun SetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommTimeouts", longArrayOf(hfile, lpcommtimeouts)).toInt()
}

public fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDefaultCommConfigA", longArrayOf(lpszname, lpcc, dwsize.toLong())).toInt()
}

public fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDefaultCommConfigW", longArrayOf(lpszname, lpcc, dwsize.toLong())).toInt()
}

public fun SetupComm(hfile: HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetupComm", longArrayOf(hfile, dwinqueue.toLong(), dwoutqueue.toLong())).toInt()
}

public fun TransmitCommChar(hfile: HANDLE, cchar: Byte): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TransmitCommChar", longArrayOf(hfile, cchar.toLong())).toInt()
}

public fun WaitCommEvent(hfile: HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitCommEvent", longArrayOf(hfile, lpevtmask, lpoverlapped)).toInt()
}
