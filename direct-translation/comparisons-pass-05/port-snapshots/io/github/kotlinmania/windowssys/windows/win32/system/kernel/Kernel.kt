// port-lint: source Windows/Win32/System/Kernel/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.kernel

public data class LIST_ENTRY(
    public var Flink: Long = 0L,
    public var Blink: Long = 0L,
)

public data class LIST_ENTRY32(
    public var Flink: UInt = 0u,
    public var Blink: UInt = 0u,
)

public data class LIST_ENTRY64(
    public var Flink: ULong = 0uL,
    public var Blink: ULong = 0uL,
)
