package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer

public data class CompressAllocationRoutines(
    public var allocate: PfnCompressAllocate = null,
    public var free: PfnCompressFree = null,
    public var userContext: COpaquePointer? = null,
)
