package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface LpoverlappedCompletionRoutineFn {
    public operator fun invoke(dwerrorcode: UInt, dwnumberofbytestransfered: UInt, lpoverlapped: MutPtr<Overlapped>)
}

public typealias LpoverlappedCompletionRoutine = LpoverlappedCompletionRoutineFn?

public fun interface PioApcRoutineFn {
    public operator fun invoke(apccontext: MutPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, reserved: UInt)
}

public typealias PioApcRoutine = PioApcRoutineFn?
