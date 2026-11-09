package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HSYNTHETICPOINTERDEVICE

public expect fun EnableMouseInPointer(fenable: BOOL): BOOL

public expect fun GetPointerCursorId(pointerid: UInt, cursorid: Long): BOOL

public expect fun GetPointerDevice(device: HANDLE, pointerdevice: Long): BOOL

public expect fun GetPointerDeviceCursors(device: HANDLE, cursorcount: Long, devicecursors: Long): BOOL

public expect fun GetPointerDeviceProperties(device: HANDLE, propertycount: Long, pointerproperties: Long): BOOL

public expect fun GetPointerDeviceRects(device: HANDLE, pointerdevicerect: Long, displayrect: Long): BOOL

public expect fun GetPointerDevices(devicecount: Long, pointerdevices: Long): BOOL

public expect fun GetPointerFrameInfo(pointerid: UInt, pointercount: Long, pointerinfo: Long): BOOL

public expect fun GetPointerFrameInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, pointerinfo: Long): BOOL

public expect fun GetPointerFramePenInfo(pointerid: UInt, pointercount: Long, peninfo: Long): BOOL

public expect fun GetPointerFramePenInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, peninfo: Long): BOOL

public expect fun GetPointerFrameTouchInfo(pointerid: UInt, pointercount: Long, touchinfo: Long): BOOL

public expect fun GetPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, touchinfo: Long): BOOL

public expect fun GetPointerInfo(pointerid: UInt, pointerinfo: Long): BOOL

public expect fun GetPointerInfoHistory(pointerid: UInt, entriescount: Long, pointerinfo: Long): BOOL

public expect fun GetPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: Long): BOOL

public expect fun GetPointerPenInfo(pointerid: UInt, peninfo: Long): BOOL

public expect fun GetPointerPenInfoHistory(pointerid: UInt, entriescount: Long, peninfo: Long): BOOL

public expect fun GetPointerTouchInfo(pointerid: UInt, touchinfo: Long): BOOL

public expect fun GetPointerTouchInfoHistory(pointerid: UInt, entriescount: Long, touchinfo: Long): BOOL

public expect fun GetPointerType(pointerid: UInt, pointertype: Long): BOOL

public expect fun GetRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: Long, pvalues: Long): BOOL

public expect fun GetUnpredictedMessagePos(): UInt

public expect fun InitializeTouchInjection(maxcount: UInt, dwmode: TOUCH_FEEDBACK_MODE): BOOL

public expect fun InjectSyntheticPointerInput(device: HSYNTHETICPOINTERDEVICE, pointerinfo: Long, count: UInt): BOOL

public expect fun InjectTouchInput(count: UInt, contacts: Long): BOOL

public expect fun IsMouseInPointerEnabled(): BOOL

public expect fun SkipPointerFrameMessages(pointerid: UInt): BOOL
