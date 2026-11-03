package io.github.kotlinmania.windowssys.windows.win32.foundation

public var FLOAT128.lowPart: Long
    get() = LowPart
    set(value) {
        LowPart = value
    }

public var FLOAT128.highPart: Long
    get() = HighPart
    set(value) {
        HighPart = value
    }
