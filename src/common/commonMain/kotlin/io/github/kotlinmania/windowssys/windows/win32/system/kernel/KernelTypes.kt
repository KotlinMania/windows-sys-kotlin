package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias CompartmentId = Int

public typealias EventType = Int

public typealias ExceptionDisposition = Int

public fun interface ExceptionRoutineFn {
    public operator fun invoke(exceptionrecord: MutPtr, establisherframe: ConstPtr, contextrecord: MutPtr, dispatchercontext: ConstPtr): ExceptionDisposition
}

public typealias ExceptionRoutine = ExceptionRoutineFn?

public typealias NtProductType = Int

public typealias SuiteType = Int

public typealias TimerType = Int

public typealias WaitType = Int
