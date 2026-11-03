package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

public fun interface AVRF_HANDLEOPERATION_ENUMERATE_CALLBACKFn {
    public operator fun invoke(handleoperation: Long, enumerationcontext: Long, enumerationlevel: Long): UInt
}

public typealias AVRF_HANDLEOPERATION_ENUMERATE_CALLBACK = AVRF_HANDLEOPERATION_ENUMERATE_CALLBACKFn?

public fun interface AVRF_HEAPALLOCATION_ENUMERATE_CALLBACKFn {
    public operator fun invoke(heapallocation: Long, enumerationcontext: Long, enumerationlevel: Long): UInt
}

public typealias AVRF_HEAPALLOCATION_ENUMERATE_CALLBACK = AVRF_HEAPALLOCATION_ENUMERATE_CALLBACKFn?

public fun interface AVRF_RESOURCE_ENUMERATE_CALLBACKFn {
    public operator fun invoke(resourcedescription: Long, enumerationcontext: Long, enumerationlevel: Long): UInt
}

public typealias AVRF_RESOURCE_ENUMERATE_CALLBACK = AVRF_RESOURCE_ENUMERATE_CALLBACKFn?

public typealias VERIFIER_ENUM_RESOURCE_FLAGS = UInt

public typealias eAvrfResourceTypes = Int

public typealias eHANDLE_TRACE_OPERATIONS = Int

public typealias eHeapAllocationState = Int

public typealias eHeapEnumerationLevel = Int

public typealias eUserAllocationState = Int
