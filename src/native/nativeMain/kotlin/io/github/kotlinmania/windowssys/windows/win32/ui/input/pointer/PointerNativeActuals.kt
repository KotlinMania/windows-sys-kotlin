@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HSYNTHETICPOINTERDEVICE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun EnableMouseInPointer(fenable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_EnableMouseInPointer(fenable)

public actual fun GetPointerCursorId(pointerid: UInt, cursorid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerCursorId(pointerid, cursorid.toCPointer<ByteVar>())

public actual fun GetPointerDevice(device: HANDLE, pointerdevice: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerDevice(device.toCPointer<ByteVar>(), pointerdevice.toCPointer<ByteVar>())

public actual fun GetPointerDeviceCursors(device: HANDLE, cursorcount: Long, devicecursors: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceCursors(device.toCPointer<ByteVar>(), cursorcount.toCPointer<ByteVar>(), devicecursors.toCPointer<ByteVar>())

public actual fun GetPointerDeviceProperties(device: HANDLE, propertycount: Long, pointerproperties: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceProperties(device.toCPointer<ByteVar>(), propertycount.toCPointer<ByteVar>(), pointerproperties.toCPointer<ByteVar>())

public actual fun GetPointerDeviceRects(device: HANDLE, pointerdevicerect: Long, displayrect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceRects(device.toCPointer<ByteVar>(), pointerdevicerect.toCPointer<ByteVar>(), displayrect.toCPointer<ByteVar>())

public actual fun GetPointerDevices(devicecount: Long, pointerdevices: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerDevices(devicecount.toCPointer<ByteVar>(), pointerdevices.toCPointer<ByteVar>())

public actual fun GetPointerFrameInfo(pointerid: UInt, pointercount: Long, pointerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfo(pointerid, pointercount.toCPointer<ByteVar>(), pointerinfo.toCPointer<ByteVar>())

public actual fun GetPointerFrameInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, pointerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfoHistory(pointerid, entriescount.toCPointer<ByteVar>(), pointercount.toCPointer<ByteVar>(), pointerinfo.toCPointer<ByteVar>())

public actual fun GetPointerFramePenInfo(pointerid: UInt, pointercount: Long, peninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfo(pointerid, pointercount.toCPointer<ByteVar>(), peninfo.toCPointer<ByteVar>())

public actual fun GetPointerFramePenInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, peninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfoHistory(pointerid, entriescount.toCPointer<ByteVar>(), pointercount.toCPointer<ByteVar>(), peninfo.toCPointer<ByteVar>())

public actual fun GetPointerFrameTouchInfo(pointerid: UInt, pointercount: Long, touchinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfo(pointerid, pointercount.toCPointer<ByteVar>(), touchinfo.toCPointer<ByteVar>())

public actual fun GetPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, touchinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfoHistory(pointerid, entriescount.toCPointer<ByteVar>(), pointercount.toCPointer<ByteVar>(), touchinfo.toCPointer<ByteVar>())

public actual fun GetPointerInfo(pointerid: UInt, pointerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerInfo(pointerid, pointerinfo.toCPointer<ByteVar>())

public actual fun GetPointerInfoHistory(pointerid: UInt, entriescount: Long, pointerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerInfoHistory(pointerid, entriescount.toCPointer<ByteVar>(), pointerinfo.toCPointer<ByteVar>())

public actual fun GetPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerInputTransform(pointerid, historycount, inputtransform.toCPointer<ByteVar>())

public actual fun GetPointerPenInfo(pointerid: UInt, peninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerPenInfo(pointerid, peninfo.toCPointer<ByteVar>())

public actual fun GetPointerPenInfoHistory(pointerid: UInt, entriescount: Long, peninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerPenInfoHistory(pointerid, entriescount.toCPointer<ByteVar>(), peninfo.toCPointer<ByteVar>())

public actual fun GetPointerTouchInfo(pointerid: UInt, touchinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfo(pointerid, touchinfo.toCPointer<ByteVar>())

public actual fun GetPointerTouchInfoHistory(pointerid: UInt, entriescount: Long, touchinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfoHistory(pointerid, entriescount.toCPointer<ByteVar>(), touchinfo.toCPointer<ByteVar>())

public actual fun GetPointerType(pointerid: UInt, pointertype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetPointerType(pointerid, pointertype.toCPointer<ByteVar>())

public actual fun GetRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: Long, pvalues: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetRawPointerDeviceData(pointerid, historycount, propertiescount, pproperties.toCPointer<ByteVar>(), pvalues.toCPointer<ByteVar>())

public actual fun GetUnpredictedMessagePos(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_GetUnpredictedMessagePos()

public actual fun InitializeTouchInjection(maxcount: UInt, dwmode: TOUCH_FEEDBACK_MODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_InitializeTouchInjection(maxcount, dwmode)

public actual fun InjectSyntheticPointerInput(device: HSYNTHETICPOINTERDEVICE, pointerinfo: Long, count: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_InjectSyntheticPointerInput(device.toCPointer<ByteVar>(), pointerinfo.toCPointer<ByteVar>(), count)

public actual fun InjectTouchInput(count: UInt, contacts: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_InjectTouchInput(count, contacts.toCPointer<ByteVar>())

public actual fun IsMouseInPointerEnabled(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_IsMouseInPointerEnabled()

public actual fun SkipPointerFrameMessages(pointerid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_SkipPointerFrameMessages(pointerid)
