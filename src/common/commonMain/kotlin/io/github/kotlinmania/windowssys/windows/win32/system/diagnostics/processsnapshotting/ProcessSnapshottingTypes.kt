package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Hpss = MutPtr<CVoid>

public typealias Hpsswalk = MutPtr<CVoid>

public typealias PssCaptureFlags = UInt

public typealias PssDuplicateFlags = Int

public typealias PssHandleFlags = Int

public typealias PssObjectType = Int

public typealias PssProcessFlags = Int

public typealias PssQueryInformationClass = Int

public typealias PssThreadFlags = Int

public typealias PssWalkInformationClass = Int
