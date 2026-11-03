package io.github.kotlinmania.windowssys.windows.win32.system.memory

public typealias AtlThunkData_t = Long

public typealias FILE_MAP = UInt

public typealias GLOBAL_ALLOC_FLAGS = UInt

public typealias HEAP_FLAGS = UInt

public typealias HEAP_INFORMATION_CLASS = Int

public typealias LOCAL_ALLOC_FLAGS = UInt

public typealias MEMORY_RESOURCE_NOTIFICATION_TYPE = Int

public typealias MEM_DEDICATED_ATTRIBUTE_TYPE = Int

public typealias MEM_EXTENDED_PARAMETER_TYPE = Int

public typealias MEM_SECTION_EXTENDED_PARAMETER_TYPE = Int

public typealias OFFER_PRIORITY = Int

public typealias PAGE_PROTECTION_FLAGS = UInt

public typealias PAGE_TYPE = UInt

public fun interface PBAD_MEMORY_CALLBACK_ROUTINEFn {
    public operator fun invoke()
}

public typealias PBAD_MEMORY_CALLBACK_ROUTINE = PBAD_MEMORY_CALLBACK_ROUTINEFn?

public fun interface PSECURE_MEMORY_CACHE_CALLBACKFn {
    public operator fun invoke(addr: Long, range: ULong): Boolean
}

public typealias PSECURE_MEMORY_CACHE_CALLBACK = PSECURE_MEMORY_CACHE_CALLBACKFn?

public typealias SECTION_FLAGS = UInt

public typealias SETPROCESSWORKINGSETSIZEEX_FLAGS = UInt

public typealias UNMAP_VIEW_OF_FILE_FLAGS = UInt

public typealias VIRTUAL_ALLOCATION_TYPE = UInt

public typealias VIRTUAL_FREE_TYPE = UInt

public typealias WIN32_MEMORY_INFORMATION_CLASS = Int

public typealias WIN32_MEMORY_PARTITION_INFORMATION_CLASS = Int
