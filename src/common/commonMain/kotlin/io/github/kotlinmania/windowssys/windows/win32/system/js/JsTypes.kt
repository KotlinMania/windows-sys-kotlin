package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface JsBackgroundWorkItemCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr)
}

public typealias JsBackgroundWorkItemCallback = JsBackgroundWorkItemCallbackFn?

public fun interface JsBeforeCollectCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr)
}

public typealias JsBeforeCollectCallback = JsBeforeCollectCallbackFn?

public typealias JsErrorCode = UInt

public fun interface JsFinalizeCallbackFn {
    public operator fun invoke(data: ConstPtr)
}

public typealias JsFinalizeCallback = JsFinalizeCallbackFn?

public fun interface JsMemoryAllocationCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr, allocationevent: JsMemoryEventType, allocationsize: ULong): Boolean
}

public typealias JsMemoryAllocationCallback = JsMemoryAllocationCallbackFn?

public typealias JsMemoryEventType = Int

public fun interface JsNativeFunctionFn {
    public operator fun invoke(callee: ConstPtr, isconstructcall: Boolean, arguments: ConstPtr, argumentcount: UShort, callbackstate: ConstPtr): MutPtr
}

public typealias JsNativeFunction = JsNativeFunctionFn?

public typealias JsRuntimeAttributes = Int

public typealias JsRuntimeVersion = Int

public fun interface JsThreadServiceCallbackFn {
    public operator fun invoke(callback: JsBackgroundWorkItemCallback, callbackstate: ConstPtr): Boolean
}

public typealias JsThreadServiceCallback = JsThreadServiceCallbackFn?

public typealias JsValueType = Int
