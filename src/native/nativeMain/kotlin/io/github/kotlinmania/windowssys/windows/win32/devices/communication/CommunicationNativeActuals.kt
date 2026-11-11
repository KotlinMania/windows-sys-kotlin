@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_buildCommDCBA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_buildCommDCBW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_clearCommBreak
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_clearCommError
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_commConfigDialogA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_commConfigDialogW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_escapeCommFunction
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommMask
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommModemStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommPorts
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommProperties
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommState
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getCommTimeouts
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getDefaultCommConfigA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_getDefaultCommConfigW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_openCommPort
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_purgeComm
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setCommBreak
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setCommConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setCommMask
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setCommState
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setCommTimeouts
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setDefaultCommConfigA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setDefaultCommConfigW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_setupComm
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_transmitCommChar
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssys_windows_win32_devices_communication_waitCommEvent
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_buildCommDCBA(lpdef?.value?.toCPointer<ByteVar>(), lpdcb?.value?.toCPointer<ByteVar>())

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA(lpdef?.value?.toCPointer<ByteVar>(), lpdcb?.value?.toCPointer<ByteVar>(), lpcommtimeouts?.value?.toCPointer<ByteVar>())

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW(lpdef?.value?.toCPointer<ByteVar>(), lpdcb?.value?.toCPointer<ByteVar>(), lpcommtimeouts?.value?.toCPointer<ByteVar>())

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_buildCommDCBW(lpdef?.value?.toCPointer<ByteVar>(), lpdcb?.value?.toCPointer<ByteVar>())

public actual fun clearCommBreak(hfile: Handle): Bool =
    windowssys_windows_win32_devices_communication_clearCommBreak(hfile?.value?.toCPointer<ByteVar>())

public actual fun clearCommError(hfile: Handle, lperrors: COpaquePointer?, lpstat: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_clearCommError(hfile?.value?.toCPointer<ByteVar>(), lperrors?.value?.toCPointer<ByteVar>(), lpstat?.value?.toCPointer<ByteVar>())

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_commConfigDialogA(lpszname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>())

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_commConfigDialogW(lpszname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>())

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    windowssys_windows_win32_devices_communication_escapeCommFunction(hfile?.value?.toCPointer<ByteVar>(), dwfunc)

public actual fun getCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getCommConfig(hcommdev?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun getCommMask(hfile: Handle, lpevtmask: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getCommMask(hfile?.value?.toCPointer<ByteVar>(), lpevtmask?.value?.toCPointer<ByteVar>())

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getCommModemStatus(hfile?.value?.toCPointer<ByteVar>(), lpmodemstat?.value?.toCPointer<ByteVar>())

public actual fun getCommPorts(lpportnumbers: COpaquePointer?, uportnumberscount: UInt, puportnumbersfound: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_communication_getCommPorts(lpportnumbers?.value?.toCPointer<ByteVar>(), uportnumberscount, puportnumbersfound?.value?.toCPointer<ByteVar>())

public actual fun getCommProperties(hfile: Handle, lpcommprop: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getCommProperties(hfile?.value?.toCPointer<ByteVar>(), lpcommprop?.value?.toCPointer<ByteVar>())

public actual fun getCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getCommState(hfile?.value?.toCPointer<ByteVar>(), lpdcb?.value?.toCPointer<ByteVar>())

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getCommTimeouts(hfile?.value?.toCPointer<ByteVar>(), lpcommtimeouts?.value?.toCPointer<ByteVar>())

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getDefaultCommConfigA(lpszname?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_getDefaultCommConfigW(lpszname?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    windowssys_windows_win32_devices_communication_openCommPort(uportnumber, dwdesiredaccess, dwflagsandattributes)?.let { COpaquePointer(it.toLong()) }

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    windowssys_windows_win32_devices_communication_purgeComm(hfile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun setCommBreak(hfile: Handle): Bool =
    windowssys_windows_win32_devices_communication_setCommBreak(hfile?.value?.toCPointer<ByteVar>())

public actual fun setCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    windowssys_windows_win32_devices_communication_setCommConfig(hcommdev?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    windowssys_windows_win32_devices_communication_setCommMask(hfile?.value?.toCPointer<ByteVar>(), dwevtmask)

public actual fun setCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_setCommState(hfile?.value?.toCPointer<ByteVar>(), lpdcb?.value?.toCPointer<ByteVar>())

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_setCommTimeouts(hfile?.value?.toCPointer<ByteVar>(), lpcommtimeouts?.value?.toCPointer<ByteVar>())

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    windowssys_windows_win32_devices_communication_setDefaultCommConfigA(lpszname?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    windowssys_windows_win32_devices_communication_setDefaultCommConfigW(lpszname?.value?.toCPointer<ByteVar>(), lpcc?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    windowssys_windows_win32_devices_communication_setupComm(hfile?.value?.toCPointer<ByteVar>(), dwinqueue, dwoutqueue)

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    windowssys_windows_win32_devices_communication_transmitCommChar(hfile?.value?.toCPointer<ByteVar>(), cchar)

public actual fun waitCommEvent(hfile: Handle, lpevtmask: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_communication_waitCommEvent(hfile?.value?.toCPointer<ByteVar>(), lpevtmask?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())
