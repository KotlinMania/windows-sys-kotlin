@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: COpaquePointer?, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
