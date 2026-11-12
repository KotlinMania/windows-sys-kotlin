@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchCloseTouchInputHandle
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchGetGestureConfig
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchGetGestureExtraArgs
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchGetGestureInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchGetTouchInputInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchIsTouchWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchRegisterTouchWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchSetGestureConfig
import io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssysWindowsWin32UiInputTouchUnregisterTouchWindow
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(hgestureinfo.rawAddress.toCPointer<ByteVar>())

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    windowssysWindowsWin32UiInputTouchCloseTouchInputHandle(htouchinput.rawAddress.toCPointer<ByteVar>())

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: ConstPtr<UInt>, pgestureconfig: MutPtr<Gestureconfig>, cbsize: UInt): Bool =
    windowssysWindowsWin32UiInputTouchGetGestureConfig(hwnd.rawAddress.toCPointer<ByteVar>(), dwreserved, dwflags, pcids.rawAddress.toCPointer<ByteVar>(), pgestureconfig.rawAddress.toCPointer<ByteVar>(), cbsize)

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: MutPtr<UByte>): Bool =
    windowssysWindowsWin32UiInputTouchGetGestureExtraArgs(hgestureinfo.rawAddress.toCPointer<ByteVar>(), cbextraargs, pextraargs.rawAddress.toCPointer<ByteVar>())

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: MutPtr<Gestureinfo>): Bool =
    windowssysWindowsWin32UiInputTouchGetGestureInfo(hgestureinfo.rawAddress.toCPointer<ByteVar>(), pgestureinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: MutPtr<Touchinput>, cbsize: Int): Bool =
    windowssysWindowsWin32UiInputTouchGetTouchInputInfo(htouchinput.rawAddress.toCPointer<ByteVar>(), cinputs, pinputs.rawAddress.toCPointer<ByteVar>(), cbsize)

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: MutPtr<UInt>): Bool =
    windowssysWindowsWin32UiInputTouchIsTouchWindow(hwnd.rawAddress.toCPointer<ByteVar>(), pulflags.rawAddress.toCPointer<ByteVar>())

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    windowssysWindowsWin32UiInputTouchRegisterTouchWindow(hwnd.rawAddress.toCPointer<ByteVar>(), ulflags)

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: ConstPtr<Gestureconfig>, cbsize: UInt): Bool =
    windowssysWindowsWin32UiInputTouchSetGestureConfig(hwnd.rawAddress.toCPointer<ByteVar>(), dwreserved, cids, pgestureconfig.rawAddress.toCPointer<ByteVar>(), cbsize)

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    windowssysWindowsWin32UiInputTouchUnregisterTouchWindow(hwnd.rawAddress.toCPointer<ByteVar>())
