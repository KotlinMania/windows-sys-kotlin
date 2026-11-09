@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT

private object WindowsWin32UiInputJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetCIMSSM(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetCurrentInputMessageSource(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetRawInputData(hrawinput: Long, uicommand: Int, pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetRawInputDeviceInfoA(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetRawInputDeviceInfoW(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: Int, cbsize: Int): Int
}

public actual fun DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: UInt): LRESULT =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_DefRawInputProc(parawinput, ninput, cbsizeheader.toInt())

public actual fun GetCIMSSM(inputmessagesource: Long): BOOL =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetCIMSSM(inputmessagesource)

public actual fun GetCurrentInputMessageSource(inputmessagesource: Long): BOOL =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetCurrentInputMessageSource(inputmessagesource)

public actual fun GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetRawInputBuffer(pdata, pcbsize, cbsizeheader.toInt()).toUInt()

public actual fun GetRawInputData(hrawinput: HRAWINPUT, uicommand: RAW_INPUT_DATA_COMMAND_FLAGS, pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetRawInputData(hrawinput, uicommand.toInt(), pdata, pcbsize, cbsizeheader.toInt()).toUInt()

public actual fun GetRawInputDeviceInfoA(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetRawInputDeviceInfoA(hdevice, uicommand.toInt(), pdata, pcbsize).toUInt()

public actual fun GetRawInputDeviceInfoW(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetRawInputDeviceInfoW(hdevice, uicommand.toInt(), pdata, pcbsize).toUInt()

public actual fun GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetRawInputDeviceList(prawinputdevicelist, puinumdevices, cbsize.toInt()).toUInt()

public actual fun GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_GetRegisteredRawInputDevices(prawinputdevices, puinumdevices, cbsize.toInt()).toUInt()

public actual fun RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: UInt, cbsize: UInt): BOOL =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_RegisterRawInputDevices(prawinputdevices, uinumdevices.toInt(), cbsize.toInt())
