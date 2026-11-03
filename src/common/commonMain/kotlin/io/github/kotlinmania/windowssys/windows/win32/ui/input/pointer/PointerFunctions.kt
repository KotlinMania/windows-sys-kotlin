package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun EnableMouseInPointer(fenable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableMouseInPointer", longArrayOf(fenable.toLong())).toInt()
}

public fun GetPointerCursorId(pointerid: UInt, cursorid: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerCursorId", longArrayOf(pointerid.toLong(), cursorid)).toInt()
}

public fun GetPointerDevice(device: Foundation.HANDLE, pointerdevice: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerDevice", longArrayOf(Win32DynamicFfi.objectSlot(device), pointerdevice)).toInt()
}

public fun GetPointerDeviceCursors(device: Foundation.HANDLE, cursorcount: Long, devicecursors: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerDeviceCursors", longArrayOf(Win32DynamicFfi.objectSlot(device), cursorcount, devicecursors)).toInt()
}

public fun GetPointerDeviceProperties(device: Foundation.HANDLE, propertycount: Long, pointerproperties: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerDeviceProperties", longArrayOf(Win32DynamicFfi.objectSlot(device), propertycount, pointerproperties)).toInt()
}

public fun GetPointerDeviceRects(device: Foundation.HANDLE, pointerdevicerect: Long, displayrect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerDeviceRects", longArrayOf(Win32DynamicFfi.objectSlot(device), pointerdevicerect, displayrect)).toInt()
}

public fun GetPointerDevices(devicecount: Long, pointerdevices: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerDevices", longArrayOf(devicecount, pointerdevices)).toInt()
}

public fun GetPointerFrameInfo(pointerid: UInt, pointercount: Long, pointerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerFrameInfo", longArrayOf(pointerid.toLong(), pointercount, pointerinfo)).toInt()
}

public fun GetPointerFrameInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, pointerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerFrameInfoHistory", longArrayOf(pointerid.toLong(), entriescount, pointercount, pointerinfo)).toInt()
}

public fun GetPointerFramePenInfo(pointerid: UInt, pointercount: Long, peninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerFramePenInfo", longArrayOf(pointerid.toLong(), pointercount, peninfo)).toInt()
}

public fun GetPointerFramePenInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, peninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerFramePenInfoHistory", longArrayOf(pointerid.toLong(), entriescount, pointercount, peninfo)).toInt()
}

public fun GetPointerFrameTouchInfo(pointerid: UInt, pointercount: Long, touchinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerFrameTouchInfo", longArrayOf(pointerid.toLong(), pointercount, touchinfo)).toInt()
}

public fun GetPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, touchinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerFrameTouchInfoHistory", longArrayOf(pointerid.toLong(), entriescount, pointercount, touchinfo)).toInt()
}

public fun GetPointerInfo(pointerid: UInt, pointerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerInfo", longArrayOf(pointerid.toLong(), pointerinfo)).toInt()
}

public fun GetPointerInfoHistory(pointerid: UInt, entriescount: Long, pointerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerInfoHistory", longArrayOf(pointerid.toLong(), entriescount, pointerinfo)).toInt()
}

public fun GetPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerInputTransform", longArrayOf(pointerid.toLong(), historycount.toLong(), inputtransform)).toInt()
}

public fun GetPointerPenInfo(pointerid: UInt, peninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerPenInfo", longArrayOf(pointerid.toLong(), peninfo)).toInt()
}

public fun GetPointerPenInfoHistory(pointerid: UInt, entriescount: Long, peninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerPenInfoHistory", longArrayOf(pointerid.toLong(), entriescount, peninfo)).toInt()
}

public fun GetPointerTouchInfo(pointerid: UInt, touchinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerTouchInfo", longArrayOf(pointerid.toLong(), touchinfo)).toInt()
}

public fun GetPointerTouchInfoHistory(pointerid: UInt, entriescount: Long, touchinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerTouchInfoHistory", longArrayOf(pointerid.toLong(), entriescount, touchinfo)).toInt()
}

public fun GetPointerType(pointerid: UInt, pointertype: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPointerType", longArrayOf(pointerid.toLong(), pointertype)).toInt()
}

public fun GetRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: Long, pvalues: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetRawPointerDeviceData", longArrayOf(pointerid.toLong(), historycount.toLong(), propertiescount.toLong(), pproperties, pvalues)).toInt()
}

public fun GetUnpredictedMessagePos(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetUnpredictedMessagePos", longArrayOf()).toUInt()
}

public fun InitializeTouchInjection(maxcount: UInt, dwmode: TOUCH_FEEDBACK_MODE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InitializeTouchInjection", longArrayOf(maxcount.toLong(), dwmode.toLong())).toInt()
}

public fun InjectSyntheticPointerInput(device: Controls.HSYNTHETICPOINTERDEVICE, pointerinfo: Long, count: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InjectSyntheticPointerInput", longArrayOf(Win32DynamicFfi.objectSlot(device), pointerinfo, count.toLong())).toInt()
}

public fun InjectTouchInput(count: UInt, contacts: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InjectTouchInput", longArrayOf(count.toLong(), contacts)).toInt()
}

public fun IsMouseInPointerEnabled(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsMouseInPointerEnabled", longArrayOf()).toInt()
}

public fun SkipPointerFrameMessages(pointerid: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SkipPointerFrameMessages", longArrayOf(pointerid.toLong())).toInt()
}
