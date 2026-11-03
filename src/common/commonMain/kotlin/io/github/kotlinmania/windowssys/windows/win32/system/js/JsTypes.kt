package io.github.kotlinmania.windowssys.windows.win32.system.js

public fun interface JsBackgroundWorkItemCallbackFn {
    public operator fun invoke(callbackstate: Long)
}

public typealias JsBackgroundWorkItemCallback = JsBackgroundWorkItemCallbackFn?

public fun interface JsBeforeCollectCallbackFn {
    public operator fun invoke(callbackstate: Long)
}

public typealias JsBeforeCollectCallback = JsBeforeCollectCallbackFn?

public typealias JsErrorCode = UInt

public fun interface JsFinalizeCallbackFn {
    public operator fun invoke(data: Long)
}

public typealias JsFinalizeCallback = JsFinalizeCallbackFn?

public fun interface JsMemoryAllocationCallbackFn {
    public operator fun invoke(callbackstate: Long, allocationevent: JsMemoryEventType, allocationsize: ULong): Boolean
}

public typealias JsMemoryAllocationCallback = JsMemoryAllocationCallbackFn?

public typealias JsMemoryEventType = Int

public fun interface JsNativeFunctionFn {
    public operator fun invoke(callee: Long, isconstructcall: Boolean, arguments: Long, argumentcount: UShort, callbackstate: Long): Long
}

public typealias JsNativeFunction = JsNativeFunctionFn?

public typealias JsRuntimeAttributes = Int

public typealias JsRuntimeVersion = Int

public fun interface JsThreadServiceCallbackFn {
    public operator fun invoke(callback: JsBackgroundWorkItemCallback, callbackstate: Long): Boolean
}

public typealias JsThreadServiceCallback = JsThreadServiceCallbackFn?

public typealias JsValueType = Int
