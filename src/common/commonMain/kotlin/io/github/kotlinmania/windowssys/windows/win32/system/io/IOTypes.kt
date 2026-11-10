package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer

public fun interface LpoverlappedCompletionRoutineFn {
    public operator fun invoke(dwerrorcode: UInt, dwnumberofbytestransfered: UInt, lpoverlapped: COpaquePointer?)
}

public typealias LpoverlappedCompletionRoutine = LpoverlappedCompletionRoutineFn?

public fun interface PioApcRoutineFn {
    public operator fun invoke(apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, reserved: UInt)
}

public typealias PioApcRoutine = PioApcRoutineFn?
