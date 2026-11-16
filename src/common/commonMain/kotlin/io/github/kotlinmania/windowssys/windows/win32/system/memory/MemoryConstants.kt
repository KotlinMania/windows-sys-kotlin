package io.github.kotlinmania.windowssys.windows.win32.system.memory

public val FILE_CACHE_MAX_HARD_DISABLE: UInt = 2u

public val FILE_CACHE_MAX_HARD_ENABLE: UInt = 1u

public val FILE_CACHE_MIN_HARD_DISABLE: UInt = 8u

public val FILE_CACHE_MIN_HARD_ENABLE: UInt = 4u

public val FILE_MAP_ALL_ACCESS: FileMap = 983071u

public val FILE_MAP_COPY: FileMap = 1u

public val FILE_MAP_EXECUTE: FileMap = 32u

public val FILE_MAP_LARGE_PAGES: FileMap = 536870912u

public val FILE_MAP_READ: FileMap = 4u

public val FILE_MAP_RESERVE: FileMap = 2147483648u

public val FILE_MAP_TARGETS_INVALID: FileMap = 1073741824u

public val FILE_MAP_WRITE: FileMap = 2u

public val GHND: GlobalAllocFlags = 66u

public val GMEM_FIXED: GlobalAllocFlags = 0u

public val GMEM_MOVEABLE: GlobalAllocFlags = 2u

public val GMEM_ZEROINIT: GlobalAllocFlags = 64u

public val GPTR: GlobalAllocFlags = 64u

public val HEAP_CREATE_ALIGN_16: HeapFlags = 65536u

public val HEAP_CREATE_ENABLE_EXECUTE: HeapFlags = 262144u

public val HEAP_CREATE_ENABLE_TRACING: HeapFlags = 131072u

public val HEAP_CREATE_HARDENED: HeapFlags = 512u

public val HEAP_CREATE_SEGMENT_HEAP: HeapFlags = 256u

public val HEAP_DISABLE_COALESCE_ON_FREE: HeapFlags = 128u

public val HEAP_FREE_CHECKING_ENABLED: HeapFlags = 64u

public val HEAP_GENERATE_EXCEPTIONS: HeapFlags = 4u

public val HEAP_GROWABLE: HeapFlags = 2u

public val HEAP_MAXIMUM_TAG: HeapFlags = 4095u

public val HEAP_NONE: HeapFlags = 0u

public val HEAP_NO_SERIALIZE: HeapFlags = 1u

public val HEAP_PSEUDO_TAG_FLAG: HeapFlags = 32768u

public val HEAP_REALLOC_IN_PLACE_ONLY: HeapFlags = 16u

public val HEAP_TAG_SHIFT: HeapFlags = 18u

public val HEAP_TAIL_CHECKING_ENABLED: HeapFlags = 32u

public val HEAP_ZERO_MEMORY: HeapFlags = 8u

public val HEAP_COMPATIBILITY_INFORMATION: HeapInformationClass = 0

public val HEAP_ENABLE_TERMINATION_ON_CORRUPTION: HeapInformationClass = 1

public val HEAP_OPTIMIZE_RESOURCES: HeapInformationClass = 3

public val HEAP_TAG: HeapInformationClass = 7

public val HIGH_MEMORY_RESOURCE_NOTIFICATION: MemoryResourceNotificationType = 1

public val LHND: LocalAllocFlags = 66u

public val LMEM_FIXED: LocalAllocFlags = 0u

public val LMEM_MOVEABLE: LocalAllocFlags = 2u

public val LMEM_ZEROINIT: LocalAllocFlags = 64u

public val LPTR: LocalAllocFlags = 64u

public val LOW_MEMORY_RESOURCE_NOTIFICATION: MemoryResourceNotificationType = 0

public val MEHC_PATROL_SCRUBBER_PRESENT: UInt = 1u

public val MEM_COMMIT: VirtualAllocationType = 4096u

public val MEM_DECOMMIT: VirtualFreeType = 16384u

public val MEM_FREE: VirtualAllocationType = 65536u

public val MEM_IMAGE: PageType = 16777216u

