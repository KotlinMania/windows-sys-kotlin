@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesCommunicationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_buildCommDCBA(lpdef: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA(lpdef: Long, lpdcb: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW(lpdef: Long, lpdcb: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_buildCommDCBW(lpdef: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_clearCommBreak(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_clearCommError(hfile: Long, lperrors: Long, lpstat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_commConfigDialogA(lpszname: Long, hwnd: Long, lpcc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_commConfigDialogW(lpszname: Long, hwnd: Long, lpcc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_escapeCommFunction(hfile: Long, dwfunc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommConfig(hcommdev: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommMask(hfile: Long, lpevtmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommModemStatus(hfile: Long, lpmodemstat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommPorts(lpportnumbers: Long, uportnumberscount: Int, puportnumbersfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommProperties(hfile: Long, lpcommprop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommState(hfile: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getCommTimeouts(hfile: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getDefaultCommConfigA(lpszname: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_getDefaultCommConfigW(lpszname: Long, lpcc: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_openCommPort(uportnumber: Int, dwdesiredaccess: Int, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_purgeComm(hfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setCommBreak(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setCommConfig(hcommdev: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setCommMask(hfile: Long, dwevtmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setCommState(hfile: Long, lpdcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setCommTimeouts(hfile: Long, lpcommtimeouts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setDefaultCommConfigA(lpszname: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setDefaultCommConfigW(lpszname: Long, lpcc: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_setupComm(hfile: Long, dwinqueue: Int, dwoutqueue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_transmitCommChar(hfile: Long, cchar: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_communication_waitCommEvent(hfile: Long, lpevtmask: Long, lpoverlapped: Long): Int
}

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_buildCommDCBA((lpdef?.value ?: 0L), (lpdcb?.value ?: 0L))

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA((lpdef?.value ?: 0L), (lpdcb?.value ?: 0L), (lpcommtimeouts?.value ?: 0L))

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW((lpdef?.value ?: 0L), (lpdcb?.value ?: 0L), (lpcommtimeouts?.value ?: 0L))

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_buildCommDCBW((lpdef?.value ?: 0L), (lpdcb?.value ?: 0L))

public actual fun clearCommBreak(hfile: Handle): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_clearCommBreak((hfile?.value ?: 0L))

public actual fun clearCommError(hfile: Handle, lperrors: COpaquePointer?, lpstat: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_clearCommError((hfile?.value ?: 0L), (lperrors?.value ?: 0L), (lpstat?.value ?: 0L))

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_commConfigDialogA((lpszname?.value ?: 0L), (hwnd?.value ?: 0L), (lpcc?.value ?: 0L))

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_commConfigDialogW((lpszname?.value ?: 0L), (hwnd?.value ?: 0L), (lpcc?.value ?: 0L))

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_escapeCommFunction((hfile?.value ?: 0L), dwfunc.toInt())

public actual fun getCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommConfig((hcommdev?.value ?: 0L), (lpcc?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun getCommMask(hfile: Handle, lpevtmask: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommMask((hfile?.value ?: 0L), (lpevtmask?.value ?: 0L))

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommModemStatus((hfile?.value ?: 0L), (lpmodemstat?.value ?: 0L))

public actual fun getCommPorts(lpportnumbers: COpaquePointer?, uportnumberscount: UInt, puportnumbersfound: COpaquePointer?): UInt =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommPorts((lpportnumbers?.value ?: 0L), uportnumberscount.toInt(), (puportnumbersfound?.value ?: 0L)).toUInt()

public actual fun getCommProperties(hfile: Handle, lpcommprop: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommProperties((hfile?.value ?: 0L), (lpcommprop?.value ?: 0L))

public actual fun getCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommState((hfile?.value ?: 0L), (lpdcb?.value ?: 0L))

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getCommTimeouts((hfile?.value ?: 0L), (lpcommtimeouts?.value ?: 0L))

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getDefaultCommConfigA((lpszname?.value ?: 0L), (lpcc?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_getDefaultCommConfigW((lpszname?.value ?: 0L), (lpcc?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_openCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_purgeComm((hfile?.value ?: 0L), dwflags.toInt())

public actual fun setCommBreak(hfile: Handle): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setCommBreak((hfile?.value ?: 0L))

public actual fun setCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setCommConfig((hcommdev?.value ?: 0L), (lpcc?.value ?: 0L), dwsize.toInt())

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setCommMask((hfile?.value ?: 0L), dwevtmask.toInt())

public actual fun setCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setCommState((hfile?.value ?: 0L), (lpdcb?.value ?: 0L))

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setCommTimeouts((hfile?.value ?: 0L), (lpcommtimeouts?.value ?: 0L))

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setDefaultCommConfigA((lpszname?.value ?: 0L), (lpcc?.value ?: 0L), dwsize.toInt())

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setDefaultCommConfigW((lpszname?.value ?: 0L), (lpcc?.value ?: 0L), dwsize.toInt())

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_setupComm((hfile?.value ?: 0L), dwinqueue.toInt(), dwoutqueue.toInt())

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_transmitCommChar((hfile?.value ?: 0L), cchar)

public actual fun waitCommEvent(hfile: Handle, lpevtmask: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesCommunicationJniBridge.windowssys_windows_win32_devices_communication_waitCommEvent((hfile?.value ?: 0L), (lpevtmask?.value ?: 0L), (lpoverlapped?.value ?: 0L))
