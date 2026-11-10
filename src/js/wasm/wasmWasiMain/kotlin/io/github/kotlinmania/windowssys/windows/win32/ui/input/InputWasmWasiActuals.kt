@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

public actual fun defRawInputProc(parawinput: COpaquePointer?, ninput: Int, cbsizeheader: UInt): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCIMSSM(inputmessagesource: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentInputMessageSource(inputmessagesource: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRawInputBuffer(pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRawInputDeviceList(prawinputdevicelist: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRegisteredRawInputDevices(prawinputdevices: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerRawInputDevices(prawinputdevices: COpaquePointer?, uinumdevices: UInt, cbsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
