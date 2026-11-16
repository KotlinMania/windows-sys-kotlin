package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface LpoverlappedCompletionRoutineFn {
    public operator fun invoke(dwerrorcode: UInt, dwnumberofbytestransfered: UInt, lpoverlapped: MutPtr)
}

public typealias LpoverlappedCompletionRoutine = LpoverlappedCompletionRoutineFn?

public fun interface PioApcRoutineFn {
    public operator fun invoke(apccontext: MutPtr, iostatusblock: MutPtr, reserved: UInt)
}

public typealias PioApcRoutine = PioApcRoutineFn?
