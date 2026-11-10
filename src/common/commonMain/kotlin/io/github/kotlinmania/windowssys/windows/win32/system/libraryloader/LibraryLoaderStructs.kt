package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr

public data class Enumuilang(
    public var numOfEnumUILang: UInt = 0u,
    public var sizeOfEnumUIBuffer: UInt = 0u,
    public var pEnumUIBuffer: UShort? = null,
)

public data class RedirectionDescriptor(
    public var version: UInt = 0u,
    public var functionCount: UInt = 0u,
    public var redirections: RedirectionFunctionDescriptor? = null,
)

public data class RedirectionFunctionDescriptor(
    public var dllName: Pcstr = null,
    public var functionName: Pcstr = null,
    public var redirectionTarget: COpaquePointer? = null,
)
