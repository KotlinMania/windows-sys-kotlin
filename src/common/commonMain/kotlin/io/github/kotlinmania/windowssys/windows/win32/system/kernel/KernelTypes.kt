package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Context
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionRecord

public typealias CompartmentId = Int

public typealias EventType = Int

public typealias ExceptionDisposition = Int

public fun interface ExceptionRoutineFn {
    public operator fun invoke(exceptionrecord: MutPtr<ExceptionRecord>, establisherframe: ConstPtr<CVoid>, contextrecord: MutPtr<Context>, dispatchercontext: ConstPtr<CVoid>): ExceptionDisposition
}

public typealias ExceptionRoutine = ExceptionRoutineFn?

public typealias NtProductType = Int

public typealias SuiteType = Int

public typealias TimerType = Int

public typealias WaitType = Int
