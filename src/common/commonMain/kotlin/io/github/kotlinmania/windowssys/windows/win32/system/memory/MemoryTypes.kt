package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public typealias AtlThunkDataT = Long

public typealias FileMap = UInt

public typealias GlobalAllocFlags = UInt

public typealias HeapFlags = UInt

public typealias HeapInformationClass = Int

public typealias LocalAllocFlags = UInt

public typealias MemoryResourceNotificationType = Int

public typealias MemDedicatedAttributeType = Int

public typealias MemExtendedParameterType = Int

public typealias MemSectionExtendedParameterType = Int

public typealias OfferPriority = Int

public typealias PageProtectionFlags = UInt

public typealias PageType = UInt

public fun interface PbadMemoryCallbackRoutineFn {
    public operator fun invoke()
}

public typealias PbadMemoryCallbackRoutine = PbadMemoryCallbackRoutineFn?

public fun interface PsecureMemoryCacheCallbackFn {
    public operator fun invoke(addr: ConstPtr<CVoid>, range: ULong): Boolean
}

public typealias PsecureMemoryCacheCallback = PsecureMemoryCacheCallbackFn?

public typealias SectionFlags = UInt

public typealias SetprocessworkingsetsizeexFlags = UInt

public typealias UnmapViewOfFileFlags = UInt

public typealias VirtualAllocationType = UInt

public typealias VirtualFreeType = UInt

public typealias Win32MemoryInformationClass = Int

public typealias Win32MemoryPartitionInformationClass = Int
