// port-lint: source windows-sys/src/Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL

public typealias CONSOLECONTROL = Int
public typealias CONSOLE_CHARACTER_ATTRIBUTES = UShort
public typealias CONSOLE_MODE = UInt
public typealias HPCON = Long
public typealias STD_HANDLE = UInt

public fun interface PHANDLER_ROUTINE {
    public fun invoke(ctrltype: UInt): BOOL
}