public val MEM_LARGE_PAGES: VirtualAllocationType = 536870912u

public val MEM_MAPPED: PageType = 262144u

public val MEM_PRESERVE_PLACEHOLDER: UnmapViewOfFileFlags = 2u

public val MEM_PRIVATE: PageType = 131072u

public val MEM_RELEASE: VirtualFreeType = 32768u

public val MEM_REPLACE_PLACEHOLDER: VirtualAllocationType = 16384u

public val MEM_RESERVE: VirtualAllocationType = 8192u

public val MEM_RESERVE_PLACEHOLDER: VirtualAllocationType = 262144u

public val MEM_RESET: VirtualAllocationType = 524288u

public val MEM_RESET_UNDO: VirtualAllocationType = 16777216u

public val MEM_UNMAP_NONE: UnmapViewOfFileFlags = 0u

public val MEM_UNMAP_WITH_TRANSIENT_BOOST: UnmapViewOfFileFlags = 1u

public val MEM_DEDICATED_ATTRIBUTE_MAX: MemDedicatedAttributeType = 4

public val MEM_DEDICATED_ATTRIBUTE_READ_BANDWIDTH: MemDedicatedAttributeType = 0

public val MEM_DEDICATED_ATTRIBUTE_READ_LATENCY: MemDedicatedAttributeType = 1

public val MEM_DEDICATED_ATTRIBUTE_WRITE_BANDWIDTH: MemDedicatedAttributeType = 2

public val MEM_DEDICATED_ATTRIBUTE_WRITE_LATENCY: MemDedicatedAttributeType = 3

public val MEM_EXTENDED_PARAMETER_ADDRESS_REQUIREMENTS: MemExtendedParameterType = 1

public val MEM_EXTENDED_PARAMETER_ATTRIBUTE_FLAGS: MemExtendedParameterType = 5

public val MEM_EXTENDED_PARAMETER_IMAGE_MACHINE: MemExtendedParameterType = 6

public val MEM_EXTENDED_PARAMETER_INVALID_TYPE: MemExtendedParameterType = 0

public val MEM_EXTENDED_PARAMETER_MAX: MemExtendedParameterType = 7

public val MEM_EXTENDED_PARAMETER_NUMA_NODE: MemExtendedParameterType = 2

public val MEM_EXTENDED_PARAMETER_PARTITION_HANDLE: MemExtendedParameterType = 3

public val MEM_EXTENDED_PARAMETER_USER_PHYSICAL_HANDLE: MemExtendedParameterType = 4

public val MEM_SECTION_EXTENDED_PARAMETER_INVALID_TYPE: MemSectionExtendedParameterType = 0

public val MEM_SECTION_EXTENDED_PARAMETER_MAX: MemSectionExtendedParameterType = 4

public val MEM_SECTION_EXTENDED_PARAMETER_NUMA_NODE: MemSectionExtendedParameterType = 2

public val MEM_SECTION_EXTENDED_PARAMETER_SIGNING_LEVEL: MemSectionExtendedParameterType = 3

public val MEM_SECTION_EXTENDED_PARAMETER_USER_PHYSICAL_FLAGS: MemSectionExtendedParameterType = 1

public val MEMORY_PARTITION_DEDICATED_MEMORY_INFO: Win32MemoryPartitionInformationClass = 1

public val MEMORY_PARTITION_INFO: Win32MemoryPartitionInformationClass = 0

public val MEMORY_REGION_INFO: Win32MemoryInformationClass = 0

public val NONZEROLHND: LocalAllocFlags = 2u

public val NONZEROLPTR: LocalAllocFlags = 0u

public val PAGE_ENCLAVE_DECOMMIT: PageProtectionFlags = 268435456u

public val PAGE_ENCLAVE_MASK: PageProtectionFlags = 268435456u

public val PAGE_ENCLAVE_SS_FIRST: PageProtectionFlags = 268435457u

public val PAGE_ENCLAVE_SS_REST: PageProtectionFlags = 268435458u

public val PAGE_ENCLAVE_THREAD_CONTROL: PageProtectionFlags = 2147483648u

public val PAGE_ENCLAVE_UNVALIDATED: PageProtectionFlags = 536870912u

