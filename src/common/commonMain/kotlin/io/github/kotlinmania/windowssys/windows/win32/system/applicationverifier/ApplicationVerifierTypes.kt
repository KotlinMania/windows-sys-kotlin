package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface AvrfHandleoperationEnumerateCallbackFn {
    public operator fun invoke(handleoperation: MutPtr<AvrfHandleOperation>, enumerationcontext: MutPtr<CVoid>, enumerationlevel: MutPtr<UInt>): UInt
}

public typealias AvrfHandleoperationEnumerateCallback = AvrfHandleoperationEnumerateCallbackFn?

public fun interface AvrfHeapallocationEnumerateCallbackFn {
    public operator fun invoke(heapallocation: MutPtr<AvrfHeapAllocation>, enumerationcontext: MutPtr<CVoid>, enumerationlevel: MutPtr<UInt>): UInt
}

public typealias AvrfHeapallocationEnumerateCallback = AvrfHeapallocationEnumerateCallbackFn?

public fun interface AvrfResourceEnumerateCallbackFn {
    public operator fun invoke(resourcedescription: MutPtr<CVoid>, enumerationcontext: MutPtr<CVoid>, enumerationlevel: MutPtr<UInt>): UInt
}

public typealias AvrfResourceEnumerateCallback = AvrfResourceEnumerateCallbackFn?

public typealias VerifierEnumResourceFlags = UInt

public typealias EAvrfResourceTypes = Int

public typealias EHandleTraceOperations = Int

public typealias EHeapAllocationState = Int

public typealias EHeapEnumerationLevel = Int

public typealias EUserAllocationState = Int
