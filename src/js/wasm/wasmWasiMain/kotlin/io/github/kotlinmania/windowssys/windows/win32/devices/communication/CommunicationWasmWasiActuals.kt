@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr<Dcb>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationBuildCommDCBA")

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr<Dcb>, lpcommtimeouts: MutPtr<Commtimeouts>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA")

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr<Dcb>, lpcommtimeouts: MutPtr<Commtimeouts>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW")

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr<Dcb>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationBuildCommDCBW")

public actual fun clearCommBreak(hfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationClearCommBreak")

public actual fun clearCommError(hfile: Handle, lperrors: MutPtr<ClearCommErrorFlags>, lpstat: MutPtr<Comstat>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationClearCommError")

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr<Commconfig>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationCommConfigDialogA")

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr<Commconfig>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationCommConfigDialogW")

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationEscapeCommFunction")

public actual fun getCommConfig(hcommdev: Handle, lpcc: MutPtr<Commconfig>, lpdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommConfig")

public actual fun getCommMask(hfile: Handle, lpevtmask: MutPtr<CommEventMask>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommMask")

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr<ModemStatusFlags>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommModemStatus")

public actual fun getCommPorts(lpportnumbers: MutPtr<UInt>, uportnumberscount: UInt, puportnumbersfound: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommPorts")

public actual fun getCommProperties(hfile: Handle, lpcommprop: MutPtr<Commprop>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommProperties")

public actual fun getCommState(hfile: Handle, lpdcb: MutPtr<Dcb>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommState")

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr<Commtimeouts>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetCommTimeouts")

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr<Commconfig>, lpdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA")

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr<Commconfig>, lpdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW")

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationOpenCommPort")

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationPurgeComm")

public actual fun setCommBreak(hfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetCommBreak")

public actual fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr<Commconfig>, dwsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetCommConfig")

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetCommMask")

public actual fun setCommState(hfile: Handle, lpdcb: ConstPtr<Dcb>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetCommState")

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr<Commtimeouts>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetCommTimeouts")

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr<Commconfig>, dwsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA")

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr<Commconfig>, dwsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW")

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationSetupComm")

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationTransmitCommChar")

public actual fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr<CommEventMask>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesCommunicationWaitCommEvent")
