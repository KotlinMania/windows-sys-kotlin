package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.COpaquePointer

public data class NvMemoryRange(public var baseAddress: COpaquePointer? = null, public var length: Int = 0)
