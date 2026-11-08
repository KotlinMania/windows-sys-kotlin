package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public data class IO_STATUS_BLOCK(public var Anonymous: IO_STATUS_BLOCK_0 = IO_STATUS_BLOCK_0(), public var Information: ULong = 0uL)

public data class IO_STATUS_BLOCK_0(public var Status: NTSTATUS = 0, public var Pointer: Long = 0L)

public data class OVERLAPPED(
    public var Internal: ULong = 0uL,
    public var InternalHigh: ULong = 0uL,
    public var Anonymous: OVERLAPPED_0 = OVERLAPPED_0(),
    public var hEvent: HANDLE = 0L,
)

public data class OVERLAPPED_0(public var Anonymous: OVERLAPPED_0_0 = OVERLAPPED_0_0(), public var Pointer: Long = 0L)

public data class OVERLAPPED_0_0(public var Offset: UInt = 0u, public var OffsetHigh: UInt = 0u)

public data class OVERLAPPED_ENTRY(
    public var lpCompletionKey: ULong = 0uL,
    public var lpOverlapped: Long = 0L,
    public var Internal: ULong = 0uL,
    public var dwNumberOfBytesTransferred: UInt = 0u,
)
