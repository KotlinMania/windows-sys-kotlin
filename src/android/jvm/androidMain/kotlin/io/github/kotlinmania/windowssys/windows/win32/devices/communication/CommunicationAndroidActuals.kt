@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32DevicesCommunicationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_BuildCommDCBA(lpdef: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsA(lpdef: Long, lpdcb: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsW(lpdef: Long, lpdcb: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_BuildCommDCBW(lpdef: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_ClearCommBreak(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_ClearCommError(hfile: Long, lperrors: Long, lpstat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_CommConfigDialogA(lpszname: Long, hwnd: Long, lpcc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_CommConfigDialogW(lpszname: Long, hwnd: Long, lpcc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_EscapeCommFunction(hfile: Long, dwfunc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommConfig(hcommdev: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommMask(hfile: Long, lpevtmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommModemStatus(hfile: Long, lpmodemstat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommPorts(lpportnumbers: Long, uportnumberscount: Int, puportnumbersfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommProperties(hfile: Long, lpcommprop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommState(hfile: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetCommTimeouts(hfile: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetDefaultCommConfigA(lpszname: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_GetDefaultCommConfigW(lpszname: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_OpenCommPort(uportnumber: Int, dwdesiredaccess: Int, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_PurgeComm(hfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetCommBreak(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetCommConfig(hcommdev: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetCommMask(hfile: Long, dwevtmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetCommState(hfile: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetCommTimeouts(hfile: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetDefaultCommConfigA(lpszname: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetDefaultCommConfigW(lpszname: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_SetupComm(hfile: Long, dwinqueue: Int, dwoutqueue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_TransmitCommChar(hfile: Long, cchar: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_WaitCommEvent(hfile: Long, lpevtmask: Long, lpoverlapped: Long): Int
}

public actual fun BuildCommDCBA(lpdef: PCSTR, lpdcb: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_BuildCommDCBA(lpdef, lpdcb)

public actual fun BuildCommDCBAndTimeoutsA(lpdef: PCSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsA(lpdef, lpdcb, lpcommtimeouts)

public actual fun BuildCommDCBAndTimeoutsW(lpdef: PCWSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsW(lpdef, lpdcb, lpcommtimeouts)

public actual fun BuildCommDCBW(lpdef: PCWSTR, lpdcb: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_BuildCommDCBW(lpdef, lpdcb)

public actual fun ClearCommBreak(hfile: HANDLE): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_ClearCommBreak(hfile)

public actual fun ClearCommError(hfile: HANDLE, lperrors: Long, lpstat: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_ClearCommError(hfile, lperrors, lpstat)

public actual fun CommConfigDialogA(lpszname: PCSTR, hwnd: HWND, lpcc: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_CommConfigDialogA(lpszname, hwnd, lpcc)

public actual fun CommConfigDialogW(lpszname: PCWSTR, hwnd: HWND, lpcc: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_CommConfigDialogW(lpszname, hwnd, lpcc)

public actual fun EscapeCommFunction(hfile: HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_EscapeCommFunction(hfile, dwfunc.toInt())

public actual fun GetCommConfig(hcommdev: HANDLE, lpcc: Long, lpdwsize: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommConfig(hcommdev, lpcc, lpdwsize)

public actual fun GetCommMask(hfile: HANDLE, lpevtmask: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommMask(hfile, lpevtmask)

public actual fun GetCommModemStatus(hfile: HANDLE, lpmodemstat: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommModemStatus(hfile, lpmodemstat)

public actual fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommPorts(lpportnumbers, uportnumberscount.toInt(), puportnumbersfound).toUInt()

public actual fun GetCommProperties(hfile: HANDLE, lpcommprop: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommProperties(hfile, lpcommprop)

public actual fun GetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommState(hfile, lpdcb)

public actual fun GetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetCommTimeouts(hfile, lpcommtimeouts)

public actual fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetDefaultCommConfigA(lpszname, lpcc, lpdwsize)

public actual fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_GetDefaultCommConfigW(lpszname, lpcc, lpdwsize)

public actual fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): HANDLE =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_OpenCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt())

public actual fun PurgeComm(hfile: HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_PurgeComm(hfile, dwflags.toInt())

public actual fun SetCommBreak(hfile: HANDLE): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetCommBreak(hfile)

public actual fun SetCommConfig(hcommdev: HANDLE, lpcc: Long, dwsize: UInt): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetCommConfig(hcommdev, lpcc, dwsize.toInt())

public actual fun SetCommMask(hfile: HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetCommMask(hfile, dwevtmask.toInt())

public actual fun SetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetCommState(hfile, lpdcb)

public actual fun SetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetCommTimeouts(hfile, lpcommtimeouts)

public actual fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetDefaultCommConfigA(lpszname, lpcc, dwsize.toInt())

public actual fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetDefaultCommConfigW(lpszname, lpcc, dwsize.toInt())

public actual fun SetupComm(hfile: HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_SetupComm(hfile, dwinqueue.toInt(), dwoutqueue.toInt())

public actual fun TransmitCommChar(hfile: HANDLE, cchar: Byte): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_TransmitCommChar(hfile, cchar)

public actual fun WaitCommEvent(hfile: HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_WaitCommEvent(hfile, lpevtmask, lpoverlapped)
