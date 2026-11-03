package io.github.kotlinmania.windowssys.windows.win32.system.kernel

public typealias COMPARTMENT_ID = Int

public typealias EVENT_TYPE = Int

public typealias EXCEPTION_DISPOSITION = Int

public fun interface EXCEPTION_ROUTINEFn {
    public operator fun invoke(exceptionrecord: Long, establisherframe: Long, contextrecord: Long, dispatchercontext: Long): EXCEPTION_DISPOSITION
}

public typealias EXCEPTION_ROUTINE = EXCEPTION_ROUTINEFn?

public typealias NT_PRODUCT_TYPE = Int

public typealias SUITE_TYPE = Int

public typealias TIMER_TYPE = Int

public typealias WAIT_TYPE = Int
