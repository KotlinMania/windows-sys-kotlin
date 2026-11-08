package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun CloseGestureInfoHandle(hgestureinfo: HGESTUREINFO): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CloseGestureInfoHandle", longArrayOf(hgestureinfo)).toInt()
}

public fun CloseTouchInputHandle(htouchinput: HTOUCHINPUT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CloseTouchInputHandle", longArrayOf(htouchinput)).toInt()
}

public fun GetGestureConfig(hwnd: HWND, dwreserved: UInt, dwflags: UInt, pcids: Long, pgestureconfig: Long, cbsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetGestureConfig", longArrayOf(hwnd, dwreserved.toLong(), dwflags.toLong(), pcids, pgestureconfig, cbsize.toLong())).toInt()
}

public fun GetGestureExtraArgs(hgestureinfo: HGESTUREINFO, cbextraargs: UInt, pextraargs: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetGestureExtraArgs", longArrayOf(hgestureinfo, cbextraargs.toLong(), pextraargs)).toInt()
}

public fun GetGestureInfo(hgestureinfo: HGESTUREINFO, pgestureinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetGestureInfo", longArrayOf(hgestureinfo, pgestureinfo)).toInt()
}

public fun GetTouchInputInfo(htouchinput: HTOUCHINPUT, cinputs: UInt, pinputs: Long, cbsize: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetTouchInputInfo", longArrayOf(htouchinput, cinputs.toLong(), pinputs, cbsize.toLong())).toInt()
}

public fun IsTouchWindow(hwnd: HWND, pulflags: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsTouchWindow", longArrayOf(hwnd, pulflags)).toInt()
}

public fun RegisterTouchWindow(hwnd: HWND, ulflags: REGISTER_TOUCH_WINDOW_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterTouchWindow", longArrayOf(hwnd, ulflags.toLong())).toInt()
}

public fun SetGestureConfig(hwnd: HWND, dwreserved: UInt, cids: UInt, pgestureconfig: Long, cbsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetGestureConfig", longArrayOf(hwnd, dwreserved.toLong(), cids.toLong(), pgestureconfig, cbsize.toLong())).toInt()
}

public fun UnregisterTouchWindow(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterTouchWindow", longArrayOf(hwnd)).toInt()
}
