package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public data class DevpropFilterExpression(
    public var operator: DevpropOperator = 0u,
    public var property: Devproperty = Devproperty(),
)

public data class DevObject(
    public var objectType: DevObjectType = 0,
    public var pszObjectId: Pcwstr = null,
    public var cPropertyCount: UInt = 0u,
    public var pProperties: Devproperty? = null,
)

public data class DevQueryParameter(
    public var key: Devpropkey = Devpropkey(),
    public var type: Devproptype = 0u,
    public var bufferSize: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class DevQueryResultActionData(
    public var action: DevQueryResultAction = 0,
    public var data: DevQueryResultActionData0 = DevQueryResultActionData0(),
)

public data class DevQueryResultActionData0(
    public var state: DevQueryState = 0,
    public var deviceObject: DevObject = DevObject(),
)
