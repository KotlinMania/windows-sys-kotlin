@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputPointerEnableMouseInPointer")
private external fun wasiWindowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable: Int): Int

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    wasiWindowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable).toInt()

public actual fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerCursorId")

public actual fun getPointerDevice(device: Handle, pointerdevice: MutPtr<PointerDeviceInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerDevice")

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr<UInt>, devicecursors: MutPtr<PointerDeviceCursorInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors")

public actual fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr<UInt>, pointerproperties: MutPtr<PointerDeviceProperty>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties")

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr<Rect>, displayrect: MutPtr<Rect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerDeviceRects")

public actual fun getPointerDevices(devicecount: MutPtr<UInt>, pointerdevices: MutPtr<PointerDeviceInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerDevices")

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerFrameInfo")

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory")

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo")

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory")

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo")

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory")

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr<PointerInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerInfo")

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerInfoHistory")

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr<InputTransform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerInputTransform")

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr<PointerPenInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerPenInfo")

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory")

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerTouchInfo")

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory")

public actual fun getPointerType(pointerid: UInt, pointertype: MutPtr<PointerInputType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetPointerType")

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr<PointerDeviceProperty>, pvalues: MutPtr<Int>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos")
private external fun wasiWindowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos(): Int

public actual fun getUnpredictedMessagePos(): UInt =
    wasiWindowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputPointerInitializeTouchInjection")
private external fun wasiWindowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount: Int, dwmode: Int): Int

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    wasiWindowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount.toInt(), dwmode.toInt()).toInt()

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr<PointerTypeInfo>, count: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput")

public actual fun injectTouchInput(count: UInt, contacts: ConstPtr<PointerTouchInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputPointerInjectTouchInput")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled")
private external fun wasiWindowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled(): Int

public actual fun isMouseInPointerEnabled(): Bool =
    wasiWindowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages")
private external fun wasiWindowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid: Int): Int

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    wasiWindowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid.toInt()).toInt()
