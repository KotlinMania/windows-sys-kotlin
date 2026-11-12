package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias CompressorHandle = MutPtr<CVoid>

public typealias CompressAlgorithm = UInt

public typealias CompressInformationClass = Int

public typealias DecompressorHandle = MutPtr<CVoid>

public fun interface PfnCompressAllocateFn {
    public operator fun invoke(usercontext: ConstPtr<CVoid>, size: ULong): MutPtr<CVoid>
}

public typealias PfnCompressAllocate = PfnCompressAllocateFn?

public fun interface PfnCompressFreeFn {
    public operator fun invoke(usercontext: ConstPtr<CVoid>, memory: ConstPtr<CVoid>)
}

public typealias PfnCompressFree = PfnCompressFreeFn?
