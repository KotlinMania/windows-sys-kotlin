@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun defRawInputProc(parawinput: ConstPtr, ninput: Int, cbsizeheader: UInt): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputDefRawInputProc")

public actual fun getCIMSSM(inputmessagesource: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetCIMSSM")

public actual fun getCurrentInputMessageSource(inputmessagesource: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetCurrentInputMessageSource")

public actual fun getRawInputBuffer(pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetRawInputBuffer")

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetRawInputData")

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetRawInputDeviceInfoA")

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetRawInputDeviceInfoW")

public actual fun getRawInputDeviceList(prawinputdevicelist: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetRawInputDeviceList")

public actual fun getRegisteredRawInputDevices(prawinputdevices: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputGetRegisteredRawInputDevices")

public actual fun registerRawInputDevices(prawinputdevices: ConstPtr, uinumdevices: UInt, cbsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputRegisterRawInputDevices")
