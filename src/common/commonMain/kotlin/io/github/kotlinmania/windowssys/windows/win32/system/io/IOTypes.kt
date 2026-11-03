package io.github.kotlinmania.windowssys.windows.win32.system.io

public fun interface LPOVERLAPPED_COMPLETION_ROUTINEFn {
    public operator fun invoke(dwerrorcode: UInt, dwnumberofbytestransfered: UInt, lpoverlapped: Long)
}

public typealias LPOVERLAPPED_COMPLETION_ROUTINE = LPOVERLAPPED_COMPLETION_ROUTINEFn?

public fun interface PIO_APC_ROUTINEFn {
    public operator fun invoke(apccontext: Long, iostatusblock: Long, reserved: UInt)
}

public typealias PIO_APC_ROUTINE = PIO_APC_ROUTINEFn?
