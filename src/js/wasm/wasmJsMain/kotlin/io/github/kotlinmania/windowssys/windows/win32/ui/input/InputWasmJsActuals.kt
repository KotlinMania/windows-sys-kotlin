@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT

public actual fun DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: UInt): LRESULT =
    0L

public actual fun GetCIMSSM(inputmessagesource: Long): BOOL =
    0

public actual fun GetCurrentInputMessageSource(inputmessagesource: Long): BOOL =
    0

public actual fun GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    0u

public actual fun GetRawInputData(hrawinput: HRAWINPUT, uicommand: RAW_INPUT_DATA_COMMAND_FLAGS, pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    0u

public actual fun GetRawInputDeviceInfoA(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    0u

public actual fun GetRawInputDeviceInfoW(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    0u

public actual fun GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: UInt): UInt =
    0u

public actual fun GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: UInt): UInt =
    0u

public actual fun RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: UInt, cbsize: UInt): BOOL =
    0
