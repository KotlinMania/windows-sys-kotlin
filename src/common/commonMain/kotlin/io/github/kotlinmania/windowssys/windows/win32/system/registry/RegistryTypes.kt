package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Hkey = MutPtr

public fun interface PqueryhandlerFn {
    public operator fun invoke(keycontext: MutPtr, valList: MutPtr, numVals: UInt, outputbuffer: MutPtr, totalOutlen: MutPtr, inputBlen: UInt): UInt
}

public typealias Pqueryhandler = PqueryhandlerFn?

public typealias RegCreateKeyDisposition = UInt

public typealias RegNotifyFilter = UInt

public typealias RegOpenCreateOptions = UInt

public typealias RegRestoreKeyFlags = Int

public typealias RegRoutineFlags = UInt

public typealias RegSamFlags = UInt

public typealias RegSaveFormat = UInt

public typealias RegValueType = UInt
