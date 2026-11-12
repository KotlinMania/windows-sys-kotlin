package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun mAPIFreeBuffer(pv: MutPtr<CVoid>): UInt
