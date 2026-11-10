package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias CompressorHandle = COpaquePointer?

public typealias CompressAlgorithm = UInt

public typealias CompressInformationClass = Int

public typealias DecompressorHandle = COpaquePointer?

public fun interface PfnCompressAllocateFn {
    public operator fun invoke(usercontext: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias PfnCompressAllocate = PfnCompressAllocateFn?

public fun interface PfnCompressFreeFn {
    public operator fun invoke(usercontext: COpaquePointer?, memory: COpaquePointer?)
}

public typealias PfnCompressFree = PfnCompressFreeFn?
