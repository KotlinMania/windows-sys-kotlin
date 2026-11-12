package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ActivateKeyboardLayoutFlags = UInt

public typealias GetMouseMovePointsExResolution = UInt

public typealias Hkl = MutPtr<CVoid>

public typealias HotKeyModifiers = UInt

public typealias InputType = UInt

public typealias KeybdEventFlags = UInt

public typealias MapVirtualKeyType = UInt

public typealias MouseEventFlags = UInt

public typealias TrackmouseeventFlags = UInt

public typealias VirtualKey = UShort
