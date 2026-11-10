@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerCursorId(pointerid: UInt, cursorid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerDevice(device: Handle, pointerdevice: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: COpaquePointer?, devicecursors: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerDeviceProperties(device: Handle, propertycount: COpaquePointer?, pointerproperties: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: COpaquePointer?, displayrect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerDevices(devicecount: COpaquePointer?, pointerdevices: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPointerType(pointerid: UInt, pointertype: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: COpaquePointer?, pvalues: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUnpredictedMessagePos(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: COpaquePointer?, count: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun injectTouchInput(count: UInt, contacts: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isMouseInPointerEnabled(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
