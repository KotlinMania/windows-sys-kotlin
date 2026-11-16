package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

public expect fun enableMouseInPointer(fenable: Bool): Bool

public expect fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr): Bool

public expect fun getPointerDevice(device: Handle, pointerdevice: MutPtr): Bool

public expect fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr, devicecursors: MutPtr): Bool

public expect fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr, pointerproperties: MutPtr): Bool

public expect fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr, displayrect: MutPtr): Bool

public expect fun getPointerDevices(devicecount: MutPtr, pointerdevices: MutPtr): Bool

public expect fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr, pointerinfo: MutPtr): Bool

public expect fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, pointerinfo: MutPtr): Bool

public expect fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr, peninfo: MutPtr): Bool

public expect fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, peninfo: MutPtr): Bool

public expect fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr, touchinfo: MutPtr): Bool

public expect fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, touchinfo: MutPtr): Bool

public expect fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr): Bool

public expect fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr, pointerinfo: MutPtr): Bool

public expect fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr): Bool

public expect fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr): Bool

public expect fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr, peninfo: MutPtr): Bool

public expect fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr): Bool

public expect fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, touchinfo: MutPtr): Bool

public expect fun getPointerType(pointerid: UInt, pointertype: MutPtr): Bool

public expect fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr, pvalues: MutPtr): Bool

public expect fun getUnpredictedMessagePos(): UInt

public expect fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool

public expect fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr, count: UInt): Bool

public expect fun injectTouchInput(count: UInt, contacts: ConstPtr): Bool

public expect fun isMouseInPointerEnabled(): Bool

public expect fun skipPointerFrameMessages(pointerid: UInt): Bool
