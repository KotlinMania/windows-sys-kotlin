@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearCommBreak(hfile: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearCommError(hfile: Handle, lperrors: COpaquePointer?, lpstat: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommMask(hfile: Handle, lpevtmask: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommPorts(lpportnumbers: COpaquePointer?, uportnumberscount: UInt, puportnumbersfound: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommProperties(hfile: Handle, lpcommprop: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCommBreak(hfile: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitCommEvent(hfile: Handle, lpevtmask: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
