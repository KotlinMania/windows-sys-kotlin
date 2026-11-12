package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias GestureconfigId = UInt

public typealias Hgestureinfo = MutPtr<CVoid>

public typealias Htouchinput = MutPtr<CVoid>

public typealias ManipulationProcessorManipulations = Int

public typealias RegisterTouchWindowFlags = UInt

public typealias ToucheventfFlags = UInt

public typealias TouchinputmaskfMask = UInt
