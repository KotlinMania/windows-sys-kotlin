@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

private object WindowsWin32UiInputJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_defRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getCIMSSM(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getCurrentInputMessageSource(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getRawInputData(hrawinput: Long, uicommand: Int, pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getRawInputDeviceInfoA(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getRawInputDeviceInfoW(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_getRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_registerRawInputDevices(prawinputdevices: Long, uinumdevices: Int, cbsize: Int): Int
}

public actual fun defRawInputProc(parawinput: COpaquePointer?, ninput: Int, cbsizeheader: UInt): Lresult =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_defRawInputProc((parawinput?.value ?: 0L), ninput, cbsizeheader.toInt())

public actual fun getCIMSSM(inputmessagesource: COpaquePointer?): Bool =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getCIMSSM((inputmessagesource?.value ?: 0L))

public actual fun getCurrentInputMessageSource(inputmessagesource: COpaquePointer?): Bool =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getCurrentInputMessageSource((inputmessagesource?.value ?: 0L))

public actual fun getRawInputBuffer(pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getRawInputBuffer((pdata?.value ?: 0L), (pcbsize?.value ?: 0L), cbsizeheader.toInt()).toUInt()

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getRawInputData((hrawinput?.value ?: 0L), uicommand.toInt(), (pdata?.value ?: 0L), (pcbsize?.value ?: 0L), cbsizeheader.toInt()).toUInt()

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getRawInputDeviceInfoA((hdevice?.value ?: 0L), uicommand.toInt(), (pdata?.value ?: 0L), (pcbsize?.value ?: 0L)).toUInt()

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getRawInputDeviceInfoW((hdevice?.value ?: 0L), uicommand.toInt(), (pdata?.value ?: 0L), (pcbsize?.value ?: 0L)).toUInt()

public actual fun getRawInputDeviceList(prawinputdevicelist: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getRawInputDeviceList((prawinputdevicelist?.value ?: 0L), (puinumdevices?.value ?: 0L), cbsize.toInt()).toUInt()

public actual fun getRegisteredRawInputDevices(prawinputdevices: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_getRegisteredRawInputDevices((prawinputdevices?.value ?: 0L), (puinumdevices?.value ?: 0L), cbsize.toInt()).toUInt()

public actual fun registerRawInputDevices(prawinputdevices: COpaquePointer?, uinumdevices: UInt, cbsize: UInt): Bool =
    WindowsWin32UiInputJniBridge.windowssys_windows_win32_ui_input_registerRawInputDevices((prawinputdevices?.value ?: 0L), uinumdevices.toInt(), cbsize.toInt())
