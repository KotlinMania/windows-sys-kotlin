package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

public expect fun defRawInputProc(parawinput: ConstPtr<ConstPtr<Rawinput>>, ninput: Int, cbsizeheader: UInt): Lresult

public expect fun getCIMSSM(inputmessagesource: MutPtr<InputMessageSource>): Bool

public expect fun getCurrentInputMessageSource(inputmessagesource: MutPtr<InputMessageSource>): Bool

public expect fun getRawInputBuffer(pdata: MutPtr<Rawinput>, pcbsize: MutPtr<UInt>, cbsizeheader: UInt): UInt

public expect fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>, cbsizeheader: UInt): UInt

public expect fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>): UInt

public expect fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>): UInt

public expect fun getRawInputDeviceList(prawinputdevicelist: MutPtr<Rawinputdevicelist>, puinumdevices: MutPtr<UInt>, cbsize: UInt): UInt

public expect fun getRegisteredRawInputDevices(prawinputdevices: MutPtr<Rawinputdevice>, puinumdevices: MutPtr<UInt>, cbsize: UInt): UInt

public expect fun registerRawInputDevices(prawinputdevices: ConstPtr<Rawinputdevice>, uinumdevices: UInt, cbsize: UInt): Bool
