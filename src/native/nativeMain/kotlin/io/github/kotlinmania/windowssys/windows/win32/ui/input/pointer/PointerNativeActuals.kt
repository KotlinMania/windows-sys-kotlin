@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_enableMouseInPointer(fenable)

public actual fun getPointerCursorId(pointerid: UInt, cursorid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerCursorId(pointerid, cursorid?.value?.toCPointer<ByteVar>())

public actual fun getPointerDevice(device: Handle, pointerdevice: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerDevice(device?.value?.toCPointer<ByteVar>(), pointerdevice?.value?.toCPointer<ByteVar>())

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: COpaquePointer?, devicecursors: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerDeviceCursors(device?.value?.toCPointer<ByteVar>(), cursorcount?.value?.toCPointer<ByteVar>(), devicecursors?.value?.toCPointer<ByteVar>())

public actual fun getPointerDeviceProperties(device: Handle, propertycount: COpaquePointer?, pointerproperties: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerDeviceProperties(device?.value?.toCPointer<ByteVar>(), propertycount?.value?.toCPointer<ByteVar>(), pointerproperties?.value?.toCPointer<ByteVar>())

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: COpaquePointer?, displayrect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerDeviceRects(device?.value?.toCPointer<ByteVar>(), pointerdevicerect?.value?.toCPointer<ByteVar>(), displayrect?.value?.toCPointer<ByteVar>())

public actual fun getPointerDevices(devicecount: COpaquePointer?, pointerdevices: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerDevices(devicecount?.value?.toCPointer<ByteVar>(), pointerdevices?.value?.toCPointer<ByteVar>())

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerFrameInfo(pointerid, pointercount?.value?.toCPointer<ByteVar>(), pointerinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerFrameInfoHistory(pointerid, entriescount?.value?.toCPointer<ByteVar>(), pointercount?.value?.toCPointer<ByteVar>(), pointerinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfo(pointerid, pointercount?.value?.toCPointer<ByteVar>(), peninfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfoHistory(pointerid, entriescount?.value?.toCPointer<ByteVar>(), pointercount?.value?.toCPointer<ByteVar>(), peninfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfo(pointerid, pointercount?.value?.toCPointer<ByteVar>(), touchinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfoHistory(pointerid, entriescount?.value?.toCPointer<ByteVar>(), pointercount?.value?.toCPointer<ByteVar>(), touchinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerInfo(pointerid, pointerinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerInfoHistory(pointerid, entriescount?.value?.toCPointer<ByteVar>(), pointerinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerInputTransform(pointerid, historycount, inputtransform?.value?.toCPointer<ByteVar>())

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerPenInfo(pointerid, peninfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerPenInfoHistory(pointerid, entriescount?.value?.toCPointer<ByteVar>(), peninfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerTouchInfo(pointerid, touchinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerTouchInfoHistory(pointerid, entriescount?.value?.toCPointer<ByteVar>(), touchinfo?.value?.toCPointer<ByteVar>())

public actual fun getPointerType(pointerid: UInt, pointertype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getPointerType(pointerid, pointertype?.value?.toCPointer<ByteVar>())

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: COpaquePointer?, pvalues: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getRawPointerDeviceData(pointerid, historycount, propertiescount, pproperties?.value?.toCPointer<ByteVar>(), pvalues?.value?.toCPointer<ByteVar>())

public actual fun getUnpredictedMessagePos(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_getUnpredictedMessagePos()

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_initializeTouchInjection(maxcount, dwmode)

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: COpaquePointer?, count: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_injectSyntheticPointerInput(device?.value?.toCPointer<ByteVar>(), pointerinfo?.value?.toCPointer<ByteVar>(), count)

public actual fun injectTouchInput(count: UInt, contacts: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_injectTouchInput(count, contacts?.value?.toCPointer<ByteVar>())

public actual fun isMouseInPointerEnabled(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_isMouseInPointerEnabled()

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssys_windows_win32_ui_input_pointer_skipPointerFrameMessages(pointerid)
