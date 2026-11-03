package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

public val AVRF_ENUM_RESOURCES_FLAGS_DONT_RESOLVE_TRACES: VERIFIER_ENUM_RESOURCE_FLAGS = 2u

public val AVRF_ENUM_RESOURCES_FLAGS_SUSPEND: VERIFIER_ENUM_RESOURCE_FLAGS = 1u

public val AVRF_MAX_TRACES: UInt = 32u

public val AllocationStateBusy: eUserAllocationState = 1

public val AllocationStateFree: eUserAllocationState = 2

public val AllocationStateUnknown: eUserAllocationState = 0

public val AvrfResourceHandleTrace: eAvrfResourceTypes = 1

public val AvrfResourceHeapAllocation: eAvrfResourceTypes = 0

public val AvrfResourceMax: eAvrfResourceTypes = 2

public val HeapEnumerationEverything: eHeapEnumerationLevel = 0

public val HeapEnumerationStop: eHeapEnumerationLevel = -1

public val HeapFullPageHeap: eHeapAllocationState = 1073741824

public val HeapMetadata: eHeapAllocationState = -2147483648

public val HeapStateMask: eHeapAllocationState = -65536

public val OperationDbBADREF: eHANDLE_TRACE_OPERATIONS = 3

public val OperationDbCLOSE: eHANDLE_TRACE_OPERATIONS = 2

public val OperationDbOPEN: eHANDLE_TRACE_OPERATIONS = 1

public val OperationDbUnused: eHANDLE_TRACE_OPERATIONS = 0
