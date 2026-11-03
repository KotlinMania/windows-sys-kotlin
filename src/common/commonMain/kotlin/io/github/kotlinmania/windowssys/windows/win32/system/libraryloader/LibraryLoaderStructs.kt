package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.PCSTR

public data class ENUMUILANG(
    public var NumOfEnumUILang: UInt = 0u,
    public var SizeOfEnumUIBuffer: UInt = 0u,
    public var pEnumUIBuffer: Long = 0L,
)

public data class REDIRECTION_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var FunctionCount: UInt = 0u,
    public var Redirections: Long = 0L,
)

public data class REDIRECTION_FUNCTION_DESCRIPTOR(
    public var DllName: PCSTR = 0L,
    public var FunctionName: PCSTR = 0L,
    public var RedirectionTarget: Long = 0L,
)
