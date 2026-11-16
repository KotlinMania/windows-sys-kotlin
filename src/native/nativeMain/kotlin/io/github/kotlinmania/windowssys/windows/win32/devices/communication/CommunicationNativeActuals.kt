@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationBuildCommDCBA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationBuildCommDCBW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationClearCommBreak
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationClearCommError
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationCommConfigDialogA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationCommConfigDialogW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationEscapeCommFunction
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommMask
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommModemStatus
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommPorts
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommProperties
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommState
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetCommTimeouts
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationOpenCommPort
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationPurgeComm
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetCommBreak
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetCommConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetCommMask
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetCommState
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetCommTimeouts
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationSetupComm
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationTransmitCommChar
import io.github.kotlinmania.windowssys.windows.win32.devices.communication.cinterop.windowssysWindowsWin32DevicesCommunicationWaitCommEvent
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(lpdef.rawAddress.toCPointer<ByteVar>(), lpdcb.rawAddress.toCPointer<ByteVar>())

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(lpdef.rawAddress.toCPointer<ByteVar>(), lpdcb.rawAddress.toCPointer<ByteVar>(), lpcommtimeouts.rawAddress.toCPointer<ByteVar>())

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(lpdef.rawAddress.toCPointer<ByteVar>(), lpdcb.rawAddress.toCPointer<ByteVar>(), lpcommtimeouts.rawAddress.toCPointer<ByteVar>())

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(lpdef.rawAddress.toCPointer<ByteVar>(), lpdcb.rawAddress.toCPointer<ByteVar>())

public actual fun clearCommBreak(hfile: Handle): Bool =
    windowssysWindowsWin32DevicesCommunicationClearCommBreak(hfile.rawAddress.toCPointer<ByteVar>())

public actual fun clearCommError(hfile: Handle, lperrors: MutPtr, lpstat: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationClearCommError(hfile.rawAddress.toCPointer<ByteVar>(), lperrors.rawAddress.toCPointer<ByteVar>(), lpstat.rawAddress.toCPointer<ByteVar>())

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(lpszname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>())

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(lpszname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>())

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(hfile.rawAddress.toCPointer<ByteVar>(), dwfunc)

public actual fun getCommConfig(hcommdev: Handle, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetCommConfig(hcommdev.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>(), lpdwsize.rawAddress.toCPointer<ByteVar>())

public actual fun getCommMask(hfile: Handle, lpevtmask: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetCommMask(hfile.rawAddress.toCPointer<ByteVar>(), lpevtmask.rawAddress.toCPointer<ByteVar>())

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(hfile.rawAddress.toCPointer<ByteVar>(), lpmodemstat.rawAddress.toCPointer<ByteVar>())

public actual fun getCommPorts(lpportnumbers: MutPtr, uportnumberscount: UInt, puportnumbersfound: MutPtr): UInt =
    windowssysWindowsWin32DevicesCommunicationGetCommPorts(lpportnumbers.rawAddress.toCPointer<ByteVar>(), uportnumberscount, puportnumbersfound.rawAddress.toCPointer<ByteVar>())

public actual fun getCommProperties(hfile: Handle, lpcommprop: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetCommProperties(hfile.rawAddress.toCPointer<ByteVar>(), lpcommprop.rawAddress.toCPointer<ByteVar>())

public actual fun getCommState(hfile: Handle, lpdcb: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetCommState(hfile.rawAddress.toCPointer<ByteVar>(), lpdcb.rawAddress.toCPointer<ByteVar>())

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(hfile.rawAddress.toCPointer<ByteVar>(), lpcommtimeouts.rawAddress.toCPointer<ByteVar>())

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(lpszname.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>(), lpdwsize.rawAddress.toCPointer<ByteVar>())

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(lpszname.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>(), lpdwsize.rawAddress.toCPointer<ByteVar>())

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    MutPtr(windowssysWindowsWin32DevicesCommunicationOpenCommPort(uportnumber, dwdesiredaccess, dwflagsandattributes)?.toLong() ?: 0L)

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    windowssysWindowsWin32DevicesCommunicationPurgeComm(hfile.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun setCommBreak(hfile: Handle): Bool =
    windowssysWindowsWin32DevicesCommunicationSetCommBreak(hfile.rawAddress.toCPointer<ByteVar>())

public actual fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr, dwsize: UInt): Bool =
    windowssysWindowsWin32DevicesCommunicationSetCommConfig(hcommdev.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    windowssysWindowsWin32DevicesCommunicationSetCommMask(hfile.rawAddress.toCPointer<ByteVar>(), dwevtmask)

public actual fun setCommState(hfile: Handle, lpdcb: ConstPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationSetCommState(hfile.rawAddress.toCPointer<ByteVar>(), lpdcb.rawAddress.toCPointer<ByteVar>())

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(hfile.rawAddress.toCPointer<ByteVar>(), lpcommtimeouts.rawAddress.toCPointer<ByteVar>())

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(lpszname.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(lpszname.rawAddress.toCPointer<ByteVar>(), lpcc.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    windowssysWindowsWin32DevicesCommunicationSetupComm(hfile.rawAddress.toCPointer<ByteVar>(), dwinqueue, dwoutqueue)

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    windowssysWindowsWin32DevicesCommunicationTransmitCommChar(hfile.rawAddress.toCPointer<ByteVar>(), cchar)

public actual fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr, lpoverlapped: MutPtr): Bool =
    windowssysWindowsWin32DevicesCommunicationWaitCommEvent(hfile.rawAddress.toCPointer<ByteVar>(), lpevtmask.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>())
