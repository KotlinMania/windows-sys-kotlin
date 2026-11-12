package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias CompressorHandle = MutPtr

public typealias CompressAlgorithm = UInt

public typealias CompressInformationClass = Int

public typealias DecompressorHandle = MutPtr

public fun interface PfnCompressAllocateFn {
    public operator fun invoke(usercontext: ConstPtr, size: ULong): MutPtr
}

public typealias PfnCompressAllocate = PfnCompressAllocateFn?

public fun interface PfnCompressFreeFn {
    public operator fun invoke(usercontext: ConstPtr, memory: ConstPtr)
}

public typealias PfnCompressFree = PfnCompressFreeFn?
