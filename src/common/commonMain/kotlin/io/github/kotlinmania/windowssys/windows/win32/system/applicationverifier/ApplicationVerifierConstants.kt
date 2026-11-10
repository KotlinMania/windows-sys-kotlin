package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

public val AVRF_ENUM_RESOURCES_FLAGS_DONT_RESOLVE_TRACES: VerifierEnumResourceFlags = 2u

public val AVRF_ENUM_RESOURCES_FLAGS_SUSPEND: VerifierEnumResourceFlags = 1u

public val AVRF_MAX_TRACES: UInt = 32u

public val ALLOCATION_STATE_BUSY: EUserAllocationState = 1

public val ALLOCATION_STATE_FREE: EUserAllocationState = 2

public val ALLOCATION_STATE_UNKNOWN: EUserAllocationState = 0

public val AVRF_RESOURCE_HANDLE_TRACE: EAvrfResourceTypes = 1

public val AVRF_RESOURCE_HEAP_ALLOCATION: EAvrfResourceTypes = 0

public val AVRF_RESOURCE_MAX: EAvrfResourceTypes = 2

public val HEAP_ENUMERATION_EVERYTHING: EHeapEnumerationLevel = 0

public val HEAP_ENUMERATION_STOP: EHeapEnumerationLevel = -1

public val HEAP_FULL_PAGE_HEAP: EHeapAllocationState = 1073741824

public val HEAP_METADATA: EHeapAllocationState = -2147483648.toInt()

public val HEAP_STATE_MASK: EHeapAllocationState = -65536

public val OPERATION_DB_BADREF: EHandleTraceOperations = 3

public val OPERATION_DB_CLOSE: EHandleTraceOperations = 2

public val OPERATION_DB_OPEN: EHandleTraceOperations = 1

public val OPERATION_DB_UNUSED: EHandleTraceOperations = 0
