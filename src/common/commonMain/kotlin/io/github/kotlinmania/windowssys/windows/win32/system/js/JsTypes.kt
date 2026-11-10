package io.github.kotlinmania.windowssys.windows.win32.system.js

import io.github.kotlinmania.windowssys.COpaquePointer

public fun interface JsBackgroundWorkItemCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?)
}

public typealias JsBackgroundWorkItemCallback = JsBackgroundWorkItemCallbackFn?

public fun interface JsBeforeCollectCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?)
}

public typealias JsBeforeCollectCallback = JsBeforeCollectCallbackFn?

public typealias JsErrorCode = UInt

public fun interface JsFinalizeCallbackFn {
    public operator fun invoke(data: COpaquePointer?)
}

public typealias JsFinalizeCallback = JsFinalizeCallbackFn?

public fun interface JsMemoryAllocationCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?, allocationevent: JsMemoryEventType, allocationsize: ULong): Boolean
}

public typealias JsMemoryAllocationCallback = JsMemoryAllocationCallbackFn?

public typealias JsMemoryEventType = Int

public fun interface JsNativeFunctionFn {
    public operator fun invoke(callee: COpaquePointer?, isconstructcall: Boolean, arguments: COpaquePointer?, argumentcount: UShort, callbackstate: COpaquePointer?): COpaquePointer?
}

public typealias JsNativeFunction = JsNativeFunctionFn?

public typealias JsRuntimeAttributes = Int

public typealias JsRuntimeVersion = Int

public fun interface JsThreadServiceCallbackFn {
    public operator fun invoke(callback: JsBackgroundWorkItemCallback, callbackstate: COpaquePointer?): Boolean
}

public typealias JsThreadServiceCallback = JsThreadServiceCallbackFn?

public typealias JsValueType = Int
