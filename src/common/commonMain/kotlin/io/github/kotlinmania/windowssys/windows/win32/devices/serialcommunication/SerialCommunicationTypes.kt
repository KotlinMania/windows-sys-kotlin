package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Hcomdb = MutPtr<CVoid>

public fun interface PserenumReadportFn {
    public operator fun invoke(serportaddress: ConstPtr<CVoid>): UByte
}

public typealias PserenumReadport = PserenumReadportFn?

public fun interface PserenumWriteportFn {
    public operator fun invoke(serportaddress: ConstPtr<CVoid>, value: UByte)
}

public typealias PserenumWriteport = PserenumWriteportFn?

public typealias SerenumPortion = Int
