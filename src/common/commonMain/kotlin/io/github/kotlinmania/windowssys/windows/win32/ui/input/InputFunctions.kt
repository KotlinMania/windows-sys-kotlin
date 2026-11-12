package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

public expect fun defRawInputProc(parawinput: ConstPtr, ninput: Int, cbsizeheader: UInt): Lresult

public expect fun getCIMSSM(inputmessagesource: MutPtr): Bool

public expect fun getCurrentInputMessageSource(inputmessagesource: MutPtr): Bool

public expect fun getRawInputBuffer(pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt

public expect fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt

public expect fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt

public expect fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt

public expect fun getRawInputDeviceList(prawinputdevicelist: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt

public expect fun getRegisteredRawInputDevices(prawinputdevices: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt

public expect fun registerRawInputDevices(prawinputdevices: ConstPtr, uinumdevices: UInt, cbsize: UInt): Bool
