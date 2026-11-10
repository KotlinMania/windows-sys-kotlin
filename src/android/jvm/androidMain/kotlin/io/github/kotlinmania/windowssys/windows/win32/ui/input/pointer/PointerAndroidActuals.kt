@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

private object WindowsWin32UiInputPointerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_enableMouseInPointer(fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerCursorId(pointerid: Int, cursorid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerDevice(device: Long, pointerdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerDeviceCursors(device: Long, cursorcount: Long, devicecursors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerDeviceProperties(device: Long, propertycount: Long, pointerproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerDeviceRects(device: Long, pointerdevicerect: Long, displayrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerDevices(devicecount: Long, pointerdevices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerFrameInfo(pointerid: Int, pointercount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerFrameInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfo(pointerid: Int, pointercount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfo(pointerid: Int, pointercount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerInfo(pointerid: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerInfoHistory(pointerid: Int, entriescount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerInputTransform(pointerid: Int, historycount: Int, inputtransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerPenInfo(pointerid: Int, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerPenInfoHistory(pointerid: Int, entriescount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerTouchInfo(pointerid: Int, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerTouchInfoHistory(pointerid: Int, entriescount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getPointerType(pointerid: Int, pointertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getRawPointerDeviceData(pointerid: Int, historycount: Int, propertiescount: Int, pproperties: Long, pvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_getUnpredictedMessagePos(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_initializeTouchInjection(maxcount: Int, dwmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_injectSyntheticPointerInput(device: Long, pointerinfo: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_injectTouchInput(count: Int, contacts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_isMouseInPointerEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_pointer_skipPointerFrameMessages(pointerid: Int): Int
}

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_enableMouseInPointer(fenable)

public actual fun getPointerCursorId(pointerid: UInt, cursorid: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerCursorId(pointerid.toInt(), (cursorid?.value ?: 0L))

public actual fun getPointerDevice(device: Handle, pointerdevice: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerDevice((device?.value ?: 0L), (pointerdevice?.value ?: 0L))

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: COpaquePointer?, devicecursors: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerDeviceCursors((device?.value ?: 0L), (cursorcount?.value ?: 0L), (devicecursors?.value ?: 0L))

public actual fun getPointerDeviceProperties(device: Handle, propertycount: COpaquePointer?, pointerproperties: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerDeviceProperties((device?.value ?: 0L), (propertycount?.value ?: 0L), (pointerproperties?.value ?: 0L))

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: COpaquePointer?, displayrect: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerDeviceRects((device?.value ?: 0L), (pointerdevicerect?.value ?: 0L), (displayrect?.value ?: 0L))

public actual fun getPointerDevices(devicecount: COpaquePointer?, pointerdevices: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerDevices((devicecount?.value ?: 0L), (pointerdevices?.value ?: 0L))

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerFrameInfo(pointerid.toInt(), (pointercount?.value ?: 0L), (pointerinfo?.value ?: 0L))

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerFrameInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L), (pointercount?.value ?: 0L), (pointerinfo?.value ?: 0L))

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfo(pointerid.toInt(), (pointercount?.value ?: 0L), (peninfo?.value ?: 0L))

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L), (pointercount?.value ?: 0L), (peninfo?.value ?: 0L))

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfo(pointerid.toInt(), (pointercount?.value ?: 0L), (touchinfo?.value ?: 0L))

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L), (pointercount?.value ?: 0L), (touchinfo?.value ?: 0L))

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerInfo(pointerid.toInt(), (pointerinfo?.value ?: 0L))

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L), (pointerinfo?.value ?: 0L))

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerInputTransform(pointerid.toInt(), historycount.toInt(), (inputtransform?.value ?: 0L))

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerPenInfo(pointerid.toInt(), (peninfo?.value ?: 0L))

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerPenInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L), (peninfo?.value ?: 0L))

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerTouchInfo(pointerid.toInt(), (touchinfo?.value ?: 0L))

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerTouchInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L), (touchinfo?.value ?: 0L))

public actual fun getPointerType(pointerid: UInt, pointertype: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getPointerType(pointerid.toInt(), (pointertype?.value ?: 0L))

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: COpaquePointer?, pvalues: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), (pproperties?.value ?: 0L), (pvalues?.value ?: 0L))

public actual fun getUnpredictedMessagePos(): UInt =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_getUnpredictedMessagePos().toUInt()

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_initializeTouchInjection(maxcount.toInt(), dwmode.toInt())

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: COpaquePointer?, count: UInt): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_injectSyntheticPointerInput((device?.value ?: 0L), (pointerinfo?.value ?: 0L), count.toInt())

public actual fun injectTouchInput(count: UInt, contacts: COpaquePointer?): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_injectTouchInput(count.toInt(), (contacts?.value ?: 0L))

public actual fun isMouseInPointerEnabled(): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_isMouseInPointerEnabled()

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssys_windows_win32_ui_input_pointer_skipPointerFrameMessages(pointerid.toInt())
