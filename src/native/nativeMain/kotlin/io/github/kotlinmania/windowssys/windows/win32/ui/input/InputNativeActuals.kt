@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_defRawInputProc
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getCIMSSM
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getCurrentInputMessageSource
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getRawInputBuffer
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getRawInputData
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getRawInputDeviceInfoA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getRawInputDeviceInfoW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getRawInputDeviceList
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_getRegisteredRawInputDevices
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_registerRawInputDevices
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun defRawInputProc(parawinput: COpaquePointer?, ninput: Int, cbsizeheader: UInt): Lresult =
    windowssys_windows_win32_ui_input_defRawInputProc(parawinput?.value?.toCPointer<ByteVar>(), ninput, cbsizeheader)

public actual fun getCIMSSM(inputmessagesource: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_input_getCIMSSM(inputmessagesource?.value?.toCPointer<ByteVar>())

public actual fun getCurrentInputMessageSource(inputmessagesource: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_input_getCurrentInputMessageSource(inputmessagesource?.value?.toCPointer<ByteVar>())

public actual fun getRawInputBuffer(pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    windowssys_windows_win32_ui_input_getRawInputBuffer(pdata?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>(), cbsizeheader)

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    windowssys_windows_win32_ui_input_getRawInputData(hrawinput?.value?.toCPointer<ByteVar>(), uicommand, pdata?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>(), cbsizeheader)

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    windowssys_windows_win32_ui_input_getRawInputDeviceInfoA(hdevice?.value?.toCPointer<ByteVar>(), uicommand, pdata?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    windowssys_windows_win32_ui_input_getRawInputDeviceInfoW(hdevice?.value?.toCPointer<ByteVar>(), uicommand, pdata?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun getRawInputDeviceList(prawinputdevicelist: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    windowssys_windows_win32_ui_input_getRawInputDeviceList(prawinputdevicelist?.value?.toCPointer<ByteVar>(), puinumdevices?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun getRegisteredRawInputDevices(prawinputdevices: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    windowssys_windows_win32_ui_input_getRegisteredRawInputDevices(prawinputdevices?.value?.toCPointer<ByteVar>(), puinumdevices?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun registerRawInputDevices(prawinputdevices: COpaquePointer?, uinumdevices: UInt, cbsize: UInt): Bool =
    windowssys_windows_win32_ui_input_registerRawInputDevices(prawinputdevices?.value?.toCPointer<ByteVar>(), uinumdevices, cbsize)
