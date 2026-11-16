package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class CompressAllocationRoutines internal constructor(
    public var allocate: PfnCompressAllocate,
    public var free: PfnCompressFree,
    userContextCtorArg: MutPtr,
) {
    public var userContext: MutPtr = userContextCtorArg
        internal set

    public constructor() : this(
        allocate = null,
        free = null,
        userContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PfnCompressAllocate = this.allocate

    public operator fun component2(): PfnCompressFree = this.free

    public operator fun component3(): MutPtr = this.userContext

    public fun copy(allocate: PfnCompressAllocate = this.allocate, free: PfnCompressFree = this.free, userContext: MutPtr = this.userContext): CompressAllocationRoutines = CompressAllocationRoutines(allocate = allocate, free = free, userContextCtorArg = userContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CompressAllocationRoutines) return false
        if (this.allocate != other.allocate) return false
        if (this.free != other.free) return false
        if (this.userContext != other.userContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.allocate.hashCode()
        result = 31 * result + this.free.hashCode()
        result = 31 * result + this.userContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            allocate: PfnCompressAllocate = null,
            free: PfnCompressFree = null,
            userContext: MutPtr = MutPtr(0L),
        ): CompressAllocationRoutines =
            CompressAllocationRoutines(
                allocate = allocate,
                free = free,
                userContextCtorArg = userContext,
            )
    }
}
