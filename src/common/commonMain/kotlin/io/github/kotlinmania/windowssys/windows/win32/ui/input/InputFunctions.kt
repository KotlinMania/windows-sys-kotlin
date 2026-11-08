package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT

public fun DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: UInt): LRESULT {
    return Win32DynamicFfi.invoke("user32.dll", "DefRawInputProc", longArrayOf(parawinput, ninput.toLong(), cbsizeheader.toLong()))
}

public fun GetCIMSSM(inputmessagesource: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetCIMSSM", longArrayOf(inputmessagesource)).toInt()
}

public fun GetCurrentInputMessageSource(inputmessagesource: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetCurrentInputMessageSource", longArrayOf(inputmessagesource)).toInt()
}

public fun GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetRawInputBuffer", longArrayOf(pdata, pcbsize, cbsizeheader.toLong())).toUInt()
}

public fun GetRawInputData(hrawinput: HRAWINPUT, uicommand: RAW_INPUT_DATA_COMMAND_FLAGS, pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetRawInputData", longArrayOf(hrawinput, uicommand.toLong(), pdata, pcbsize, cbsizeheader.toLong())).toUInt()
}

public fun GetRawInputDeviceInfoA(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetRawInputDeviceInfoA", longArrayOf(hdevice, uicommand.toLong(), pdata, pcbsize)).toUInt()
}

public fun GetRawInputDeviceInfoW(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetRawInputDeviceInfoW", longArrayOf(hdevice, uicommand.toLong(), pdata, pcbsize)).toUInt()
}

public fun GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetRawInputDeviceList", longArrayOf(prawinputdevicelist, puinumdevices, cbsize.toLong())).toUInt()
}

public fun GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetRegisteredRawInputDevices", longArrayOf(prawinputdevices, puinumdevices, cbsize.toLong())).toUInt()
}

public fun RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: UInt, cbsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterRawInputDevices", longArrayOf(prawinputdevices, uinumdevices.toLong(), cbsize.toLong())).toInt()
}