public val PAGE_EXECUTE: PageProtectionFlags = 16u

public val PAGE_EXECUTE_READ: PageProtectionFlags = 32u

public val PAGE_EXECUTE_READWRITE: PageProtectionFlags = 64u

public val PAGE_EXECUTE_WRITECOPY: PageProtectionFlags = 128u

public val PAGE_GRAPHICS_COHERENT: PageProtectionFlags = 131072u

public val PAGE_GRAPHICS_EXECUTE: PageProtectionFlags = 16384u

public val PAGE_GRAPHICS_EXECUTE_READ: PageProtectionFlags = 32768u

public val PAGE_GRAPHICS_EXECUTE_READWRITE: PageProtectionFlags = 65536u

public val PAGE_GRAPHICS_NOACCESS: PageProtectionFlags = 2048u

public val PAGE_GRAPHICS_NOCACHE: PageProtectionFlags = 262144u

public val PAGE_GRAPHICS_READONLY: PageProtectionFlags = 4096u

public val PAGE_GRAPHICS_READWRITE: PageProtectionFlags = 8192u

public val PAGE_GUARD: PageProtectionFlags = 256u

public val PAGE_NOACCESS: PageProtectionFlags = 1u

public val PAGE_NOCACHE: PageProtectionFlags = 512u

public val PAGE_READONLY: PageProtectionFlags = 2u

public val PAGE_READWRITE: PageProtectionFlags = 4u

public val PAGE_REVERT_TO_FILE_MAP: PageProtectionFlags = 2147483648u

public val PAGE_TARGETS_INVALID: PageProtectionFlags = 1073741824u

public val PAGE_TARGETS_NO_UPDATE: PageProtectionFlags = 1073741824u

public val PAGE_WRITECOMBINE: PageProtectionFlags = 1024u

public val PAGE_WRITECOPY: PageProtectionFlags = 8u

public val QUOTA_LIMITS_HARDWS_MAX_DISABLE: SetprocessworkingsetsizeexFlags = 8u

public val QUOTA_LIMITS_HARDWS_MAX_ENABLE: SetprocessworkingsetsizeexFlags = 4u

public val QUOTA_LIMITS_HARDWS_MIN_DISABLE: SetprocessworkingsetsizeexFlags = 2u

public val QUOTA_LIMITS_HARDWS_MIN_ENABLE: SetprocessworkingsetsizeexFlags = 1u

public val SECTION_ALL_ACCESS: SectionFlags = 983071u

public val SECTION_EXTEND_SIZE: SectionFlags = 16u

public val SECTION_MAP_EXECUTE: SectionFlags = 8u

public val SECTION_MAP_EXECUTE_EXPLICIT: SectionFlags = 32u

public val SECTION_MAP_READ: SectionFlags = 4u

public val SECTION_MAP_WRITE: SectionFlags = 2u

public val SECTION_QUERY: SectionFlags = 1u

public val SEC_64K_PAGES: PageProtectionFlags = 524288u

public val SEC_COMMIT: PageProtectionFlags = 134217728u

public val SEC_FILE: PageProtectionFlags = 8388608u

public val SEC_IMAGE: PageProtectionFlags = 16777216u

public val SEC_IMAGE_NO_EXECUTE: PageProtectionFlags = 285212672u

public val SEC_LARGE_PAGES: PageProtectionFlags = 2147483648u

public val SEC_NOCACHE: PageProtectionFlags = 268435456u

public val SEC_PARTITION_OWNER_HANDLE: PageProtectionFlags = 262144u

public val SEC_PROTECTED_IMAGE: PageProtectionFlags = 33554432u

public val SEC_RESERVE: PageProtectionFlags = 67108864u

public val SEC_WRITECOMBINE: PageProtectionFlags = 1073741824u

public val VM_OFFER_PRIORITY_BELOW_NORMAL: OfferPriority = 3

public val VM_OFFER_PRIORITY_LOW: OfferPriority = 2

public val VM_OFFER_PRIORITY_NORMAL: OfferPriority = 4

public val VM_OFFER_PRIORITY_VERY_LOW: OfferPriority = 1
