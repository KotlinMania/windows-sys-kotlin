package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class FileUnprotectOptions(
    public var audit: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileUnprotectOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileUnprotectOptions> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): FileUnprotectOptions =
                    FileUnprotectOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileUnprotectOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.audit)
                }
            }
    }
}

public class HthreadNetworkContext internal constructor(
    public var threadId: UInt,
    threadContextCtorArg: Handle,
) {
    public var threadContext: Handle = threadContextCtorArg
        internal set

    public constructor() : this(
        threadId = 0u,
        threadContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.threadId

    public operator fun component2(): Handle = this.threadContext

    public fun copy(threadId: UInt = this.threadId, threadContext: Handle = this.threadContext): HthreadNetworkContext = HthreadNetworkContext(threadId = threadId, threadContextCtorArg = threadContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HthreadNetworkContext) return false
        if (this.threadId != other.threadId) return false
        if (this.threadContext != other.threadContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadId.hashCode()
        result = 31 * result + this.threadContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            threadId: UInt = 0u,
            threadContext: Handle = MutPtr(0L),
        ): HthreadNetworkContext =
            HthreadNetworkContext(
                threadId = threadId,
                threadContextCtorArg = threadContext,
            )
    }
}
