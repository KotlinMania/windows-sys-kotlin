package io.github.kotlinmania.windowssys.windows.win32.ui.controls

public data class UsageProperties(
    public var level: UShort = 0u,
    public var page: UShort = 0u,
    public var usage: UShort = 0u,
    public var logicalMinimum: Int = 0,
    public var logicalMaximum: Int = 0,
    public var unit: UShort = 0u,
    public var exponent: UShort = 0u,
    public var count: UByte = 0u,
    public var physicalMinimum: Int = 0,
    public var physicalMaximum: Int = 0,
)

public data class WtaOptions(public var dwFlags: UInt = 0u, public var dwMask: UInt = 0u)
