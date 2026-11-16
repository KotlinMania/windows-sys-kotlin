package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias DevpropOperator = UInt

public typealias DevObjectType = Int

public typealias DevQueryFlags = Int

public typealias DevQueryResultAction = Int

public typealias DevQueryState = Int

public typealias Hdevquery = MutPtr

public fun interface PdevQueryResultCallbackFn {
    public operator fun invoke(hdevquery: Hdevquery, pcontext: ConstPtr, pactiondata: ConstPtr)
}

public typealias PdevQueryResultCallback = PdevQueryResultCallbackFn?
