package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class EcVariant(
    public var anonymous: EcVariant0 = EcVariant0(),
    public var count: UInt = 0u,
    public var type: UInt = 0u,
)

public data class EcVariant0(
    public var booleanVal: Bool = 0,
    public var uInt32Val: UInt = 0u,
    public var dateTimeVal: ULong = 0uL,
    public var stringVal: Pcwstr = null,
    public var binaryVal: COpaquePointer? = null,
    public var booleanArr: Bool? = null,
    public var int32Arr: Int? = null,
    public var stringArr: Pwstr? = null,
    public var propertyHandleVal: Int = 0,
)
