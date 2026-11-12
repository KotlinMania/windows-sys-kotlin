package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Hrawinput = MutPtr<CVoid>

public typealias InputMessageDeviceType = Int

public typealias InputMessageOriginId = Int

public typealias MouseState = UShort

public typealias RawinputdeviceFlags = UInt

public typealias RawInputDataCommandFlags = UInt

public typealias RawInputDeviceInfoCommand = UInt

public typealias RidDeviceInfoType = UInt
