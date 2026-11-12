@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

private object WindowsWin32UiInputJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInputDefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputData(hrawinput: Long, uicommand: Int, pdata: Long, pcbsize: Long, cbsizeheader: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice: Long, uicommand: Int, pdata: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices: Long, uinumdevices: Int, cbsize: Int): Int
}

public actual fun defRawInputProc(parawinput: ConstPtr, ninput: Int, cbsizeheader: UInt): Lresult =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputDefRawInputProc(parawinput.rawAddress, ninput, cbsizeheader.toInt())

public actual fun getCIMSSM(inputmessagesource: MutPtr): Bool =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource.rawAddress)

public actual fun getCurrentInputMessageSource(inputmessagesource: MutPtr): Bool =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource.rawAddress)

public actual fun getRawInputBuffer(pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputBuffer(pdata.rawAddress, pcbsize.rawAddress, cbsizeheader.toInt()).toUInt()

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputData(hrawinput.rawAddress, uicommand.toInt(), pdata.rawAddress, pcbsize.rawAddress, cbsizeheader.toInt()).toUInt()

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice.rawAddress, uicommand.toInt(), pdata.rawAddress, pcbsize.rawAddress).toUInt()

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice.rawAddress, uicommand.toInt(), pdata.rawAddress, pcbsize.rawAddress).toUInt()

public actual fun getRawInputDeviceList(prawinputdevicelist: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist.rawAddress, puinumdevices.rawAddress, cbsize.toInt()).toUInt()

public actual fun getRegisteredRawInputDevices(prawinputdevices: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices.rawAddress, puinumdevices.rawAddress, cbsize.toInt()).toUInt()

public actual fun registerRawInputDevices(prawinputdevices: ConstPtr, uinumdevices: UInt, cbsize: UInt): Bool =
    WindowsWin32UiInputJniBridge.windowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices.rawAddress, uinumdevices.toInt(), cbsize.toInt())
