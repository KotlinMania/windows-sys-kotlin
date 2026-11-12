@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

private object WindowsWin32UiInputPointerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerCursorId(pointerid: Int, cursorid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerDevice(device: Long, pointerdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(device: Long, cursorcount: Long, devicecursors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(device: Long, propertycount: Long, pointerproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerDeviceRects(device: Long, pointerdevicerect: Long, displayrect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerDevices(devicecount: Long, pointerdevices: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerFrameInfo(pointerid: Int, pointercount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(pointerid: Int, pointercount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(pointerid: Int, pointercount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(pointerid: Int, entriescount: Long, pointercount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerInfo(pointerid: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerInfoHistory(pointerid: Int, entriescount: Long, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerInputTransform(pointerid: Int, historycount: Int, inputtransform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerPenInfo(pointerid: Int, peninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(pointerid: Int, entriescount: Long, peninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerTouchInfo(pointerid: Int, touchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(pointerid: Int, entriescount: Long, touchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetPointerType(pointerid: Int, pointertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(pointerid: Int, historycount: Int, propertiescount: Int, pproperties: Long, pvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount: Int, dwmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(device: Long, pointerinfo: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerInjectTouchInput(count: Int, contacts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid: Int): Int
}

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable)

public actual fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerCursorId(pointerid.toInt(), cursorid.rawAddress)

public actual fun getPointerDevice(device: Handle, pointerdevice: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerDevice(device.rawAddress, pointerdevice.rawAddress)

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr, devicecursors: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(device.rawAddress, cursorcount.rawAddress, devicecursors.rawAddress)

public actual fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr, pointerproperties: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(device.rawAddress, propertycount.rawAddress, pointerproperties.rawAddress)

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr, displayrect: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerDeviceRects(device.rawAddress, pointerdevicerect.rawAddress, displayrect.rawAddress)

public actual fun getPointerDevices(devicecount: MutPtr, pointerdevices: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerDevices(devicecount.rawAddress, pointerdevices.rawAddress)

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr, pointerinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerFrameInfo(pointerid.toInt(), pointercount.rawAddress, pointerinfo.rawAddress)

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, pointerinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(pointerid.toInt(), entriescount.rawAddress, pointercount.rawAddress, pointerinfo.rawAddress)

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr, peninfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(pointerid.toInt(), pointercount.rawAddress, peninfo.rawAddress)

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, peninfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(pointerid.toInt(), entriescount.rawAddress, pointercount.rawAddress, peninfo.rawAddress)

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr, touchinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(pointerid.toInt(), pointercount.rawAddress, touchinfo.rawAddress)

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, touchinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(pointerid.toInt(), entriescount.rawAddress, pointercount.rawAddress, touchinfo.rawAddress)

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerInfo(pointerid.toInt(), pointerinfo.rawAddress)

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr, pointerinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerInfoHistory(pointerid.toInt(), entriescount.rawAddress, pointerinfo.rawAddress)

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerInputTransform(pointerid.toInt(), historycount.toInt(), inputtransform.rawAddress)

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerPenInfo(pointerid.toInt(), peninfo.rawAddress)

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr, peninfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(pointerid.toInt(), entriescount.rawAddress, peninfo.rawAddress)

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerTouchInfo(pointerid.toInt(), touchinfo.rawAddress)

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, touchinfo: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(pointerid.toInt(), entriescount.rawAddress, touchinfo.rawAddress)

public actual fun getPointerType(pointerid: UInt, pointertype: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetPointerType(pointerid.toInt(), pointertype.rawAddress)

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr, pvalues: MutPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), pproperties.rawAddress, pvalues.rawAddress)

public actual fun getUnpredictedMessagePos(): UInt =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos().toUInt()

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount.toInt(), dwmode.toInt())

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr, count: UInt): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(device.rawAddress, pointerinfo.rawAddress, count.toInt())

public actual fun injectTouchInput(count: UInt, contacts: ConstPtr): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerInjectTouchInput(count.toInt(), contacts.rawAddress)

public actual fun isMouseInPointerEnabled(): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled()

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    WindowsWin32UiInputPointerJniBridge.windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid.toInt())
