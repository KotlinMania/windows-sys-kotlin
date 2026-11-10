package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public data class IoStatusBlock(public var anonymous: IoStatusBlock0 = IoStatusBlock0(), public var information: Int = 0)

public data class IoStatusBlock0(public var status: Ntstatus = 0, public var pointer: COpaquePointer? = null)

public data class Overlapped(
    public var internal: Int = 0,
    public var internalHigh: Int = 0,
    public var anonymous: Overlapped0 = Overlapped0(),
    public var hEvent: Handle = null,
)

public data class Overlapped0(public var anonymous: Overlapped00 = Overlapped00(), public var pointer: COpaquePointer? = null)

public data class Overlapped00(public var offset: UInt = 0u, public var offsetHigh: UInt = 0u)

public data class OverlappedEntry(
    public var lpCompletionKey: Int = 0,
    public var lpOverlapped: Overlapped? = null,
    public var internal: Int = 0,
    public var dwNumberOfBytesTransferred: UInt = 0u,
)
