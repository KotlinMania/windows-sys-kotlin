package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias CompartmentId = Int

public typealias EventType = Int

public typealias ExceptionDisposition = Int

public fun interface ExceptionRoutineFn {
    public operator fun invoke(exceptionrecord: COpaquePointer?, establisherframe: COpaquePointer?, contextrecord: COpaquePointer?, dispatchercontext: COpaquePointer?): ExceptionDisposition
}

public typealias ExceptionRoutine = ExceptionRoutineFn?

public typealias NtProductType = Int

public typealias SuiteType = Int

public typealias TimerType = Int

public typealias WaitType = Int
