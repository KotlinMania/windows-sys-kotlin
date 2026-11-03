package io.github.kotlinmania.windowssys.windows.win32.storage.compression

public typealias COMPRESSOR_HANDLE = Long

public typealias COMPRESS_ALGORITHM = UInt

public typealias COMPRESS_INFORMATION_CLASS = Int

public typealias DECOMPRESSOR_HANDLE = Long

public fun interface PFN_COMPRESS_ALLOCATEFn {
    public operator fun invoke(usercontext: Long, size: ULong): Long
}

public typealias PFN_COMPRESS_ALLOCATE = PFN_COMPRESS_ALLOCATEFn?

public fun interface PFN_COMPRESS_FREEFn {
    public operator fun invoke(usercontext: Long, memory: Long)
}

public typealias PFN_COMPRESS_FREE = PFN_COMPRESS_FREEFn?
