@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BuildCommDCBA(lpdef: PCSTR, lpdcb: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_BuildCommDCBA(lpdef.toCPointer<ByteVar>(), lpdcb.toCPointer<ByteVar>())

public actual fun BuildCommDCBAndTimeoutsA(lpdef: PCSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsA(lpdef.toCPointer<ByteVar>(), lpdcb.toCPointer<ByteVar>(), lpcommtimeouts.toCPointer<ByteVar>())

public actual fun BuildCommDCBAndTimeoutsW(lpdef: PCWSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsW(lpdef.toCPointer<ByteVar>(), lpdcb.toCPointer<ByteVar>(), lpcommtimeouts.toCPointer<ByteVar>())

public actual fun BuildCommDCBW(lpdef: PCWSTR, lpdcb: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_BuildCommDCBW(lpdef.toCPointer<ByteVar>(), lpdcb.toCPointer<ByteVar>())

public actual fun ClearCommBreak(hfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_ClearCommBreak(hfile.toCPointer<ByteVar>())

public actual fun ClearCommError(hfile: HANDLE, lperrors: Long, lpstat: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_ClearCommError(hfile.toCPointer<ByteVar>(), lperrors.toCPointer<ByteVar>(), lpstat.toCPointer<ByteVar>())

public actual fun CommConfigDialogA(lpszname: PCSTR, hwnd: HWND, lpcc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_CommConfigDialogA(lpszname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>())

public actual fun CommConfigDialogW(lpszname: PCWSTR, hwnd: HWND, lpcc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_CommConfigDialogW(lpszname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>())

public actual fun EscapeCommFunction(hfile: HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_EscapeCommFunction(hfile.toCPointer<ByteVar>(), dwfunc)

public actual fun GetCommConfig(hcommdev: HANDLE, lpcc: Long, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommConfig(hcommdev.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun GetCommMask(hfile: HANDLE, lpevtmask: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommMask(hfile.toCPointer<ByteVar>(), lpevtmask.toCPointer<ByteVar>())

public actual fun GetCommModemStatus(hfile: HANDLE, lpmodemstat: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommModemStatus(hfile.toCPointer<ByteVar>(), lpmodemstat.toCPointer<ByteVar>())

public actual fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommPorts(lpportnumbers.toCPointer<ByteVar>(), uportnumberscount, puportnumbersfound.toCPointer<ByteVar>())

public actual fun GetCommProperties(hfile: HANDLE, lpcommprop: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommProperties(hfile.toCPointer<ByteVar>(), lpcommprop.toCPointer<ByteVar>())

public actual fun GetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommState(hfile.toCPointer<ByteVar>(), lpdcb.toCPointer<ByteVar>())

public actual fun GetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetCommTimeouts(hfile.toCPointer<ByteVar>(), lpcommtimeouts.toCPointer<ByteVar>())

public actual fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetDefaultCommConfigA(lpszname.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_GetDefaultCommConfigW(lpszname.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_OpenCommPort(uportnumber, dwdesiredaccess, dwflagsandattributes)?.toLong() ?: 0L

public actual fun PurgeComm(hfile: HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_PurgeComm(hfile.toCPointer<ByteVar>(), dwflags)

public actual fun SetCommBreak(hfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetCommBreak(hfile.toCPointer<ByteVar>())

public actual fun SetCommConfig(hcommdev: HANDLE, lpcc: Long, dwsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetCommConfig(hcommdev.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>(), dwsize)

public actual fun SetCommMask(hfile: HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetCommMask(hfile.toCPointer<ByteVar>(), dwevtmask)

public actual fun SetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetCommState(hfile.toCPointer<ByteVar>(), lpdcb.toCPointer<ByteVar>())

public actual fun SetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetCommTimeouts(hfile.toCPointer<ByteVar>(), lpcommtimeouts.toCPointer<ByteVar>())

public actual fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetDefaultCommConfigA(lpszname.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>(), dwsize)

public actual fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetDefaultCommConfigW(lpszname.toCPointer<ByteVar>(), lpcc.toCPointer<ByteVar>(), dwsize)

public actual fun SetupComm(hfile: HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_SetupComm(hfile.toCPointer<ByteVar>(), dwinqueue, dwoutqueue)

public actual fun TransmitCommChar(hfile: HANDLE, cchar: Byte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_TransmitCommChar(hfile.toCPointer<ByteVar>(), cchar)

public actual fun WaitCommEvent(hfile: HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_WaitCommEvent(hfile.toCPointer<ByteVar>(), lpevtmask.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())
