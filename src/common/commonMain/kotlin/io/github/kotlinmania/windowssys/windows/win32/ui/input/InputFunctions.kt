package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

public expect fun defRawInputProc(parawinput: COpaquePointer?, ninput: Int, cbsizeheader: UInt): Lresult

public expect fun getCIMSSM(inputmessagesource: COpaquePointer?): Bool

public expect fun getCurrentInputMessageSource(inputmessagesource: COpaquePointer?): Bool

public expect fun getRawInputBuffer(pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt

public expect fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt

public expect fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt

public expect fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt

public expect fun getRawInputDeviceList(prawinputdevicelist: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt

public expect fun getRegisteredRawInputDevices(prawinputdevices: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt

public expect fun registerRawInputDevices(prawinputdevices: COpaquePointer?, uinumdevices: UInt, cbsize: UInt): Bool
