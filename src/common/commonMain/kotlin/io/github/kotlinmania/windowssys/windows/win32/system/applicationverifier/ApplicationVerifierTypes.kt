package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.COpaquePointer

public fun interface AvrfHandleoperationEnumerateCallbackFn {
    public operator fun invoke(handleoperation: COpaquePointer?, enumerationcontext: COpaquePointer?, enumerationlevel: COpaquePointer?): UInt
}

public typealias AvrfHandleoperationEnumerateCallback = AvrfHandleoperationEnumerateCallbackFn?

public fun interface AvrfHeapallocationEnumerateCallbackFn {
    public operator fun invoke(heapallocation: COpaquePointer?, enumerationcontext: COpaquePointer?, enumerationlevel: COpaquePointer?): UInt
}

public typealias AvrfHeapallocationEnumerateCallback = AvrfHeapallocationEnumerateCallbackFn?

public fun interface AvrfResourceEnumerateCallbackFn {
    public operator fun invoke(resourcedescription: COpaquePointer?, enumerationcontext: COpaquePointer?, enumerationlevel: COpaquePointer?): UInt
}

public typealias AvrfResourceEnumerateCallback = AvrfResourceEnumerateCallbackFn?

public typealias VerifierEnumResourceFlags = UInt

public typealias EAvrfResourceTypes = Int

public typealias EHandleTraceOperations = Int

public typealias EHeapAllocationState = Int

public typealias EHeapEnumerationLevel = Int

public typealias EUserAllocationState = Int
