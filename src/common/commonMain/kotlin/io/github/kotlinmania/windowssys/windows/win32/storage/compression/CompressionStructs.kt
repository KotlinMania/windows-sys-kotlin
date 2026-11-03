package io.github.kotlinmania.windowssys.windows.win32.storage.compression

public data class COMPRESS_ALLOCATION_ROUTINES(
    public var Allocate: PFN_COMPRESS_ALLOCATE = null,
    public var Free: PFN_COMPRESS_FREE = null,
    public var UserContext: Long = 0L,
)
