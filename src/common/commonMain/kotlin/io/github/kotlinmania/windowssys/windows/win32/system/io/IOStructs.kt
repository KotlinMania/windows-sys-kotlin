package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public data class IoStatusBlock(
    public var anonymous: IoStatusBlock0 = IoStatusBlock0(),
    public var information: Int = 0,
)

public class IoStatusBlock0 internal constructor(
    public var status: Ntstatus,
    pointerCtorArg: MutPtr<CVoid>,
) {
    public var pointer: MutPtr<CVoid> = pointerCtorArg
        internal set

    public constructor() : this(
        status = 0,
        pointerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ntstatus = this.status

    public operator fun component2(): MutPtr<CVoid> = this.pointer

    public fun copy(status: Ntstatus = this.status, pointer: MutPtr<CVoid> = this.pointer): IoStatusBlock0 = IoStatusBlock0(status = status, pointerCtorArg = pointer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStatusBlock0) return false
        if (this.status != other.status) return false
        if (this.pointer != other.pointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.pointer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            status: Ntstatus = 0,
            pointer: MutPtr<CVoid> = MutPtr(0L),
        ): IoStatusBlock0 =
            IoStatusBlock0(
                status = status,
                pointerCtorArg = pointer,
            )
    }
}

public class Overlapped internal constructor(
    public var internal: Int,
    public var internalHigh: Int,
    public var anonymous: Overlapped0,
    hEventCtorArg: Handle,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public constructor() : this(
        internal = 0,
        internalHigh = 0,
        anonymous = Overlapped0(),
        hEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.internal

    public operator fun component2(): Int = this.internalHigh

    public operator fun component3(): Overlapped0 = this.anonymous

    public operator fun component4(): Handle = this.hEvent

    public fun copy(internal: Int = this.internal, internalHigh: Int = this.internalHigh, anonymous: Overlapped0 = this.anonymous, hEvent: Handle = this.hEvent): Overlapped = Overlapped(internal = internal, internalHigh = internalHigh, anonymous = anonymous, hEventCtorArg = hEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Overlapped) return false
        if (this.internal != other.internal) return false
        if (this.internalHigh != other.internalHigh) return false
        if (this.anonymous != other.anonymous) return false
        if (this.hEvent != other.hEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.internal.hashCode()
        result = 31 * result + this.internalHigh.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.hEvent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            internal: Int = 0,
            internalHigh: Int = 0,
            anonymous: Overlapped0 = Overlapped0(),
            hEvent: Handle = MutPtr(0L),
        ): Overlapped =
            Overlapped(
                internal = internal,
                internalHigh = internalHigh,
                anonymous = anonymous,
                hEventCtorArg = hEvent,
            )
    }
}

public class Overlapped0 internal constructor(
    public var anonymous: Overlapped00,
    pointerCtorArg: MutPtr<CVoid>,
) {
    public var pointer: MutPtr<CVoid> = pointerCtorArg
        internal set

    public constructor() : this(
        anonymous = Overlapped00(),
        pointerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Overlapped00 = this.anonymous

    public operator fun component2(): MutPtr<CVoid> = this.pointer

    public fun copy(anonymous: Overlapped00 = this.anonymous, pointer: MutPtr<CVoid> = this.pointer): Overlapped0 = Overlapped0(anonymous = anonymous, pointerCtorArg = pointer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Overlapped0) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pointer != other.pointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.pointer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: Overlapped00 = Overlapped00(),
            pointer: MutPtr<CVoid> = MutPtr(0L),
        ): Overlapped0 =
            Overlapped0(
                anonymous = anonymous,
                pointerCtorArg = pointer,
            )
    }
}

public data class Overlapped00(
    public var offset: UInt = 0u,
    public var offsetHigh: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Overlapped00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Overlapped00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Overlapped00 =
                    Overlapped00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Overlapped00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offsetHigh)
                }
            }
    }
}

public class OverlappedEntry internal constructor(
    public var lpCompletionKey: Int,
    lpOverlappedCtorArg: MutPtr<Overlapped>,
    public var internal: Int,
    public var dwNumberOfBytesTransferred: UInt,
) {
    public var lpOverlapped: MutPtr<Overlapped> = lpOverlappedCtorArg
        internal set

    public constructor() : this(
        lpCompletionKey = 0,
        lpOverlappedCtorArg = MutPtr(0L),
        internal = 0,
        dwNumberOfBytesTransferred = 0u,
    )

    public operator fun component1(): Int = this.lpCompletionKey

    public operator fun component2(): MutPtr<Overlapped> = this.lpOverlapped

    public operator fun component3(): Int = this.internal

    public operator fun component4(): UInt = this.dwNumberOfBytesTransferred

    public fun copy(lpCompletionKey: Int = this.lpCompletionKey, lpOverlapped: MutPtr<Overlapped> = this.lpOverlapped, internal: Int = this.internal, dwNumberOfBytesTransferred: UInt = this.dwNumberOfBytesTransferred): OverlappedEntry = OverlappedEntry(lpCompletionKey = lpCompletionKey, lpOverlappedCtorArg = lpOverlapped, internal = internal, dwNumberOfBytesTransferred = dwNumberOfBytesTransferred)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OverlappedEntry) return false
        if (this.lpCompletionKey != other.lpCompletionKey) return false
        if (this.lpOverlapped != other.lpOverlapped) return false
        if (this.internal != other.internal) return false
        if (this.dwNumberOfBytesTransferred != other.dwNumberOfBytesTransferred) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpCompletionKey.hashCode()
        result = 31 * result + this.lpOverlapped.hashCode()
        result = 31 * result + this.internal.hashCode()
        result = 31 * result + this.dwNumberOfBytesTransferred.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OverlappedEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OverlappedEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): OverlappedEntry =
                    OverlappedEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Overlapped>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: OverlappedEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.lpCompletionKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Overlapped>(64)
                    ).writeNative(addr + 8L, value.lpOverlapped)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.internal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumberOfBytesTransferred)
                }
            }

        public operator fun invoke(
            lpCompletionKey: Int = 0,
            lpOverlapped: MutPtr<Overlapped> = MutPtr(0L),
            internal: Int = 0,
            dwNumberOfBytesTransferred: UInt = 0u,
        ): OverlappedEntry =
            OverlappedEntry(
                lpCompletionKey = lpCompletionKey,
                lpOverlappedCtorArg = lpOverlapped,
                internal = internal,
                dwNumberOfBytesTransferred = dwNumberOfBytesTransferred,
            )
    }
}
