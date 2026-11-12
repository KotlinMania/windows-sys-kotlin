package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Hcomdb = MutPtr

public fun interface PserenumReadportFn {
    public operator fun invoke(serportaddress: ConstPtr): UByte
}

public typealias PserenumReadport = PserenumReadportFn?

public fun interface PserenumWriteportFn {
    public operator fun invoke(serportaddress: ConstPtr, value: UByte)
}

public typealias PserenumWriteport = PserenumWriteportFn?

public typealias SerenumPortion = Int
