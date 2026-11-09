@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32DevicesCommunicationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BuildCommDCBA(lpdef: PCSTR, lpdcb: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_BuildCommDCBA(lpdef.toString(), lpdcb.toString()) as Int) else 0

public actual fun BuildCommDCBAndTimeoutsA(lpdef: PCSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsA(lpdef.toString(), lpdcb.toString(), lpcommtimeouts.toString()) as Int) else 0

public actual fun BuildCommDCBAndTimeoutsW(lpdef: PCWSTR, lpdcb: Long, lpcommtimeouts: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsW(lpdef.toString(), lpdcb.toString(), lpcommtimeouts.toString()) as Int) else 0

public actual fun BuildCommDCBW(lpdef: PCWSTR, lpdcb: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_BuildCommDCBW(lpdef.toString(), lpdcb.toString()) as Int) else 0

public actual fun ClearCommBreak(hfile: HANDLE): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_ClearCommBreak(hfile.toString()) as Int) else 0

public actual fun ClearCommError(hfile: HANDLE, lperrors: Long, lpstat: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_ClearCommError(hfile.toString(), lperrors.toString(), lpstat.toString()) as Int) else 0

public actual fun CommConfigDialogA(lpszname: PCSTR, hwnd: HWND, lpcc: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_CommConfigDialogA(lpszname.toString(), hwnd.toString(), lpcc.toString()) as Int) else 0

public actual fun CommConfigDialogW(lpszname: PCWSTR, hwnd: HWND, lpcc: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_CommConfigDialogW(lpszname.toString(), hwnd.toString(), lpcc.toString()) as Int) else 0

public actual fun EscapeCommFunction(hfile: HANDLE, dwfunc: ESCAPE_COMM_FUNCTION): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_EscapeCommFunction(hfile.toString(), dwfunc.toInt()) as Int) else 0

public actual fun GetCommConfig(hcommdev: HANDLE, lpcc: Long, lpdwsize: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommConfig(hcommdev.toString(), lpcc.toString(), lpdwsize.toString()) as Int) else 0

public actual fun GetCommMask(hfile: HANDLE, lpevtmask: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommMask(hfile.toString(), lpevtmask.toString()) as Int) else 0

public actual fun GetCommModemStatus(hfile: HANDLE, lpmodemstat: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommModemStatus(hfile.toString(), lpmodemstat.toString()) as Int) else 0

public actual fun GetCommPorts(lpportnumbers: Long, uportnumberscount: UInt, puportnumbersfound: Long): UInt =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommPorts(lpportnumbers.toString(), uportnumberscount.toInt(), puportnumbersfound.toString()) as Int).toUInt() else 0u

public actual fun GetCommProperties(hfile: HANDLE, lpcommprop: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommProperties(hfile.toString(), lpcommprop.toString()) as Int) else 0

public actual fun GetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommState(hfile.toString(), lpdcb.toString()) as Int) else 0

public actual fun GetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetCommTimeouts(hfile.toString(), lpcommtimeouts.toString()) as Int) else 0

public actual fun GetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, lpdwsize: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetDefaultCommConfigA(lpszname.toString(), lpcc.toString(), lpdwsize.toString()) as Int) else 0

public actual fun GetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, lpdwsize: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_GetDefaultCommConfigW(lpszname.toString(), lpcc.toString(), lpdwsize.toString()) as Int) else 0

public actual fun OpenCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): HANDLE =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_OpenCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt()) as String).toLong() else 0L

public actual fun PurgeComm(hfile: HANDLE, dwflags: PURGE_COMM_FLAGS): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_PurgeComm(hfile.toString(), dwflags.toInt()) as Int) else 0

public actual fun SetCommBreak(hfile: HANDLE): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetCommBreak(hfile.toString()) as Int) else 0

public actual fun SetCommConfig(hcommdev: HANDLE, lpcc: Long, dwsize: UInt): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetCommConfig(hcommdev.toString(), lpcc.toString(), dwsize.toInt()) as Int) else 0

public actual fun SetCommMask(hfile: HANDLE, dwevtmask: COMM_EVENT_MASK): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetCommMask(hfile.toString(), dwevtmask.toInt()) as Int) else 0

public actual fun SetCommState(hfile: HANDLE, lpdcb: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetCommState(hfile.toString(), lpdcb.toString()) as Int) else 0

public actual fun SetCommTimeouts(hfile: HANDLE, lpcommtimeouts: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetCommTimeouts(hfile.toString(), lpcommtimeouts.toString()) as Int) else 0

public actual fun SetDefaultCommConfigA(lpszname: PCSTR, lpcc: Long, dwsize: UInt): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetDefaultCommConfigA(lpszname.toString(), lpcc.toString(), dwsize.toInt()) as Int) else 0

public actual fun SetDefaultCommConfigW(lpszname: PCWSTR, lpcc: Long, dwsize: UInt): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetDefaultCommConfigW(lpszname.toString(), lpcc.toString(), dwsize.toInt()) as Int) else 0

public actual fun SetupComm(hfile: HANDLE, dwinqueue: UInt, dwoutqueue: UInt): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_SetupComm(hfile.toString(), dwinqueue.toInt(), dwoutqueue.toInt()) as Int) else 0

public actual fun TransmitCommChar(hfile: HANDLE, cchar: Byte): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_TransmitCommChar(hfile.toString(), cchar.toInt()) as Int) else 0

public actual fun WaitCommEvent(hfile: HANDLE, lpevtmask: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32DevicesCommunicationNapiAddon != null) (_windowsWin32DevicesCommunicationNapiAddon.windowssys_windows_win32_devices_communication_WaitCommEvent(hfile.toString(), lpevtmask.toString(), lpoverlapped.toString()) as Int) else 0
