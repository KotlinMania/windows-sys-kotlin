package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT

public expect fun DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: UInt): LRESULT

public expect fun GetCIMSSM(inputmessagesource: Long): BOOL

public expect fun GetCurrentInputMessageSource(inputmessagesource: Long): BOOL

public expect fun GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt

public expect fun GetRawInputData(hrawinput: HRAWINPUT, uicommand: RAW_INPUT_DATA_COMMAND_FLAGS, pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt

public expect fun GetRawInputDeviceInfoA(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt

public expect fun GetRawInputDeviceInfoW(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt

public expect fun GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: UInt): UInt

public expect fun GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: UInt): UInt

public expect fun RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: UInt, cbsize: UInt): BOOL
