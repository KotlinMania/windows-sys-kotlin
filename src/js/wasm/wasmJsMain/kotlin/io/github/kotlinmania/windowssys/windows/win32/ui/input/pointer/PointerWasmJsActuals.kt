@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HSYNTHETICPOINTERDEVICE

public actual fun EnableMouseInPointer(fenable: BOOL): BOOL =
    0

public actual fun GetPointerCursorId(pointerid: UInt, cursorid: Long): BOOL =
    0

public actual fun GetPointerDevice(device: HANDLE, pointerdevice: Long): BOOL =
    0

public actual fun GetPointerDeviceCursors(device: HANDLE, cursorcount: Long, devicecursors: Long): BOOL =
    0

public actual fun GetPointerDeviceProperties(device: HANDLE, propertycount: Long, pointerproperties: Long): BOOL =
    0

public actual fun GetPointerDeviceRects(device: HANDLE, pointerdevicerect: Long, displayrect: Long): BOOL =
    0

public actual fun GetPointerDevices(devicecount: Long, pointerdevices: Long): BOOL =
    0

public actual fun GetPointerFrameInfo(pointerid: UInt, pointercount: Long, pointerinfo: Long): BOOL =
    0

public actual fun GetPointerFrameInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, pointerinfo: Long): BOOL =
    0

public actual fun GetPointerFramePenInfo(pointerid: UInt, pointercount: Long, peninfo: Long): BOOL =
    0

public actual fun GetPointerFramePenInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, peninfo: Long): BOOL =
    0

public actual fun GetPointerFrameTouchInfo(pointerid: UInt, pointercount: Long, touchinfo: Long): BOOL =
    0

public actual fun GetPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, touchinfo: Long): BOOL =
    0

public actual fun GetPointerInfo(pointerid: UInt, pointerinfo: Long): BOOL =
    0

public actual fun GetPointerInfoHistory(pointerid: UInt, entriescount: Long, pointerinfo: Long): BOOL =
    0

public actual fun GetPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: Long): BOOL =
    0

public actual fun GetPointerPenInfo(pointerid: UInt, peninfo: Long): BOOL =
    0

public actual fun GetPointerPenInfoHistory(pointerid: UInt, entriescount: Long, peninfo: Long): BOOL =
    0

public actual fun GetPointerTouchInfo(pointerid: UInt, touchinfo: Long): BOOL =
    0

public actual fun GetPointerTouchInfoHistory(pointerid: UInt, entriescount: Long, touchinfo: Long): BOOL =
    0

public actual fun GetPointerType(pointerid: UInt, pointertype: Long): BOOL =
    0

public actual fun GetRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: Long, pvalues: Long): BOOL =
    0

public actual fun GetUnpredictedMessagePos(): UInt =
    0u

public actual fun InitializeTouchInjection(maxcount: UInt, dwmode: TOUCH_FEEDBACK_MODE): BOOL =
    0

public actual fun InjectSyntheticPointerInput(device: HSYNTHETICPOINTERDEVICE, pointerinfo: Long, count: UInt): BOOL =
    0

public actual fun InjectTouchInput(count: UInt, contacts: Long): BOOL =
    0

public actual fun IsMouseInPointerEnabled(): BOOL =
    0

public actual fun SkipPointerFrameMessages(pointerid: UInt): BOOL =
    0
