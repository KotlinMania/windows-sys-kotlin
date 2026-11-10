package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

public expect fun enableMouseInPointer(fenable: Bool): Bool

public expect fun getPointerCursorId(pointerid: UInt, cursorid: COpaquePointer?): Bool

public expect fun getPointerDevice(device: Handle, pointerdevice: COpaquePointer?): Bool

public expect fun getPointerDeviceCursors(device: Handle, cursorcount: COpaquePointer?, devicecursors: COpaquePointer?): Bool

public expect fun getPointerDeviceProperties(device: Handle, propertycount: COpaquePointer?, pointerproperties: COpaquePointer?): Bool

public expect fun getPointerDeviceRects(device: Handle, pointerdevicerect: COpaquePointer?, displayrect: COpaquePointer?): Bool

public expect fun getPointerDevices(devicecount: COpaquePointer?, pointerdevices: COpaquePointer?): Bool

public expect fun getPointerFrameInfo(pointerid: UInt, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool

public expect fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool

public expect fun getPointerFramePenInfo(pointerid: UInt, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool

public expect fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool

public expect fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool

public expect fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool

public expect fun getPointerInfo(pointerid: UInt, pointerinfo: COpaquePointer?): Bool

public expect fun getPointerInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool

public expect fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: COpaquePointer?): Bool

public expect fun getPointerPenInfo(pointerid: UInt, peninfo: COpaquePointer?): Bool

public expect fun getPointerPenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, peninfo: COpaquePointer?): Bool

public expect fun getPointerTouchInfo(pointerid: UInt, touchinfo: COpaquePointer?): Bool

public expect fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, touchinfo: COpaquePointer?): Bool

public expect fun getPointerType(pointerid: UInt, pointertype: COpaquePointer?): Bool

public expect fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: COpaquePointer?, pvalues: COpaquePointer?): Bool

public expect fun getUnpredictedMessagePos(): UInt

public expect fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool

public expect fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: COpaquePointer?, count: UInt): Bool

public expect fun injectTouchInput(count: UInt, contacts: COpaquePointer?): Bool

public expect fun isMouseInPointerEnabled(): Bool

public expect fun skipPointerFrameMessages(pointerid: UInt): Bool
