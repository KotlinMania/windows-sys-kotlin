package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface JsBackgroundWorkItemCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr<CVoid>)
}

public typealias JsBackgroundWorkItemCallback = JsBackgroundWorkItemCallbackFn?

public fun interface JsBeforeCollectCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr<CVoid>)
}

public typealias JsBeforeCollectCallback = JsBeforeCollectCallbackFn?

public typealias JsErrorCode = UInt

public fun interface JsFinalizeCallbackFn {
    public operator fun invoke(data: ConstPtr<CVoid>)
}

public typealias JsFinalizeCallback = JsFinalizeCallbackFn?

public fun interface JsMemoryAllocationCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr<CVoid>, allocationevent: JsMemoryEventType, allocationsize: ULong): Boolean
}

public typealias JsMemoryAllocationCallback = JsMemoryAllocationCallbackFn?

public typealias JsMemoryEventType = Int

public fun interface JsNativeFunctionFn {
    public operator fun invoke(callee: ConstPtr<CVoid>, isconstructcall: Boolean, arguments: ConstPtr<ConstPtr<CVoid>>, argumentcount: UShort, callbackstate: ConstPtr<CVoid>): MutPtr<CVoid>
}

public typealias JsNativeFunction = JsNativeFunctionFn?

public typealias JsRuntimeAttributes = Int

public typealias JsRuntimeVersion = Int

public fun interface JsThreadServiceCallbackFn {
    public operator fun invoke(callback: JsBackgroundWorkItemCallback, callbackstate: ConstPtr<CVoid>): Boolean
}

public typealias JsThreadServiceCallback = JsThreadServiceCallbackFn?

public typealias JsValueType = Int
