package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

public data class Qocinfo(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwInSpeed: UInt = 0u,
    public var dwOutSpeed: UInt = 0u,
)

public data class SensQocinfo(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwOutSpeed: UInt = 0u,
    public var dwInSpeed: UInt = 0u,
)
