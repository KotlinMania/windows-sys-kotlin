@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32UiInputTouchJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(hgestureinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchCloseTouchInputHandle(htouchinput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchGetGestureConfig(hwnd: Long, dwreserved: Int, dwflags: Int, pcids: Long, pgestureconfig: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchGetGestureExtraArgs(hgestureinfo: Long, cbextraargs: Int, pextraargs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchGetGestureInfo(hgestureinfo: Long, pgestureinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchGetTouchInputInfo(htouchinput: Long, cinputs: Int, pinputs: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchIsTouchWindow(hwnd: Long, pulflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchRegisterTouchWindow(hwnd: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchSetGestureConfig(hwnd: Long, dwreserved: Int, cids: Int, pgestureconfig: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputTouchUnregisterTouchWindow(hwnd: Long): Int
}

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(hgestureinfo.rawAddress)

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchCloseTouchInputHandle(htouchinput.rawAddress)

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: ConstPtr<UInt>, pgestureconfig: MutPtr<Gestureconfig>, cbsize: UInt): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchGetGestureConfig(hwnd.rawAddress, dwreserved.toInt(), dwflags.toInt(), pcids.rawAddress, pgestureconfig.rawAddress, cbsize.toInt())

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: MutPtr<UByte>): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchGetGestureExtraArgs(hgestureinfo.rawAddress, cbextraargs.toInt(), pextraargs.rawAddress)

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: MutPtr<Gestureinfo>): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchGetGestureInfo(hgestureinfo.rawAddress, pgestureinfo.rawAddress)

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: MutPtr<Touchinput>, cbsize: Int): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchGetTouchInputInfo(htouchinput.rawAddress, cinputs.toInt(), pinputs.rawAddress, cbsize)

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: MutPtr<UInt>): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchIsTouchWindow(hwnd.rawAddress, pulflags.rawAddress)

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchRegisterTouchWindow(hwnd.rawAddress, ulflags.toInt())

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: ConstPtr<Gestureconfig>, cbsize: UInt): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchSetGestureConfig(hwnd.rawAddress, dwreserved.toInt(), cids.toInt(), pgestureconfig.rawAddress, cbsize.toInt())

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssysWindowsWin32UiInputTouchUnregisterTouchWindow(hwnd.rawAddress)
