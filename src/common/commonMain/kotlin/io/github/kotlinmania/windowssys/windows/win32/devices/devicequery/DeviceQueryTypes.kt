package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias DevpropOperator = UInt

public typealias DevObjectType = Int

public typealias DevQueryFlags = Int

public typealias DevQueryResultAction = Int

public typealias DevQueryState = Int

public typealias Hdevquery = COpaquePointer?

public fun interface PdevQueryResultCallbackFn {
    public operator fun invoke(hdevquery: Hdevquery, pcontext: COpaquePointer?, pactiondata: COpaquePointer?)
}

public typealias PdevQueryResultCallback = PdevQueryResultCallbackFn?
