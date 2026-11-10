package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias Hcomdb = COpaquePointer?

public fun interface PserenumReadportFn {
    public operator fun invoke(serportaddress: COpaquePointer?): UByte
}

public typealias PserenumReadport = PserenumReadportFn?

public fun interface PserenumWriteportFn {
    public operator fun invoke(serportaddress: COpaquePointer?, value: UByte)
}

public typealias PserenumWriteport = PserenumWriteportFn?

public typealias SerenumPortion = Int
