package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

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

public fun ClearCommBreak(hfile: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ClearCommBreak", longArrayOf(Win32DynamicFfi.objectSlot(hfile))).toInt()
}

public fun ClearCommError(hfile: Foundation.HANDLE, lperrors: Long, lpstat: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ClearCommError", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lperrors, lpstat)).toInt()
}

public fun CommConfigDialogA(lpszname: PCSTR, hwnd: Foundation.HWND, lpcc: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CommConfigDialogA", longArrayOf(lpszname, Win32DynamicFfi.objectSlot(hwnd), lpcc)).toInt()
}

public fun CommConfigDialogW(lpszname: PCWSTR, hwnd: Foundation.HWND, lpcc: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CommConfigDialogW", longArrayOf(lpszname, Win32DynamicFfi.objectSlot(hwnd), lpcc)).toInt()
}

public fun EscapeCommFunction(hfile: Foundation.HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EscapeCommFunction", longArrayOf(Win32DynamicFfi.objectSlot(hfile), dwfunc.toLong())).toInt()
}

public fun GetCommConfig(hcommdev: Foundation.HANDLE, lpcc: Long, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommConfig", longArrayOf(Win32DynamicFfi.objectSlot(hcommdev), lpcc, lpdwsize)).toInt()
}

public fun GetCommMask(hfile: Foundation.HANDLE, lpevtmask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommMask", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpevtmask)).toInt()
}

public fun GetCommModemStatus(hfile: Foundation.HANDLE, lpmodemstat: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommModemStatus", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpmodemstat)).toInt()
}

public fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-comm-l1-1-2.dll", "GetCommPorts", longArrayOf(lpportnumbers, uportnumberscount.toLong(), puportnumbersfound)).toUInt()
}

public fun GetCommProperties(hfile: Foundation.HANDLE, lpcommprop: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommProperties", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpcommprop)).toInt()
}

public fun GetCommState(hfile: Foundation.HANDLE, lpdcb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommState", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpdcb)).toInt()
}

public fun GetCommTimeouts(hfile: Foundation.HANDLE, lpcommtimeouts: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommTimeouts", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpcommtimeouts)).toInt()
}

public fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDefaultCommConfigA", longArrayOf(lpszname, lpcc, lpdwsize)).toInt()
}

public fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDefaultCommConfigW", longArrayOf(lpszname, lpcc, lpdwsize)).toInt()
}

public fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("api-ms-win-core-comm-l1-1-1.dll", "OpenCommPort", longArrayOf(uportnumber.toLong(), dwdesiredaccess.toLong(), dwflagsandattributes.toLong()))
    return Foundation.HANDLE()
}

public fun PurgeComm(hfile: Foundation.HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PurgeComm", longArrayOf(Win32DynamicFfi.objectSlot(hfile), dwflags.toLong())).toInt()
}

public fun SetCommBreak(hfile: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommBreak", longArrayOf(Win32DynamicFfi.objectSlot(hfile))).toInt()
}

public fun SetCommConfig(hcommdev: Foundation.HANDLE, lpcc: Long, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommConfig", longArrayOf(Win32DynamicFfi.objectSlot(hcommdev), lpcc, dwsize.toLong())).toInt()
}

public fun SetCommMask(hfile: Foundation.HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommMask", longArrayOf(Win32DynamicFfi.objectSlot(hfile), dwevtmask.toLong())).toInt()
}

public fun SetCommState(hfile: Foundation.HANDLE, lpdcb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommState", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpdcb)).toInt()
}

public fun SetCommTimeouts(hfile: Foundation.HANDLE, lpcommtimeouts: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCommTimeouts", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpcommtimeouts)).toInt()
}

public fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDefaultCommConfigA", longArrayOf(lpszname, lpcc, dwsize.toLong())).toInt()
}

public fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDefaultCommConfigW", longArrayOf(lpszname, lpcc, dwsize.toLong())).toInt()
}

public fun SetupComm(hfile: Foundation.HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetupComm", longArrayOf(Win32DynamicFfi.objectSlot(hfile), dwinqueue.toLong(), dwoutqueue.toLong())).toInt()
}

public fun TransmitCommChar(hfile: Foundation.HANDLE, cchar: Byte): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TransmitCommChar", longArrayOf(Win32DynamicFfi.objectSlot(hfile), cchar.toLong())).toInt()
}

public fun WaitCommEvent(hfile: Foundation.HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitCommEvent", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpevtmask, lpoverlapped)).toInt()
}
