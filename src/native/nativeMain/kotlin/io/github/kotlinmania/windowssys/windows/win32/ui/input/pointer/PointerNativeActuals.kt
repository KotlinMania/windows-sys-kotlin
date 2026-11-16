@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerEnableMouseInPointer
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerCursorId
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerDeviceRects
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerDevices
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerFrameInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerInfoHistory
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerInputTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerPenInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerTouchInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetPointerType
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerInitializeTouchInjection
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerInjectTouchInput
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.cinterop.windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    windowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable)

public actual fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerCursorId(pointerid, cursorid.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerDevice(device: Handle, pointerdevice: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerDevice(device.rawAddress.toCPointer<ByteVar>(), pointerdevice.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr, devicecursors: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(device.rawAddress.toCPointer<ByteVar>(), cursorcount.rawAddress.toCPointer<ByteVar>(), devicecursors.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr, pointerproperties: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(device.rawAddress.toCPointer<ByteVar>(), propertycount.rawAddress.toCPointer<ByteVar>(), pointerproperties.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr, displayrect: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerDeviceRects(device.rawAddress.toCPointer<ByteVar>(), pointerdevicerect.rawAddress.toCPointer<ByteVar>(), displayrect.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerDevices(devicecount: MutPtr, pointerdevices: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerDevices(devicecount.rawAddress.toCPointer<ByteVar>(), pointerdevices.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr, pointerinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerFrameInfo(pointerid, pointercount.rawAddress.toCPointer<ByteVar>(), pointerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, pointerinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(pointerid, entriescount.rawAddress.toCPointer<ByteVar>(), pointercount.rawAddress.toCPointer<ByteVar>(), pointerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr, peninfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(pointerid, pointercount.rawAddress.toCPointer<ByteVar>(), peninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, peninfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(pointerid, entriescount.rawAddress.toCPointer<ByteVar>(), pointercount.rawAddress.toCPointer<ByteVar>(), peninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr, touchinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(pointerid, pointercount.rawAddress.toCPointer<ByteVar>(), touchinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, touchinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(pointerid, entriescount.rawAddress.toCPointer<ByteVar>(), pointercount.rawAddress.toCPointer<ByteVar>(), touchinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerInfo(pointerid, pointerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr, pointerinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerInfoHistory(pointerid, entriescount.rawAddress.toCPointer<ByteVar>(), pointerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerInputTransform(pointerid, historycount, inputtransform.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerPenInfo(pointerid, peninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr, peninfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(pointerid, entriescount.rawAddress.toCPointer<ByteVar>(), peninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerTouchInfo(pointerid, touchinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, touchinfo: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(pointerid, entriescount.rawAddress.toCPointer<ByteVar>(), touchinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPointerType(pointerid: UInt, pointertype: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetPointerType(pointerid, pointertype.rawAddress.toCPointer<ByteVar>())

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr, pvalues: MutPtr): Bool =
    windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(pointerid, historycount, propertiescount, pproperties.rawAddress.toCPointer<ByteVar>(), pvalues.rawAddress.toCPointer<ByteVar>())

public actual fun getUnpredictedMessagePos(): UInt =
    windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos()

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    windowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount, dwmode)

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr, count: UInt): Bool =
    windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(device.rawAddress.toCPointer<ByteVar>(), pointerinfo.rawAddress.toCPointer<ByteVar>(), count)

public actual fun injectTouchInput(count: UInt, contacts: ConstPtr): Bool =
    windowssysWindowsWin32UiInputPointerInjectTouchInput(count, contacts.rawAddress.toCPointer<ByteVar>())

public actual fun isMouseInPointerEnabled(): Bool =
    windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled()

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid)
