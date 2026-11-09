@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: UInt): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_DefRawInputProc(parawinput.toCPointer<ByteVar>(), ninput, cbsizeheader)

public actual fun GetCIMSSM(inputmessagesource: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetCIMSSM(inputmessagesource.toCPointer<ByteVar>())

public actual fun GetCurrentInputMessageSource(inputmessagesource: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetCurrentInputMessageSource(inputmessagesource.toCPointer<ByteVar>())

public actual fun GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetRawInputBuffer(pdata.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>(), cbsizeheader)

public actual fun GetRawInputData(hrawinput: HRAWINPUT, uicommand: RAW_INPUT_DATA_COMMAND_FLAGS, pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetRawInputData(hrawinput.toCPointer<ByteVar>(), uicommand, pdata.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>(), cbsizeheader)

public actual fun GetRawInputDeviceInfoA(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetRawInputDeviceInfoA(hdevice.toCPointer<ByteVar>(), uicommand, pdata.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun GetRawInputDeviceInfoW(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetRawInputDeviceInfoW(hdevice.toCPointer<ByteVar>(), uicommand, pdata.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetRawInputDeviceList(prawinputdevicelist.toCPointer<ByteVar>(), puinumdevices.toCPointer<ByteVar>(), cbsize)

public actual fun GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_GetRegisteredRawInputDevices(prawinputdevices.toCPointer<ByteVar>(), puinumdevices.toCPointer<ByteVar>(), cbsize)

public actual fun RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: UInt, cbsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssys_windows_win32_ui_input_RegisterRawInputDevices(prawinputdevices.toCPointer<ByteVar>(), uinumdevices, cbsize)
