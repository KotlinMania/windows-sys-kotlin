@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HSYNTHETICPOINTERDEVICE

private object WindowsWin32UiInputPointerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_EnableMouseInPointer(fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerCursorId(pointerid: Int, cursorid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerDevice(device: Long, pointerdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerDeviceCursors(device: Long, cursorcount: Long, devicecursors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerDeviceProperties(device: Long, propertycount: Long, pointerproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerDeviceRects(device: Long, pointerdevicerect: Long, displayrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerDevices(devicecount: Long, pointerdevices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfo(pointerid: Int, pointercount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfo(pointerid: Int, pointercount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfo(pointerid: Int, pointercount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerInfo(pointerid: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerInfoHistory(pointerid: Int, entriescount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerInputTransform(pointerid: Int, historycount: Int, inputtransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerPenInfo(pointerid: Int, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerPenInfoHistory(pointerid: Int, entriescount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfo(pointerid: Int, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfoHistory(pointerid: Int, entriescount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetPointerType(pointerid: Int, pointertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetRawPointerDeviceData(pointerid: Int, historycount: Int, propertiescount: Int, pproperties: Long, pvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_GetUnpredictedMessagePos(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_InitializeTouchInjection(maxcount: Int, dwmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_InjectSyntheticPointerInput(device: Long, pointerinfo: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_InjectTouchInput(count: Int, contacts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_IsMouseInPointerEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_SkipPointerFrameMessages(pointerid: Int): Int
}

public actual fun EnableMouseInPointer(fenable: BOOL): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_EnableMouseInPointer(fenable)

public actual fun GetPointerCursorId(pointerid: UInt, cursorid: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerCursorId(pointerid.toInt(), cursorid)

public actual fun GetPointerDevice(device: HANDLE, pointerdevice: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerDevice(device, pointerdevice)

public actual fun GetPointerDeviceCursors(device: HANDLE, cursorcount: Long, devicecursors: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceCursors(device, cursorcount, devicecursors)

public actual fun GetPointerDeviceProperties(device: HANDLE, propertycount: Long, pointerproperties: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceProperties(device, propertycount, pointerproperties)

public actual fun GetPointerDeviceRects(device: HANDLE, pointerdevicerect: Long, displayrect: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceRects(device, pointerdevicerect, displayrect)

public actual fun GetPointerDevices(devicecount: Long, pointerdevices: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerDevices(devicecount, pointerdevices)

public actual fun GetPointerFrameInfo(pointerid: UInt, pointercount: Long, pointerinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfo(pointerid.toInt(), pointercount, pointerinfo)

public actual fun GetPointerFrameInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, pointerinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfoHistory(pointerid.toInt(), entriescount, pointercount, pointerinfo)

public actual fun GetPointerFramePenInfo(pointerid: UInt, pointercount: Long, peninfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfo(pointerid.toInt(), pointercount, peninfo)

public actual fun GetPointerFramePenInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, peninfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfoHistory(pointerid.toInt(), entriescount, pointercount, peninfo)

public actual fun GetPointerFrameTouchInfo(pointerid: UInt, pointercount: Long, touchinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfo(pointerid.toInt(), pointercount, touchinfo)

public actual fun GetPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, touchinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfoHistory(pointerid.toInt(), entriescount, pointercount, touchinfo)

public actual fun GetPointerInfo(pointerid: UInt, pointerinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerInfo(pointerid.toInt(), pointerinfo)

public actual fun GetPointerInfoHistory(pointerid: UInt, entriescount: Long, pointerinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerInfoHistory(pointerid.toInt(), entriescount, pointerinfo)

public actual fun GetPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerInputTransform(pointerid.toInt(), historycount.toInt(), inputtransform)

public actual fun GetPointerPenInfo(pointerid: UInt, peninfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerPenInfo(pointerid.toInt(), peninfo)

public actual fun GetPointerPenInfoHistory(pointerid: UInt, entriescount: Long, peninfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerPenInfoHistory(pointerid.toInt(), entriescount, peninfo)

public actual fun GetPointerTouchInfo(pointerid: UInt, touchinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfo(pointerid.toInt(), touchinfo)

public actual fun GetPointerTouchInfoHistory(pointerid: UInt, entriescount: Long, touchinfo: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfoHistory(pointerid.toInt(), entriescount, touchinfo)

public actual fun GetPointerType(pointerid: UInt, pointertype: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetPointerType(pointerid.toInt(), pointertype)

public actual fun GetRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: Long, pvalues: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), pproperties, pvalues)

public actual fun GetUnpredictedMessagePos(): UInt =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_GetUnpredictedMessagePos().toUInt()

public actual fun InitializeTouchInjection(maxcount: UInt, dwmode: TOUCH_FEEDBACK_MODE): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_InitializeTouchInjection(maxcount.toInt(), dwmode.toInt())

public actual fun InjectSyntheticPointerInput(device: HSYNTHETICPOINTERDEVICE, pointerinfo: Long, count: UInt): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_InjectSyntheticPointerInput(device, pointerinfo, count.toInt())

public actual fun InjectTouchInput(count: UInt, contacts: Long): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_InjectTouchInput(count.toInt(), contacts)

public actual fun IsMouseInPointerEnabled(): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_IsMouseInPointerEnabled()

public actual fun SkipPointerFrameMessages(pointerid: UInt): BOOL =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_SkipPointerFrameMessages(pointerid.toInt())
