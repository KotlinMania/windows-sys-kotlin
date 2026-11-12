package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerDeviceCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerDeviceProperty
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerTypeInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

public expect fun enableMouseInPointer(fenable: Bool): Bool

public expect fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr<UInt>): Bool

public expect fun getPointerDevice(device: Handle, pointerdevice: MutPtr<PointerDeviceInfo>): Bool

public expect fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr<UInt>, devicecursors: MutPtr<PointerDeviceCursorInfo>): Bool

public expect fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr<UInt>, pointerproperties: MutPtr<PointerDeviceProperty>): Bool

public expect fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr<Rect>, displayrect: MutPtr<Rect>): Bool

public expect fun getPointerDevices(devicecount: MutPtr<UInt>, pointerdevices: MutPtr<PointerDeviceInfo>): Bool

public expect fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool

public expect fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool

public expect fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool

public expect fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool

public expect fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool

public expect fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool

public expect fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr<PointerInfo>): Bool

public expect fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool

public expect fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr<InputTransform>): Bool

public expect fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr<PointerPenInfo>): Bool

public expect fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool

public expect fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr<PointerTouchInfo>): Bool

public expect fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool

public expect fun getPointerType(pointerid: UInt, pointertype: MutPtr<PointerInputType>): Bool

public expect fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr<PointerDeviceProperty>, pvalues: MutPtr<Int>): Bool

public expect fun getUnpredictedMessagePos(): UInt

public expect fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool

public expect fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr<PointerTypeInfo>, count: UInt): Bool

public expect fun injectTouchInput(count: UInt, contacts: ConstPtr<PointerTouchInfo>): Bool

public expect fun isMouseInPointerEnabled(): Bool

public expect fun skipPointerFrameMessages(pointerid: UInt): Bool
