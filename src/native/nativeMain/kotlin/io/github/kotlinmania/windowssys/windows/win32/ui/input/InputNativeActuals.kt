@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputDefRawInputProc
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetCIMSSM
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetCurrentInputMessageSource
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetRawInputBuffer
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetRawInputData
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetRawInputDeviceInfoA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetRawInputDeviceInfoW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetRawInputDeviceList
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputGetRegisteredRawInputDevices
import io.github.kotlinmania.windowssys.windows.win32.ui.input.cinterop.windowssysWindowsWin32UiInputRegisterRawInputDevices
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun defRawInputProc(parawinput: ConstPtr, ninput: Int, cbsizeheader: UInt): Lresult =
    windowssysWindowsWin32UiInputDefRawInputProc(parawinput.rawAddress.toCPointer<ByteVar>(), ninput, cbsizeheader)

public actual fun getCIMSSM(inputmessagesource: MutPtr): Bool =
    windowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentInputMessageSource(inputmessagesource: MutPtr): Bool =
    windowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource.rawAddress.toCPointer<ByteVar>())

public actual fun getRawInputBuffer(pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    windowssysWindowsWin32UiInputGetRawInputBuffer(pdata.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>(), cbsizeheader)

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    windowssysWindowsWin32UiInputGetRawInputData(hrawinput.rawAddress.toCPointer<ByteVar>(), uicommand, pdata.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>(), cbsizeheader)

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice.rawAddress.toCPointer<ByteVar>(), uicommand, pdata.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice.rawAddress.toCPointer<ByteVar>(), uicommand, pdata.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun getRawInputDeviceList(prawinputdevicelist: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    windowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist.rawAddress.toCPointer<ByteVar>(), puinumdevices.rawAddress.toCPointer<ByteVar>(), cbsize)

public actual fun getRegisteredRawInputDevices(prawinputdevices: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices.rawAddress.toCPointer<ByteVar>(), puinumdevices.rawAddress.toCPointer<ByteVar>(), cbsize)

public actual fun registerRawInputDevices(prawinputdevices: ConstPtr, uinumdevices: UInt, cbsize: UInt): Bool =
    windowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices.rawAddress.toCPointer<ByteVar>(), uinumdevices, cbsize)
