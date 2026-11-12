package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias Hkey = MutPtr<CVoid>

public fun interface PqueryhandlerFn {
    public operator fun invoke(keycontext: MutPtr<CVoid>, valList: MutPtr<ValContext>, numVals: UInt, outputbuffer: MutPtr<CVoid>, totalOutlen: MutPtr<UInt>, inputBlen: UInt): UInt
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
